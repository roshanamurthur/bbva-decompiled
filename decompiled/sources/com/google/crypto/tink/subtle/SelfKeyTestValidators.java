package com.google.crypto.tink.subtle;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;

/* JADX INFO: loaded from: classes10.dex */
public final class SelfKeyTestValidators {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ByteString f47500a = ByteString.copyFromUtf8("Tink and Wycheproof.");

    public static final void validateEcdsa(ECPrivateKey eCPrivateKey, ECPublicKey eCPublicKey, Enums.HashType hashType, EllipticCurves.EcdsaEncoding ecdsaEncoding) throws GeneralSecurityException {
        EcdsaSignJce ecdsaSignJce = new EcdsaSignJce(eCPrivateKey, hashType, ecdsaEncoding);
        EcdsaVerifyJce ecdsaVerifyJce = new EcdsaVerifyJce(eCPublicKey, hashType, ecdsaEncoding);
        try {
            ByteString byteString = f47500a;
            ecdsaVerifyJce.verify(ecdsaSignJce.sign(byteString.toByteArray()), byteString.toByteArray());
        } catch (GeneralSecurityException e5) {
            throw new GeneralSecurityException("ECDSA signing with private key followed by verifying with public key failed. The key may be corrupted.", e5);
        }
    }

    public static final void validateRsaSsaPkcs1(RSAPrivateCrtKey rSAPrivateCrtKey, RSAPublicKey rSAPublicKey, Enums.HashType hashType) throws GeneralSecurityException {
        RsaSsaPkcs1SignJce rsaSsaPkcs1SignJce = new RsaSsaPkcs1SignJce(rSAPrivateCrtKey, hashType);
        RsaSsaPkcs1VerifyJce rsaSsaPkcs1VerifyJce = new RsaSsaPkcs1VerifyJce(rSAPublicKey, hashType);
        try {
            ByteString byteString = f47500a;
            rsaSsaPkcs1VerifyJce.verify(rsaSsaPkcs1SignJce.sign(byteString.toByteArray()), byteString.toByteArray());
        } catch (GeneralSecurityException e5) {
            throw new GeneralSecurityException("RSA PKCS1 signing with private key followed by verifying with public key failed. The key may be corrupted.", e5);
        }
    }

    public static final void validateRsaSsaPss(RSAPrivateCrtKey rSAPrivateCrtKey, RSAPublicKey rSAPublicKey, Enums.HashType hashType, Enums.HashType hashType2, int i10) throws GeneralSecurityException {
        RsaSsaPssSignJce rsaSsaPssSignJce = new RsaSsaPssSignJce(rSAPrivateCrtKey, hashType, hashType2, i10);
        RsaSsaPssVerifyJce rsaSsaPssVerifyJce = new RsaSsaPssVerifyJce(rSAPublicKey, hashType, hashType2, i10);
        try {
            ByteString byteString = f47500a;
            rsaSsaPssVerifyJce.verify(rsaSsaPssSignJce.sign(byteString.toByteArray()), byteString.toByteArray());
        } catch (GeneralSecurityException e5) {
            throw new GeneralSecurityException("RSA PSS signing with private key followed by verifying with public key failed. The key may be corrupted.", e5);
        }
    }
}
