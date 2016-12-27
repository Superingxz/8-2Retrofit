package org.mobiletrain.a8_2retrofit;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by 王松 on 2016/8/9.
 */
public interface ApiService {
    //CateBean表示网络请求的返回结果
    @GET("api/food/classify")
    Call<CateBean> getCateData();

    //    api/food/show?id=id
    @GET("api/food/show")
    Call<DetailBean> getDetailBean(@Query("id") String id);

    //Post请求传参方式
    @FormUrlEncoded
    @POST("api/food/show")
    Call<DetailBean> postDetailBean(@Field("id") String id,@Field("username") String username);
}
