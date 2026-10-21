package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class KDFDoublePipelineIterationParameters implements DerivationParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f89321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f89322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f89323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f89324d;

    public KDFDoublePipelineIterationParameters(byte[] bArr, byte[] bArr2, int i10, boolean z10) {
        if (bArr == null) {
            throw new IllegalArgumentException("A KDF requires Ki (a seed) as input");
        }
        this.f89321a = Arrays.clone(bArr);
        if (bArr2 == null) {
            this.f89324d = new byte[0];
        } else {
            this.f89324d = Arrays.clone(bArr2);
        }
        if (i10 != 8 && i10 != 16 && i10 != 24 && i10 != 32) {
            throw new IllegalArgumentException("Length of counter should be 8, 16, 24 or 32");
        }
        this.f89323c = i10;
        this.f89322b = z10;
    }

    public static KDFDoublePipelineIterationParameters createWithCounter(byte[] bArr, byte[] bArr2, int i10) {
        return new KDFDoublePipelineIterationParameters(bArr, bArr2, i10, true);
    }

    public static KDFDoublePipelineIterationParameters createWithoutCounter(byte[] bArr, byte[] bArr2) {
        return new KDFDoublePipelineIterationParameters(bArr, bArr2, 32, false);
    }

    public byte[] getFixedInputData() {
        return Arrays.clone(this.f89324d);
    }

    public byte[] getKI() {
        return this.f89321a;
    }

    public int getR() {
        return this.f89323c;
    }

    public boolean useCounter() {
        return this.f89322b;
    }
}
