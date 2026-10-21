package org.bouncycastle.jcajce;

import java.io.OutputStream;
import java.security.KeyStore;

/* JADX INFO: loaded from: classes6.dex */
public class PKCS12StoreParameter implements KeyStore.LoadStoreParameter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OutputStream f89691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final KeyStore.ProtectionParameter f89692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f89693c;

    public PKCS12StoreParameter(OutputStream outputStream, KeyStore.ProtectionParameter protectionParameter) {
        this(outputStream, protectionParameter, false);
    }

    public OutputStream getOutputStream() {
        return this.f89691a;
    }

    @Override // java.security.KeyStore.LoadStoreParameter
    public KeyStore.ProtectionParameter getProtectionParameter() {
        return this.f89692b;
    }

    public boolean isForDEREncoding() {
        return this.f89693c;
    }

    public PKCS12StoreParameter(OutputStream outputStream, KeyStore.ProtectionParameter protectionParameter, boolean z10) {
        this.f89691a = outputStream;
        this.f89692b = protectionParameter;
        this.f89693c = z10;
    }

    public PKCS12StoreParameter(OutputStream outputStream, char[] cArr) {
        this(outputStream, cArr, false);
    }

    public PKCS12StoreParameter(OutputStream outputStream, char[] cArr, boolean z10) {
        this(outputStream, new KeyStore.PasswordProtection(cArr), z10);
    }
}
