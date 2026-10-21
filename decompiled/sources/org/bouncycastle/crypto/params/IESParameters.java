package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class IESParameters implements CipherParameters {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final byte[] f89312p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final byte[] f89313q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f89314r0;

    public IESParameters(byte[] bArr, byte[] bArr2, int i10) {
        this.f89312p0 = Arrays.clone(bArr);
        this.f89313q0 = Arrays.clone(bArr2);
        this.f89314r0 = i10;
    }

    public byte[] getDerivationV() {
        return Arrays.clone(this.f89312p0);
    }

    public byte[] getEncodingV() {
        return Arrays.clone(this.f89313q0);
    }

    public int getMacKeySize() {
        return this.f89314r0;
    }
}
