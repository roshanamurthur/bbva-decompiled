package com.nimbusds.jose.crypto;

import com.nimbusds.jose.EncryptionMethod;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWEAlgorithm;
import com.nimbusds.jose.JWECryptoParts;
import com.nimbusds.jose.JWEEncrypter;
import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.crypto.impl.AlgorithmSupportMessage;
import com.nimbusds.jose.crypto.impl.ContentCryptoProvider;
import com.nimbusds.jose.crypto.impl.RSA1_5;
import com.nimbusds.jose.crypto.impl.RSACryptoProvider;
import com.nimbusds.jose.crypto.impl.RSA_OAEP;
import com.nimbusds.jose.crypto.impl.RSA_OAEP_256;
import com.nimbusds.jose.jwk.RSAKey;
import com.nimbusds.jose.util.Base64URL;
import java.security.interfaces.RSAPublicKey;
import javax.crypto.SecretKey;
import net.jcip.annotations.ThreadSafe;

/* JADX INFO: loaded from: classes10.dex */
@ThreadSafe
public class RSAEncrypter extends RSACryptoProvider implements JWEEncrypter {
    private final SecretKey contentEncryptionKey;
    private final RSAPublicKey publicKey;

    public RSAEncrypter(RSAPublicKey rSAPublicKey) {
        this(rSAPublicKey, null);
    }

    @Override // com.nimbusds.jose.JWEEncrypter
    public JWECryptoParts encrypt(JWEHeader jWEHeader, byte[] bArr) throws JOSEException {
        Base64URL base64URLEncode;
        JWEAlgorithm algorithm = jWEHeader.getAlgorithm();
        EncryptionMethod encryptionMethod = jWEHeader.getEncryptionMethod();
        SecretKey secretKeyGenerateCEK = this.contentEncryptionKey;
        if (secretKeyGenerateCEK == null) {
            secretKeyGenerateCEK = ContentCryptoProvider.generateCEK(encryptionMethod, getJCAContext().getSecureRandom());
        }
        if (algorithm.equals(JWEAlgorithm.RSA1_5)) {
            base64URLEncode = Base64URL.encode(RSA1_5.encryptCEK(this.publicKey, secretKeyGenerateCEK, getJCAContext().getKeyEncryptionProvider()));
        } else if (algorithm.equals(JWEAlgorithm.RSA_OAEP)) {
            base64URLEncode = Base64URL.encode(RSA_OAEP.encryptCEK(this.publicKey, secretKeyGenerateCEK, getJCAContext().getKeyEncryptionProvider()));
        } else {
            if (!algorithm.equals(JWEAlgorithm.RSA_OAEP_256)) {
                throw new JOSEException(AlgorithmSupportMessage.unsupportedJWEAlgorithm(algorithm, RSACryptoProvider.SUPPORTED_ALGORITHMS));
            }
            base64URLEncode = Base64URL.encode(RSA_OAEP_256.encryptCEK(this.publicKey, secretKeyGenerateCEK, getJCAContext().getKeyEncryptionProvider()));
        }
        return ContentCryptoProvider.encrypt(jWEHeader, bArr, secretKeyGenerateCEK, base64URLEncode, getJCAContext());
    }

    public RSAPublicKey getPublicKey() {
        return this.publicKey;
    }

    public RSAEncrypter(RSAKey rSAKey) throws JOSEException {
        this(rSAKey.toRSAPublicKey());
    }

    public RSAEncrypter(RSAPublicKey rSAPublicKey, SecretKey secretKey) {
        if (rSAPublicKey != null) {
            this.publicKey = rSAPublicKey;
            if (secretKey != null) {
                if (secretKey.getAlgorithm() != null && secretKey.getAlgorithm().equals("AES")) {
                    this.contentEncryptionKey = secretKey;
                    return;
                }
                throw new IllegalArgumentException("The algorithm of the content encryption key (CEK) must be AES");
            }
            this.contentEncryptionKey = null;
            return;
        }
        throw new IllegalArgumentException("The public RSA key must not be null");
    }
}
