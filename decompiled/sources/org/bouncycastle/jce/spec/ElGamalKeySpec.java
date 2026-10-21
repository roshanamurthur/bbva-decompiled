package org.bouncycastle.jce.spec;

import java.security.spec.KeySpec;

/* JADX INFO: loaded from: classes8.dex */
public class ElGamalKeySpec implements KeySpec {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ElGamalParameterSpec f90529p0;

    public ElGamalKeySpec(ElGamalParameterSpec elGamalParameterSpec) {
        this.f90529p0 = elGamalParameterSpec;
    }

    public ElGamalParameterSpec getParams() {
        return this.f90529p0;
    }
}
