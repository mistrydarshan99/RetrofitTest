package com.example.darshanmistry.retrofit.network;

import android.content.Context;

import com.example.darshanmistry.retrofit.model.responseModel.GetDealersResponse;
import com.example.darshanmistry.retrofit.utils.Logger;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by darshan.mistry on 10/21/2016.
 */

public class AppWs {

    public static void getAllDealers(final WsListener listener, final Context context) {

        RetrofitSingleton.getInstance().configRetrofit().getDealers().enqueue(new Callback<GetDealersResponse>() {
            @Override
            public void onResponse(Call<GetDealersResponse> call, Response<GetDealersResponse> response) {
                listener.onResponseSuccess(response.body());
            }

            @Override
            public void onFailure(Call<GetDealersResponse> call, Throwable t) {
                listener.notifyResponseFailed(t.getMessage());
                Logger.toast(t.getMessage(), context);
            }
        });
    }
}
