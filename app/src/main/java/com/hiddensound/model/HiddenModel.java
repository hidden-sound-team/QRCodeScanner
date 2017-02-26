package com.hiddensound.model;

import android.support.annotation.Nullable;

/**
 * Created by amarques on 2/11/2017.
 */

public class HiddenModel {
    private final String IMEI;
    private final String QRMEMO;
    private final String USERNAME;
    private final String TOKERN;

    public HiddenModel(String imei, String qrMemo, String userName, String token){
        IMEI = imei;
        QRMEMO = qrMemo;
        USERNAME = userName;
        TOKERN = token;
    }

    public HiddenModel(String imei, String qrMemo){
        this(imei, qrMemo, null, null);
    }

    public String getIMEI() {
        return IMEI;
    }

    public String getQRMemo() {
        return QRMEMO;
    }

    public String getUser() {
        return USERNAME;
    }

    public String getToken() {
        return TOKERN;
    }
}