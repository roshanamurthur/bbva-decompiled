package com.google.crypto.tink.subtle;

import com.google.crypto.tink.PublicKeyVerify;
import com.google.crypto.tink.config.internal.TinkFipsUtil;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import mf.b;
import mf.c;
import mf.d;

/* JADX INFO: loaded from: classes10.dex */
public final class Ed25519Verify implements PublicKeyVerify {
    public static final TinkFipsUtil.AlgorithmFipsCompatibility FIPS = TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS;
    public static final int PUBLIC_KEY_LEN = 32;
    public static final int SIGNATURE_LEN = 64;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.crypto.tink.util.Bytes f47458a;

    public Ed25519Verify(byte[] bArr) {
        if (!FIPS.isCompatible()) {
            throw new IllegalStateException(new GeneralSecurityException("Can not use Ed25519 in FIPS-mode."));
        }
        if (bArr.length != 32) {
            throw new IllegalArgumentException(String.format("Given public key's length is not %s.", 32));
        }
        this.f47458a = com.google.crypto.tink.util.Bytes.copyFrom(bArr);
    }

    @Override // com.google.crypto.tink.PublicKeyVerify
    public void verify(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = bArr;
        int i10 = 0;
        if (bArr3.length != 64) {
            throw new GeneralSecurityException(String.format("The length of the signature is not %s.", 64));
        }
        byte[] byteArray = this.f47458a.toByteArray();
        if (bArr3.length == 64) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr3, 32, 64);
            int i11 = 31;
            while (i11 >= 0) {
                int i12 = bArrCopyOfRange[i11] & 255;
                int i13 = b.f83401c[i11] & 255;
                if (i12 != i13) {
                    if (i12 >= i13) {
                        break;
                    }
                    MessageDigest engineFactory = EngineFactory.MESSAGE_DIGEST.getInstance("SHA-512");
                    engineFactory.update(bArr3, i10, 32);
                    engineFactory.update(byteArray);
                    engineFactory.update(bArr2);
                    byte[] bArrDigest = engineFactory.digest();
                    b.h(bArrDigest);
                    long[] jArr = new long[10];
                    long[] jArrB = d.b(byteArray);
                    long[] jArr2 = new long[10];
                    jArr2[i10] = 1;
                    long[] jArr3 = new long[10];
                    long[] jArr4 = new long[10];
                    long[] jArr5 = new long[10];
                    long[] jArr6 = new long[10];
                    long[] jArr7 = new long[10];
                    d.i(jArr4, jArrB);
                    d.d(jArr5, jArr4, c.f83413a);
                    d.j(jArr4, jArr4, jArr2);
                    d.k(jArr5, jArr5, jArr2);
                    long[] jArr8 = new long[10];
                    d.i(jArr8, jArr5);
                    d.d(jArr8, jArr8, jArr5);
                    d.i(jArr, jArr8);
                    d.d(jArr, jArr, jArr5);
                    d.d(jArr, jArr, jArr4);
                    long[] jArr9 = new long[10];
                    long[] jArr10 = new long[10];
                    long[] jArr11 = new long[10];
                    d.i(jArr9, jArr);
                    d.i(jArr10, jArr9);
                    d.i(jArr10, jArr10);
                    d.d(jArr10, jArr, jArr10);
                    d.d(jArr9, jArr9, jArr10);
                    d.i(jArr9, jArr9);
                    d.d(jArr9, jArr10, jArr9);
                    d.i(jArr10, jArr9);
                    for (int i14 = 1; i14 < 5; i14++) {
                        d.i(jArr10, jArr10);
                    }
                    d.d(jArr9, jArr10, jArr9);
                    d.i(jArr10, jArr9);
                    for (int i15 = 1; i15 < 10; i15++) {
                        d.i(jArr10, jArr10);
                    }
                    d.d(jArr10, jArr10, jArr9);
                    d.i(jArr11, jArr10);
                    for (int i16 = 1; i16 < 20; i16++) {
                        d.i(jArr11, jArr11);
                    }
                    d.d(jArr10, jArr11, jArr10);
                    d.i(jArr10, jArr10);
                    for (int i17 = 1; i17 < 10; i17++) {
                        d.i(jArr10, jArr10);
                    }
                    d.d(jArr9, jArr10, jArr9);
                    d.i(jArr10, jArr9);
                    for (int i18 = 1; i18 < 50; i18++) {
                        d.i(jArr10, jArr10);
                    }
                    d.d(jArr10, jArr10, jArr9);
                    d.i(jArr11, jArr10);
                    for (int i19 = 1; i19 < 100; i19++) {
                        d.i(jArr11, jArr11);
                    }
                    d.d(jArr10, jArr11, jArr10);
                    d.i(jArr10, jArr10);
                    for (int i20 = 1; i20 < 50; i20++) {
                        d.i(jArr10, jArr10);
                    }
                    d.d(jArr9, jArr10, jArr9);
                    d.i(jArr9, jArr9);
                    d.i(jArr9, jArr9);
                    d.d(jArr, jArr9, jArr);
                    d.d(jArr, jArr, jArr8);
                    d.d(jArr, jArr, jArr4);
                    d.i(jArr6, jArr);
                    d.d(jArr6, jArr6, jArr5);
                    d.j(jArr7, jArr6, jArr4);
                    if (b.a(jArr7)) {
                        d.k(jArr7, jArr6, jArr4);
                        if (b.a(jArr7)) {
                            throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. No square root exists for modulo 2^255-19");
                        }
                        d.d(jArr, jArr, c.f83415c);
                    }
                    if (!b.a(jArr) && ((byteArray[31] & 255) >> 7) != 0) {
                        throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. Computed x is zero and encoded x's least significant bit is not zero");
                    }
                    if ((d.a(jArr)[0] & 1) == ((byteArray[31] & 255) >> 7)) {
                        for (int i21 = 0; i21 < 10; i21++) {
                            jArr[i21] = -jArr[i21];
                        }
                    }
                    d.d(jArr3, jArr, jArrB);
                    b.d dVar = new b.d(jArr, jArrB, jArr2);
                    b.C0466b[] c0466bArr = new b.C0466b[8];
                    c0466bArr[0] = new b.C0466b(new b.e(dVar, jArr3));
                    b.c cVar = new b.c(new b.d(), new long[10]);
                    b.c(cVar, dVar);
                    b.e eVar = new b.e(cVar);
                    for (int i22 = 1; i22 < 8; i22++) {
                        b.b(cVar, eVar, c0466bArr[i22 - 1]);
                        c0466bArr[i22] = new b.C0466b(new b.e(cVar));
                    }
                    byte[] bArrK = b.k(bArrDigest);
                    byte[] bArrK2 = b.k(bArrCopyOfRange);
                    b.c cVar2 = new b.c();
                    b.e eVar2 = new b.e();
                    int i23 = 255;
                    while (i23 >= 0 && bArrK[i23] == 0 && bArrK2[i23] == 0) {
                        i23--;
                    }
                    while (i23 >= 0) {
                        b.c(cVar2, new b.d(cVar2));
                        byte b10 = bArrK[i23];
                        if (b10 > 0) {
                            b.e.a(cVar2, eVar2);
                            b.b(cVar2, eVar2, c0466bArr[bArrK[i23] / 2]);
                        } else if (b10 < 0) {
                            b.e.a(cVar2, eVar2);
                            b.l(cVar2, eVar2, c0466bArr[(-bArrK[i23]) / 2]);
                        }
                        byte b11 = bArrK2[i23];
                        if (b11 > 0) {
                            b.e.a(cVar2, eVar2);
                            b.b(cVar2, eVar2, c.f83417e[bArrK2[i23] / 2]);
                        } else if (b11 < 0) {
                            b.e.a(cVar2, eVar2);
                            b.l(cVar2, eVar2, c.f83417e[(-bArrK2[i23]) / 2]);
                        }
                        i23--;
                    }
                    byte[] bArrB = new b.d(cVar2).b();
                    for (int i24 = 0; i24 < 32; i24++) {
                        if (bArrB[i24] != bArr[i24]) {
                            break;
                        }
                    }
                    return;
                }
                i11--;
                bArr3 = bArr;
                i10 = 0;
            }
        }
        throw new GeneralSecurityException("Signature check failed.");
    }
}
