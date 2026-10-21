package com.nimbusds.jose.crypto;

import com.nimbusds.jose.CriticalHeaderParamsAware;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.JWSVerifier;
import com.nimbusds.jose.crypto.impl.AlgorithmSupportMessage;
import com.nimbusds.jose.crypto.impl.CriticalHeaderParamsDeferral;
import com.nimbusds.jose.crypto.impl.ECDSA;
import com.nimbusds.jose.crypto.impl.ECDSAProvider;
import com.nimbusds.jose.crypto.utils.ECChecks;
import com.nimbusds.jose.jwk.Curve;
import com.nimbusds.jose.jwk.ECKey;
import com.nimbusds.jose.util.Base64URL;
import java.security.InvalidKeyException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.ECPublicKey;
import java.util.Set;
import net.jcip.annotations.ThreadSafe;

/* JADX INFO: loaded from: classes10.dex */
@ThreadSafe
public class ECDSAVerifier extends ECDSAProvider implements JWSVerifier, CriticalHeaderParamsAware {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CriticalHeaderParamsDeferral f62568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ECPublicKey f62569d;

    public ECDSAVerifier(ECPublicKey eCPublicKey) throws JOSEException {
        this(eCPublicKey, null);
    }

    @Override // com.nimbusds.jose.CriticalHeaderParamsAware
    public Set<String> getDeferredCriticalHeaderParams() {
        return this.f62568c.getProcessedCriticalHeaderParams();
    }

    @Override // com.nimbusds.jose.CriticalHeaderParamsAware
    public Set<String> getProcessedCriticalHeaderParams() {
        return this.f62568c.getProcessedCriticalHeaderParams();
    }

    public ECPublicKey getPublicKey() {
        return this.f62569d;
    }

    @Override // com.nimbusds.jose.JWSVerifier
    public boolean verify(JWSHeader jWSHeader, byte[] bArr, Base64URL base64URL) throws JOSEException {
        JWSAlgorithm algorithm = jWSHeader.getAlgorithm();
        if (!supportedJWSAlgorithms().contains(algorithm)) {
            throw new JOSEException(AlgorithmSupportMessage.unsupportedJWSAlgorithm(algorithm, supportedJWSAlgorithms()));
        }
        if (!this.f62568c.headerPasses(jWSHeader)) {
            return false;
        }
        try {
            byte[] bArrTranscodeSignatureToDER = ECDSA.transcodeSignatureToDER(base64URL.decode());
            Signature signerAndVerifier = ECDSA.getSignerAndVerifier(algorithm, getJCAContext().getProvider());
            try {
                signerAndVerifier.initVerify(this.f62569d);
                signerAndVerifier.update(bArr);
                return signerAndVerifier.verify(bArrTranscodeSignatureToDER);
            } catch (InvalidKeyException e5) {
                throw new JOSEException("Invalid EC public key: " + e5.getMessage(), e5);
            } catch (SignatureException unused) {
                return false;
            }
        } catch (JOSEException unused2) {
            return false;
        }
    }

    public ECDSAVerifier(ECKey eCKey) throws JOSEException {
        this(eCKey.toECPublicKey());
    }

    public ECDSAVerifier(ECPublicKey eCPublicKey, Set<String> set) throws JOSEException {
        super(ECDSA.resolveAlgorithm(eCPublicKey));
        CriticalHeaderParamsDeferral criticalHeaderParamsDeferral = new CriticalHeaderParamsDeferral();
        this.f62568c = criticalHeaderParamsDeferral;
        this.f62569d = eCPublicKey;
        if (ECChecks.isPointOnCurve(eCPublicKey, Curve.forJWSAlgorithm(supportedECDSAAlgorithm()).iterator().next().toECParameterSpec())) {
            criticalHeaderParamsDeferral.setDeferredCriticalHeaderParams(set);
            return;
        }
        throw new JOSEException("Curve / public key parameters mismatch");
    }
}
