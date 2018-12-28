package com.spiderindia.quickezedesgin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.spiderindia.quickezedesgin.Retrofit.Login;

import org.json.JSONException;
import org.json.JSONObject;

public class LoginActivity extends AppCompatActivity {

    TextView singup;
    Button login;
    EditText phonumber, otpone, otptwo, otpthree, otpfour;
    LinearLayout edt_otp;
    Login relogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        singup = findViewById(R.id.singup);
        login = findViewById(R.id.login);
        edt_otp = findViewById(R.id.edt_otp);
        phonumber = findViewById(R.id.phonumber);
        otpone = findViewById(R.id.otpone);
        otptwo = findViewById(R.id.otptwo);
        otpthree = findViewById(R.id.otpthree);
        otpfour = findViewById(R.id.otpfour);


        relogin = new Login(this);

        singup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SignUpActivity.class);
                startActivity(intent);
            }
        });


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phone = phonumber.getText().toString().trim();

                if (login.getText().toString().equalsIgnoreCase("Login")) {

                    if (TextUtils.isEmpty(phone)) {
                        phonumber.setError("Plz Enter Your Mobile Number");

                    } else {
                        phonumber.setVisibility(View.INVISIBLE);
                        singup.setVisibility(View.INVISIBLE);
                        edt_otp.setVisibility(View.VISIBLE);
                        login.setText("verify");
                        otpsent(phone);
                    }

                } else if (login.getText().toString().equalsIgnoreCase("verify")) {

                    String otp = otpone.getText().toString() + otptwo.getText().toString() + otpthree.getText().toString()
                            + otpfour.getText().toString();
                    verfiyotp(phone, otp);

                    Intent intent = new Intent(getApplicationContext(), LocationsetActivity.class);
                    startActivity(intent);
                }


            }
        });


        otpone.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (otpone.getText().toString().trim().length() == 1) {
                    otptwo.requestFocus();


                }
            }


            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        otptwo.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (otptwo.getText().toString().trim().length() == 1) {
                    otpthree.requestFocus();


                }
            }


            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        otpthree.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (otpthree.getText().toString().trim().length() == 1) {
                    otpfour.requestFocus();


                }
            }


            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

    }

    private void verfiyotp(String phone, String otp) {
        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("mobile", phone);
            jsonObject.put("otp", otp);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        relogin.verfiyotp(jsonObject);

    }

    private void otpsent(String phone) {
        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("mobile", phone);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        relogin.otpsent(jsonObject);

    }

}



