package com.bbva.ethermobilesdk.cipher.factory;

import com.bbva.ethermobilesdk.cipher.model.CipherResult;
import com.bbva.ethermobilesdk.cipher.token.generator.RSAKeyGenerator;
import com.bbva.ethermobilesdk.cipher.token.generator.impl.RSAKeyGeneratorImpl;
import com.bbva.ethermobilesdk.cipher.token.generator.impl.SecretKeyGeneratorImpl;
import com.bbva.ethermobilesdk.cipher.token.model.SecretKeyBundle;
import com.bbva.ethermobilesdk.cipher.token.model.SecretKeyGeneratorAttributes;
import com.bbva.ethermobilesdk.cipher.utils.EncodingUtilsKt;
import com.salesforce.marketingcloud.storage.db.k;
import java.math.BigInteger;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SecureElementFactory.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004\u001a\"\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00060\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u001a\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00012\u0006\u0010\u000b\u001a\u00020\f\u001a\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f\u001a\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u001a\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00012\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015¨\u0006\u0016"}, d2 = {"rsaKeyPairOf", "Lcom/bbva/ethermobilesdk/cipher/model/CipherResult;", "Ljava/security/interfaces/RSAPublicKey;", "modulus", "Ljava/math/BigInteger;", "publicExponent", "Lcom/bbva/ethermobilesdk/cipher/factory/RSAKeyPair;", "length", "", "rsaPrivateKeyOf", "Ljava/security/interfaces/RSAPrivateKey;", "value", "", "rsaPublicKeyOf", "saltOf", "", "seed", "secretKeyOf", "Lcom/bbva/ethermobilesdk/cipher/token/model/SecretKeyBundle;", "password", k.a.f65041h, "Lcom/bbva/ethermobilesdk/cipher/token/model/SecretKeyGeneratorAttributes;", "cipher_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SecureElementFactoryKt {
    @NotNull
    public static final CipherResult<RSAKeyPair> rsaKeyPairOf(int i10, @Nullable BigInteger bigInteger) {
        try {
            RSAKeyGeneratorImpl rSAKeyGeneratorImpl = new RSAKeyGeneratorImpl();
            KeyPair keyPairGenerateRSAKeyPair = bigInteger == null ? rSAKeyGeneratorImpl.generateRSAKeyPair("RSA", i10) : rSAKeyGeneratorImpl.generateRSAKeyPair("RSA", i10, bigInteger);
            PublicKey publicKey = keyPairGenerateRSAKeyPair.getPublic();
            Intrinsics.checkNotNull(publicKey, "null cannot be cast to non-null type java.security.interfaces.RSAPublicKey");
            PrivateKey privateKey = keyPairGenerateRSAKeyPair.getPrivate();
            Intrinsics.checkNotNull(privateKey, "null cannot be cast to non-null type java.security.interfaces.RSAPrivateKey");
            return new CipherResult.Success(new RSAKeyPair((RSAPublicKey) publicKey, (RSAPrivateKey) privateKey));
        } catch (Exception e5) {
            return new CipherResult.Error(e5);
        }
    }

    public static /* synthetic */ CipherResult rsaKeyPairOf$default(int i10, BigInteger bigInteger, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 2048;
        }
        if ((i11 & 2) != 0) {
            bigInteger = null;
        }
        return rsaKeyPairOf(i10, bigInteger);
    }

    @NotNull
    public static final CipherResult<RSAPrivateKey> rsaPrivateKeyOf(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            return RSAKeyGenerator.INSTANCE.loadPrivateKey("RSA", EncodingUtilsKt.base64ToByteArray(value));
        } catch (Exception e5) {
            return new CipherResult.Error(e5);
        }
    }

    @NotNull
    public static final CipherResult<RSAPublicKey> rsaPublicKeyOf(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            return RSAKeyGenerator.INSTANCE.loadPublicKey("RSA", EncodingUtilsKt.base64ToByteArray(value));
        } catch (Exception e5) {
            return new CipherResult.Error(e5);
        }
    }

    @NotNull
    public static final CipherResult<byte[]> saltOf(int i10, @Nullable byte[] bArr) {
        try {
            return new CipherResult.Success(new SecretKeyGeneratorImpl().generateSalt(i10, bArr));
        } catch (Exception e5) {
            return new CipherResult.Error(e5);
        }
    }

    public static /* synthetic */ CipherResult saltOf$default(int i10, byte[] bArr, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 8;
        }
        if ((i11 & 2) != 0) {
            bArr = null;
        }
        return saltOf(i10, bArr);
    }

    @NotNull
    public static final CipherResult<SecretKeyBundle> secretKeyOf(@NotNull String password, @NotNull SecretKeyGeneratorAttributes attributes) {
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        try {
            return new CipherResult.Success(new SecretKeyGeneratorImpl().generateSecretKey(password, attributes));
        } catch (Exception e5) {
            return new CipherResult.Error(e5);
        }
    }

    @NotNull
    public static final CipherResult<RSAPublicKey> rsaKeyPairOf(@NotNull BigInteger modulus, @NotNull BigInteger publicExponent) {
        Intrinsics.checkNotNullParameter(modulus, "modulus");
        Intrinsics.checkNotNullParameter(publicExponent, "publicExponent");
        try {
            return new CipherResult.Success(new RSAKeyGeneratorImpl().generateRSAPublicKey("RSA", modulus, publicExponent));
        } catch (Exception e5) {
            return new CipherResult.Error(e5);
        }
    }
}
