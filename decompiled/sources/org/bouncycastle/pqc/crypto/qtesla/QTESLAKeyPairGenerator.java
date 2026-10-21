package org.bouncycastle.pqc.crypto.qtesla;

import androidx.work.Data;
import bn.a;
import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import wm.b;

/* JADX INFO: loaded from: classes13.dex */
public final class QTESLAKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f91206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SecureRandom f91207b;

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        int i10;
        int i11;
        byte[] bArr = new byte[QTESLASecurityCategory.a(this.f91206a)];
        byte[] bArr2 = new byte[QTESLASecurityCategory.b(this.f91206a)];
        int i12 = this.f91206a;
        int i13 = 0;
        int i14 = 1;
        if (i12 == 5) {
            byte[] bArr3 = new byte[32];
            byte[] bArr4 = new byte[224];
            long[] jArr = new long[1024];
            long[] jArr2 = new long[4096];
            long[] jArr3 = new long[4096];
            long[] jArr4 = new long[4096];
            long[] jArr5 = new long[1024];
            this.f91207b.nextBytes(bArr3);
            a.f(bArr4, 0, 224, bArr3, 32);
            int i15 = 0;
            for (int i16 = 0; i16 < 4; i16++) {
                do {
                    i15++;
                    i10 = i16 * 1024;
                    wm.a.C0504a.a(bArr4, i15, jArr2, i16 * 32, i10);
                } while (wm.a.c(jArr2, i10));
            }
            int i17 = 1;
            while (true) {
                i15 += i17;
                wm.a.C0504a.a(bArr4, i15, jArr, 128, i13);
                if (!wm.a.c(jArr, i13)) {
                    break;
                }
                i17 = 1;
                i13 = 0;
            }
            wm.a.b.c(jArr3, bArr4, 160);
            wm.a.b.b(jArr5, jArr);
            for (int i18 = i13; i18 < 4; i18++) {
                int i19 = i18 * 1024;
                wm.a.b.a(jArr4, i19, jArr3, i19, jArr5);
                for (int i20 = i13; i20 < 1024; i20++) {
                    int i21 = i19 + i20;
                    long j10 = jArr4[i21] + jArr2[i21];
                    jArr4[i21] = j10;
                    long j11 = j10 - 343576577;
                    jArr4[i21] = j11;
                    jArr4[i21] = j11 + ((j11 >> 31) & 343576577);
                }
            }
            int i22 = i13;
            int i23 = i22;
            while (i22 < 3712) {
                int i24 = i23 + 1;
                wm.a.b(i22, i13, bArr2, (int) (jArr4[i23] | (jArr4[i24] << 29)));
                long j12 = jArr4[i24] >> 3;
                int i25 = i23 + 2;
                wm.a.b(i22, 1, bArr2, (int) (j12 | (jArr4[i25] << 26)));
                long j13 = jArr4[i25] >> 6;
                int i26 = i23 + 3;
                wm.a.b(i22, 2, bArr2, (int) (j13 | (jArr4[i26] << 23)));
                long j14 = jArr4[i26] >> 9;
                int i27 = i23 + 4;
                wm.a.b(i22, 3, bArr2, (int) (j14 | (jArr4[i27] << 20)));
                long j15 = jArr4[i27] >> 12;
                int i28 = i23 + 5;
                wm.a.b(i22, 4, bArr2, (int) (j15 | (jArr4[i28] << 17)));
                int i29 = i23 + 6;
                wm.a.b(i22, 5, bArr2, (int) ((jArr4[i28] >> 15) | (jArr4[i29] << 14)));
                int i30 = i23 + 7;
                wm.a.b(i22, 6, bArr2, (int) ((jArr4[i29] >> 18) | (jArr4[i30] << 11)));
                int i31 = i23 + 8;
                wm.a.b(i22, 7, bArr2, (int) ((jArr4[i30] >> 21) | (jArr4[i31] << 8)));
                long j16 = jArr4[i31] >> 24;
                int i32 = i23 + 9;
                wm.a.b(i22, 8, bArr2, (int) (j16 | (jArr4[i32] << 5)));
                int i33 = i23 + 11;
                wm.a.b(i22, 9, bArr2, (int) ((jArr4[i32] >> 27) | (jArr4[i23 + 10] << 2) | (jArr4[i33] << 31)));
                long j17 = jArr4[i33] >> 1;
                int i34 = i23 + 12;
                wm.a.b(i22, 10, bArr2, (int) (j17 | (jArr4[i34] << 28)));
                long j18 = jArr4[i34] >> 4;
                int i35 = i23 + 13;
                wm.a.b(i22, 11, bArr2, (int) (j18 | (jArr4[i35] << 25)));
                long j19 = jArr4[i35] >> 7;
                int i36 = i23 + 14;
                wm.a.b(i22, 12, bArr2, (int) (j19 | (jArr4[i36] << 22)));
                long j20 = jArr4[i36] >> 10;
                int i37 = i23 + 15;
                wm.a.b(i22, 13, bArr2, (int) (j20 | (jArr4[i37] << 19)));
                int i38 = i23 + 16;
                wm.a.b(i22, 14, bArr2, (int) ((jArr4[i37] >> 13) | (jArr4[i38] << 16)));
                long j21 = jArr4[i38] >> 16;
                int i39 = i23 + 17;
                wm.a.b(i22, 15, bArr2, (int) (j21 | (jArr4[i39] << 13)));
                long j22 = jArr4[i39] >> 19;
                int i40 = i23 + 18;
                wm.a.b(i22, 16, bArr2, (int) (j22 | (jArr4[i40] << 10)));
                long j23 = jArr4[i40] >> 22;
                int i41 = i23 + 19;
                wm.a.b(i22, 17, bArr2, (int) (j23 | (jArr4[i41] << 7)));
                long j24 = jArr4[i41] >> 25;
                int i42 = i23 + 20;
                wm.a.b(i22, 18, bArr2, (int) (j24 | (jArr4[i42] << 4)));
                int i43 = i23 + 22;
                wm.a.b(i22, 19, bArr2, (int) ((jArr4[i42] >> 28) | (jArr4[i23 + 21] << 1) | (jArr4[i43] << 30)));
                int i44 = i23 + 23;
                wm.a.b(i22, 20, bArr2, (int) ((jArr4[i43] >> 2) | (jArr4[i44] << 27)));
                long j25 = jArr4[i44] >> 5;
                int i45 = i23 + 24;
                wm.a.b(i22, 21, bArr2, (int) (j25 | (jArr4[i45] << 24)));
                long j26 = jArr4[i45] >> 8;
                int i46 = i23 + 25;
                wm.a.b(i22, 22, bArr2, (int) (j26 | (jArr4[i46] << 21)));
                long j27 = jArr4[i46] >> 11;
                int i47 = i23 + 26;
                wm.a.b(i22, 23, bArr2, (int) (j27 | (jArr4[i47] << 18)));
                long j28 = jArr4[i47] >> 14;
                int i48 = i23 + 27;
                wm.a.b(i22, 24, bArr2, (int) (j28 | (jArr4[i48] << 15)));
                int i49 = i23 + 28;
                wm.a.b(i22, 25, bArr2, (int) ((jArr4[i48] >> 17) | (jArr4[i49] << 12)));
                int i50 = i23 + 29;
                wm.a.b(i22, 26, bArr2, (int) ((jArr4[i49] >> 20) | (jArr4[i50] << 9)));
                int i51 = i23 + 30;
                wm.a.b(i22, 27, bArr2, (int) ((jArr4[i50] >> 23) | (jArr4[i51] << 6)));
                wm.a.b(i22, 28, bArr2, (int) ((jArr4[i51] >> 26) | (jArr4[i23 + 31] << 3)));
                i23 += 32;
                i22 += 29;
                bArr4 = bArr4;
                jArr = jArr;
                i13 = 0;
            }
            byte[] bArr5 = bArr4;
            long[] jArr6 = jArr;
            System.arraycopy(bArr5, 160, bArr2, 14848, 32);
            for (int i52 = 0; i52 < 1024; i52++) {
                bArr[i52] = (byte) jArr6[i52];
            }
            for (int i53 = 0; i53 < 4; i53++) {
                for (int i54 = 0; i54 < 1024; i54++) {
                    int i55 = (i53 * 1024) + i54;
                    bArr[1024 + i55] = (byte) jArr2[i55];
                }
            }
            System.arraycopy(bArr5, 160, bArr, 5120, 64);
        } else {
            if (i12 != 6) {
                throw new IllegalArgumentException("unknown security category: " + this.f91206a);
            }
            SecureRandom secureRandom = this.f91207b;
            byte[] bArr6 = new byte[32];
            byte[] bArr7 = new byte[256];
            long[] jArr7 = new long[2048];
            long[] jArr8 = new long[Data.MAX_DATA_BYTES];
            long[] jArr9 = new long[Data.MAX_DATA_BYTES];
            long[] jArr10 = new long[Data.MAX_DATA_BYTES];
            long[] jArr11 = new long[2048];
            secureRandom.nextBytes(bArr6);
            a.g(bArr7, 0, 256, bArr6, 32);
            int i56 = 0;
            for (int i57 = 0; i57 < 5; i57++) {
                do {
                    i56++;
                    i11 = i57 * 2048;
                    b.a.a(bArr7, i56, jArr8, i57 * 32, i11);
                } while (b.c(jArr8, i11));
            }
            while (true) {
                i56 += i14;
                b.a.a(bArr7, i56, jArr7, 160, 0);
                if (!b.c(jArr7, 0)) {
                    break;
                }
                i14 = 1;
            }
            b.C0505b.d(jArr9, bArr7, 192);
            b.C0505b.c(jArr11, jArr7);
            for (int i58 = 0; i58 < 5; i58++) {
                int i59 = i58 * 2048;
                b.C0505b.b(jArr10, i59, jArr9, i59, jArr11);
                for (int i60 = 0; i60 < 2048; i60++) {
                    int i61 = i59 + i60;
                    long j29 = jArr10[i61] + jArr8[i61];
                    jArr10[i61] = j29;
                    long j30 = j29 - 856145921;
                    jArr10[i61] = j30;
                    jArr10[i61] = j30 + ((j30 >> 31) & 856145921);
                }
            }
            for (int i62 = 0; i62 < 2048; i62++) {
                bArr[i62] = (byte) jArr7[i62];
            }
            int i63 = 0;
            for (int i64 = 5; i63 < i64; i64 = 5) {
                for (int i65 = 0; i65 < 2048; i65++) {
                    int i66 = (i63 * 2048) + i65;
                    bArr[2048 + i66] = (byte) jArr8[i66];
                }
                i63++;
            }
            System.arraycopy(bArr7, 192, bArr, 12288, 64);
            int i67 = 0;
            for (int i68 = 0; i68 < 9600; i68 += 15) {
                int i69 = i67 + 1;
                b.b(i68, 0, bArr2, (int) (jArr10[i67] | (jArr10[i69] << 30)));
                long j31 = jArr10[i69] >> 2;
                int i70 = i67 + 2;
                b.b(i68, 1, bArr2, (int) (j31 | (jArr10[i70] << 28)));
                long j32 = jArr10[i70] >> 4;
                int i71 = i67 + 3;
                b.b(i68, 2, bArr2, (int) (j32 | (jArr10[i71] << 26)));
                long j33 = jArr10[i71] >> 6;
                int i72 = i67 + 4;
                b.b(i68, 3, bArr2, (int) (j33 | (jArr10[i72] << 24)));
                long j34 = jArr10[i72] >> 8;
                int i73 = i67 + 5;
                b.b(i68, 4, bArr2, (int) (j34 | (jArr10[i73] << 22)));
                long j35 = jArr10[i73] >> 10;
                int i74 = i67 + 6;
                b.b(i68, 5, bArr2, (int) (j35 | (jArr10[i74] << 20)));
                long j36 = jArr10[i74] >> 12;
                int i75 = i67 + 7;
                b.b(i68, 6, bArr2, (int) (j36 | (jArr10[i75] << 18)));
                long j37 = jArr10[i75] >> 14;
                int i76 = i67 + 8;
                b.b(i68, 7, bArr2, (int) (j37 | (jArr10[i76] << 16)));
                long j38 = jArr10[i76] >> 16;
                int i77 = i67 + 9;
                b.b(i68, 8, bArr2, (int) (j38 | (jArr10[i77] << 14)));
                long j39 = jArr10[i77] >> 18;
                int i78 = i67 + 10;
                b.b(i68, 9, bArr2, (int) (j39 | (jArr10[i78] << 12)));
                long j40 = jArr10[i78] >> 20;
                int i79 = i67 + 11;
                b.b(i68, 10, bArr2, (int) (j40 | (jArr10[i79] << 10)));
                long j41 = jArr10[i79] >> 22;
                int i80 = i67 + 12;
                b.b(i68, 11, bArr2, (int) (j41 | (jArr10[i80] << 8)));
                long j42 = jArr10[i80] >> 24;
                int i81 = i67 + 13;
                b.b(i68, 12, bArr2, (int) (j42 | (jArr10[i81] << 6)));
                long j43 = jArr10[i81] >> 26;
                int i82 = i67 + 14;
                b.b(i68, 13, bArr2, (int) (j43 | (jArr10[i82] << 4)));
                b.b(i68, 14, bArr2, (int) ((jArr10[i82] >> 28) | (jArr10[i67 + 15] << 2)));
                i67 += 16;
            }
            System.arraycopy(bArr7, 192, bArr2, 38400, 32);
        }
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new QTESLAPublicKeyParameters(this.f91206a, bArr2), (AsymmetricKeyParameter) new QTESLAPrivateKeyParameters(this.f91206a, bArr));
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        QTESLAKeyGenerationParameters qTESLAKeyGenerationParameters = (QTESLAKeyGenerationParameters) keyGenerationParameters;
        this.f91207b = qTESLAKeyGenerationParameters.getRandom();
        this.f91206a = qTESLAKeyGenerationParameters.getSecurityCategory();
    }
}
