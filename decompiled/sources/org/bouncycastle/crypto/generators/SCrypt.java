package org.bouncycastle.crypto.generators;

import androidx.collection.k;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.engines.Salsa20Engine;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes4.dex */
public class SCrypt {
    public static void a(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int i10) {
        System.arraycopy(iArr, iArr.length - 16, iArr2, 0, 16);
        int length = iArr.length >>> 1;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = i10 * 2; i13 > 0; i13--) {
            for (int length2 = iArr3.length - 1; length2 >= 0; length2--) {
                iArr3[length2] = iArr2[length2] ^ iArr[i11 + length2];
            }
            Salsa20Engine.salsaCore(8, iArr3, iArr2);
            System.arraycopy(iArr2, 0, iArr4, i12, 16);
            i12 = (length + i11) - i12;
            i11 += 16;
        }
    }

    public static void b(int i10, int i11, int i12, int[] iArr) {
        int i13;
        int i14 = i12 * 32;
        int[] iArr2 = new int[16];
        int[] iArr3 = new int[16];
        int[] iArr4 = new int[i14];
        int[] iArr5 = new int[i14];
        int[] iArr6 = new int[i11 * i14];
        try {
            System.arraycopy(iArr, i10, iArr5, 0, i14);
            int i15 = 0;
            for (int i16 = 0; i16 < i11; i16 += 2) {
                System.arraycopy(iArr5, 0, iArr6, i15, i14);
                int i17 = i15 + i14;
                a(iArr5, iArr2, iArr3, iArr4, i12);
                System.arraycopy(iArr4, 0, iArr6, i17, i14);
                i15 = i17 + i14;
                a(iArr4, iArr2, iArr3, iArr5, i12);
            }
            int i18 = i11 - 1;
            for (int i19 = 0; i19 < i11; i19++) {
                System.arraycopy(iArr6, (iArr5[i14 - 16] & i18) * i14, iArr4, 0, i14);
                for (int i20 = i14 - 1; i20 >= 0; i20--) {
                    iArr4[i20] = iArr4[i20] ^ iArr5[i20];
                }
                a(iArr4, iArr2, iArr3, iArr5, i12);
            }
            System.arraycopy(iArr5, 0, iArr, i10, i14);
            Arrays.fill(iArr6, 0);
            int[][] iArr7 = {iArr5, iArr2, iArr3, iArr4};
            int i21 = 0;
            while (i13 < i) {
                int[] iArr8 = iArr7[i13];
                if (iArr8 != null) {
                    Arrays.fill(iArr8, 0);
                }
            }
        } finally {
            Arrays.fill(iArr6, 0);
            int[][] iArr9 = {iArr5, iArr2, iArr3, iArr4};
            for (i13 = 0; i13 < 4; i13++) {
                int[] iArr10 = iArr9[i13];
                if (iArr10 != null) {
                    Arrays.fill(iArr10, 0);
                }
            }
        }
    }

    public static byte[] generate(byte[] bArr, byte[] bArr2, int i10, int i11, int i12, int i13) {
        if (bArr == null) {
            throw new IllegalArgumentException("Passphrase P must be provided.");
        }
        if (bArr2 == null) {
            throw new IllegalArgumentException("Salt S must be provided.");
        }
        if (i10 <= 1 || ((i10 - 1) & i10) != 0) {
            throw new IllegalArgumentException("Cost parameter N must be > 1 and a power of 2");
        }
        if (i11 == 1 && i10 >= 65536) {
            throw new IllegalArgumentException("Cost parameter N must be > 1 and < 65536.");
        }
        if (i11 < 1) {
            throw new IllegalArgumentException("Block size r must be >= 1.");
        }
        int i14 = i11 * 128;
        int i15 = Integer.MAX_VALUE / (i11 * 1024);
        if (i12 < 1 || i12 > i15) {
            throw new IllegalArgumentException(k.c("Parallelisation parameter p must be >= 1 and <= ", i15, " (based on block size r of ", i11, ")"));
        }
        if (i13 < 1) {
            throw new IllegalArgumentException("Generated key length dkLen must be >= 1.");
        }
        PKCS5S2ParametersGenerator pKCS5S2ParametersGenerator = new PKCS5S2ParametersGenerator(new SHA256Digest());
        pKCS5S2ParametersGenerator.init(bArr, bArr2, 1);
        byte[] key = ((KeyParameter) pKCS5S2ParametersGenerator.generateDerivedMacParameters(i12 * i14 * 8)).getKey();
        int[] iArr = null;
        try {
            int length = key.length >>> 2;
            iArr = new int[length];
            Pack.littleEndianToInt(key, 0, iArr);
            int i16 = i14 >>> 2;
            for (int i17 = 0; i17 < length; i17 += i16) {
                b(i17, i10, i11, iArr);
            }
            Pack.intToLittleEndian(iArr, key, 0);
            PKCS5S2ParametersGenerator pKCS5S2ParametersGenerator2 = new PKCS5S2ParametersGenerator(new SHA256Digest());
            pKCS5S2ParametersGenerator2.init(bArr, key, 1);
            byte[] key2 = ((KeyParameter) pKCS5S2ParametersGenerator2.generateDerivedMacParameters(i13 * 8)).getKey();
            Arrays.fill(key, (byte) 0);
            Arrays.fill(iArr, 0);
            return key2;
        } catch (Throwable th2) {
            if (key != null) {
                Arrays.fill(key, (byte) 0);
            }
            if (iArr != null) {
                Arrays.fill(iArr, 0);
            }
            throw th2;
        }
    }
}
