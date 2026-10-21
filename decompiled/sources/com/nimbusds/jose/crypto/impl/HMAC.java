package com.nimbusds.jose.crypto.impl;

import com.nimbusds.jose.JOSEException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import net.jcip.annotations.ThreadSafe;

/* JADX INFO: loaded from: classes10.dex */
@ThreadSafe
public class HMAC {
    public static byte[] compute(String str, byte[] bArr, byte[] bArr2, Provider provider) throws JOSEException {
        return compute(new SecretKeySpec(bArr, str), bArr2, provider);
    }

    public static Mac getInitMac(SecretKey secretKey, Provider provider) throws JOSEException {
        try {
            Mac mac = provider != null ? Mac.getInstance(secretKey.getAlgorithm(), provider) : Mac.getInstance(secretKey.getAlgorithm());
            mac.init(secretKey);
            return mac;
        } catch (InvalidKeyException e5) {
            throw new JOSEException("Invalid HMAC key: " + e5.getMessage(), e5);
        } catch (NoSuchAlgorithmException e7) {
            throw new JOSEException("Unsupported HMAC algorithm: " + e7.getMessage(), e7);
        }
    }

    public static byte[] compute(SecretKey secretKey, byte[] bArr, Provider provider) throws JOSEException {
        Mac initMac = getInitMac(secretKey, provider);
        initMac.update(bArr);
        return initMac.doFinal();
    }
}
