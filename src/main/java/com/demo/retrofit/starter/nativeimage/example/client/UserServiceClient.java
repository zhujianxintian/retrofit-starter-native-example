package com.demo.retrofit.starter.nativeimage.example.client;

import com.demo.retrofit.starter.nativeimage.example.pojo.UserInfo;
import com.github.lianjiatech.retrofit.spring.boot.core.RetrofitClient;
import retrofit2.http.GET;
import retrofit2.http.Query;

@RetrofitClient(baseUrl = "http://localhost:8080/")
public interface UserServiceClient {

    @GET("test/user")
    UserInfo getUserInfo(@Query("id") String id);

}
