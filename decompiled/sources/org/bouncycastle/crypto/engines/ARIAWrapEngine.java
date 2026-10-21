package org.bouncycastle.crypto.engines;

/* JADX INFO: loaded from: classes3.dex */
public class ARIAWrapEngine extends RFC3394WrapEngine {
    public ARIAWrapEngine() {
        super(new ARIAEngine());
    }

    public ARIAWrapEngine(boolean z10) {
        super(new ARIAEngine(), z10);
    }
}
