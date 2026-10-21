package com.bbva.glomo.localstorage;

import android.content.Context;
import android.security.KeyPairGeneratorSpec;
import androidx.camera.core.processing.f;
import com.bbva.ethermobilesdk.cipher.keystore.provider.KeyStoreProvider;
import com.bbva.google.pay.GoogleTapAndPay;
import com.bbva.localstorage.storage.Cipher;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateException;
import java.util.Calendar;
import java.util.Date;
import javax.security.auth.x500.X500Principal;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LocalStorageCipherImplV21.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \f2\u00060\u0001j\u0002`\u0002:\u0001\fB\u0019\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006\r"}, d2 = {"Lcom/bbva/glomo/localstorage/LocalStorageCipherImplV21;", "Lcom/bbva/localstorage/storage/Cipher;", "Lcom/bbva/glomo/localstorage/StorageCipher;", "", "text", "decrypt", "encrypt", "Landroid/content/Context;", "context", GoogleTapAndPay.KEY_ALIAS, "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "Companion", "gl-local-storage_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLocalStorageCipherImplV21.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalStorageCipherImplV21.kt\ncom/bbva/glomo/localstorage/LocalStorageCipherImplV21\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,82:1\n1#2:83\n*E\n"})
public final class LocalStorageCipherImplV21 implements Cipher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f30675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f30676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lazy f30677c;

    /* JADX INFO: compiled from: LocalStorageCipherImplV21.kt */
    public static final class a extends Lambda implements Function0<javax.crypto.Cipher> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final javax.crypto.Cipher invoke() {
            return LocalStorageCipherImplV21.access$generateCipher(LocalStorageCipherImplV21.this);
        }
    }

    /* JADX INFO: compiled from: LocalStorageCipherImplV21.kt */
    @SourceDebugExtension({"SMAP\nLocalStorageCipherImplV21.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalStorageCipherImplV21.kt\ncom/bbva/glomo/localstorage/LocalStorageCipherImplV21$decrypt$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,82:1\n1#2:83\n*E\n"})
    public static final class b extends Lambda implements Function1<String, String> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(String str) {
            Object objM5535constructorimpl;
            Object objM5535constructorimpl2;
            String it = str;
            Intrinsics.checkNotNullParameter(it, "it");
            LocalStorageCipherImplV21 localStorageCipherImplV21 = LocalStorageCipherImplV21.this;
            try {
                Result.Companion companion = Result.INSTANCE;
                objM5535constructorimpl = Result.m5535constructorimpl(LocalStorageCipherImplV21.access$decryptCypher(localStorageCipherImplV21).doFinal(CryptoExtensionsKt.fromBase64$default(it, 0, 1, null)));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m5541isSuccessimpl(objM5535constructorimpl)) {
                byte[] bArr = (byte[]) objM5535constructorimpl;
                Intrinsics.checkNotNull(bArr);
                objM5535constructorimpl2 = Result.m5535constructorimpl(new String(bArr, Charsets.UTF_8));
            } else {
                objM5535constructorimpl2 = Result.m5535constructorimpl(objM5535constructorimpl);
            }
            Throwable thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl2);
            if (thM5538exceptionOrNullimpl != null) {
                thM5538exceptionOrNullimpl.printStackTrace();
            }
            return (String) (Result.m5540isFailureimpl(objM5535constructorimpl2) ? null : objM5535constructorimpl2);
        }
    }

    /* JADX INFO: compiled from: LocalStorageCipherImplV21.kt */
    @SourceDebugExtension({"SMAP\nLocalStorageCipherImplV21.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalStorageCipherImplV21.kt\ncom/bbva/glomo/localstorage/LocalStorageCipherImplV21$encrypt$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,82:1\n1#2:83\n*E\n"})
    public static final class c extends Lambda implements Function1<String, String> {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(String str) {
            Object objM5535constructorimpl;
            String it = str;
            Intrinsics.checkNotNullParameter(it, "it");
            LocalStorageCipherImplV21 localStorageCipherImplV21 = LocalStorageCipherImplV21.this;
            try {
                Result.Companion companion = Result.INSTANCE;
                javax.crypto.Cipher cipherAccess$encryptCipher = LocalStorageCipherImplV21.access$encryptCipher(localStorageCipherImplV21);
                byte[] bytes = it.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                objM5535constructorimpl = Result.m5535constructorimpl(cipherAccess$encryptCipher.doFinal(bytes));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m5541isSuccessimpl(objM5535constructorimpl)) {
                byte[] bArr = (byte[]) objM5535constructorimpl;
                Intrinsics.checkNotNull(bArr);
                objM5535constructorimpl = CryptoExtensionsKt.toBase64$default(bArr, 0, 1, null);
            }
            Object objM5535constructorimpl2 = Result.m5535constructorimpl(objM5535constructorimpl);
            Throwable thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl2);
            if (thM5538exceptionOrNullimpl != null) {
                thM5538exceptionOrNullimpl.printStackTrace();
            }
            return (String) (Result.m5540isFailureimpl(objM5535constructorimpl2) ? null : objM5535constructorimpl2);
        }
    }

    public LocalStorageCipherImplV21(@NotNull Context context, @NotNull String alias) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(alias, "alias");
        this.f30675a = context;
        this.f30676b = alias;
        this.f30677c = LazyKt__LazyJVMKt.lazy(new a());
    }

    public static final javax.crypto.Cipher access$decryptCypher(LocalStorageCipherImplV21 localStorageCipherImplV21) throws InvalidKeyException {
        Object value = localStorageCipherImplV21.f30677c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        javax.crypto.Cipher cipher = (javax.crypto.Cipher) value;
        cipher.init(2, localStorageCipherImplV21.a().getPrivateKey());
        return cipher;
    }

    public static final javax.crypto.Cipher access$encryptCipher(LocalStorageCipherImplV21 localStorageCipherImplV21) throws InvalidKeyException {
        Object value = localStorageCipherImplV21.f30677c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        javax.crypto.Cipher cipher = (javax.crypto.Cipher) value;
        cipher.init(1, localStorageCipherImplV21.a().getCertificate().getPublicKey());
        return cipher;
    }

    public static final javax.crypto.Cipher access$generateCipher(LocalStorageCipherImplV21 localStorageCipherImplV21) {
        localStorageCipherImplV21.getClass();
        return javax.crypto.Cipher.getInstance("RSA/ECB/PKCS1Padding", "AndroidOpenSSL");
    }

    public final KeyStore.PrivateKeyEntry a() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException, UnrecoverableEntryException {
        KeyStore keyStore = KeyStore.getInstance(KeyStoreProvider.ANDROID_KEYSTORE);
        keyStore.load(null);
        String str = this.f30676b;
        if (!keyStore.containsAlias(str)) {
            Date time = Calendar.getInstance().getTime();
            Calendar calendar = Calendar.getInstance();
            calendar.add(1, 20);
            KeyPairGeneratorSpec keyPairGeneratorSpecBuild = new KeyPairGeneratorSpec.Builder(this.f30675a).setAlias(str).setSubject(new X500Principal(f.d("CN=", str))).setSerialNumber(BigInteger.ONE).setStartDate(time).setEndDate(calendar.getTime()).build();
            Intrinsics.checkNotNullExpressionValue(keyPairGeneratorSpecBuild, "build(...)");
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", KeyStoreProvider.ANDROID_KEYSTORE);
            keyPairGenerator.initialize(keyPairGeneratorSpecBuild);
            keyPairGenerator.generateKeyPair();
        }
        KeyStore.Entry entry = keyStore.getEntry(str, null);
        Intrinsics.checkNotNull(entry, "null cannot be cast to non-null type java.security.KeyStore.PrivateKeyEntry");
        return (KeyStore.PrivateKeyEntry) entry;
    }

    @Override // com.bbva.localstorage.storage.Cipher
    @Nullable
    public String decrypt(@Nullable String text) {
        return CryptoExtensionsKt.applyCipher(this, text, new b());
    }

    @Override // com.bbva.localstorage.storage.Cipher
    @Nullable
    public String encrypt(@Nullable String text) {
        return CryptoExtensionsKt.applyCipher(this, text, new c());
    }

    public /* synthetic */ LocalStorageCipherImplV21(Context context, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? "glomo" : str);
    }
}
