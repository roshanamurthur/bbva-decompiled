package com.nimbusds.jose.crypto.impl;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWEAlgorithm;
import com.nimbusds.jose.util.ByteUtils;
import com.nimbusds.jose.util.IntegerUtils;
import com.nimbusds.jose.util.StandardCharset;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes10.dex */
public class PBKDF2 {
    public static final byte[] ZERO_BYTE = {0};

    public static SecretKey deriveKey(byte[] bArr, byte[] bArr2, int i10, PRFParams pRFParams) throws JOSEException {
        Mac initMac = HMAC.getInitMac(new SecretKeySpec(bArr, pRFParams.getMACAlgorithm()), pRFParams.getMacProvider());
        int macLength = initMac.getMacLength();
        if (pRFParams.getDerivedKeyByteLength() > 4294967295L) {
            throw new JOSEException("derived key too long " + pRFParams.getDerivedKeyByteLength());
        }
        int iCeil = (int) Math.ceil(((double) pRFParams.getDerivedKeyByteLength()) / ((double) macLength));
        int i11 = iCeil - 1;
        int derivedKeyByteLength = pRFParams.getDerivedKeyByteLength() - (macLength * i11);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i12 = 0;
        while (i12 < iCeil) {
            int i13 = i12 + 1;
            byte[] bArrSubArray = null;
            byte[] bArrDoFinal = null;
            for (int i14 = 1; i14 <= i10; i14++) {
                if (i14 == 1) {
                    bArrSubArray = initMac.doFinal(ByteUtils.concat(bArr2, IntegerUtils.toBytes(i13)));
                    bArrDoFinal = bArrSubArray;
                } else {
                    bArrDoFinal = initMac.doFinal(bArrDoFinal);
                    for (int i15 = 0; i15 < bArrDoFinal.length; i15++) {
                        bArrSubArray[i15] = (byte) (bArrDoFinal[i15] ^ bArrSubArray[i15]);
                    }
                }
            }
            if (i12 == i11) {
                bArrSubArray = ByteUtils.subArray(bArrSubArray, 0, derivedKeyByteLength);
            }
            byteArrayOutputStream.write(bArrSubArray, 0, bArrSubArray.length);
            i12 = i13;
        }
        return new SecretKeySpec(byteArrayOutputStream.toByteArray(), "AES");
    }

    public static byte[] formatSalt(JWEAlgorithm jWEAlgorithm, byte[] bArr) throws JOSEException {
        byte[] bytes = jWEAlgorithm.toString().getBytes(StandardCharset.UTF_8);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(bytes);
            byteArrayOutputStream.write(ZERO_BYTE);
            byteArrayOutputStream.write(bArr);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e5) {
            throw new JOSEException(e5.getMessage(), e5);
        }
    }
}
