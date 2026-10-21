package com.google.crypto.tink.signature;

import com.google.crypto.tink.KeysetHandle;
import com.google.crypto.tink.PublicKeyVerify;
import com.google.crypto.tink.Registry;
import java.security.GeneralSecurityException;
import kf.c;

/* JADX INFO: loaded from: classes10.dex */
@Deprecated
public final class PublicKeyVerifyFactory {
    @Deprecated
    public static PublicKeyVerify getPrimitive(KeysetHandle keysetHandle) throws GeneralSecurityException {
        Registry.registerPrimitiveWrapper(c.f79316c);
        return (PublicKeyVerify) keysetHandle.getPrimitive(PublicKeyVerify.class);
    }
}
