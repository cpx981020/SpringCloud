package com.chenpeixin.cloud.shopping_cart.utils;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.io.InputStream;

public class OkHttpUtil {

    public static StringBuffer get(String url) throws IOException {
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder().url(url).get().build();
        Call call = okHttpClient.newCall(request);
        Response execute = call.execute();
        InputStream inputStream = execute.body().byteStream();
        return getContent(inputStream,new StringBuffer());
    }

    public static StringBuffer getContent(InputStream stream,StringBuffer buffer) throws IOException {
        byte[] bytes = new byte[1024];
        int length = -1;
        while((length=stream.read(bytes)) != -1){
            buffer.append(new String(bytes,0,length,"utf-8"));
        }
        stream.close();
        return buffer;
    }
}
