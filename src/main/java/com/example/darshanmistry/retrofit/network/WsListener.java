package com.example.darshanmistry.retrofit.network;

import com.example.darshanmistry.retrofit.model.responseModel.BaseResponse;

public interface WsListener {

    void onResponseSuccess(BaseResponse baseResponse);

    void notifyResponseFailed(String message);
}
