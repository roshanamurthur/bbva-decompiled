package com.nimbusds.jose.crypto.impl;

import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import net.jcip.annotations.ThreadSafe;

/* JADX INFO: loaded from: classes10.dex */
@ThreadSafe
public class CipherHelper {
    public static Cipher getInstance(String str, Provider provider) throws NoSuchPaddingException, NoSuchAlgorithmException {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }
}
