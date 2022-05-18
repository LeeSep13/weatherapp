package com.example.forecast.city_manager;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.forecast.MainActivity;
import com.example.forecast.R;
import com.example.forecast.base.BaseActivity;
import com.example.forecast.utils.URLUtils;

public class SearchCityActivity extends BaseActivity implements View.OnClickListener {
    EditText searchEt;
    ImageView submitIv;
    GridView searchGv;
    String[] hotCitys = {"北京", "上海", "广州", "深圳", "珠海", "佛山", "南京", "苏州", "厦门", "长沙", "成都", "福州",
            "杭州", "武汉", "青岛", "西安", "太原", "沈阳", "重庆", "天津", "南宁"};
    private ArrayAdapter<String> adapter;

    String city;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_city);
        searchEt = findViewById(R.id.search_et);
        submitIv = findViewById(R.id.search_iv_submit);
        searchGv = findViewById(R.id.search_gv);
        submitIv.setOnClickListener(this);
//        因为这里只有一个TextView，所以设置一个简单的适配器，即ArrayAdapter
        adapter = new ArrayAdapter<>(this, R.layout.item_hotcity, hotCitys);
        searchGv.setAdapter(adapter);
        setListener();
    }

    /* 设置监听事件*/
    private void setListener() {
        searchGv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                city = hotCitys[position];
                String url = URLUtils.getTemp_url(city);
                loadData(url);
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.search_iv_submit:
                city = searchEt.getText().toString();
                if (!TextUtils.isEmpty(city)) {
//                    判断是否能够找到这个城市
                    String url = URLUtils.getTemp_url(city);
                    loadData(url);
                } else {
                    Toast.makeText(this, "输入内容不能为空！", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }

    @Override
    public void onSuccess(String result) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.putExtra("city", city);
        startActivity(intent);
    }

    @Override
    public void onError(Throwable ex, boolean isOnCallback) {
        super.onError(ex, isOnCallback);
        Toast.makeText(this, "暂时未收入此城市天气信息...", Toast.LENGTH_SHORT).show();
    }
}