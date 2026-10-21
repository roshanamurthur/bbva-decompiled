package com.adobe.marketing.mobile;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes2.dex */
public class TLSSocketFactory extends SSLSocketFactory {
    private static volatile boolean failed = false;
    private static volatile SSLSocketFactory singleton;
    private SSLSocketFactory delegate;

    private TLSSocketFactory() throws NoSuchAlgorithmException, KeyManagementException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.init(null, null, null);
        this.delegate = sSLContext.getSocketFactory();
    }

    private Socket enableTLSOnSocket(Socket socket) {
        if (socket != null && (socket instanceof SSLSocket)) {
            ((SSLSocket) socket).setEnabledProtocols(new String[]{"TLSv1.1", "TLSv1.2"});
        }
        return socket;
    }

    public static SSLSocketFactory getInstance() {
        if (singleton == null && !failed) {
            synchronized (TLSSocketFactory.class) {
                if (singleton == null) {
                    try {
                        singleton = new TLSSocketFactory();
                    } catch (Exception unused) {
                        failed = true;
                        Log.warning("Network", "Failed to generate TLSSocketFactory", new Object[0]);
                    }
                }
            }
        }
        return singleton;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() throws IOException {
        return enableTLSOnSocket(this.delegate.createSocket());
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return this.delegate.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return this.delegate.getSupportedCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i10, boolean z10) throws IOException {
        return enableTLSOnSocket(this.delegate.createSocket(socket, str, i10, z10));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i10) throws IOException {
        return enableTLSOnSocket(this.delegate.createSocket(str, i10));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i10, InetAddress inetAddress, int i11) throws IOException {
        return enableTLSOnSocket(this.delegate.createSocket(str, i10, inetAddress, i11));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i10) throws IOException {
        return enableTLSOnSocket(this.delegate.createSocket(inetAddress, i10));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11) throws IOException {
        return enableTLSOnSocket(this.delegate.createSocket(inetAddress, i10, inetAddress2, i11));
    }
}
