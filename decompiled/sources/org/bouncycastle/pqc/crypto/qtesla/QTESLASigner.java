package org.bouncycastle.pqc.crypto.qtesla;

import androidx.appcompat.widget.g0;
import androidx.work.Data;
import bn.a;
import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import java.security.SecureRandom;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import okhttp3.internal.ws.WebSocketProtocol;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.MessageSigner;
import wm.b;

/* JADX INFO: loaded from: classes13.dex */
public class QTESLASigner implements MessageSigner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public QTESLAPublicKeyParameters f91212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public QTESLAPrivateKeyParameters f91213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SecureRandom f91214c;

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public byte[] generateSignature(byte[] bArr) {
        int i10;
        int i11;
        boolean z10;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5;
        int i12;
        int i13;
        int i14;
        int securityCategory = this.f91213b.getSecurityCategory();
        if (securityCategory == 5) {
            i10 = 2592;
        } else {
            if (securityCategory != 6) {
                throw new IllegalArgumentException(g0.c("unknown security category: ", securityCategory));
            }
            i10 = 5664;
        }
        byte[] bArr6 = new byte[i10];
        int securityCategory2 = this.f91213b.getSecurityCategory();
        if (securityCategory2 != 5) {
            if (securityCategory2 != 6) {
                throw new IllegalArgumentException("unknown security category: " + this.f91213b.getSecurityCategory());
            }
            int length = bArr.length;
            byte[] secret = this.f91213b.getSecret();
            SecureRandom secureRandom = this.f91214c;
            byte[] bArr7 = new byte[32];
            byte[] bArr8 = new byte[32];
            byte[] bArr9 = new byte[128];
            int[] iArr = new int[40];
            short[] sArr = new short[40];
            long[] jArr = new long[2048];
            long[] jArr2 = new long[2048];
            long[] jArr3 = new long[2048];
            long[] jArr4 = new long[2048];
            long[] jArr5 = new long[Data.MAX_DATA_BYTES];
            long[] jArr6 = new long[Data.MAX_DATA_BYTES];
            long[] jArr7 = new long[Data.MAX_DATA_BYTES];
            byte[] bArr10 = new byte[32];
            secureRandom.nextBytes(bArr10);
            System.arraycopy(bArr10, 0, bArr9, 32, 32);
            System.arraycopy(secret, 12320, bArr9, 0, 32);
            a.g(bArr9, 64, 64, bArr, length);
            a.g(bArr8, 0, 32, bArr9, 128);
            b.C0505b.d(jArr7, secret, 12288);
            int i15 = 0;
            boolean z11 = false;
            while (true) {
                int i16 = i15 + 1;
                byte[] bArr11 = new byte[6145];
                short s4 = (short) (i16 << 8);
                short s7 = (short) (s4 + 1);
                i15 = i16;
                boolean z12 = z11;
                a.b(bArr11, 6144, s4, bArr8, 0);
                int i17 = 0;
                int i18 = 0;
                int i19 = 2048;
                for (int i20 = 2048; i18 < i20; i20 = 2048) {
                    if (i17 >= i19 * 3) {
                        a.b(bArr11, 6144, s7, bArr8, 0);
                        i19 = 56;
                        s7 = (short) (s7 + 1);
                        i14 = 0;
                    } else {
                        i14 = i17;
                    }
                    byte[] bArr12 = bArr8;
                    byte[] bArr13 = secret;
                    long j10 = ((bArr11[i14] & 255) | ((bArr11[i14 + 1] & 255) << 8) | ((bArr11[i14 + 2] & 255) << 16)) & 4194303;
                    jArr[i18] = j10;
                    long j11 = j10 - 2097151;
                    jArr[i18] = j11;
                    if (j11 != SvgConstantsKt.SPECIFIED_MARKER_START) {
                        i18++;
                    }
                    i17 = i14 + 3;
                    secret = bArr13;
                    bArr8 = bArr12;
                }
                byte[] bArr14 = secret;
                byte[] bArr15 = bArr8;
                b.C0505b.c(jArr2, jArr);
                for (int i21 = 0; i21 < 5; i21++) {
                    int i22 = i21 * 2048;
                    b.C0505b.b(jArr5, i22, jArr7, i22, jArr2);
                }
                b.e(64, bArr7, bArr9, jArr5);
                b.d(iArr, sArr, bArr7);
                for (int i23 = 0; i23 < 2048; i23++) {
                    jArr3[i23] = 0;
                }
                int i24 = 0;
                while (i24 < 40) {
                    int i25 = iArr[i24];
                    int i26 = 0;
                    while (i26 < i25) {
                        jArr3[i26] = jArr3[i26] - ((long) (sArr[i24] * bArr14[(i26 + 2048) - i25]));
                        i26++;
                        bArr9 = bArr9;
                    }
                    byte[] bArr16 = bArr9;
                    int i27 = i25;
                    while (i27 < 2048) {
                        jArr3[i27] = jArr3[i27] + ((long) (sArr[i24] * bArr14[i27 - i25]));
                        i27++;
                        jArr7 = jArr7;
                        i25 = i25;
                    }
                    i24++;
                    bArr9 = bArr16;
                }
                bArr9 = bArr9;
                jArr7 = jArr7;
                for (int i28 = 0; i28 < 2048; i28++) {
                    jArr4[i28] = jArr[i28] + jArr3[i28];
                }
                int i29 = 0;
                int i30 = 0;
                for (int i31 = 2048; i29 < i31; i31 = 2048) {
                    long j12 = jArr4[i29];
                    long j13 = j12 >> 63;
                    i30 = (int) (((long) i30) | (2096250 - ((j12 ^ j13) - j13)));
                    i29++;
                }
                if ((i30 >>> 31) <= 0) {
                    z11 = z12;
                    int i32 = 0;
                    while (i32 < 5) {
                        int i33 = i32 * 2048;
                        int i34 = i32 + 1;
                        int i35 = i34 * 2048;
                        for (int i36 = 0; i36 < 2048; i36++) {
                            jArr6[i33 + i36] = 0;
                        }
                        int i37 = 0;
                        while (i37 < 40) {
                            int i38 = iArr[i37];
                            int i39 = 0;
                            while (i39 < i38) {
                                int i40 = i33 + i39;
                                jArr6[i40] = jArr6[i40] - ((long) (bArr14[((i35 + i39) + 2048) - i38] * sArr[i37]));
                                i39++;
                                i33 = i33;
                                i34 = i34;
                            }
                            int i41 = i34;
                            int i42 = i33;
                            int i43 = i38;
                            while (i43 < 2048) {
                                int i44 = i42 + i43;
                                jArr6[i44] = jArr6[i44] + ((long) (sArr[i37] * bArr14[(i35 + i43) - i38]));
                                i43++;
                                i35 = i35;
                            }
                            i37++;
                            i33 = i42;
                            i34 = i41;
                        }
                        int i45 = i34;
                        int i46 = i33;
                        int i47 = 2048;
                        for (int i48 = 0; i48 < 2048; i48++) {
                            int i49 = i46 + i48;
                            jArr5[i49] = b.C0505b.a(jArr5[i49] - jArr6[i49]);
                        }
                        int i50 = 0;
                        while (true) {
                            if (i50 >= i47) {
                                z11 = false;
                                break;
                            }
                            long j14 = jArr5[i46 + i50];
                            int i51 = ((int) (428072960 - j14)) >> 31;
                            int i52 = (int) ((((long) i51) & (j14 - 856145921)) | (j14 & ((long) (~i51))));
                            int i53 = i52 >> 31;
                            int i54 = (~(((i53 ^ i52) - i53) - 428072059)) >>> 31;
                            int i55 = i52 - (((8388607 + i52) >> 24) << 24);
                            int i56 = i55 >> 31;
                            if ((((~(((i55 ^ i56) - i56) - 8387707)) >>> 31) | i54) == 1) {
                                z11 = true;
                                break;
                            }
                            i50++;
                            i47 = 2048;
                        }
                        if (z11) {
                            break;
                        }
                        i32 = i45;
                    }
                    if (!z11) {
                        break;
                    }
                } else {
                    z11 = z12;
                }
                secret = bArr14;
                bArr8 = bArr15;
            }
            int i57 = 0;
            for (int i58 = 0; i58 < 1408; i58 += 11) {
                int i59 = i57 + 1;
                b.b(i58, 0, bArr6, (int) ((jArr4[i57] & 4194303) | (jArr4[i59] << 22)));
                int i60 = i57 + 2;
                b.b(i58, 1, bArr6, (int) (((jArr4[i59] >>> 10) & 4095) | (jArr4[i60] << 12)));
                int i61 = i57 + 4;
                b.b(i58, 2, bArr6, (int) (((jArr4[i60] >>> 20) & 3) | ((jArr4[i57 + 3] & 4194303) << 2) | (jArr4[i61] << 24)));
                long j15 = (jArr4[i61] >>> 8) & 16383;
                int i62 = i57 + 5;
                b.b(i58, 3, bArr6, (int) (j15 | (jArr4[i62] << 14)));
                int i63 = i57 + 7;
                b.b(i58, 4, bArr6, (int) (((jArr4[i62] >>> 18) & 15) | ((jArr4[i57 + 6] & 4194303) << 4) | (jArr4[i63] << 26)));
                long j16 = (jArr4[i63] >>> 6) & WebSocketProtocol.PAYLOAD_SHORT_MAX;
                int i64 = i57 + 8;
                b.b(i58, 5, bArr6, (int) (j16 | (jArr4[i64] << 16)));
                long j17 = ((jArr4[i64] >>> 16) & 63) | ((jArr4[i57 + 9] & 4194303) << 6);
                int i65 = i57 + 10;
                b.b(i58, 6, bArr6, (int) (j17 | (jArr4[i65] << 28)));
                long j18 = (jArr4[i65] >>> 4) & 262143;
                int i66 = i57 + 11;
                b.b(i58, 7, bArr6, (int) (j18 | (jArr4[i66] << 18)));
                int i67 = i57 + 13;
                b.b(i58, 8, bArr6, (int) (((4194303 & jArr4[i57 + 12]) << 8) | ((jArr4[i66] >>> 14) & 255) | (jArr4[i67] << 30)));
                long j19 = (jArr4[i67] >>> 2) & 1048575;
                int i68 = i57 + 14;
                b.b(i58, 9, bArr6, (int) (j19 | (jArr4[i68] << 20)));
                b.b(i58, 10, bArr6, (int) (((jArr4[i68] >>> 12) & 1023) | (jArr4[i57 + 15] << 10)));
                i57 += 16;
            }
            System.arraycopy(bArr7, 0, bArr6, 5632, 32);
            return bArr6;
        }
        int length2 = bArr.length;
        byte[] secret2 = this.f91213b.getSecret();
        byte[] bArr17 = new byte[32];
        byte[] bArr18 = new byte[32];
        byte[] bArr19 = new byte[128];
        int[] iArr2 = new int[25];
        short[] sArr2 = new short[25];
        long[] jArr8 = new long[1024];
        long[] jArr9 = new long[1024];
        long[] jArr10 = new long[1024];
        long[] jArr11 = new long[1024];
        long[] jArr12 = new long[4096];
        byte[] bArr20 = bArr6;
        long[] jArr13 = new long[4096];
        long[] jArr14 = new long[4096];
        byte[] bArr21 = new byte[32];
        this.f91214c.nextBytes(bArr21);
        System.arraycopy(bArr21, 0, bArr19, 32, 32);
        System.arraycopy(secret2, 5152, bArr19, 0, 32);
        a.f(bArr19, 64, 64, bArr, length2);
        a.f(bArr18, 0, 32, bArr19, 128);
        wm.a.b.c(jArr14, secret2, 5120);
        int i69 = 0;
        boolean z13 = false;
        while (true) {
            int i70 = 1;
            while (true) {
                i11 = i69 + i70;
                byte[] bArr22 = new byte[3073];
                short s9 = (short) (i11 << 8);
                short s10 = (short) (s9 + 1);
                z10 = z13;
                a.a(bArr22, 3072, s9, bArr18, 0);
                int i71 = 0;
                int i72 = 0;
                int i73 = 1024;
                for (int i74 = 1024; i72 < i74; i74 = 1024) {
                    if (i71 >= i73 * 3) {
                        a.a(bArr22, 3072, s10, bArr18, 0);
                        i73 = 56;
                        s10 = (short) (s10 + 1);
                        i13 = 0;
                    } else {
                        i13 = i71;
                    }
                    short s11 = s10;
                    byte[] bArr23 = bArr22;
                    byte[] bArr24 = secret2;
                    long j20 = ((bArr22[i13] & 255) | ((bArr22[i13 + 1] & 255) << 8) | ((bArr22[i13 + 2] & 255) << 16)) & 1048575;
                    jArr8[i72] = j20;
                    long j21 = j20 - 524287;
                    jArr8[i72] = j21;
                    if (j21 != SvgConstantsKt.SPECIFIED_OVERFLOW) {
                        i72++;
                    }
                    i71 = i13 + 3;
                    secret2 = bArr24;
                    bArr22 = bArr23;
                    s10 = s11;
                }
                bArr2 = secret2;
                wm.a.b.b(jArr9, jArr8);
                for (int i75 = 0; i75 < 4; i75++) {
                    int i76 = i75 * 1024;
                    wm.a.b.a(jArr12, i76, jArr14, i76, jArr9);
                }
                wm.a.e(64, bArr17, bArr19, jArr12);
                wm.a.d(iArr2, sArr2, bArr17);
                for (int i77 = 0; i77 < 1024; i77++) {
                    jArr10[i77] = 0;
                }
                int i78 = 0;
                while (i78 < 25) {
                    int i79 = iArr2[i78];
                    int i80 = 0;
                    while (i80 < i79) {
                        jArr10[i80] = jArr10[i80] - ((long) (sArr2[i78] * bArr2[(i80 + 1024) - i79]));
                        i80++;
                        bArr18 = bArr18;
                        bArr19 = bArr19;
                    }
                    byte[] bArr25 = bArr18;
                    byte[] bArr26 = bArr19;
                    int i81 = i79;
                    while (i81 < 1024) {
                        jArr10[i81] = jArr10[i81] + ((long) (sArr2[i78] * bArr2[i81 - i79]));
                        i81++;
                        i79 = i79;
                    }
                    i78++;
                    bArr18 = bArr25;
                    bArr19 = bArr26;
                }
                bArr3 = bArr18;
                bArr4 = bArr19;
                for (int i82 = 0; i82 < 1024; i82++) {
                    jArr11[i82] = jArr8[i82] + jArr10[i82];
                }
                int i83 = 0;
                int i84 = 0;
                for (int i85 = 1024; i83 < i85; i85 = 1024) {
                    long j22 = jArr11[i83];
                    long j23 = j22 >> 63;
                    i84 = (int) (((long) i84) | (523733 - ((j23 ^ j22) - j23)));
                    i83++;
                }
                if ((i84 >>> 31) <= 0) {
                    break;
                }
                bArr18 = bArr3;
                secret2 = bArr2;
                z13 = z10;
                bArr19 = bArr4;
                i70 = 1;
                i69 = i11;
            }
            z13 = z10;
            int i86 = 0;
            while (true) {
                if (i86 >= 4) {
                    bArr5 = bArr3;
                    break;
                }
                int i87 = i86 * 1024;
                int i88 = i86 + 1;
                int i89 = i88 * 1024;
                for (int i90 = 0; i90 < 1024; i90++) {
                    jArr13[i87 + i90] = 0;
                }
                int i91 = 0;
                while (i91 < 25) {
                    int i92 = iArr2[i91];
                    int i93 = 0;
                    while (i93 < i92) {
                        int i94 = i87 + i93;
                        jArr13[i94] = jArr13[i94] - ((long) (bArr2[((i89 + i93) + 1024) - i92] * sArr2[i91]));
                        i93++;
                        i89 = i89;
                        bArr3 = bArr3;
                        i88 = i88;
                    }
                    byte[] bArr27 = bArr3;
                    int i95 = i88;
                    int i96 = i89;
                    int i97 = i92;
                    while (i97 < 1024) {
                        int i98 = i87 + i97;
                        jArr13[i98] = jArr13[i98] + ((long) (sArr2[i91] * bArr2[(i96 + i97) - i92]));
                        i97++;
                        i92 = i92;
                    }
                    i91++;
                    i89 = i96;
                    bArr3 = bArr27;
                    i88 = i95;
                }
                bArr5 = bArr3;
                int i99 = i88;
                int i100 = 0;
                while (true) {
                    i12 = 1024;
                    if (i100 >= 1024) {
                        break;
                    }
                    int i101 = i87 + i100;
                    long j24 = jArr12[i101] - jArr13[i101];
                    jArr12[i101] = j24 - (((3 * j24) >> 30) * 343576577);
                    i100++;
                }
                int i102 = 0;
                while (true) {
                    if (i102 >= i12) {
                        z13 = false;
                        break;
                    }
                    long j25 = jArr12[i87 + i102];
                    int i103 = ((int) (171788288 - j25)) >> 31;
                    int i104 = (int) (((j25 - 343576577) & ((long) i103)) | (j25 & ((long) (~i103))));
                    int i105 = i104 >> 31;
                    int i106 = (~(((i105 ^ i104) - i105) - 171787734)) >>> 31;
                    int i107 = i104 - (((2097151 + i104) >> 22) << 22);
                    int i108 = i107 >> 31;
                    if ((((~(((i107 ^ i108) - i108) - 2096598)) >>> 31) | i106) == 1) {
                        z13 = true;
                        break;
                    }
                    i102++;
                    i12 = 1024;
                }
                if (z13) {
                    break;
                }
                bArr3 = bArr5;
                i86 = i99;
            }
            if (!z13) {
                break;
            }
            i69 = i11;
            secret2 = bArr2;
            bArr19 = bArr4;
            bArr18 = bArr5;
        }
        int i109 = 0;
        int i110 = 0;
        while (i110 < 640) {
            int i111 = i109 + 1;
            byte[] bArr28 = bArr20;
            wm.a.b(i110, 0, bArr28, (int) ((jArr11[i109] & 1048575) | (jArr11[i111] << 20)));
            int i112 = i109 + 3;
            wm.a.b(i110, 1, bArr28, (int) (((jArr11[i111] >>> 12) & 255) | ((jArr11[i109 + 2] & 1048575) << 8) | (jArr11[i112] << 28)));
            long j26 = (jArr11[i112] >>> 4) & WebSocketProtocol.PAYLOAD_SHORT_MAX;
            int i113 = i109 + 4;
            wm.a.b(i110, 2, bArr28, (int) (j26 | (jArr11[i113] << 16)));
            long j27 = ((jArr11[i113] >>> 16) & 15) | ((jArr11[i109 + 5] & 1048575) << 4);
            int i114 = i109 + 6;
            wm.a.b(i110, 3, bArr28, (int) (j27 | (jArr11[i114] << 24)));
            wm.a.b(i110, 4, bArr28, (int) (((jArr11[i114] >>> 8) & 4095) | (jArr11[i109 + 7] << 12)));
            int i115 = i109 + 9;
            wm.a.b(i110, 5, bArr28, (int) ((jArr11[i109 + 8] & 1048575) | (jArr11[i115] << 20)));
            int i116 = i109 + 11;
            wm.a.b(i110, 6, bArr28, (int) (((jArr11[i115] >>> 12) & 255) | ((jArr11[i109 + 10] & 1048575) << 8) | (jArr11[i116] << 28)));
            int i117 = i109 + 12;
            wm.a.b(i110, 7, bArr28, (int) (((jArr11[i116] >>> 4) & WebSocketProtocol.PAYLOAD_SHORT_MAX) | (jArr11[i117] << 16)));
            int i118 = i109 + 14;
            wm.a.b(i110, 8, bArr28, (int) (((jArr11[i117] >>> 16) & 15) | ((jArr11[i109 + 13] & 1048575) << 4) | (jArr11[i118] << 24)));
            wm.a.b(i110, 9, bArr28, (int) (((jArr11[i118] >>> 8) & 4095) | (jArr11[i109 + 15] << 12)));
            i109 += 16;
            i110 += 10;
            bArr20 = bArr28;
        }
        byte[] bArr29 = bArr20;
        System.arraycopy(bArr17, 0, bArr29, 2560, 32);
        return bArr29;
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public void init(boolean z10, CipherParameters cipherParameters) {
        if (!z10) {
            this.f91213b = null;
            QTESLAPublicKeyParameters qTESLAPublicKeyParameters = (QTESLAPublicKeyParameters) cipherParameters;
            this.f91212a = qTESLAPublicKeyParameters;
            int securityCategory = qTESLAPublicKeyParameters.getSecurityCategory();
            if (securityCategory != 5 && securityCategory != 6) {
                throw new IllegalArgumentException(g0.c("unknown security category: ", securityCategory));
            }
            return;
        }
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.f91214c = parametersWithRandom.getRandom();
            this.f91213b = (QTESLAPrivateKeyParameters) parametersWithRandom.getParameters();
        } else {
            this.f91214c = CryptoServicesRegistrar.getSecureRandom();
            this.f91213b = (QTESLAPrivateKeyParameters) cipherParameters;
        }
        this.f91212a = null;
        int securityCategory2 = this.f91213b.getSecurityCategory();
        if (securityCategory2 != 5 && securityCategory2 != 6) {
            throw new IllegalArgumentException(g0.c("unknown security category: ", securityCategory2));
        }
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public boolean verifySignature(byte[] bArr, byte[] bArr2) {
        boolean z10;
        boolean z11;
        byte[] bArr3;
        int securityCategory = this.f91212a.getSecurityCategory();
        if (securityCategory == 5) {
            int length = bArr2.length;
            byte[] publicData = this.f91212a.getPublicData();
            byte[] bArr4 = new byte[32];
            byte[] bArr5 = new byte[32];
            byte[] bArr6 = new byte[32];
            byte[] bArr7 = new byte[64];
            int[] iArr = new int[25];
            short[] sArr = new short[25];
            int[] iArr2 = new int[4096];
            long[] jArr = new long[4096];
            long[] jArr2 = new long[4096];
            long[] jArr3 = new long[4096];
            long[] jArr4 = new long[1024];
            long[] jArr5 = new long[1024];
            if (length < 2592) {
                z11 = false;
            } else {
                int i10 = 0;
                int i11 = 1024;
                int i12 = 0;
                while (i10 < i11) {
                    int[] iArr3 = iArr;
                    jArr4[i10] = (wm.a.a(i12, 0, bArr2) << 12) >> 12;
                    jArr4[i10 + 1] = (wm.a.a(i12, 0, bArr2) >>> 20) | ((wm.a.a(i12, 1, bArr2) << 24) >> 12);
                    jArr4[i10 + 2] = (wm.a.a(i12, 1, bArr2) << 4) >> 12;
                    jArr4[i10 + 3] = (wm.a.a(i12, 1, bArr2) >>> 28) | ((wm.a.a(i12, 2, bArr2) << 16) >> 12);
                    int i13 = i12;
                    jArr4[i10 + 4] = (wm.a.a(i12, 2, bArr2) >>> 16) | ((wm.a.a(i12, 3, bArr2) << 28) >> 12);
                    jArr4[i10 + 5] = (wm.a.a(i13, 3, bArr2) << 8) >> 12;
                    jArr4[i10 + 6] = (wm.a.a(i13, 3, bArr2) >>> 24) | ((wm.a.a(i13, 4, bArr2) << 20) >> 12);
                    jArr4[i10 + 7] = wm.a.a(i13, 4, bArr2) >> 12;
                    jArr4[i10 + 8] = (wm.a.a(i13, 5, bArr2) << 12) >> 12;
                    jArr4[i10 + 9] = (wm.a.a(i13, 5, bArr2) >>> 20) | ((wm.a.a(i13, 6, bArr2) << 24) >> 12);
                    jArr4[i10 + 10] = (wm.a.a(i13, 6, bArr2) << 4) >> 12;
                    jArr4[i10 + 11] = (wm.a.a(i13, 6, bArr2) >>> 28) | ((wm.a.a(i13, 7, bArr2) << 16) >> 12);
                    jArr4[i10 + 12] = (wm.a.a(i13, 7, bArr2) >>> 16) | ((wm.a.a(i13, 8, bArr2) << 28) >> 12);
                    jArr4[i10 + 13] = (wm.a.a(i13, 8, bArr2) << 8) >> 12;
                    jArr4[i10 + 14] = (wm.a.a(i13, 8, bArr2) >>> 24) | ((wm.a.a(i13, 9, bArr2) << 20) >> 12);
                    jArr4[i10 + 15] = wm.a.a(i13, 9, bArr2) >> 12;
                    i10 += 16;
                    jArr = jArr;
                    sArr = sArr;
                    jArr2 = jArr2;
                    i11 = 1024;
                    i12 = i13 + 10;
                    iArr = iArr3;
                }
                int[] iArr4 = iArr;
                short[] sArr2 = sArr;
                long[] jArr6 = jArr;
                long[] jArr7 = jArr2;
                System.arraycopy(bArr2, 2560, bArr4, 0, 32);
                int i14 = 0;
                while (true) {
                    if (i14 >= 1024) {
                        int i15 = 0;
                        for (int i16 = 0; i16 < 4096; i16 += 32) {
                            iArr2[i16] = wm.a.a(i15, 0, publicData) & 536870911;
                            iArr2[i16 + 1] = ((wm.a.a(i15, 0, publicData) >>> 29) | (wm.a.a(i15, 1, publicData) << 3)) & 536870911;
                            iArr2[i16 + 2] = ((wm.a.a(i15, 1, publicData) >>> 26) | (wm.a.a(i15, 2, publicData) << 6)) & 536870911;
                            iArr2[i16 + 3] = ((wm.a.a(i15, 2, publicData) >>> 23) | (wm.a.a(i15, 3, publicData) << 9)) & 536870911;
                            iArr2[i16 + 4] = ((wm.a.a(i15, 3, publicData) >>> 20) | (wm.a.a(i15, 4, publicData) << 12)) & 536870911;
                            iArr2[i16 + 5] = ((wm.a.a(i15, 4, publicData) >>> 17) | (wm.a.a(i15, 5, publicData) << 15)) & 536870911;
                            iArr2[i16 + 6] = ((wm.a.a(i15, 5, publicData) >>> 14) | (wm.a.a(i15, 6, publicData) << 18)) & 536870911;
                            iArr2[i16 + 7] = ((wm.a.a(i15, 6, publicData) >>> 11) | (wm.a.a(i15, 7, publicData) << 21)) & 536870911;
                            iArr2[i16 + 8] = ((wm.a.a(i15, 7, publicData) >>> 8) | (wm.a.a(i15, 8, publicData) << 24)) & 536870911;
                            iArr2[i16 + 9] = ((wm.a.a(i15, 8, publicData) >>> 5) | (wm.a.a(i15, 9, publicData) << 27)) & 536870911;
                            iArr2[i16 + 10] = (wm.a.a(i15, 9, publicData) >>> 2) & 536870911;
                            iArr2[i16 + 11] = ((wm.a.a(i15, 9, publicData) >>> 31) | (wm.a.a(i15, 10, publicData) << 1)) & 536870911;
                            iArr2[i16 + 12] = ((wm.a.a(i15, 10, publicData) >>> 28) | (wm.a.a(i15, 11, publicData) << 4)) & 536870911;
                            iArr2[i16 + 13] = ((wm.a.a(i15, 11, publicData) >>> 25) | (wm.a.a(i15, 12, publicData) << 7)) & 536870911;
                            iArr2[i16 + 14] = ((wm.a.a(i15, 12, publicData) >>> 22) | (wm.a.a(i15, 13, publicData) << 10)) & 536870911;
                            iArr2[i16 + 15] = ((wm.a.a(i15, 13, publicData) >>> 19) | (wm.a.a(i15, 14, publicData) << 13)) & 536870911;
                            iArr2[i16 + 16] = ((wm.a.a(i15, 14, publicData) >>> 16) | (wm.a.a(i15, 15, publicData) << 16)) & 536870911;
                            iArr2[i16 + 17] = ((wm.a.a(i15, 15, publicData) >>> 13) | (wm.a.a(i15, 16, publicData) << 19)) & 536870911;
                            iArr2[i16 + 18] = ((wm.a.a(i15, 16, publicData) >>> 10) | (wm.a.a(i15, 17, publicData) << 22)) & 536870911;
                            iArr2[i16 + 19] = ((wm.a.a(i15, 17, publicData) >>> 7) | (wm.a.a(i15, 18, publicData) << 25)) & 536870911;
                            iArr2[i16 + 20] = ((wm.a.a(i15, 18, publicData) >>> 4) | (wm.a.a(i15, 19, publicData) << 28)) & 536870911;
                            iArr2[i16 + 21] = (wm.a.a(i15, 19, publicData) >>> 1) & 536870911;
                            iArr2[i16 + 22] = ((wm.a.a(i15, 19, publicData) >>> 30) | (wm.a.a(i15, 20, publicData) << 2)) & 536870911;
                            iArr2[i16 + 23] = ((wm.a.a(i15, 20, publicData) >>> 27) | (wm.a.a(i15, 21, publicData) << 5)) & 536870911;
                            iArr2[i16 + 24] = ((wm.a.a(i15, 21, publicData) >>> 24) | (wm.a.a(i15, 22, publicData) << 8)) & 536870911;
                            iArr2[i16 + 25] = ((wm.a.a(i15, 22, publicData) >>> 21) | (wm.a.a(i15, 23, publicData) << 11)) & 536870911;
                            iArr2[i16 + 26] = ((wm.a.a(i15, 23, publicData) >>> 18) | (wm.a.a(i15, 24, publicData) << 14)) & 536870911;
                            iArr2[i16 + 27] = ((wm.a.a(i15, 24, publicData) >>> 15) | (wm.a.a(i15, 25, publicData) << 17)) & 536870911;
                            iArr2[i16 + 28] = ((wm.a.a(i15, 25, publicData) >>> 12) | (wm.a.a(i15, 26, publicData) << 20)) & 536870911;
                            iArr2[i16 + 29] = ((wm.a.a(i15, 26, publicData) >>> 9) | (wm.a.a(i15, 27, publicData) << 23)) & 536870911;
                            iArr2[i16 + 30] = ((wm.a.a(i15, 27, publicData) >>> 6) | (wm.a.a(i15, 28, publicData) << 26)) & 536870911;
                            iArr2[i16 + 31] = wm.a.a(i15, 28, publicData) >>> 3;
                            i15 += 29;
                        }
                        z10 = true;
                        System.arraycopy(publicData, 14848, bArr6, 0, 32);
                        wm.a.b.c(jArr7, bArr6, 0);
                        int[] iArr5 = iArr4;
                        wm.a.d(iArr5, sArr2, bArr4);
                        wm.a.b.b(jArr5, jArr4);
                        int i17 = 0;
                        while (i17 < 4) {
                            int i18 = i17 * 1024;
                            for (int i19 = 0; i19 < 1024; i19++) {
                                jArr3[i18 + i19] = 0;
                            }
                            int i20 = 0;
                            while (i20 < 25) {
                                int i21 = iArr5[i20];
                                int i22 = 0;
                                while (i22 < i21) {
                                    int i23 = i18 + i22;
                                    jArr3[i23] = jArr3[i23] - ((long) (iArr2[(i23 + 1024) - i21] * sArr2[i20]));
                                    i22++;
                                    i17 = i17;
                                    iArr5 = iArr5;
                                }
                                int[] iArr6 = iArr5;
                                int i24 = i17;
                                int i25 = i21;
                                while (i25 < 1024) {
                                    int i26 = i18 + i25;
                                    jArr3[i26] = jArr3[i26] + ((long) (sArr2[i20] * iArr2[i26 - i21]));
                                    i25++;
                                    i21 = i21;
                                    iArr2 = iArr2;
                                }
                                i20++;
                                i17 = i24;
                                iArr5 = iArr6;
                            }
                            int[] iArr7 = iArr5;
                            int i27 = i17;
                            int[] iArr8 = iArr2;
                            wm.a.b.a(jArr6, i18, jArr7, i18, jArr5);
                            for (int i28 = 0; i28 < 1024; i28++) {
                                int i29 = i18 + i28;
                                long j10 = jArr6[i29] - jArr3[i29];
                                jArr6[i29] = j10 - (((3 * j10) >> 30) * 343576577);
                            }
                            i17 = i27 + 1;
                            iArr2 = iArr8;
                            iArr5 = iArr7;
                        }
                        z11 = false;
                        a.f(bArr7, 0, 64, bArr, bArr.length);
                        wm.a.e(0, bArr5, bArr7, jArr6);
                        for (int i30 = 0; i30 < 32; i30++) {
                            if (bArr4[i30] != bArr5[i30]) {
                                break;
                            }
                        }
                        return z10;
                    }
                    long j11 = jArr4[i14];
                    if (j11 < -523733 || j11 > 523733) {
                        z11 = false;
                    } else {
                        i14++;
                    }
                }
            }
        } else {
            if (securityCategory != 6) {
                throw new IllegalArgumentException("unknown security category: " + this.f91212a.getSecurityCategory());
            }
            int length2 = bArr2.length;
            byte[] publicData2 = this.f91212a.getPublicData();
            byte[] bArr8 = new byte[32];
            byte[] bArr9 = new byte[32];
            byte[] bArr10 = new byte[32];
            byte[] bArr11 = new byte[64];
            int[] iArr9 = new int[40];
            short[] sArr3 = new short[40];
            int[] iArr10 = new int[Data.MAX_DATA_BYTES];
            long[] jArr8 = new long[Data.MAX_DATA_BYTES];
            long[] jArr9 = new long[Data.MAX_DATA_BYTES];
            long[] jArr10 = new long[Data.MAX_DATA_BYTES];
            long[] jArr11 = new long[2048];
            long[] jArr12 = new long[2048];
            if (length2 >= 5664) {
                int i31 = 0;
                int i32 = 0;
                while (true) {
                    bArr3 = bArr11;
                    if (i31 >= 2048) {
                        break;
                    }
                    jArr11[i31] = (b.a(i32, 0, bArr2) << 10) >> 10;
                    int i33 = i32;
                    jArr11[i31 + 1] = (b.a(i32, 0, bArr2) >>> 22) | ((b.a(i32, 1, bArr2) << 20) >> 10);
                    jArr11[i31 + 2] = (b.a(i33, 1, bArr2) >>> 12) | ((b.a(i33, 2, bArr2) << 30) >> 10);
                    jArr11[i31 + 3] = (b.a(i33, 2, bArr2) << 8) >> 10;
                    jArr11[i31 + 4] = (b.a(i33, 2, bArr2) >>> 24) | ((b.a(i33, 3, bArr2) << 18) >> 10);
                    jArr11[i31 + 5] = (b.a(i33, 3, bArr2) >>> 14) | ((b.a(i33, 4, bArr2) << 28) >> 10);
                    jArr11[i31 + 6] = (b.a(i33, 4, bArr2) << 6) >> 10;
                    jArr11[i31 + 7] = (b.a(i33, 4, bArr2) >>> 26) | ((b.a(i33, 5, bArr2) << 16) >> 10);
                    jArr11[i31 + 8] = (b.a(i33, 5, bArr2) >>> 16) | ((b.a(i33, 6, bArr2) << 26) >> 10);
                    jArr11[i31 + 9] = (b.a(i33, 6, bArr2) << 4) >> 10;
                    jArr11[i31 + 10] = (b.a(i33, 6, bArr2) >>> 28) | ((b.a(i33, 7, bArr2) << 14) >> 10);
                    jArr11[i31 + 11] = (b.a(i33, 7, bArr2) >>> 18) | ((b.a(i33, 8, bArr2) << 24) >> 10);
                    jArr11[i31 + 12] = (b.a(i33, 8, bArr2) << 2) >> 10;
                    jArr11[i31 + 13] = (b.a(i33, 8, bArr2) >>> 30) | ((b.a(i33, 9, bArr2) << 12) >> 10);
                    jArr11[i31 + 14] = ((b.a(i33, 10, bArr2) << 22) >> 10) | (b.a(i33, 9, bArr2) >>> 20);
                    jArr11[i31 + 15] = b.a(i33, 10, bArr2) >> 10;
                    i32 = i33 + 11;
                    i31 += 16;
                    bArr11 = bArr3;
                    bArr8 = bArr8;
                    bArr10 = bArr10;
                    publicData2 = publicData2;
                }
                byte[] bArr12 = bArr10;
                byte[] bArr13 = publicData2;
                byte[] bArr14 = bArr8;
                System.arraycopy(bArr2, 5632, bArr14, 0, 32);
                int i34 = 0;
                while (true) {
                    if (i34 < 2048) {
                        long j12 = jArr11[i34];
                        if (j12 < -2096250 || j12 > 2096250) {
                            break;
                        }
                        i34++;
                    } else {
                        int i35 = 0;
                        for (int i36 = 0; i36 < 10240; i36 += 16) {
                            iArr10[i36] = b.a(i35, 0, bArr13) & LockFreeTaskQueueCore.MAX_CAPACITY_MASK;
                            iArr10[i36 + 1] = ((b.a(i35, 0, bArr13) >>> 30) | (b.a(i35, 1, bArr13) << 2)) & LockFreeTaskQueueCore.MAX_CAPACITY_MASK;
                            iArr10[i36 + 2] = ((b.a(i35, 1, bArr13) >>> 28) | (b.a(i35, 2, bArr13) << 4)) & LockFreeTaskQueueCore.MAX_CAPACITY_MASK;
                            iArr10[i36 + 3] = ((b.a(i35, 2, bArr13) >>> 26) | (b.a(i35, 3, bArr13) << 6)) & LockFreeTaskQueueCore.MAX_CAPACITY_MASK;
                            iArr10[i36 + 4] = ((b.a(i35, 3, bArr13) >>> 24) | (b.a(i35, 4, bArr13) << 8)) & LockFreeTaskQueueCore.MAX_CAPACITY_MASK;
                            iArr10[i36 + 5] = ((b.a(i35, 4, bArr13) >>> 22) | (b.a(i35, 5, bArr13) << 10)) & LockFreeTaskQueueCore.MAX_CAPACITY_MASK;
                            iArr10[i36 + 6] = ((b.a(i35, 5, bArr13) >>> 20) | (b.a(i35, 6, bArr13) << 12)) & LockFreeTaskQueueCore.MAX_CAPACITY_MASK;
                            iArr10[i36 + 7] = ((b.a(i35, 6, bArr13) >>> 18) | (b.a(i35, 7, bArr13) << 14)) & LockFreeTaskQueueCore.MAX_CAPACITY_MASK;
                            iArr10[i36 + 8] = ((b.a(i35, 7, bArr13) >>> 16) | (b.a(i35, 8, bArr13) << 16)) & LockFreeTaskQueueCore.MAX_CAPACITY_MASK;
                            iArr10[i36 + 9] = ((b.a(i35, 8, bArr13) >>> 14) | (b.a(i35, 9, bArr13) << 18)) & LockFreeTaskQueueCore.MAX_CAPACITY_MASK;
                            iArr10[i36 + 10] = ((b.a(i35, 9, bArr13) >>> 12) | (b.a(i35, 10, bArr13) << 20)) & LockFreeTaskQueueCore.MAX_CAPACITY_MASK;
                            iArr10[i36 + 11] = ((b.a(i35, 10, bArr13) >>> 10) | (b.a(i35, 11, bArr13) << 22)) & LockFreeTaskQueueCore.MAX_CAPACITY_MASK;
                            iArr10[i36 + 12] = ((b.a(i35, 11, bArr13) >>> 8) | (b.a(i35, 12, bArr13) << 24)) & LockFreeTaskQueueCore.MAX_CAPACITY_MASK;
                            iArr10[i36 + 13] = ((b.a(i35, 12, bArr13) >>> 6) | (b.a(i35, 13, bArr13) << 26)) & LockFreeTaskQueueCore.MAX_CAPACITY_MASK;
                            iArr10[i36 + 14] = ((b.a(i35, 13, bArr13) >>> 4) | (b.a(i35, 14, bArr13) << 28)) & LockFreeTaskQueueCore.MAX_CAPACITY_MASK;
                            iArr10[i36 + 15] = (b.a(i35, 14, bArr13) >>> 2) & LockFreeTaskQueueCore.MAX_CAPACITY_MASK;
                            i35 += 15;
                        }
                        System.arraycopy(bArr13, 38400, bArr12, 0, 32);
                        b.C0505b.d(jArr9, bArr12, 0);
                        b.d(iArr9, sArr3, bArr14);
                        b.C0505b.c(jArr12, jArr11);
                        int i37 = 0;
                        while (i37 < 5) {
                            int i38 = i37 * 2048;
                            for (int i39 = 0; i39 < 2048; i39++) {
                                jArr10[i38 + i39] = 0;
                            }
                            int i40 = 0;
                            while (i40 < 40) {
                                int i41 = iArr9[i40];
                                int i42 = 0;
                                while (i42 < i41) {
                                    int i43 = i38 + i42;
                                    jArr10[i43] = jArr10[i43] - ((long) (sArr3[i40] * iArr10[(i43 + 2048) - i41]));
                                    i42++;
                                    iArr9 = iArr9;
                                    jArr9 = jArr9;
                                }
                                long[] jArr13 = jArr9;
                                int[] iArr11 = iArr9;
                                int i44 = i41;
                                while (i44 < 2048) {
                                    int i45 = i38 + i44;
                                    jArr10[i45] = jArr10[i45] + ((long) (sArr3[i40] * iArr10[i45 - i41]));
                                    i44++;
                                    i41 = i41;
                                    iArr11 = iArr11;
                                }
                                i40++;
                                iArr9 = iArr11;
                                jArr9 = jArr13;
                            }
                            long[] jArr14 = jArr9;
                            int[] iArr12 = iArr9;
                            b.C0505b.b(jArr8, i38, jArr14, i38, jArr12);
                            for (int i46 = 0; i46 < 2048; i46++) {
                                int i47 = i38 + i46;
                                jArr8[i47] = b.C0505b.a(jArr8[i47] - jArr10[i47]);
                            }
                            i37++;
                            jArr9 = jArr14;
                            iArr9 = iArr12;
                        }
                        a.g(bArr3, 0, 64, bArr, bArr.length);
                        b.e(0, bArr9, bArr3, jArr8);
                        int i48 = 0;
                        while (true) {
                            if (i48 >= 32) {
                                z10 = true;
                                return z10;
                            }
                            if (bArr14[i48] != bArr9[i48]) {
                                break;
                            }
                            i48++;
                        }
                    }
                }
            }
            z11 = false;
        }
        return z11;
    }
}
