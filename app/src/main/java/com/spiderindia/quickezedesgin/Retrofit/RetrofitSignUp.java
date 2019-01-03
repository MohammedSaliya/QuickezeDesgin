package com.spiderindia.quickezedesgin.Retrofit;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.widget.Toast;

import com.spiderindia.quickezedesgin.APIClass.ApiClient;
import com.spiderindia.quickezedesgin.Bean.Registration;
import com.spiderindia.quickezedesgin.LocationsetActivity;
import com.spiderindia.quickezedesgin.LoginActivity;
import com.spiderindia.quickezedesgin.SignUpActivity;

import org.json.JSONObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RetrofitSignUp {

    private Context context;

    public RetrofitSignUp(Context context) {
        this.context = context;
    }

    public void registration(JSONObject jsonObject) {
        Call<Registration> registrationCall = ApiClient
                .getApiClient()
                .apiInterface()
                .getregistration(jsonObject.toString());

        registrationCall.enqueue(new Callback<Registration>() {
            @Override
            public void onResponse(@NonNull Call<Registration> call, @NonNull Response<Registration> response) {
                Registration registration = response.body();
                assert registration != null;
                Toast.makeText(context, registration.getMessage(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(context, LoginActivity.class);
                context.startActivity(intent);
            }

            @Override
            public void onFailure(@NonNull Call<Registration> call, @NonNull Throwable t) {
                Toast.makeText(context, t.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });
    }
}
