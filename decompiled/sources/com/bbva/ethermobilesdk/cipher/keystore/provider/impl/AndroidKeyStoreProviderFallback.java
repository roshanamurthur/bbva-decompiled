package com.bbva.ethermobilesdk.cipher.keystore.provider.impl;

import android.content.Context;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import com.bbva.ethermobilesdk.cipher.keystore.exception.KeyStoreCipherException;
import com.bbva.ethermobilesdk.cipher.keystore.provider.KeyStoreProvider;
import com.bbva.ethermobilesdk.cipher.model.CipherResult;
import com.bbva.ethermobilesdk.cipher.softcipher.SoftCipher;
import com.bbva.ethermobilesdk.cipher.utils.EncodingUtilsKt;
import com.bbva.google.pay.GoogleTapAndPay;
import com.bbva.tohu.android.product.valkyria.sdk.logic.ReplenishLogic;
import javax.crypto.Cipher;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import kotlin.text.StringsKt___StringsKt;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AndroidKeyStoreProviderFallback.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0010¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0010¢\u0006\u0004\b\b\u0010\u0006J\u001a\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0016J\"\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0013"}, d2 = {"Lcom/bbva/ethermobilesdk/cipher/keystore/provider/impl/AndroidKeyStoreProviderFallback;", "Lcom/bbva/ethermobilesdk/cipher/keystore/provider/KeyStoreProvider;", "", "data", GoogleTapAndPay.KEY_ALIAS, "encrypt$cipher_release", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "encrypt", "decrypt$cipher_release", "decrypt", "Landroid/content/Context;", "context", "seed", "Ljavax/crypto/Cipher;", "toCipherForEncryption", "toCipherForDecryption", "<init>", "(Landroid/content/Context;)V", "Companion", "cipher_release"}, k = 1, mv = {1, 8, 0})
public final class AndroidKeyStoreProviderFallback extends KeyStoreProvider {

    @NotNull
    public static final String KP_FB = "com.bbva.ethermobilesdk.cipher.keystore.kp_fb";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Context f29336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final SoftCipher f29337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final IntRange f29335d = new IntRange(0, 127);

    public AndroidKeyStoreProviderFallback(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f29336b = context;
        this.f29337c = new SoftCipher();
    }

    public static String a(Context context) {
        Signature signature;
        if (Build.VERSION.SDK_INT >= 28) {
            SigningInfo signingInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 134217728).signingInfo;
            signature = signingInfo.hasMultipleSigners() ? signingInfo.getApkContentsSigners()[0] : signingInfo.getSigningCertificateHistory()[0];
        } else {
            signature = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures[0];
        }
        byte[] byteArray = signature.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "signature.toByteArray()");
        return StringsKt___StringsKt.slice(EncodingUtilsKt.toBase64(byteArray), f29335d);
    }

    @Override // com.bbva.ethermobilesdk.cipher.keystore.provider.KeyStoreProvider
    @NotNull
    public synchronized String decrypt$cipher_release(@NotNull String data, @Nullable String alias) throws KeyStoreCipherException {
        CipherResult<String> cipherResultDecrypt;
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            String strA = a(this.f29336b);
            cipherResultDecrypt = this.f29337c.decrypt(this.f29336b, l.replace$default(data, ReplenishLogic.ID_SEPARATOR, "|", false, 4, (Object) null), strA);
            if (!(cipherResultDecrypt instanceof CipherResult.Success)) {
                if (cipherResultDecrypt instanceof CipherResult.Error) {
                    throw new KeyStoreCipherException(((CipherResult.Error) cipherResultDecrypt).getException(), KeyStoreProvider.DECRYPTION_ERROR_CODE, KeyStoreProvider.DECRYPTION_ERROR_MESSAGE);
                }
                throw new NoWhenBranchMatchedException();
            }
        } catch (Exception e5) {
            throw new KeyStoreCipherException(e5, KeyStoreProvider.DECRYPTION_ERROR_CODE, KeyStoreProvider.DECRYPTION_ERROR_MESSAGE);
        }
        return (String) ((CipherResult.Success) cipherResultDecrypt).getValue();
    }

    @Override // com.bbva.ethermobilesdk.cipher.keystore.provider.KeyStoreProvider
    @NotNull
    public synchronized String encrypt$cipher_release(@NotNull String data, @Nullable String alias) throws KeyStoreCipherException {
        CipherResult<String> cipherResultEncrypt;
        byte[] bytes;
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            cipherResultEncrypt = this.f29337c.encrypt(this.f29336b, data, a(this.f29336b));
            if (!(cipherResultEncrypt instanceof CipherResult.Success)) {
                if (cipherResultEncrypt instanceof CipherResult.Error) {
                    throw new KeyStoreCipherException(((CipherResult.Error) cipherResultEncrypt).getException(), KeyStoreProvider.ENCRYPTION_ERROR_CODE, KeyStoreProvider.ENCRYPTION_ERROR_MESSAGE);
                }
                throw new NoWhenBranchMatchedException();
            }
            bytes = KP_FB.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        } catch (Exception e5) {
            throw new KeyStoreCipherException(e5, KeyStoreProvider.ENCRYPTION_ERROR_CODE, KeyStoreProvider.ENCRYPTION_ERROR_MESSAGE);
        }
        return EncodingUtilsKt.toBase64(bytes) + "|" + l.replace$default((String) ((CipherResult.Success) cipherResultEncrypt).getValue(), "|", ReplenishLogic.ID_SEPARATOR, false, 4, (Object) null);
    }

    @Override // com.bbva.ethermobilesdk.cipher.PlatformCipherProvider
    @NotNull
    public Cipher toCipherForDecryption(@NotNull Context context, @NotNull String data, @Nullable String seed) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        return this.f29337c.toCipherForDecryption(context, data, seed);
    }

    @Override // com.bbva.ethermobilesdk.cipher.PlatformCipherProvider
    @NotNull
    public Cipher toCipherForEncryption(@NotNull Context context, @Nullable String seed) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f29337c.toCipherForEncryption(context, seed);
    }
}
