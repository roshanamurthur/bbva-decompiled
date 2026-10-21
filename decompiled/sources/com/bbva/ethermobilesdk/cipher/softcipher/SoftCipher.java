package com.bbva.ethermobilesdk.cipher.softcipher;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Base64;
import androidx.annotation.Size;
import androidx.annotation.VisibleForTesting;
import com.bbva.ethermobile.elogger.EtherLogger;
import com.bbva.ethermobilesdk.cipher.PlatformCipherProvider;
import com.bbva.ethermobilesdk.cipher.logger.CipherLoggerKt;
import com.bbva.ethermobilesdk.cipher.model.CipherResult;
import com.bbva.ethermobilesdk.cipher.token.exception.TokenException;
import com.bbva.ethermobilesdk.cipher.token.generator.impl.HashGeneratorImpl;
import com.bbva.ethermobilesdk.cipher.token.generator.impl.SecretKeyGeneratorImpl;
import com.bbva.ethermobilesdk.cipher.token.model.SecretKeyBundle;
import com.bbva.ethermobilesdk.cipher.token.model.SecretKeyGeneratorAttributes;
import com.bbva.zoomauth.facialauth.FacialAuthFragment;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SoftCipher.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0018\u0010\u0019J,\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002J,\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002J@\u0010\n\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\u00020\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002J@\u0010\u000b\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\u00020\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002J&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00062\b\b\u0001\u0010\u0010\u001a\u00020\u0006J&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00062\b\b\u0001\u0010\u0010\u001a\u00020\u0006J$\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0006J$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0006J\u001a\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006H\u0016J\"\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u001b"}, d2 = {"Lcom/bbva/ethermobilesdk/cipher/softcipher/SoftCipher;", "Lcom/bbva/ethermobilesdk/cipher/PlatformCipherProvider;", "", "data", "Ljava/security/Key;", "key", "", "algorithm", "iv", "Lcom/bbva/ethermobilesdk/cipher/model/CipherResult;", "encrypt", "decrypt", "transformation", "kotlin.jvm.PlatformType", "Landroid/content/Context;", "context", "seed", "Ljava/security/PublicKey;", FacialAuthFragment.PUBLIC_KEY, "Ljava/security/PrivateKey;", "privateKey", "Ljavax/crypto/Cipher;", "toCipherForEncryption", "toCipherForDecryption", "<init>", "()V", "Companion", "cipher_release"}, k = 1, mv = {1, 8, 0})
public final class SoftCipher implements PlatformCipherProvider {

    @NotNull
    public static final String ERROR_INVALID_SEED_LENGTH = "Seed length must be 128 bytes";

    @NotNull
    public static final String ERROR_IV_CORRUPTED = "Encrypted data is corrupted and does not include its IV.";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Charset f29374a = Charsets.UTF_8;

    public static byte[] a(SoftCipher softCipher, Context context) throws PackageManager.NameNotFoundException, TokenException {
        softCipher.getClass();
        String packageName = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
        return new HashGeneratorImpl().generateHash(packageName + context.getPackageManager().getPackageInfo(packageName, 0).firstInstallTime, "SHA-256");
    }

    public static Cipher b(String str, int i10, Key key, byte[] bArr) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Cipher cipher = Cipher.getInstance(str);
        cipher.init(i10, key, new IvParameterSpec(bArr));
        Intrinsics.checkNotNullExpressionValue(cipher, "getInstance(transformati…ameterSpec(iv))\n        }");
        return cipher;
    }

    public static void c(String str, Throwable th2) {
        CipherLoggerKt.logCipherError(EtherLogger.INSTANCE, th2, SoftCipher.class, CipherLoggerKt.getLoggerPayload(TuplesKt.to("cipher_operation", str)));
    }

    public static /* synthetic */ CipherResult decrypt$default(SoftCipher softCipher, byte[] bArr, byte[] bArr2, String str, String str2, byte[] bArr3, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            bArr3 = null;
        }
        return softCipher.decrypt(bArr, bArr2, str, str2, bArr3);
    }

    public static /* synthetic */ CipherResult encrypt$default(SoftCipher softCipher, byte[] bArr, byte[] bArr2, String str, String str2, byte[] bArr3, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            bArr3 = null;
        }
        return softCipher.encrypt(bArr, bArr2, str, str2, bArr3);
    }

    @NotNull
    public final CipherResult<byte[]> decrypt(@NotNull byte[] data, @NotNull Key key, @NotNull String algorithm, @NotNull byte[] iv) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        Intrinsics.checkNotNullParameter(iv, "iv");
        try {
            byte[] bArrDoFinal = b(algorithm, 2, key, iv).doFinal(data);
            Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "cipher.doFinal(data)");
            return new CipherResult.Success(bArrDoFinal);
        } catch (Exception e5) {
            c("decrypt", e5);
            return new CipherResult.Error(e5);
        }
    }

    @NotNull
    public final CipherResult<byte[]> encrypt(@NotNull byte[] data, @NotNull Key key, @NotNull String algorithm, @NotNull byte[] iv) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        Intrinsics.checkNotNullParameter(iv, "iv");
        try {
            byte[] bArrDoFinal = b(algorithm, 1, key, iv).doFinal(data);
            Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "cipher.doFinal(data)");
            return new CipherResult.Success(bArrDoFinal);
        } catch (Exception e5) {
            c("encrypt", e5);
            return new CipherResult.Error(e5);
        }
    }

    @Override // com.bbva.ethermobilesdk.cipher.PlatformCipherProvider
    @NotNull
    public Cipher toCipherForDecryption(@NotNull Context context, @NotNull String data, @Nullable String seed) throws Exception {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        if (seed == null) {
            throw new IllegalStateException("See can't be null");
        }
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) data, new String[]{"|"}, false, 0, 6, (Object) null);
        if (listSplit$default.size() != 2) {
            throw new Exception(ERROR_IV_CORRUPTED);
        }
        byte[] iv = Base64.decode((String) listSplit$default.get(0), 0);
        byte[] bArrA = a(this, context);
        Charset charset = f29374a;
        String str = new String(bArrA, charset);
        byte[] bytes = seed.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        SecretKey key = new SecretKeyGeneratorImpl().generateSecretKey(str, new SecretKeyGeneratorAttributes("PBKDF2withHmacSHA1", "AES", 256, 8192, 16, bytes)).getKey();
        Intrinsics.checkNotNullExpressionValue(iv, "iv");
        return b("AES/CBC/PKCS5Padding", 2, key, iv);
    }

    @Override // com.bbva.ethermobilesdk.cipher.PlatformCipherProvider
    @NotNull
    public Cipher toCipherForEncryption(@NotNull Context context, @Nullable String seed) throws Exception {
        Intrinsics.checkNotNullParameter(context, "context");
        if (seed == null) {
            throw new IllegalStateException("See can't be null");
        }
        byte[] bArrA = a(this, context);
        Charset charset = f29374a;
        String str = new String(bArrA, charset);
        byte[] bytes = seed.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        SecretKeyBundle secretKeyBundleGenerateSecretKey = new SecretKeyGeneratorImpl().generateSecretKey(str, new SecretKeyGeneratorAttributes("PBKDF2withHmacSHA1", "AES", 256, 8192, 16, bytes));
        return b("AES/CBC/PKCS5Padding", 1, secretKeyBundleGenerateSecretKey.getKey(), secretKeyBundleGenerateSecretKey.getSalt());
    }

    @NotNull
    public final CipherResult<byte[]> decrypt(@NotNull byte[] data, @NotNull byte[] key, @NotNull String algorithm, @NotNull String transformation, @Nullable byte[] iv) {
        Object objM5535constructorimpl;
        Cipher cipherB;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        Intrinsics.checkNotNullParameter(transformation, "transformation");
        try {
            Result.Companion companion = Result.INSTANCE;
            SecretKeySpec secretKeySpec = new SecretKeySpec(key, algorithm);
            if (iv != null) {
                cipherB = b(transformation, 2, secretKeySpec, iv);
            } else {
                Cipher cipher = Cipher.getInstance(transformation);
                cipher.init(2, secretKeySpec);
                Intrinsics.checkNotNullExpressionValue(cipher, "getInstance(transformati…init(mode, key)\n        }");
                cipherB = cipher;
            }
            objM5535constructorimpl = Result.m5535constructorimpl(new CipherResult.Success(cipherB.doFinal(data)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
        if (thM5538exceptionOrNullimpl != null) {
            c("decrypt", thM5538exceptionOrNullimpl);
            objM5535constructorimpl = new CipherResult.Error(thM5538exceptionOrNullimpl);
        }
        return (CipherResult) objM5535constructorimpl;
    }

    @NotNull
    public final CipherResult<byte[]> encrypt(@NotNull byte[] data, @NotNull byte[] key, @NotNull String algorithm, @NotNull String transformation, @Nullable byte[] iv) {
        Object objM5535constructorimpl;
        Cipher cipherB;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        Intrinsics.checkNotNullParameter(transformation, "transformation");
        try {
            Result.Companion companion = Result.INSTANCE;
            SecretKeySpec secretKeySpec = new SecretKeySpec(key, algorithm);
            if (iv != null) {
                cipherB = b(transformation, 1, secretKeySpec, iv);
            } else {
                Cipher cipher = Cipher.getInstance(transformation);
                cipher.init(1, secretKeySpec);
                Intrinsics.checkNotNullExpressionValue(cipher, "getInstance(transformati…init(mode, key)\n        }");
                cipherB = cipher;
            }
            objM5535constructorimpl = Result.m5535constructorimpl(new CipherResult.Success(cipherB.doFinal(data)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
        if (thM5538exceptionOrNullimpl != null) {
            c("encrypt", thM5538exceptionOrNullimpl);
            objM5535constructorimpl = new CipherResult.Error(thM5538exceptionOrNullimpl);
        }
        return (CipherResult) objM5535constructorimpl;
    }

    @NotNull
    public final CipherResult<String> decrypt(@NotNull Context context, @NotNull String data, @Size(128) @NotNull String seed) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(seed, "seed");
        if (seed.length() != 128) {
            return new CipherResult.Error(new InvalidKeyException(ERROR_INVALID_SEED_LENGTH));
        }
        try {
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) data, new String[]{"|"}, false, 0, 6, (Object) null);
            if (listSplit$default.size() != 2) {
                return new CipherResult.Error(new Exception(ERROR_IV_CORRUPTED));
            }
            String str = (String) listSplit$default.get(0);
            String str2 = (String) listSplit$default.get(1);
            byte[] iv = Base64.decode(str, 0);
            byte[] bArrA = a(this, context);
            Charset charset = f29374a;
            String str3 = new String(bArrA, charset);
            byte[] bytes = seed.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            SecretKey key = new SecretKeyGeneratorImpl().generateSecretKey(str3, new SecretKeyGeneratorAttributes("PBKDF2withHmacSHA1", "AES", 256, 8192, 16, bytes)).getKey();
            Intrinsics.checkNotNullExpressionValue(iv, "iv");
            byte[] decryptedData = b("AES/CBC/PKCS5Padding", 2, key, iv).doFinal(Base64.decode(str2, 0));
            Intrinsics.checkNotNullExpressionValue(decryptedData, "decryptedData");
            return new CipherResult.Success(new String(decryptedData, charset));
        } catch (Throwable th2) {
            c("decrypt", th2);
            return new CipherResult.Error(th2);
        }
    }

    @NotNull
    public final CipherResult<String> encrypt(@NotNull Context context, @NotNull String data, @Size(128) @NotNull String seed) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(seed, "seed");
        if (seed.length() != 128) {
            return new CipherResult.Error(new InvalidKeyException(ERROR_INVALID_SEED_LENGTH));
        }
        try {
            byte[] bArrA = a(this, context);
            Charset charset = f29374a;
            String str = new String(bArrA, charset);
            byte[] bytes = seed.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            SecretKeyBundle secretKeyBundleGenerateSecretKey = new SecretKeyGeneratorImpl().generateSecretKey(str, new SecretKeyGeneratorAttributes("PBKDF2withHmacSHA1", "AES", 256, 8192, 16, bytes));
            Cipher cipherB = b("AES/CBC/PKCS5Padding", 1, secretKeyBundleGenerateSecretKey.getKey(), secretKeyBundleGenerateSecretKey.getSalt());
            byte[] bytes2 = data.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
            String strEncodeToString = Base64.encodeToString(cipherB.doFinal(bytes2), 0);
            return new CipherResult.Success(Base64.encodeToString(secretKeyBundleGenerateSecretKey.getSalt(), 0) + "|" + strEncodeToString);
        } catch (Throwable th2) {
            c("encrypt", th2);
            return new CipherResult.Error(th2);
        }
    }

    @NotNull
    public final CipherResult<byte[]> encrypt(@NotNull byte[] data, @NotNull PublicKey publicKey, @NotNull String algorithm) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        try {
            Cipher cipher = Cipher.getInstance(algorithm);
            cipher.init(1, publicKey);
            Intrinsics.checkNotNullExpressionValue(cipher, "getInstance(transformati…init(mode, key)\n        }");
            byte[] bArrDoFinal = cipher.doFinal(data);
            Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "cipher.doFinal(data)");
            return new CipherResult.Success(bArrDoFinal);
        } catch (Exception e5) {
            c("encrypt", e5);
            return new CipherResult.Error(e5);
        }
    }

    @NotNull
    public final CipherResult<byte[]> decrypt(@NotNull byte[] data, @NotNull PrivateKey privateKey, @NotNull String algorithm) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(privateKey, "privateKey");
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        try {
            Cipher cipher = Cipher.getInstance(algorithm);
            cipher.init(2, privateKey);
            Intrinsics.checkNotNullExpressionValue(cipher, "getInstance(transformati…init(mode, key)\n        }");
            byte[] bArrDoFinal = cipher.doFinal(data);
            Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "cipher.doFinal(data)");
            return new CipherResult.Success(bArrDoFinal);
        } catch (Exception e5) {
            c("decrypt", e5);
            return new CipherResult.Error(e5);
        }
    }

    /* JADX INFO: compiled from: SoftCipher.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0002R\u0016\u0010\f\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\r\u0010\u0002R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/bbva/ethermobilesdk/cipher/softcipher/SoftCipher$Companion;", "", "()V", "ALGORITHM_KEY_FACTORY", "", "ALGORITHM_KEY_SPEC", "ALGORITHM_PASSWORD", "CHARSET_DEFAULT", "Ljava/nio/charset/Charset;", "CIPHER_TRANSFORMATION", "ERROR_INVALID_SEED_LENGTH", "getERROR_INVALID_SEED_LENGTH$cipher_release$annotations", "ERROR_IV_CORRUPTED", "getERROR_IV_CORRUPTED$cipher_release$annotations", "ITERATIONS_SECRET_KEY", "", "LENGTH_SALT", "LENGTH_SECRET_KEY", "LENGTH_SEED", "", "OPERATION_DECRYPT", "OPERATION_ENCRYPT", "PARAM_CIPHER_OPERATION", "SEPARATOR", "cipher_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @VisibleForTesting(otherwise = 2)
        public static /* synthetic */ void getERROR_INVALID_SEED_LENGTH$cipher_release$annotations() {
        }

        @VisibleForTesting(otherwise = 2)
        public static /* synthetic */ void getERROR_IV_CORRUPTED$cipher_release$annotations() {
        }
    }
}
