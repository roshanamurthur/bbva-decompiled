package com.facetec.sdk;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.conscrypt.Conscrypt;

/* JADX INFO: loaded from: classes9.dex */
public final class ms extends mu {
    private ms() {
    }

    private static Provider e() {
        return Conscrypt.newProviderBuilder().provideTrustManager().build();
    }

    @Override // com.facetec.sdk.mu
    @Nullable
    public final X509TrustManager b(SSLSocketFactory sSLSocketFactory) {
        if (!Conscrypt.isConscrypt(sSLSocketFactory)) {
            return super.b(sSLSocketFactory);
        }
        try {
            Object objB = mu.b(sSLSocketFactory, (Class<Object>) Object.class, "sslParameters");
            if (objB != null) {
                return (X509TrustManager) mu.b(objB, X509TrustManager.class, "x509TrustManager");
            }
            return null;
        } catch (Exception e5) {
            throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on Conscrypt", e5);
        }
    }

    @Override // com.facetec.sdk.mu
    public final SSLContext c() {
        try {
            return SSLContext.getInstance("TLSv1.3", e());
        } catch (NoSuchAlgorithmException e5) {
            try {
                return SSLContext.getInstance("TLS", e());
            } catch (NoSuchAlgorithmException unused) {
                throw new IllegalStateException("No TLS provider", e5);
            }
        }
    }

    @Override // com.facetec.sdk.mu
    @Nullable
    public final String d(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket) ? Conscrypt.getApplicationProtocol(sSLSocket) : super.d(sSLSocket);
    }

    @Override // com.facetec.sdk.mu
    public final void e(SSLSocketFactory sSLSocketFactory) {
        if (Conscrypt.isConscrypt(sSLSocketFactory)) {
            Conscrypt.setUseEngineSocket(sSLSocketFactory, true);
        }
    }

    public static ms d() {
        try {
            Class.forName("org.conscrypt.Conscrypt");
            if (Conscrypt.isAvailable()) {
                return new ms();
            }
            return null;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    @Override // com.facetec.sdk.mu
    public final void b(SSLSocket sSLSocket, String str, List<ko> list) throws IOException {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            if (str != null) {
                Conscrypt.setUseSessionTickets(sSLSocket, true);
                Conscrypt.setHostname(sSLSocket, str);
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) mu.b(list).toArray(new String[0]));
            return;
        }
        super.b(sSLSocket, str, list);
    }
}
