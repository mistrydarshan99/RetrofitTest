package com.example.darshanmistry.retrofit.utils;

import android.app.Activity;
import android.app.ProgressDialog;

/**
 * Created by darshan on 2/4/15.
 */
public class ProgressDialogProvider {

    public static ProgressDialog getSimpleProgressDialog(int titleResource, int messageResource, Activity activity) {

        String strTitle = activity.getString(titleResource);

        String strMessage = activity.getString(messageResource);

        return getSimpleProgressDialog(strTitle, strMessage, activity);
    }

    public static ProgressDialog getSimpleProgressDialog(String title, String message, Activity activity) {

        ProgressDialog progressDialog = new ProgressDialog(activity);

        progressDialog.setTitle(title);
        progressDialog.setMessage(message);
        progressDialog.setCancelable(true);

        return progressDialog;
    }
}
