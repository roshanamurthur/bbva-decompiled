package com.bbva.glomo.localstorage;

import android.annotation.TargetApi;
import android.security.keystore.KeyGenParameterSpec;
import com.bbva.ethermobilesdk.cipher.keystore.provider.KeyStoreProvider;
import com.bbva.google.pay.GoogleTapAndPay;
import com.bbva.localstorage.storage.Cipher;
import com.google.android.gms.stats.CodePackage;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.cert.CertificateException;
import java.util.List;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LocalStorageCipherImplV23.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u0000 \n2\u00060\u0001j\u0002`\u0002:\u0001\nB\u0011\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomo/localstorage/LocalStorageCipherImplV23;", "Lcom/bbva/localstorage/storage/Cipher;", "Lcom/bbva/glomo/localstorage/StorageCipher;", "", "text", "decrypt", "encrypt", GoogleTapAndPay.KEY_ALIAS, "<init>", "(Ljava/lang/String;)V", "Companion", "gl-local-storage_release"}, k = 1, mv = {1, 9, 0})
@TargetApi(23)
@SourceDebugExtension({"SMAP\nLocalStorageCipherImplV23.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalStorageCipherImplV23.kt\ncom/bbva/glomo/localstorage/LocalStorageCipherImplV23\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,87:1\n1#2:88\n*E\n"})
public final class LocalStorageCipherImplV23 implements Cipher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f30681a;

    /* JADX INFO: compiled from: LocalStorageCipherImplV23.kt */
    @SourceDebugExtension({"SMAP\nLocalStorageCipherImplV23.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalStorageCipherImplV23.kt\ncom/bbva/glomo/localstorage/LocalStorageCipherImplV23$decrypt$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,87:1\n1#2:88\n*E\n"})
    public static final class a extends Lambda implements Function1<String, String> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(String str) {
            Object objM5535constructorimpl;
            Object objM5535constructorimpl2;
            String value = str;
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                Result.Companion companion = Result.INSTANCE;
                objM5535constructorimpl = Result.m5535constructorimpl(StringsKt__StringsKt.split$default((CharSequence) value, new String[]{"#"}, false, 0, 6, (Object) null));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
            }
            LocalStorageCipherImplV23 localStorageCipherImplV23 = LocalStorageCipherImplV23.this;
            if (Result.m5541isSuccessimpl(objM5535constructorimpl)) {
                try {
                    List list = (List) objM5535constructorimpl;
                    byte[] bArrDoFinal = LocalStorageCipherImplV23.access$decryptCipher(localStorageCipherImplV23, new IvParameterSpec(CryptoExtensionsKt.fromBase64$default((String) CollectionsKt___CollectionsKt.last(list), 0, 1, null))).doFinal(CryptoExtensionsKt.fromBase64$default((String) CollectionsKt___CollectionsKt.first(list), 0, 1, null));
                    Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "doFinal(...)");
                    objM5535constructorimpl2 = Result.m5535constructorimpl(new String(bArrDoFinal, Charsets.UTF_8));
                } catch (Throwable th3) {
                    Result.Companion companion3 = Result.INSTANCE;
                    objM5535constructorimpl2 = Result.m5535constructorimpl(ResultKt.createFailure(th3));
                }
            } else {
                objM5535constructorimpl2 = Result.m5535constructorimpl(objM5535constructorimpl);
            }
            return (String) (Result.m5540isFailureimpl(objM5535constructorimpl2) ? null : objM5535constructorimpl2);
        }
    }

    /* JADX INFO: compiled from: LocalStorageCipherImplV23.kt */
    @SourceDebugExtension({"SMAP\nLocalStorageCipherImplV23.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalStorageCipherImplV23.kt\ncom/bbva/glomo/localstorage/LocalStorageCipherImplV23$encrypt$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,87:1\n1#2:88\n*E\n"})
    public static final class b extends Lambda implements Function1<String, String> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(String str) {
            Object objM5535constructorimpl;
            Object objM5535constructorimpl2;
            String content = str;
            Intrinsics.checkNotNullParameter(content, "content");
            LocalStorageCipherImplV23 localStorageCipherImplV23 = LocalStorageCipherImplV23.this;
            try {
                Result.Companion companion = Result.INSTANCE;
                objM5535constructorimpl = Result.m5535constructorimpl(LocalStorageCipherImplV23.access$encryptCipher(localStorageCipherImplV23));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m5541isSuccessimpl(objM5535constructorimpl)) {
                try {
                    javax.crypto.Cipher cipher = (javax.crypto.Cipher) objM5535constructorimpl;
                    byte[] bytes = content.getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                    byte[] bArrDoFinal = cipher.doFinal(bytes);
                    Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "doFinal(...)");
                    String base64$default = CryptoExtensionsKt.toBase64$default(bArrDoFinal, 0, 1, null);
                    byte[] iv = cipher.getIV();
                    Intrinsics.checkNotNullExpressionValue(iv, "getIV(...)");
                    objM5535constructorimpl2 = Result.m5535constructorimpl(base64$default + "#" + CryptoExtensionsKt.toBase64$default(iv, 0, 1, null));
                } catch (Throwable th3) {
                    Result.Companion companion3 = Result.INSTANCE;
                    objM5535constructorimpl2 = Result.m5535constructorimpl(ResultKt.createFailure(th3));
                }
            } else {
                objM5535constructorimpl2 = Result.m5535constructorimpl(objM5535constructorimpl);
            }
            return (String) (Result.m5540isFailureimpl(objM5535constructorimpl2) ? null : objM5535constructorimpl2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LocalStorageCipherImplV23() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static final javax.crypto.Cipher access$decryptCipher(LocalStorageCipherImplV23 localStorageCipherImplV23, IvParameterSpec ivParameterSpec) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        localStorageCipherImplV23.getClass();
        javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(2, localStorageCipherImplV23.a(), ivParameterSpec);
        Intrinsics.checkNotNullExpressionValue(cipher, "apply(...)");
        return cipher;
    }

    public static final javax.crypto.Cipher access$encryptCipher(LocalStorageCipherImplV23 localStorageCipherImplV23) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        localStorageCipherImplV23.getClass();
        javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, localStorageCipherImplV23.a());
        Intrinsics.checkNotNullExpressionValue(cipher, "apply(...)");
        return cipher;
    }

    public final Key a() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        SecretKey secretKeyM5535constructorimpl;
        KeyStore keyStore = KeyStore.getInstance(KeyStoreProvider.ANDROID_KEYSTORE);
        keyStore.load(null);
        try {
            Result.Companion companion = Result.INSTANCE;
            KeyStore.Entry entry = keyStore.getEntry(this.f30681a, null);
            secretKeyM5535constructorimpl = Result.m5535constructorimpl(entry instanceof KeyStore.SecretKeyEntry ? (KeyStore.SecretKeyEntry) entry : null);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            secretKeyM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5541isSuccessimpl(secretKeyM5535constructorimpl)) {
            KeyStore.SecretKeyEntry secretKeyEntry = (KeyStore.SecretKeyEntry) secretKeyM5535constructorimpl;
            SecretKey secretKey = secretKeyEntry != null ? secretKeyEntry.getSecretKey() : null;
            if (secretKey == null) {
                secretKeyM5535constructorimpl = b();
            } else {
                Intrinsics.checkNotNull(secretKey);
                secretKeyM5535constructorimpl = secretKey;
            }
        }
        Object objM5535constructorimpl = Result.m5535constructorimpl(secretKeyM5535constructorimpl);
        if (Result.m5538exceptionOrNullimpl(objM5535constructorimpl) != null) {
            objM5535constructorimpl = b();
        }
        return (Key) objM5535constructorimpl;
    }

    public final Key b() throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", KeyStoreProvider.ANDROID_KEYSTORE);
        KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder(this.f30681a, 3).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").setRandomizedEncryptionRequired(true).build();
        Intrinsics.checkNotNullExpressionValue(keyGenParameterSpecBuild, "build(...)");
        keyGenerator.init(keyGenParameterSpecBuild);
        SecretKey secretKeyGenerateKey = keyGenerator.generateKey();
        Intrinsics.checkNotNullExpressionValue(secretKeyGenerateKey, "generateKey(...)");
        return secretKeyGenerateKey;
    }

    @Override // com.bbva.localstorage.storage.Cipher
    @Nullable
    public String decrypt(@Nullable String text) {
        return CryptoExtensionsKt.applyCipher(this, text, new a());
    }

    @Override // com.bbva.localstorage.storage.Cipher
    @Nullable
    public String encrypt(@Nullable String text) {
        return CryptoExtensionsKt.applyCipher(this, text, new b());
    }

    public LocalStorageCipherImplV23(@NotNull String alias) {
        Intrinsics.checkNotNullParameter(alias, "alias");
        this.f30681a = alias;
    }

    public /* synthetic */ LocalStorageCipherImplV23(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "glomo" : str);
    }
}
