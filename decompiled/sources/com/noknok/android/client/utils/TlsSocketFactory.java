package com.noknok.android.client.utils;

import android.net.SSLCertificateSocketFactory;
import com.bbva.tohu.android.product.valkyria.sdk.logic.ReplenishLogic;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes11.dex */
public class TlsSocketFactory extends SSLSocketFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String[] f63481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f63482b = "TlsSocketFactory";

    @Override // javax.net.SocketFactory
    public Socket createSocket() {
        return null;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        throw null;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        throw null;
    }

    public TlsSocketFactory setAllowedSslProtocols(String[] strArr) {
        this.f63481a = strArr;
        return this;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i10) {
        return null;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i10, InetAddress inetAddress, int i11) {
        return null;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i10) {
        return null;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11) {
        return null;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i10, boolean z10) throws IOException {
        SSLSocket sSLSocket = (SSLSocket) ((SSLCertificateSocketFactory) SSLCertificateSocketFactory.getDefault(0)).createSocket(socket, str, i10, z10);
        String[] strArr = {"TLSv1.2", "TLSv1.1"};
        String[] strArr2 = this.f63481a;
        if (strArr2 != null && strArr2.length > 0) {
            strArr = strArr2;
        }
        String[] supportedProtocols = sSLSocket.getSupportedProtocols();
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArr) {
            for (String str3 : supportedProtocols) {
                if (str3.equalsIgnoreCase(str2)) {
                    arrayList.add(str2);
                    break;
                }
            }
        }
        String[] strArr3 = (String[]) arrayList.toArray(new String[0]);
        if (strArr3.length > 0) {
            StringBuilder sb2 = new StringBuilder();
            for (String str4 : strArr3) {
                sb2.append(str4);
                sb2.append(ReplenishLogic.ID_SEPARATOR);
            }
            Logger.i(this.f63482b, String.format("Setting allowed SSL protocols to: %s", sb2));
            sSLSocket.setEnabledProtocols(strArr3);
        }
        return sSLSocket;
    }
}
