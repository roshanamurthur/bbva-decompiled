package com.bbva.proguarded.android.sslpinning;

import com.bbva.sl.ar.android.sslpinning.exception.CryptoException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

/* JADX INFO: loaded from: classes8.dex */
public final class e {
    public static PublicKey a(String str) throws CryptoException {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(f.c(str)));
        } catch (NoSuchAlgorithmException e5) {
            throw new CryptoException(e5);
        } catch (InvalidKeySpecException e7) {
            throw new CryptoException(e7);
        }
    }
}
