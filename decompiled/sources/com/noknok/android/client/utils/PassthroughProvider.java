package com.noknok.android.client.utils;

import java.security.Provider;
import java.security.Security;

/* JADX INFO: loaded from: classes11.dex */
public class PassthroughProvider extends Provider {
    public PassthroughProvider() {
        super("PassthroughProvider", 1.0d, "Nok Nok Passthrough Crypto Provider");
        put("KeyStore.PassthroughProvider", "com.noknok.android.client.crypto.PassthroughKeyStore");
        put("KeyPairGenerator.EC", "com.noknok.android.client.crypto.PassthroughKeyPairGenerator$EC");
        put("KeyPairGenerator.RSA", "com.noknok.android.client.crypto.PassthroughKeyPairGenerator$RSA");
        put("KeyFactory.EC", "com.noknok.android.client.crypto.PassthroughKeyFactory$EC");
        put("KeyFactory.RSA", "com.noknok.android.client.crypto.PassthroughKeyFactory$RSA");
        put("KeyGenerator.AES", "com.noknok.android.client.crypto.PassthroughKeyGenerator$AES");
        put("KeyGenerator.HmacSHA256", "com.noknok.android.client.crypto.PassthroughKeyGenerator$HmacSHA256");
        put("Cipher.AES/GCM/NoPadding", "com.noknok.android.client.crypto.PassthroughCipher$AesGcmNoPadding");
        put("Cipher.AES/CBC/PKCS5Padding", "com.noknok.android.client.crypto.PassthroughCipher$AesCbsPcks5");
        put("Mac.HmacSHA256", "com.noknok.android.client.crypto.PassthroughMac$HmacSHA256");
        put("Signature.SHA256withECDSA", "com.noknok.android.client.crypto.PassthroughSignature$SHA256withECDSA");
        put("Signature.SHA256withRSA", "com.noknok.android.client.crypto.PassthroughSignature$SHA256withRSA");
        put("SecureRandom.SHA1PRNG", "com.noknok.android.client.crypto.PassthroughSecureRandom$SHA1PRNG");
        put("MessageDigest.SHA-256", "com.noknok.android.client.crypto.PassthroughMessageDigest$SHA256");
        put("MessageDigest.SHA256", "com.noknok.android.client.crypto.PassthroughMessageDigest$SHA256");
        put("MessageDigest.SHA-1", "com.noknok.android.client.crypto.PassthroughMessageDigest$SHA1");
        put("MessageDigest.SHA1", "com.noknok.android.client.crypto.PassthroughMessageDigest$SHA1");
    }

    public static void install() {
        Security.addProvider(new PassthroughProvider());
    }
}
