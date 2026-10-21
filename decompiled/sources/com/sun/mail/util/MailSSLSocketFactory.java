package com.sun.mail.util;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes9.dex */
public class MailSSLSocketFactory extends SSLSocketFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f65564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String[] f65565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SSLContext f65566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public KeyManager[] f65567d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TrustManager[] f65568e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SecureRandom f65569f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SSLSocketFactory f65570g;

    public class a implements X509TrustManager {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final X509TrustManager f65571a;

        public a() throws GeneralSecurityException {
            this.f65571a = null;
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("X509");
            trustManagerFactory.init((KeyStore) null);
            this.f65571a = (X509TrustManager) trustManagerFactory.getTrustManagers()[0];
        }

        @Override // javax.net.ssl.X509TrustManager
        public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
            MailSSLSocketFactory mailSSLSocketFactory = MailSSLSocketFactory.this;
            if (mailSSLSocketFactory.isTrustAllHosts() || mailSSLSocketFactory.getTrustedHosts() != null) {
                return;
            }
            this.f65571a.checkClientTrusted(x509CertificateArr, str);
        }

        @Override // javax.net.ssl.X509TrustManager
        public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
            MailSSLSocketFactory mailSSLSocketFactory = MailSSLSocketFactory.this;
            if (mailSSLSocketFactory.isTrustAllHosts() || mailSSLSocketFactory.getTrustedHosts() != null) {
                return;
            }
            this.f65571a.checkServerTrusted(x509CertificateArr, str);
        }

        @Override // javax.net.ssl.X509TrustManager
        public final X509Certificate[] getAcceptedIssuers() {
            return this.f65571a.getAcceptedIssuers();
        }
    }

    public MailSSLSocketFactory() throws GeneralSecurityException {
        this("TLS");
    }

    public final synchronized void a() throws KeyManagementException {
        this.f65566c.init(this.f65567d, this.f65568e, this.f65569f);
        this.f65570g = this.f65566c.getSocketFactory();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public synchronized Socket createSocket(Socket socket, String str, int i10, boolean z10) throws IOException {
        return this.f65570g.createSocket(socket, str, i10, z10);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public synchronized String[] getDefaultCipherSuites() {
        return this.f65570g.getDefaultCipherSuites();
    }

    public synchronized KeyManager[] getKeyManagers() {
        return (KeyManager[]) this.f65567d.clone();
    }

    public synchronized SecureRandom getSecureRandom() {
        return this.f65569f;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public synchronized String[] getSupportedCipherSuites() {
        return this.f65570g.getSupportedCipherSuites();
    }

    public synchronized TrustManager[] getTrustManagers() {
        return this.f65568e;
    }

    public synchronized String[] getTrustedHosts() {
        String[] strArr = this.f65565b;
        if (strArr == null) {
            return null;
        }
        return (String[]) strArr.clone();
    }

    public synchronized boolean isServerTrusted(String str, SSLSocket sSLSocket) {
        if (this.f65564a) {
            return true;
        }
        String[] strArr = this.f65565b;
        if (strArr == null) {
            return true;
        }
        return Arrays.asList(strArr).contains(str);
    }

    public synchronized boolean isTrustAllHosts() {
        return this.f65564a;
    }

    public synchronized void setKeyManagers(KeyManager[] keyManagerArr) throws GeneralSecurityException {
        this.f65567d = (KeyManager[]) keyManagerArr.clone();
        a();
    }

    public synchronized void setSecureRandom(SecureRandom secureRandom) throws GeneralSecurityException {
        this.f65569f = secureRandom;
        a();
    }

    public synchronized void setTrustAllHosts(boolean z10) {
        this.f65564a = z10;
    }

    public synchronized void setTrustManagers(TrustManager[] trustManagerArr) throws GeneralSecurityException {
        this.f65568e = trustManagerArr;
        a();
    }

    public synchronized void setTrustedHosts(String[] strArr) {
        try {
            if (strArr == null) {
                this.f65565b = null;
            } else {
                this.f65565b = (String[]) strArr.clone();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public MailSSLSocketFactory(String str) throws GeneralSecurityException {
        this.f65565b = null;
        this.f65570g = null;
        this.f65564a = false;
        this.f65566c = SSLContext.getInstance(str);
        this.f65567d = null;
        this.f65568e = new TrustManager[]{new a()};
        this.f65569f = null;
        a();
    }

    @Override // javax.net.SocketFactory
    public synchronized Socket createSocket() throws IOException {
        return this.f65570g.createSocket();
    }

    @Override // javax.net.SocketFactory
    public synchronized Socket createSocket(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11) throws IOException {
        return this.f65570g.createSocket(inetAddress, i10, inetAddress2, i11);
    }

    @Override // javax.net.SocketFactory
    public synchronized Socket createSocket(InetAddress inetAddress, int i10) throws IOException {
        return this.f65570g.createSocket(inetAddress, i10);
    }

    @Override // javax.net.SocketFactory
    public synchronized Socket createSocket(String str, int i10, InetAddress inetAddress, int i11) throws IOException {
        return this.f65570g.createSocket(str, i10, inetAddress, i11);
    }

    @Override // javax.net.SocketFactory
    public synchronized Socket createSocket(String str, int i10) throws IOException {
        return this.f65570g.createSocket(str, i10);
    }
}
