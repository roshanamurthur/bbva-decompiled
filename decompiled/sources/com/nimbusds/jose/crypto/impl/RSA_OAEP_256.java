package com.nimbusds.jose.crypto.impl;

import com.nimbusds.jose.JOSEException;
import java.security.AlgorithmParameters;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.MGF1ParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import javax.crypto.spec.SecretKeySpec;
import net.jcip.annotations.ThreadSafe;

/* JADX INFO: loaded from: classes10.dex */
@ThreadSafe
public class RSA_OAEP_256 {
    public static SecretKey decryptCEK(PrivateKey privateKey, byte[] bArr, Provider provider) throws JOSEException {
        try {
            AlgorithmParameters algorithmParametersHelper = AlgorithmParametersHelper.getInstance("OAEP", provider);
            algorithmParametersHelper.init(new OAEPParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, PSource.PSpecified.DEFAULT));
            Cipher cipherHelper = CipherHelper.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding", provider);
            cipherHelper.init(2, privateKey, algorithmParametersHelper);
            return new SecretKeySpec(cipherHelper.doFinal(bArr), "AES");
        } catch (Exception e5) {
            throw new JOSEException(e5.getMessage(), e5);
        }
    }

    public static byte[] encryptCEK(RSAPublicKey rSAPublicKey, SecretKey secretKey, Provider provider) throws JOSEException {
        try {
            AlgorithmParameters algorithmParametersHelper = AlgorithmParametersHelper.getInstance("OAEP", provider);
            algorithmParametersHelper.init(new OAEPParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, PSource.PSpecified.DEFAULT));
            Cipher cipherHelper = CipherHelper.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding", provider);
            cipherHelper.init(1, rSAPublicKey, algorithmParametersHelper);
            return cipherHelper.doFinal(secretKey.getEncoded());
        } catch (IllegalBlockSizeException e5) {
            throw new JOSEException("RSA block size exception: The RSA key is too short, try a longer one", e5);
        } catch (Exception e7) {
            throw new JOSEException(e7.getMessage(), e7);
        }
    }
}
