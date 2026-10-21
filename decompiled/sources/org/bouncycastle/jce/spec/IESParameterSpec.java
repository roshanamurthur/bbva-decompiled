package org.bouncycastle.jce.spec;

import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public class IESParameterSpec implements AlgorithmParameterSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f90551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f90552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f90553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f90554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f90555e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f90556f;

    public IESParameterSpec(byte[] bArr, byte[] bArr2, int i10) {
        this(bArr, bArr2, i10, -1, null, false);
    }

    public int getCipherKeySize() {
        return this.f90554d;
    }

    public byte[] getDerivationV() {
        return Arrays.clone(this.f90551a);
    }

    public byte[] getEncodingV() {
        return Arrays.clone(this.f90552b);
    }

    public int getMacKeySize() {
        return this.f90553c;
    }

    public byte[] getNonce() {
        return Arrays.clone(this.f90555e);
    }

    public boolean getPointCompression() {
        return this.f90556f;
    }

    public void setPointCompression(boolean z10) {
        this.f90556f = z10;
    }

    public IESParameterSpec(byte[] bArr, byte[] bArr2, int i10, int i11, byte[] bArr3) {
        this(bArr, bArr2, i10, i11, bArr3, false);
    }

    public IESParameterSpec(byte[] bArr, byte[] bArr2, int i10, int i11, byte[] bArr3, boolean z10) {
        if (bArr != null) {
            byte[] bArr4 = new byte[bArr.length];
            this.f90551a = bArr4;
            System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
        } else {
            this.f90551a = null;
        }
        if (bArr2 != null) {
            byte[] bArr5 = new byte[bArr2.length];
            this.f90552b = bArr5;
            System.arraycopy(bArr2, 0, bArr5, 0, bArr2.length);
        } else {
            this.f90552b = null;
        }
        this.f90553c = i10;
        this.f90554d = i11;
        this.f90555e = Arrays.clone(bArr3);
        this.f90556f = z10;
    }
}
