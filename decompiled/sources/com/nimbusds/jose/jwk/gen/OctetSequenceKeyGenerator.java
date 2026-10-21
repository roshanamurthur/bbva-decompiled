package com.nimbusds.jose.jwk.gen;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.jwk.OctetSequenceKey;
import com.nimbusds.jose.util.Base64URL;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes10.dex */
public class OctetSequenceKeyGenerator extends JWKGenerator<OctetSequenceKey> {
    public static final int MIN_KEY_SIZE_BITS = 112;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f62710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SecureRandom f62711b;

    public OctetSequenceKeyGenerator(int i10) {
        if (i10 < 112) {
            throw new IllegalArgumentException("The key size must be at least 112 bits");
        }
        if (i10 % 8 != 0) {
            throw new IllegalArgumentException("The key size in bits must be divisible by 8");
        }
        this.f62710a = i10;
    }

    public OctetSequenceKeyGenerator secureRandom(SecureRandom secureRandom) {
        this.f62711b = secureRandom;
        return this;
    }

    @Override // com.nimbusds.jose.jwk.gen.JWKGenerator
    public OctetSequenceKey generate() throws JOSEException {
        byte[] bArr = new byte[this.f62710a / 8];
        SecureRandom secureRandom = this.f62711b;
        if (secureRandom != null) {
            secureRandom.nextBytes(bArr);
        } else {
            new SecureRandom().nextBytes(bArr);
        }
        OctetSequenceKey.Builder builderKeyStore = new OctetSequenceKey.Builder(Base64URL.encode(bArr)).keyUse(this.use).keyOperations(this.ops).algorithm(this.alg).keyStore(this.keyStore);
        if (this.x5tKid) {
            builderKeyStore.keyIDFromThumbprint();
        } else {
            builderKeyStore.keyID(this.kid);
        }
        return builderKeyStore.build();
    }
}
