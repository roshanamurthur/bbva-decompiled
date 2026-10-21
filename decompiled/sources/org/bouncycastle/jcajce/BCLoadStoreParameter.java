package org.bouncycastle.jcajce;

import java.io.InputStream;
import java.io.OutputStream;
import java.security.KeyStore;

/* JADX INFO: loaded from: classes6.dex */
public class BCLoadStoreParameter implements KeyStore.LoadStoreParameter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream f89676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OutputStream f89677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final KeyStore.ProtectionParameter f89678c;

    public BCLoadStoreParameter(InputStream inputStream, OutputStream outputStream, KeyStore.ProtectionParameter protectionParameter) {
        this.f89676a = inputStream;
        this.f89677b = outputStream;
        this.f89678c = protectionParameter;
    }

    public InputStream getInputStream() {
        if (this.f89677b == null) {
            return this.f89676a;
        }
        throw new UnsupportedOperationException("parameter configured for storage OutputStream present");
    }

    public OutputStream getOutputStream() {
        OutputStream outputStream = this.f89677b;
        if (outputStream != null) {
            return outputStream;
        }
        throw new UnsupportedOperationException("parameter not configured for storage - no OutputStream");
    }

    @Override // java.security.KeyStore.LoadStoreParameter
    public KeyStore.ProtectionParameter getProtectionParameter() {
        return this.f89678c;
    }

    public BCLoadStoreParameter(InputStream inputStream, KeyStore.ProtectionParameter protectionParameter) {
        this(inputStream, null, protectionParameter);
    }

    public BCLoadStoreParameter(InputStream inputStream, char[] cArr) {
        this(inputStream, new KeyStore.PasswordProtection(cArr));
    }

    public BCLoadStoreParameter(OutputStream outputStream, KeyStore.ProtectionParameter protectionParameter) {
        this(null, outputStream, protectionParameter);
    }

    public BCLoadStoreParameter(OutputStream outputStream, char[] cArr) {
        this(outputStream, new KeyStore.PasswordProtection(cArr));
    }
}
