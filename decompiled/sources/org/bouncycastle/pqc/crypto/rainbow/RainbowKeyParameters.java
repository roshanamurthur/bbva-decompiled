package org.bouncycastle.pqc.crypto.rainbow;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* JADX INFO: loaded from: classes13.dex */
public class RainbowKeyParameters extends AsymmetricKeyParameter {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f91237q0;

    public RainbowKeyParameters(boolean z10, int i10) {
        super(z10);
        this.f91237q0 = i10;
    }

    public int getDocLength() {
        return this.f91237q0;
    }
}
