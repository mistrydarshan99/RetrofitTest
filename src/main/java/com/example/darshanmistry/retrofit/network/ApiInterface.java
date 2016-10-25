package com.example.darshanmistry.retrofit.network;

import com.example.darshanmistry.retrofit.model.responseModel.DatabaseBean;

import retrofit2.Call;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by darshan.mistry on 10/21/2016.
 */

public interface ApiInterface {

//    String HOST = "http://50.244.14.69:808/";           //Local Server
    String HOST = "http://216.15.232.71:81/OTTOAPIService/OTTOAPISerivce.svc/OTTOAPI/";           //Local Server

    /*@Headers("Content-Type: application/json")
    @GET("/Master/Dealers/")
    Call<GetDealersResponse> getDealers();*/


    @Headers("Content-Type: application/json")
    @POST("GetDatabase")
    Call<DatabaseBean> getDealers();
}
