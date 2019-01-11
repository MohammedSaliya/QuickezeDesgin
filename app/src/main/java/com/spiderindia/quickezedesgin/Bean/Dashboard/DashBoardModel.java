package com.spiderindia.quickezedesgin.Bean.Dashboard;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Awesome Pojo Generator
 */
public class DashBoardModel {
    @SerializedName("result")
    @Expose
    private Boolean result;
    @SerializedName("data")
    @Expose
    private List<DashBoardModelSub> data;
    @SerializedName("message")
    @Expose
    private String message;

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public List<DashBoardModelSub> getData() {
        return data;
    }

    public void setData(List<DashBoardModelSub> data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}