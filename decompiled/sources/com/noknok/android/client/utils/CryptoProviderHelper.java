package com.noknok.android.client.utils;

import android.os.Build;
import com.bbva.ethermobilesdk.cipher.keystore.provider.KeyStoreProvider;
import com.bbva.zoomauth.facialauth.constant.AuthConstants;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.Security;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: loaded from: classes11.dex */
public class CryptoProviderHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Boolean f63434a;

    public static Cipher getCipherInstance(String str) throws NoSuchPaddingException, NoSuchAlgorithmException, NoSuchProviderException {
        return isPasstroughEnabled() ? Cipher.getInstance(str, "PassthroughProvider") : Cipher.getInstance(str);
    }

    public static KeyFactory getKeyFactoryInstance(String str) throws NoSuchAlgorithmException, NoSuchProviderException {
        return KeyFactory.getInstance(str, isPasstroughEnabled() ? "PassthroughProvider" : KeyStoreProvider.ANDROID_KEYSTORE);
    }

    public static KeyGenerator getKeyGeneratorInstance(String str) throws NoSuchAlgorithmException, NoSuchProviderException {
        return KeyGenerator.getInstance(str, isPasstroughEnabled() ? "PassthroughProvider" : KeyStoreProvider.ANDROID_KEYSTORE);
    }

    public static KeyPairGenerator getKeyPairGeneratorInstance(String str) throws NoSuchAlgorithmException, NoSuchProviderException {
        return KeyPairGenerator.getInstance(str, isPasstroughEnabled() ? "PassthroughProvider" : KeyStoreProvider.ANDROID_KEYSTORE);
    }

    public static KeyStore getKeyStoreInstance() throws KeyStoreException {
        return KeyStore.getInstance(isPasstroughEnabled() ? "PassthroughProvider" : KeyStoreProvider.ANDROID_KEYSTORE);
    }

    public static Mac getMacInstance(String str) throws NoSuchAlgorithmException, NoSuchProviderException {
        return isPasstroughEnabled() ? Mac.getInstance(str, "PassthroughProvider") : Mac.getInstance(str);
    }

    public static MessageDigest getMessageDigestInstance(String str) throws NoSuchAlgorithmException, NoSuchProviderException {
        return isPasstroughEnabled() ? MessageDigest.getInstance(str, "PassthroughProvider") : MessageDigest.getInstance(str);
    }

    public static SecureRandom getSecureRandomInstance() throws NoSuchAlgorithmException, NoSuchProviderException {
        if (Build.VERSION.SDK_INT >= 26) {
            return isPasstroughEnabled() ? SecureRandom.getInstance(AuthConstants.SHA1PRNG, "PassthroughProvider") : SecureRandom.getInstanceStrong();
        }
        return new SecureRandom();
    }

    public static Signature getSignatureInstance(String str) throws NoSuchAlgorithmException, NoSuchProviderException {
        return isPasstroughEnabled() ? Signature.getInstance(str, "PassthroughProvider") : Signature.getInstance(str);
    }

    public static boolean isPasstroughEnabled() {
        if (f63434a == null) {
            f63434a = Boolean.valueOf(Security.getProvider("PassthroughProvider") != null);
        }
        return f63434a.booleanValue();
    }
}
