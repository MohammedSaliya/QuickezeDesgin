package com.spiderindia.quickezedesgin;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.spiderindia.quickezedesgin.APIClass.ApiClient;
import com.spiderindia.quickezedesgin.Bean.Registration;
import com.spiderindia.quickezedesgin.Retrofit.RetrofitSignUp;

import org.json.JSONException;
import org.json.JSONObject;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SignUpActivity extends AppCompatActivity {


    Button submit;
    EditText name, phonenumber, email, address;
    RetrofitSignUp retrofitSignUp;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        retrofitSignUp = new RetrofitSignUp(this);

        name = findViewById(R.id.name);
        phonenumber = findViewById(R.id.phonenumber);
        email = findViewById(R.id.email);
        address = findViewById(R.id.address);


        submit = findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (name.getText().toString().trim().length() <= 0) {
                    name.setError("Pleace Enter Your Name");
                    name.requestFocus();
                } else if (phonenumber.getText().toString().trim().length() <= 0) {
                    phonenumber.setError("Pleace Enter Your PhoneNumber");
                    phonenumber.requestFocus();
                } else if (email.getText().toString().trim().length() <= 0) {
                    email.setError("Pleace Enter Your Email");
                    email.requestFocus();
                } else if (address.getText().toString().trim().length() <= 0) {
                    address.setError("Pleace Enter Your Address");
                    address.requestFocus();
                } else {
                    String Name = name.getText().toString().trim();
                    String Phone = phonenumber.getText().toString().trim();
                    String Email = email.getText().toString().trim();
                    String Address = address.getText().toString().trim();
                    registration(Name, Phone, Email, Address);
                }
            }
        });

    }

    private void registration(String name, String phone, String email, String address) {

        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("name", name);
            jsonObject.put("mobile", phone);
            jsonObject.put("email", email);
            jsonObject.put("address", address);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        retrofitSignUp.registration(jsonObject);

    }


}
