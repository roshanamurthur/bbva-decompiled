package com.nimbusds.jose.crypto;

import com.google.crypto.tink.subtle.X25519;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWECryptoParts;
import com.nimbusds.jose.JWEEncrypter;
import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.crypto.impl.ECDH;
import com.nimbusds.jose.crypto.impl.ECDHCryptoProvider;
import com.nimbusds.jose.jwk.Curve;
import com.nimbusds.jose.jwk.OctetKeyPair;
import com.nimbusds.jose.util.Base64URL;
import java.security.InvalidKeyException;
import java.util.Collections;
import java.util.Set;
import net.jcip.annotations.ThreadSafe;

/* JADX INFO: loaded from: classes10.dex */
@ThreadSafe
public class X25519Encrypter extends ECDHCryptoProvider implements JWEEncrypter {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final OctetKeyPair f62589c;

    public X25519Encrypter(OctetKeyPair octetKeyPair) throws JOSEException {
        super(octetKeyPair.getCurve());
        if (!Curve.X25519.equals(octetKeyPair.getCurve())) {
            throw new JOSEException("X25519Encrypter only supports OctetKeyPairs with crv=X25519");
        }
        if (octetKeyPair.isPrivate()) {
            throw new JOSEException("X25519Encrypter requires a public key, use OctetKeyPair.toPublicJWK()");
        }
        this.f62589c = octetKeyPair;
    }

    @Override // com.nimbusds.jose.JWEEncrypter
    public JWECryptoParts encrypt(JWEHeader jWEHeader, byte[] bArr) throws JOSEException {
        byte[] bArrGeneratePrivateKey = X25519.generatePrivateKey();
        try {
            OctetKeyPair octetKeyPairBuild = new OctetKeyPair.Builder(getCurve(), Base64URL.encode(X25519.publicFromPrivate(bArrGeneratePrivateKey))).d(Base64URL.encode(bArrGeneratePrivateKey)).build();
            return encryptWithZ(new JWEHeader.Builder(jWEHeader).ephemeralPublicKey(octetKeyPairBuild.toPublicJWK()).build(), ECDH.deriveSharedSecret(this.f62589c, octetKeyPairBuild), bArr);
        } catch (InvalidKeyException e5) {
            throw new JOSEException(e5.getMessage(), e5);
        }
    }

    public OctetKeyPair getPublicKey() {
        return this.f62589c;
    }

    @Override // com.nimbusds.jose.crypto.impl.ECDHCryptoProvider
    public Set<Curve> supportedEllipticCurves() {
        return Collections.singleton(Curve.X25519);
    }
}
