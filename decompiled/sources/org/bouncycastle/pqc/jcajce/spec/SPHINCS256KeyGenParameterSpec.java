package org.bouncycastle.pqc.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: loaded from: classes13.dex */
public class SPHINCS256KeyGenParameterSpec implements AlgorithmParameterSpec {
    public static final String SHA3_256 = "SHA3-256";
    public static final String SHA512_256 = "SHA512-256";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f91569a;

    public SPHINCS256KeyGenParameterSpec() {
        this(SHA512_256);
    }

    public String getTreeDigest() {
        return this.f91569a;
    }

    public SPHINCS256KeyGenParameterSpec(String str) {
        this.f91569a = str;
    }
}
