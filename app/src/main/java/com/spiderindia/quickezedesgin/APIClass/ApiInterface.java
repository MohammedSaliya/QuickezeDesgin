package com.spiderindia.quickezedesgin.APIClass;

import com.spiderindia.quickezedesgin.Bean.OTPSend;
import com.spiderindia.quickezedesgin.Bean.Registration;
import com.spiderindia.quickezedesgin.Bean.Service.ServiceId;
import com.spiderindia.quickezedesgin.Bean.Verifyotp;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface ApiInterface {

    @Headers("Content-Type: application/json")
    @POST("client_registration")
    Call<Registration> getregistration(@Body String post);


    @Headers("Content-Type: application/json")
    @POST("send_client_otp")
    Call<OTPSend> getotp(@Body String post);

    @Headers("Content-Type: application/json")
    @POST("client_otp_verify")
    Call<Verifyotp> getverify(@Body String post);


    @Headers("Content-Type: application/json")
    @GET("services")
    Call<ServiceId> getService();

}
