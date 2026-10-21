package com.bbva.ethermobilesdk.cipher.token.generator;

import com.bbva.ethermobilesdk.cipher.model.CipherResult;
import com.bbva.ethermobilesdk.cipher.token.generator.impl.RSAKeyGeneratorImpl;
import java.math.BigInteger;
import java.security.KeyPair;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RSAKeyGenerator.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ$\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ$\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bJ\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0013J\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\u0006\u0010\u0015\u001a\u00020\u0007J\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0013¨\u0006\u0017"}, d2 = {"Lcom/bbva/ethermobilesdk/cipher/token/generator/RSAKeyGenerator;", "", "()V", "generateRSAKeyPair", "Lcom/bbva/ethermobilesdk/cipher/model/CipherResult;", "Ljava/security/KeyPair;", "algorithm", "", "length", "", "publicKeyExponent", "Ljava/math/BigInteger;", "generateRSAPublicKey", "Ljava/security/interfaces/RSAPublicKey;", "modulus", "publicExponent", "loadPrivateKey", "Ljava/security/interfaces/RSAPrivateKey;", "bytes", "", "loadPrivateKeyFromFile", "keyFile", "loadPublicKey", "cipher_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RSAKeyGenerator {

    @NotNull
    public static final RSAKeyGenerator INSTANCE = new RSAKeyGenerator();

    @NotNull
    public final CipherResult<KeyPair> generateRSAKeyPair(@NotNull String algorithm, int length) {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        try {
            return new CipherResult.Success(new RSAKeyGeneratorImpl().generateRSAKeyPair(algorithm, length));
        } catch (Exception e5) {
            return new CipherResult.Error(e5);
        }
    }

    @NotNull
    public final CipherResult<RSAPublicKey> generateRSAPublicKey(@NotNull String algorithm, @NotNull BigInteger modulus, @NotNull BigInteger publicExponent) {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        Intrinsics.checkNotNullParameter(modulus, "modulus");
        Intrinsics.checkNotNullParameter(publicExponent, "publicExponent");
        try {
            return new CipherResult.Success(new RSAKeyGeneratorImpl().generateRSAPublicKey(algorithm, modulus, publicExponent));
        } catch (Exception e5) {
            return new CipherResult.Error(e5);
        }
    }

    @NotNull
    public final CipherResult<RSAPrivateKey> loadPrivateKey(@NotNull String algorithm, @NotNull byte[] bytes) {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        try {
            return new CipherResult.Success(new RSAKeyGeneratorImpl().loadPrivateKey(algorithm, bytes));
        } catch (Exception e5) {
            return new CipherResult.Error(e5);
        }
    }

    @NotNull
    public final CipherResult<RSAPrivateKey> loadPrivateKeyFromFile(@NotNull String keyFile) {
        Intrinsics.checkNotNullParameter(keyFile, "keyFile");
        try {
            return new CipherResult.Success(new RSAKeyGeneratorImpl().loadPrivateKeyFromFile(keyFile));
        } catch (Exception e5) {
            return new CipherResult.Error(e5);
        }
    }

    @NotNull
    public final CipherResult<RSAPublicKey> loadPublicKey(@NotNull String algorithm, @NotNull byte[] bytes) {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        try {
            return new CipherResult.Success(new RSAKeyGeneratorImpl().loadPublicKey(algorithm, bytes));
        } catch (Exception e5) {
            return new CipherResult.Error(e5);
        }
    }

    @NotNull
    public final CipherResult<KeyPair> generateRSAKeyPair(@NotNull String algorithm, int length, @NotNull BigInteger publicKeyExponent) {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        Intrinsics.checkNotNullParameter(publicKeyExponent, "publicKeyExponent");
        try {
            return new CipherResult.Success(new RSAKeyGeneratorImpl().generateRSAKeyPair(algorithm, length, publicKeyExponent));
        } catch (Exception e5) {
            return new CipherResult.Error(e5);
        }
    }
}
