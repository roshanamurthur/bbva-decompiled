package com.nimbusds.jose.crypto.impl;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.jwk.Curve;
import com.noknok.android.client.asm.authenticator.KSUtils;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.ECKey;

/* JADX INFO: loaded from: classes10.dex */
public class ECDSA {
    public static int getSignatureByteArrayLength(JWSAlgorithm jWSAlgorithm) throws JOSEException {
        if (jWSAlgorithm.equals(JWSAlgorithm.ES256) || jWSAlgorithm.equals(JWSAlgorithm.ES256K)) {
            return 64;
        }
        if (jWSAlgorithm.equals(JWSAlgorithm.ES384)) {
            return 96;
        }
        if (jWSAlgorithm.equals(JWSAlgorithm.ES512)) {
            return 132;
        }
        throw new JOSEException(AlgorithmSupportMessage.unsupportedJWSAlgorithm(jWSAlgorithm, ECDSAProvider.SUPPORTED_ALGORITHMS));
    }

    public static Signature getSignerAndVerifier(JWSAlgorithm jWSAlgorithm, Provider provider) throws JOSEException {
        String str = "SHA256withECDSA";
        if (!jWSAlgorithm.equals(JWSAlgorithm.ES256) && !jWSAlgorithm.equals(JWSAlgorithm.ES256K)) {
            if (jWSAlgorithm.equals(JWSAlgorithm.ES384)) {
                str = "SHA384withECDSA";
            } else {
                if (!jWSAlgorithm.equals(JWSAlgorithm.ES512)) {
                    throw new JOSEException(AlgorithmSupportMessage.unsupportedJWSAlgorithm(jWSAlgorithm, ECDSAProvider.SUPPORTED_ALGORITHMS));
                }
                str = "SHA512withECDSA";
            }
        }
        try {
            return provider != null ? Signature.getInstance(str, provider) : Signature.getInstance(str);
        } catch (NoSuchAlgorithmException e5) {
            throw new JOSEException("Unsupported ECDSA algorithm: " + e5.getMessage(), e5);
        }
    }

    public static JWSAlgorithm resolveAlgorithm(ECKey eCKey) throws JOSEException {
        return resolveAlgorithm(Curve.forECParameterSpec(eCKey.getParams()));
    }

    public static byte[] transcodeSignatureToConcat(byte[] bArr, int i10) throws JOSEException {
        int i11;
        if (bArr.length < 8 || bArr[0] != 48) {
            throw new JOSEException("Invalid ECDSA signature format");
        }
        byte b10 = bArr[1];
        if (b10 > 0) {
            i11 = 2;
        } else {
            if (b10 != -127) {
                throw new JOSEException("Invalid ECDSA signature format");
            }
            i11 = 3;
        }
        int i12 = bArr[i11 + 1];
        int i13 = i12;
        while (i13 > 0 && bArr[((i11 + 2) + i12) - i13] == 0) {
            i13--;
        }
        int i14 = i11 + 2 + i12;
        int i15 = bArr[i14 + 1];
        int i16 = i15;
        while (i16 > 0 && bArr[((i14 + 2) + i15) - i16] == 0) {
            i16--;
        }
        int iMax = Math.max(Math.max(i13, i16), i10 / 2);
        int i17 = bArr[i11 - 1];
        if ((i17 & 255) != bArr.length - i11 || (i17 & 255) != i12 + 4 + i15 || bArr[i11] != 2 || bArr[i14] != 2) {
            throw new JOSEException("Invalid ECDSA signature format");
        }
        int i18 = iMax * 2;
        byte[] bArr2 = new byte[i18];
        System.arraycopy(bArr, i14 - i13, bArr2, iMax - i13, i13);
        System.arraycopy(bArr, ((i14 + 2) + i15) - i16, bArr2, i18 - i16, i16);
        return bArr2;
    }

    public static byte[] transcodeSignatureToDER(byte[] bArr) throws JOSEException {
        byte[] bArr2;
        int length = bArr.length / 2;
        int i10 = length;
        while (i10 > 0 && bArr[length - i10] == 0) {
            i10--;
        }
        int i11 = length - i10;
        int i12 = bArr[i11] < 0 ? i10 + 1 : i10;
        int i13 = length;
        while (i13 > 0 && bArr[(length * 2) - i13] == 0) {
            i13--;
        }
        int i14 = (length * 2) - i13;
        int i15 = bArr[i14] < 0 ? i13 + 1 : i13;
        int i16 = i12 + 4 + i15;
        if (i16 > 255) {
            throw new JOSEException("Invalid ECDSA signature format");
        }
        int i17 = 1;
        if (i16 < 128) {
            bArr2 = new byte[i12 + 6 + i15];
        } else {
            bArr2 = new byte[i12 + 7 + i15];
            bArr2[1] = KSUtils.PLAIN_BUFFER;
            i17 = 2;
        }
        bArr2[0] = 48;
        bArr2[i17] = (byte) i16;
        bArr2[i17 + 1] = 2;
        bArr2[i17 + 2] = (byte) i12;
        int i18 = i17 + 3 + i12;
        System.arraycopy(bArr, i11, bArr2, i18 - i10, i10);
        bArr2[i18] = 2;
        bArr2[i18 + 1] = (byte) i15;
        System.arraycopy(bArr, i14, bArr2, ((i18 + 2) + i15) - i13, i13);
        return bArr2;
    }

    public static JWSAlgorithm resolveAlgorithm(Curve curve) throws JOSEException {
        if (curve != null) {
            if (Curve.P_256.equals(curve)) {
                return JWSAlgorithm.ES256;
            }
            if (Curve.SECP256K1.equals(curve)) {
                return JWSAlgorithm.ES256K;
            }
            if (Curve.P_384.equals(curve)) {
                return JWSAlgorithm.ES384;
            }
            if (Curve.P_521.equals(curve)) {
                return JWSAlgorithm.ES512;
            }
            throw new JOSEException("Unexpected curve: " + curve);
        }
        throw new JOSEException("The EC key curve is not supported, must be P-256, P-384 or P-521");
    }
}
