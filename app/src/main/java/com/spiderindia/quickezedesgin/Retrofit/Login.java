package com.spiderindia.quickezedesgin.Retrofit;

import android.content.Context;
import android.support.annotation.NonNull;
import android.widget.Toast;

import com.spiderindia.quickezedesgin.APIClass.ApiClient;
import com.spiderindia.quickezedesgin.Bean.OTPSend;
import com.spiderindia.quickezedesgin.Bean.Verifyotp;

import org.json.JSONObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Login {

    public Context context;


    public Login(Context context) {
        this.context = context;
    }

    public void otpsent(JSONObject phone) {
        Call<OTPSend> otpSendCall = ApiClient
                .getApiClient()
                .apiInterface()
                .getotp(phone.toString());

        otpSendCall.enqueue(new Callback<OTPSend>() {
            @Override
            public void onResponse(@NonNull Call<OTPSend> call, @NonNull Response<OTPSend> response) {

                OTPSend otpSend = response.body();
                assert otpSend != null;
                Toast.makeText(context, otpSend.getMessage(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(@NonNull Call<OTPSend> call, @NonNull Throwable t) {
                Toast.makeText(context, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

    }


    public void verfiyotp(JSONObject jsonObject) {
        Call<Verifyotp> verifyotpCall = ApiClient
                .getApiClient()
                .apiInterface()
                .getverify(jsonObject.toString());


        verifyotpCall.enqueue(new Callback<Verifyotp>() {
            @Override
            public void onResponse(Call<Verifyotp> call, Response<Verifyotp> response) {
                Verifyotp verifyotp = response.body();
                Toast.makeText(context, verifyotp.getMessage(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<Verifyotp> call, Throwable t) {
                Toast.makeText(context, t.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });

    }
}
