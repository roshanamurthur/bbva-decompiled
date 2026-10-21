package com.nimbusds.jose.crypto;

import com.nimbusds.jose.CriticalHeaderParamsAware;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWEAlgorithm;
import com.nimbusds.jose.JWEDecrypter;
import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.crypto.impl.AlgorithmSupportMessage;
import com.nimbusds.jose.crypto.impl.ContentCryptoProvider;
import com.nimbusds.jose.crypto.impl.CriticalHeaderParamsDeferral;
import com.nimbusds.jose.crypto.impl.RSA1_5;
import com.nimbusds.jose.crypto.impl.RSACryptoProvider;
import com.nimbusds.jose.crypto.impl.RSAKeyUtils;
import com.nimbusds.jose.crypto.impl.RSA_OAEP;
import com.nimbusds.jose.crypto.impl.RSA_OAEP_256;
import com.nimbusds.jose.jwk.RSAKey;
import com.nimbusds.jose.util.Base64URL;
import java.security.PrivateKey;
import java.util.Set;
import javax.crypto.SecretKey;
import net.jcip.annotations.ThreadSafe;

/* JADX INFO: loaded from: classes10.dex */
@ThreadSafe
public class RSADecrypter extends RSACryptoProvider implements JWEDecrypter, CriticalHeaderParamsAware {
    private Exception cekDecryptionException;
    private final CriticalHeaderParamsDeferral critPolicy;
    private final PrivateKey privateKey;

    public RSADecrypter(PrivateKey privateKey) {
        this(privateKey, null, false);
    }

    @Override // com.nimbusds.jose.JWEDecrypter
    public byte[] decrypt(JWEHeader jWEHeader, Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, Base64URL base64URL4) throws JOSEException {
        SecretKey secretKeyDecryptCEK;
        if (base64URL == null) {
            throw new JOSEException("Missing JWE encrypted key");
        }
        if (base64URL2 == null) {
            throw new JOSEException("Missing JWE initialization vector (IV)");
        }
        if (base64URL4 == null) {
            throw new JOSEException("Missing JWE authentication tag");
        }
        this.critPolicy.ensureHeaderPasses(jWEHeader);
        JWEAlgorithm algorithm = jWEHeader.getAlgorithm();
        if (algorithm.equals(JWEAlgorithm.RSA1_5)) {
            int iCekBitLength = jWEHeader.getEncryptionMethod().cekBitLength();
            secretKeyDecryptCEK = ContentCryptoProvider.generateCEK(jWEHeader.getEncryptionMethod(), getJCAContext().getSecureRandom());
            try {
                SecretKey secretKeyDecryptCEK2 = RSA1_5.decryptCEK(this.privateKey, base64URL.decode(), iCekBitLength, getJCAContext().getKeyEncryptionProvider());
                if (secretKeyDecryptCEK2 != null) {
                    secretKeyDecryptCEK = secretKeyDecryptCEK2;
                }
            } catch (Exception e5) {
                this.cekDecryptionException = e5;
            }
            this.cekDecryptionException = null;
        } else if (algorithm.equals(JWEAlgorithm.RSA_OAEP)) {
            secretKeyDecryptCEK = RSA_OAEP.decryptCEK(this.privateKey, base64URL.decode(), getJCAContext().getKeyEncryptionProvider());
        } else {
            if (!algorithm.equals(JWEAlgorithm.RSA_OAEP_256)) {
                throw new JOSEException(AlgorithmSupportMessage.unsupportedJWEAlgorithm(algorithm, RSACryptoProvider.SUPPORTED_ALGORITHMS));
            }
            secretKeyDecryptCEK = RSA_OAEP_256.decryptCEK(this.privateKey, base64URL.decode(), getJCAContext().getKeyEncryptionProvider());
        }
        return ContentCryptoProvider.decrypt(jWEHeader, base64URL, base64URL2, base64URL3, base64URL4, secretKeyDecryptCEK, getJCAContext());
    }

    public Exception getCEKDecryptionException() {
        return this.cekDecryptionException;
    }

    @Override // com.nimbusds.jose.CriticalHeaderParamsAware
    public Set<String> getDeferredCriticalHeaderParams() {
        return this.critPolicy.getProcessedCriticalHeaderParams();
    }

    public PrivateKey getPrivateKey() {
        return this.privateKey;
    }

    @Override // com.nimbusds.jose.CriticalHeaderParamsAware
    public Set<String> getProcessedCriticalHeaderParams() {
        return this.critPolicy.getProcessedCriticalHeaderParams();
    }

    public RSADecrypter(RSAKey rSAKey) throws JOSEException {
        this(RSAKeyUtils.toRSAPrivateKey(rSAKey));
    }

    public RSADecrypter(PrivateKey privateKey, Set<String> set) {
        this(privateKey, set, false);
    }

    public RSADecrypter(PrivateKey privateKey, Set<String> set, boolean z10) {
        int iKeyBitLength;
        CriticalHeaderParamsDeferral criticalHeaderParamsDeferral = new CriticalHeaderParamsDeferral();
        this.critPolicy = criticalHeaderParamsDeferral;
        if (!privateKey.getAlgorithm().equalsIgnoreCase("RSA")) {
            throw new IllegalArgumentException("The private key algorithm must be RSA");
        }
        if (!z10 && (iKeyBitLength = RSAKeyUtils.keyBitLength(privateKey)) > 0 && iKeyBitLength < 2048) {
            throw new IllegalArgumentException("The RSA key size must be at least 2048 bits");
        }
        this.privateKey = privateKey;
        criticalHeaderParamsDeferral.setDeferredCriticalHeaderParams(set);
    }
}
