package com.hh.tennets.http;

import java.io.File;

import org.apache.http.protocol.HTTP;

import android.content.Context;

import com.ab.http.AbHttpUtil;
import com.ab.http.AbRequestParams;
import com.ab.http.AbStringHttpResponseListener;

public class DmHttpHelper {
    private Context context;
    private AbHttpUtil httpUtil;
    private ResultListener resultListener;
    private AbRequestParams params;
    private String url;

    public DmHttpHelper(Context context, ResultListener resultListener) {
        this.context = context;
        this.resultListener = resultListener;
        httpUtil = AbHttpUtil.getInstance(context);
        params = new AbRequestParams();
    }

    public void putParams(String key, String value) {
        if (null != params) {
            params.put(key, value);
        }
    }

    public void putParams(String key, File file) {
        if (null != params) {
            params.put(key, file);
        }
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void postRequest() {
        httpUtil.setTimeout(5000);
        httpUtil.setEncode(HTTP.UTF_8);
        httpUtil.post(url, params, new AbStringHttpResponseListener() {

            @Override
            public void onSuccess(int arg0, String arg1) {
                resultListener.onSuccess(arg0, arg1);
            }

            @Override
            public void onFailure(int arg0, String arg1, Throwable arg2) {
                resultListener.onFailure(arg0, arg1);
            }

            @Override
            public void onFinish() {}

            @Override
            public void onStart() {}
        });
    }

}
