package com.example.darshanmistry.retrofit.utils;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import com.example.darshanmistry.retrofit.R;


/**
 * Created by vaibhav.jani on 5/29/2015.
 */
public class NetworkUtils {

    public static boolean isOnline(Context context) {

        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo netInfo = cm.getActiveNetworkInfo();

        if (netInfo != null
                && netInfo.isConnectedOrConnecting()
                && cm.getActiveNetworkInfo().isAvailable()
                && cm.getActiveNetworkInfo().isConnected()) {

            return true;
        }

        return false;
    }

    public static boolean checkInternetConnection(Context context) {

        if(!NetworkUtils.isOnline(context)) {

            if(context instanceof Activity) {

                Notify.dialogOK(context.getString(R.string.internet_off), (Activity)context, false);
            }

            return false;
        }

        return true;
    }

}
