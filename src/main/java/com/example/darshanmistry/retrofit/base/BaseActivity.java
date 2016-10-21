package com.example.darshanmistry.retrofit.base;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.darshanmistry.retrofit.R;
import com.example.darshanmistry.retrofit.utils.Logger;
import com.example.darshanmistry.retrofit.utils.ProgressDialogProvider;

/**
 * Created by darshan.mistry on 10/21/2016.
 */

public abstract class BaseActivity extends AppCompatActivity {

    protected ProgressDialog progressDialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentView());

        initViews();

    }

    protected abstract int getContentView();

    protected abstract void initViews();

    public void showProgressDialog(String title, String message) {

        if (progressDialog == null) {

            progressDialog = ProgressDialogProvider.getSimpleProgressDialog(title, message, this);
            progressDialog.setCancelable(false);

        } else {

            progressDialog.setTitle(title);
            progressDialog.setMessage(message);
        }

        progressDialog.show();
    }

    public void showProgressDialog() {

        showProgressDialog(getString(R.string.please_wait));
    }

    public void showProgressDialog(String message) {

        showProgressDialog(null, message);

        progressDialog.show();
    }

    public void dismissProgressDialog() {

        try {

            if (progressDialog != null && progressDialog.isShowing()) {

                progressDialog.dismiss();
            }

        } catch (Exception e) {

            Logger.e(e);
        }
    }

    public void showProgressDialogCancel() {

        showProgressDialog(getString(R.string.please_wait));

        progressDialog.setCancelable(true);
    }
}
