package com.example.darshanmistry.retrofit.activity;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.activeandroid.ActiveAndroid;
import com.activeandroid.Model;
import com.example.darshanmistry.retrofit.R;
import com.example.darshanmistry.retrofit.adapter.DoListAdapter;
import com.example.darshanmistry.retrofit.base.BaseActivity;
import com.example.darshanmistry.retrofit.model.responseModel.BaseResponse;
import com.example.darshanmistry.retrofit.model.responseModel.GetDealersResponse;
import com.example.darshanmistry.retrofit.network.AppWs;
import com.example.darshanmistry.retrofit.network.WsListener;
import com.example.darshanmistry.retrofit.utils.Logger;

import java.util.List;

public class MainActivity extends BaseActivity implements WsListener {

    private RecyclerView rvDealer;
    private LinearLayoutManager lytManager;
    private DoListAdapter doListAdapter;

    @Override
    protected int getContentView() {
        return R.layout.activity_main;
    }

    @Override
    protected void initViews() {
        rvDealer = (RecyclerView) findViewById(R.id.rvDealer);
        lytManager = new LinearLayoutManager(this);
        rvDealer.setLayoutManager(lytManager);
        doListAdapter = new DoListAdapter(this);
        rvDealer.setAdapter(doListAdapter);
        doListAdapter.setOnItemClickListener(new DoListAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position, View view) {
                Logger.e("Darshan","------------------->"+position);
            }

            @Override
            public void onItemCountChange() {

            }
        });
        showProgressDialog();
        AppWs.getAllDealers(this, this);
    }

    @Override
    public void onResponseSuccess(BaseResponse baseResponse) {
        dismissProgressDialog();
        doListAdapter.setData(((GetDealersResponse) baseResponse).getData());
        saveList(((GetDealersResponse) baseResponse).getData());
    }

    @Override
    public void notifyResponseFailed(String message) {

    }

    private static void saveList(List<? extends Model> modelList) {

        if (modelList != null && modelList.size() > 0) {

            ActiveAndroid.beginTransaction();

            try {

                for (Model obj : modelList) {

                    obj.save();

                }

                ActiveAndroid.setTransactionSuccessful();


            } finally {

                ActiveAndroid.endTransaction();
            }
        }
    }
}
