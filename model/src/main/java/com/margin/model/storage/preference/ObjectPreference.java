package com.margin.model.storage.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.Nullable;

import com.google.gson.Gson;

/**
 * Created by dongjijin on 2017/9/23 0007.
 * 存储全局对象
 */
public class ObjectPreference {

    static private final String PRF = ObjectPreference.class.getName();

    @Nullable
    static public <T> T getObject(Context context, Class<T> cls){
        SharedPreferences prf = context.getSharedPreferences(PRF, Context.MODE_PRIVATE);
        return new Gson().fromJson(prf.getString(cls.getName(), null), cls);
    }

    static public <T> T getObject(Context context, String name, Class<T> cls){
        SharedPreferences prf = context.getSharedPreferences(PRF, Context.MODE_PRIVATE);
        return new Gson().fromJson(prf.getString(name, null), cls);
    }

    static public void saveObject(Context context, Object obj){
        SharedPreferences.Editor editor = context.getSharedPreferences(PRF, Context.MODE_PRIVATE).edit();
        editor.putString(obj.getClass().getName(), new Gson().toJson(obj));
        editor.apply();
    }

    static public void saveObject(Context context, String name, Object obj) {
        SharedPreferences.Editor editor = context.getSharedPreferences(PRF, Context.MODE_PRIVATE).edit();
        editor.putString(name, new Gson().toJson(obj));
        editor.apply();
    }

    static public <T> void clearObject(Context context, Class<T> cls) {
        SharedPreferences.Editor editor = context.getSharedPreferences(PRF, Context.MODE_PRIVATE).edit();
        editor.remove(cls.getName());
        editor.apply();
    }

    static public  void clearObject(Context context, String name) {
        SharedPreferences.Editor editor = context.getSharedPreferences(PRF, Context.MODE_PRIVATE).edit();
        editor.remove(name);
        editor.apply();
    }
}
