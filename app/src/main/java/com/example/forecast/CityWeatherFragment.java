package com.example.forecast;

import static android.content.Context.MODE_PRIVATE;

import android.app.AlertDialog;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.forecast.base.BaseFragment;
import com.example.forecast.bean.IndexBean;
import com.example.forecast.bean.WeatherBean;
import com.example.forecast.db.DBManager;
import com.example.forecast.utils.HttpUtils;
import com.example.forecast.utils.URLUtils;
import com.google.gson.Gson;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class CityWeatherFragment extends BaseFragment implements View.OnClickListener {
    TextView cityTv,conditionTv,windTv,tempRangeTv,dateTv,clothIndexTv,carIndexTv,coldIndexTv,sportIndexTv,raysIndexTv,airIndexTv;
    ImageView dayIv;
    LinearLayout futureLayout;
    ScrollView outLayout;
    String city;
    private SharedPreferences pref;
    private int bgNum;
    IndexBean.ResultsBean.SuggestionBean suggestionBean;  //指数信息

    //        换壁纸的函数
    public void exchangeBg(){
        pref = getActivity().getSharedPreferences("bg_pref", MODE_PRIVATE);
        bgNum = pref.getInt("bg", 2);
        switch (bgNum) {
            case 0:
                outLayout.setBackgroundResource(R.mipmap.bg);
                break;
            case 1:
                outLayout.setBackgroundResource(R.mipmap.bg2);
                break;
            case 2:
                outLayout.setBackgroundResource(R.mipmap.bg3);
                break;
        }

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_city_weather, container, false);
        initView(view);
        exchangeBg();
//        可以通过activity传值获取到当前fragment加载的是哪个地方的天气情况
        Bundle bundle = getArguments();
        city = bundle.getString("city");
        String tempurl = URLUtils.getTemp_url(city);
//        调用父类获取数据的方法
        loadData(tempurl);
        // 获取指数信息的网址
        String index_url = URLUtils.getIndex_url(city);
        loadIndexData(index_url);
        return view;
    }

    /* 网络获取指数信息*/
    private void loadIndexData(final String index_url) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                String json = HttpUtils.getJsonContent(index_url);
                IndexBean indexBean = new Gson().fromJson(json, IndexBean.class);
                try {
                    suggestionBean = indexBean.getResults().get(0).getSuggestion();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }).start();
    }

    @Override
    public void onSuccess(String result) {
//        解析并展示数据
        parseShowData(result);
//        更新数据
        int i = DBManager.updateInfoByCity(city, result);
        if(i<=0){
//        更新数据库失败，说明没有这条城市信息，增加这个城市记录
            DBManager.addCityInfo(city,result);
        }

    }
    @Override
    public void onError(Throwable ex, boolean isOnCallback) {
//        数据库当中查找上一次信息显示在Fragment当中
        String s = DBManager.queryInfoByCity(city);
        if (!TextUtils.isEmpty(s)) {
            parseShowData(s);
        }

    }

    private void parseShowData(String result) {
//        使用gson解析数据
        WeatherBean weatherBean = new Gson().fromJson(result, WeatherBean.class);
        List<WeatherBean.ResultsBean> weatherBeanResults = weatherBean.getResults();
//        设置TextView
        dateTv.setText(weatherBeanResults.get(0).getDaily().get(0).getDate()); // 获取今日的日期
        cityTv.setText(weatherBeanResults.get(0).getLocation().getName()); // 获取今日的城市
//        获取今日天气情况
        WeatherBean.ResultsBean.DailyBean dailyBean = weatherBeanResults.get(0).getDaily().get(0);
        windTv.setText(dailyBean.getWind_direction()+"风"+dailyBean.getWind_scale()+"级"); //风向
        tempRangeTv.setText(dailyBean.getLow()+"/"+dailyBean.getHigh()+"℃"); //最低温/最高温
        conditionTv.setText(dailyBean.getText_day()); //天气情况
//        获取未来四天的天气情况，加载到layout当中
        List<WeatherBean.ResultsBean.DailyBean> dailyList = weatherBeanResults.get(0).getDaily();
        dailyList.remove(0); // 先移除今日的城市数据
        for (int i = 0; i < dailyList.size(); i++) {
            View itemView = LayoutInflater.from(getActivity()).inflate(R.layout.item_main_center, null);
            itemView.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            futureLayout.addView(itemView);
            TextView idateTv = itemView.findViewById(R.id.item_center_tv_date);
            TextView iconTv = itemView.findViewById(R.id.item_center_tv_con);
            TextView windTv = itemView.findViewById(R.id.item_center_tv_wind);
            TextView itemprangeTv = itemView.findViewById(R.id.item_center_tv_temp);
//          获取对应的位置的天气情况
            WeatherBean.ResultsBean.DailyBean dailyBean1 = dailyList.get(i);
            idateTv.setText(dailyBean1.getDate());
            iconTv.setText(dailyBean1.getText_day());
            itemprangeTv.setText(dailyBean1.getLow()+"/"+dailyBean1.getHigh()+"℃");
            windTv.setText(dailyBean1.getWind_direction()+"风");
        }
    }



    private void initView(View view) {
//        用于初始化控件操作
        cityTv = view.findViewById(R.id.frag_tv_city);
        conditionTv = view.findViewById(R.id.frag_tv_condition);
        windTv = view.findViewById(R.id.frag_tv_wind);
        tempRangeTv = view.findViewById(R.id.frag_tv_temprange);
        dateTv = view.findViewById(R.id.frag_tv_date);
        clothIndexTv = view.findViewById(R.id.frag_index_tv_dress);
        carIndexTv = view.findViewById(R.id.frag_index_tv_washcar);
        coldIndexTv = view.findViewById(R.id.frag_index_tv_cold);
        sportIndexTv = view.findViewById(R.id.frag_index_tv_sport);
        raysIndexTv = view.findViewById(R.id.frag_index_tv_rays);
        airIndexTv = view.findViewById(R.id.frag_index_tv_air);
        dayIv = view.findViewById(R.id.frag_iv_today);
        futureLayout = view.findViewById(R.id.frag_center_layout);
        outLayout = view.findViewById(R.id.out_layout);
//        设置点击事件的监听
        clothIndexTv.setOnClickListener(this);
        carIndexTv.setOnClickListener(this);
        coldIndexTv.setOnClickListener(this);
        sportIndexTv.setOnClickListener(this);
        raysIndexTv.setOnClickListener(this);
        airIndexTv.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        switch (v.getId()) {
            case R.id.frag_index_tv_dress:
                builder.setTitle("穿衣指数");
                String msg = "暂无信息";
                if (suggestionBean!=null){
                    msg = suggestionBean.getDressing().getBrief()+"\n"+suggestionBean.getDressing().getDetails();
                }
                builder.setMessage(msg);
                builder.setPositiveButton("确定",null);
                break;
            case R.id.frag_index_tv_washcar:
                builder.setTitle("洗车指数");
                msg = "暂无信息";
                if (suggestionBean!=null){
                    msg = suggestionBean.getCar_washing().getBrief()+"\n"+suggestionBean.getCar_washing().getDetails();
                }
                builder.setMessage(msg);
                builder.setPositiveButton("确定",null);
                break;
            case R.id.frag_index_tv_cold:
                builder.setTitle("感冒指数");
                msg = "暂无信息";
                if (suggestionBean!=null){
                    msg = suggestionBean.getFlu().getBrief()+"\n"+suggestionBean.getFlu().getDetails();
                }
                builder.setMessage(msg);
                builder.setPositiveButton("确定",null);
                break;
            case R.id.frag_index_tv_sport:
                builder.setTitle("运动指数");
                msg = "暂无信息";
                if (suggestionBean!=null){
                    msg = suggestionBean.getSport().getBrief()+"\n"+suggestionBean.getSport().getDetails();
                }
                builder.setMessage(msg);
                builder.setPositiveButton("确定",null);
                break;
            case R.id.frag_index_tv_rays:
                builder.setTitle("紫外线指数");
                msg = "暂无信息";
                if (suggestionBean!=null){
                    msg = suggestionBean.getUv().getBrief()+"\n"+suggestionBean.getUv().getDetails();
                }
                builder.setMessage(msg);
                builder.setPositiveButton("确定",null);
                break;
            case R.id.frag_index_tv_air:
                builder.setTitle("空调指数");
                msg = "暂无信息";
                if (suggestionBean!=null){
                    msg = suggestionBean.getAc().getBrief()+"\n"+suggestionBean.getAc().getDetails();
                }
                builder.setMessage(msg);
                builder.setPositiveButton("确定",null);
                break;
        }
        builder.create().show();
    }

}