package org.bouncycastle.pqc.crypto.lms;

/* JADX INFO: loaded from: classes13.dex */
public class LMSParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LMSigParameters f91101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LMOtsParameters f91102b;

    public LMSParameters(LMSigParameters lMSigParameters, LMOtsParameters lMOtsParameters) {
        this.f91101a = lMSigParameters;
        this.f91102b = lMOtsParameters;
    }

    public LMOtsParameters getLMOTSParam() {
        return this.f91102b;
    }

    public LMSigParameters getLMSigParam() {
        return this.f91101a;
    }
}
