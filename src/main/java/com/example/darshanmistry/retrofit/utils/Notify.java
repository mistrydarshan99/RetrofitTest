package com.example.darshanmistry.retrofit.utils;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.Toast;

import com.example.darshanmistry.retrofit.R;


/**
 * Created by vaibhav.jani on 5/27/2015.
 */
public class Notify {

    public static void toast(int stringId, Activity Activity) {

        toast(Activity.getString(stringId), Activity);
    }

    public static void toast(String text, Context Activity) {

        try {

            Toast.makeText(Activity, text, Toast.LENGTH_LONG).show();

        } catch (Exception e) {

            Logger.e(e);
        }
    }

    public static void dialogOK(String message, final Activity activity, final boolean finish){

        try {

            AlertDialog.Builder builder = new AlertDialog.Builder(activity, R.style.AppCompatAlertDialogStyle);
            builder.setMessage(message);
            builder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();

                    if(finish) {

                        activity.finish();
                    }
                }
            });
            builder.show();

        } catch (Exception e) {

            Logger.e(e);
        }
    }

    public static void dialogOKPush(String message, String body, final Activity activity, final boolean killParent){

        try {

            AlertDialog.Builder builder = new AlertDialog.Builder(activity, R.style.AppCompatAlertDialogStylePush);
            builder.setTitle(message);
            builder.setMessage(body);
            builder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    dialog.dismiss();

                    if(killParent){

                        activity.finish();
                    }
                }
            });
            builder.setOnDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public void onDismiss(DialogInterface dialog) {

                    if(killParent){

                        activity.finish();
                    }
                }
            });
            builder.show();

        } catch (Exception e) {

            Logger.e(e);
        }
    }

    public static void dialogOK(int message, final Activity activity, final OnDialogDismiss onDialogDismiss){

        dialogOK(activity.getString(message),activity, onDialogDismiss);
    }

    public static void dialogOK(String message, final Activity activity, final OnDialogDismiss onDialogDismiss){

        try {

            AlertDialog.Builder builder = new AlertDialog.Builder(activity, R.style.AppCompatAlertDialogStyle);
            builder.setMessage(message);
            builder.setCancelable(false);
            builder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    dialog.dismiss();

                    if(onDialogDismiss != null) {

                        onDialogDismiss.onDialogDismiss(true);
                    }
                }
            });
            builder.show();

        } catch (Exception e) {

            Logger.e(e);
        }
    }

    public static void dialogYesNo(int message, final Activity activity, final OnDialogDismiss onDialogDismiss){

        dialogYesNo(activity.getString(message), activity, onDialogDismiss);
    }

    public static void dialogYesNo(String message, final Activity activity, final OnDialogDismiss onDialogDismiss){

        try {

            AlertDialog.Builder builder = new AlertDialog.Builder(activity, R.style.AppCompatAlertDialogStyle);
            builder.setMessage(message);
            builder.setCancelable(false);

            builder.setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    dialog.dismiss();

                    if (onDialogDismiss != null) {

                        onDialogDismiss.onDialogDismiss(true);
                    }
                }
            });

            builder.setNegativeButton(R.string.no, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    dialog.dismiss();

                    if(onDialogDismiss != null) {

                        onDialogDismiss.onDialogDismiss(false);
                    }
                }
            });

            builder.show();

        } catch (Exception e) {

            Logger.e(e);
        }
    }

    public static void dialogOK(String message, Activity activity){

        dialogOK(message, activity, false);
    }

    public static void dialogOK(int message, Activity activity){

        dialogOK(activity.getString(message), activity, false);
    }

    public static void dialogOK(int message, Activity activity, boolean finish){

        dialogOK(activity.getString(message), activity, finish);
    }

    public static void showSnackBar(View view, String text, Activity activity){

            Snackbar.make(view, text, Snackbar.LENGTH_LONG).show();
    }

    public static interface OnDialogDismiss {

        public void onDialogDismiss(boolean isPositive);

    }
}
