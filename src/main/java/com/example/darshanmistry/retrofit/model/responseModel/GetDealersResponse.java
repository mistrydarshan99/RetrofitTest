package com.example.darshanmistry.retrofit.model.responseModel;

import com.example.darshanmistry.retrofit.model.HH_Dealer;
import com.google.gson.annotations.Expose;

import java.util.ArrayList;

public class GetDealersResponse extends BaseResponse {

    @Expose
    private ArrayList<HH_Dealer> Data;

    public ArrayList<HH_Dealer> getData() {

        if (Data == null) {

            Data = new ArrayList<>();
        }

        return Data;
    }


}
