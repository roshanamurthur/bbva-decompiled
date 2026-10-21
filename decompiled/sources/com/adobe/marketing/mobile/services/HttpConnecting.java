package com.adobe.marketing.mobile.services;

import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public interface HttpConnecting {
    void close();

    InputStream getErrorStream();

    InputStream getInputStream();

    int getResponseCode();

    String getResponseMessage();

    String getResponsePropertyValue(String str);
}
