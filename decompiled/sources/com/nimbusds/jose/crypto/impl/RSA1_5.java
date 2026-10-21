package com.nimbusds.jose.crypto.impl;

import ci.a;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.util.ByteUtils;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.interfaces.RSAPublicKey;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import net.jcip.annotations.ThreadSafe;

/* JADX INFO: loaded from: classes10.dex */
@ThreadSafe
public class RSA1_5 {
    public static SecretKey decryptCEK(PrivateKey privateKey, byte[] bArr, int i10, Provider provider) throws JOSEException {
        try {
            Cipher cipherHelper = CipherHelper.getInstance("RSA/ECB/PKCS1Padding", provider);
            cipherHelper.init(2, privateKey);
            byte[] bArrDoFinal = cipherHelper.doFinal(bArr);
            if (ByteUtils.safeBitLength(bArrDoFinal) != i10) {
                return null;
            }
            return new SecretKeySpec(bArrDoFinal, "AES");
        } catch (Exception e5) {
            throw new JOSEException(a.b(e5, new StringBuilder("Couldn't decrypt Content Encryption Key (CEK): ")), e5);
        }
    }

    public static byte[] encryptCEK(RSAPublicKey rSAPublicKey, SecretKey secretKey, Provider provider) throws JOSEException {
        try {
            Cipher cipherHelper = CipherHelper.getInstance("RSA/ECB/PKCS1Padding", provider);
            cipherHelper.init(1, rSAPublicKey);
            return cipherHelper.doFinal(secretKey.getEncoded());
        } catch (IllegalBlockSizeException e5) {
            throw new JOSEException("RSA block size exception: The RSA key is too short, try a longer one", e5);
        } catch (Exception e7) {
            throw new JOSEException(a.b(e7, new StringBuilder("Couldn't encrypt Content Encryption Key (CEK): ")), e7);
        }
    }
}
