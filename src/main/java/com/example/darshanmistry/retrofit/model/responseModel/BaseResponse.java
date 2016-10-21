package com.example.darshanmistry.retrofit.model.responseModel;

import com.google.gson.annotations.Expose;

/**
 * Created by vaibhav.jani on 20-Jul-15.
 */


public class BaseResponse {

    @Expose
    private Integer Duration;

    @Expose
    private String InvokingUser;

    @Expose
    private Boolean IsSecure;

    @Expose
    private String Message;

    @Expose
    private String RequestAt;

    @Expose
    private String ResponseType;

    @Expose
    private String Version;

    @Expose
    private Boolean Status;

    public Integer getDuration() {
        return Duration;
    }

    public void setDuration(Integer duration) {
        Duration = duration;
    }

    public String getInvokingUser() {
        return InvokingUser;
    }

    public void setInvokingUser(String invokingUser) {
        InvokingUser = invokingUser;
    }

    public Boolean getSecure() {
        return IsSecure;
    }

    public void setSecure(Boolean secure) {
        IsSecure = secure;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public String getRequestAt() {
        return RequestAt;
    }

    public void setRequestAt(String requestAt) {
        RequestAt = requestAt;
    }

    public String getResponseType() {
        return ResponseType;
    }

    public void setResponseType(String responseType) {
        ResponseType = responseType;
    }

    public String getVersion() {
        return Version;
    }

    public void setVersion(String version) {
        Version = version;
    }

    public Boolean getStatus() {
        return Status;
    }

    public void setStatus(Boolean status) {
        Status = status;
    }
}
