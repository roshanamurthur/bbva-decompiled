package com.google.crypto.tink.hybrid;

import com.google.crypto.tink.aead.AeadConfig;
import com.google.crypto.tink.config.TinkFips;
import com.google.crypto.tink.hybrid.internal.HpkePrivateKeyManager;
import com.google.crypto.tink.proto.RegistryConfig;
import ef.a;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes10.dex */
public final class HybridConfig {
    public static final String ECIES_AEAD_HKDF_PRIVATE_KEY_TYPE_URL;
    public static final String ECIES_AEAD_HKDF_PUBLIC_KEY_TYPE_URL;

    @Deprecated
    public static final RegistryConfig LATEST;

    @Deprecated
    public static final RegistryConfig TINK_1_0_0;

    @Deprecated
    public static final RegistryConfig TINK_1_1_0;

    static {
        new a();
        ECIES_AEAD_HKDF_PUBLIC_KEY_TYPE_URL = "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey";
        ECIES_AEAD_HKDF_PRIVATE_KEY_TYPE_URL = new EciesAeadHkdfPrivateKeyManager().getKeyType();
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
        HybridDecryptWrapper.register();
        HybridEncryptWrapper.register();
        AeadConfig.register();
        if (TinkFips.useOnlyFips()) {
            return;
        }
        EciesAeadHkdfPrivateKeyManager.registerPair(true);
        HpkePrivateKeyManager.registerPair(true);
    }
}
