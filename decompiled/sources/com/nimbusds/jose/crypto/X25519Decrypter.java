package com.nimbusds.jose.crypto;

import com.nimbusds.jose.CriticalHeaderParamsAware;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWEDecrypter;
import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.crypto.impl.CriticalHeaderParamsDeferral;
import com.nimbusds.jose.crypto.impl.ECDH;
import com.nimbusds.jose.crypto.impl.ECDHCryptoProvider;
import com.nimbusds.jose.jwk.Curve;
import com.nimbusds.jose.jwk.OctetKeyPair;
import com.nimbusds.jose.util.Base64URL;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public class X25519Decrypter extends ECDHCryptoProvider implements JWEDecrypter, CriticalHeaderParamsAware {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final OctetKeyPair f62587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CriticalHeaderParamsDeferral f62588d;

    public X25519Decrypter(OctetKeyPair octetKeyPair) throws JOSEException {
        this(octetKeyPair, null);
    }

    @Override // com.nimbusds.jose.JWEDecrypter
    public byte[] decrypt(JWEHeader jWEHeader, Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, Base64URL base64URL4) throws JOSEException {
        this.f62588d.ensureHeaderPasses(jWEHeader);
        OctetKeyPair octetKeyPair = (OctetKeyPair) jWEHeader.getEphemeralPublicKey();
        if (octetKeyPair == null) {
            throw new JOSEException("Missing ephemeral public key \"epk\" JWE header parameter");
        }
        OctetKeyPair octetKeyPair2 = this.f62587c;
        if (octetKeyPair2.getCurve().equals(octetKeyPair.getCurve())) {
            return decryptWithZ(jWEHeader, ECDH.deriveSharedSecret(octetKeyPair, octetKeyPair2), base64URL, base64URL2, base64URL3, base64URL4);
        }
        throw new JOSEException("Curve of ephemeral public key does not match curve of private key");
    }

    @Override // com.nimbusds.jose.CriticalHeaderParamsAware
    public Set<String> getDeferredCriticalHeaderParams() {
        return this.f62588d.getProcessedCriticalHeaderParams();
    }

    public OctetKeyPair getPrivateKey() {
        return this.f62587c;
    }

    @Override // com.nimbusds.jose.CriticalHeaderParamsAware
    public Set<String> getProcessedCriticalHeaderParams() {
        return this.f62588d.getProcessedCriticalHeaderParams();
    }

    @Override // com.nimbusds.jose.crypto.impl.ECDHCryptoProvider
    public Set<Curve> supportedEllipticCurves() {
        return Collections.singleton(Curve.X25519);
    }

    public X25519Decrypter(OctetKeyPair octetKeyPair, Set<String> set) throws JOSEException {
        super(octetKeyPair.getCurve());
        CriticalHeaderParamsDeferral criticalHeaderParamsDeferral = new CriticalHeaderParamsDeferral();
        this.f62588d = criticalHeaderParamsDeferral;
        if (!Curve.X25519.equals(octetKeyPair.getCurve())) {
            throw new JOSEException("X25519Decrypter only supports OctetKeyPairs with crv=X25519");
        }
        if (!octetKeyPair.isPrivate()) {
            throw new JOSEException("The OctetKeyPair doesn't contain a private part");
        }
        this.f62587c = octetKeyPair;
        criticalHeaderParamsDeferral.setDeferredCriticalHeaderParams(set);
    }
}
