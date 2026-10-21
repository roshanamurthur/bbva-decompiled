package com.bbva.ethermobilesdk.cipher.keystore.provider.impl;

import android.content.Context;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyInfo;
import androidx.annotation.VisibleForTesting;
import com.bbva.ethermobilesdk.cipher.keystore.exception.KeyStoreCipherException;
import com.bbva.ethermobilesdk.cipher.keystore.provider.KeyStoreProvider;
import com.bbva.ethermobilesdk.cipher.keystore.provider.spec.AESKeyGeneratorSpec;
import com.bbva.ethermobilesdk.cipher.model.EncryptedData;
import com.bbva.ethermobilesdk.cipher.utils.EncodingUtilsKt;
import com.bbva.google.pay.GoogleTapAndPay;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AndroidKeyStoreProvider.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0011\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0010¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0010¢\u0006\u0004\b\b\u0010\u0006J\u001a\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0016J\"\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0016J\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013J\u000e\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0002¨\u0006\u001d"}, d2 = {"Lcom/bbva/ethermobilesdk/cipher/keystore/provider/impl/AndroidKeyStoreProvider;", "Lcom/bbva/ethermobilesdk/cipher/keystore/provider/KeyStoreProvider;", "", "data", GoogleTapAndPay.KEY_ALIAS, "encrypt$cipher_release", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "encrypt", "decrypt$cipher_release", "decrypt", "Landroid/content/Context;", "context", "seed", "Ljavax/crypto/Cipher;", "toCipherForEncryption", "toCipherForDecryption", "", "removeAlias", "(Ljava/lang/String;)Lkotlin/Unit;", "Ljavax/crypto/SecretKey;", "secretKey", "Landroid/security/keystore/KeyInfo;", "secretKeyInfo", "getOrCreateAESKey", "", "invalidateAliasByBiometricEnrollment", "<init>", "(Z)V", "Companion", "cipher_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidKeyStoreProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidKeyStoreProvider.kt\ncom/bbva/ethermobilesdk/cipher/keystore/provider/impl/AndroidKeyStoreProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,137:1\n1#2:138\n*E\n"})
public final class AndroidKeyStoreProvider extends KeyStoreProvider {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String KP_23 = "com.bbva.ethermobilesdk.cipher.keystore.kp_23";

    @NotNull
    public static final String MASTER_KEY = "com.bbva.ethermobilesdk.cipher.keystore.masterkey";

    @NotNull
    public static final String TEMPORARY = "com.bbva.ethermobilesdk.cipher.keystore.temporary";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f29332b;

    public AndroidKeyStoreProvider() {
        this(false, 1, null);
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
                alias = MASTER_KEY;
            }
            try {
                SecretKey orCreateAESKey = getOrCreateAESKey(alias);
                List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) data, new String[]{"|"}, false, 0, 6, (Object) null);
                byte[] bArrBase64ToByteArray = EncodingUtilsKt.base64ToByteArray((String) listSplit$default.get(0));
                byte[] bArrBase64ToByteArray2 = EncodingUtilsKt.base64ToByteArray((String) listSplit$default.get(1));
                IvParameterSpec ivParameterSpec = new IvParameterSpec(bArrBase64ToByteArray);
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
                cipher.init(2, orCreateAESKey, ivParameterSpec);
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
        byte[] iv;
        try {
            Intrinsics.checkNotNullParameter(data, "data");
            if (!isAvailable$cipher_release()) {
                throw KeyStoreCipherException.INSTANCE.getNOT_AVAILABLE_EXCEPTION();
            }
            if (alias == null) {
                alias = MASTER_KEY;
            }
            try {
                SecretKey orCreateAESKey = getOrCreateAESKey(alias);
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
                cipher.init(1, orCreateAESKey);
                byte[] bytes2 = data.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
                bytes = cipher.doFinal(bytes2);
                iv = cipher.getIV();
                Intrinsics.checkNotNullExpressionValue(iv, "cipher.iv");
                Intrinsics.checkNotNullExpressionValue(bytes, "bytes");
            } catch (Throwable th2) {
                throw new KeyStoreCipherException(th2, KeyStoreProvider.ENCRYPTION_ERROR_CODE, KeyStoreProvider.ENCRYPTION_ERROR_MESSAGE);
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return new EncryptedData(iv, bytes).toString();
    }

    @NotNull
    public final SecretKey getOrCreateAESKey(@NotNull String alias) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        Intrinsics.checkNotNullParameter(alias, "alias");
        KeyStore keyStore = getKeyStore();
        KeyStore.Entry entry = keyStore != null ? keyStore.getEntry(alias, null) : null;
        KeyStore.SecretKeyEntry secretKeyEntry = entry instanceof KeyStore.SecretKeyEntry ? (KeyStore.SecretKeyEntry) entry : null;
        SecretKey secretKey = secretKeyEntry != null ? secretKeyEntry.getSecretKey() : null;
        if (secretKey != null) {
            return secretKey;
        }
        KeyGenParameterSpec spec$default = (Build.VERSION.SDK_INT < 24 || !this.f29332b) ? AESKeyGeneratorSpec.getSpec$default(new AESKeyGeneratorSpec(), alias, 256, null, 4, null) : AESKeyGeneratorSpec.getSpecInvalidated$default(new AESKeyGeneratorSpec(), alias, 256, null, 4, null);
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", KeyStoreProvider.ANDROID_KEYSTORE);
        keyGenerator.init(spec$default);
        SecretKey secretKeyGenerateKey = keyGenerator.generateKey();
        Intrinsics.checkNotNullExpressionValue(secretKeyGenerateKey, "getInstance(KeyPropertie…           .generateKey()");
        return secretKeyGenerateKey;
    }

    @Nullable
    public final Unit removeAlias(@Nullable String alias) throws KeyStoreException {
        if (alias == null) {
            alias = MASTER_KEY;
        }
        KeyStore keyStore = getKeyStore();
        if (keyStore == null) {
            return null;
        }
        keyStore.deleteEntry(alias);
        return Unit.INSTANCE;
    }

    @NotNull
    public final KeyInfo secretKeyInfo(@NotNull SecretKey secretKey) throws InvalidKeySpecException {
        Intrinsics.checkNotNullParameter(secretKey, "secretKey");
        KeySpec keySpec = SecretKeyFactory.getInstance(secretKey.getAlgorithm(), KeyStoreProvider.ANDROID_KEYSTORE).getKeySpec(secretKey, KeyInfo.class);
        Intrinsics.checkNotNull(keySpec, "null cannot be cast to non-null type android.security.keystore.KeyInfo");
        return (KeyInfo) keySpec;
    }

    @Override // com.bbva.ethermobilesdk.cipher.PlatformCipherProvider
    @NotNull
    public Cipher toCipherForDecryption(@NotNull Context context, @NotNull String data, @Nullable String seed) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, InvalidAlgorithmParameterException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        if (seed == null) {
            seed = MASTER_KEY;
        }
        SecretKey orCreateAESKey = getOrCreateAESKey(seed);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(EncryptedData.INSTANCE.from(data).getIv());
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
        cipher.init(2, orCreateAESKey, ivParameterSpec);
        Intrinsics.checkNotNullExpressionValue(cipher, "getInstance(AES_TRANSFOR…vParameterSpec)\n        }");
        return cipher;
    }

    @Override // com.bbva.ethermobilesdk.cipher.PlatformCipherProvider
    @NotNull
    public Cipher toCipherForEncryption(@NotNull Context context, @Nullable String seed) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, KeyStoreCipherException, NoSuchProviderException, InvalidAlgorithmParameterException {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!isAvailable$cipher_release()) {
            throw KeyStoreCipherException.INSTANCE.getNOT_AVAILABLE_EXCEPTION();
        }
        if (seed == null) {
            seed = MASTER_KEY;
        }
        SecretKey orCreateAESKey = getOrCreateAESKey(seed);
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
        cipher.init(1, orCreateAESKey);
        Intrinsics.checkNotNullExpressionValue(cipher, "getInstance(AES_TRANSFOR…NCRYPT_MODE, secretKey) }");
        return cipher;
    }

    public /* synthetic */ AndroidKeyStoreProvider(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10);
    }

    public AndroidKeyStoreProvider(boolean z10) {
        this.f29332b = z10;
    }

    /* JADX INFO: compiled from: AndroidKeyStoreProvider.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u00020\u00068\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0002R\u000e\u0010\n\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/bbva/ethermobilesdk/cipher/keystore/provider/impl/AndroidKeyStoreProvider$Companion;", "", "()V", "AES_KEY_SIZE", "", "AES_TRANSFORMATION", "", "KP_23", "MASTER_KEY", "getMASTER_KEY$cipher_release$annotations", "TEMPORARY", "cipher_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @VisibleForTesting(otherwise = 2)
        public static /* synthetic */ void getMASTER_KEY$cipher_release$annotations() {
        }
    }
}
