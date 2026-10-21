package org.bouncycastle.pqc.math.linearalgebra;

import androidx.camera.camera2.internal.compat.u;
import androidx.camera.core.processing.f;
import java.security.SecureRandom;
import mx.openpay.library.domain.util.Constant;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
public class Permutation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f91622a;

    public Permutation(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("invalid length");
        }
        this.f91622a = new int[i10];
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            this.f91622a[i11] = i11;
        }
    }

    public Permutation computeInverse() {
        int[] iArr = this.f91622a;
        Permutation permutation = new Permutation(iArr.length);
        for (int length = iArr.length - 1; length >= 0; length--) {
            permutation.f91622a[iArr[length]] = length;
        }
        return permutation;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Permutation) {
            return IntUtils.equals(this.f91622a, ((Permutation) obj).f91622a);
        }
        return false;
    }

    public byte[] getEncoded() {
        int[] iArr = this.f91622a;
        int length = iArr.length;
        int iCeilLog256 = IntegerFunctions.ceilLog256(length - 1);
        byte[] bArr = new byte[(length * iCeilLog256) + 4];
        LittleEndianConversions.I2OSP(length, bArr, 0);
        for (int i10 = 0; i10 < length; i10++) {
            LittleEndianConversions.I2OSP(iArr[i10], bArr, (i10 * iCeilLog256) + 4, iCeilLog256);
        }
        return bArr;
    }

    public int[] getVector() {
        return IntUtils.clone(this.f91622a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f91622a);
    }

    public Permutation rightMultiply(Permutation permutation) {
        int length = permutation.f91622a.length;
        int[] iArr = this.f91622a;
        if (length != iArr.length) {
            throw new IllegalArgumentException("length mismatch");
        }
        Permutation permutation2 = new Permutation(iArr.length);
        for (int length2 = iArr.length - 1; length2 >= 0; length2--) {
            permutation2.f91622a[length2] = iArr[permutation.f91622a[length2]];
        }
        return permutation2;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(Constant.BRACKET_OPEN);
        int[] iArr = this.f91622a;
        sb2.append(iArr[0]);
        String string = sb2.toString();
        for (int i10 = 1; i10 < iArr.length; i10++) {
            StringBuilder sbE = f.e(string, ", ");
            sbE.append(iArr[i10]);
            string = sbE.toString();
        }
        return u.f(string, Constant.BRACKET_CLOSE);
    }

    public Permutation(int i10, SecureRandom secureRandom) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("invalid length");
        }
        this.f91622a = new int[i10];
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i11] = i11;
        }
        int i12 = i10;
        for (int i13 = 0; i13 < i10; i13++) {
            int iA = RandUtils.a(i12, secureRandom);
            i12--;
            this.f91622a[i13] = iArr[iA];
            iArr[iA] = iArr[i12];
        }
    }

    public Permutation(byte[] bArr) {
        if (bArr.length <= 4) {
            throw new IllegalArgumentException("invalid encoding");
        }
        int iOS2IP = LittleEndianConversions.OS2IP(bArr, 0);
        int iCeilLog256 = IntegerFunctions.ceilLog256(iOS2IP - 1);
        if (bArr.length != (iOS2IP * iCeilLog256) + 4) {
            throw new IllegalArgumentException("invalid encoding");
        }
        this.f91622a = new int[iOS2IP];
        for (int i10 = 0; i10 < iOS2IP; i10++) {
            this.f91622a[i10] = LittleEndianConversions.OS2IP(bArr, (i10 * iCeilLog256) + 4, iCeilLog256);
        }
        int[] iArr = this.f91622a;
        int length = iArr.length;
        boolean[] zArr = new boolean[length];
        for (int i11 : iArr) {
            if (i11 < 0 || i11 >= length || zArr[i11]) {
                throw new IllegalArgumentException("invalid encoding");
            }
            zArr[i11] = true;
        }
    }

    public Permutation(int[] iArr) {
        int length = iArr.length;
        boolean[] zArr = new boolean[length];
        for (int i10 : iArr) {
            if (i10 < 0 || i10 >= length || zArr[i10]) {
                throw new IllegalArgumentException("array is not a permutation vector");
            }
            zArr[i10] = true;
        }
        this.f91622a = IntUtils.clone(iArr);
    }
}
