package com.google.crypto.tink.integration.android;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import androidx.annotation.RequiresApi;
import com.bbva.ethermobilesdk.cipher.keystore.provider.KeyStoreProvider;
import com.google.android.gms.stats.CodePackage;
import com.google.crypto.tink.Aead;
import com.google.crypto.tink.KmsClient;
import com.google.crypto.tink.subtle.Random;
import com.google.crypto.tink.subtle.Validators;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import java.util.Locale;
import javax.annotation.concurrent.GuardedBy;
import javax.crypto.KeyGenerator;

/* JADX INFO: loaded from: classes10.dex */
public final class AndroidKeystoreKmsClient implements KmsClient {
    public static final String PREFIX = "android-keystore://";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f46613c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @GuardedBy("this")
    public KeyStore f46615b;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f46616a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public KeyStore f46617b;

        @RequiresApi(23)
        public Builder() {
            this.f46617b = null;
            Object obj = AndroidKeystoreKmsClient.f46613c;
            try {
                KeyStore keyStore = KeyStore.getInstance(KeyStoreProvider.ANDROID_KEYSTORE);
                this.f46617b = keyStore;
                keyStore.load(null);
            } catch (IOException | GeneralSecurityException e5) {
                throw new IllegalStateException(e5);
            }
        }

        public AndroidKeystoreKmsClient build() {
            return new AndroidKeystoreKmsClient(this);
        }

        @CanIgnoreReturnValue
        @RequiresApi(23)
        public Builder setKeyStore(KeyStore keyStore) {
            if (keyStore == null) {
                throw new IllegalArgumentException("val cannot be null");
            }
            this.f46617b = keyStore;
            return this;
        }

        @CanIgnoreReturnValue
        @RequiresApi(23)
        public Builder setKeyUri(String str) {
            if (str == null || !str.toLowerCase(Locale.US).startsWith(AndroidKeystoreKmsClient.PREFIX)) {
                throw new IllegalArgumentException("val must start with android-keystore://");
            }
            this.f46616a = str;
            return this;
        }
    }

    @RequiresApi(23)
    public AndroidKeystoreKmsClient() throws GeneralSecurityException {
        this(new Builder());
    }

    @RequiresApi(23)
    public static boolean a(String str) throws GeneralSecurityException {
        AndroidKeystoreKmsClient androidKeystoreKmsClient = new AndroidKeystoreKmsClient();
        synchronized (f46613c) {
            try {
                if (androidKeystoreKmsClient.c(str)) {
                    return false;
                }
                b(str);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @RequiresApi(23)
    public static void b(String str) throws GeneralSecurityException {
        String strValidateKmsKeyUriAndRemovePrefix = Validators.validateKmsKeyUriAndRemovePrefix(PREFIX, str);
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", KeyStoreProvider.ANDROID_KEYSTORE);
        keyGenerator.init(new KeyGenParameterSpec.Builder(strValidateKmsKeyUriAndRemovePrefix, 3).setKeySize(256).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").build());
        keyGenerator.generateKey();
    }

    @RequiresApi(23)
    public static void generateNewAeadKey(String str) throws GeneralSecurityException {
        AndroidKeystoreKmsClient androidKeystoreKmsClient = new AndroidKeystoreKmsClient();
        synchronized (f46613c) {
            try {
                if (androidKeystoreKmsClient.c(str)) {
                    throw new IllegalArgumentException(String.format("cannot generate a new key %s because it already exists; please delete it with deleteKey() and try again", str));
                }
                b(str);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @RequiresApi(23)
    public static Aead getOrGenerateNewAeadKey(String str) throws GeneralSecurityException, IOException {
        AndroidKeystoreKmsClient androidKeystoreKmsClient = new AndroidKeystoreKmsClient();
        synchronized (f46613c) {
            try {
                if (!androidKeystoreKmsClient.c(str)) {
                    b(str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return androidKeystoreKmsClient.getAead(str);
    }

    public final synchronized boolean c(String str) throws GeneralSecurityException {
        String strValidateKmsKeyUriAndRemovePrefix;
        strValidateKmsKeyUriAndRemovePrefix = Validators.validateKmsKeyUriAndRemovePrefix(PREFIX, str);
        try {
        } catch (NullPointerException unused) {
            Log.w("AndroidKeystoreKmsClient", "Keystore is temporarily unavailable, wait, reinitialize Keystore and try again.");
            try {
                try {
                    Thread.sleep((int) (Math.random() * 40.0d));
                } catch (InterruptedException unused2) {
                }
                KeyStore keyStore = KeyStore.getInstance(KeyStoreProvider.ANDROID_KEYSTORE);
                this.f46615b = keyStore;
                keyStore.load(null);
                return this.f46615b.containsAlias(strValidateKmsKeyUriAndRemovePrefix);
            } catch (IOException e5) {
                throw new GeneralSecurityException(e5);
            }
        }
        return this.f46615b.containsAlias(strValidateKmsKeyUriAndRemovePrefix);
    }

    public synchronized void deleteKey(String str) throws GeneralSecurityException {
        this.f46615b.deleteEntry(Validators.validateKmsKeyUriAndRemovePrefix(PREFIX, str));
    }

    @Override // com.google.crypto.tink.KmsClient
    @RequiresApi(23)
    public synchronized boolean doesSupport(String str) {
        String str2 = this.f46614a;
        if (str2 == null || !str2.equals(str)) {
            return this.f46614a == null && str.toLowerCase(Locale.US).startsWith(PREFIX);
        }
        return true;
    }

    @Override // com.google.crypto.tink.KmsClient
    public synchronized Aead getAead(String str) throws GeneralSecurityException {
        AndroidKeystoreAesGcm androidKeystoreAesGcm;
        try {
            String str2 = this.f46614a;
            if (str2 != null && !str2.equals(str)) {
                throw new GeneralSecurityException(String.format("this client is bound to %s, cannot load keys bound to %s", this.f46614a, str));
            }
            androidKeystoreAesGcm = new AndroidKeystoreAesGcm(this.f46615b, Validators.validateKmsKeyUriAndRemovePrefix(PREFIX, str));
            byte[] bArrRandBytes = Random.randBytes(10);
            byte[] bArr = new byte[0];
            if (!Arrays.equals(bArrRandBytes, androidKeystoreAesGcm.decrypt(androidKeystoreAesGcm.encrypt(bArrRandBytes, bArr), bArr))) {
                throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return androidKeystoreAesGcm;
    }

    @Override // com.google.crypto.tink.KmsClient
    @RequiresApi(23)
    public KmsClient withCredentials(String str) throws GeneralSecurityException {
        return new AndroidKeystoreKmsClient();
    }

    @Override // com.google.crypto.tink.KmsClient
    @RequiresApi(23)
    public KmsClient withDefaultCredentials() throws GeneralSecurityException {
        return new AndroidKeystoreKmsClient();
    }

    @RequiresApi(23)
    @Deprecated
    public AndroidKeystoreKmsClient(String str) {
        this(new Builder().setKeyUri(str));
    }

    public AndroidKeystoreKmsClient(Builder builder) {
        this.f46614a = builder.f46616a;
        this.f46615b = builder.f46617b;
    }
}
