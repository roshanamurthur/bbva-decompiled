package com.adobe.marketing.mobile.services;

import com.adobe.marketing.mobile.LoggingMode;
import com.adobe.marketing.mobile.MobileCore;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.UnknownServiceException;

/* JADX INFO: loaded from: classes2.dex */
class HttpConnection implements HttpConnecting {
    private static final String TAG = "HttpConnection";
    private final HttpURLConnection httpUrlConnection;

    public HttpConnection(HttpURLConnection httpURLConnection) {
        this.httpUrlConnection = httpURLConnection;
    }

    @Override // com.adobe.marketing.mobile.services.HttpConnecting
    public void close() {
        InputStream inputStream = getInputStream();
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (Error e5) {
                MobileCore.log(LoggingMode.WARNING, TAG, String.format("Could not close the input stream. (%s)", e5));
            } catch (Exception e7) {
                MobileCore.log(LoggingMode.WARNING, TAG, String.format("Could not close the input stream. (%s)", e7));
            }
        }
        this.httpUrlConnection.disconnect();
    }

    @Override // com.adobe.marketing.mobile.services.HttpConnecting
    public InputStream getErrorStream() {
        try {
            return this.httpUrlConnection.getErrorStream();
        } catch (Error e5) {
            MobileCore.log(LoggingMode.WARNING, TAG, String.format("Could not get the input stream. (%s)", e5));
            return null;
        } catch (Exception e7) {
            MobileCore.log(LoggingMode.WARNING, TAG, String.format("Could not get the input stream. (%s)", e7));
            return null;
        }
    }

    @Override // com.adobe.marketing.mobile.services.HttpConnecting
    public InputStream getInputStream() {
        try {
            return this.httpUrlConnection.getInputStream();
        } catch (Error e5) {
            MobileCore.log(LoggingMode.WARNING, TAG, String.format("Could not get the input stream. (%s)", e5));
            return null;
        } catch (UnknownServiceException e7) {
            MobileCore.log(LoggingMode.WARNING, TAG, String.format("Could not get the input stream, protocol does not support input. (%s)", e7));
            return null;
        } catch (Exception e10) {
            MobileCore.log(LoggingMode.WARNING, TAG, String.format("Could not get the input stream. (%s)", e10));
            return null;
        }
    }

    @Override // com.adobe.marketing.mobile.services.HttpConnecting
    public int getResponseCode() {
        try {
            return this.httpUrlConnection.getResponseCode();
        } catch (Error e5) {
            MobileCore.log(LoggingMode.WARNING, TAG, String.format("Could not get response code. (%s)", e5));
            return -1;
        } catch (Exception e7) {
            MobileCore.log(LoggingMode.WARNING, TAG, String.format("Could not get response code. (%s)", e7));
            return -1;
        }
    }

    @Override // com.adobe.marketing.mobile.services.HttpConnecting
    public String getResponseMessage() {
        try {
            return this.httpUrlConnection.getResponseMessage();
        } catch (Error e5) {
            MobileCore.log(LoggingMode.WARNING, TAG, String.format("Could not get the response message. (%s)", e5));
            return null;
        } catch (Exception e7) {
            MobileCore.log(LoggingMode.WARNING, TAG, String.format("Could not get the response message. (%s)", e7));
            return null;
        }
    }

    @Override // com.adobe.marketing.mobile.services.HttpConnecting
    public String getResponsePropertyValue(String str) {
        return this.httpUrlConnection.getHeaderField(str);
    }
}
