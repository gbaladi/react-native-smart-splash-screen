package com.reactnativecomponent.splashscreen;


import android.app.Activity;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class RCTSplashScreenPackage implements ReactPackage {

    private Activity activity;
    private RCTSplashScreen splashScreenModule;

    public RCTSplashScreenPackage() {
        super();
    }


    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        splashScreenModule = new RCTSplashScreen(reactContext);
        return Arrays.<NativeModule>asList(
                splashScreenModule
        );
    }

    @Override
    public List<Class<? extends JavaScriptModule>> createJSModules() {
        return Collections.emptyList();
    }

    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        return Arrays.<ViewManager>asList();
    }
}
