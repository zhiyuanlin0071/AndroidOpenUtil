package com.excellence.androidopenutiljar.tools;

import android.app.Application;
import android.content.Context;

/**
 * Created by stefan on 2017/6/27.
 */

public class MyApplication extends Application{
    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext=this;
    }

    public static Context gainContext(){
        return mContext;
    }
}
