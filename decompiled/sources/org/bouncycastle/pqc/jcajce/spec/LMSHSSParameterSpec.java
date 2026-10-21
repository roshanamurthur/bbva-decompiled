package org.bouncycastle.pqc.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: loaded from: classes13.dex */
public class LMSHSSParameterSpec implements AlgorithmParameterSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LMSParameterSpec[] f91544a;

    public LMSHSSParameterSpec(LMSParameterSpec[] lMSParameterSpecArr) {
        this.f91544a = (LMSParameterSpec[]) lMSParameterSpecArr.clone();
    }

    public LMSParameterSpec[] getLMSSpecs() {
        return (LMSParameterSpec[]) this.f91544a.clone();
    }
}
