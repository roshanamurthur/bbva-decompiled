package org.bouncycastle.crypto.generators;

import androidx.camera.camera2.internal.compat.u;
import org.bouncycastle.crypto.digests.Blake2bDigest;
import org.bouncycastle.crypto.params.Argon2Parameters;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes4.dex */
public class Argon2BytesGenerator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a[] f88669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f88670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f88671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Argon2Parameters f88672d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f88673e;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long[] f88674a = new long[128];

        public static void a(a aVar, a aVar2, a aVar3) {
            aVar.getClass();
            for (int i10 = 0; i10 < 128; i10++) {
                aVar.f88674a[i10] = aVar2.f88674a[i10] ^ aVar3.f88674a[i10];
            }
        }

        public final void b(byte[] bArr) {
            if (bArr.length != 1024) {
                throw new IllegalArgumentException("input shorter than blocksize");
            }
            for (int i10 = 0; i10 < 128; i10++) {
                this.f88674a[i10] = Pack.littleEndianToLong(bArr, i10 * 8);
            }
        }

        public final String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            for (int i10 = 0; i10 < 128; i10++) {
                stringBuffer.append(Hex.toHexString(Pack.longToLittleEndian(this.f88674a[i10])));
            }
            return stringBuffer.toString();
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public a f88675a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public a f88676b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public a f88677c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public a f88678d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public a f88679e;

        public static void a(b bVar, a aVar, a aVar2, a aVar3) {
            a aVar4 = bVar.f88678d;
            a aVar5 = bVar.f88675a;
            if (aVar == aVar4) {
                aVar5.getClass();
                System.arraycopy(aVar2.f88674a, 0, aVar5.f88674a, 0, 128);
            } else {
                a.a(aVar5, aVar, aVar2);
            }
            a aVar6 = bVar.f88676b;
            aVar6.getClass();
            System.arraycopy(aVar5.f88674a, 0, aVar6.f88674a, 0, 128);
            bVar.b();
            a.a(aVar3, aVar5, aVar6);
        }

        public final void b() {
            int i10;
            int i11 = 0;
            while (true) {
                if (i11 >= 8) {
                    break;
                }
                int i12 = i11 * 16;
                a aVar = this.f88676b;
                int i13 = i12 + 1;
                int i14 = i12 + 2;
                int i15 = i12 + 3;
                int i16 = i12 + 4;
                int i17 = i12 + 5;
                int i18 = i12 + 6;
                int i19 = i12 + 7;
                int i20 = i12 + 8;
                int i21 = i12 + 9;
                int i22 = i12 + 10;
                int i23 = i12 + 11;
                int i24 = i12 + 12;
                int i25 = i12 + 13;
                int i26 = i11;
                int i27 = i12 + 14;
                int i28 = i12 + 15;
                Argon2BytesGenerator.a(aVar, i12, i16, i20, i24);
                Argon2BytesGenerator.a(aVar, i13, i17, i21, i25);
                Argon2BytesGenerator.a(aVar, i14, i18, i22, i27);
                Argon2BytesGenerator.a(aVar, i15, i19, i23, i28);
                Argon2BytesGenerator.a(aVar, i12, i17, i22, i28);
                Argon2BytesGenerator.a(aVar, i13, i18, i23, i24);
                Argon2BytesGenerator.a(aVar, i14, i19, i20, i25);
                Argon2BytesGenerator.a(aVar, i15, i16, i21, i27);
                i11 = i26 + 1;
            }
            int i29 = 0;
            for (i10 = 8; i29 < i10; i10 = 8) {
                int i30 = i29 * 2;
                a aVar2 = this.f88676b;
                int i31 = i30 + 1;
                int i32 = i30 + 16;
                int i33 = i30 + 17;
                int i34 = i30 + 32;
                int i35 = i30 + 33;
                int i36 = i30 + 48;
                int i37 = i30 + 49;
                int i38 = i30 + 64;
                int i39 = i30 + 65;
                int i40 = i30 + 80;
                int i41 = i30 + 81;
                int i42 = i30 + 96;
                int i43 = i30 + 97;
                int i44 = i29;
                int i45 = i30 + 112;
                int i46 = i30 + 113;
                Argon2BytesGenerator.a(aVar2, i30, i34, i38, i42);
                Argon2BytesGenerator.a(aVar2, i31, i35, i39, i43);
                Argon2BytesGenerator.a(aVar2, i32, i36, i40, i45);
                Argon2BytesGenerator.a(aVar2, i33, i37, i41, i46);
                Argon2BytesGenerator.a(aVar2, i30, i35, i40, i46);
                Argon2BytesGenerator.a(aVar2, i31, i36, i41, i42);
                Argon2BytesGenerator.a(aVar2, i32, i37, i38, i43);
                Argon2BytesGenerator.a(aVar2, i33, i34, i39, i45);
                i29 = i44 + 1;
            }
        }
    }

    public static void a(a aVar, int i10, int i11, int i12, int i13) {
        d(aVar, i10, i11);
        f(aVar, i13, i10, 32L);
        d(aVar, i12, i13);
        f(aVar, i11, i12, 24L);
        d(aVar, i10, i11);
        f(aVar, i13, i10, 16L);
        d(aVar, i12, i13);
        f(aVar, i11, i12, 63L);
    }

    public static void b(Blake2bDigest blake2bDigest, byte[] bArr) {
        if (bArr == null) {
            c(0, blake2bDigest);
        } else {
            c(bArr.length, blake2bDigest);
            blake2bDigest.update(bArr, 0, bArr.length);
        }
    }

    public static void c(int i10, Blake2bDigest blake2bDigest) {
        blake2bDigest.update((byte) i10);
        blake2bDigest.update((byte) (i10 >>> 8));
        blake2bDigest.update((byte) (i10 >>> 16));
        blake2bDigest.update((byte) (i10 >>> 24));
    }

    public static void d(a aVar, int i10, int i11) {
        long[] jArr = aVar.f88674a;
        long j10 = jArr[i10];
        long j11 = jArr[i11];
        jArr[i10] = ((j10 & 4294967295L) * (4294967295L & j11) * 2) + j10 + j11;
    }

    public static byte[] e(int i10, byte[] bArr) {
        byte[] bArr2 = new byte[i10];
        byte[] bArrIntToLittleEndian = Pack.intToLittleEndian(i10);
        if (i10 <= 64) {
            Blake2bDigest blake2bDigest = new Blake2bDigest(i10 * 8);
            blake2bDigest.update(bArrIntToLittleEndian, 0, bArrIntToLittleEndian.length);
            blake2bDigest.update(bArr, 0, bArr.length);
            blake2bDigest.doFinal(bArr2, 0);
        } else {
            Blake2bDigest blake2bDigest2 = new Blake2bDigest(512);
            byte[] bArr3 = new byte[64];
            blake2bDigest2.update(bArrIntToLittleEndian, 0, bArrIntToLittleEndian.length);
            blake2bDigest2.update(bArr, 0, bArr.length);
            blake2bDigest2.doFinal(bArr3, 0);
            System.arraycopy(bArr3, 0, bArr2, 0, 32);
            int i11 = 2;
            int i12 = ((i10 + 31) / 32) - 2;
            int i13 = 32;
            while (i11 <= i12) {
                blake2bDigest2.update(bArr3, 0, 64);
                blake2bDigest2.doFinal(bArr3, 0);
                System.arraycopy(bArr3, 0, bArr2, i13, 32);
                i11++;
                i13 += 32;
            }
            Blake2bDigest blake2bDigest3 = new Blake2bDigest((i10 - (i12 * 32)) * 8);
            blake2bDigest3.update(bArr3, 0, 64);
            blake2bDigest3.doFinal(bArr2, i13);
        }
        return bArr2;
    }

    public static void f(a aVar, int i10, int i11, long j10) {
        long[] jArr = aVar.f88674a;
        long j11 = jArr[i10] ^ jArr[i11];
        jArr[i10] = (j11 << ((int) (64 - j10))) | (j11 >>> ((int) j10));
    }

    public int generateBytes(byte[] bArr, byte[] bArr2) {
        return generateBytes(bArr, bArr2, 0, bArr2.length);
    }

    public void init(Argon2Parameters argon2Parameters) {
        this.f88672d = argon2Parameters;
        if (argon2Parameters.getLanes() < 1) {
            throw new IllegalStateException("lanes must be greater than 1");
        }
        if (argon2Parameters.getLanes() > 16777216) {
            throw new IllegalStateException("lanes must be less than 16777216");
        }
        if (argon2Parameters.getMemory() < argon2Parameters.getLanes() * 2) {
            throw new IllegalStateException("memory is less than: " + (argon2Parameters.getLanes() * 2) + " expected " + (argon2Parameters.getLanes() * 2));
        }
        if (argon2Parameters.getIterations() < 1) {
            throw new IllegalStateException("iterations is less than: 1");
        }
        int memory = argon2Parameters.getMemory();
        if (memory < argon2Parameters.getLanes() * 8) {
            memory = argon2Parameters.getLanes() * 8;
        }
        int lanes = memory / (argon2Parameters.getLanes() * 4);
        this.f88670b = lanes;
        this.f88671c = lanes * 4;
        this.f88669a = new a[argon2Parameters.getLanes() * 4 * lanes];
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.f88669a;
            if (i10 >= aVarArr.length) {
                return;
            }
            aVarArr[i10] = new a();
            i10++;
        }
    }

    public int generateBytes(byte[] bArr, byte[] bArr2, int i10, int i11) {
        int i12;
        int i13;
        a aVar;
        a aVar2;
        a aVar3;
        long j10;
        int i14;
        int i15;
        int i16 = 4;
        if (i11 < 4) {
            throw new IllegalStateException("output length less than 4");
        }
        Argon2Parameters argon2Parameters = this.f88672d;
        Blake2bDigest blake2bDigest = new Blake2bDigest(512);
        c(argon2Parameters.getLanes(), blake2bDigest);
        c(i11, blake2bDigest);
        c(argon2Parameters.getMemory(), blake2bDigest);
        c(argon2Parameters.getIterations(), blake2bDigest);
        c(argon2Parameters.getVersion(), blake2bDigest);
        c(argon2Parameters.getType(), blake2bDigest);
        b(blake2bDigest, bArr);
        b(blake2bDigest, argon2Parameters.getSalt());
        b(blake2bDigest, argon2Parameters.getSecret());
        b(blake2bDigest, argon2Parameters.getAdditional());
        byte[] bArr3 = new byte[blake2bDigest.getDigestSize()];
        int i17 = 0;
        blake2bDigest.doFinal(bArr3, 0);
        byte[] bArr4 = new byte[72];
        System.arraycopy(bArr3, 0, bArr4, 0, 64);
        System.arraycopy(new byte[]{0, 0, 0, 0}, 0, bArr4, 64, 4);
        byte[] bArr5 = new byte[72];
        System.arraycopy(bArr3, 0, bArr5, 0, 64);
        System.arraycopy(new byte[]{1, 0, 0, 0}, 0, bArr5, 64, 4);
        int i18 = 0;
        while (true) {
            i12 = 1;
            if (i18 >= this.f88672d.getLanes()) {
                break;
            }
            Pack.intToLittleEndian(i18, bArr4, 68);
            Pack.intToLittleEndian(i18, bArr5, 68);
            this.f88669a[this.f88671c * i18].b(e(1024, bArr4));
            this.f88669a[(this.f88671c * i18) + 1].b(e(1024, bArr5));
            i18++;
        }
        b bVar = new b();
        bVar.f88675a = new a();
        bVar.f88676b = new a();
        bVar.f88677c = new a();
        bVar.f88678d = new a();
        bVar.f88679e = new a();
        int i19 = 0;
        while (true) {
            long j11 = 0;
            if (i19 >= this.f88672d.getIterations()) {
                break;
            }
            int i20 = i17;
            while (i20 < i16) {
                int i21 = i17;
                while (i21 < this.f88672d.getLanes()) {
                    int i22 = (this.f88672d.getType() == i12 || (this.f88672d.getType() == 2 && i19 == 0 && i20 < 2)) ? i12 : i17;
                    int i23 = (i19 == 0 && i20 == 0) ? 2 : i17;
                    int i24 = this.f88671c;
                    int iB = u.b(i20, this.f88670b, i21 * i24, i23);
                    int i25 = iB % i24 == 0 ? (i24 + iB) - i12 : iB - 1;
                    if (i22 != 0) {
                        aVar2 = bVar.f88677c;
                        Arrays.fill(aVar2.f88674a, j11);
                        aVar3 = bVar.f88678d;
                        Arrays.fill(aVar3.f88674a, j11);
                        aVar = bVar.f88679e;
                        Arrays.fill(aVar.f88674a, j11);
                        long[] jArr = aVar.f88674a;
                        jArr[0] = ((long) i19) & 4294967295L;
                        jArr[1] = ((long) i21) & 4294967295L;
                        jArr[2] = ((long) i20) & 4294967295L;
                        jArr[3] = ((long) this.f88669a.length) & 4294967295L;
                        i13 = 4;
                        jArr[4] = ((long) this.f88672d.getIterations()) & 4294967295L;
                        jArr[5] = ((long) this.f88672d.getType()) & 4294967295L;
                        if (i19 == 0 && i20 == 0) {
                            jArr[6] = jArr[6] + 1;
                            b.a(bVar, aVar3, aVar, aVar2);
                            b.a(bVar, aVar3, aVar2, aVar2);
                        }
                    } else {
                        i13 = 4;
                        aVar = null;
                        aVar2 = null;
                        aVar3 = null;
                    }
                    while (i23 < this.f88670b) {
                        if (iB % this.f88671c == 1) {
                            i25 = iB - 1;
                        }
                        if (i22 != 0) {
                            int i26 = i23 % 128;
                            if (i26 == 0) {
                                long[] jArr2 = aVar.f88674a;
                                jArr2[6] = jArr2[6] + 1;
                                b.a(bVar, aVar3, aVar, aVar2);
                                b.a(bVar, aVar3, aVar2, aVar2);
                            }
                            j10 = aVar2.f88674a[i26];
                        } else {
                            j10 = this.f88669a[i25].f88674a[0];
                        }
                        int i27 = i23;
                        int lanes = (int) ((j10 >>> 32) % ((long) this.f88672d.getLanes()));
                        if (i19 == 0 && i20 == 0) {
                            lanes = i21;
                        }
                        boolean z10 = lanes == i21;
                        if (i19 == 0) {
                            i14 = z10 ? ((this.f88670b * i20) + i27) - 1 : (this.f88670b * i20) + (i27 == 0 ? -1 : 0);
                            i15 = 0;
                        } else {
                            int i28 = this.f88670b;
                            int i29 = this.f88671c;
                            int i30 = ((i20 + 1) * i28) % i29;
                            int i31 = i29 - i28;
                            i14 = z10 ? (i31 + i27) - 1 : i31 + (i27 == 0 ? -1 : 0);
                            i15 = i30;
                        }
                        long j12 = j10 & 4294967295L;
                        a aVar4 = aVar;
                        a aVar5 = aVar2;
                        int i32 = (int) (((long) i15) + (((long) (i14 - 1)) - ((((long) i14) * ((j12 * j12) >>> 32)) >>> 32)));
                        int i33 = this.f88671c;
                        a[] aVarArr = this.f88669a;
                        a aVar6 = aVarArr[i25];
                        a aVar7 = aVarArr[(i33 * lanes) + (i32 % i33)];
                        a aVar8 = aVarArr[iB];
                        if (i19 == 0 || this.f88672d.getVersion() == 16) {
                            b.a(bVar, aVar6, aVar7, aVar8);
                        } else {
                            a aVar9 = bVar.f88675a;
                            a.a(aVar9, aVar6, aVar7);
                            a aVar10 = bVar.f88676b;
                            aVar10.getClass();
                            long[] jArr3 = aVar9.f88674a;
                            long[] jArr4 = aVar10.f88674a;
                            System.arraycopy(jArr3, 0, jArr4, 0, 128);
                            bVar.b();
                            aVar8.getClass();
                            int i34 = 0;
                            for (int i35 = 128; i34 < i35; i35 = 128) {
                                long j13 = jArr3[i34] ^ jArr4[i34];
                                long[] jArr5 = jArr4;
                                long[] jArr6 = aVar8.f88674a;
                                jArr6[i34] = j13 ^ jArr6[i34];
                                i34++;
                                jArr4 = jArr5;
                            }
                        }
                        i23 = i27 + 1;
                        iB++;
                        i25++;
                        aVar = aVar4;
                        aVar2 = aVar5;
                    }
                    i21++;
                    i16 = i13;
                    i17 = 0;
                    i12 = 1;
                    j11 = 0;
                }
                i20++;
                i17 = 0;
                i12 = 1;
                j11 = 0;
            }
            i19++;
            i17 = 0;
            i12 = 1;
        }
        a aVar11 = this.f88669a[this.f88671c - 1];
        for (int i36 = 1; i36 < this.f88672d.getLanes(); i36++) {
            int i37 = this.f88671c;
            a aVar12 = this.f88669a[(i37 - 1) + (i36 * i37)];
            int i38 = 0;
            while (true) {
                long[] jArr7 = aVar11.f88674a;
                if (i38 < jArr7.length) {
                    jArr7[i38] = jArr7[i38] ^ aVar12.f88674a[i38];
                    i38++;
                }
            }
        }
        byte[] bArr6 = new byte[1024];
        for (int i39 = 0; i39 < 128; i39++) {
            Pack.longToLittleEndian(aVar11.f88674a[i39], bArr6, i39 * 8);
        }
        aVar11.getClass();
        byte[] bArrE = e(i11, bArr6);
        this.f88673e = bArrE;
        System.arraycopy(bArrE, 0, bArr2, i10, i11);
        int i40 = 0;
        while (true) {
            a[] aVarArr2 = this.f88669a;
            if (i40 >= aVarArr2.length) {
                this.f88669a = null;
                Arrays.fill(this.f88673e, (byte) 0);
                return i11;
            }
            Arrays.fill(aVarArr2[i40].f88674a, 0L);
            i40++;
        }
    }

    public int generateBytes(char[] cArr, byte[] bArr) {
        return generateBytes(this.f88672d.getCharToByteConverter().convert(cArr), bArr);
    }

    public int generateBytes(char[] cArr, byte[] bArr, int i10, int i11) {
        return generateBytes(this.f88672d.getCharToByteConverter().convert(cArr), bArr, i10, i11);
    }
}
