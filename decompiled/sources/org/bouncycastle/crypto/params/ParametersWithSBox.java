package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes5.dex */
public class ParametersWithSBox implements CipherParameters {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final CipherParameters f89353p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final byte[] f89354q0;

    public ParametersWithSBox(CipherParameters cipherParameters, byte[] bArr) {
        this.f89353p0 = cipherParameters;
        this.f89354q0 = bArr;
    }

    public CipherParameters getParameters() {
        return this.f89353p0;
    }

    public byte[] getSBox() {
        return this.f89354q0;
    }
}
