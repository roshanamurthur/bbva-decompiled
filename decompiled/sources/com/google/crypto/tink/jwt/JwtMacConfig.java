package com.google.crypto.tink.jwt;

import com.google.crypto.tink.Registry;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes10.dex */
public final class JwtMacConfig {
    public static final String JWT_HMAC_TYPE_URL = new JwtHmacKeyManager().getKeyType();

    public static void register() throws GeneralSecurityException {
        JwtHmacKeyManager.register(true);
        Registry.registerPrimitiveWrapper(hf.c.f69417a);
    }
}
