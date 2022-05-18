package com.example.forecast.city_manager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.forecast.R;
import com.example.forecast.bean.WeatherBean;
import com.example.forecast.db.DatabaseBean;
import com.google.gson.Gson;

import java.util.List;

public class CityManagerAdapter extends BaseAdapter {
    Context context;
    List<DatabaseBean> mDatas;

    public CityManagerAdapter(Context context, List<DatabaseBean> mDatas) {
        this.context = context;
        this.mDatas = mDatas;
    }

    @Override
    public int getCount() {
        return mDatas.size();
    }

    @Override
    public Object getItem(int position) {
        return mDatas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        ViewHolder holder = null;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_city_manager,null);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }
        DatabaseBean bean = mDatas.get(position);
        holder.cityTv.setText(bean.getCity());

        WeatherBean weatherBean = new Gson().fromJson(bean.getContent(), WeatherBean.class);
        List<WeatherBean.ResultsBean> beanResults = weatherBean.getResults();
//        获取今日天气情况
        WeatherBean.ResultsBean.DailyBean dailyBean = beanResults.get(0).getDaily().get(0);
        holder.conTv.setText("天气:"+dailyBean.getText_day());
        holder.windTv.setText(dailyBean.getWind_direction()+"风"+dailyBean.getWind_scale()+"级");
        holder.tempRangeTv.setText(dailyBean.getLow()+"/"+dailyBean.getHigh()+"℃");
        return convertView;
    }

    class ViewHolder{
        TextView cityTv,conTv,windTv,tempRangeTv;
        public ViewHolder(View itemView){
            cityTv = itemView.findViewById(R.id.item_city_tv_city);
            conTv = itemView.findViewById(R.id.item_city_tv_condition);
            windTv = itemView.findViewById(R.id.item_city_wind);
            tempRangeTv = itemView.findViewById(R.id.item_city_temprange);

        }
    }
}
