package com.google.crypto.tink.signature;

import com.google.crypto.tink.Registry;
import com.google.crypto.tink.config.TinkFips;
import com.google.crypto.tink.proto.RegistryConfig;
import java.security.GeneralSecurityException;
import kf.b;
import kf.c;
import kf.d;
import kf.e;

/* JADX INFO: loaded from: classes10.dex */
public final class SignatureConfig {
    public static final String ECDSA_PRIVATE_KEY_TYPE_URL;
    public static final String ECDSA_PUBLIC_KEY_TYPE_URL;
    public static final String ED25519_PRIVATE_KEY_TYPE_URL;
    public static final String ED25519_PUBLIC_KEY_TYPE_URL;

    @Deprecated
    public static final RegistryConfig LATEST;
    public static final String RSA_PKCS1_PRIVATE_KEY_TYPE_URL;
    public static final String RSA_PKCS1_PUBLIC_KEY_TYPE_URL;
    public static final String RSA_PSS_PRIVATE_KEY_TYPE_URL;
    public static final String RSA_PSS_PUBLIC_KEY_TYPE_URL;

    @Deprecated
    public static final RegistryConfig TINK_1_0_0;

    @Deprecated
    public static final RegistryConfig TINK_1_1_0;

    static {
        new kf.a();
        ECDSA_PUBLIC_KEY_TYPE_URL = "type.googleapis.com/google.crypto.tink.EcdsaPublicKey";
        ECDSA_PRIVATE_KEY_TYPE_URL = new EcdsaSignKeyManager().getKeyType();
        new b();
        ED25519_PUBLIC_KEY_TYPE_URL = "type.googleapis.com/google.crypto.tink.Ed25519PublicKey";
        ED25519_PRIVATE_KEY_TYPE_URL = new Ed25519PrivateKeyManager().getKeyType();
        RSA_PKCS1_PRIVATE_KEY_TYPE_URL = new RsaSsaPkcs1SignKeyManager().getKeyType();
        new d();
        RSA_PKCS1_PUBLIC_KEY_TYPE_URL = "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey";
        RSA_PSS_PRIVATE_KEY_TYPE_URL = new RsaSsaPssSignKeyManager().getKeyType();
        new e();
        RSA_PSS_PUBLIC_KEY_TYPE_URL = "type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey";
        TINK_1_0_0 = RegistryConfig.getDefaultInstance();
        TINK_1_1_0 = RegistryConfig.getDefaultInstance();
        LATEST = RegistryConfig.getDefaultInstance();
        try {
            init();
        } catch (GeneralSecurityException e5) {
            throw new ExceptionInInitializerError(e5);
        }
    }

    @Deprecated
    public static void init() throws GeneralSecurityException {
        register();
    }

    public static void register() throws GeneralSecurityException {
        PublicKeySignWrapper.register();
        Registry.registerPrimitiveWrapper(c.f79316c);
        EcdsaSignKeyManager.registerPair(true);
        RsaSsaPkcs1SignKeyManager.registerPair(true);
        if (TinkFips.useOnlyFips()) {
            return;
        }
        RsaSsaPssSignKeyManager.registerPair(true);
        Ed25519PrivateKeyManager.registerPair(true);
    }
}
