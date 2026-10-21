package com.adobe.marketing.mobile.services;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class NetworkRequest {
    private final byte[] body;
    private final int connectTimeout;
    private final Map<String, String> headers;
    private final HttpMethod method;
    private final int readTimeout;
    private final String url;

    public NetworkRequest(String str, HttpMethod httpMethod, byte[] bArr, Map<String, String> map, int i10, int i11) {
        this.method = httpMethod;
        this.body = bArr;
        this.url = str;
        this.headers = map;
        this.connectTimeout = i10;
        this.readTimeout = i11;
    }

    public byte[] getBody() {
        return this.body;
    }

    public int getConnectTimeout() {
        return this.connectTimeout;
    }

    public Map<String, String> getHeaders() {
        return this.headers;
    }

    public HttpMethod getMethod() {
        return this.method;
    }

    public int getReadTimeout() {
        return this.readTimeout;
    }

    public String getUrl() {
        return this.url;
    }
}
