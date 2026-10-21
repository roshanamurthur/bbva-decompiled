package org.bouncycastle.jcajce.spec;

import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public class AEADParameterSpec extends IvParameterSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f90254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f90255b;

    public AEADParameterSpec(byte[] bArr, int i10) {
        this(bArr, i10, null);
    }

    public byte[] getAssociatedData() {
        return Arrays.clone(this.f90254a);
    }

    public int getMacSizeInBits() {
        return this.f90255b;
    }

    public byte[] getNonce() {
        return getIV();
    }

    public AEADParameterSpec(byte[] bArr, int i10, byte[] bArr2) {
        super(bArr);
        this.f90255b = i10;
        this.f90254a = Arrays.clone(bArr2);
    }
}
