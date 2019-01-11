package com.spiderindia.quickezedesgin;

import android.content.Context;
import android.content.SharedPreferences;

public class PrefManager {

    Context context;

    public PrefManager(Context context) {
        this.context = context;
    }

    public void saveid(String id) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("idvalue", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("id", id);
        editor.commit();
    }

    public String getidval() {
        SharedPreferences sharedPreferences = context.getSharedPreferences("idvalue", Context.MODE_PRIVATE);
        return sharedPreferences.getString("id", "");
    }

}
