package com.hh.tennets.http;

/**
 * @author winbo
 * @className: ResultListener
 * @description: all API use this listener;
 */
public interface ResultListener {

    public void onSuccess(int statusCode, String successContent);

    public void onFailure(int statusCode, String failContent);
}
