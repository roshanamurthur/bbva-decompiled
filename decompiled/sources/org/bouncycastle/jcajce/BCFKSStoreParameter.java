package org.bouncycastle.jcajce;

import java.io.OutputStream;
import java.security.KeyStore;
import org.bouncycastle.crypto.util.PBKDFConfig;

/* JADX INFO: loaded from: classes6.dex */
public class BCFKSStoreParameter implements KeyStore.LoadStoreParameter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KeyStore.ProtectionParameter f89673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PBKDFConfig f89674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final OutputStream f89675c;

    public BCFKSStoreParameter(OutputStream outputStream, PBKDFConfig pBKDFConfig, KeyStore.ProtectionParameter protectionParameter) {
        this.f89675c = outputStream;
        this.f89674b = pBKDFConfig;
        this.f89673a = protectionParameter;
    }

    public OutputStream getOutputStream() {
        return this.f89675c;
    }

    @Override // java.security.KeyStore.LoadStoreParameter
    public KeyStore.ProtectionParameter getProtectionParameter() {
        return this.f89673a;
    }

    public PBKDFConfig getStorePBKDFConfig() {
        return this.f89674b;
    }

    public BCFKSStoreParameter(OutputStream outputStream, PBKDFConfig pBKDFConfig, char[] cArr) {
        this(outputStream, pBKDFConfig, new KeyStore.PasswordProtection(cArr));
    }
}
