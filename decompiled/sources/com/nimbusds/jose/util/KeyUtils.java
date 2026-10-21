package com.nimbusds.jose.util;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes10.dex */
public class KeyUtils {
    public static SecretKey toAESKey(SecretKey secretKey) {
        if (secretKey == null) {
            return null;
        }
        return new SecretKeySpec(secretKey.getEncoded(), "AES");
    }
}
