package com.bbva.ethermobilesdk.cipher.keystore.provider.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.security.KeyPairGeneratorSpec;
import androidx.annotation.VisibleForTesting;
import com.bbva.ethermobilesdk.cipher.keystore.exception.KeyStoreCipherException;
import com.bbva.ethermobilesdk.cipher.keystore.provider.KeyStoreProvider;
import com.bbva.ethermobilesdk.cipher.keystore.provider.spec.KeyPairGeneratorSpecCompat;
import com.bbva.ethermobilesdk.cipher.utils.EncodingUtilsKt;
import com.bbva.google.pay.GoogleTapAndPay;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.util.Iterator;
import java.util.List;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AndroidKeyStoreProviderCompat.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0010¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0010¢\u0006\u0004\b\b\u0010\u0006J\u0019\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u0004\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0011\u001a\u00020\u000eH\u0011¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0016J\"\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u001b"}, d2 = {"Lcom/bbva/ethermobilesdk/cipher/keystore/provider/impl/AndroidKeyStoreProviderCompat;", "Lcom/bbva/ethermobilesdk/cipher/keystore/provider/KeyStoreProvider;", "", "data", GoogleTapAndPay.KEY_ALIAS, "encrypt$cipher_release", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "encrypt", "decrypt$cipher_release", "decrypt", "Ljava/security/KeyPair;", "getOrCreateRSAKey$cipher_release", "(Ljava/lang/String;)Ljava/security/KeyPair;", "getOrCreateRSAKey", "", "reset$cipher_release", "()V", "reset", "Landroid/content/Context;", "context", "seed", "Ljavax/crypto/Cipher;", "toCipherForEncryption", "toCipherForDecryption", "<init>", "(Landroid/content/Context;)V", "Companion", "cipher_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidKeyStoreProviderCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidKeyStoreProviderCompat.kt\ncom/bbva/ethermobilesdk/cipher/keystore/provider/impl/AndroidKeyStoreProviderCompat\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,237:1\n1#2:238\n1855#3,2:239\n*S KotlinDebug\n*F\n+ 1 AndroidKeyStoreProviderCompat.kt\ncom/bbva/ethermobilesdk/cipher/keystore/provider/impl/AndroidKeyStoreProviderCompat\n*L\n185#1:239,2\n*E\n"})
public final class AndroidKeyStoreProviderCompat extends KeyStoreProvider {
    public static final int AES256_IV_SIZE_BYTES = 16;

    @NotNull
    public static final String AES256_KEY_ALIAS = "com.bbva.ethermobilesdk.cipher.keystore.aeskey";

    @NotNull
    public static final String AES256_STORAGE_FILE = "com.bbva.ethermobilesdk.cipher.storage.internal.file";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String KP_18 = "com.bbva.ethermobilesdk.cipher.keystore.kp_18";

    @NotNull
    public static final String RSA_MASTER_KEY = "com.bbva.ethermobilesdk.cipher.keystore.masterkeycompat";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Context f29333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SharedPreferences f29334c;

    public AndroidKeyStoreProviderCompat(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f29333b = context;
        this.f29334c = context.getSharedPreferences(AES256_STORAGE_FILE, 0);
    }

    public static /* synthetic */ KeyPair getOrCreateRSAKey$cipher_release$default(AndroidKeyStoreProviderCompat androidKeyStoreProviderCompat, String str, int i10, Object obj) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        if ((i10 & 1) != 0) {
            str = RSA_MASTER_KEY;
        }
        return androidKeyStoreProviderCompat.getOrCreateRSAKey$cipher_release(str);
    }

    public final SecretKeySpec a(String str) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, InvalidAlgorithmParameterException {
        SharedPreferences sharedPreferences = this.f29334c;
        if (sharedPreferences.contains(str)) {
            String string = sharedPreferences.getString(str, "");
            byte[] bArrBase64ToByteArray = EncodingUtilsKt.base64ToByteArray(string != null ? string : "");
            KeyPair orCreateRSAKey$cipher_release$default = getOrCreateRSAKey$cipher_release$default(this, null, 1, null);
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(2, orCreateRSAKey$cipher_release$default.getPrivate());
            return new SecretKeySpec(cipher.doFinal(bArrBase64ToByteArray), "AES");
        }
        byte[] bArr = new byte[32];
        new SecureRandom().nextBytes(bArr);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        KeyPair orCreateRSAKey$cipher_release$default2 = getOrCreateRSAKey$cipher_release$default(this, null, 1, null);
        Cipher cipher2 = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher2.init(1, orCreateRSAKey$cipher_release$default2.getPublic());
        byte[] data = cipher2.doFinal(secretKeySpec.getEncoded());
        Intrinsics.checkNotNullExpressionValue(data, "data");
        sharedPreferences.edit().putString(str, EncodingUtilsKt.toBase64(data)).apply();
        return secretKeySpec;
    }

    @Override // com.bbva.ethermobilesdk.cipher.keystore.provider.KeyStoreProvider
    @NotNull
    public synchronized String decrypt$cipher_release(@NotNull String data, @Nullable String alias) throws KeyStoreCipherException {
        byte[] bytes;
        try {
            Intrinsics.checkNotNullParameter(data, "data");
            if (!isAvailable$cipher_release()) {
                throw KeyStoreCipherException.INSTANCE.getNOT_AVAILABLE_EXCEPTION();
            }
            if (alias == null) {
                alias = AES256_KEY_ALIAS;
            }
            try {
                SecretKeySpec secretKeySpecA = a(alias);
                List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) data, new String[]{"|"}, false, 0, 6, (Object) null);
                byte[] bArrBase64ToByteArray = EncodingUtilsKt.base64ToByteArray((String) listSplit$default.get(0));
                byte[] bArrBase64ToByteArray2 = EncodingUtilsKt.base64ToByteArray((String) listSplit$default.get(1));
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5padding");
                cipher.init(2, secretKeySpecA, new IvParameterSpec(bArrBase64ToByteArray));
                bytes = cipher.doFinal(bArrBase64ToByteArray2);
                Intrinsics.checkNotNullExpressionValue(bytes, "bytes");
            } catch (Throwable th2) {
                throw new KeyStoreCipherException(th2, KeyStoreProvider.DECRYPTION_ERROR_CODE, KeyStoreProvider.DECRYPTION_ERROR_MESSAGE);
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return new String(bytes, Charsets.UTF_8);
    }

    @Override // com.bbva.ethermobilesdk.cipher.keystore.provider.KeyStoreProvider
    @NotNull
    public synchronized String encrypt$cipher_release(@NotNull String data, @Nullable String alias) throws KeyStoreCipherException {
        byte[] bytes;
        String base64;
        String base65;
        try {
            Intrinsics.checkNotNullParameter(data, "data");
            if (!isAvailable$cipher_release()) {
                throw KeyStoreCipherException.INSTANCE.getNOT_AVAILABLE_EXCEPTION();
            }
            if (alias == null) {
                alias = AES256_KEY_ALIAS;
            }
            try {
                SecretKeySpec secretKeySpecA = a(alias);
                byte[] bArr = new byte[16];
                new SecureRandom().nextBytes(bArr);
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5padding");
                cipher.init(1, secretKeySpecA, new IvParameterSpec(bArr));
                Charset charset = Charsets.UTF_8;
                byte[] bytes2 = data.getBytes(charset);
                Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
                bytes = cipher.doFinal(bytes2);
                byte[] bytes3 = KP_18.getBytes(charset);
                Intrinsics.checkNotNullExpressionValue(bytes3, "this as java.lang.String).getBytes(charset)");
                base64 = EncodingUtilsKt.toBase64(bytes3);
                base65 = EncodingUtilsKt.toBase64(bArr);
                Intrinsics.checkNotNullExpressionValue(bytes, "bytes");
            } catch (Throwable th2) {
                throw new KeyStoreCipherException(th2, KeyStoreProvider.ENCRYPTION_ERROR_CODE, KeyStoreProvider.ENCRYPTION_ERROR_MESSAGE);
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return base64 + "|" + base65 + "|" + EncodingUtilsKt.toBase64(bytes);
    }

    @VisibleForTesting(otherwise = 2)
    @NotNull
    public final KeyPair getOrCreateRSAKey$cipher_release(@NotNull String alias) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        Intrinsics.checkNotNullParameter(alias, "alias");
        KeyPair keyPair = null;
        try {
            if (getKeyStore() != null) {
                KeyStore keyStore = getKeyStore();
                Intrinsics.checkNotNull(keyStore);
                Certificate certificate = keyStore.getCertificate(alias);
                PublicKey publicKey = certificate != null ? certificate.getPublicKey() : null;
                if (publicKey != null) {
                    KeyStore keyStore2 = getKeyStore();
                    Intrinsics.checkNotNull(keyStore2);
                    KeyStore.Entry entry = keyStore2.getEntry(alias, null);
                    if (entry != null) {
                        keyPair = new KeyPair(publicKey, ((KeyStore.PrivateKeyEntry) entry).getPrivateKey());
                    }
                }
            }
        } catch (Throwable unused) {
        }
        if (keyPair != null) {
            return keyPair;
        }
        KeyPairGeneratorSpec spec$default = KeyPairGeneratorSpecCompat.getSpec$default(new KeyPairGeneratorSpecCompat(this.f29333b), alias, 2048, null, 4, null);
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", KeyStoreProvider.ANDROID_KEYSTORE);
        keyPairGenerator.initialize(spec$default);
        KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
        Intrinsics.checkNotNullExpressionValue(keyPairGenerateKeyPair, "generator.generateKeyPair()");
        return keyPairGenerateKeyPair;
    }

    @Override // com.bbva.ethermobilesdk.cipher.keystore.provider.KeyStoreProvider
    @VisibleForTesting(otherwise = 2)
    public void reset$cipher_release() throws KeyStoreException {
        Iterator<T> it = getAliases$cipher_release().iterator();
        while (it.hasNext()) {
            delete$cipher_release((String) it.next());
        }
        this.f29334c.edit().clear().apply();
    }

    @Override // com.bbva.ethermobilesdk.cipher.PlatformCipherProvider
    @NotNull
    public Cipher toCipherForDecryption(@NotNull Context context, @NotNull String data, @Nullable String seed) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, InvalidAlgorithmParameterException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        if (seed == null) {
            seed = AES256_KEY_ALIAS;
        }
        SecretKeySpec secretKeySpecA = a(seed);
        byte[] bArrBase64ToByteArray = EncodingUtilsKt.base64ToByteArray((String) StringsKt__StringsKt.split$default((CharSequence) data, new String[]{"|"}, false, 0, 6, (Object) null).get(0));
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5padding");
        cipher.init(2, secretKeySpecA, new IvParameterSpec(bArrBase64ToByteArray));
        Intrinsics.checkNotNullExpressionValue(cipher, "getInstance(AES_TRANSFOR…ameterSpec(iv))\n        }");
        return cipher;
    }

    @Override // com.bbva.ethermobilesdk.cipher.PlatformCipherProvider
    @NotNull
    public Cipher toCipherForEncryption(@NotNull Context context, @Nullable String seed) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, KeyStoreCipherException, NoSuchProviderException, InvalidAlgorithmParameterException {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!isAvailable$cipher_release()) {
            throw KeyStoreCipherException.INSTANCE.getNOT_AVAILABLE_EXCEPTION();
        }
        if (seed == null) {
            seed = AES256_KEY_ALIAS;
        }
        SecretKeySpec secretKeySpecA = a(seed);
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5padding");
        cipher.init(1, secretKeySpecA, new IvParameterSpec(bArr));
        Intrinsics.checkNotNullExpressionValue(cipher, "getInstance(AES_TRANSFOR…ameterSpec(iv))\n        }");
        return cipher;
    }

    /* JADX INFO: compiled from: AndroidKeyStoreProviderCompat.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u0016\u0010\u0006\u001a\u00020\u00078\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0002R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\u00020\u00078\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0002R\u000e\u0010\f\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\u00020\u00078\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0012\u0010\u0002R\u000e\u0010\u0013\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/bbva/ethermobilesdk/cipher/keystore/provider/impl/AndroidKeyStoreProviderCompat$Companion;", "", "()V", "AES256_IV_SIZE_BYTES", "", "getAES256_IV_SIZE_BYTES$cipher_release$annotations", "AES256_KEY_ALIAS", "", "getAES256_KEY_ALIAS$cipher_release$annotations", "AES256_KEY_SIZE_BYTES", "AES256_STORAGE_FILE", "getAES256_STORAGE_FILE$cipher_release$annotations", "AES_ALGORITHM", "AES_TRANSFORMATION", "KP_18", "RSA_ALGORITHM_COMPAT", "RSA_KEY_SIZE_BITS", "RSA_MASTER_KEY", "getRSA_MASTER_KEY$cipher_release$annotations", "RSA_TRANSFORMATION", "cipher_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @VisibleForTesting(otherwise = 2)
        public static /* synthetic */ void getAES256_IV_SIZE_BYTES$cipher_release$annotations() {
        }

        @VisibleForTesting(otherwise = 2)
        public static /* synthetic */ void getAES256_KEY_ALIAS$cipher_release$annotations() {
        }

        @VisibleForTesting(otherwise = 2)
        public static /* synthetic */ void getAES256_STORAGE_FILE$cipher_release$annotations() {
        }

        @VisibleForTesting(otherwise = 2)
        public static /* synthetic */ void getRSA_MASTER_KEY$cipher_release$annotations() {
        }
    }
}
