package com.veridas.lib.encryption;

import com.bbva.ethermobilesdk.token.constant.ConstantKt;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.ComputeCcCommandApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GetProcessingOptionsCommandApdu;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ResourcesCipher.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0019\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007J\u0016\u0010\u0005\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007¨\u0006\u0010"}, d2 = {"Lcom/veridas/lib/encryption/ResourcesCipher;", "", "", "input", "encrypt", "decrypt", "Ljava/io/InputStream;", "Ljava/io/OutputStream;", "outputStream", "", "", "password", "salt", "<init>", "(Ljava/lang/String;[B)V", "Companion", "common-core-jvm"}, k = 1, mv = {1, 9, 0})
public final class ResourcesCipher {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final byte[] f67142f = {Constants.CVR_B1b85_0101_MOBILE_APP, -23, -79, -35, 48, -117, 15, -102, -90, 102, 15, ComputeCcCommandApdu.EXPECTED_P1, -59, 56, -94, -24};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final byte[] f67143g = {70, -109, 55, -68, -84, 12, -60, 87, -123, GetProcessingOptionsCommandApdu.COMMAND_TEMPLATE_TAG, -123, 86, -93, -26, -123, -26};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f67144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final byte[] f67145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lazy f67146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Lazy f67147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Lazy f67148e;

    /* JADX INFO: compiled from: ResourcesCipher.kt */
    public static final class a extends Lambda implements Function0<Cipher> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Cipher invoke() throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, ResourcesCipher.access$getDerivedSecretKeySpec(ResourcesCipher.this), new IvParameterSpec(ResourcesCipher.f67143g));
            return cipher;
        }
    }

    /* JADX INFO: compiled from: ResourcesCipher.kt */
    public static final class b extends Lambda implements Function0<SecretKeySpec> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final SecretKeySpec invoke() throws NoSuchAlgorithmException {
            SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(ConstantKt.PWD_KEYFACTORY_ALGORITHM);
            ResourcesCipher resourcesCipher = ResourcesCipher.this;
            char[] charArray = resourcesCipher.f67144a.toCharArray();
            Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
            return new SecretKeySpec(secretKeyFactory.generateSecret(new PBEKeySpec(charArray, resourcesCipher.f67145b, 100, 128)).getEncoded(), "AES");
        }
    }

    /* JADX INFO: compiled from: ResourcesCipher.kt */
    public static final class c extends Lambda implements Function0<Cipher> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Cipher invoke() throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(1, ResourcesCipher.access$getDerivedSecretKeySpec(ResourcesCipher.this), new IvParameterSpec(ResourcesCipher.f67143g));
            return cipher;
        }
    }

    public ResourcesCipher(@NotNull String password, @NotNull byte[] salt) {
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(salt, "salt");
        this.f67144a = password;
        this.f67145b = salt;
        this.f67146c = LazyKt__LazyJVMKt.lazy(new b());
        this.f67147d = LazyKt__LazyJVMKt.lazy(new c());
        this.f67148e = LazyKt__LazyJVMKt.lazy(new a());
    }

    public static final SecretKeySpec access$getDerivedSecretKeySpec(ResourcesCipher resourcesCipher) {
        return (SecretKeySpec) resourcesCipher.f67146c.getValue();
    }

    @NotNull
    public final byte[] decrypt(@NotNull byte[] input) throws BadPaddingException, IllegalBlockSizeException {
        Intrinsics.checkNotNullParameter(input, "input");
        byte[] bArrDoFinal = ((Cipher) this.f67148e.getValue()).doFinal(input);
        Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "doFinal(...)");
        return bArrDoFinal;
    }

    @NotNull
    public final byte[] encrypt(@NotNull byte[] input) throws BadPaddingException, IllegalBlockSizeException {
        Intrinsics.checkNotNullParameter(input, "input");
        byte[] bArrDoFinal = ((Cipher) this.f67147d.getValue()).doFinal(input);
        Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "doFinal(...)");
        return bArrDoFinal;
    }

    public final void decrypt(@NotNull InputStream input, @NotNull OutputStream outputStream) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        CipherInputStream cipherInputStream = new CipherInputStream(input, (Cipher) this.f67148e.getValue());
        try {
            outputStream.write(ByteStreamsKt.readBytes(cipherInputStream));
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(cipherInputStream, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(cipherInputStream, th2);
                throw th3;
            }
        }
    }

    public final void encrypt(@NotNull InputStream input, @NotNull OutputStream outputStream) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        CipherOutputStream cipherOutputStream = new CipherOutputStream(outputStream, (Cipher) this.f67147d.getValue());
        try {
            cipherOutputStream.write(ByteStreamsKt.readBytes(input));
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(cipherOutputStream, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(cipherOutputStream, th2);
                throw th3;
            }
        }
    }

    public /* synthetic */ ResourcesCipher(String str, byte[] bArr, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? f67142f : bArr);
    }
}
