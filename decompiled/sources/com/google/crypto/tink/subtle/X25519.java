package com.google.crypto.tink.subtle;

import com.google.crypto.tink.annotations.Alpha;
import java.security.InvalidKeyException;
import java.util.Arrays;
import mf.a;
import mf.d;

/* JADX INFO: loaded from: classes10.dex */
@Alpha
public final class X25519 {
    public static byte[] computeSharedSecret(byte[] bArr, byte[] bArr2) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("Private key must have 32 bytes.");
        }
        long[] jArr = new long[11];
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 32);
        int i10 = 0;
        bArrCopyOf[0] = (byte) (bArrCopyOf[0] & 248);
        byte b10 = (byte) (bArrCopyOf[31] & 127);
        bArrCopyOf[31] = b10;
        bArrCopyOf[31] = (byte) (b10 | 64);
        if (bArr2.length != 32) {
            throw new InvalidKeyException("Public key length is not 32-byte");
        }
        byte[] bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
        bArrCopyOf2[31] = (byte) (bArrCopyOf2[31] & 127);
        for (int i11 = 0; i11 < 7; i11++) {
            byte[][] bArr3 = a.f83398a;
            if (Bytes.equal(bArr3[i11], bArrCopyOf2)) {
                throw new InvalidKeyException("Banned public key: " + Hex.encode(bArr3[i11]));
            }
        }
        long[] jArrB = d.b(bArrCopyOf2);
        long[] jArr2 = new long[19];
        long[] jArr3 = new long[19];
        jArr3[0] = 1;
        long[] jArr4 = new long[19];
        jArr4[0] = 1;
        long[] jArr5 = new long[19];
        long[] jArr6 = new long[19];
        long[] jArr7 = new long[19];
        jArr7[0] = 1;
        long[] jArr8 = new long[19];
        long[] jArr9 = new long[19];
        jArr9[0] = 1;
        int i12 = 10;
        System.arraycopy(jArrB, 0, jArr2, 0, 10);
        while (i10 < 32) {
            int i13 = bArrCopyOf[31 - i10] & 255;
            int i14 = 0;
            while (i14 < 8) {
                int i15 = (i13 >> (7 - i14)) & 1;
                a.b(i15, jArr4, jArr2);
                a.b(i15, jArr5, jArr3);
                byte[] bArr4 = bArrCopyOf;
                long[] jArrCopyOf = Arrays.copyOf(jArr4, 10);
                int i16 = i13;
                long[] jArr10 = new long[19];
                long[] jArr11 = jArr;
                long[] jArr12 = new long[19];
                int i17 = i10;
                long[] jArr13 = new long[19];
                int i18 = i14;
                long[] jArr14 = new long[19];
                long[] jArr15 = new long[19];
                long[] jArr16 = jArr9;
                long[] jArr17 = new long[19];
                long[] jArr18 = new long[19];
                d.k(jArr4, jArr4, jArr5);
                d.j(jArr5, jArrCopyOf, jArr5);
                long[] jArrCopyOf2 = Arrays.copyOf(jArr2, 10);
                d.k(jArr2, jArr2, jArr3);
                d.j(jArr3, jArrCopyOf2, jArr3);
                d.e(jArr14, jArr2, jArr5);
                d.e(jArr15, jArr4, jArr3);
                d.h(jArr14);
                d.g(jArr14);
                d.h(jArr15);
                d.g(jArr15);
                long[] jArr19 = jArr2;
                System.arraycopy(jArr14, 0, jArrCopyOf2, 0, 10);
                d.k(jArr14, jArr14, jArr15);
                d.j(jArr15, jArrCopyOf2, jArr15);
                d.i(jArr18, jArr14);
                d.i(jArr17, jArr15);
                d.e(jArr15, jArr17, jArrB);
                d.h(jArr15);
                d.g(jArr15);
                System.arraycopy(jArr18, 0, jArr6, 0, 10);
                System.arraycopy(jArr15, 0, jArr7, 0, 10);
                d.i(jArr12, jArr4);
                d.i(jArr13, jArr5);
                d.e(jArr8, jArr12, jArr13);
                d.h(jArr8);
                d.g(jArr8);
                d.j(jArr13, jArr12, jArr13);
                Arrays.fill(jArr10, 10, 18, 0L);
                int i19 = 0;
                for (int i20 = 10; i19 < i20; i20 = 10) {
                    jArr10[i19] = jArr13[i19] * 121665;
                    i19++;
                }
                d.g(jArr10);
                d.k(jArr10, jArr10, jArr12);
                d.e(jArr16, jArr13, jArr10);
                d.h(jArr16);
                d.g(jArr16);
                a.b(i15, jArr8, jArr6);
                a.b(i15, jArr16, jArr7);
                i14 = i18 + 1;
                jArr2 = jArr6;
                i13 = i16;
                bArrCopyOf = bArr4;
                jArr = jArr11;
                i10 = i17;
                jArr6 = jArr19;
                long[] jArr20 = jArr4;
                jArr4 = jArr8;
                jArr8 = jArr20;
                long[] jArr21 = jArr5;
                jArr5 = jArr16;
                jArr9 = jArr21;
                long[] jArr22 = jArr7;
                jArr7 = jArr3;
                jArr3 = jArr22;
            }
            i10++;
            i12 = 10;
        }
        long[] jArr23 = jArr;
        int i21 = i12;
        long[] jArr24 = new long[i21];
        d.c(jArr24, jArr5);
        d.d(jArr23, jArr4, jArr24);
        long[] jArr25 = new long[i21];
        long[] jArr26 = new long[i21];
        long[] jArr27 = new long[11];
        long[] jArr28 = new long[11];
        long[] jArr29 = new long[11];
        d.d(jArr25, jArrB, jArr23);
        d.k(jArr26, jArrB, jArr23);
        long[] jArr30 = new long[i21];
        jArr30[0] = 486662;
        d.k(jArr28, jArr26, jArr30);
        d.d(jArr28, jArr28, jArr3);
        d.k(jArr28, jArr28, jArr2);
        d.d(jArr28, jArr28, jArr25);
        d.d(jArr28, jArr28, jArr2);
        for (int i22 = 0; i22 < 10; i22++) {
            jArr27[i22] = jArr28[i22] * 4;
        }
        d.g(jArr27);
        d.d(jArr28, jArr25, jArr3);
        d.j(jArr28, jArr28, jArr3);
        d.d(jArr29, jArr26, jArr2);
        d.k(jArr28, jArr28, jArr29);
        d.i(jArr28, jArr28);
        if (Bytes.equal(d.a(jArr27), d.a(jArr28))) {
            return d.a(jArr23);
        }
        throw new IllegalStateException("Arithmetic error in curve multiplication with the public key: " + Hex.encode(bArr2));
    }

    public static byte[] generatePrivateKey() {
        byte[] bArrRandBytes = Random.randBytes(32);
        bArrRandBytes[0] = (byte) (bArrRandBytes[0] | 7);
        byte b10 = (byte) (bArrRandBytes[31] & 63);
        bArrRandBytes[31] = b10;
        bArrRandBytes[31] = (byte) (b10 | 128);
        return bArrRandBytes;
    }

    public static byte[] publicFromPrivate(byte[] bArr) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("Private key must have 32 bytes.");
        }
        byte[] bArr2 = new byte[32];
        bArr2[0] = 9;
        return computeSharedSecret(bArr, bArr2);
    }
}
