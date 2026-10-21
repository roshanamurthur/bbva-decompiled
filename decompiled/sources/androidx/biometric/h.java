package androidx.biometric;

import android.os.Build;
import android.security.identity.IdentityCredential;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bbva.ethermobilesdk.cipher.keystore.provider.KeyStoreProvider;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

/* JADX INFO: compiled from: CryptoObjectUtils.java */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: compiled from: CryptoObjectUtils.java */
    @RequiresApi(23)
    public static class a {
        @NonNull
        public static KeyGenParameterSpec a(@NonNull KeyGenParameterSpec.Builder builder) {
            return builder.build();
        }

        @NonNull
        public static KeyGenParameterSpec.Builder b(@NonNull String str, int i10) {
            return new KeyGenParameterSpec.Builder(str, i10);
        }

        public static void c(@NonNull KeyGenerator keyGenerator, @NonNull KeyGenParameterSpec keyGenParameterSpec) throws InvalidAlgorithmParameterException {
            keyGenerator.init(keyGenParameterSpec);
        }

        public static void d(@NonNull KeyGenParameterSpec.Builder builder) {
            builder.setBlockModes("CBC");
        }

        public static void e(@NonNull KeyGenParameterSpec.Builder builder) {
            builder.setEncryptionPaddings("PKCS7Padding");
        }
    }

    /* JADX INFO: compiled from: CryptoObjectUtils.java */
    @RequiresApi(28)
    public static class b {
        @NonNull
        public static android.hardware.biometrics.BiometricPrompt.CryptoObject a(@NonNull Signature signature) {
            return new android.hardware.biometrics.BiometricPrompt.CryptoObject(signature);
        }

        @NonNull
        public static android.hardware.biometrics.BiometricPrompt.CryptoObject b(@NonNull Cipher cipher) {
            return new android.hardware.biometrics.BiometricPrompt.CryptoObject(cipher);
        }

        @NonNull
        public static android.hardware.biometrics.BiometricPrompt.CryptoObject c(@NonNull Mac mac) {
            return new android.hardware.biometrics.BiometricPrompt.CryptoObject(mac);
        }

        @Nullable
        public static Cipher d(@NonNull android.hardware.biometrics.BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getCipher();
        }

        @Nullable
        public static Mac e(@NonNull android.hardware.biometrics.BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getMac();
        }

        @Nullable
        public static Signature f(@NonNull android.hardware.biometrics.BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getSignature();
        }
    }

    /* JADX INFO: compiled from: CryptoObjectUtils.java */
    @RequiresApi(30)
    public static class c {
        @NonNull
        public static android.hardware.biometrics.BiometricPrompt.CryptoObject a(@NonNull IdentityCredential identityCredential) {
            return new android.hardware.biometrics.BiometricPrompt.CryptoObject(identityCredential);
        }

        @Nullable
        public static IdentityCredential b(@NonNull android.hardware.biometrics.BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getIdentityCredential();
        }
    }

    @Nullable
    @RequiresApi(23)
    public static BiometricPrompt.CryptoObject a() {
        try {
            KeyStore keyStore = KeyStore.getInstance(KeyStoreProvider.ANDROID_KEYSTORE);
            keyStore.load(null);
            KeyGenParameterSpec.Builder builderB = a.b("androidxBiometric", 3);
            a.d(builderB);
            a.e(builderB);
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", KeyStoreProvider.ANDROID_KEYSTORE);
            a.c(keyGenerator, a.a(builderB));
            keyGenerator.generateKey();
            SecretKey secretKey = (SecretKey) keyStore.getKey("androidxBiometric", null);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(1, secretKey);
            return new BiometricPrompt.CryptoObject(cipher);
        } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableKeyException | CertificateException | NoSuchPaddingException e5) {
            Log.w("CryptoObjectUtils", "Failed to create fake crypto object.", e5);
            return null;
        }
    }

    @Nullable
    @RequiresApi(28)
    public static android.hardware.biometrics.BiometricPrompt.CryptoObject b(@Nullable BiometricPrompt.CryptoObject cryptoObject) {
        IdentityCredential identityCredential;
        if (cryptoObject == null) {
            return null;
        }
        Cipher cipher = cryptoObject.getCipher();
        if (cipher != null) {
            return b.b(cipher);
        }
        Signature signature = cryptoObject.getSignature();
        if (signature != null) {
            return b.a(signature);
        }
        Mac mac = cryptoObject.getMac();
        if (mac != null) {
            return b.c(mac);
        }
        if (Build.VERSION.SDK_INT < 30 || (identityCredential = cryptoObject.getIdentityCredential()) == null) {
            return null;
        }
        return c.a(identityCredential);
    }
}
