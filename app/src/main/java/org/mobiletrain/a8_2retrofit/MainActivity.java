package org.mobiletrain.a8_2retrofit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * 1.创建一个APISerevice接口
 * 2.创建一个Retrofit实例和请求接口的实例
 * 3.发起一个网络请求
 */
public class MainActivity extends AppCompatActivity {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.tv);
    }

    public void getCateData(View view) {
        Retrofit retrofit = new Retrofit.Builder()
                //设置请求地址的域名
                .baseUrl("http://www.tngou.net/")
                //设置数据转换工厂
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        //创建一个APIService的实例
        ApiService apiService = retrofit.create(ApiService.class);
        Call<CateBean> call = apiService.getCateData();
        //发起一个网络请求，这里的两个回调方法都是在主线程执行
        call.enqueue(new Callback<CateBean>() {
            @Override
            public void onResponse(Call<CateBean> call, Response<CateBean> response) {
                StringBuffer result = new StringBuffer();
                if (response.isSuccessful()) {
                    CateBean cateBean = response.body();
                    List<CateBean.TngouBean> tngou = cateBean.getTngou();
                    for (int i = 0; i < tngou.size(); i++) {
                        result.append(tngou.get(i).getDescription() + "\n");
                    }
                    tv.setText(result.toString());
                }
            }

            @Override
            public void onFailure(Call<CateBean> call, Throwable t) {

            }
        });

        //在Retrofit中，call对象的enqueue方法只能被调用一次，
        // 如果想多次调用，可以通过call对象的clone方法获取一个新的call对象
//        call = call.clone();
    }

    public void getDetailData(View view) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://www.tngou.net/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ApiService apiService = retrofit.create(ApiService.class);
        Call<DetailBean> call = apiService.getDetailBean("1585");
        call.enqueue(new Callback<DetailBean>() {
            @Override
            public void onResponse(Call<DetailBean> call, Response<DetailBean> response) {
                if (response.isSuccessful()) {
                    tv.setText(Html.fromHtml(response.body().getMessage()));
                }
            }

            @Override
            public void onFailure(Call<DetailBean> call, Throwable t) {

            }
        });
    }
}
