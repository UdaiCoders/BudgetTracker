package com.UDC.budgettracker;

import android.app.Application;

import com.google.android.gms.ads.MobileAds;
import com.onesignal.OneSignal;

public class BudgetApp extends Application {

    private static final String ONESIGNAL_APP_ID = "########-####-####-####-############";

    @Override
    public void onCreate() {
        super.onCreate();

        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);
        OneSignal.initWithContext(this);
        OneSignal.setAppId(ONESIGNAL_APP_ID);

        // Initialize the Mobile Ads SDK.
        MobileAds.initialize(this, initializationStatus -> {
        });

    }
}