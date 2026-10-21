package org.bouncycastle.jce.spec;

import java.security.spec.KeySpec;

/* JADX INFO: loaded from: classes8.dex */
public class ECKeySpec implements KeySpec {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ECParameterSpec f90517p0;

    public ECKeySpec(ECParameterSpec eCParameterSpec) {
        this.f90517p0 = eCParameterSpec;
    }

    public ECParameterSpec getParams() {
        return this.f90517p0;
    }
}
