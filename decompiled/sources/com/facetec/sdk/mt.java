package com.facetec.sdk;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes9.dex */
final class mt extends mu {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Method f42628b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Method f42629e;

    private mt(Method method, Method method2) {
        this.f42628b = method;
        this.f42629e = method2;
    }

    @Override // com.facetec.sdk.mu
    public final void b(SSLSocket sSLSocket, String str, List<ko> list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            List<String> listB = mu.b(list);
            this.f42628b.invoke(sSLParameters, listB.toArray(new String[listB.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e5) {
            throw kz.b("unable to set ssl parameters", e5);
        }
    }

    @Override // com.facetec.sdk.mu
    @Nullable
    public final String d(SSLSocket sSLSocket) {
        try {
            String str = (String) this.f42629e.invoke(sSLSocket, new Object[0]);
            if (str == null || str.equals("")) {
                return null;
            }
            return str;
        } catch (IllegalAccessException e5) {
            throw kz.b("failed to get ALPN selected protocol", e5);
        } catch (InvocationTargetException e7) {
            if (e7.getCause() instanceof UnsupportedOperationException) {
                return null;
            }
            throw kz.b("failed to get ALPN selected protocol", e7);
        }
    }

    @Override // com.facetec.sdk.mu
    public final X509TrustManager b(SSLSocketFactory sSLSocketFactory) {
        throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on JDK 9+");
    }

    public static mt b() {
        try {
            return new mt(SSLParameters.class.getMethod("setApplicationProtocols", String[].class), SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }
}
