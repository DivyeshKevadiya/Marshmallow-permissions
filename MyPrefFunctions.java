package com.app.utils;

import android.content.Context;

/**
 * Created by Divyesh Weapplinse on 28-Jun-17.
 */

public class MyPrefFunctions {
    public static void setUID(Context activity, String u_id) {
        MyPrefs.writeString(activity, MyPrefs.U_ID, u_id);
    }

    public static String getUID(Context activity) {
        return MyPrefs.readString(activity, MyPrefs.U_ID, "null");
    }

    public static void setMobileNumber(Context activity, String mobilenumber) {
        MyPrefs.writeString(activity, MyPrefs.U_MOBILENUMBER, mobilenumber);
    }

    public static String getMobileNumber(Context activity) {
        return MyPrefs.readString(activity, MyPrefs.U_MOBILENUMBER, "null");
    }

    public static void setIMEINumber(Context activity, String imei_number) {
        MyPrefs.writeString(activity, MyPrefs.U_IMEINUMBER, imei_number);
    }

    public static String getIMEINumber(Context activity) {
        return MyPrefs.readString(activity, MyPrefs.U_IMEINUMBER, "1235479810");
    }

    public static void setIsLogedin(Context activity, boolean isLoggedIn) {
        MyPrefs.writeBoolean(activity, MyPrefs.U_ISLOGGEDIN, isLoggedIn);
    }

    public static boolean getIsLogedin(Context activity) {
        return MyPrefs.readBoolean(activity, MyPrefs.U_ISLOGGEDIN, false);
    }

    //U FCM TOKEN
    public static void setFCMTocken(Context activity, String refreshedToken) {
        MyPrefs.writeString(activity, MyPrefs.FCM_TOKEN, refreshedToken);
    }

    public static String getFCMTocken(Context activity) {
        return MyPrefs.readString(activity, MyPrefs.FCM_TOKEN, "0");
    }
}
