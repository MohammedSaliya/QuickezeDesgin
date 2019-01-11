package com.spiderindia.quickezedesgin.Bean.Service;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Awesome Pojo Generator
 */
public class ServiceId  {
    @SerializedName("result")
    @Expose
    private Boolean result;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("data")
    @Expose
    private List<ServiceData> data = null;

    public ServiceId(Boolean result, String message, List<ServiceData> data) {
        this.result = result;
        this.message = message;
        this.data = data;
    }

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<ServiceData> getData() {
        return data;
    }

    public void setData(List<ServiceData> data) {
        this.data = data;
    }
}