package org.bouncycastle.jce.spec;

import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: loaded from: classes8.dex */
public class ElGamalGenParameterSpec implements AlgorithmParameterSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f90528a;

    public ElGamalGenParameterSpec(int i10) {
        this.f90528a = i10;
    }

    public int getPrimeSize() {
        return this.f90528a;
    }
}
