package com.spiderindia.quickezedesgin;

import android.content.Context;
import android.support.annotation.NonNull;
import android.widget.Toast;

import com.spiderindia.quickezedesgin.APIClass.ApiClient;
import com.spiderindia.quickezedesgin.Bean.Registration;

import org.json.JSONObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RetrofitCalls {

    private Context context;

    public RetrofitCalls(Context context) {
        this.context = context;
    }

    public void registration(JSONObject jsonObject)
    {
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
            }

            @Override
            public void onFailure(@NonNull Call<Registration> call, @NonNull Throwable t) {
                Toast.makeText(context, t.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });
    }
}
