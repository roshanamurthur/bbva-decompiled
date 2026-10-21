package com.nimbusds.jose.jwk.gen;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.jwk.RSAKey;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPublicKey;

/* JADX INFO: loaded from: classes10.dex */
public class RSAKeyGenerator extends JWKGenerator<RSAKey> {
    public static final int MIN_KEY_SIZE_BITS = 2048;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f62712a;

    public RSAKeyGenerator(int i10) {
        this(i10, false);
    }

    public RSAKeyGenerator(int i10, boolean z10) {
        if (!z10 && i10 < 2048) {
            throw new IllegalArgumentException("The key size must be at least 2048 bits");
        }
        this.f62712a = i10;
    }

    @Override // com.nimbusds.jose.jwk.gen.JWKGenerator
    public RSAKey generate() throws JOSEException {
        try {
            KeyStore keyStore = this.keyStore;
            KeyPairGenerator keyPairGenerator = keyStore != null ? KeyPairGenerator.getInstance("RSA", keyStore.getProvider()) : KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(this.f62712a);
            KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
            RSAKey.Builder builderKeyStore = new RSAKey.Builder((RSAPublicKey) keyPairGenerateKeyPair.getPublic()).privateKey(keyPairGenerateKeyPair.getPrivate()).keyUse(this.use).keyOperations(this.ops).algorithm(this.alg).keyStore(this.keyStore);
            if (this.x5tKid) {
                builderKeyStore.keyIDFromThumbprint();
            } else {
                builderKeyStore.keyID(this.kid);
            }
            return builderKeyStore.build();
        } catch (NoSuchAlgorithmException e5) {
            throw new JOSEException(e5.getMessage(), e5);
        }
    }
}
