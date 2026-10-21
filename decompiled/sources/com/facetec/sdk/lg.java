package com.facetec.sdk;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.security.cert.CertificateException;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes9.dex */
public final class lg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List<kb> f42292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f42293b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f42294c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f42295e;

    public lg(List<kb> list) {
        this.f42292a = list;
    }

    public final boolean a(SSLSocket sSLSocket) {
        for (int i10 = this.f42293b; i10 < this.f42292a.size(); i10++) {
            if (this.f42292a.get(i10).c(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    public final boolean d(IOException iOException) {
        this.f42295e = true;
        if (!this.f42294c || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        boolean z10 = iOException instanceof SSLHandshakeException;
        if ((z10 && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        return z10 || (iOException instanceof SSLProtocolException) || (iOException instanceof SSLException);
    }
}
