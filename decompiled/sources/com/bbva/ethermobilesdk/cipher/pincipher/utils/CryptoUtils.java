package com.bbva.ethermobilesdk.cipher.pincipher.utils;

import androidx.annotation.Size;
import androidx.camera.camera2.internal.compat.u;
import com.bbva.ethermobilesdk.cipher.model.CipherResult;
import com.bbva.ethermobilesdk.cipher.pincipher.PinCipher;
import com.bbva.ethermobilesdk.cipher.pincipher.exception.PinCipherException;
import com.bbva.ethermobilesdk.cipher.softcipher.SoftCipher;
import com.bbva.ethermobilesdk.cipher.token.exception.TokenException;
import com.bbva.ethermobilesdk.cipher.token.generator.impl.RSAKeyGeneratorImpl;
import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAKeyGenParameterSpec;
import java.util.Properties;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CryptoUtils.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001f\u0010 J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J \u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u0004J \u0010\u0010\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u0004J\u0010\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\u0011\u001a\u00020\bJ\u0006\u0010\u0014\u001a\u00020\u0012J\u0016\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\bJ\u0016\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\bJ \u0010\u001e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c¨\u0006!"}, d2 = {"Lcom/bbva/ethermobilesdk/cipher/pincipher/utils/CryptoUtils;", "", "Ljava/security/KeyPair;", "generateRSAKeyPair", "", "modulus", "Ljava/security/interfaces/RSAPublicKey;", "generateRSAPublicKey", "", "encryptedData", "Ljava/security/interfaces/RSAPrivateKey;", "rsaPrivateKey", "transformation", "rsaDecrypt", "data", "rsaPublicKey", "rsaEncrypt", "key", "Ljavax/crypto/SecretKey;", "generateKeyDESEDE", "generateRandomKeyDESEDE", "secretKey", "unencryptedBytes", "encrypt", "encryptedBytes", "decrypt", "generalTag", "customTag", "Ljava/util/Properties;", "prop", "getContentFromTag", "<init>", "()V", "cipher_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCryptoUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CryptoUtils.kt\ncom/bbva/ethermobilesdk/cipher/pincipher/utils/CryptoUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,214:1\n1#2:215\n*E\n"})
public final class CryptoUtils {

    @NotNull
    public static final CryptoUtils INSTANCE = new CryptoUtils();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final byte[] f29356a = {0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final BigInteger f29357b = RSAKeyGenParameterSpec.F4;

    /* JADX INFO: compiled from: CryptoUtils.kt */
    public static final class a extends Lambda implements Function0<CipherResult<byte[]>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ byte[] f29358p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ SecretKey f29359q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(byte[] bArr, SecretKey secretKey) {
            super(0);
            this.f29358p0 = bArr;
            this.f29359q0 = secretKey;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CipherResult<byte[]> invoke() {
            return new SoftCipher().decrypt(this.f29358p0, this.f29359q0, "DESede/CBC/NoPadding", CryptoUtils.f29356a);
        }
    }

    /* JADX INFO: compiled from: CryptoUtils.kt */
    public static final class b extends Lambda implements Function0<PinCipherException> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f29360p0 = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final PinCipherException invoke() {
            return new PinCipherException(null, "ERROR_DECRYPTING", "Error decrypting data.");
        }
    }

    /* JADX INFO: compiled from: CryptoUtils.kt */
    public static final class c extends Lambda implements Function0<CipherResult<byte[]>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ byte[] f29361p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ SecretKey f29362q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(byte[] bArr, SecretKey secretKey) {
            super(0);
            this.f29361p0 = bArr;
            this.f29362q0 = secretKey;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CipherResult<byte[]> invoke() {
            return new SoftCipher().encrypt(this.f29361p0, this.f29362q0, "DESede/CBC/NoPadding", CryptoUtils.f29356a);
        }
    }

    /* JADX INFO: compiled from: CryptoUtils.kt */
    public static final class d extends Lambda implements Function0<PinCipherException> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final d f29363p0 = new d(0);

        @Override // kotlin.jvm.functions.Function0
        public final PinCipherException invoke() {
            return new PinCipherException(null, "ERROR_ENCRYPTING", "Error encrypting data.");
        }
    }

    /* JADX INFO: compiled from: CryptoUtils.kt */
    public static final class e extends Lambda implements Function0<PinCipherException> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function0<PinCipherException> f29364p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function0<PinCipherException> function0) {
            super(0);
            this.f29364p0 = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final PinCipherException invoke() {
            return this.f29364p0.invoke();
        }
    }

    /* JADX INFO: compiled from: CryptoUtils.kt */
    public static final class f extends Lambda implements Function0<Throwable> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ CipherResult<byte[]> f29365p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(CipherResult<byte[]> cipherResult) {
            super(0);
            this.f29365p0 = cipherResult;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Throwable invoke() {
            return ((CipherResult.Error) this.f29365p0).getException();
        }
    }

    /* JADX INFO: compiled from: CryptoUtils.kt */
    public static final class g extends Lambda implements Function0<CipherResult<byte[]>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ byte[] f29366p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ RSAPrivateKey f29367q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ String f29368r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(byte[] bArr, RSAPrivateKey rSAPrivateKey, String str) {
            super(0);
            this.f29366p0 = bArr;
            this.f29367q0 = rSAPrivateKey;
            this.f29368r0 = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CipherResult<byte[]> invoke() {
            return new SoftCipher().decrypt(this.f29366p0, this.f29367q0, this.f29368r0);
        }
    }

    /* JADX INFO: compiled from: CryptoUtils.kt */
    public static final class h extends Lambda implements Function0<PinCipherException> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final h f29369p0 = new h(0);

        @Override // kotlin.jvm.functions.Function0
        public final PinCipherException invoke() {
            return new PinCipherException(null, "ERROR_DECRYPTING_RSA_DATA", "Error decrypting RSA data.");
        }
    }

    /* JADX INFO: compiled from: CryptoUtils.kt */
    public static final class i extends Lambda implements Function0<CipherResult<byte[]>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ byte[] f29370p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ RSAPublicKey f29371q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ String f29372r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(byte[] bArr, RSAPublicKey rSAPublicKey, String str) {
            super(0);
            this.f29370p0 = bArr;
            this.f29371q0 = rSAPublicKey;
            this.f29372r0 = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CipherResult<byte[]> invoke() {
            return new SoftCipher().encrypt(this.f29370p0, this.f29371q0, this.f29372r0);
        }
    }

    /* JADX INFO: compiled from: CryptoUtils.kt */
    public static final class j extends Lambda implements Function0<PinCipherException> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final j f29373p0 = new j(0);

        @Override // kotlin.jvm.functions.Function0
        public final PinCipherException invoke() {
            return new PinCipherException(null, "ERROR_ENCRYPTING_RSA_DATA", "Error encrypting RSA data.");
        }
    }

    public static byte[] a(Function0 function0, Function0 function1) throws PinCipherException {
        CipherResult cipherResult = (CipherResult) function0.invoke();
        if (cipherResult instanceof CipherResult.Success) {
            return (byte[]) ((CipherResult.Success) cipherResult).getValue();
        }
        if (!(cipherResult instanceof CipherResult.Error)) {
            throw new NoWhenBranchMatchedException();
        }
        e eVar = new e(function1);
        f fVar = new f(cipherResult);
        Throwable th2 = (Throwable) fVar.invoke();
        if ((th2 instanceof NoSuchAlgorithmException) || (th2 instanceof NoSuchPaddingException) || (th2 instanceof InvalidKeyException) || (th2 instanceof InvalidAlgorithmParameterException) || (th2 instanceof BadPaddingException)) {
            throw new PinCipherException((Throwable) fVar.invoke(), ((PinCipherException) eVar.invoke()).getF29329p0(), ((PinCipherException) eVar.invoke()).getF29330q0());
        }
        if (th2 instanceof IllegalBlockSizeException) {
            throw new PinCipherException((Throwable) fVar.invoke(), PinCipher.ERROR_INVALID_BLOCK_SIZE, "Invalid block size.");
        }
        throw new PinCipherException((Throwable) fVar.invoke(), "ERROR_INTERNAL", "Error internal.");
    }

    public static /* synthetic */ byte[] rsaDecrypt$default(CryptoUtils cryptoUtils, byte[] bArr, RSAPrivateKey rSAPrivateKey, String str, int i10, Object obj) throws PinCipherException {
        if ((i10 & 4) != 0) {
            str = "RSA/ECB/PKCS1Padding";
        }
        return cryptoUtils.rsaDecrypt(bArr, rSAPrivateKey, str);
    }

    public static /* synthetic */ byte[] rsaEncrypt$default(CryptoUtils cryptoUtils, byte[] bArr, RSAPublicKey rSAPublicKey, String str, int i10, Object obj) throws PinCipherException {
        if ((i10 & 4) != 0) {
            str = "RSA/ECB/PKCS1Padding";
        }
        return cryptoUtils.rsaEncrypt(bArr, rSAPublicKey, str);
    }

    @NotNull
    public final byte[] decrypt(@NotNull SecretKey secretKey, @NotNull byte[] encryptedBytes) throws PinCipherException {
        Intrinsics.checkNotNullParameter(secretKey, "secretKey");
        Intrinsics.checkNotNullParameter(encryptedBytes, "encryptedBytes");
        return a(new a(encryptedBytes, secretKey), b.f29360p0);
    }

    @NotNull
    public final byte[] encrypt(@NotNull SecretKey secretKey, @NotNull byte[] unencryptedBytes) throws PinCipherException {
        Intrinsics.checkNotNullParameter(secretKey, "secretKey");
        Intrinsics.checkNotNullParameter(unencryptedBytes, "unencryptedBytes");
        return a(new c(unencryptedBytes, secretKey), d.f29363p0);
    }

    @NotNull
    public final SecretKey generateKeyDESEDE(@Size(SvgConstantsKt.SPECIFIED_STROKE_OPACITY) @NotNull byte[] key) throws PinCipherException {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            byte[] bArr = new byte[24];
            System.arraycopy(key, 0, bArr, 0, 16);
            System.arraycopy(key, 0, bArr, 16, 8);
            SecretKey secretKeyGenerateSecret = SecretKeyFactory.getInstance("DESede").generateSecret(new DESedeKeySpec(bArr));
            Intrinsics.checkNotNullExpressionValue(secretKeyGenerateSecret, "{\n            val extend…Secret(keySpec)\n        }");
            return secretKeyGenerateSecret;
        } catch (Exception e5) {
            throw new PinCipherException(e5, "ERROR_GENERATING_CIPHERING_KEY", "Error generating key to decrypt.");
        }
    }

    @NotNull
    public final KeyPair generateRSAKeyPair() throws PinCipherException {
        try {
            RSAKeyGeneratorImpl rSAKeyGeneratorImpl = new RSAKeyGeneratorImpl();
            BigInteger RSA_PUBLIC_KEY_EXPONENT = f29357b;
            Intrinsics.checkNotNullExpressionValue(RSA_PUBLIC_KEY_EXPONENT, "RSA_PUBLIC_KEY_EXPONENT");
            return rSAKeyGeneratorImpl.generateRSAKeyPair("RSA", 2048, RSA_PUBLIC_KEY_EXPONENT);
        } catch (TokenException e5) {
            throw new PinCipherException(e5, e5.getF29329p0(), e5.getF29330q0());
        }
    }

    @NotNull
    public final RSAPublicKey generateRSAPublicKey(@NotNull String modulus) throws PinCipherException {
        Intrinsics.checkNotNullParameter(modulus, "modulus");
        try {
            RSAKeyGeneratorImpl rSAKeyGeneratorImpl = new RSAKeyGeneratorImpl();
            BigInteger bigInteger = new BigInteger(modulus, 16);
            BigInteger RSA_PUBLIC_KEY_EXPONENT = f29357b;
            Intrinsics.checkNotNullExpressionValue(RSA_PUBLIC_KEY_EXPONENT, "RSA_PUBLIC_KEY_EXPONENT");
            return rSAKeyGeneratorImpl.generateRSAPublicKey("RSA", bigInteger, RSA_PUBLIC_KEY_EXPONENT);
        } catch (Exception e5) {
            if (!(e5 instanceof TokenException)) {
                throw new PinCipherException(e5, RSAKeyGeneratorImpl.ERROR_GENERATING_RSA_KEY_PAIR, "Error generating RSA key pair.");
            }
            TokenException tokenException = (TokenException) e5;
            throw new PinCipherException(tokenException, tokenException.getF29329p0(), tokenException.getF29330q0());
        }
    }

    @NotNull
    public final SecretKey generateRandomKeyDESEDE() throws PinCipherException {
        try {
            byte[] bArr = new byte[8];
            new SecureRandom().nextBytes(bArr);
            byte[] bArr2 = new byte[8];
            new SecureRandom().nextBytes(bArr2);
            byte[] bArr3 = new byte[24];
            System.arraycopy(bArr, 0, bArr3, 0, 8);
            System.arraycopy(bArr2, 0, bArr3, 8, 8);
            System.arraycopy(bArr, 0, bArr3, 16, 8);
            SecretKey secretKeyGenerateSecret = SecretKeyFactory.getInstance("DESede").generateSecret(new DESedeKeySpec(bArr3));
            Intrinsics.checkNotNullExpressionValue(secretKeyGenerateSecret, "{\n            val keyByt…Secret(keySpec)\n        }");
            return secretKeyGenerateSecret;
        } catch (Exception e5) {
            throw new PinCipherException(e5, "ERROR_GENERATING_CIPHERING_KEY", "Error generating key to encrypt.");
        }
    }

    @Nullable
    public final String getContentFromTag(@NotNull String generalTag, @NotNull String customTag, @NotNull Properties prop) throws PinCipherException {
        Intrinsics.checkNotNullParameter(generalTag, "generalTag");
        Intrinsics.checkNotNullParameter(customTag, "customTag");
        Intrinsics.checkNotNullParameter(prop, "prop");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(generalTag);
        String strF = ad.d.f(sb2, Constant.DOT_STRING, customTag);
        String strF2 = u.f(generalTag, ".default");
        if (prop.containsKey(strF)) {
            return prop.getProperty(generalTag + Constant.DOT_STRING + customTag);
        }
        if ((!prop.contains(strF2) || !Intrinsics.areEqual(customTag, "default")) && !Intrinsics.areEqual(customTag, "")) {
            return null;
        }
        return prop.getProperty(generalTag + ".default");
    }

    @NotNull
    public final byte[] rsaDecrypt(@NotNull byte[] encryptedData, @NotNull RSAPrivateKey rsaPrivateKey, @NotNull String transformation) throws PinCipherException {
        Intrinsics.checkNotNullParameter(encryptedData, "encryptedData");
        Intrinsics.checkNotNullParameter(rsaPrivateKey, "rsaPrivateKey");
        Intrinsics.checkNotNullParameter(transformation, "transformation");
        return a(new g(encryptedData, rsaPrivateKey, transformation), h.f29369p0);
    }

    @NotNull
    public final byte[] rsaEncrypt(@NotNull byte[] data, @NotNull RSAPublicKey rsaPublicKey, @NotNull String transformation) throws PinCipherException {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(rsaPublicKey, "rsaPublicKey");
        Intrinsics.checkNotNullParameter(transformation, "transformation");
        return a(new i(data, rsaPublicKey, transformation), j.f29373p0);
    }
}
