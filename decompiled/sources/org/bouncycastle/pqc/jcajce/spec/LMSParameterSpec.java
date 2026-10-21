package org.bouncycastle.pqc.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.pqc.crypto.lms.LMOtsParameters;
import org.bouncycastle.pqc.crypto.lms.LMSigParameters;

/* JADX INFO: loaded from: classes13.dex */
public class LMSParameterSpec implements AlgorithmParameterSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LMSigParameters f91545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LMOtsParameters f91546b;

    public LMSParameterSpec(LMSigParameters lMSigParameters, LMOtsParameters lMOtsParameters) {
        this.f91545a = lMSigParameters;
        this.f91546b = lMOtsParameters;
    }

    public LMOtsParameters getOtsParams() {
        return this.f91546b;
    }

    public LMSigParameters getSigParams() {
        return this.f91545a;
    }
}
