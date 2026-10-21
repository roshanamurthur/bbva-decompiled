package org.bouncycastle.pqc.crypto.sphincs;

import androidx.camera.camera2.internal.compat.u;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.material.internal.ViewUtils;
import com.google.android.play.core.splitinstall.internal.i;
import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.MessageSigner;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes13.dex */
public class SPHINCS256Signer implements MessageSigner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xm.a f91259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f91260b;

    public SPHINCS256Signer(Digest digest, Digest digest2) {
        if (digest.getDigestSize() != 32) {
            throw new IllegalArgumentException("n-digest needs to produce 32 bytes of output");
        }
        if (digest2.getDigestSize() != 64) {
            throw new IllegalArgumentException("2n-digest needs to produce 64 bytes of output");
        }
        this.f91259a = new xm.a(digest, digest2);
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public byte[] generateSignature(byte[] bArr) {
        byte[] bArr2 = this.f91260b;
        byte[] bArr3 = new byte[41000];
        byte[] bArr4 = new byte[32];
        byte[] bArr5 = new byte[64];
        long[] jArr = new long[8];
        byte[] bArr6 = new byte[32];
        byte[] bArr7 = new byte[32];
        byte[] bArr8 = new byte[1024];
        byte[] bArr9 = new byte[1088];
        for (int i10 = 0; i10 < 1088; i10++) {
            bArr9[i10] = bArr2[i10];
        }
        System.arraycopy(bArr9, 1056, bArr3, 40968, 32);
        xm.a aVar = this.f91259a;
        Digest digest = aVar.f94684b;
        byte[] bArr10 = new byte[digest.getDigestSize()];
        digest.update(bArr3, 40968, 32);
        digest.update(bArr, 0, bArr.length);
        digest.doFinal(bArr10, 0);
        for (int i11 = 0; i11 != 32; i11++) {
            bArr3[40968 + i11] = 0;
        }
        for (int i12 = 0; i12 != 8; i12++) {
            jArr[i12] = Pack.littleEndianToLong(bArr10, i12 * 8);
        }
        long j10 = jArr[0];
        long j11 = j10 & 1152921504606846975L;
        System.arraycopy(bArr10, 16, bArr4, 0, 32);
        System.arraycopy(bArr4, 0, bArr3, 39912, 32);
        b.a aVar2 = new b.a();
        aVar2.f91264a = 11;
        aVar2.f91265b = 0L;
        aVar2.f91266c = 0L;
        System.arraycopy(bArr9, 32, bArr3, 39944, 1024);
        byte[] bArr11 = bArr7;
        b.b(aVar, bArr3, 40968, bArr9, aVar2, bArr3, 39944);
        Digest digest2 = aVar.f94684b;
        digest2.update(bArr3, 39912, 1088);
        digest2.update(bArr, 0, bArr.length);
        byte[] bArr12 = bArr5;
        digest2.doFinal(bArr12, 0);
        b.a aVar3 = new b.a();
        aVar3.f91264a = 12;
        aVar3.f91266c = (int) (j10 & 31);
        aVar3.f91265b = j11 >>> 5;
        for (int i13 = 0; i13 < 32; i13++) {
            bArr3[i13] = bArr4[i13];
        }
        byte[] bArr13 = bArr9;
        byte[] bArr14 = bArr8;
        System.arraycopy(bArr13, 32, bArr14, 0, 1024);
        int i14 = 0;
        for (int i15 = 8; i14 < i15; i15 = 8) {
            bArr3[32 + i14] = (byte) ((j11 >>> (i14 * 8)) & 255);
            i14++;
        }
        a.a(aVar, bArr11, bArr13, aVar3);
        byte[] bArr15 = new byte[2097152];
        byte[] bArr16 = new byte[4194272];
        a.b(bArr15, 0, SvgConstantsKt.SPECIFIED_MARKER_START, bArr11, 0);
        for (int i16 = 0; i16 < 65536; i16++) {
            aVar.b(bArr16, (65535 + i16) * 32, i16 * 32, bArr15);
        }
        int i17 = 0;
        while (i17 < 16) {
            byte[] bArr17 = bArr11;
            long j12 = (1 << (16 - i17)) - 1;
            int i18 = 1 << (15 - i17);
            long j13 = i18 - 1;
            int i19 = 0;
            while (true) {
                byte[] bArr18 = bArr12;
                if (i19 < i18) {
                    aVar.a(bArr16, (int) ((((long) i19) + j13) * 32), bArr16, (int) ((((long) (i19 * 2)) + j12) * 32), bArr14, i17 * 64);
                    i19++;
                    bArr12 = bArr18;
                    j13 = j13;
                }
            }
            i17++;
            bArr11 = bArr17;
        }
        byte[] bArr19 = bArr12;
        byte[] bArr20 = bArr11;
        int i20 = 2016;
        int i21 = 40;
        while (i20 < 4064) {
            bArr3[i21] = bArr16[i20];
            i20++;
            i21++;
        }
        int i22 = 0;
        while (true) {
            if (i22 >= 32) {
                break;
            }
            int i23 = i22 * 2;
            int i24 = (bArr19[i23] & 255) + ((bArr19[i23 + 1] & 255) << 8);
            int i25 = 0;
            for (int i26 = 32; i25 < i26; i26 = 32) {
                bArr3[i21] = bArr15[(i24 * 32) + i25];
                i25++;
                i21++;
            }
            int i27 = i24 + 65535;
            for (int i28 = 0; i28 < 10; i28++) {
                int i29 = (i27 & 1) != 0 ? i27 + 1 : i27 - 1;
                int i30 = 0;
                while (i30 < 32) {
                    bArr3[i21] = bArr16[(i29 * 32) + i30];
                    i30++;
                    i21++;
                }
                i27 = (i29 - 1) / 2;
            }
            i22++;
        }
        int i31 = 0;
        for (int i32 = 32; i31 < i32; i32 = 32) {
            bArr6[i31] = bArr16[i31];
            i31++;
        }
        byte[] bArr21 = bArr6;
        int i33 = 13352;
        int i34 = 12;
        int i35 = 0;
        while (i35 < i34) {
            aVar3.f91264a = i35;
            byte[] bArr22 = bArr20;
            a.a(aVar, bArr22, bArr13, aVar3);
            int[] iArr = new int[67];
            int i36 = 0;
            int i37 = 0;
            while (i36 < 64) {
                byte b10 = bArr21[i36 / 2];
                iArr[i36] = b10 & 15;
                int i38 = (b10 & 255) >>> 4;
                iArr[i36 + 1] = i38;
                i37 = (15 - i38) + (15 - iArr[i36]) + i37;
                i36 += 2;
            }
            while (i36 < 67) {
                iArr[i36] = i37 & 15;
                i37 >>>= 4;
                i36++;
            }
            i.a(bArr3, i33, 0, bArr22);
            int i39 = 0;
            for (int i40 = 67; i39 < i40; i40 = 67) {
                int i41 = (i39 * 32) + i33;
                byte[] bArr23 = bArr14;
                i.b(aVar, bArr3, i41, bArr3, i41, bArr23, 0, iArr[i39]);
                i39++;
                iArr = iArr;
                i34 = i34;
                bArr13 = bArr13;
                bArr14 = bArr23;
            }
            byte[] bArr24 = bArr13;
            byte[] bArr25 = bArr14;
            int i42 = i34;
            int i43 = i33 + 2144;
            int i44 = aVar3.f91264a;
            long j14 = aVar3.f91265b;
            byte[] bArr26 = new byte[2048];
            byte[] bArr27 = new byte[1024];
            byte[] bArr28 = new byte[68608];
            long j15 = 0;
            while (j15 < 32) {
                int i45 = i33;
                int i46 = (int) (j15 * 32);
                byte[] bArr29 = bArr22;
                byte[] bArr30 = new byte[40];
                int i47 = i35;
                for (int i48 = 0; i48 < 32; i48++) {
                    bArr30[i48] = bArr24[i48];
                }
                i33 = i45;
                Pack.longToLittleEndian(((long) i44) | (j14 << 4) | (j15 << 59), bArr30, 32);
                Digest digest3 = aVar.f94683a;
                digest3.update(bArr30, 0, 40);
                digest3.doFinal(bArr27, i46);
                j15++;
                bArr21 = bArr21;
                bArr22 = bArr29;
                i35 = i47;
            }
            byte[] bArr31 = bArr21;
            int i49 = i35;
            byte[] bArr32 = bArr22;
            for (long j16 = 0; j16 < 32; j16++) {
                int i50 = (int) (2144 * j16);
                i.a(bArr28, i50, (int) (j16 * 32), bArr27);
                for (int i51 = 0; i51 < 67; i51++) {
                    int i52 = (i51 * 32) + i50;
                    i.b(aVar, bArr28, i52, bArr28, i52, bArr25, 0, 15);
                }
            }
            for (long j17 = 0; j17 < 32; j17++) {
                b.a(aVar, bArr26, (int) ((j17 * 32) + 1024), bArr28, (int) (j17 * 2144), bArr25, 0);
            }
            int i53 = 0;
            for (int i54 = 32; i54 > 0; i54 >>>= 1) {
                for (int i55 = 0; i55 < i54; i55 += 2) {
                    aVar.a(bArr26, ((i55 >>> 1) * 32) + ((i54 >>> 1) * 32), bArr26, (i55 * 32) + (i54 * 32), bArr25, (i53 + 7) * 64);
                }
                i53++;
            }
            int i56 = (int) aVar3.f91266c;
            for (int i57 = 0; i57 < 5; i57++) {
                System.arraycopy(bArr26, (((i56 >>> i57) ^ 1) * 32) + ((32 >>> i57) * 32), bArr3, (i57 * 32) + i43, 32);
            }
            System.arraycopy(bArr26, 32, bArr31, 0, 32);
            i33 += 2304;
            long j18 = aVar3.f91265b;
            aVar3.f91266c = (int) (j18 & 31);
            aVar3.f91265b = j18 >>> 5;
            i35 = i49 + 1;
            bArr21 = bArr31;
            i34 = i42;
            bArr13 = bArr24;
            bArr14 = bArr25;
            bArr20 = bArr32;
        }
        byte[] bArr33 = bArr13;
        for (int i58 = 0; i58 != 1088; i58++) {
            bArr33[i58] = 0;
        }
        return bArr3;
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public void init(boolean z10, CipherParameters cipherParameters) {
        if (!z10) {
            this.f91260b = ((SPHINCSPublicKeyParameters) cipherParameters).getKeyData();
        } else if (cipherParameters instanceof ParametersWithRandom) {
            this.f91260b = ((SPHINCSPrivateKeyParameters) ((ParametersWithRandom) cipherParameters).getParameters()).getKeyData();
        } else {
            this.f91260b = ((SPHINCSPrivateKeyParameters) cipherParameters).getKeyData();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r25v2 */
    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public boolean verifySignature(byte[] bArr, byte[] bArr2) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        byte[] bArr3 = this.f91260b;
        byte[] bArr4 = new byte[2144];
        byte[] bArr5 = new byte[32];
        byte[] bArr6 = new byte[32];
        byte[] bArr7 = new byte[41000];
        byte[] bArr8 = new byte[1056];
        if (bArr2.length != 41000) {
            throw new IllegalArgumentException("signature wrong size");
        }
        byte[] bArr9 = new byte[64];
        int i13 = 0;
        for (int i14 = 0; i14 < 1056; i14++) {
            bArr8[i14] = bArr3[i14];
        }
        byte[] bArr10 = new byte[32];
        for (int i15 = 0; i15 < 32; i15++) {
            bArr10[i15] = bArr2[i15];
        }
        System.arraycopy(bArr2, 0, bArr7, 0, 41000);
        xm.a aVar = this.f91259a;
        Digest digest = aVar.f94684b;
        digest.update(bArr10, 0, 32);
        digest.update(bArr8, 0, 1056);
        digest.update(bArr, 0, bArr.length);
        digest.doFinal(bArr9, 0);
        long j10 = 0;
        int i16 = 0;
        while (true) {
            i10 = 8;
            if (i16 >= 8) {
                break;
            }
            j10 ^= ((long) (bArr7[32 + i16] & 255)) << (i16 * 8);
            i16++;
        }
        byte[] bArr11 = new byte[1024];
        int i17 = 2088;
        int i18 = 0;
        loop3: while (true) {
            z10 = 1;
            if (i18 >= 32) {
                for (int i19 = i13; i19 < 32; i19++) {
                    aVar.a(bArr11, i19 * 32, bArr7, (i19 * 64) + 40, bArr8, 640);
                }
                for (int i20 = i13; i20 < 16; i20++) {
                    aVar.a(bArr11, i20 * 32, bArr11, i20 * 64, bArr8, TypedValues.TransitionType.TYPE_AUTO_TRANSITION);
                }
                for (int i21 = i13; i21 < 8; i21++) {
                    aVar.a(bArr11, i21 * 32, bArr11, i21 * 64, bArr8, ViewUtils.EDGE_TO_EDGE_FLAGS);
                }
                i11 = 4;
                for (int i22 = i13; i22 < 4; i22++) {
                    aVar.a(bArr11, i22 * 32, bArr11, i22 * 64, bArr8, 832);
                }
                for (int i23 = i13; i23 < 2; i23++) {
                    aVar.a(bArr11, i23 * 32, bArr11, i23 * 64, bArr8, 896);
                }
                i12 = i13;
                aVar.a(bArr6, 0, bArr11, 0, bArr8, 960);
                break;
            }
            int i24 = i18 * 2;
            int i25 = (bArr9[i24] & 255) + ((bArr9[i24 + 1] & 255) << i10);
            if ((i25 & 1) == 0) {
                aVar.b(bArr11, i13, i17, bArr7);
                for (int i26 = i13; i26 < 32; i26++) {
                    bArr11[i26 + 32] = bArr7[i17 + 32 + i26];
                }
            } else {
                aVar.b(bArr11, 32, i17, bArr7);
                for (int i27 = i13; i27 < 32; i27++) {
                    bArr11[i27] = bArr7[i17 + 32 + i27];
                }
            }
            i17 += 64;
            for (int i28 = 1; i28 < 10; i28++) {
                i25 >>>= 1;
                if ((i25 & 1) == 0) {
                    aVar.a(bArr11, 0, bArr11, 0, bArr8, (i28 - 1) * 64);
                    for (int i29 = i13; i29 < 32; i29++) {
                        bArr11[i29 + 32] = bArr7[i17 + i29];
                    }
                } else {
                    aVar.a(bArr11, 32, bArr11, 0, bArr8, (i28 - 1) * 64);
                    for (int i30 = i13; i30 < 32; i30++) {
                        bArr11[i30] = bArr7[i17 + i30];
                    }
                }
                i17 += 32;
            }
            int i31 = i25 >>> 1;
            aVar.a(bArr11, 0, bArr11, 0, bArr8, 576);
            for (int i32 = i13; i32 < 32; i32++) {
                if (bArr7[u.b(i31, 32, 40, i32)] != bArr11[i32]) {
                    for (int i33 = 0; i33 < 32; i33++) {
                        bArr6[i33] = 0;
                    }
                    i11 = 4;
                    i12 = 0;
                    break loop3;
                }
                i13 = 0;
            }
            i18++;
            i10 = 8;
        }
        int i34 = 13352;
        int i35 = i12;
        while (i35 < 12) {
            int i36 = 67;
            int[] iArr = new int[67];
            int i37 = i12;
            int i38 = i37;
            while (i37 < 64) {
                byte b10 = bArr6[i37 / 2];
                iArr[i37] = b10 & 15;
                int i39 = (b10 & 255) >>> i11;
                iArr[i37 + 1] = i39;
                i38 = (15 - i39) + (15 - iArr[i37]) + i38;
                i37 += 2;
            }
            while (i37 < 67) {
                iArr[i37] = i38 & 15;
                i38 >>>= i11;
                i37++;
            }
            int i40 = i12;
            while (i40 < i36) {
                int i41 = i40 * 32;
                int i42 = iArr[i40];
                i.b(aVar, bArr4, i41, bArr7, i34 + i41, bArr8, i42 * 32, 15 - i42);
                i40++;
                i36 = i36;
                iArr = iArr;
                i35 = i35;
                bArr6 = bArr6;
            }
            int i43 = i35;
            byte[] bArr12 = bArr6;
            int i44 = i34 + 2144;
            b.a(aVar, bArr5, 0, bArr4, 0, bArr8, 0);
            int i45 = (int) (j10 & 31);
            byte[] bArr13 = new byte[64];
            int i46 = i12;
            if ((i45 & 1) != 0) {
                while (i46 < 32) {
                    bArr13[i46 + 32] = bArr5[i46];
                    i46++;
                }
                for (int i47 = i12; i47 < 32; i47++) {
                    bArr13[i47] = bArr7[i44 + i47];
                }
            } else {
                while (i46 < 32) {
                    bArr13[i46] = bArr5[i46];
                    i46++;
                }
                for (int i48 = i12; i48 < 32; i48++) {
                    bArr13[i48 + 32] = bArr7[i44 + i48];
                }
            }
            int i49 = i34 + 2176;
            for (int i50 = i12; i50 < i11; i50++) {
                i45 >>>= 1;
                if ((i45 & 1) != 0) {
                    aVar.a(bArr13, 32, bArr13, 0, bArr8, (i50 + 7) * 64);
                    for (int i51 = i12; i51 < 32; i51++) {
                        bArr13[i51] = bArr7[i49 + i51];
                    }
                } else {
                    aVar.a(bArr13, 0, bArr13, 0, bArr8, (i50 + 7) * 64);
                    for (int i52 = i12; i52 < 32; i52++) {
                        bArr13[i52 + 32] = bArr7[i49 + i52];
                    }
                }
                i49 += 32;
            }
            aVar.a(bArr12, 0, bArr13, 0, bArr8, TypedValues.TransitionType.TYPE_AUTO_TRANSITION);
            j10 >>= 5;
            i34 += 2304;
            i35 = i43 + 1;
            bArr6 = bArr12;
        }
        byte[] bArr14 = bArr6;
        int i53 = i12;
        while (i53 < 32) {
            if (bArr14[i53] != bArr8[i53 + 1024]) {
                z10 = i12;
            }
            i53++;
            z10 = z10;
        }
        return z10;
    }
}
