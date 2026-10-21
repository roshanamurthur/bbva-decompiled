package com.bbva.ethermobilesdk.tokencompat.storage.local;

import android.content.Context;
import androidx.camera.camera2.internal.compat.u;
import com.bbva.ethermobilesdk.cipher.utils.EncodingUtilsKt;
import com.bbva.ethermobilesdk.token.constant.ConstantKt;
import com.bbva.ethermobilesdk.tokencompat.TokenCompatError;
import com.bbva.ethermobilesdk.tokencompat.extension.ContextKt;
import com.bbva.ethermobilesdk.tokencompat.extension.ThrowableKt;
import com.nulabinc.zxcvbn.Guess;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SharedPrefsStorage.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¨\u0006\u0004"}, d2 = {"Landroid/content/Context;", "context", "", "generateSuperSecretKey", "ethertoken-compat_release"}, k = 2, mv = {1, 8, 0})
public final class SharedPrefsStorageKt {
    public static SecretKey a(char[] cArr, byte[] bArr, String str) throws InvalidKeySpecException, NoSuchAlgorithmException, NoSuchProviderException {
        SecretKey secretKeyGenerateSecret = SecretKeyFactory.getInstance(str, BouncyCastleProvider.PROVIDER_NAME).generateSecret(new PBEKeySpec(cArr, bArr, Guess.REFERENCE_YEAR, 256));
        Intrinsics.checkNotNullExpressionValue(secretKeyGenerateSecret, "getInstance(algorithm, \"…eSecret(pbeKeySpec)\n    }");
        return secretKeyGenerateSecret;
    }

    public static final String access$decrypt(String str, byte[] bArr) {
        Object objM5535constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(2, new SecretKeySpec(bArr, "AES"));
            byte[] bArrDoFinal = cipher.doFinal(EncodingUtilsKt.base64ToByteArray(str));
            Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "doFinal(dataEncrypted.base64ToByteArray())");
            objM5535constructorimpl = Result.m5535constructorimpl(EncodingUtilsKt.toSimpleString(bArrDoFinal));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        ResultKt.throwOnFailure(objM5535constructorimpl);
        return (String) objM5535constructorimpl;
    }

    public static final String access$deriveFromSecretKey(Context context, String str) throws InvalidKeySpecException, NoSuchAlgorithmException, NoSuchProviderException {
        Object objM5535constructorimpl;
        String packageName = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
        char[] charArray = packageName.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "this as java.lang.String).toCharArray()");
        if (charArray.length == 0) {
            ThrowableKt.throwError$default(new TokenCompatError.PackageNameEmpty(0, null, null, 7, null), null, 2, null);
            throw new KotlinNothingValueException();
        }
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(a(charArray, bytes, ConstantKt.PWD_KEYFACTORY_ALGORITHM));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5538exceptionOrNullimpl(objM5535constructorimpl) != null) {
            objM5535constructorimpl = a(charArray, bytes, "PBEWithMD5AndDES");
        }
        byte[] encoded = ((SecretKey) objM5535constructorimpl).getEncoded();
        Intrinsics.checkNotNullExpressionValue(encoded, "encoded");
        return EncodingUtilsKt.toBase64(encoded);
    }

    public static final String access$encrypt(String str, byte[] bArr) {
        Object objM5535constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(1, new SecretKeySpec(bArr, "AES"));
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            byte[] bArrDoFinal = cipher.doFinal(bytes);
            Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "doFinal(data.toByteArray())");
            objM5535constructorimpl = Result.m5535constructorimpl(EncodingUtilsKt.toBase64(bArrDoFinal));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        ResultKt.throwOnFailure(objM5535constructorimpl);
        return (String) objM5535constructorimpl;
    }

    @NotNull
    public static final String generateSuperSecretKey(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String strAndroidId = ContextKt.androidId(context);
        String string = Long.toString(ContextKt.firstInstallTime(context), CharsKt.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(string, "toString(this, checkRadix(radix))");
        return u.f(strAndroidId, string);
    }
}
