package com.veigar.practice;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * @description:
 * @author: houwj
 * @date: 2021/3/3
 */
public class AbSharedPreferencesUtil {

    private static final String SHARED_PATH = "config.dat";

    public static SharedPreferences getDefaultSharedPreferences() {
        return BaseLibConfig.context.getSharedPreferences(SHARED_PATH, Context.MODE_PRIVATE);
    }

    public static void putInt(String key, int value) {
        SharedPreferences sharedPreferences = getDefaultSharedPreferences();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putInt(key, value);
        edit.commit();
    }

    public static int getInt(String key, int defValue) {
        SharedPreferences sharedPreferences = getDefaultSharedPreferences();
        return sharedPreferences.getInt(key, defValue);
    }

    public static void putLong(String key, long value) {
        SharedPreferences sharedPreferences = getDefaultSharedPreferences();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putLong(key, value);
        edit.commit();
    }

    public static long getLong(String key, long defValue) {
        SharedPreferences sharedPreferences = getDefaultSharedPreferences();
        return sharedPreferences.getLong(key, defValue);
    }


    public static void putString(String key, String value) {
        SharedPreferences sharedPreferences = getDefaultSharedPreferences();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(key, value);
        edit.commit();
    }

    public static String getString(String key, String defValue) {
        SharedPreferences sharedPreferences = getDefaultSharedPreferences();
        return sharedPreferences.getString(key, defValue);
    }

    public static void putBoolean(String key, boolean value) {
        SharedPreferences sharedPreferences = getDefaultSharedPreferences();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean(key, value);
        edit.commit();
    }

    public static boolean getBoolean(String key, boolean defValue) {
        SharedPreferences sharedPreferences = getDefaultSharedPreferences();
        return sharedPreferences.getBoolean(key, defValue);
    }

    public static void putFloat(String key, float value) {
        SharedPreferences sharedPreferences = getDefaultSharedPreferences();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putFloat(key, value);
        edit.commit();
    }

    public static float getFloat(String key, float defValue) {
        SharedPreferences sharedPreferences = getDefaultSharedPreferences();
        return sharedPreferences.getFloat(key,defValue);
    }

    public static void remove(String key) {
        SharedPreferences sharedPreferences = getDefaultSharedPreferences();
        if (sharedPreferences.contains(key)) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.remove(key);
            edit.commit();
        }
    }

}
