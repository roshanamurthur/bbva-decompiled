package org.bouncycastle.jce.provider;

import java.io.OutputStream;
import java.security.KeyStore;

/* JADX INFO: loaded from: classes8.dex */
public class JDKPKCS12StoreParameter implements KeyStore.LoadStoreParameter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OutputStream f90423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public KeyStore.ProtectionParameter f90424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f90425c;

    public OutputStream getOutputStream() {
        return this.f90423a;
    }

    @Override // java.security.KeyStore.LoadStoreParameter
    public KeyStore.ProtectionParameter getProtectionParameter() {
        return this.f90424b;
    }

    public boolean isUseDEREncoding() {
        return this.f90425c;
    }

    public void setOutputStream(OutputStream outputStream) {
        this.f90423a = outputStream;
    }

    public void setPassword(char[] cArr) {
        this.f90424b = new KeyStore.PasswordProtection(cArr);
    }

    public void setProtectionParameter(KeyStore.ProtectionParameter protectionParameter) {
        this.f90424b = protectionParameter;
    }

    public void setUseDEREncoding(boolean z10) {
        this.f90425c = z10;
    }
}
