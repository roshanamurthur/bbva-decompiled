package org.bouncycastle.math.ec.rfc7748;

import java.security.SecureRandom;
import org.bouncycastle.math.ec.rfc8032.Ed25519;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
public abstract class X25519 {
    public static final int POINT_SIZE = 32;
    public static final int SCALAR_SIZE = 32;

    public static class Friend {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Friend f90853a = new Friend();
    }

    public static boolean calculateAgreement(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, int i12) {
        scalarMult(bArr, i10, bArr2, i11, bArr3, i12);
        return !Arrays.areAllZeroes(bArr3, i12, 32);
    }

    public static void generatePrivateKey(SecureRandom secureRandom, byte[] bArr) {
        secureRandom.nextBytes(bArr);
        bArr[0] = (byte) (bArr[0] & 248);
        byte b10 = (byte) (bArr[31] & 127);
        bArr[31] = b10;
        bArr[31] = (byte) (b10 | 64);
    }

    public static void generatePublicKey(byte[] bArr, int i10, byte[] bArr2, int i11) {
        scalarMultBase(bArr, i10, bArr2, i11);
    }

    public static void precompute() {
        Ed25519.precompute();
    }

    public static void scalarMult(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, int i12) {
        int[] iArr = new int[8];
        for (int i13 = 0; i13 < 8; i13++) {
            int i14 = (i13 * 4) + i10;
            iArr[i13] = (bArr[i14 + 3] << 24) | (bArr[i14] & 255) | ((bArr[i14 + 1] & 255) << 8) | ((bArr[i14 + 2] & 255) << 16);
        }
        iArr[0] = iArr[0] & (-8);
        int i15 = iArr[7] & Integer.MAX_VALUE;
        iArr[7] = i15;
        iArr[7] = i15 | 1073741824;
        int[] iArrCreate = X25519Field.create();
        X25519Field.decode(bArr2, i11, iArrCreate);
        int[] iArrCreate2 = X25519Field.create();
        X25519Field.copy(iArrCreate, 0, iArrCreate2, 0);
        int[] iArrCreate3 = X25519Field.create();
        iArrCreate3[0] = 1;
        int[] iArrCreate4 = X25519Field.create();
        iArrCreate4[0] = 1;
        int[] iArrCreate5 = X25519Field.create();
        int[] iArrCreate6 = X25519Field.create();
        int[] iArrCreate7 = X25519Field.create();
        int i16 = 254;
        int i17 = 1;
        while (true) {
            X25519Field.apm(iArrCreate4, iArrCreate5, iArrCreate6, iArrCreate4);
            X25519Field.apm(iArrCreate2, iArrCreate3, iArrCreate5, iArrCreate2);
            X25519Field.mul(iArrCreate6, iArrCreate2, iArrCreate6);
            X25519Field.mul(iArrCreate4, iArrCreate5, iArrCreate4);
            X25519Field.sqr(iArrCreate5, iArrCreate5);
            X25519Field.sqr(iArrCreate2, iArrCreate2);
            X25519Field.sub(iArrCreate5, iArrCreate2, iArrCreate7);
            X25519Field.mul(iArrCreate7, 121666, iArrCreate3);
            X25519Field.add(iArrCreate3, iArrCreate2, iArrCreate3);
            X25519Field.mul(iArrCreate3, iArrCreate7, iArrCreate3);
            X25519Field.mul(iArrCreate2, iArrCreate5, iArrCreate2);
            X25519Field.apm(iArrCreate6, iArrCreate4, iArrCreate4, iArrCreate5);
            X25519Field.sqr(iArrCreate4, iArrCreate4);
            X25519Field.sqr(iArrCreate5, iArrCreate5);
            X25519Field.mul(iArrCreate5, iArrCreate, iArrCreate5);
            i16--;
            int i18 = (iArr[i16 >>> 5] >>> (i16 & 31)) & 1;
            int i19 = i17 ^ i18;
            X25519Field.cswap(i19, iArrCreate2, iArrCreate4);
            X25519Field.cswap(i19, iArrCreate3, iArrCreate5);
            if (i16 < 3) {
                break;
            } else {
                i17 = i18;
            }
        }
        for (int i20 = 0; i20 < 3; i20++) {
            int[] iArrCreate8 = X25519Field.create();
            int[] iArrCreate9 = X25519Field.create();
            X25519Field.apm(iArrCreate2, iArrCreate3, iArrCreate8, iArrCreate9);
            X25519Field.sqr(iArrCreate8, iArrCreate8);
            X25519Field.sqr(iArrCreate9, iArrCreate9);
            X25519Field.mul(iArrCreate8, iArrCreate9, iArrCreate2);
            X25519Field.sub(iArrCreate8, iArrCreate9, iArrCreate8);
            X25519Field.mul(iArrCreate8, 121666, iArrCreate3);
            X25519Field.add(iArrCreate3, iArrCreate9, iArrCreate3);
            X25519Field.mul(iArrCreate3, iArrCreate8, iArrCreate3);
        }
        X25519Field.inv(iArrCreate3, iArrCreate3);
        X25519Field.mul(iArrCreate2, iArrCreate3, iArrCreate2);
        X25519Field.normalize(iArrCreate2);
        X25519Field.encode(iArrCreate2, bArr3, i12);
    }

    public static void scalarMultBase(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int[] iArrCreate = X25519Field.create();
        int[] iArrCreate2 = X25519Field.create();
        Ed25519.scalarMultBaseYZ(Friend.f90853a, bArr, i10, iArrCreate, iArrCreate2);
        X25519Field.apm(iArrCreate2, iArrCreate, iArrCreate, iArrCreate2);
        X25519Field.inv(iArrCreate2, iArrCreate2);
        X25519Field.mul(iArrCreate, iArrCreate2, iArrCreate);
        X25519Field.normalize(iArrCreate);
        X25519Field.encode(iArrCreate, bArr2, i11);
    }
}
