package com.bbva.ethermobilesdk.cipher.pincipher;

import android.content.Context;
import androidx.annotation.Size;
import androidx.annotation.VisibleForTesting;
import com.bbva.ethermobile.elogger.EtherLogger;
import com.bbva.ethermobilesdk.cipher.logger.CipherLoggerKt;
import com.bbva.ethermobilesdk.cipher.model.CipherResult;
import com.bbva.ethermobilesdk.cipher.pincipher.exception.PinCipherException;
import com.bbva.ethermobilesdk.cipher.pincipher.extension.StringKt;
import com.bbva.ethermobilesdk.cipher.pincipher.model.ByteHostData;
import com.bbva.ethermobilesdk.cipher.pincipher.properties.DefaultPropertiesManager;
import com.bbva.ethermobilesdk.cipher.pincipher.utils.CryptoUtils;
import com.bbva.ethermobilesdk.cipher.pincipher.utils.EncodingUtilsKt;
import com.bbva.zoomauth.facialauth.FacialAuthFragment;
import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;
import javax.crypto.SecretKey;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PinCipher.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J(\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u0007J0\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\b\b\u0001\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0007J \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0007J(\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\f\u001a\u00020\u0007H\u0007¨\u0006\u0016"}, d2 = {"Lcom/bbva/ethermobilesdk/cipher/pincipher/PinCipher;", "", "Lcom/bbva/ethermobilesdk/cipher/model/CipherResult;", "", "generateKeyPair", "data", "keyTag", "", "isHexEncoded", "encrypt", "modulus", "keyIndex", "asHexEncoded", "decrypt", "Ljava/security/interfaces/RSAPrivateKey;", "rsaPrivateKey", "decryptRsaPrivateKey", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Companion", "cipher_release"}, k = 1, mv = {1, 8, 0})
public final class PinCipher {

    @NotNull
    public static final String ERROR_INVALID_BLOCK_SIZE = "ERROR_INVALID_BLOCK_SIZE";

    @NotNull
    public static final String ERROR_INVALID_PROTOCOL = "ERROR_INVALID_PROTOCOL";

    @NotNull
    public static final String ERROR_LOADING_KEY_TAG_NOT_FOUND = "ERROR_LOADING_KEY_TAG_NOT_FOUND";

    @NotNull
    public static final String ERROR_PRIVATE_KEY_NOT_GENERATED = "ERROR_PRIVATE_KEY_NOT_GENERATED";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f29343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public RSAPrivateKey f29344b;

    public PinCipher(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f29343a = context;
    }

    public static void a(String str, PinCipherException pinCipherException) {
        CipherLoggerKt.logCipherError(EtherLogger.INSTANCE, pinCipherException, PinCipher.class, CipherLoggerKt.getLoggerPayload(TuplesKt.to("cipher_operation", str)));
    }

    public static /* synthetic */ CipherResult decrypt$default(PinCipher pinCipher, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return pinCipher.decrypt(str, z10);
    }

    public static /* synthetic */ CipherResult decryptRsaPrivateKey$default(PinCipher pinCipher, String str, RSAPrivateKey rSAPrivateKey, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return pinCipher.decryptRsaPrivateKey(str, rSAPrivateKey, z10);
    }

    public static /* synthetic */ CipherResult encrypt$default(PinCipher pinCipher, String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return pinCipher.encrypt(str, str2, z10);
    }

    @NotNull
    public final CipherResult<String> decrypt(@Size(max = 1028) @NotNull String data, boolean asHexEncoded) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (this.f29344b == null) {
            return new CipherResult.Error(new PinCipherException(null, ERROR_PRIVATE_KEY_NOT_GENERATED, "Error retrieving private key."));
        }
        if (data.length() != 1028) {
            return new CipherResult.Error(new PinCipherException(null, ERROR_INVALID_BLOCK_SIZE, "Invalid data length to decrypt."));
        }
        try {
            ByteHostData byteHostData = EncodingUtilsKt.toByteHostData(EncodingUtilsKt.toHexHostData(data));
            if (!Arrays.equals(byteHostData.getVersion(), com.bbva.ethermobilesdk.cipher.utils.EncodingUtilsKt.hexStringToByteArray$default("01", null, 1, null))) {
                return new CipherResult.Error(new PinCipherException(null, ERROR_INVALID_PROTOCOL, "Invalid protocol version."));
            }
            CryptoUtils cryptoUtils = CryptoUtils.INSTANCE;
            byte[] firstSegment = byteHostData.getFirstSegment();
            RSAPrivateKey rSAPrivateKey = this.f29344b;
            Intrinsics.checkNotNull(rSAPrivateKey);
            SecretKey secretKeyGenerateKeyDESEDE = cryptoUtils.generateKeyDESEDE(CryptoUtils.rsaDecrypt$default(cryptoUtils, firstSegment, rSAPrivateKey, null, 4, null));
            byte[] secondSegment = byteHostData.getSecondSegment();
            RSAPrivateKey rSAPrivateKey2 = this.f29344b;
            Intrinsics.checkNotNull(rSAPrivateKey2);
            byte[] bArrDecrypt = cryptoUtils.decrypt(secretKeyGenerateKeyDESEDE, CryptoUtils.rsaDecrypt$default(cryptoUtils, secondSegment, rSAPrivateKey2, null, 4, null));
            return asHexEncoded ? new CipherResult.Success(com.bbva.ethermobilesdk.cipher.utils.EncodingUtilsKt.toHex$default(bArrDecrypt, null, 1, null)) : new CipherResult.Success(new String(com.bbva.ethermobilesdk.cipher.utils.EncodingUtilsKt.hexStringToByteArray$default(com.bbva.ethermobilesdk.cipher.utils.EncodingUtilsKt.toHex$default(bArrDecrypt, null, 1, null), null, 1, null), Charsets.UTF_8));
        } catch (PinCipherException e5) {
            a("decrypt", e5);
            return new CipherResult.Error(new PinCipherException(e5, e5.getF29329p0(), e5.getF29330q0()));
        }
    }

    @VisibleForTesting
    @NotNull
    public final CipherResult<String> decryptRsaPrivateKey(@NotNull String data, @NotNull RSAPrivateKey rsaPrivateKey, boolean asHexEncoded) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(rsaPrivateKey, "rsaPrivateKey");
        this.f29344b = rsaPrivateKey;
        return decrypt(data, asHexEncoded);
    }

    @NotNull
    public final CipherResult<String> encrypt(@NotNull String data, @Nullable String keyTag, boolean isHexEncoded) {
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            DefaultPropertiesManager defaultPropertiesManager = new DefaultPropertiesManager(this.f29343a);
            CryptoUtils cryptoUtils = CryptoUtils.INSTANCE;
            String str = "default";
            String contentFromTag = cryptoUtils.getContentFromTag("keyIndex", keyTag == null ? "default" : keyTag, defaultPropertiesManager.getF29355a());
            if (keyTag != null) {
                str = keyTag;
            }
            String contentFromTag2 = cryptoUtils.getContentFromTag(FacialAuthFragment.PUBLIC_KEY, str, defaultPropertiesManager.getF29355a());
            if (contentFromTag != null && contentFromTag2 != null) {
                return encrypt(data, contentFromTag2, contentFromTag, isHexEncoded);
            }
            return new CipherResult.Error(new PinCipherException(null, ERROR_LOADING_KEY_TAG_NOT_FOUND, "Error loading key tag '" + keyTag + "' from configuration file."));
        } catch (PinCipherException e5) {
            a("encrypt", e5);
            return new CipherResult.Error(new PinCipherException(e5, e5.getF29329p0(), e5.getF29330q0()));
        }
    }

    @NotNull
    public final CipherResult<String> generateKeyPair() {
        try {
            KeyPair keyPairGenerateRSAKeyPair = CryptoUtils.INSTANCE.generateRSAKeyPair();
            PublicKey publicKey = keyPairGenerateRSAKeyPair.getPublic();
            Intrinsics.checkNotNull(publicKey, "null cannot be cast to non-null type java.security.interfaces.RSAPublicKey");
            PrivateKey privateKey = keyPairGenerateRSAKeyPair.getPrivate();
            Intrinsics.checkNotNull(privateKey, "null cannot be cast to non-null type java.security.interfaces.RSAPrivateKey");
            this.f29344b = (RSAPrivateKey) privateKey;
            String modulus = ((RSAPublicKey) publicKey).getModulus().toString(16);
            Intrinsics.checkNotNullExpressionValue(modulus, "modulus");
            return new CipherResult.Success(modulus);
        } catch (PinCipherException e5) {
            a("generate_key_pair", e5);
            return new CipherResult.Error(e5);
        }
    }

    public static /* synthetic */ CipherResult encrypt$default(PinCipher pinCipher, String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return pinCipher.encrypt(str, str2, str3, z10);
    }

    @NotNull
    public final CipherResult<String> encrypt(@NotNull String data, @NotNull String modulus, @Size(SvgConstantsKt.SPECIFIED_FILL_RULE) @NotNull String keyIndex, boolean isHexEncoded) {
        byte[] bArrHexStringToByteArray$default;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(modulus, "modulus");
        Intrinsics.checkNotNullParameter(keyIndex, "keyIndex");
        if (StringKt.isEncryptDataInvalid(data, isHexEncoded)) {
            return new CipherResult.Error(new PinCipherException(null, ERROR_INVALID_BLOCK_SIZE, "Invalid data length to encrypt."));
        }
        try {
            if (isHexEncoded) {
                bArrHexStringToByteArray$default = com.bbva.ethermobilesdk.cipher.utils.EncodingUtilsKt.hexStringToByteArray$default(data, null, 1, null);
            } else {
                byte[] bytes = data.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                bArrHexStringToByteArray$default = com.bbva.ethermobilesdk.cipher.utils.EncodingUtilsKt.hexStringToByteArray$default(com.bbva.ethermobilesdk.cipher.utils.EncodingUtilsKt.toHex$default(bytes, null, 1, null), null, 1, null);
            }
            CryptoUtils cryptoUtils = CryptoUtils.INSTANCE;
            RSAPublicKey rSAPublicKeyGenerateRSAPublicKey = cryptoUtils.generateRSAPublicKey(modulus);
            SecretKey secretKeyGenerateRandomKeyDESEDE = cryptoUtils.generateRandomKeyDESEDE();
            String hex$default = com.bbva.ethermobilesdk.cipher.utils.EncodingUtilsKt.toHex$default(CryptoUtils.rsaEncrypt$default(cryptoUtils, cryptoUtils.encrypt(secretKeyGenerateRandomKeyDESEDE, bArrHexStringToByteArray$default), rSAPublicKeyGenerateRSAPublicKey, null, 4, null), null, 1, null);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(secretKeyGenerateRandomKeyDESEDE.getEncoded(), 0, 16);
            Intrinsics.checkNotNullExpressionValue(bArrCopyOfRange, "copyOfRange(secretKey.encoded, INIT_KEY, END_KEY)");
            return new CipherResult.Success(keyIndex + "01" + com.bbva.ethermobilesdk.cipher.utils.EncodingUtilsKt.toHex$default(CryptoUtils.rsaEncrypt$default(cryptoUtils, bArrCopyOfRange, rSAPublicKeyGenerateRSAPublicKey, null, 4, null), null, 1, null) + hex$default);
        } catch (PinCipherException e5) {
            a("encrypt", e5);
            return new CipherResult.Error(new PinCipherException(e5, e5.getF29329p0(), e5.getF29330q0()));
        }
    }
}
