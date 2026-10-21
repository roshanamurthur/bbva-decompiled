package com.adobe.marketing.mobile;

import com.adobe.marketing.mobile.services.HttpConnecting;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
class AndroidHttpConnection implements NetworkService.HttpConnection {
    private static final String TAG = "AndroidHttpConnection";
    private final HttpConnecting innerConnection;

    public AndroidHttpConnection(HttpConnecting httpConnecting) {
        if (httpConnecting == null) {
            throw new IllegalArgumentException();
        }
        this.innerConnection = httpConnecting;
    }

    @Override // com.adobe.marketing.mobile.services.HttpConnecting
    public void close() {
        this.innerConnection.close();
    }

    @Override // com.adobe.marketing.mobile.services.HttpConnecting
    public InputStream getErrorStream() {
        return this.innerConnection.getErrorStream();
    }

    @Override // com.adobe.marketing.mobile.services.HttpConnecting
    public InputStream getInputStream() {
        return this.innerConnection.getInputStream();
    }

    @Override // com.adobe.marketing.mobile.services.HttpConnecting
    public int getResponseCode() {
        return this.innerConnection.getResponseCode();
    }

    @Override // com.adobe.marketing.mobile.services.HttpConnecting
    public String getResponseMessage() {
        return this.innerConnection.getResponseMessage();
    }

    @Override // com.adobe.marketing.mobile.services.HttpConnecting
    public String getResponsePropertyValue(String str) {
        return this.innerConnection.getResponsePropertyValue(str);
    }
}
