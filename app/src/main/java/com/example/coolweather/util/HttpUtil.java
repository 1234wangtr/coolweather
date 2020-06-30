package com.example.coolweather.util;

import android.util.Log;

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder().url(address).build();//申请与服务器交互
        client.newCall(request).enqueue(callback);//注册回调处理响应
        Log.d("mdebug","send okhttp");
        Log.d("mdebug",address);
    }
}
