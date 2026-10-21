package com.facetec.sdk;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import java.io.IOException;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: loaded from: classes9.dex */
@SuppressLint({"NewApi"})
final class mm extends mp {
    private mm(Class<?> cls) {
        super(cls, null, null, null, null);
    }

    @Nullable
    public static mu a() {
        if (!mu.g()) {
            return null;
        }
        try {
            if (mp.e() >= 29) {
                return new mm(Class.forName("com.android.org.conscrypt.SSLParametersImpl"));
            }
        } catch (ClassNotFoundException unused) {
        }
        return null;
    }

    @Override // com.facetec.sdk.mp, com.facetec.sdk.mu
    @SuppressLint({"NewApi"})
    @IgnoreJRERequirement
    public final void b(SSLSocket sSLSocket, String str, List<ko> list) throws IOException {
        try {
            if (SSLSockets.isSupportedSocket(sSLSocket)) {
                SSLSockets.setUseSessionTickets(sSLSocket, true);
            }
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            sSLParameters.setApplicationProtocols((String[]) mu.b(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e5) {
            throw new IOException("Android internal error", e5);
        }
    }

    @Override // com.facetec.sdk.mp, com.facetec.sdk.mu
    @Nullable
    @IgnoreJRERequirement
    public final String d(SSLSocket sSLSocket) {
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.isEmpty()) {
            return null;
        }
        return applicationProtocol;
    }
}
