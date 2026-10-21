package org.bouncycastle.jcajce.spec;

import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes8.dex */
public class RepeatedSecretKeySpec implements SecretKey {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final String f90295p0;

    public RepeatedSecretKeySpec(String str) {
        this.f90295p0 = str;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.f90295p0;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return null;
    }

    @Override // java.security.Key
    public String getFormat() {
        return null;
    }
}
