package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes5.dex */
public class ParametersWithID implements CipherParameters {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final CipherParameters f89347p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final byte[] f89348q0;

    public ParametersWithID(CipherParameters cipherParameters, byte[] bArr) {
        this.f89347p0 = cipherParameters;
        this.f89348q0 = bArr;
    }

    public byte[] getID() {
        return this.f89348q0;
    }

    public CipherParameters getParameters() {
        return this.f89347p0;
    }
}
