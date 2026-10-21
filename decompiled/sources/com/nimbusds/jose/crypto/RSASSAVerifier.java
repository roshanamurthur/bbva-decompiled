package com.nimbusds.jose.crypto;

import com.nimbusds.jose.CriticalHeaderParamsAware;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.JWSVerifier;
import com.nimbusds.jose.crypto.impl.CriticalHeaderParamsDeferral;
import com.nimbusds.jose.crypto.impl.RSASSA;
import com.nimbusds.jose.crypto.impl.RSASSAProvider;
import com.nimbusds.jose.jwk.RSAKey;
import com.nimbusds.jose.util.Base64URL;
import java.security.InvalidKeyException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.RSAPublicKey;
import java.util.Set;
import net.jcip.annotations.ThreadSafe;

/* JADX INFO: loaded from: classes10.dex */
@ThreadSafe
public class RSASSAVerifier extends RSASSAProvider implements JWSVerifier, CriticalHeaderParamsAware {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CriticalHeaderParamsDeferral f62585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RSAPublicKey f62586d;

    public RSASSAVerifier(RSAPublicKey rSAPublicKey) {
        this(rSAPublicKey, null);
    }

    @Override // com.nimbusds.jose.CriticalHeaderParamsAware
    public Set<String> getDeferredCriticalHeaderParams() {
        return this.f62585c.getDeferredCriticalHeaderParams();
    }

    @Override // com.nimbusds.jose.CriticalHeaderParamsAware
    public Set<String> getProcessedCriticalHeaderParams() {
        return this.f62585c.getProcessedCriticalHeaderParams();
    }

    public RSAPublicKey getPublicKey() {
        return this.f62586d;
    }

    @Override // com.nimbusds.jose.JWSVerifier
    public boolean verify(JWSHeader jWSHeader, byte[] bArr, Base64URL base64URL) throws JOSEException {
        if (!this.f62585c.headerPasses(jWSHeader)) {
            return false;
        }
        Signature signerAndVerifier = RSASSA.getSignerAndVerifier(jWSHeader.getAlgorithm(), getJCAContext().getProvider());
        try {
            signerAndVerifier.initVerify(this.f62586d);
            try {
                signerAndVerifier.update(bArr);
                return signerAndVerifier.verify(base64URL.decode());
            } catch (SignatureException unused) {
                return false;
            }
        } catch (InvalidKeyException e5) {
            throw new JOSEException("Invalid public RSA key: " + e5.getMessage(), e5);
        }
    }

    public RSASSAVerifier(RSAKey rSAKey) throws JOSEException {
        this(rSAKey.toRSAPublicKey(), null);
    }

    public RSASSAVerifier(RSAPublicKey rSAPublicKey, Set<String> set) {
        CriticalHeaderParamsDeferral criticalHeaderParamsDeferral = new CriticalHeaderParamsDeferral();
        this.f62585c = criticalHeaderParamsDeferral;
        if (rSAPublicKey != null) {
            this.f62586d = rSAPublicKey;
            criticalHeaderParamsDeferral.setDeferredCriticalHeaderParams(set);
            return;
        }
        throw new IllegalArgumentException("The public RSA key must not be null");
    }
}
