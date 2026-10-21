package com.bbva.ethermobilesdk.cipher.token.generator.impl;

import androidx.annotation.VisibleForTesting;
import com.bbva.ethermobilesdk.cipher.token.exception.TokenException;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.RSAKeyGenParameterSpec;
import java.security.spec.RSAPublicKeySpec;
import java.security.spec.X509EncodedKeySpec;
import kotlin.Metadata;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RSAKeyGeneratorImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bJ\u001e\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ\u0016\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rJ\u0016\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rJ\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0002¨\u0006\u0017"}, d2 = {"Lcom/bbva/ethermobilesdk/cipher/token/generator/impl/RSAKeyGeneratorImpl;", "", "", "algorithm", "", "length", "Ljava/security/KeyPair;", "generateRSAKeyPair", "Ljava/math/BigInteger;", "publicKeyExponent", "modulus", "Ljava/security/interfaces/RSAPublicKey;", "generateRSAPublicKey", "", "bytes", "loadPublicKey", "Ljava/security/interfaces/RSAPrivateKey;", "loadPrivateKey", "keyFile", "loadPrivateKeyFromFile", "<init>", "()V", "Companion", "cipher_release"}, k = 1, mv = {1, 8, 0})
public final class RSAKeyGeneratorImpl {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String ERROR_GENERATING_RSA_KEY_PAIR = "ERROR_GENERATING_RSA_KEY_PAIR";

    @NotNull
    public static final String ERROR_GENERATING_RSA_PRIVATE_KEY = "ERROR_GENERATING_PRIVATE_KEY";

    @NotNull
    public static final String ERROR_GENERATING_RSA_PUBLIC_KEY = "ERROR_GENERATING_PUBLIC_KEY";

    @NotNull
    public static final String ERROR_LOADING_PRIVATE_KEY = "ERROR_LOADING_PRIVATE_KEY";

    @NotNull
    public final KeyPair generateRSAKeyPair(@NotNull String algorithm, int length) throws TokenException {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(algorithm);
            Intrinsics.checkNotNullExpressionValue(keyPairGenerator, "getInstance(algorithm)");
            keyPairGenerator.initialize(length);
            KeyPair keyPairGenKeyPair = keyPairGenerator.genKeyPair();
            Intrinsics.checkNotNullExpressionValue(keyPairGenKeyPair, "{\n        val kpg: KeyPa…   kpg.genKeyPair()\n    }");
            return keyPairGenKeyPair;
        } catch (Exception e5) {
            throw new TokenException(e5, ERROR_GENERATING_RSA_KEY_PAIR, "Error generating RSA key pair.");
        }
    }

    @NotNull
    public final RSAPublicKey generateRSAPublicKey(@NotNull String algorithm, @NotNull BigInteger modulus, @NotNull BigInteger publicKeyExponent) throws TokenException {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        Intrinsics.checkNotNullParameter(modulus, "modulus");
        Intrinsics.checkNotNullParameter(publicKeyExponent, "publicKeyExponent");
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(algorithm).generatePublic(new RSAPublicKeySpec(modulus, publicKeyExponent));
            Intrinsics.checkNotNull(publicKeyGeneratePublic, "null cannot be cast to non-null type java.security.interfaces.RSAPublicKey");
            return (RSAPublicKey) publicKeyGeneratePublic;
        } catch (Exception e5) {
            throw new TokenException(e5, ERROR_GENERATING_RSA_PUBLIC_KEY, "Error generating RSA public key.");
        }
    }

    @NotNull
    public final RSAPrivateKey loadPrivateKey(@NotNull String algorithm, @NotNull byte[] bytes) throws TokenException {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        try {
            PrivateKey privateKeyGeneratePrivate = KeyFactory.getInstance(algorithm).generatePrivate(new PKCS8EncodedKeySpec(bytes));
            Intrinsics.checkNotNull(privateKeyGeneratePrivate, "null cannot be cast to non-null type java.security.interfaces.RSAPrivateKey");
            return (RSAPrivateKey) privateKeyGeneratePrivate;
        } catch (Exception e5) {
            throw new TokenException(e5, ERROR_GENERATING_RSA_PRIVATE_KEY, "Error loading private key.");
        }
    }

    @NotNull
    public final RSAPrivateKey loadPrivateKeyFromFile(@NotNull String keyFile) throws TokenException {
        Intrinsics.checkNotNullParameter(keyFile, "keyFile");
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File(keyFile)));
            try {
                Object object = objectInputStream.readObject();
                Intrinsics.checkNotNull(object, "null cannot be cast to non-null type java.security.interfaces.RSAPrivateKey");
                RSAPrivateKey rSAPrivateKey = (RSAPrivateKey) object;
                CloseableKt.closeFinally(objectInputStream, null);
                return rSAPrivateKey;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(objectInputStream, th2);
                    throw th3;
                }
            }
        } catch (Exception e5) {
            throw new TokenException(e5, ERROR_LOADING_PRIVATE_KEY, "Error loading private key from file.");
        }
    }

    @NotNull
    public final RSAPublicKey loadPublicKey(@NotNull String algorithm, @NotNull byte[] bytes) throws TokenException {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(algorithm).generatePublic(new X509EncodedKeySpec(bytes));
            Intrinsics.checkNotNull(publicKeyGeneratePublic, "null cannot be cast to non-null type java.security.interfaces.RSAPublicKey");
            return (RSAPublicKey) publicKeyGeneratePublic;
        } catch (Exception e5) {
            throw new TokenException(e5, ERROR_GENERATING_RSA_PUBLIC_KEY, "Error loading public key.");
        }
    }

    @NotNull
    public final KeyPair generateRSAKeyPair(@NotNull String algorithm, int length, @NotNull BigInteger publicKeyExponent) throws TokenException {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        Intrinsics.checkNotNullParameter(publicKeyExponent, "publicKeyExponent");
        try {
            RSAKeyGenParameterSpec rSAKeyGenParameterSpec = new RSAKeyGenParameterSpec(length, publicKeyExponent);
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(algorithm);
            keyPairGenerator.initialize(rSAKeyGenParameterSpec);
            KeyPair keyPairGenKeyPair = keyPairGenerator.genKeyPair();
            Intrinsics.checkNotNullExpressionValue(keyPairGenKeyPair, "genKeyPair()");
            return keyPairGenKeyPair;
        } catch (Exception e5) {
            throw new TokenException(e5, ERROR_GENERATING_RSA_KEY_PAIR, "Error generating RSA key pair.");
        }
    }

    /* JADX INFO: compiled from: RSAKeyGeneratorImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u0016\u0010\u0006\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0002R\u0016\u0010\b\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0002R\u0016\u0010\n\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0002¨\u0006\f"}, d2 = {"Lcom/bbva/ethermobilesdk/cipher/token/generator/impl/RSAKeyGeneratorImpl$Companion;", "", "()V", RSAKeyGeneratorImpl.ERROR_GENERATING_RSA_KEY_PAIR, "", "getERROR_GENERATING_RSA_KEY_PAIR$cipher_release$annotations", "ERROR_GENERATING_RSA_PRIVATE_KEY", "getERROR_GENERATING_RSA_PRIVATE_KEY$cipher_release$annotations", "ERROR_GENERATING_RSA_PUBLIC_KEY", "getERROR_GENERATING_RSA_PUBLIC_KEY$cipher_release$annotations", RSAKeyGeneratorImpl.ERROR_LOADING_PRIVATE_KEY, "getERROR_LOADING_PRIVATE_KEY$cipher_release$annotations", "cipher_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @VisibleForTesting(otherwise = 2)
        public static /* synthetic */ void getERROR_GENERATING_RSA_KEY_PAIR$cipher_release$annotations() {
        }

        @VisibleForTesting(otherwise = 2)
        public static /* synthetic */ void getERROR_GENERATING_RSA_PRIVATE_KEY$cipher_release$annotations() {
        }

        @VisibleForTesting(otherwise = 2)
        public static /* synthetic */ void getERROR_GENERATING_RSA_PUBLIC_KEY$cipher_release$annotations() {
        }

        @VisibleForTesting(otherwise = 2)
        public static /* synthetic */ void getERROR_LOADING_PRIVATE_KEY$cipher_release$annotations() {
        }
    }
}
