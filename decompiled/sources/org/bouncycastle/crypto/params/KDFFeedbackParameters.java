package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class KDFFeedbackParameters implements DerivationParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f89325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f89326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f89327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f89328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f89329e;

    public KDFFeedbackParameters(byte[] bArr, byte[] bArr2, byte[] bArr3, int i10, boolean z10) {
        if (bArr == null) {
            throw new IllegalArgumentException("A KDF requires Ki (a seed) as input");
        }
        this.f89325a = Arrays.clone(bArr);
        if (bArr3 == null) {
            this.f89329e = new byte[0];
        } else {
            this.f89329e = Arrays.clone(bArr3);
        }
        this.f89328d = i10;
        if (bArr2 == null) {
            this.f89326b = new byte[0];
        } else {
            this.f89326b = Arrays.clone(bArr2);
        }
        this.f89327c = z10;
    }

    public static KDFFeedbackParameters createWithCounter(byte[] bArr, byte[] bArr2, byte[] bArr3, int i10) {
        if (i10 == 8 || i10 == 16 || i10 == 24 || i10 == 32) {
            return new KDFFeedbackParameters(bArr, bArr2, bArr3, i10, true);
        }
        throw new IllegalArgumentException("Length of counter should be 8, 16, 24 or 32");
    }

    public static KDFFeedbackParameters createWithoutCounter(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return new KDFFeedbackParameters(bArr, bArr2, bArr3, -1, false);
    }

    public byte[] getFixedInputData() {
        return Arrays.clone(this.f89329e);
    }

    public byte[] getIV() {
        return this.f89326b;
    }

    public byte[] getKI() {
        return this.f89325a;
    }

    public int getR() {
        return this.f89328d;
    }

    public boolean useCounter() {
        return this.f89327c;
    }
}
