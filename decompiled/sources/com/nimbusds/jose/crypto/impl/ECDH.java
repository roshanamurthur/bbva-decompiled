package com.nimbusds.jose.crypto.impl;

import com.google.crypto.tink.subtle.X25519;
import com.nimbusds.jose.EncryptionMethod;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWEAlgorithm;
import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.jwk.Curve;
import com.nimbusds.jose.jwk.OctetKeyPair;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.interfaces.ECPublicKey;
import javax.crypto.KeyAgreement;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes10.dex */
public class ECDH {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class AlgorithmMode {
        private static final /* synthetic */ AlgorithmMode[] $VALUES;
        public static final AlgorithmMode DIRECT;
        public static final AlgorithmMode KW;

        static {
            AlgorithmMode algorithmMode = new AlgorithmMode("DIRECT", 0);
            DIRECT = algorithmMode;
            AlgorithmMode algorithmMode2 = new AlgorithmMode("KW", 1);
            KW = algorithmMode2;
            $VALUES = new AlgorithmMode[]{algorithmMode, algorithmMode2};
        }

        public AlgorithmMode() {
            throw null;
        }

        public static AlgorithmMode valueOf(String str) {
            return (AlgorithmMode) Enum.valueOf(AlgorithmMode.class, str);
        }

        public static AlgorithmMode[] values() {
            return (AlgorithmMode[]) $VALUES.clone();
        }
    }

    public static SecretKey deriveSharedKey(JWEHeader jWEHeader, SecretKey secretKey, ConcatKDF concatKDF) throws JOSEException {
        String name;
        int iSharedKeyLength = sharedKeyLength(jWEHeader.getAlgorithm(), jWEHeader.getEncryptionMethod());
        AlgorithmMode algorithmModeResolveAlgorithmMode = resolveAlgorithmMode(jWEHeader.getAlgorithm());
        if (algorithmModeResolveAlgorithmMode == AlgorithmMode.DIRECT) {
            name = jWEHeader.getEncryptionMethod().getName();
        } else {
            if (algorithmModeResolveAlgorithmMode != AlgorithmMode.KW) {
                throw new JOSEException("Unsupported JWE ECDH algorithm mode: " + algorithmModeResolveAlgorithmMode);
            }
            name = jWEHeader.getAlgorithm().getName();
        }
        return concatKDF.deriveKey(secretKey, iSharedKeyLength, ConcatKDF.encodeDataWithLength(name.getBytes(StandardCharsets.US_ASCII)), ConcatKDF.encodeDataWithLength(jWEHeader.getAgreementPartyUInfo()), ConcatKDF.encodeDataWithLength(jWEHeader.getAgreementPartyVInfo()), ConcatKDF.encodeIntData(iSharedKeyLength), ConcatKDF.encodeNoData());
    }

    public static SecretKey deriveSharedSecret(ECPublicKey eCPublicKey, PrivateKey privateKey, Provider provider) throws JOSEException {
        try {
            KeyAgreement keyAgreement = provider != null ? KeyAgreement.getInstance("ECDH", provider) : KeyAgreement.getInstance("ECDH");
            try {
                keyAgreement.init(privateKey);
                keyAgreement.doPhase(eCPublicKey, true);
                return new SecretKeySpec(keyAgreement.generateSecret(), "AES");
            } catch (InvalidKeyException e5) {
                throw new JOSEException("Invalid key for ECDH key agreement: " + e5.getMessage(), e5);
            }
        } catch (NoSuchAlgorithmException e7) {
            throw new JOSEException("Couldn't get an ECDH key agreement instance: " + e7.getMessage(), e7);
        }
    }

    public static AlgorithmMode resolveAlgorithmMode(JWEAlgorithm jWEAlgorithm) throws JOSEException {
        if (jWEAlgorithm.equals(JWEAlgorithm.ECDH_ES)) {
            return AlgorithmMode.DIRECT;
        }
        if (jWEAlgorithm.equals(JWEAlgorithm.ECDH_ES_A128KW) || jWEAlgorithm.equals(JWEAlgorithm.ECDH_ES_A192KW) || jWEAlgorithm.equals(JWEAlgorithm.ECDH_ES_A256KW)) {
            return AlgorithmMode.KW;
        }
        throw new JOSEException(AlgorithmSupportMessage.unsupportedJWEAlgorithm(jWEAlgorithm, ECDHCryptoProvider.SUPPORTED_ALGORITHMS));
    }

    public static int sharedKeyLength(JWEAlgorithm jWEAlgorithm, EncryptionMethod encryptionMethod) throws JOSEException {
        if (jWEAlgorithm.equals(JWEAlgorithm.ECDH_ES)) {
            int iCekBitLength = encryptionMethod.cekBitLength();
            if (iCekBitLength != 0) {
                return iCekBitLength;
            }
            throw new JOSEException("Unsupported JWE encryption method " + encryptionMethod);
        }
        if (jWEAlgorithm.equals(JWEAlgorithm.ECDH_ES_A128KW)) {
            return 128;
        }
        if (jWEAlgorithm.equals(JWEAlgorithm.ECDH_ES_A192KW)) {
            return 192;
        }
        if (jWEAlgorithm.equals(JWEAlgorithm.ECDH_ES_A256KW)) {
            return 256;
        }
        throw new JOSEException(AlgorithmSupportMessage.unsupportedJWEAlgorithm(jWEAlgorithm, ECDHCryptoProvider.SUPPORTED_ALGORITHMS));
    }

    public static SecretKey deriveSharedSecret(OctetKeyPair octetKeyPair, OctetKeyPair octetKeyPair2) throws JOSEException {
        if (!octetKeyPair.isPrivate()) {
            Curve curve = Curve.X25519;
            if (curve.equals(octetKeyPair.getCurve())) {
                if (octetKeyPair2.isPrivate()) {
                    if (curve.equals(octetKeyPair2.getCurve())) {
                        try {
                            return new SecretKeySpec(X25519.computeSharedSecret(octetKeyPair2.getDecodedD(), octetKeyPair.getDecodedX()), "AES");
                        } catch (InvalidKeyException e5) {
                            throw new JOSEException(e5.getMessage(), e5);
                        }
                    }
                    throw new JOSEException("Expected private key OKP with crv=X25519");
                }
                throw new JOSEException("Expected private key but received OKP without 'd' value");
            }
            throw new JOSEException("Expected public key OKP with crv=X25519");
        }
        throw new JOSEException("Expected public key but received OKP with 'd' value");
    }
}
