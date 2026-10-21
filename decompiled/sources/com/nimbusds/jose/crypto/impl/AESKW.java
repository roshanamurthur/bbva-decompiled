package com.nimbusds.jose.crypto.impl;

import androidx.emoji2.text.flatbuffer.a;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.util.KeyUtils;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import net.jcip.annotations.ThreadSafe;

/* JADX INFO: loaded from: classes10.dex */
@ThreadSafe
public class AESKW {
    public static SecretKey unwrapCEK(SecretKey secretKey, byte[] bArr, Provider provider) throws JOSEException {
        try {
            Cipher cipher = provider != null ? Cipher.getInstance("AESWrap", provider) : Cipher.getInstance("AESWrap");
            cipher.init(4, KeyUtils.toAESKey(secretKey));
            return (SecretKey) cipher.unwrap(bArr, "AES", 3);
        } catch (InvalidKeyException e5) {
            e = e5;
            throw new JOSEException(a.d(e, new StringBuilder("Couldn't unwrap AES key: ")), e);
        } catch (NoSuchAlgorithmException e7) {
            e = e7;
            throw new JOSEException(a.d(e, new StringBuilder("Couldn't unwrap AES key: ")), e);
        } catch (NoSuchPaddingException e10) {
            e = e10;
            throw new JOSEException(a.d(e, new StringBuilder("Couldn't unwrap AES key: ")), e);
        }
    }

    public static byte[] wrapCEK(SecretKey secretKey, SecretKey secretKey2, Provider provider) throws JOSEException {
        try {
            Cipher cipher = provider != null ? Cipher.getInstance("AESWrap", provider) : Cipher.getInstance("AESWrap");
            cipher.init(3, secretKey2);
            return cipher.wrap(secretKey);
        } catch (InvalidKeyException e5) {
            e = e5;
            throw new JOSEException(a.d(e, new StringBuilder("Couldn't wrap AES key: ")), e);
        } catch (NoSuchAlgorithmException e7) {
            e = e7;
            throw new JOSEException(a.d(e, new StringBuilder("Couldn't wrap AES key: ")), e);
        } catch (IllegalBlockSizeException e10) {
            e = e10;
            throw new JOSEException(a.d(e, new StringBuilder("Couldn't wrap AES key: ")), e);
        } catch (NoSuchPaddingException e11) {
            e = e11;
            throw new JOSEException(a.d(e, new StringBuilder("Couldn't wrap AES key: ")), e);
        }
    }
}
