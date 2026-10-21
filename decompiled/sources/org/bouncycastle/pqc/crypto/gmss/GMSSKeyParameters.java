package org.bouncycastle.pqc.crypto.gmss;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* JADX INFO: loaded from: classes13.dex */
public class GMSSKeyParameters extends AsymmetricKeyParameter {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final GMSSParameters f90977q0;

    public GMSSKeyParameters(boolean z10, GMSSParameters gMSSParameters) {
        super(z10);
        this.f90977q0 = gMSSParameters;
    }

    public GMSSParameters getParameters() {
        return this.f90977q0;
    }
}
