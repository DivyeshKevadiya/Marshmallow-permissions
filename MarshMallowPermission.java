package com.ds.utils;

import android.Manifest;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.v4.app.ActivityCompat;

import java.util.List;

public class MarshMallowPermission {
    public static final int READ_EXTERNAL_STORAGE_PERMISSION_REQUEST_CODE = 1;
    public static final int WRITE_EXTERNAL_STORAGE_PERMISSION_REQUEST_CODE = 2;
    public static final int CAMERA_PERMISSION_REQUEST_CODE = 3;
    public static final int PHONE_STATE_REQUEST_CODE = 4;
    public static final int ACCESS_FINE_LOCATION_CODE = 5;
    public static final int ACCESS_COARS_LOCATION_CODE = 6;
    public static final int READ_CONTACTS_PERMISSION_REQUEST_CODE = 7;
    public static final int WRITE_CONTACTS_PERMISSION_REQUEST_CODE = 8;
    public static final int READ_CALENDAR = 9;
    public static final int WRITE_CALENDAR = 10;
    public static final int READ_CALL_LOGS = 11;
    public static final int WRITE_CALL_LOGS = 12;
    public static final int MAKECALL_PERMISSION_REQUEST_CODE = 13;
    public static final int SET_WALLPAPER = 14;
    public static final int READ_SMS = 15;
    public static final int RECORD_PERMISSION_REQUEST_CODE = 16;

    public static final int REQUEST_ID_MULTIPLE_PERMISSIONS = 101;

    Activity activity;

    public MarshMallowPermission(Activity activity) {
        this.activity = activity;
    }

    public boolean checkPermissionForReadExternalStorage() {
        int result = ActivityCompat.checkSelfPermission(activity, Manifest.permission.READ_EXTERNAL_STORAGE);
        if (result == PackageManager.PERMISSION_GRANTED) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkPermissionForWriteExternalStorage() {
        int result = ActivityCompat.checkSelfPermission(activity, Manifest.permission.WRITE_EXTERNAL_STORAGE);
        if (result == PackageManager.PERMISSION_GRANTED) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkPermissionForCamera() {
        int result = ActivityCompat.checkSelfPermission(activity, Manifest.permission.CAMERA);
        if (result == PackageManager.PERMISSION_GRANTED) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkPermissionForPhoneState() {
        int result = ActivityCompat.checkSelfPermission(activity, Manifest.permission.READ_PHONE_STATE);
        if (result == PackageManager.PERMISSION_GRANTED) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkPermissionForFineLocation() {
        int result = ActivityCompat.checkSelfPermission(activity, Manifest.permission.ACCESS_FINE_LOCATION);
        if (result == PackageManager.PERMISSION_GRANTED) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkPermissionForCoarsLocation() {
        int resultCross = ActivityCompat.checkSelfPermission(activity, Manifest.permission.ACCESS_COARSE_LOCATION);
        if (resultCross == PackageManager.PERMISSION_GRANTED) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkPermissionForReadContact() {
        int resultCross = ActivityCompat.checkSelfPermission(activity, Manifest.permission.READ_CONTACTS);
        if (resultCross == PackageManager.PERMISSION_GRANTED) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkPermissionForWriteContacts() {
        int resultCross = ActivityCompat.checkSelfPermission(activity, Manifest.permission.WRITE_CONTACTS);
        if (resultCross == PackageManager.PERMISSION_GRANTED) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkPermissionForReadCalendar() {
        int resultCross = ActivityCompat.checkSelfPermission(activity, Manifest.permission.READ_CALENDAR);
        if (resultCross == PackageManager.PERMISSION_GRANTED) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkPermissionForWriteCalendar() {
        int resultCross = ActivityCompat.checkSelfPermission(activity, Manifest.permission.WRITE_CALENDAR);
        if (resultCross == PackageManager.PERMISSION_GRANTED) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkPermissionForReadCallLogs() {
        int resultCross = ActivityCompat.checkSelfPermission(activity, Manifest.permission.READ_CALL_LOG);
        if (resultCross == PackageManager.PERMISSION_GRANTED) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkPermissionForWriteCallLogs() {
        int resultCross = ActivityCompat.checkSelfPermission(activity, Manifest.permission.WRITE_CALL_LOG);
        if (resultCross == PackageManager.PERMISSION_GRANTED) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkPermissionForMakeCall() {
        int resultCross = ActivityCompat.checkSelfPermission(activity, Manifest.permission.CALL_PHONE);
        if (resultCross == PackageManager.PERMISSION_GRANTED) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkPermissionForWallpaper() {
        int resultCross = ActivityCompat.checkSelfPermission(activity, Manifest.permission.SET_WALLPAPER);
        if (resultCross == PackageManager.PERMISSION_GRANTED) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkPermissionForReadSMS() {
        int resultCross = ActivityCompat.checkSelfPermission(activity, Manifest.permission.READ_SMS);
        if (resultCross == PackageManager.PERMISSION_GRANTED) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkPermissionForRecord() {
        int result = ActivityCompat.checkSelfPermission(activity, Manifest.permission.RECORD_AUDIO);
        if (result == PackageManager.PERMISSION_GRANTED) {
            return true;
        } else {
            return false;
        }
    }


    //TODO: Request permission is started


    public void requestPermissionForReadExternalStorage() {
        if (ActivityCompat.shouldShowRequestPermissionRationale(activity, Manifest.permission.READ_EXTERNAL_STORAGE)) {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, READ_EXTERNAL_STORAGE_PERMISSION_REQUEST_CODE);
        } else {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, READ_EXTERNAL_STORAGE_PERMISSION_REQUEST_CODE);
        }
    }

    public void requestPermissionForWriteExternalStorage() {
        if (ActivityCompat.shouldShowRequestPermissionRationale(activity, Manifest.permission.WRITE_EXTERNAL_STORAGE)) {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, WRITE_EXTERNAL_STORAGE_PERMISSION_REQUEST_CODE);
        } else {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, WRITE_EXTERNAL_STORAGE_PERMISSION_REQUEST_CODE);
        }
    }

    public void requestPermissionForCamera() {
        if (ActivityCompat.shouldShowRequestPermissionRationale(activity, Manifest.permission.CAMERA)) {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.CAMERA}, CAMERA_PERMISSION_REQUEST_CODE);
        } else {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.CAMERA}, CAMERA_PERMISSION_REQUEST_CODE);
        }
    }

    public void requestPermissionForPhoneState() {
        if (ActivityCompat.shouldShowRequestPermissionRationale(activity, Manifest.permission.READ_PHONE_STATE)) {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.READ_PHONE_STATE}, PHONE_STATE_REQUEST_CODE);
        } else {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.READ_PHONE_STATE}, PHONE_STATE_REQUEST_CODE);
        }
    }

    public void requestPermissionForFineLocation() {
        if (ActivityCompat.shouldShowRequestPermissionRationale(activity, Manifest.permission.ACCESS_FINE_LOCATION)) {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION}, ACCESS_FINE_LOCATION_CODE);
        } else {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION}, ACCESS_FINE_LOCATION_CODE);
        }
    }

    public void requestPermissionForCoarsLocation() {
        if (ActivityCompat.shouldShowRequestPermissionRationale(activity, Manifest.permission.ACCESS_FINE_LOCATION)) {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.ACCESS_COARSE_LOCATION}, ACCESS_COARS_LOCATION_CODE);
        } else {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.ACCESS_COARSE_LOCATION}, ACCESS_COARS_LOCATION_CODE);
        }
    }

    public void requestPermissionForReadContact() {
        if (ActivityCompat.shouldShowRequestPermissionRationale(activity, Manifest.permission.READ_CONTACTS)) {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.READ_CONTACTS}, READ_CONTACTS_PERMISSION_REQUEST_CODE);
        } else {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.READ_CONTACTS}, READ_CONTACTS_PERMISSION_REQUEST_CODE);
        }
    }

    public void requestPermissionForWriteContact() {
        if (ActivityCompat.shouldShowRequestPermissionRationale(activity, Manifest.permission.WRITE_CONTACTS)) {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.WRITE_CONTACTS}, WRITE_CONTACTS_PERMISSION_REQUEST_CODE);
        } else {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.WRITE_CONTACTS}, WRITE_CONTACTS_PERMISSION_REQUEST_CODE);
        }
    }

    public void requestPermissionReadCalendar() {
        if (ActivityCompat.shouldShowRequestPermissionRationale(activity, Manifest.permission.READ_CALENDAR)) {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.READ_CALENDAR}, READ_CALENDAR);
        } else {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.READ_CALENDAR}, READ_CALENDAR);
        }
    }

    public void requestPermissionWriteCalendar() {
        if (ActivityCompat.shouldShowRequestPermissionRationale(activity, Manifest.permission.WRITE_CALENDAR)) {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.WRITE_CALENDAR}, WRITE_CALENDAR);
        } else {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.WRITE_CALENDAR}, WRITE_CALENDAR);
        }
    }

    public void requestPermissionReadCallLOGS() {
        if (ActivityCompat.shouldShowRequestPermissionRationale(activity, Manifest.permission.READ_CALL_LOG)) {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.READ_CALL_LOG}, READ_CALL_LOGS);
        } else {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.READ_CALL_LOG}, READ_CALL_LOGS);
        }
    }

    public void requestPermissionWriteCallLOGS() {
        if (ActivityCompat.shouldShowRequestPermissionRationale(activity, Manifest.permission.WRITE_CALL_LOG)) {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.WRITE_CALL_LOG}, WRITE_CALL_LOGS);
        } else {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.WRITE_CALL_LOG}, WRITE_CALL_LOGS);
        }
    }

    public void requestPermissionForRecord() {
        if (ActivityCompat.shouldShowRequestPermissionRationale(activity, Manifest.permission.RECORD_AUDIO)) {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.RECORD_AUDIO}, RECORD_PERMISSION_REQUEST_CODE);
        } else {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.RECORD_AUDIO}, RECORD_PERMISSION_REQUEST_CODE);
        }
    }


    public void requestPermissionForCall() {
        if (ActivityCompat.shouldShowRequestPermissionRationale(activity, Manifest.permission.CALL_PHONE)) {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.CALL_PHONE}, MAKECALL_PERMISSION_REQUEST_CODE);
        } else {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.CALL_PHONE}, MAKECALL_PERMISSION_REQUEST_CODE);
        }
    }


    public void requestPermissionSetWallpaper() {
        if (ActivityCompat.shouldShowRequestPermissionRationale(activity, Manifest.permission.SET_WALLPAPER)) {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.SET_WALLPAPER}, SET_WALLPAPER);
        } else {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.SET_WALLPAPER}, SET_WALLPAPER);
        }
    }


    public void requestPermissionReadSMS() {
        if (ActivityCompat.shouldShowRequestPermissionRationale(activity, Manifest.permission.READ_SMS)) {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.READ_SMS}, READ_SMS);
        } else {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.READ_SMS}, READ_SMS);
        }
    }


    public void requestMultiPemissions(List<String> listPermissionsNeeded) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            activity.requestPermissions(listPermissionsNeeded.toArray(new String[listPermissionsNeeded.size()]), REQUEST_ID_MULTIPLE_PERMISSIONS);
        }
    }


}
