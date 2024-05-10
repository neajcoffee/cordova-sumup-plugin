package com.neajblvck.cordova.sumup;

import android.app.Application;
import com.sumup.merchant.reader.api.SumUpState;
import android.util.Log;


public class SampleApplication extends Application {
    private static final String TAG = "SumUpInit";

    @Override
    public void onCreate() {
        super.onCreate();
        try {
            SumUpState.init(this);
            Log.d(TAG, "SumUp SDK initialized successfully.");
        } catch (Exception e) {
            Log.e(TAG, "Failed to initialize SumUp SDK", e);
        }
    }
}
