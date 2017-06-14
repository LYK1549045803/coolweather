package com.coolweather.app.util;

/**
 * Created by ibm on 2017/6/13.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
