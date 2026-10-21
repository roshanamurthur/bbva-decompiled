package com.nimbusds.jose.crypto;

import com.bbva.glomohybrid.login.domain.constants.LoginHelperConstants;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.JWSSigner;
import com.nimbusds.jose.crypto.impl.AlgorithmSupportMessage;
import com.nimbusds.jose.crypto.impl.ECDSA;
import com.nimbusds.jose.crypto.impl.ECDSAProvider;
import com.nimbusds.jose.jwk.Curve;
import com.nimbusds.jose.jwk.ECKey;
import com.nimbusds.jose.util.Base64URL;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.ECPrivateKey;
import net.jcip.annotations.ThreadSafe;

/* JADX INFO: loaded from: classes10.dex */
@ThreadSafe
public class ECDSASigner extends ECDSAProvider implements JWSSigner {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PrivateKey f62567c;

    public ECDSASigner(ECPrivateKey eCPrivateKey) throws JOSEException {
        super(ECDSA.resolveAlgorithm(eCPrivateKey));
        this.f62567c = eCPrivateKey;
    }

    public PrivateKey getPrivateKey() {
        return this.f62567c;
    }

    @Override // com.nimbusds.jose.JWSSigner
    public Base64URL sign(JWSHeader jWSHeader, byte[] bArr) throws JOSEException {
        JWSAlgorithm algorithm = jWSHeader.getAlgorithm();
        if (!supportedJWSAlgorithms().contains(algorithm)) {
            throw new JOSEException(AlgorithmSupportMessage.unsupportedJWSAlgorithm(algorithm, supportedJWSAlgorithms()));
        }
        try {
            Signature signerAndVerifier = ECDSA.getSignerAndVerifier(algorithm, getJCAContext().getProvider());
            signerAndVerifier.initSign(this.f62567c, getJCAContext().getSecureRandom());
            signerAndVerifier.update(bArr);
            return Base64URL.encode(ECDSA.transcodeSignatureToConcat(signerAndVerifier.sign(), ECDSA.getSignatureByteArrayLength(jWSHeader.getAlgorithm())));
        } catch (InvalidKeyException | SignatureException e5) {
            throw new JOSEException(e5.getMessage(), e5);
        }
    }

    public ECDSASigner(PrivateKey privateKey, Curve curve) throws JOSEException {
        super(ECDSA.resolveAlgorithm(curve));
        if (LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_EC.equalsIgnoreCase(privateKey.getAlgorithm())) {
            this.f62567c = privateKey;
            return;
        }
        throw new IllegalArgumentException("The private key algorithm must be EC");
    }

    public ECDSASigner(ECKey eCKey) throws JOSEException {
        super(ECDSA.resolveAlgorithm(eCKey.getCurve()));
        if (eCKey.isPrivate()) {
            this.f62567c = eCKey.toPrivateKey();
            return;
        }
        throw new JOSEException("The EC JWK doesn't contain a private part");
    }
}
