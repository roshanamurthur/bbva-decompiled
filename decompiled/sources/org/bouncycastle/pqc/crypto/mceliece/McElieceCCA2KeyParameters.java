package org.bouncycastle.pqc.crypto.mceliece;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* JADX INFO: loaded from: classes13.dex */
public class McElieceCCA2KeyParameters extends AsymmetricKeyParameter {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final String f91131q0;

    public McElieceCCA2KeyParameters(boolean z10, String str) {
        super(z10);
        this.f91131q0 = str;
    }

    public String getDigest() {
        return this.f91131q0;
    }
}
