package com.example.darshanmistry.retrofit.network;

import com.example.darshanmistry.retrofit.BuildConfig;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by darshan.mistry on 10/21/2016.
 */
public class RetrofitSingleton {

    private static Retrofit retrofit = null;
    private static ApiInterface apiService = null;
    private static RetrofitSingleton retrofitSingleton;


    public static RetrofitSingleton getInstance() {
        if (retrofitSingleton == null) {
            synchronized (RetrofitSingleton.class) {
                retrofitSingleton = new RetrofitSingleton();
            }
        }
        return retrofitSingleton;
    }

    private RetrofitSingleton() {
    }

    public ApiInterface configRetrofit() {

        if (apiService == null) {
            synchronized (RetrofitSingleton.class) {
                retrofit = new Retrofit.Builder()
                        .baseUrl(ApiInterface.HOST)
                        .client(configClient())
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();

                apiService = retrofit.create(ApiInterface.class);
            }
        }

        return apiService;
    }

    private OkHttpClient configClient() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        if (BuildConfig.DEBUG) {
            HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
            loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            builder.addInterceptor(loggingInterceptor);
        }

        builder.connectTimeout(5, TimeUnit.MINUTES);
        return builder.build();
    }
}
