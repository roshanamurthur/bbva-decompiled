package com.adobe.marketing.mobile;

import com.adobe.marketing.mobile.services.HttpConnecting;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
interface NetworkService {

    public interface Callback {
        void call(HttpConnection httpConnection);
    }

    public enum HttpCommand {
        GET,
        HEAD,
        POST,
        PUT,
        DELETE,
        TRACE,
        OPTIONS,
        CONNECT,
        PATCH
    }

    public interface HttpConnection extends HttpConnecting {
    }

    HttpConnection connectUrl(String str, HttpCommand httpCommand, byte[] bArr, Map<String, String> map, int i10, int i11);

    void connectUrlAsync(String str, HttpCommand httpCommand, byte[] bArr, Map<String, String> map, int i10, int i11, Callback callback);
}
