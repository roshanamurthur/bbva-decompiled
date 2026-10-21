package org.bouncycastle.math.ec.rfc8032;

import java.security.SecureRandom;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.bouncycastle.crypto.Xof;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.math.ec.rfc7748.X448;
import org.bouncycastle.math.ec.rfc7748.X448Field;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes13.dex */
public abstract class Ed448 {
    public static final int PREHASH_SIZE = 64;
    public static final int PUBLIC_KEY_SIZE = 57;
    public static final int SECRET_KEY_SIZE = 57;
    public static final int SIGNATURE_SIZE = 114;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f90876a = Strings.toByteArray("SigEd448");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f90877b = {-1, -1, -1, -1, -1, -1, -1, -2, -1, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f90878c = {-1420278541, 595116690, -1916432555, 560775794, -1361693040, -1001465015, 2093622249, -1, -1, -1, -1, -1, -1, LockFreeTaskQueueCore.MAX_CAPACITY_MASK};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f90879d = {118276190, 40534716, 9670182, 135141552, 85017403, 259173222, 68333082, 171784774, 174973732, 15824510, 73756743, 57518561, 94773951, 248652241, 107736333, 82941708};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f90880e = {36764180, 8885695, 130592152, 20104429, 163904957, 30304195, 121295871, 5901357, 125344798, 171541512, 175338348, 209069246, 3626697, 38307682, 24032956, 110359655};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f90881f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static a[] f90882g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int[] f90883h = null;

    public static final class Algorithm {
        public static final int Ed448 = 0;
        public static final int Ed448ph = 1;
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f90884a = X448Field.create();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f90885b = X448Field.create();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f90886c = X448Field.create();
    }

    public static int a(int i10, byte[] bArr) {
        return ((bArr[i10 + 2] & 255) << 16) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8);
    }

    public static int b(int i10, byte[] bArr) {
        return (bArr[i10 + 3] << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public static void c(byte[] bArr, int[] iArr) {
        for (int i10 = 0; i10 < 14; i10++) {
            iArr[i10] = b(i10 * 4, bArr);
        }
    }

    public static Xof createPrehash() {
        return new SHAKEDigest(256);
    }

    public static void d(SHAKEDigest sHAKEDigest, byte b10, byte[] bArr) {
        byte[] bArr2 = f90876a;
        sHAKEDigest.update(bArr2, 0, bArr2.length);
        sHAKEDigest.update(b10);
        sHAKEDigest.update((byte) bArr.length);
        sHAKEDigest.update(bArr, 0, bArr.length);
    }

    public static void e(int i10, int i11, byte[] bArr) {
        bArr[i11] = (byte) i10;
        bArr[i11 + 1] = (byte) (i10 >>> 8);
        bArr[i11 + 2] = (byte) (i10 >>> 16);
        bArr[i11 + 3] = (byte) (i10 >>> 24);
    }

    public static void f(long j10, byte[] bArr, int i10) {
        e((int) j10, i10, bArr);
        int i11 = (int) (j10 >>> 32);
        bArr[i10 + 4] = (byte) i11;
        bArr[i10 + 5] = (byte) (i11 >>> 8);
        bArr[i10 + 6] = (byte) (i11 >>> 16);
    }

    public static int g(a aVar, byte[] bArr, int i10) {
        int[] iArrCreate = X448Field.create();
        int[] iArrCreate2 = X448Field.create();
        X448Field.inv(aVar.f90886c, iArrCreate2);
        X448Field.mul(aVar.f90884a, iArrCreate2, iArrCreate);
        X448Field.mul(aVar.f90885b, iArrCreate2, iArrCreate2);
        X448Field.normalize(iArrCreate);
        X448Field.normalize(iArrCreate2);
        int[] iArrCreate3 = X448Field.create();
        int[] iArrCreate4 = X448Field.create();
        int[] iArrCreate5 = X448Field.create();
        X448Field.sqr(iArrCreate, iArrCreate4);
        X448Field.sqr(iArrCreate2, iArrCreate5);
        X448Field.mul(iArrCreate4, iArrCreate5, iArrCreate3);
        X448Field.add(iArrCreate4, iArrCreate5, iArrCreate4);
        X448Field.mul(iArrCreate3, 39081, iArrCreate3);
        X448Field.subOne(iArrCreate3);
        X448Field.add(iArrCreate3, iArrCreate4, iArrCreate3);
        X448Field.normalize(iArrCreate3);
        int iIsZero = X448Field.isZero(iArrCreate3);
        X448Field.encode(iArrCreate2, bArr, i10);
        bArr[i10 + 56] = (byte) ((iArrCreate[0] & 1) << 7);
        return iIsZero;
    }

    public static void generatePrivateKey(SecureRandom secureRandom, byte[] bArr) {
        secureRandom.nextBytes(bArr);
    }

    public static void generatePublicKey(byte[] bArr, int i10, byte[] bArr2, int i11) {
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        byte[] bArr3 = new byte[114];
        sHAKEDigest.update(bArr, i10, 57);
        sHAKEDigest.doFinal(bArr3, 0, 114);
        byte[] bArr4 = new byte[57];
        q(0, bArr3, bArr4);
        t(i11, bArr4, bArr2);
    }

    public static byte[] h(int i10, int[] iArr) {
        int[] iArr2 = new int[28];
        int i11 = 0;
        int i12 = 14;
        int i13 = 28;
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
        byte[] bArr = new byte[447];
        int i16 = 1 << i10;
        int i17 = i16 - 1;
        int i18 = i16 >>> 1;
        int i19 = 0;
        int i20 = 0;
        while (i11 < 28) {
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

    public static void i(byte b10, int i10, int i11, int i12, int i13, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if (bArr2 == null || bArr2.length >= 256) {
            throw new IllegalArgumentException("ctx");
        }
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        byte[] bArr5 = new byte[114];
        sHAKEDigest.update(bArr, i10, 57);
        sHAKEDigest.doFinal(bArr5, 0, 114);
        byte[] bArr6 = new byte[57];
        q(0, bArr5, bArr6);
        byte[] bArr7 = new byte[57];
        t(0, bArr6, bArr7);
        j(sHAKEDigest, bArr5, bArr6, bArr7, 0, bArr2, b10, bArr3, i11, i12, bArr4, i13);
    }

    public static void j(SHAKEDigest sHAKEDigest, byte[] bArr, byte[] bArr2, byte[] bArr3, int i10, byte[] bArr4, byte b10, byte[] bArr5, int i11, int i12, byte[] bArr6, int i13) {
        d(sHAKEDigest, b10, bArr4);
        sHAKEDigest.update(bArr, 57, 57);
        sHAKEDigest.update(bArr5, i11, i12);
        sHAKEDigest.doFinal(bArr, 0, bArr.length);
        byte[] bArrR = r(bArr);
        byte[] bArr7 = new byte[57];
        t(0, bArrR, bArr7);
        d(sHAKEDigest, b10, bArr4);
        sHAKEDigest.update(bArr7, 0, 57);
        sHAKEDigest.update(bArr3, i10, 57);
        sHAKEDigest.update(bArr5, i11, i12);
        sHAKEDigest.doFinal(bArr, 0, bArr.length);
        byte[] bArrR2 = r(bArr);
        int[] iArr = new int[28];
        c(bArrR, iArr);
        int[] iArr2 = new int[14];
        c(bArrR2, iArr2);
        int[] iArr3 = new int[14];
        c(bArr2, iArr3);
        Nat.mulAddTo(14, iArr2, iArr3, iArr);
        byte[] bArr8 = new byte[114];
        for (int i14 = 0; i14 < 28; i14++) {
            e(iArr[i14], i14 * 4, bArr8);
        }
        byte[] bArrR3 = r(bArr8);
        System.arraycopy(bArr7, 0, bArr6, i13, 57);
        System.arraycopy(bArrR3, 0, bArr6, i13 + 57, 57);
    }

    public static void k(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, byte b10, byte[] bArr4, int i12, int i13, byte[] bArr5, int i14) {
        if (bArr3 == null || bArr3.length >= 256) {
            throw new IllegalArgumentException("ctx");
        }
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        byte[] bArr6 = new byte[114];
        sHAKEDigest.update(bArr, i10, 57);
        sHAKEDigest.doFinal(bArr6, 0, 114);
        byte[] bArr7 = new byte[57];
        q(0, bArr6, bArr7);
        j(sHAKEDigest, bArr6, bArr7, bArr2, i11, bArr3, b10, bArr4, i12, i13, bArr5, i14);
    }

    public static boolean l(byte b10, int i10, int i11, int i12, int i13, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        boolean z10;
        if (bArr3 == null || bArr3.length >= 256) {
            throw new IllegalArgumentException("ctx");
        }
        int i14 = i10 + 57;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i10, i14);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, i14, i10 + 114);
        int i15 = bArrCopyOfRange[56] & 127;
        int[] iArr = f90877b;
        if (i15 != 0) {
            z10 = false;
        } else {
            int[] iArr2 = new int[14];
            for (int i16 = 0; i16 < 14; i16++) {
                iArr2[i16] = b(i16 * 4, bArrCopyOfRange);
            }
            z10 = !Nat.gte(14, iArr2, iArr);
        }
        if (z10 && bArrCopyOfRange2[56] == 0) {
            int[] iArr3 = new int[14];
            c(bArrCopyOfRange2, iArr3);
            if (!Nat.gte(14, iArr3, f90878c)) {
                a aVar = new a();
                byte[] bArrCopyOfRange3 = Arrays.copyOfRange(bArr2, i11, i11 + 57);
                if ((bArrCopyOfRange3[56] & 127) == 0) {
                    int[] iArr4 = new int[14];
                    for (int i17 = 0; i17 < 14; i17++) {
                        iArr4[i17] = b(i17 * 4, bArrCopyOfRange3);
                    }
                    if (!Nat.gte(14, iArr4, iArr)) {
                        byte b11 = bArrCopyOfRange3[56];
                        int i18 = (b11 & 128) >>> 7;
                        bArrCopyOfRange3[56] = (byte) (b11 & 127);
                        int[] iArr5 = aVar.f90885b;
                        X448Field.decode(bArrCopyOfRange3, 0, iArr5);
                        int[] iArrCreate = X448Field.create();
                        int[] iArrCreate2 = X448Field.create();
                        X448Field.sqr(iArr5, iArrCreate);
                        X448Field.mul(iArrCreate, 39081, iArrCreate2);
                        X448Field.negate(iArrCreate, iArrCreate);
                        X448Field.addOne(iArrCreate);
                        X448Field.addOne(iArrCreate2);
                        int[] iArr6 = aVar.f90884a;
                        if (X448Field.sqrtRatioVar(iArrCreate, iArrCreate2, iArr6)) {
                            X448Field.normalize(iArr6);
                            if (i18 != 1 || !X448Field.isZeroVar(iArr6)) {
                                if (!(i18 != (iArr6[0] & 1))) {
                                    X448Field.negate(iArr6, iArr6);
                                }
                                X448Field.one(aVar.f90886c);
                                SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
                                byte[] bArr5 = new byte[114];
                                d(sHAKEDigest, b10, bArr3);
                                sHAKEDigest.update(bArrCopyOfRange, 0, 57);
                                sHAKEDigest.update(bArr2, i11, 57);
                                sHAKEDigest.update(bArr4, i12, i13);
                                sHAKEDigest.doFinal(bArr5, 0, 114);
                                byte[] bArrR = r(bArr5);
                                int[] iArr7 = new int[14];
                                c(bArrCopyOfRange2, iArr7);
                                int[] iArr8 = new int[14];
                                c(bArrR, iArr8);
                                a aVar2 = new a();
                                precompute();
                                byte[] bArrH = h(7, iArr7);
                                byte[] bArrH2 = h(5, iArr8);
                                a[] aVarArrP = p(aVar, 8);
                                X448Field.zero(aVar2.f90884a);
                                X448Field.one(aVar2.f90885b);
                                X448Field.one(aVar2.f90886c);
                                int i19 = 446;
                                while (true) {
                                    byte b12 = bArrH[i19];
                                    if (b12 != 0) {
                                        int i20 = b12 >> 31;
                                        m(i20 != 0, f90882g[(b12 ^ i20) >>> 1], aVar2);
                                    }
                                    byte b13 = bArrH2[i19];
                                    if (b13 != 0) {
                                        int i21 = b13 >> 31;
                                        m(i21 != 0, aVarArrP[(b13 ^ i21) >>> 1], aVar2);
                                    }
                                    i19--;
                                    if (i19 < 0) {
                                        break;
                                    }
                                    o(aVar2);
                                }
                                byte[] bArr6 = new byte[57];
                                return g(aVar2, bArr6, 0) != 0 && Arrays.areEqual(bArr6, bArrCopyOfRange);
                            }
                        }
                    }
                }
                return false;
            }
        }
        return false;
    }

    public static void m(boolean z10, a aVar, a aVar2) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArrCreate = X448Field.create();
        int[] iArrCreate2 = X448Field.create();
        int[] iArrCreate3 = X448Field.create();
        int[] iArrCreate4 = X448Field.create();
        int[] iArrCreate5 = X448Field.create();
        int[] iArrCreate6 = X448Field.create();
        int[] iArrCreate7 = X448Field.create();
        int[] iArrCreate8 = X448Field.create();
        if (z10) {
            X448Field.sub(aVar.f90885b, aVar.f90884a, iArrCreate8);
            iArr2 = iArrCreate2;
            iArr = iArrCreate5;
            iArr4 = iArrCreate6;
            iArr3 = iArrCreate7;
        } else {
            X448Field.add(aVar.f90885b, aVar.f90884a, iArrCreate8);
            iArr = iArrCreate2;
            iArr2 = iArrCreate5;
            iArr3 = iArrCreate6;
            iArr4 = iArrCreate7;
        }
        X448Field.mul(aVar.f90886c, aVar2.f90886c, iArrCreate);
        X448Field.sqr(iArrCreate, iArrCreate2);
        int[] iArr5 = aVar.f90884a;
        int[] iArr6 = aVar2.f90884a;
        X448Field.mul(iArr5, iArr6, iArrCreate3);
        int[] iArr7 = aVar.f90885b;
        int[] iArr8 = aVar2.f90885b;
        X448Field.mul(iArr7, iArr8, iArrCreate4);
        X448Field.mul(iArrCreate3, iArrCreate4, iArrCreate5);
        X448Field.mul(iArrCreate5, 39081, iArrCreate5);
        X448Field.add(iArrCreate2, iArrCreate5, iArr3);
        X448Field.sub(iArrCreate2, iArrCreate5, iArr4);
        X448Field.add(iArr6, iArr8, iArrCreate5);
        X448Field.mul(iArrCreate8, iArrCreate5, iArrCreate8);
        X448Field.add(iArrCreate4, iArrCreate3, iArr);
        X448Field.sub(iArrCreate4, iArrCreate3, iArr2);
        X448Field.carry(iArr);
        X448Field.sub(iArrCreate8, iArrCreate2, iArrCreate8);
        X448Field.mul(iArrCreate8, iArrCreate, iArrCreate8);
        X448Field.mul(iArrCreate5, iArrCreate, iArrCreate5);
        X448Field.mul(iArrCreate6, iArrCreate8, iArr6);
        X448Field.mul(iArrCreate5, iArrCreate7, iArr8);
        X448Field.mul(iArrCreate6, iArrCreate7, aVar2.f90886c);
    }

    public static a n(a aVar) {
        a aVar2 = new a();
        X448Field.copy(aVar.f90884a, 0, aVar2.f90884a, 0);
        X448Field.copy(aVar.f90885b, 0, aVar2.f90885b, 0);
        X448Field.copy(aVar.f90886c, 0, aVar2.f90886c, 0);
        return aVar2;
    }

    public static void o(a aVar) {
        int[] iArrCreate = X448Field.create();
        int[] iArrCreate2 = X448Field.create();
        int[] iArrCreate3 = X448Field.create();
        int[] iArrCreate4 = X448Field.create();
        int[] iArrCreate5 = X448Field.create();
        int[] iArrCreate6 = X448Field.create();
        int[] iArr = aVar.f90884a;
        int[] iArr2 = aVar.f90885b;
        X448Field.add(iArr, iArr2, iArrCreate);
        X448Field.sqr(iArrCreate, iArrCreate);
        int[] iArr3 = aVar.f90884a;
        X448Field.sqr(iArr3, iArrCreate2);
        X448Field.sqr(iArr2, iArrCreate3);
        X448Field.add(iArrCreate2, iArrCreate3, iArrCreate4);
        X448Field.carry(iArrCreate4);
        int[] iArr4 = aVar.f90886c;
        X448Field.sqr(iArr4, iArrCreate5);
        X448Field.add(iArrCreate5, iArrCreate5, iArrCreate5);
        X448Field.carry(iArrCreate5);
        X448Field.sub(iArrCreate4, iArrCreate5, iArrCreate6);
        X448Field.sub(iArrCreate, iArrCreate4, iArrCreate);
        X448Field.sub(iArrCreate2, iArrCreate3, iArrCreate2);
        X448Field.mul(iArrCreate, iArrCreate6, iArr3);
        X448Field.mul(iArrCreate4, iArrCreate2, iArr2);
        X448Field.mul(iArrCreate4, iArrCreate6, iArr4);
    }

    public static a[] p(a aVar, int i10) {
        a aVarN = n(aVar);
        o(aVarN);
        a[] aVarArr = new a[i10];
        aVarArr[0] = n(aVar);
        for (int i11 = 1; i11 < i10; i11++) {
            a aVarN2 = n(aVarArr[i11 - 1]);
            aVarArr[i11] = aVarN2;
            m(false, aVarN, aVarN2);
        }
        return aVarArr;
    }

    public static void precompute() {
        synchronized (f90881f) {
            try {
                if (f90883h != null) {
                    return;
                }
                a aVar = new a();
                X448Field.copy(f90879d, 0, aVar.f90884a, 0);
                X448Field.copy(f90880e, 0, aVar.f90885b, 0);
                X448Field.one(aVar.f90886c);
                f90882g = p(aVar, 32);
                f90883h = X448Field.createTable(160);
                int i10 = 0;
                for (int i11 = 0; i11 < 5; i11++) {
                    a[] aVarArr = new a[5];
                    a aVar2 = new a();
                    X448Field.zero(aVar2.f90884a);
                    X448Field.one(aVar2.f90885b);
                    X448Field.one(aVar2.f90886c);
                    int i12 = 0;
                    while (true) {
                        if (i12 >= 5) {
                            break;
                        }
                        m(true, aVar, aVar2);
                        o(aVar);
                        aVarArr[i12] = n(aVar);
                        if (i11 + i12 != 8) {
                            for (int i13 = 1; i13 < 18; i13++) {
                                o(aVar);
                            }
                        }
                        i12++;
                    }
                    a[] aVarArr2 = new a[16];
                    aVarArr2[0] = aVar2;
                    int i14 = 1;
                    for (int i15 = 0; i15 < 4; i15++) {
                        int i16 = 1 << i15;
                        int i17 = 0;
                        while (i17 < i16) {
                            a aVarN = n(aVarArr2[i14 - i16]);
                            aVarArr2[i14] = aVarN;
                            m(false, aVarArr[i15], aVarN);
                            i17++;
                            i14++;
                        }
                    }
                    for (int i18 = 0; i18 < 16; i18++) {
                        a aVar3 = aVarArr2[i18];
                        int[] iArr = aVar3.f90886c;
                        X448Field.inv(iArr, iArr);
                        int[] iArr2 = aVar3.f90884a;
                        X448Field.mul(iArr2, aVar3.f90886c, iArr2);
                        int[] iArr3 = aVar3.f90885b;
                        X448Field.mul(iArr3, aVar3.f90886c, iArr3);
                        X448Field.copy(aVar3.f90884a, 0, f90883h, i10);
                        X448Field.copy(aVar3.f90885b, 0, f90883h, i10 + 16);
                        i10 += 32;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void q(int i10, byte[] bArr, byte[] bArr2) {
        System.arraycopy(bArr, i10, bArr2, 0, 56);
        bArr2[0] = (byte) (bArr2[0] & 252);
        bArr2[55] = (byte) (bArr2[55] | 128);
        bArr2[56] = 0;
    }

    public static byte[] r(byte[] bArr) {
        long jB = ((long) b(0, bArr)) & 4294967295L;
        long jA = ((long) (a(4, bArr) << 4)) & 4294967295L;
        long jB2 = ((long) b(7, bArr)) & 4294967295L;
        long jA2 = ((long) (a(11, bArr) << 4)) & 4294967295L;
        long jB3 = ((long) b(14, bArr)) & 4294967295L;
        long jA3 = ((long) (a(18, bArr) << 4)) & 4294967295L;
        long jB4 = ((long) b(21, bArr)) & 4294967295L;
        long jA4 = ((long) (a(25, bArr) << 4)) & 4294967295L;
        long jB5 = ((long) b(28, bArr)) & 4294967295L;
        long jA5 = ((long) (a(32, bArr) << 4)) & 4294967295L;
        long jB6 = ((long) b(35, bArr)) & 4294967295L;
        long jA6 = ((long) (a(39, bArr) << 4)) & 4294967295L;
        long jB7 = ((long) b(42, bArr)) & 4294967295L;
        long jA7 = ((long) (a(46, bArr) << 4)) & 4294967295L;
        long jB8 = ((long) b(49, bArr)) & 4294967295L;
        long jA8 = ((long) (a(53, bArr) << 4)) & 4294967295L;
        long jB9 = ((long) b(56, bArr)) & 4294967295L;
        long jA9 = ((long) (a(60, bArr) << 4)) & 4294967295L;
        long jB10 = ((long) b(63, bArr)) & 4294967295L;
        long jA10 = ((long) (a(67, bArr) << 4)) & 4294967295L;
        long jB11 = ((long) b(70, bArr)) & 4294967295L;
        long jA11 = ((long) (a(74, bArr) << 4)) & 4294967295L;
        long jB12 = ((long) b(77, bArr)) & 4294967295L;
        long jA12 = ((long) (a(81, bArr) << 4)) & 4294967295L;
        long jB13 = b(84, bArr);
        long j10 = jB13 & 4294967295L;
        long jA13 = ((long) (a(88, bArr) << 4)) & 4294967295L;
        long jB14 = b(91, bArr);
        long j11 = jB14 & 4294967295L;
        long jA14 = ((long) (a(95, bArr) << 4)) & 4294967295L;
        long jB15 = b(98, bArr);
        long j12 = jB15 & 4294967295L;
        long jA15 = ((long) (a(102, bArr) << 4)) & 4294967295L;
        long jB16 = b(105, bArr);
        long j13 = jB16 & 4294967295L;
        long jA16 = ((long) (a(109, bArr) << 4)) & 4294967295L;
        long j14 = ((long) (((bArr[113] & 255) << 8) | (bArr[112] & 255))) & 4294967295L;
        long j15 = jA16 + (j13 >>> 28);
        long j16 = jB16 & 268435455;
        long j17 = (j16 * 163752818) + (j15 * 30366549) + (j14 * 43969588) + jB9;
        long j18 = (j16 * 258169998) + (j15 * 163752818) + (j14 * 30366549) + jA9;
        long j19 = (j16 * 96434764) + (j15 * 258169998) + (j14 * 163752818) + jB10;
        long j20 = (j16 * 227822194) + (j15 * 96434764) + (j14 * 258169998) + jA10;
        long j21 = (j16 * 149865618) + (j15 * 227822194) + (j14 * 96434764) + jB11;
        long j22 = jA15 + (j12 >>> 28);
        long j23 = jB15 & 268435455;
        long j24 = (j22 * 43969588) + jA7;
        long j25 = (j22 * 30366549) + (j16 * 43969588) + jB8;
        long j26 = (j22 * 163752818) + (j16 * 30366549) + (j15 * 43969588) + jA8;
        long j27 = (j22 * 258169998) + j17;
        long j28 = (j22 * 96434764) + j18;
        long j29 = (j22 * 227822194) + j19;
        long j30 = (j22 * 149865618) + j20;
        long j31 = (j22 * 550336261) + j21;
        long j32 = (j23 * 43969588) + jB7;
        long j33 = (j23 * 30366549) + j24;
        long j34 = (j23 * 163752818) + j25;
        long j35 = (j23 * 258169998) + j26;
        long j36 = (j23 * 96434764) + j27;
        long j37 = (j23 * 227822194) + j28;
        long j38 = (j23 * 149865618) + j29;
        long j39 = (j23 * 550336261) + j30;
        long j40 = jA14 + (j11 >>> 28);
        long j41 = jB14 & 268435455;
        long j42 = (j40 * 163752818) + j33;
        long j43 = (j40 * 258169998) + j34;
        long j44 = (j40 * 149865618) + j37;
        long j45 = (j41 * 43969588) + jB6;
        long j46 = (j41 * 30366549) + (j40 * 43969588) + jA6;
        long j47 = (j41 * 163752818) + (j40 * 30366549) + j32;
        long j48 = (j41 * 258169998) + j42;
        long j49 = (j41 * 96434764) + j43;
        long j50 = (j41 * 227822194) + (j40 * 96434764) + j35;
        long j51 = (j41 * 149865618) + (j40 * 227822194) + j36;
        long j52 = (j41 * 550336261) + j44;
        long j53 = jA13 + (j10 >>> 28);
        long j54 = (j53 * 30366549) + j45;
        long j55 = (j53 * 163752818) + j46;
        long j56 = (j53 * 258169998) + j47;
        long j57 = (j53 * 149865618) + j50;
        long j58 = (j16 * 550336261) + (j15 * 149865618) + (j14 * 227822194) + jA11 + (j31 >>> 28);
        long j59 = j31 & 268435455;
        long j60 = (j15 * 550336261) + (j14 * 149865618) + jB12 + (j58 >>> 28);
        long j61 = (j14 * 550336261) + jA12 + (j60 >>> 28);
        long j62 = j60 & 268435455;
        long j63 = (jB13 & 268435455) + (j61 >>> 28);
        long j64 = j61 & 268435455;
        long j65 = (j63 * 43969588) + jB5;
        long j66 = (j63 * 30366549) + (j53 * 43969588) + jA5;
        long j67 = (j63 * 163752818) + j54;
        long j68 = (j63 * 258169998) + j55;
        long j69 = (j63 * 96434764) + j56;
        long j70 = (j63 * 227822194) + (j53 * 96434764) + j48;
        long j71 = (j63 * 149865618) + (j53 * 227822194) + j49;
        long j72 = (j63 * 550336261) + j57;
        long j73 = (j64 * 43969588) + jA4;
        long j74 = (j64 * 30366549) + j65;
        long j75 = (j64 * 163752818) + j66;
        long j76 = (j64 * 258169998) + j67;
        long j77 = (j64 * 96434764) + j68;
        long j78 = (j64 * 227822194) + j69;
        long j79 = (j64 * 149865618) + j70;
        long j80 = (j64 * 550336261) + j71;
        long j81 = (j62 * 43969588) + jB4;
        long j82 = (j62 * 30366549) + j73;
        long j83 = (j62 * 163752818) + j74;
        long j84 = (j62 * 258169998) + j75;
        long j85 = (j62 * 96434764) + j76;
        long j86 = (j62 * 227822194) + j77;
        long j87 = (j62 * 149865618) + j78;
        long j88 = (j62 * 550336261) + j79;
        long j89 = (j40 * 550336261) + j38 + (j52 >>> 28);
        long j90 = j52 & 268435455;
        long j91 = j39 + (j89 >>> 28);
        long j92 = j89 & 268435455;
        long j93 = j59 + (j91 >>> 28);
        long j94 = j91 & 268435455;
        long j95 = (j58 & 268435455) + (j93 >>> 28);
        long j96 = j93 & 268435455;
        long j97 = (j95 * 43969588) + jA3;
        long j98 = (j95 * 30366549) + j81;
        long j99 = (j95 * 163752818) + j82;
        long j100 = (j95 * 258169998) + j83;
        long j101 = (j95 * 96434764) + j84;
        long j102 = (j95 * 227822194) + j85;
        long j103 = (j95 * 149865618) + j86;
        long j104 = (j95 * 550336261) + j87;
        long j105 = (j96 * 163752818) + j98;
        long j106 = (j96 * 258169998) + j99;
        long j107 = (j96 * 96434764) + j100;
        long j108 = (j96 * 227822194) + j101;
        long j109 = (j96 * 149865618) + j102;
        long j110 = (j94 * 43969588) + jA2;
        long j111 = (j94 * 30366549) + (j96 * 43969588) + jB3;
        long j112 = (j94 * 163752818) + (j96 * 30366549) + j97;
        long j113 = (j94 * 258169998) + j105;
        long j114 = (j94 * 96434764) + j106;
        long j115 = (j94 * 227822194) + j107;
        long j116 = (j94 * 149865618) + j108;
        long j117 = (j94 * 550336261) + j109;
        long j118 = j72 + (j80 >>> 28);
        long j119 = (j53 * 550336261) + j51 + (j118 >>> 28);
        long j120 = j90 + (j119 >>> 28);
        long j121 = j119 & 268435455;
        long j122 = j92 + (j120 >>> 28);
        long j123 = j120 & 268435455;
        long j124 = (j122 * 43969588) + jB2;
        long j125 = (j122 * 30366549) + j110;
        long j126 = (j122 * 163752818) + j111;
        long j127 = (j122 * 258169998) + j112;
        long j128 = (j122 * 96434764) + j113;
        long j129 = (j122 * 227822194) + j114;
        long j130 = (j122 * 149865618) + j115;
        long j131 = (j122 * 550336261) + j116;
        long j132 = (258169998 * j123) + j126;
        long j133 = (227822194 * j123) + j128;
        long j134 = (j121 * 4) + ((j118 & 268435455) >>> 26) + 1;
        long j135 = (j134 * 78101261) + jB;
        long j136 = (j134 * 141809365) + (43969588 * j123) + jA + (j135 >>> 28);
        long j137 = (j134 * 175155932) + (30366549 * j123) + j124 + (j136 >>> 28);
        long j138 = (j134 * 64542499) + (163752818 * j123) + j125 + (j137 >>> 28);
        long j139 = (j134 * 158326419) + j132 + (j138 >>> 28);
        long j140 = (j134 * 191173276) + (96434764 * j123) + j127 + (j139 >>> 28);
        long j141 = (j134 * 104575268) + j133 + (j140 >>> 28);
        long j142 = (j134 * 137584065) + (149865618 * j123) + j129 + (j141 >>> 28);
        long j143 = (j123 * 550336261) + j130 + (j142 >>> 28);
        long j144 = j131 + (j143 >>> 28);
        long j145 = j117 + (j144 >>> 28);
        long j146 = (j96 * 550336261) + j103 + (j145 >>> 28);
        long j147 = j104 + (j146 >>> 28);
        long j148 = j88 + (j147 >>> 28);
        long j149 = (j80 & 268435455) + (j148 >>> 28);
        long j150 = (j118 & 67108863) + (j149 >>> 28);
        long j151 = (j150 >>> 26) - 1;
        long j152 = (j135 & 268435455) - (j151 & 78101261);
        long j153 = ((j136 & 268435455) - (j151 & 141809365)) + (j152 >> 28);
        long j154 = ((j137 & 268435455) - (j151 & 175155932)) + (j153 >> 28);
        long j155 = ((j138 & 268435455) - (j151 & 64542499)) + (j154 >> 28);
        long j156 = ((j139 & 268435455) - (j151 & 158326419)) + (j155 >> 28);
        long j157 = ((j140 & 268435455) - (j151 & 191173276)) + (j156 >> 28);
        long j158 = ((j141 & 268435455) - (j151 & 104575268)) + (j157 >> 28);
        long j159 = ((j142 & 268435455) - (j151 & 137584065)) + (j158 >> 28);
        long j160 = (j143 & 268435455) + (j159 >> 28);
        long j161 = (j144 & 268435455) + (j160 >> 28);
        long j162 = (j145 & 268435455) + (j161 >> 28);
        long j163 = (j146 & 268435455) + (j162 >> 28);
        long j164 = (j147 & 268435455) + (j163 >> 28);
        long j165 = (j148 & 268435455) + (j164 >> 28);
        long j166 = (j149 & 268435455) + (j165 >> 28);
        byte[] bArr2 = new byte[57];
        f((j152 & 268435455) | ((j153 & 268435455) << 28), bArr2, 0);
        f(((j155 & 268435455) << 28) | (j154 & 268435455), bArr2, 7);
        f(((j157 & 268435455) << 28) | (j156 & 268435455), bArr2, 14);
        f((j158 & 268435455) | ((j159 & 268435455) << 28), bArr2, 21);
        f((j160 & 268435455) | ((j161 & 268435455) << 28), bArr2, 28);
        f((j162 & 268435455) | ((j163 & 268435455) << 28), bArr2, 35);
        f((j164 & 268435455) | ((j165 & 268435455) << 28), bArr2, 42);
        f((j166 & 268435455) | (((j150 & 67108863) + (j166 >> 28)) << 28), bArr2, 49);
        return bArr2;
    }

    public static void s(byte[] bArr, a aVar) {
        a aVar2 = aVar;
        precompute();
        X448Field.zero(aVar2.f90884a);
        X448Field.one(aVar2.f90885b);
        X448Field.one(aVar2.f90886c);
        int i10 = 15;
        int[] iArr = new int[15];
        c(bArr, iArr);
        int i11 = 0;
        int i12 = 1;
        iArr[14] = Nat.cadd(14, (~iArr[0]) & 1, iArr, f90878c, iArr) + 4;
        Nat.shiftDownBit(15, iArr, 0);
        int[] iArrCreate = X448Field.create();
        int[] iArrCreate2 = X448Field.create();
        int i13 = 17;
        while (true) {
            int i14 = i11;
            int i15 = i13;
            while (i14 < 5) {
                int i16 = i11;
                int i17 = i16;
                while (i16 < 5) {
                    i17 = (i17 & (~(i12 << i16))) ^ ((iArr[i15 >>> 5] >>> (i15 & 31)) << i16);
                    i15 += 18;
                    i16++;
                }
                int i18 = (i17 >>> 4) & i12;
                int i19 = ((-i18) ^ i17) & i10;
                int i20 = i14 * 512;
                for (int i21 = i11; i21 < 16; i21++) {
                    int i22 = ((i21 ^ i19) - i12) >> 31;
                    X448Field.cmov(i22, f90883h, i20, iArrCreate, i11);
                    X448Field.cmov(i22, f90883h, i20 + 16, iArrCreate2, i11);
                    i20 += 32;
                }
                X448Field.cnegate(i18, iArrCreate);
                int[] iArrCreate3 = X448Field.create();
                int[] iArrCreate4 = X448Field.create();
                int[] iArrCreate5 = X448Field.create();
                int[] iArrCreate6 = X448Field.create();
                int[] iArrCreate7 = X448Field.create();
                int[] iArrCreate8 = X448Field.create();
                int[] iArrCreate9 = X448Field.create();
                int[] iArr2 = aVar2.f90886c;
                X448Field.sqr(iArr2, iArrCreate3);
                int[] iArr3 = aVar2.f90884a;
                X448Field.mul(iArrCreate, iArr3, iArrCreate4);
                int[] iArr4 = iArr;
                int[] iArr5 = aVar2.f90885b;
                X448Field.mul(iArrCreate2, iArr5, iArrCreate5);
                X448Field.mul(iArrCreate4, iArrCreate5, iArrCreate6);
                X448Field.mul(iArrCreate6, 39081, iArrCreate6);
                X448Field.add(iArrCreate3, iArrCreate6, iArrCreate7);
                X448Field.sub(iArrCreate3, iArrCreate6, iArrCreate8);
                X448Field.add(iArrCreate, iArrCreate2, iArrCreate3);
                X448Field.add(iArr3, iArr5, iArrCreate6);
                X448Field.mul(iArrCreate3, iArrCreate6, iArrCreate9);
                X448Field.add(iArrCreate5, iArrCreate4, iArrCreate3);
                X448Field.sub(iArrCreate5, iArrCreate4, iArrCreate6);
                X448Field.carry(iArrCreate3);
                X448Field.sub(iArrCreate9, iArrCreate3, iArrCreate9);
                X448Field.mul(iArrCreate9, iArr2, iArrCreate9);
                X448Field.mul(iArrCreate6, iArr2, iArrCreate6);
                X448Field.mul(iArrCreate7, iArrCreate9, iArr3);
                X448Field.mul(iArrCreate6, iArrCreate8, iArr5);
                X448Field.mul(iArrCreate7, iArrCreate8, iArr2);
                i14++;
                aVar2 = aVar;
                iArr = iArr4;
                i10 = 15;
                i11 = 0;
                i12 = 1;
            }
            int[] iArr6 = iArr;
            i13--;
            if (i13 < 0) {
                return;
            }
            o(aVar);
            aVar2 = aVar;
            iArr = iArr6;
            i10 = 15;
            i11 = 0;
            i12 = 1;
        }
    }

    public static void scalarMultBaseXY(X448.Friend friend, byte[] bArr, int i10, int[] iArr, int[] iArr2) {
        if (friend == null) {
            throw new NullPointerException("This method is only for use by X448");
        }
        byte[] bArr2 = new byte[57];
        q(i10, bArr, bArr2);
        a aVar = new a();
        s(bArr2, aVar);
        int[] iArrCreate = X448Field.create();
        int[] iArrCreate2 = X448Field.create();
        int[] iArrCreate3 = X448Field.create();
        int[] iArrCreate4 = X448Field.create();
        int[] iArr3 = aVar.f90884a;
        X448Field.sqr(iArr3, iArrCreate2);
        int[] iArr4 = aVar.f90885b;
        X448Field.sqr(iArr4, iArrCreate3);
        X448Field.sqr(aVar.f90886c, iArrCreate4);
        X448Field.mul(iArrCreate2, iArrCreate3, iArrCreate);
        X448Field.add(iArrCreate2, iArrCreate3, iArrCreate2);
        X448Field.mul(iArrCreate2, iArrCreate4, iArrCreate2);
        X448Field.sqr(iArrCreate4, iArrCreate4);
        X448Field.mul(iArrCreate, 39081, iArrCreate);
        X448Field.sub(iArrCreate, iArrCreate4, iArrCreate);
        X448Field.add(iArrCreate, iArrCreate2, iArrCreate);
        X448Field.normalize(iArrCreate);
        if (X448Field.isZero(iArrCreate) == 0) {
            throw new IllegalStateException();
        }
        X448Field.copy(iArr3, 0, iArr, 0);
        X448Field.copy(iArr4, 0, iArr2, 0);
    }

    public static void sign(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, byte[] bArr4, int i12, int i13, byte[] bArr5, int i14) {
        k(bArr, i10, bArr2, i11, bArr3, (byte) 0, bArr4, i12, i13, bArr5, i14);
    }

    public static void signPrehash(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, Xof xof, byte[] bArr4, int i12) {
        byte[] bArr5 = new byte[64];
        if (64 != xof.doFinal(bArr5, 0, 64)) {
            throw new IllegalArgumentException("ph");
        }
        k(bArr, i10, bArr2, i11, bArr3, (byte) 1, bArr5, 0, 64, bArr4, i12);
    }

    public static void t(int i10, byte[] bArr, byte[] bArr2) {
        a aVar = new a();
        s(bArr, aVar);
        if (g(aVar, bArr2, i10) == 0) {
            throw new IllegalStateException();
        }
    }

    public static boolean verify(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, byte[] bArr4, int i12, int i13) {
        return l((byte) 0, i10, i11, i12, i13, bArr, bArr2, bArr3, bArr4);
    }

    public static boolean verifyPrehash(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, Xof xof) {
        byte[] bArr4 = new byte[64];
        if (64 == xof.doFinal(bArr4, 0, 64)) {
            return l((byte) 1, i10, i11, 0, 64, bArr, bArr2, bArr3, bArr4);
        }
        throw new IllegalArgumentException("ph");
    }

    public static void sign(byte[] bArr, int i10, byte[] bArr2, byte[] bArr3, int i11, int i12, byte[] bArr4, int i13) {
        i((byte) 0, i10, i11, i12, i13, bArr, bArr2, bArr3, bArr4);
    }

    public static void signPrehash(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, byte[] bArr4, int i12, byte[] bArr5, int i13) {
        k(bArr, i10, bArr2, i11, bArr3, (byte) 1, bArr4, i12, 64, bArr5, i13);
    }

    public static boolean verifyPrehash(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, byte[] bArr4, int i12) {
        return l((byte) 1, i10, i11, i12, 64, bArr, bArr2, bArr3, bArr4);
    }

    public static void signPrehash(byte[] bArr, int i10, byte[] bArr2, Xof xof, byte[] bArr3, int i11) {
        byte[] bArr4 = new byte[64];
        if (64 != xof.doFinal(bArr4, 0, 64)) {
            throw new IllegalArgumentException("ph");
        }
        i((byte) 1, i10, 0, 64, i11, bArr, bArr2, bArr4, bArr3);
    }

    public static void signPrehash(byte[] bArr, int i10, byte[] bArr2, byte[] bArr3, int i11, byte[] bArr4, int i12) {
        i((byte) 1, i10, i11, 64, i12, bArr, bArr2, bArr3, bArr4);
    }
}
