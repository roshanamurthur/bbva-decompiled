package com.bbva.ethermobilesdk.securesharing.cipher;

import android.content.Context;
import androidx.datastore.preferences.protobuf.q;
import com.bbva.ethermobile.help.kit.result.ResultKt;
import com.bbva.ethermobilesdk.cipher.factory.HashFactoryKt;
import com.bbva.ethermobilesdk.cipher.model.CipherResultKt;
import com.bbva.ethermobilesdk.cipher.softcipher.SoftCipher;
import com.bbva.ethermobilesdk.cipher.utils.EncodingUtilsKt;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.securesharing.extension.ExceptionKt;
import com.bbva.ethermobilesdk.securesharing.extension.LoggerKt;
import javax.crypto.spec.SecretKeySpec;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Cipher.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\n"}, d2 = {"Lcom/bbva/ethermobilesdk/securesharing/cipher/Cipher;", "", "", "value", "encrypt", "decrypt", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "securesharing_release"}, k = 1, mv = {1, 5, 1})
public final class Cipher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SoftCipher f29942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f29943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lazy f29944c;

    /* JADX INFO: compiled from: Cipher.kt */
    public static final class a extends Lambda implements Function0<byte[]> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f29945p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final byte[] invoke() {
            return EncodingUtilsKt.hexStringToByteArray$default("064A3B97FE123A5FD224CDEE3B1EE038", null, 1, null);
        }
    }

    /* JADX INFO: compiled from: Cipher.kt */
    public static final class b extends Lambda implements Function0<SecretKeySpec> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Context f29946p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context) {
            super(0);
            this.f29946p0 = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final SecretKeySpec invoke() {
            byte[] bArr = (byte[]) ResultKt.getOrNull(HashFactoryKt.sha256Of(this.f29946p0.getPackageManager().getPackageInfo("android", 0).firstInstallTime));
            if (bArr != null) {
                return new SecretKeySpec(bArr, "AES");
            }
            throw q.d("Error generating hash", null, 2, null);
        }
    }

    public Cipher(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f29942a = new SoftCipher();
        this.f29943b = LazyKt__LazyJVMKt.lazy(new b(context));
        this.f29944c = LazyKt__LazyJVMKt.lazy(a.f29945p0);
    }

    @NotNull
    public final String decrypt(@NotNull String value) throws Exception {
        Intrinsics.checkNotNullParameter(value, "value");
        LoggerKt.log("Decrypting value...");
        try {
            return new String((byte[]) CipherResultKt.getOrThrow(this.f29942a.decrypt(EncodingUtilsKt.base64ToByteArray(l.replace$default(value, RootService.LINE_BREAK, "", false, 4, (Object) null)), (SecretKeySpec) this.f29943b.getValue(), "AES/CBC/PKCS5Padding", (byte[]) this.f29944c.getValue())), Charsets.UTF_8);
        } catch (Exception e5) {
            ExceptionKt.throwError("An error has been thrown while trying to decrypt a value", e5);
            throw new KotlinNothingValueException();
        }
    }

    @NotNull
    public final String encrypt(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        LoggerKt.log("Encrypting value...");
        try {
            byte[] bytes = value.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            return EncodingUtilsKt.toBase64((byte[]) CipherResultKt.getOrThrow(this.f29942a.encrypt(bytes, (SecretKeySpec) this.f29943b.getValue(), "AES/CBC/PKCS5Padding", (byte[]) this.f29944c.getValue())));
        } catch (Exception e5) {
            ExceptionKt.throwError("An error has been thrown while trying to encrypt a value", e5);
            throw new KotlinNothingValueException();
        }
    }
}
