package com.salesforce.marketingcloud.sfmcsdk.components.encryption;

import android.content.Context;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import java.io.IOException;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.CertificateException;

/* JADX INFO: loaded from: classes9.dex */
class KeyStoreWrapper {
    private static final String ANDROID_KEYSTORE = "AndroidKeyStore";
    private static final String EC = "EC";
    private static final int EC_KEY_LENGTH = 256;
    private static final String RSA = "RSA";
    private static final int RSA_KEY_LENGTH = 2048;
    private static final String TAG = "KeyStoreWrapper";
    private final Context context;
    private final KeyStore keyStore = loadKeyStore();

    public KeyStoreWrapper(Context context) throws NoSuchAlgorithmException, IOException, CertificateException, KeyStoreException {
        this.context = context.getApplicationContext();
    }

    private synchronized void createKeysIfNecessary(String str, String str2, int i10) {
        try {
            if (!this.keyStore.containsAlias(str2)) {
                int i11 = Build.VERSION.SDK_INT;
                KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(str, "AndroidKeyStore");
                KeyGenParameterSpec.Builder encryptionPaddings = new KeyGenParameterSpec.Builder(str2, 3).setKeySize(i10).setEncryptionPaddings("PKCS1Padding");
                if (i11 >= 28) {
                    encryptionPaddings.setIsStrongBoxBacked(false);
                }
                keyPairGenerator.initialize(encryptionPaddings.build());
                keyPairGenerator.generateKeyPair();
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private PrivateKey getPrivateKey(String str, String str2, int i10) {
        createKeysIfNecessary(str, str2, i10);
        try {
            return (PrivateKey) this.keyStore.getKey(str2, null);
        } catch (Exception unused) {
            return null;
        }
    }

    private PublicKey getPublicKey(String str, String str2, int i10) {
        createKeysIfNecessary(str, str2, i10);
        try {
            return this.keyStore.getCertificate(str2).getPublicKey();
        } catch (Exception unused) {
            return null;
        }
    }

    private String getPublicKeyString(String str, String str2, int i10) {
        PublicKey publicKey = getPublicKey(str, str2, i10);
        if (publicKey != null) {
            return Base64.encodeToString(publicKey.getEncoded(), 3);
        }
        return null;
    }

    private KeyStore loadKeyStore() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        return keyStore;
    }

    public PrivateKey getECPrivateKey(String str) {
        return getPrivateKey("EC", str, 256);
    }

    public PublicKey getECPublicKey(String str) {
        return getPublicKey("EC", str, 256);
    }

    public String getECPublicString(String str) {
        return getPublicKeyString("EC", str, 256);
    }

    public PrivateKey getRSAPrivateKey(String str) {
        return getRSAPrivateKey(str, 2048);
    }

    public PublicKey getRSAPublicKey(String str) {
        return getRSAPublicKey(str, 2048);
    }

    public String getRSAPublicString(String str) {
        return getRSAPublicString(str, 2048);
    }

    public PrivateKey getRSAPrivateKey(String str, int i10) {
        return getPrivateKey("RSA", str, i10);
    }

    public PublicKey getRSAPublicKey(String str, int i10) {
        return getPublicKey("RSA", str, i10);
    }

    public String getRSAPublicString(String str, int i10) {
        return getPublicKeyString("RSA", str, i10);
    }
}
