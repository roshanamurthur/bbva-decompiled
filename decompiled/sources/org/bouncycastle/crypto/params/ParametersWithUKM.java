package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes5.dex */
public class ParametersWithUKM implements CipherParameters {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final byte[] f89357p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final CipherParameters f89358q0;

    public ParametersWithUKM(CipherParameters cipherParameters, byte[] bArr) {
        this(cipherParameters, bArr, 0, bArr.length);
    }

    public CipherParameters getParameters() {
        return this.f89358q0;
    }

    public byte[] getUKM() {
        return this.f89357p0;
    }

    public ParametersWithUKM(CipherParameters cipherParameters, byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        this.f89357p0 = bArr2;
        this.f89358q0 = cipherParameters;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
    }
}
