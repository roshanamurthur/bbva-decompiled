package com.nimbusds.jose.jwk.gen;

import com.google.crypto.tink.subtle.Ed25519Sign;
import com.google.crypto.tink.subtle.X25519;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.jwk.Curve;
import com.nimbusds.jose.jwk.OctetKeyPair;
import com.nimbusds.jose.util.Base64URL;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public class OctetKeyPairGenerator extends JWKGenerator<OctetKeyPair> {
    public static final Set<Curve> SUPPORTED_CURVES;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Curve f62709a;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(Curve.X25519);
        linkedHashSet.add(Curve.Ed25519);
        SUPPORTED_CURVES = Collections.unmodifiableSet(linkedHashSet);
    }

    public OctetKeyPairGenerator(Curve curve) {
        if (curve == null) {
            throw new IllegalArgumentException("The curve must not be null");
        }
        if (!SUPPORTED_CURVES.contains(curve)) {
            throw new IllegalArgumentException("Curve not supported for OKP generation");
        }
        this.f62709a = curve;
    }

    @Override // com.nimbusds.jose.jwk.gen.JWKGenerator
    public OctetKeyPair generate() throws JOSEException {
        Base64URL base64URLEncode;
        Base64URL base64URLEncode2;
        Curve curve = Curve.X25519;
        Curve curve2 = this.f62709a;
        if (curve2.equals(curve)) {
            try {
                byte[] bArrGeneratePrivateKey = X25519.generatePrivateKey();
                byte[] bArrPublicFromPrivate = X25519.publicFromPrivate(bArrGeneratePrivateKey);
                base64URLEncode = Base64URL.encode(bArrGeneratePrivateKey);
                base64URLEncode2 = Base64URL.encode(bArrPublicFromPrivate);
            } catch (InvalidKeyException e5) {
                throw new JOSEException(e5.getMessage(), e5);
            }
        } else {
            if (!curve2.equals(Curve.Ed25519)) {
                throw new JOSEException("Curve not supported");
            }
            try {
                Ed25519Sign.KeyPair keyPairNewKeyPair = Ed25519Sign.KeyPair.newKeyPair();
                Base64URL base64URLEncode3 = Base64URL.encode(keyPairNewKeyPair.getPrivateKey());
                base64URLEncode2 = Base64URL.encode(keyPairNewKeyPair.getPublicKey());
                base64URLEncode = base64URLEncode3;
            } catch (GeneralSecurityException e7) {
                throw new JOSEException(e7.getMessage(), e7);
            }
        }
        OctetKeyPair.Builder builderAlgorithm = new OctetKeyPair.Builder(curve2, base64URLEncode2).d(base64URLEncode).keyUse(this.use).keyOperations(this.ops).algorithm(this.alg);
        if (this.x5tKid) {
            builderAlgorithm.keyIDFromThumbprint();
        } else {
            builderAlgorithm.keyID(this.kid);
        }
        return builderAlgorithm.build();
    }
}
