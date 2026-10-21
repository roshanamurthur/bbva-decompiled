package com.nimbusds.jose.crypto;

import com.google.crypto.tink.subtle.Ed25519Verify;
import com.nimbusds.jose.CriticalHeaderParamsAware;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.JWSVerifier;
import com.nimbusds.jose.crypto.impl.CriticalHeaderParamsDeferral;
import com.nimbusds.jose.crypto.impl.EdDSAProvider;
import com.nimbusds.jose.jwk.Curve;
import com.nimbusds.jose.jwk.OctetKeyPair;
import com.nimbusds.jose.util.Base64URL;
import java.security.GeneralSecurityException;
import java.util.Set;
import net.jcip.annotations.ThreadSafe;

/* JADX INFO: loaded from: classes10.dex */
@ThreadSafe
public class Ed25519Verifier extends EdDSAProvider implements JWSVerifier, CriticalHeaderParamsAware {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CriticalHeaderParamsDeferral f62572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final OctetKeyPair f62573d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ed25519Verify f62574e;

    public Ed25519Verifier(OctetKeyPair octetKeyPair) throws JOSEException {
        this(octetKeyPair, null);
    }

    @Override // com.nimbusds.jose.CriticalHeaderParamsAware
    public Set<String> getDeferredCriticalHeaderParams() {
        return this.f62572c.getProcessedCriticalHeaderParams();
    }

    @Override // com.nimbusds.jose.CriticalHeaderParamsAware
    public Set<String> getProcessedCriticalHeaderParams() {
        return this.f62572c.getProcessedCriticalHeaderParams();
    }

    public OctetKeyPair getPublicKey() {
        return this.f62573d;
    }

    @Override // com.nimbusds.jose.JWSVerifier
    public boolean verify(JWSHeader jWSHeader, byte[] bArr, Base64URL base64URL) throws JOSEException {
        if (!JWSAlgorithm.EdDSA.equals(jWSHeader.getAlgorithm())) {
            throw new JOSEException("Ed25519Verifier requires alg=EdDSA in JWSHeader");
        }
        if (!this.f62572c.headerPasses(jWSHeader)) {
            return false;
        }
        try {
            this.f62574e.verify(base64URL.decode(), bArr);
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    public Ed25519Verifier(OctetKeyPair octetKeyPair, Set<String> set) throws JOSEException {
        CriticalHeaderParamsDeferral criticalHeaderParamsDeferral = new CriticalHeaderParamsDeferral();
        this.f62572c = criticalHeaderParamsDeferral;
        if (!Curve.Ed25519.equals(octetKeyPair.getCurve())) {
            throw new JOSEException("Ed25519Verifier only supports OctetKeyPairs with crv=Ed25519");
        }
        if (octetKeyPair.isPrivate()) {
            throw new JOSEException("Ed25519Verifier requires a public key, use OctetKeyPair.toPublicJWK()");
        }
        this.f62573d = octetKeyPair;
        this.f62574e = new Ed25519Verify(octetKeyPair.getDecodedX());
        criticalHeaderParamsDeferral.setDeferredCriticalHeaderParams(set);
    }
}
