package org.bouncycastle.math.ec.rfc8032;

import java.security.SecureRandom;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.math.ec.rfc7748.X25519;
import org.bouncycastle.math.ec.rfc7748.X25519Field;
import org.bouncycastle.math.raw.Interleave;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat256;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes13.dex */
public abstract class Ed25519 {
    public static final int PREHASH_SIZE = 64;
    public static final int PUBLIC_KEY_SIZE = 32;
    public static final int SECRET_KEY_SIZE = 32;
    public static final int SIGNATURE_SIZE = 64;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f90856a = Strings.toByteArray("SigEd25519 no Ed25519 collisions");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f90857b = {-19, -1, -1, -1, -1, -1, -1, Integer.MAX_VALUE};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f90858c = {1559614445, 1477600026, -1560830762, 350157278, 0, 0, 0, 268435456};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f90859d = {52811034, 25909283, 8072341, 50637101, 13785486, 30858332, 20483199, 20966410, 43936626, 4379245};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f90860e = {40265304, 26843545, 6710886, 53687091, 13421772, 40265318, 26843545, 6710886, 53687091, 13421772};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f90861f = {56195235, 47411844, 25868126, 40503822, 57364, 58321048, 30416477, 31930572, 57760639, 10749657};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f90862g = {45281625, 27714825, 18181821, 13898781, 114729, 49533232, 60832955, 30306712, 48412415, 4722099};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f90863h = {23454386, 55429651, 2809210, 27797563, 229458, 31957600, 54557047, 27058993, 29715967, 9444199};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Object f90864i = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static b[] f90865j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int[] f90866k = null;

    public static final class Algorithm {
        public static final int Ed25519 = 0;
        public static final int Ed25519ctx = 1;
        public static final int Ed25519ph = 2;
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f90867a = X25519Field.create();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f90868b = X25519Field.create();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f90869c = X25519Field.create();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int[] f90870d = X25519Field.create();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int[] f90871e = X25519Field.create();
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f90872a = X25519Field.create();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f90873b = X25519Field.create();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f90874c = X25519Field.create();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int[] f90875d = X25519Field.create();
    }

    public static boolean a(byte b10, byte[] bArr) {
        return (bArr == null && b10 == 0) || (bArr != null && bArr.length < 256);
    }

    public static int b(int i10, byte[] bArr) {
        return ((bArr[i10 + 2] & 255) << 16) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8);
    }

    public static int c(int i10, byte[] bArr) {
        return (bArr[i10 + 3] << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public static Digest createPrehash() {
        return new SHA512Digest();
    }

    public static void d(byte[] bArr, int[] iArr) {
        for (int i10 = 0; i10 < 8; i10++) {
            iArr[i10] = c(i10 * 4, bArr);
        }
    }

    public static void e(SHA512Digest sHA512Digest, byte b10, byte[] bArr) {
        if (bArr != null) {
            byte[] bArr2 = f90856a;
            sHA512Digest.update(bArr2, 0, bArr2.length);
            sHA512Digest.update(b10);
            sHA512Digest.update((byte) bArr.length);
            sHA512Digest.update(bArr, 0, bArr.length);
        }
    }

    public static void f(int i10, int i11, byte[] bArr) {
        bArr[i11] = (byte) i10;
        bArr[i11 + 1] = (byte) (i10 >>> 8);
        bArr[i11 + 2] = (byte) (i10 >>> 16);
        bArr[i11 + 3] = (byte) (i10 >>> 24);
    }

    public static void g(long j10, byte[] bArr, int i10) {
        f((int) j10, i10, bArr);
        int i11 = (int) (j10 >>> 32);
        bArr[i10 + 4] = (byte) i11;
        bArr[i10 + 5] = (byte) (i11 >>> 8);
        bArr[i10 + 6] = (byte) (i11 >>> 16);
    }

    public static void generatePrivateKey(SecureRandom secureRandom, byte[] bArr) {
        secureRandom.nextBytes(bArr);
    }

    public static void generatePublicKey(byte[] bArr, int i10, byte[] bArr2, int i11) {
        SHA512Digest sHA512Digest = new SHA512Digest();
        byte[] bArr3 = new byte[sHA512Digest.getDigestSize()];
        sHA512Digest.update(bArr, i10, 32);
        sHA512Digest.doFinal(bArr3, 0);
        byte[] bArr4 = new byte[32];
        s(0, bArr3, bArr4);
        v(i11, bArr4, bArr2);
    }

    public static int h(a aVar, byte[] bArr, int i10) {
        int[] iArrCreate = X25519Field.create();
        int[] iArrCreate2 = X25519Field.create();
        X25519Field.inv(aVar.f90869c, iArrCreate2);
        X25519Field.mul(aVar.f90867a, iArrCreate2, iArrCreate);
        X25519Field.mul(aVar.f90868b, iArrCreate2, iArrCreate2);
        X25519Field.normalize(iArrCreate);
        X25519Field.normalize(iArrCreate2);
        int[] iArrCreate3 = X25519Field.create();
        int[] iArrCreate4 = X25519Field.create();
        int[] iArrCreate5 = X25519Field.create();
        X25519Field.sqr(iArrCreate, iArrCreate4);
        X25519Field.sqr(iArrCreate2, iArrCreate5);
        X25519Field.mul(iArrCreate4, iArrCreate5, iArrCreate3);
        X25519Field.sub(iArrCreate5, iArrCreate4, iArrCreate5);
        X25519Field.mul(iArrCreate3, f90861f, iArrCreate3);
        X25519Field.addOne(iArrCreate3);
        X25519Field.sub(iArrCreate3, iArrCreate5, iArrCreate3);
        X25519Field.normalize(iArrCreate3);
        int iIsZero = X25519Field.isZero(iArrCreate3);
        X25519Field.encode(iArrCreate2, bArr, i10);
        int i11 = i10 + 31;
        bArr[i11] = (byte) (((iArrCreate[0] & 1) << 7) | bArr[i11]);
        return iIsZero;
    }

    public static byte[] i(int i10, int[] iArr) {
        int[] iArr2 = new int[16];
        int i11 = 0;
        int i12 = 8;
        int i13 = 16;
        int i14 = 0;
        while (true) {
            i12--;
            if (i12 < 0) {
                break;
            }
            int i15 = iArr[i12];
            iArr2[i13 - 1] = (i14 << 16) | (i15 >>> 16);
            i13 -= 2;
            iArr2[i13] = i15;
            i14 = i15;
        }
        byte[] bArr = new byte[253];
        int i16 = 1 << i10;
        int i17 = i16 - 1;
        int i18 = i16 >>> 1;
        int i19 = 0;
        int i20 = 0;
        while (i11 < 16) {
            int i21 = iArr2[i11];
            while (i19 < 16) {
                int i22 = i21 >>> i19;
                if ((i22 & 1) == i20) {
                    i19++;
                } else {
                    int i23 = (i22 & i17) + i20;
                    int i24 = i23 & i18;
                    int i25 = i23 - (i24 << 1);
                    i20 = i24 >>> (i10 - 1);
                    bArr[(i11 << 4) + i19] = (byte) i25;
                    i19 += i10;
                }
            }
            i11++;
            i19 -= 16;
        }
        return bArr;
    }

    public static void j(byte b10, int i10, int i11, int i12, int i13, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if (!a(b10, bArr2)) {
            throw new IllegalArgumentException("ctx");
        }
        SHA512Digest sHA512Digest = new SHA512Digest();
        byte[] bArr5 = new byte[sHA512Digest.getDigestSize()];
        sHA512Digest.update(bArr, i10, 32);
        sHA512Digest.doFinal(bArr5, 0);
        byte[] bArr6 = new byte[32];
        s(0, bArr5, bArr6);
        byte[] bArr7 = new byte[32];
        v(0, bArr6, bArr7);
        k(sHA512Digest, bArr5, bArr6, bArr7, 0, bArr2, b10, bArr3, i11, i12, bArr4, i13);
    }

    public static void k(SHA512Digest sHA512Digest, byte[] bArr, byte[] bArr2, byte[] bArr3, int i10, byte[] bArr4, byte b10, byte[] bArr5, int i11, int i12, byte[] bArr6, int i13) {
        e(sHA512Digest, b10, bArr4);
        sHA512Digest.update(bArr, 32, 32);
        sHA512Digest.update(bArr5, i11, i12);
        sHA512Digest.doFinal(bArr, 0);
        byte[] bArrT = t(bArr);
        byte[] bArr7 = new byte[32];
        v(0, bArrT, bArr7);
        e(sHA512Digest, b10, bArr4);
        sHA512Digest.update(bArr7, 0, 32);
        sHA512Digest.update(bArr3, i10, 32);
        sHA512Digest.update(bArr5, i11, i12);
        sHA512Digest.doFinal(bArr, 0);
        byte[] bArrT2 = t(bArr);
        int[] iArr = new int[16];
        d(bArrT, iArr);
        int[] iArr2 = new int[8];
        d(bArrT2, iArr2);
        int[] iArr3 = new int[8];
        d(bArr2, iArr3);
        Nat256.mulAddTo(iArr2, iArr3, iArr);
        byte[] bArr8 = new byte[64];
        for (int i14 = 0; i14 < 16; i14++) {
            f(iArr[i14], i14 * 4, bArr8);
        }
        byte[] bArrT3 = t(bArr8);
        System.arraycopy(bArr7, 0, bArr6, i13, 32);
        System.arraycopy(bArrT3, 0, bArr6, i13 + 32, 32);
    }

    public static void l(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, byte b10, byte[] bArr4, int i12, int i13, byte[] bArr5, int i14) {
        if (!a(b10, bArr3)) {
            throw new IllegalArgumentException("ctx");
        }
        SHA512Digest sHA512Digest = new SHA512Digest();
        byte[] bArr6 = new byte[sHA512Digest.getDigestSize()];
        sHA512Digest.update(bArr, i10, 32);
        sHA512Digest.doFinal(bArr6, 0);
        byte[] bArr7 = new byte[32];
        s(0, bArr6, bArr7);
        k(sHA512Digest, bArr6, bArr7, bArr2, i11, bArr3, b10, bArr4, i12, i13, bArr5, i14);
    }

    public static boolean m(byte b10, int i10, int i11, int i12, int i13, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if (!a(b10, bArr3)) {
            throw new IllegalArgumentException("ctx");
        }
        int i14 = i10 + 32;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i10, i14);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, i14, i10 + 64);
        int[] iArr = new int[8];
        int i15 = 0;
        for (int i16 = 0; i16 < 8; i16++) {
            iArr[i16] = c(i16 * 4, bArrCopyOfRange);
        }
        iArr[7] = iArr[7] & Integer.MAX_VALUE;
        int[] iArr2 = f90857b;
        if (!(!Nat256.gte(iArr, iArr2))) {
            return false;
        }
        int[] iArr3 = new int[8];
        d(bArrCopyOfRange2, iArr3);
        if (!(!Nat256.gte(iArr3, f90858c))) {
            return false;
        }
        int[] iArrCreate = X25519Field.create();
        int[] iArrCreate2 = X25519Field.create();
        byte[] bArrCopyOfRange3 = Arrays.copyOfRange(bArr2, i11, i11 + 32);
        int[] iArr4 = new int[8];
        for (int i17 = 8; i15 < i17; i17 = 8) {
            iArr4[i15] = c(i15 * 4, bArrCopyOfRange3);
            i15++;
        }
        iArr4[7] = iArr4[7] & Integer.MAX_VALUE;
        if (!(!Nat256.gte(iArr4, iArr2))) {
            return false;
        }
        byte b11 = bArrCopyOfRange3[31];
        int i18 = (b11 & 128) >>> 7;
        bArrCopyOfRange3[31] = (byte) (b11 & 127);
        X25519Field.decode(bArrCopyOfRange3, 0, iArrCreate2);
        int[] iArrCreate3 = X25519Field.create();
        int[] iArrCreate4 = X25519Field.create();
        X25519Field.sqr(iArrCreate2, iArrCreate3);
        X25519Field.mul(f90861f, iArrCreate3, iArrCreate4);
        X25519Field.subOne(iArrCreate3);
        X25519Field.addOne(iArrCreate4);
        if (!X25519Field.sqrtRatioVar(iArrCreate3, iArrCreate4, iArrCreate)) {
            return false;
        }
        X25519Field.normalize(iArrCreate);
        if (i18 == 1 && X25519Field.isZeroVar(iArrCreate)) {
            return false;
        }
        if (!(i18 != (iArrCreate[0] & 1))) {
            X25519Field.negate(iArrCreate, iArrCreate);
        }
        SHA512Digest sHA512Digest = new SHA512Digest();
        byte[] bArr5 = new byte[sHA512Digest.getDigestSize()];
        e(sHA512Digest, b10, bArr3);
        sHA512Digest.update(bArrCopyOfRange, 0, 32);
        sHA512Digest.update(bArr2, i11, 32);
        sHA512Digest.update(bArr4, i12, i13);
        sHA512Digest.doFinal(bArr5, 0);
        byte[] bArrT = t(bArr5);
        int[] iArr5 = new int[8];
        d(bArrCopyOfRange2, iArr5);
        int[] iArr6 = new int[8];
        d(bArrT, iArr6);
        a aVar = new a();
        precompute();
        byte[] bArrI = i(7, iArr5);
        byte[] bArrI2 = i(5, iArr6);
        b bVar = new b();
        X25519Field.copy(iArrCreate, 0, bVar.f90872a, 0);
        X25519Field.copy(iArrCreate2, 0, bVar.f90873b, 0);
        X25519Field.one(bVar.f90874c);
        X25519Field.mul(bVar.f90872a, bVar.f90873b, bVar.f90875d);
        b[] bVarArrR = r(bVar, 8);
        X25519Field.zero(aVar.f90867a);
        X25519Field.one(aVar.f90868b);
        X25519Field.one(aVar.f90869c);
        X25519Field.zero(aVar.f90870d);
        X25519Field.one(aVar.f90871e);
        int i19 = 252;
        while (true) {
            byte b12 = bArrI[i19];
            if (b12 != 0) {
                int i20 = b12 >> 31;
                n(i20 != 0, f90865j[(b12 ^ i20) >>> 1], aVar);
            }
            byte b13 = bArrI2[i19];
            if (b13 != 0) {
                int i21 = b13 >> 31;
                n(i21 != 0, bVarArrR[(b13 ^ i21) >>> 1], aVar);
            }
            i19--;
            if (i19 < 0) {
                break;
            }
            q(aVar);
        }
        byte[] bArr6 = new byte[32];
        return h(aVar, bArr6, 0) != 0 && Arrays.areEqual(bArr6, bArrCopyOfRange);
    }

    public static void n(boolean z10, b bVar, a aVar) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArrCreate = X25519Field.create();
        int[] iArrCreate2 = X25519Field.create();
        int[] iArrCreate3 = X25519Field.create();
        int[] iArrCreate4 = X25519Field.create();
        int[] iArr5 = aVar.f90870d;
        int[] iArrCreate5 = X25519Field.create();
        int[] iArrCreate6 = X25519Field.create();
        if (z10) {
            iArr2 = iArrCreate3;
            iArr = iArrCreate4;
            iArr4 = iArrCreate5;
            iArr3 = iArrCreate6;
        } else {
            iArr = iArrCreate3;
            iArr2 = iArrCreate4;
            iArr3 = iArrCreate5;
            iArr4 = iArrCreate6;
        }
        int[] iArr6 = aVar.f90868b;
        int[] iArr7 = aVar.f90867a;
        X25519Field.apm(iArr6, iArr7, iArrCreate2, iArrCreate);
        X25519Field.apm(bVar.f90873b, bVar.f90872a, iArr2, iArr);
        X25519Field.mul(iArrCreate, iArrCreate3, iArrCreate);
        X25519Field.mul(iArrCreate2, iArrCreate4, iArrCreate2);
        int[] iArr8 = aVar.f90870d;
        int[] iArr9 = aVar.f90871e;
        X25519Field.mul(iArr8, iArr9, iArrCreate3);
        X25519Field.mul(iArrCreate3, bVar.f90875d, iArrCreate3);
        X25519Field.mul(iArrCreate3, f90862g, iArrCreate3);
        int[] iArr10 = bVar.f90874c;
        int[] iArr11 = aVar.f90869c;
        X25519Field.mul(iArr11, iArr10, iArrCreate4);
        X25519Field.add(iArrCreate4, iArrCreate4, iArrCreate4);
        X25519Field.apm(iArrCreate2, iArrCreate, iArr9, iArr5);
        X25519Field.apm(iArrCreate4, iArrCreate3, iArr4, iArr3);
        X25519Field.carry(iArr4);
        X25519Field.mul(iArr5, iArrCreate5, iArr7);
        X25519Field.mul(iArrCreate6, iArr9, iArr6);
        X25519Field.mul(iArrCreate5, iArrCreate6, iArr11);
    }

    public static void o(boolean z10, b bVar, b bVar2, b bVar3) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArrCreate = X25519Field.create();
        int[] iArrCreate2 = X25519Field.create();
        int[] iArrCreate3 = X25519Field.create();
        int[] iArrCreate4 = X25519Field.create();
        int[] iArrCreate5 = X25519Field.create();
        int[] iArrCreate6 = X25519Field.create();
        int[] iArrCreate7 = X25519Field.create();
        int[] iArrCreate8 = X25519Field.create();
        if (z10) {
            iArr2 = iArrCreate3;
            iArr = iArrCreate4;
            iArr4 = iArrCreate6;
            iArr3 = iArrCreate7;
        } else {
            iArr = iArrCreate3;
            iArr2 = iArrCreate4;
            iArr3 = iArrCreate6;
            iArr4 = iArrCreate7;
        }
        X25519Field.apm(bVar.f90873b, bVar.f90872a, iArrCreate2, iArrCreate);
        X25519Field.apm(bVar2.f90873b, bVar2.f90872a, iArr2, iArr);
        X25519Field.mul(iArrCreate, iArrCreate3, iArrCreate);
        X25519Field.mul(iArrCreate2, iArrCreate4, iArrCreate2);
        X25519Field.mul(bVar.f90875d, bVar2.f90875d, iArrCreate3);
        X25519Field.mul(iArrCreate3, f90862g, iArrCreate3);
        X25519Field.mul(bVar.f90874c, bVar2.f90874c, iArrCreate4);
        X25519Field.add(iArrCreate4, iArrCreate4, iArrCreate4);
        X25519Field.apm(iArrCreate2, iArrCreate, iArrCreate8, iArrCreate5);
        X25519Field.apm(iArrCreate4, iArrCreate3, iArr4, iArr3);
        X25519Field.carry(iArr4);
        X25519Field.mul(iArrCreate5, iArrCreate6, bVar3.f90872a);
        X25519Field.mul(iArrCreate7, iArrCreate8, bVar3.f90873b);
        X25519Field.mul(iArrCreate6, iArrCreate7, bVar3.f90874c);
        X25519Field.mul(iArrCreate5, iArrCreate8, bVar3.f90875d);
    }

    public static b p(a aVar) {
        b bVar = new b();
        X25519Field.copy(aVar.f90867a, 0, bVar.f90872a, 0);
        X25519Field.copy(aVar.f90868b, 0, bVar.f90873b, 0);
        X25519Field.copy(aVar.f90869c, 0, bVar.f90874c, 0);
        X25519Field.mul(aVar.f90870d, aVar.f90871e, bVar.f90875d);
        return bVar;
    }

    public static void precompute() {
        synchronized (f90864i) {
            try {
                if (f90866k != null) {
                    return;
                }
                b bVar = new b();
                int[] iArr = f90859d;
                X25519Field.copy(iArr, 0, bVar.f90872a, 0);
                int[] iArr2 = f90860e;
                X25519Field.copy(iArr2, 0, bVar.f90873b, 0);
                X25519Field.one(bVar.f90874c);
                X25519Field.mul(bVar.f90872a, bVar.f90873b, bVar.f90875d);
                f90865j = r(bVar, 32);
                a aVar = new a();
                X25519Field.copy(iArr, 0, aVar.f90867a, 0);
                X25519Field.copy(iArr2, 0, aVar.f90868b, 0);
                X25519Field.one(aVar.f90869c);
                X25519Field.copy(aVar.f90867a, 0, aVar.f90870d, 0);
                X25519Field.copy(aVar.f90868b, 0, aVar.f90871e, 0);
                f90866k = X25519Field.createTable(192);
                int i10 = 0;
                for (int i11 = 0; i11 < 8; i11++) {
                    b[] bVarArr = new b[4];
                    b bVar2 = new b();
                    X25519Field.zero(bVar2.f90872a);
                    X25519Field.one(bVar2.f90873b);
                    X25519Field.one(bVar2.f90874c);
                    X25519Field.zero(bVar2.f90875d);
                    int i12 = 0;
                    while (true) {
                        if (i12 >= 4) {
                            break;
                        }
                        o(true, bVar2, p(aVar), bVar2);
                        q(aVar);
                        bVarArr[i12] = p(aVar);
                        if (i11 + i12 != 10) {
                            for (int i13 = 1; i13 < 8; i13++) {
                                q(aVar);
                            }
                        }
                        i12++;
                    }
                    b[] bVarArr2 = new b[8];
                    bVarArr2[0] = bVar2;
                    int i14 = 1;
                    for (int i15 = 0; i15 < 3; i15++) {
                        int i16 = 1 << i15;
                        int i17 = 0;
                        while (i17 < i16) {
                            b bVar3 = bVarArr2[i14 - i16];
                            b bVar4 = bVarArr[i15];
                            b bVar5 = new b();
                            bVarArr2[i14] = bVar5;
                            o(false, bVar3, bVar4, bVar5);
                            i17++;
                            i14++;
                        }
                    }
                    for (int i18 = 0; i18 < 8; i18++) {
                        b bVar6 = bVarArr2[i18];
                        int[] iArrCreate = X25519Field.create();
                        int[] iArrCreate2 = X25519Field.create();
                        int[] iArr3 = bVar6.f90874c;
                        X25519Field.add(iArr3, iArr3, iArrCreate);
                        X25519Field.inv(iArrCreate, iArrCreate2);
                        X25519Field.mul(bVar6.f90872a, iArrCreate2, iArrCreate);
                        X25519Field.mul(bVar6.f90873b, iArrCreate2, iArrCreate2);
                        int[] iArrCreate3 = X25519Field.create();
                        int[] iArrCreate4 = X25519Field.create();
                        int[] iArrCreate5 = X25519Field.create();
                        X25519Field.apm(iArrCreate2, iArrCreate, iArrCreate3, iArrCreate4);
                        X25519Field.mul(iArrCreate, iArrCreate2, iArrCreate5);
                        X25519Field.mul(iArrCreate5, f90863h, iArrCreate5);
                        X25519Field.normalize(iArrCreate3);
                        X25519Field.normalize(iArrCreate4);
                        X25519Field.copy(iArrCreate3, 0, f90866k, i10);
                        X25519Field.copy(iArrCreate4, 0, f90866k, i10 + 10);
                        X25519Field.copy(iArrCreate5, 0, f90866k, i10 + 20);
                        i10 += 30;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void q(a aVar) {
        int[] iArrCreate = X25519Field.create();
        int[] iArrCreate2 = X25519Field.create();
        int[] iArrCreate3 = X25519Field.create();
        int[] iArr = aVar.f90870d;
        int[] iArrCreate4 = X25519Field.create();
        int[] iArrCreate5 = X25519Field.create();
        int[] iArr2 = aVar.f90867a;
        X25519Field.sqr(iArr2, iArrCreate);
        int[] iArr3 = aVar.f90868b;
        X25519Field.sqr(iArr3, iArrCreate2);
        int[] iArr4 = aVar.f90869c;
        X25519Field.sqr(iArr4, iArrCreate3);
        X25519Field.add(iArrCreate3, iArrCreate3, iArrCreate3);
        int[] iArr5 = aVar.f90871e;
        X25519Field.apm(iArrCreate, iArrCreate2, iArr5, iArrCreate5);
        X25519Field.add(iArr2, iArr3, iArr);
        X25519Field.sqr(iArr, iArr);
        X25519Field.sub(iArr5, iArr, iArr);
        X25519Field.add(iArrCreate3, iArrCreate5, iArrCreate4);
        X25519Field.carry(iArrCreate4);
        X25519Field.mul(iArr, iArrCreate4, iArr2);
        X25519Field.mul(iArrCreate5, iArr5, iArr3);
        X25519Field.mul(iArrCreate4, iArrCreate5, iArr4);
    }

    public static b[] r(b bVar, int i10) {
        b bVar2 = new b();
        o(false, bVar, bVar, bVar2);
        b[] bVarArr = new b[i10];
        b bVar3 = new b();
        X25519Field.copy(bVar.f90872a, 0, bVar3.f90872a, 0);
        X25519Field.copy(bVar.f90873b, 0, bVar3.f90873b, 0);
        X25519Field.copy(bVar.f90874c, 0, bVar3.f90874c, 0);
        X25519Field.copy(bVar.f90875d, 0, bVar3.f90875d, 0);
        bVarArr[0] = bVar3;
        for (int i11 = 1; i11 < i10; i11++) {
            b bVar4 = bVarArr[i11 - 1];
            b bVar5 = new b();
            bVarArr[i11] = bVar5;
            o(false, bVar4, bVar2, bVar5);
        }
        return bVarArr;
    }

    public static void s(int i10, byte[] bArr, byte[] bArr2) {
        System.arraycopy(bArr, i10, bArr2, 0, 32);
        bArr2[0] = (byte) (bArr2[0] & 248);
        byte b10 = (byte) (bArr2[31] & 127);
        bArr2[31] = b10;
        bArr2[31] = (byte) (b10 | 64);
    }

    public static void scalarMultBaseYZ(X25519.Friend friend, byte[] bArr, int i10, int[] iArr, int[] iArr2) {
        if (friend == null) {
            throw new NullPointerException("This method is only for use by X25519");
        }
        byte[] bArr2 = new byte[32];
        s(i10, bArr, bArr2);
        a aVar = new a();
        u(bArr2, aVar);
        int[] iArrCreate = X25519Field.create();
        int[] iArrCreate2 = X25519Field.create();
        int[] iArrCreate3 = X25519Field.create();
        int[] iArrCreate4 = X25519Field.create();
        X25519Field.sqr(aVar.f90867a, iArrCreate2);
        int[] iArr3 = aVar.f90868b;
        X25519Field.sqr(iArr3, iArrCreate3);
        int[] iArr4 = aVar.f90869c;
        X25519Field.sqr(iArr4, iArrCreate4);
        X25519Field.mul(iArrCreate2, iArrCreate3, iArrCreate);
        X25519Field.sub(iArrCreate3, iArrCreate2, iArrCreate3);
        X25519Field.mul(iArrCreate3, iArrCreate4, iArrCreate3);
        X25519Field.sqr(iArrCreate4, iArrCreate4);
        X25519Field.mul(iArrCreate, f90861f, iArrCreate);
        X25519Field.add(iArrCreate, iArrCreate4, iArrCreate);
        X25519Field.sub(iArrCreate, iArrCreate3, iArrCreate);
        X25519Field.normalize(iArrCreate);
        if (X25519Field.isZero(iArrCreate) == 0) {
            throw new IllegalStateException();
        }
        X25519Field.copy(iArr3, 0, iArr, 0);
        X25519Field.copy(iArr4, 0, iArr2, 0);
    }

    public static void sign(byte[] bArr, int i10, byte[] bArr2, int i11, int i12, byte[] bArr3, int i13) {
        j((byte) 0, i10, i11, i12, i13, bArr, null, bArr2, bArr3);
    }

    public static void signPrehash(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, Digest digest, byte[] bArr4, int i12) {
        byte[] bArr5 = new byte[64];
        if (64 != digest.doFinal(bArr5, 0)) {
            throw new IllegalArgumentException("ph");
        }
        l(bArr, i10, bArr2, i11, bArr3, (byte) 1, bArr5, 0, 64, bArr4, i12);
    }

    public static byte[] t(byte[] bArr) {
        long jC = ((long) c(0, bArr)) & 4294967295L;
        long jB = ((long) (b(4, bArr) << 4)) & 4294967295L;
        long jC2 = ((long) c(7, bArr)) & 4294967295L;
        long jB2 = ((long) (b(11, bArr) << 4)) & 4294967295L;
        long jC3 = ((long) c(14, bArr)) & 4294967295L;
        long jB3 = ((long) (b(18, bArr) << 4)) & 4294967295L;
        long jC4 = ((long) c(21, bArr)) & 4294967295L;
        long jB4 = ((long) (b(25, bArr) << 4)) & 4294967295L;
        long jC5 = ((long) c(28, bArr)) & 4294967295L;
        long jB5 = ((long) (b(32, bArr) << 4)) & 4294967295L;
        long jC6 = ((long) c(35, bArr)) & 4294967295L;
        long jB6 = ((long) (b(39, bArr) << 4)) & 4294967295L;
        long jC7 = ((long) c(42, bArr)) & 4294967295L;
        long jB7 = ((long) (b(46, bArr) << 4)) & 4294967295L;
        long jC8 = c(49, bArr);
        long j10 = jC8 & 4294967295L;
        long jB8 = ((long) (b(53, bArr) << 4)) & 4294967295L;
        long jC9 = c(56, bArr);
        long j11 = jC9 & 4294967295L;
        long jB9 = ((long) (b(60, bArr) << 4)) & 4294967295L;
        long j12 = ((long) bArr[63]) & 255;
        long j13 = jB9 + (j11 >> 28);
        long j14 = jC9 & 268435455;
        long j15 = jC5 - (j13 * (-50998291));
        long j16 = (jB5 - (j12 * (-50998291))) - (j13 * 19280294);
        long j17 = (jC7 - (j12 * (-6428113))) - (j13 * 5343);
        long j18 = ((jB6 - (j12 * 127719000)) - (j13 * (-6428113))) - (j14 * 5343);
        long j19 = jB8 + (j10 >> 28);
        long j20 = jC8 & 268435455;
        long j21 = (((jC6 - (j12 * 19280294)) - (j13 * 127719000)) - (j14 * (-6428113))) - (j19 * 5343);
        long j22 = ((jB4 - (j14 * (-50998291))) - (j19 * 19280294)) - (j20 * 127719000);
        long j23 = ((j16 - (j14 * 127719000)) - (j19 * (-6428113))) - (j20 * 5343);
        long j24 = (jB7 - (j12 * 5343)) + (j17 >> 28);
        long j25 = (j17 & 268435455) + (j18 >> 28);
        long j26 = jB2 - (j25 * (-50998291));
        long j27 = (jC3 - (j24 * (-50998291))) - (j25 * 19280294);
        long j28 = ((jB3 - (j20 * (-50998291))) - (j24 * 19280294)) - (j25 * 127719000);
        long j29 = (((jC4 - (j19 * (-50998291))) - (j20 * 19280294)) - (j24 * 127719000)) - (j25 * (-6428113));
        long j30 = (j22 - (j24 * (-6428113))) - (j25 * 5343);
        long j31 = (j18 & 268435455) + (j21 >> 28);
        long j32 = j21 & 268435455;
        long j33 = jC2 - (j31 * (-50998291));
        long j34 = j26 - (j31 * 19280294);
        long j35 = j27 - (j31 * 127719000);
        long j36 = j28 - (j31 * (-6428113));
        long j37 = j29 - (j31 * 5343);
        long j38 = j32 + (j23 >> 28);
        long j39 = j23 & 268435455;
        long j40 = jB - (j38 * (-50998291));
        long j41 = j33 - (j38 * 19280294);
        long j42 = j34 - (j38 * 127719000);
        long j43 = j35 - (j38 * (-6428113));
        long j44 = j36 - (j38 * 5343);
        long j45 = ((((j15 - (j14 * 19280294)) - (j19 * 127719000)) - (j20 * (-6428113))) - (j24 * 5343)) + (j30 >> 28);
        long j46 = j45 & 268435455;
        long j47 = j46 >>> 27;
        long j48 = j39 + (j45 >> 28) + j47;
        long j49 = jC - (j48 * (-50998291));
        long j50 = (j40 - (j48 * 19280294)) + (j49 >> 28);
        long j51 = j49 & 268435455;
        long j52 = (j41 - (j48 * 127719000)) + (j50 >> 28);
        long j53 = (j42 - (j48 * (-6428113))) + (j52 >> 28);
        long j54 = (j43 - (j48 * 5343)) + (j53 >> 28);
        long j55 = j44 + (j54 >> 28);
        long j56 = j54 & 268435455;
        long j57 = j37 + (j55 >> 28);
        long j58 = (j30 & 268435455) + (j57 >> 28);
        long j59 = j46 + (j58 >> 28);
        long j60 = (j59 >> 28) - j47;
        long j61 = j51 + (j60 & (-50998291));
        long j62 = (j50 & 268435455) + (j60 & 19280294) + (j61 >> 28);
        long j63 = (j52 & 268435455) + (j60 & 127719000) + (j62 >> 28);
        long j64 = (j53 & 268435455) + (j60 & (-6428113)) + (j63 >> 28);
        long j65 = j56 + (j60 & 5343) + (j64 >> 28);
        long j66 = (j55 & 268435455) + (j65 >> 28);
        long j67 = (j57 & 268435455) + (j66 >> 28);
        long j68 = (j58 & 268435455) + (j67 >> 28);
        byte[] bArr2 = new byte[32];
        g((j61 & 268435455) | ((j62 & 268435455) << 28), bArr2, 0);
        g(((j64 & 268435455) << 28) | (j63 & 268435455), bArr2, 7);
        g((j65 & 268435455) | ((j66 & 268435455) << 28), bArr2, 14);
        g((j67 & 268435455) | ((j68 & 268435455) << 28), bArr2, 21);
        f((int) ((j59 & 268435455) + (j68 >> 28)), 28, bArr2);
        return bArr2;
    }

    public static void u(byte[] bArr, a aVar) {
        precompute();
        X25519Field.zero(aVar.f90867a);
        X25519Field.one(aVar.f90868b);
        X25519Field.one(aVar.f90869c);
        X25519Field.zero(aVar.f90870d);
        X25519Field.one(aVar.f90871e);
        int i10 = 8;
        int[] iArr = new int[8];
        d(bArr, iArr);
        int i11 = 0;
        int i12 = 1;
        Nat.cadd(8, (~iArr[0]) & 1, iArr, f90858c, iArr);
        Nat.shiftDownBit(8, iArr, 1);
        for (int i13 = 0; i13 < 8; i13++) {
            iArr[i13] = Interleave.shuffle2(iArr[i13]);
        }
        int[] iArrCreate = X25519Field.create();
        int[] iArrCreate2 = X25519Field.create();
        int[] iArrCreate3 = X25519Field.create();
        int i14 = 28;
        while (true) {
            int i15 = i11;
            while (i15 < i10) {
                int i16 = iArr[i15] >>> i14;
                int i17 = (i16 >>> 3) & i12;
                int i18 = (i16 ^ (-i17)) & 7;
                int i19 = i15 * 240;
                int i20 = i11;
                while (i20 < i10) {
                    int i21 = ((i20 ^ i18) - i12) >> 31;
                    X25519Field.cmov(i21, f90866k, i19, iArrCreate, i11);
                    X25519Field.cmov(i21, f90866k, i19 + 10, iArrCreate2, i11);
                    X25519Field.cmov(i21, f90866k, i19 + 20, iArrCreate3, i11);
                    i19 += 30;
                    i20++;
                    i10 = 8;
                }
                X25519Field.cswap(i17, iArrCreate, iArrCreate2);
                X25519Field.cnegate(i17, iArrCreate3);
                int[] iArrCreate4 = X25519Field.create();
                int[] iArrCreate5 = X25519Field.create();
                int[] iArrCreate6 = X25519Field.create();
                int[] iArrCreate7 = X25519Field.create();
                int[] iArrCreate8 = X25519Field.create();
                int[] iArr2 = aVar.f90868b;
                int[] iArr3 = aVar.f90867a;
                X25519Field.apm(iArr2, iArr3, iArrCreate5, iArrCreate4);
                X25519Field.mul(iArrCreate4, iArrCreate2, iArrCreate4);
                X25519Field.mul(iArrCreate5, iArrCreate, iArrCreate5);
                int[] iArr4 = aVar.f90870d;
                int[] iArr5 = aVar.f90871e;
                X25519Field.mul(iArr4, iArr5, iArrCreate6);
                X25519Field.mul(iArrCreate6, iArrCreate3, iArrCreate6);
                X25519Field.apm(iArrCreate5, iArrCreate4, iArr5, iArr4);
                int[] iArr6 = aVar.f90869c;
                X25519Field.apm(iArr6, iArrCreate6, iArrCreate8, iArrCreate7);
                X25519Field.carry(iArrCreate8);
                X25519Field.mul(iArr4, iArrCreate7, iArr3);
                X25519Field.mul(iArrCreate8, iArr5, iArr2);
                X25519Field.mul(iArrCreate7, iArrCreate8, iArr6);
                i15++;
                i10 = 8;
                i11 = 0;
                i12 = 1;
            }
            i14 -= 4;
            if (i14 < 0) {
                return;
            }
            q(aVar);
            i10 = 8;
            i11 = 0;
            i12 = 1;
        }
    }

    public static void v(int i10, byte[] bArr, byte[] bArr2) {
        a aVar = new a();
        u(bArr, aVar);
        if (h(aVar, bArr2, i10) == 0) {
            throw new IllegalStateException();
        }
    }

    public static boolean verify(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, int i12, int i13) {
        return m((byte) 0, i10, i11, i12, i13, bArr, bArr2, null, bArr3);
    }

    public static boolean verifyPrehash(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, Digest digest) {
        byte[] bArr4 = new byte[64];
        if (64 == digest.doFinal(bArr4, 0)) {
            return m((byte) 1, i10, i11, 0, 64, bArr, bArr2, bArr3, bArr4);
        }
        throw new IllegalArgumentException("ph");
    }

    public static void sign(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, int i12, int i13, byte[] bArr4, int i14) {
        l(bArr, i10, bArr2, i11, null, (byte) 0, bArr3, i12, i13, bArr4, i14);
    }

    public static void signPrehash(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, byte[] bArr4, int i12, byte[] bArr5, int i13) {
        l(bArr, i10, bArr2, i11, bArr3, (byte) 1, bArr4, i12, 64, bArr5, i13);
    }

    public static boolean verify(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, byte[] bArr4, int i12, int i13) {
        return m((byte) 0, i10, i11, i12, i13, bArr, bArr2, bArr3, bArr4);
    }

    public static boolean verifyPrehash(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, byte[] bArr4, int i12) {
        return m((byte) 1, i10, i11, i12, 64, bArr, bArr2, bArr3, bArr4);
    }

    public static void sign(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, byte[] bArr4, int i12, int i13, byte[] bArr5, int i14) {
        l(bArr, i10, bArr2, i11, bArr3, (byte) 0, bArr4, i12, i13, bArr5, i14);
    }

    public static void signPrehash(byte[] bArr, int i10, byte[] bArr2, Digest digest, byte[] bArr3, int i11) {
        byte[] bArr4 = new byte[64];
        if (64 != digest.doFinal(bArr4, 0)) {
            throw new IllegalArgumentException("ph");
        }
        j((byte) 1, i10, 0, 64, i11, bArr, bArr2, bArr4, bArr3);
    }

    public static void sign(byte[] bArr, int i10, byte[] bArr2, byte[] bArr3, int i11, int i12, byte[] bArr4, int i13) {
        j((byte) 0, i10, i11, i12, i13, bArr, bArr2, bArr3, bArr4);
    }

    public static void signPrehash(byte[] bArr, int i10, byte[] bArr2, byte[] bArr3, int i11, byte[] bArr4, int i12) {
        j((byte) 1, i10, i11, 64, i12, bArr, bArr2, bArr3, bArr4);
    }
}
