package com.app.consumericecream;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.telephony.TelephonyManager;

import com.app.share.CommonFunctions;
import com.app.utils.MarshMallowPermission;
import com.app.utils.MyPrefFunctions;
import com.google.firebase.iid.FirebaseInstanceId;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import static com.app.utils.MarshMallowPermission.REQUEST_ID_MULTIPLE_PERMISSIONS;

/**
 * Created by Divyesh Weapplinse on 28-Jul-17.
 */

public class SplashActivity extends AppCompatActivity {
    MarshMallowPermission marshMallowPermission;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        marshMallowPermission = new MarshMallowPermission(this);

        String deviceToken = FirebaseInstanceId.getInstance().getToken();
        MyPrefFunctions.setFCMTocken(SplashActivity.this, deviceToken);
    }

    @Override
    protected void onStart() {
        super.onStart();
        List<String> listPermissionsNeeded = new ArrayList<>();
        if (!marshMallowPermission.checkPermissionForFineLocation()) {
            listPermissionsNeeded.add(Manifest.permission.ACCESS_FINE_LOCATION);
        }
        if (!marshMallowPermission.checkPermissionForCrossLocation()) {
            listPermissionsNeeded.add(Manifest.permission.ACCESS_COARSE_LOCATION);
        }
        if (!marshMallowPermission.checkPermissionForPhoneState()) {
            listPermissionsNeeded.add(Manifest.permission.READ_PHONE_STATE);
        }

        if (!listPermissionsNeeded.isEmpty()) {
            marshMallowPermission.requestMultiPemissions(listPermissionsNeeded);
        } else {
            checkLocation();
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if (requestCode == REQUEST_ID_MULTIPLE_PERMISSIONS) {

            if (grantResults.length > 0) {
                for (int i = 0; i < permissions.length; i++) {

                    if (permissions[i].equals(Manifest.permission.ACCESS_FINE_LOCATION)) {
                        if (grantResults[i] == PackageManager.PERMISSION_GRANTED) {
                        }
                    }
                    if (permissions[i].equals(Manifest.permission.ACCESS_COARSE_LOCATION)) {
                        if (grantResults[i] == PackageManager.PERMISSION_GRANTED) {
                        }
                    } else if (permissions[i].equals(Manifest.permission.READ_PHONE_STATE)) {
                        if (grantResults[i] == PackageManager.PERMISSION_GRANTED) {
                        }
                    }
                }
                checkLocation();
            }
        }
    }

   

    private void changeActivity() {
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                if (MyPrefFunctions.getIsLogedin(SplashActivity.this)) {
                    CommonFunctions.changeActivity(SplashActivity.this, MainActivity.class, null, true, true);
                } else {
                    CommonFunctions.changeActivity(SplashActivity.this, SignInActivity.class, null, true, true);
                }
            }
        }, 100);
    }
}
