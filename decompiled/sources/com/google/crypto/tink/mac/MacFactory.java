package com.google.crypto.tink.mac;

import com.google.crypto.tink.KeysetHandle;
import com.google.crypto.tink.Mac;
import com.google.crypto.tink.Registry;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes10.dex */
@Deprecated
public final class MacFactory {
    @Deprecated
    public static Mac getPrimitive(KeysetHandle keysetHandle) throws GeneralSecurityException {
        Registry.registerPrimitiveWrapper(p004if.a.f69666c);
        return (Mac) keysetHandle.getPrimitive(Mac.class);
    }
}
