package org.bouncycastle.jce.spec;

import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: loaded from: classes8.dex */
public class ECNamedCurveGenParameterSpec implements AlgorithmParameterSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f90518a;

    public ECNamedCurveGenParameterSpec(String str) {
        this.f90518a = str;
    }

    public String getName() {
        return this.f90518a;
    }
}
