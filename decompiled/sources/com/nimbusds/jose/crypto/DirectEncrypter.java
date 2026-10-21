package com.nimbusds.jose.crypto;

import com.nimbusds.jose.EncryptionMethod;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWEAlgorithm;
import com.nimbusds.jose.JWECryptoParts;
import com.nimbusds.jose.JWEEncrypter;
import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.KeyLengthException;
import com.nimbusds.jose.crypto.impl.AlgorithmSupportMessage;
import com.nimbusds.jose.crypto.impl.ContentCryptoProvider;
import com.nimbusds.jose.crypto.impl.DirectCryptoProvider;
import com.nimbusds.jose.jwk.OctetSequenceKey;
import com.nimbusds.jose.util.ByteUtils;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import net.jcip.annotations.ThreadSafe;

/* JADX INFO: loaded from: classes10.dex */
@ThreadSafe
public class DirectEncrypter extends DirectCryptoProvider implements JWEEncrypter {
    public DirectEncrypter(SecretKey secretKey) throws KeyLengthException {
        super(secretKey);
    }

    @Override // com.nimbusds.jose.JWEEncrypter
    public JWECryptoParts encrypt(JWEHeader jWEHeader, byte[] bArr) throws JOSEException {
        JWEAlgorithm algorithm = jWEHeader.getAlgorithm();
        if (!algorithm.equals(JWEAlgorithm.DIR)) {
            throw new JOSEException(AlgorithmSupportMessage.unsupportedJWEAlgorithm(algorithm, DirectCryptoProvider.SUPPORTED_ALGORITHMS));
        }
        EncryptionMethod encryptionMethod = jWEHeader.getEncryptionMethod();
        if (encryptionMethod.cekBitLength() == ByteUtils.safeBitLength(getKey().getEncoded())) {
            return ContentCryptoProvider.encrypt(jWEHeader, bArr, getKey(), null, getJCAContext());
        }
        throw new KeyLengthException(encryptionMethod.cekBitLength(), encryptionMethod);
    }

    public DirectEncrypter(byte[] bArr) throws KeyLengthException {
        this(new SecretKeySpec(bArr, "AES"));
    }

    public DirectEncrypter(OctetSequenceKey octetSequenceKey) throws KeyLengthException {
        this(octetSequenceKey.toSecretKey("AES"));
    }
}
