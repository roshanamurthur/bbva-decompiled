package com.nimbusds.jose.crypto;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWEAlgorithm;
import com.nimbusds.jose.JWECryptoParts;
import com.nimbusds.jose.JWEEncrypter;
import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.KeyLengthException;
import com.nimbusds.jose.crypto.impl.AESCryptoProvider;
import com.nimbusds.jose.crypto.impl.AESGCM;
import com.nimbusds.jose.crypto.impl.AESGCMKW;
import com.nimbusds.jose.crypto.impl.AESKW;
import com.nimbusds.jose.crypto.impl.AlgorithmSupportMessage;
import com.nimbusds.jose.crypto.impl.AuthenticatedCipherText;
import com.nimbusds.jose.crypto.impl.ContentCryptoProvider;
import com.nimbusds.jose.jwk.OctetSequenceKey;
import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jose.util.ByteUtils;
import com.nimbusds.jose.util.Container;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import net.jcip.annotations.ThreadSafe;

/* JADX INFO: loaded from: classes10.dex */
@ThreadSafe
public class AESEncrypter extends AESCryptoProvider implements JWEEncrypter {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a AESGCMKW;
        public static final a AESKW;

        static {
            a aVar = new a("AESKW", 0);
            AESKW = aVar;
            a aVar2 = new a("AESGCMKW", 1);
            AESGCMKW = aVar2;
            $VALUES = new a[]{aVar, aVar2};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public AESEncrypter(SecretKey secretKey) throws KeyLengthException {
        super(secretKey);
    }

    @Override // com.nimbusds.jose.JWEEncrypter
    public JWECryptoParts encrypt(JWEHeader jWEHeader, byte[] bArr) throws JOSEException {
        a aVar;
        Base64URL base64URLEncode;
        JWEAlgorithm algorithm = jWEHeader.getAlgorithm();
        if (algorithm.equals(JWEAlgorithm.A128KW)) {
            if (ByteUtils.safeBitLength(getKey().getEncoded()) != 128) {
                throw new KeyLengthException("The Key Encryption Key (KEK) length must be 128 bits for A128KW encryption");
            }
            aVar = a.AESKW;
        } else if (algorithm.equals(JWEAlgorithm.A192KW)) {
            if (ByteUtils.safeBitLength(getKey().getEncoded()) != 192) {
                throw new KeyLengthException("The Key Encryption Key (KEK) length must be 192 bits for A192KW encryption");
            }
            aVar = a.AESKW;
        } else if (algorithm.equals(JWEAlgorithm.A256KW)) {
            if (ByteUtils.safeBitLength(getKey().getEncoded()) != 256) {
                throw new KeyLengthException("The Key Encryption Key (KEK) length must be 256 bits for A256KW encryption");
            }
            aVar = a.AESKW;
        } else if (algorithm.equals(JWEAlgorithm.A128GCMKW)) {
            if (ByteUtils.safeBitLength(getKey().getEncoded()) != 128) {
                throw new KeyLengthException("The Key Encryption Key (KEK) length must be 128 bits for A128GCMKW encryption");
            }
            aVar = a.AESGCMKW;
        } else if (algorithm.equals(JWEAlgorithm.A192GCMKW)) {
            if (ByteUtils.safeBitLength(getKey().getEncoded()) != 192) {
                throw new KeyLengthException("The Key Encryption Key (KEK) length must be 192 bits for A192GCMKW encryption");
            }
            aVar = a.AESGCMKW;
        } else {
            if (!algorithm.equals(JWEAlgorithm.A256GCMKW)) {
                throw new JOSEException(AlgorithmSupportMessage.unsupportedJWEAlgorithm(algorithm, AESCryptoProvider.SUPPORTED_ALGORITHMS));
            }
            if (ByteUtils.safeBitLength(getKey().getEncoded()) != 256) {
                throw new KeyLengthException("The Key Encryption Key (KEK) length must be 256 bits for A256GCMKW encryption");
            }
            aVar = a.AESGCMKW;
        }
        SecretKey secretKeyGenerateCEK = ContentCryptoProvider.generateCEK(jWEHeader.getEncryptionMethod(), getJCAContext().getSecureRandom());
        if (a.AESKW.equals(aVar)) {
            base64URLEncode = Base64URL.encode(AESKW.wrapCEK(secretKeyGenerateCEK, getKey(), getJCAContext().getKeyEncryptionProvider()));
        } else {
            if (!a.AESGCMKW.equals(aVar)) {
                throw new JOSEException("Unexpected JWE algorithm: " + algorithm);
            }
            Container container = new Container(AESGCM.generateIV(getJCAContext().getSecureRandom()));
            AuthenticatedCipherText authenticatedCipherTextEncryptCEK = AESGCMKW.encryptCEK(secretKeyGenerateCEK, container, getKey(), getJCAContext().getKeyEncryptionProvider());
            Base64URL base64URLEncode2 = Base64URL.encode(authenticatedCipherTextEncryptCEK.getCipherText());
            jWEHeader = new JWEHeader.Builder(jWEHeader).iv(Base64URL.encode((byte[]) container.get())).authTag(Base64URL.encode(authenticatedCipherTextEncryptCEK.getAuthenticationTag())).build();
            base64URLEncode = base64URLEncode2;
        }
        return ContentCryptoProvider.encrypt(jWEHeader, bArr, secretKeyGenerateCEK, base64URLEncode, getJCAContext());
    }

    public AESEncrypter(byte[] bArr) throws KeyLengthException {
        this(new SecretKeySpec(bArr, "AES"));
    }

    public AESEncrypter(OctetSequenceKey octetSequenceKey) throws KeyLengthException {
        this(octetSequenceKey.toSecretKey("AES"));
    }
}
