package org.bouncycastle.math.ec.rfc7748;

import java.security.SecureRandom;
import org.bouncycastle.math.ec.rfc8032.Ed448;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
public abstract class X448 {
    public static final int POINT_SIZE = 56;
    public static final int SCALAR_SIZE = 56;

    public static class Friend {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Friend f90855a = new Friend();
    }

    public static boolean calculateAgreement(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, int i12) {
        scalarMult(bArr, i10, bArr2, i11, bArr3, i12);
        return !Arrays.areAllZeroes(bArr3, i12, 56);
    }

    public static void generatePrivateKey(SecureRandom secureRandom, byte[] bArr) {
        secureRandom.nextBytes(bArr);
        bArr[0] = (byte) (bArr[0] & 252);
        bArr[55] = (byte) (bArr[55] | 128);
    }

    public static void generatePublicKey(byte[] bArr, int i10, byte[] bArr2, int i11) {
        scalarMultBase(bArr, i10, bArr2, i11);
    }

    public static void precompute() {
        Ed448.precompute();
    }

    public static void scalarMult(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, int i12) {
        int[] iArr = new int[14];
        for (int i13 = 0; i13 < 14; i13++) {
            int i14 = (i13 * 4) + i10;
            iArr[i13] = (bArr[i14 + 3] << 24) | (bArr[i14] & 255) | ((bArr[i14 + 1] & 255) << 8) | ((bArr[i14 + 2] & 255) << 16);
        }
        iArr[0] = iArr[0] & (-4);
        iArr[13] = iArr[13] | Integer.MIN_VALUE;
        int[] iArrCreate = X448Field.create();
        X448Field.decode(bArr2, i11, iArrCreate);
        int[] iArrCreate2 = X448Field.create();
        X448Field.copy(iArrCreate, 0, iArrCreate2, 0);
        int[] iArrCreate3 = X448Field.create();
        iArrCreate3[0] = 1;
        int[] iArrCreate4 = X448Field.create();
        iArrCreate4[0] = 1;
        int[] iArrCreate5 = X448Field.create();
        int[] iArrCreate6 = X448Field.create();
        int[] iArrCreate7 = X448Field.create();
        int i15 = 447;
        int i16 = 1;
        while (true) {
            X448Field.add(iArrCreate4, iArrCreate5, iArrCreate6);
            X448Field.sub(iArrCreate4, iArrCreate5, iArrCreate4);
            X448Field.add(iArrCreate2, iArrCreate3, iArrCreate5);
            X448Field.sub(iArrCreate2, iArrCreate3, iArrCreate2);
            X448Field.mul(iArrCreate6, iArrCreate2, iArrCreate6);
            X448Field.mul(iArrCreate4, iArrCreate5, iArrCreate4);
            X448Field.sqr(iArrCreate5, iArrCreate5);
            X448Field.sqr(iArrCreate2, iArrCreate2);
            X448Field.sub(iArrCreate5, iArrCreate2, iArrCreate7);
            X448Field.mul(iArrCreate7, 39082, iArrCreate3);
            X448Field.add(iArrCreate3, iArrCreate2, iArrCreate3);
            X448Field.mul(iArrCreate3, iArrCreate7, iArrCreate3);
            X448Field.mul(iArrCreate2, iArrCreate5, iArrCreate2);
            X448Field.sub(iArrCreate6, iArrCreate4, iArrCreate5);
            X448Field.add(iArrCreate6, iArrCreate4, iArrCreate4);
            X448Field.sqr(iArrCreate4, iArrCreate4);
            X448Field.sqr(iArrCreate5, iArrCreate5);
            X448Field.mul(iArrCreate5, iArrCreate, iArrCreate5);
            i15--;
            int i17 = (iArr[i15 >>> 5] >>> (i15 & 31)) & 1;
            int i18 = i16 ^ i17;
            X448Field.cswap(i18, iArrCreate2, iArrCreate4);
            X448Field.cswap(i18, iArrCreate3, iArrCreate5);
            if (i15 < 2) {
                break;
            } else {
                i16 = i17;
            }
        }
        for (int i19 = 0; i19 < 2; i19++) {
            int[] iArrCreate8 = X448Field.create();
            int[] iArrCreate9 = X448Field.create();
            X448Field.add(iArrCreate2, iArrCreate3, iArrCreate8);
            X448Field.sub(iArrCreate2, iArrCreate3, iArrCreate9);
            X448Field.sqr(iArrCreate8, iArrCreate8);
            X448Field.sqr(iArrCreate9, iArrCreate9);
            X448Field.mul(iArrCreate8, iArrCreate9, iArrCreate2);
            X448Field.sub(iArrCreate8, iArrCreate9, iArrCreate8);
            X448Field.mul(iArrCreate8, 39082, iArrCreate3);
            X448Field.add(iArrCreate3, iArrCreate9, iArrCreate3);
            X448Field.mul(iArrCreate3, iArrCreate8, iArrCreate3);
        }
        X448Field.inv(iArrCreate3, iArrCreate3);
        X448Field.mul(iArrCreate2, iArrCreate3, iArrCreate2);
        X448Field.normalize(iArrCreate2);
        X448Field.encode(iArrCreate2, bArr3, i12);
    }

    public static void scalarMultBase(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int[] iArrCreate = X448Field.create();
        int[] iArrCreate2 = X448Field.create();
        Ed448.scalarMultBaseXY(Friend.f90855a, bArr, i10, iArrCreate, iArrCreate2);
        X448Field.inv(iArrCreate, iArrCreate);
        X448Field.mul(iArrCreate, iArrCreate2, iArrCreate);
        X448Field.sqr(iArrCreate, iArrCreate);
        X448Field.normalize(iArrCreate);
        X448Field.encode(iArrCreate, bArr2, i11);
    }
}
