package com.nimbusds.jose.crypto.bc;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* JADX INFO: loaded from: classes10.dex */
public final class BouncyCastleProviderSingleton {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static BouncyCastleProvider f62590a;

    public static BouncyCastleProvider getInstance() {
        if (f62590a == null) {
            f62590a = new BouncyCastleProvider();
        }
        return f62590a;
    }
}
