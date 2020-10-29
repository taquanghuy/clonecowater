package com.pigllet.clonecowater;

import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.pigllet.clonecowater.ultis.login.ResultLogin;

public class ShareStoreUtils {
    private static final String FILE_NAME = "SHARE"; // tao file

    // luu token vo file
    public static void saveToken(Context context, ResultLogin resultLogin) {
        Gson gson = new Gson();
        String json = gson.toJson(resultLogin);
        context.getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE).edit()
                .putString(ConstApp.TOKEN, json)
                .apply();
    }

    // lay token
    public static ResultLogin getUser(Context context) {
        String key = context.getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE).getString(ConstApp.TOKEN,"");
        ResultLogin resultLogin = new Gson().fromJson(key, new TypeToken<ResultLogin>() {
        }.getType());
        return resultLogin;
    }



}
