package org.bouncycastle.crypto.generators;

import c2.b;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.crypto.PBEParametersGenerator;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* JADX INFO: loaded from: classes4.dex */
public class PKCS12ParametersGenerator extends PBEParametersGenerator {
    public static final int IV_MATERIAL = 2;
    public static final int KEY_MATERIAL = 1;
    public static final int MAC_MATERIAL = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Digest f88779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f88780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f88781c;

    public PKCS12ParametersGenerator(Digest digest) {
        this.f88779a = digest;
        if (digest instanceof ExtendedDigest) {
            this.f88780b = digest.getDigestSize();
            this.f88781c = ((ExtendedDigest) digest).getByteLength();
        } else {
            throw new IllegalArgumentException("Digest " + digest.getAlgorithmName() + " unsupported");
        }
    }

    public final byte[] a(int i10, int i11) {
        byte[] bArr;
        byte[] bArr2;
        PKCS12ParametersGenerator pKCS12ParametersGenerator = this;
        int i12 = pKCS12ParametersGenerator.f88781c;
        byte[] bArr3 = new byte[i12];
        byte[] bArr4 = new byte[i11];
        int i13 = 0;
        for (int i14 = 0; i14 != i12; i14++) {
            bArr3[i14] = (byte) i10;
        }
        byte[] bArr5 = pKCS12ParametersGenerator.salt;
        int i15 = 1;
        if (bArr5 == null || bArr5.length == 0) {
            bArr = new byte[0];
        } else {
            int length = (((bArr5.length + i12) - 1) / i12) * i12;
            bArr = new byte[length];
            for (int i16 = 0; i16 != length; i16++) {
                byte[] bArr6 = pKCS12ParametersGenerator.salt;
                bArr[i16] = bArr6[i16 % bArr6.length];
            }
        }
        byte[] bArr7 = pKCS12ParametersGenerator.password;
        if (bArr7 == null || bArr7.length == 0) {
            bArr2 = new byte[0];
        } else {
            int length2 = (((bArr7.length + i12) - 1) / i12) * i12;
            bArr2 = new byte[length2];
            for (int i17 = 0; i17 != length2; i17++) {
                byte[] bArr8 = pKCS12ParametersGenerator.password;
                bArr2[i17] = bArr8[i17 % bArr8.length];
            }
        }
        int length3 = bArr.length + bArr2.length;
        byte[] bArr9 = new byte[length3];
        System.arraycopy(bArr, 0, bArr9, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr9, bArr.length, bArr2.length);
        byte[] bArr10 = new byte[i12];
        int i18 = pKCS12ParametersGenerator.f88780b;
        int iA = b.a(i11, i18, 1, i18);
        byte[] bArr11 = new byte[i18];
        int i19 = 1;
        while (i19 <= iA) {
            Digest digest = pKCS12ParametersGenerator.f88779a;
            digest.update(bArr3, i13, i12);
            digest.update(bArr9, i13, length3);
            digest.doFinal(bArr11, i13);
            for (int i20 = i15; i20 < pKCS12ParametersGenerator.iterationCount; i20++) {
                digest.update(bArr11, i13, i18);
                digest.doFinal(bArr11, i13);
            }
            for (int i21 = i13; i21 != i12; i21++) {
                bArr10[i21] = bArr11[i21 % i18];
            }
            for (int i22 = i13; i22 != length3 / i12; i22++) {
                int i23 = i22 * i12;
                int i24 = (i23 + i12) - 1;
                int i25 = (bArr10[i12 - 1] & 255) + (bArr9[i24] & 255) + 1;
                bArr9[i24] = (byte) i25;
                int i26 = i25 >>> 8;
                int i27 = i12 - 2;
                while (i27 >= 0) {
                    int i28 = i23 + i27;
                    int i29 = (bArr10[i27] & 255) + (bArr9[i28] & 255) + i26;
                    bArr9[i28] = (byte) i29;
                    i26 = i29 >>> 8;
                    i27--;
                    i12 = i12;
                }
            }
            int i30 = i12;
            if (i19 == iA) {
                int i31 = i19 - 1;
                i13 = 0;
                System.arraycopy(bArr11, 0, bArr4, i31 * i18, i11 - (i31 * i18));
            } else {
                i13 = 0;
                System.arraycopy(bArr11, 0, bArr4, (i19 - 1) * i18, i18);
            }
            i19++;
            pKCS12ParametersGenerator = this;
            i15 = 1;
            i12 = i30;
        }
        return bArr4;
    }

    @Override // org.bouncycastle.crypto.PBEParametersGenerator
    public CipherParameters generateDerivedMacParameters(int i10) {
        int i11 = i10 / 8;
        return new KeyParameter(a(3, i11), 0, i11);
    }

    @Override // org.bouncycastle.crypto.PBEParametersGenerator
    public CipherParameters generateDerivedParameters(int i10) {
        int i11 = i10 / 8;
        return new KeyParameter(a(1, i11), 0, i11);
    }

    @Override // org.bouncycastle.crypto.PBEParametersGenerator
    public CipherParameters generateDerivedParameters(int i10, int i11) {
        int i12 = i10 / 8;
        int i13 = i11 / 8;
        byte[] bArrA = a(1, i12);
        return new ParametersWithIV(new KeyParameter(bArrA, 0, i12), a(2, i13), 0, i13);
    }
}
