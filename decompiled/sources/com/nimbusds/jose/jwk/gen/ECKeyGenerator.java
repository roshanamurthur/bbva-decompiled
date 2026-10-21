package com.nimbusds.jose.jwk.gen;

import com.bbva.glomohybrid.login.domain.constants.LoginHelperConstants;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.jwk.Curve;
import com.nimbusds.jose.jwk.ECKey;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;

/* JADX INFO: loaded from: classes10.dex */
public class ECKeyGenerator extends JWKGenerator<ECKey> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Curve f62708a;

    public ECKeyGenerator(Curve curve) {
        if (curve == null) {
            throw new IllegalArgumentException("The curve must not be null");
        }
        this.f62708a = curve;
    }

    @Override // com.nimbusds.jose.jwk.gen.JWKGenerator
    public ECKey generate() throws JOSEException {
        Curve curve = this.f62708a;
        ECParameterSpec eCParameterSpec = curve.toECParameterSpec();
        try {
            KeyStore keyStore = this.keyStore;
            KeyPairGenerator keyPairGenerator = keyStore != null ? KeyPairGenerator.getInstance(LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_EC, keyStore.getProvider()) : KeyPairGenerator.getInstance(LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_EC);
            keyPairGenerator.initialize(eCParameterSpec);
            KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
            ECKey.Builder builderKeyStore = new ECKey.Builder(curve, (ECPublicKey) keyPairGenerateKeyPair.getPublic()).privateKey(keyPairGenerateKeyPair.getPrivate()).keyUse(this.use).keyOperations(this.ops).algorithm(this.alg).keyStore(this.keyStore);
            if (this.x5tKid) {
                builderKeyStore.keyIDFromThumbprint();
            } else {
                builderKeyStore.keyID(this.kid);
            }
            return builderKeyStore.build();
        } catch (InvalidAlgorithmParameterException e5) {
            e = e5;
            throw new JOSEException(e.getMessage(), e);
        } catch (NoSuchAlgorithmException e7) {
            e = e7;
            throw new JOSEException(e.getMessage(), e);
        }
    }
}
