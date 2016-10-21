package com.example.darshanmistry.retrofit.network;

import com.example.darshanmistry.retrofit.model.responseModel.GetDealersResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

/**
 * Created by darshan.mistry on 10/21/2016.
 */

public interface ApiInterface {

    String HOST = "http://50.244.14.69:808/";           //Local Server

    @Headers("Content-Type: application/json")
    @GET("/Master/Dealers/")
    Call<GetDealersResponse> getDealers();
}
