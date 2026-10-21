package com.google.crypto.tink.jwt;

import com.google.crypto.tink.Registry;
import com.google.crypto.tink.proto.RegistryConfig;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes10.dex */
public final class JwtSignatureConfig {
    public static final String JWT_ECDSA_PRIVATE_KEY_TYPE_URL;
    public static final String JWT_ECDSA_PUBLIC_KEY_TYPE_URL;
    public static final String JWT_RSA_PKCS1_PRIVATE_KEY_TYPE_URL;
    public static final String JWT_RSA_PKCS1_PUBLIC_KEY_TYPE_URL;
    public static final String JWT_RSA_PSS_PRIVATE_KEY_TYPE_URL;
    public static final String JWT_RSA_PSS_PUBLIC_KEY_TYPE_URL;
    public static final RegistryConfig LATEST;

    static {
        new b();
        JWT_ECDSA_PUBLIC_KEY_TYPE_URL = "type.googleapis.com/google.crypto.tink.JwtEcdsaPublicKey";
        JWT_ECDSA_PRIVATE_KEY_TYPE_URL = new JwtEcdsaSignKeyManager().getKeyType();
        JWT_RSA_PKCS1_PRIVATE_KEY_TYPE_URL = new JwtRsaSsaPkcs1SignKeyManager().getKeyType();
        new g();
        JWT_RSA_PKCS1_PUBLIC_KEY_TYPE_URL = "type.googleapis.com/google.crypto.tink.JwtRsaSsaPkcs1PublicKey";
        JWT_RSA_PSS_PRIVATE_KEY_TYPE_URL = new JwtRsaSsaPssSignKeyManager().getKeyType();
        new j();
        JWT_RSA_PSS_PUBLIC_KEY_TYPE_URL = "type.googleapis.com/google.crypto.tink.JwtRsaSsaPssPublicKey";
        LATEST = RegistryConfig.getDefaultInstance();
    }

    public static void register() throws GeneralSecurityException {
        JwtEcdsaSignKeyManager.registerPair(true);
        JwtRsaSsaPkcs1SignKeyManager.registerPair(true);
        JwtRsaSsaPssSignKeyManager.registerPair(true);
        Registry.registerPrimitiveWrapper(hf.d.f69419a);
        Registry.registerPrimitiveWrapper(hf.e.f69421a);
    }
}
