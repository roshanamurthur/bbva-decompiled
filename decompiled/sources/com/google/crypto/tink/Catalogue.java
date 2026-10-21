package com.google.crypto.tink;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes10.dex */
@Deprecated
public interface Catalogue<P> {
    KeyManager<P> getKeyManager(String str, String str2, int i10) throws GeneralSecurityException;

    PrimitiveWrapper<?, P> getPrimitiveWrapper() throws GeneralSecurityException;
}
