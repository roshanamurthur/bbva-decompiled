package com.bbva.ethermobilesdk.cipher.token.generator.impl;

import ai.a;
import androidx.annotation.VisibleForTesting;
import com.bbva.ethermobilesdk.cipher.token.exception.TokenException;
import com.bbva.ethermobilesdk.cipher.token.model.SecretKeyBundle;
import com.bbva.ethermobilesdk.cipher.token.model.SecretKeyGeneratorAttributes;
import com.salesforce.marketingcloud.storage.db.k;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SecretKeyGeneratorImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¨\u0006\u0010"}, d2 = {"Lcom/bbva/ethermobilesdk/cipher/token/generator/impl/SecretKeyGeneratorImpl;", "", "", "password", "Lcom/bbva/ethermobilesdk/cipher/token/model/SecretKeyGeneratorAttributes;", k.a.f65041h, "Lcom/bbva/ethermobilesdk/cipher/token/model/SecretKeyBundle;", "generateSecretKey", "", "saltLength", "", "seed", "generateSalt", "<init>", "()V", "Companion", "cipher_release"}, k = 1, mv = {1, 8, 0})
public final class SecretKeyGeneratorImpl {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String ERROR_DESCRIPTION_NO_SALT = "Salt algorithm is mandatory and salt length must be longer than zero";

    @NotNull
    public static final String ERROR_GENERATING_PASSWORD = "ERROR_GENERATING_PASSWORD";

    @NotNull
    public static final String ERROR_GENERATING_SALT = "ERROR_GENERATING_SALT";

    @NotNull
    public static final String ERROR_PARAMETER_MANDATORY = "Parameter '%s' is mandatory";

    public static SecretKeySpec a(String str, byte[] bArr, SecretKeyGeneratorAttributes secretKeyGeneratorAttributes) throws InvalidKeySpecException, NoSuchAlgorithmException {
        char[] charArray = str.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "this as java.lang.String).toCharArray()");
        SecretKey secretKeyGenerateSecret = SecretKeyFactory.getInstance(secretKeyGeneratorAttributes.getKeyFactoryAlgorithm()).generateSecret(new PBEKeySpec(charArray, bArr, secretKeyGeneratorAttributes.getIterations(), secretKeyGeneratorAttributes.getKeyLength()));
        Intrinsics.checkNotNullExpressionValue(secretKeyGenerateSecret, "secretKeyFactory.generateSecret(pbeKeySpec)");
        byte[] encoded = secretKeyGenerateSecret.getEncoded();
        Intrinsics.checkNotNullExpressionValue(encoded, "secretKey.encoded");
        return new SecretKeySpec(encoded, secretKeyGeneratorAttributes.getKeySpecAlgorithm());
    }

    public static TokenException b(Exception exc, String str) {
        if (str == null) {
            if ((exc instanceof NoSuchAlgorithmException) || (exc instanceof InvalidKeySpecException) || (exc instanceof IllegalArgumentException)) {
                str = exc.getMessage();
                if (str == null) {
                    str = "Error generating password.";
                }
            } else {
                str = exc.getMessage();
                if (str == null) {
                    str = "Unknown error.";
                }
            }
        }
        return new TokenException(exc, ERROR_GENERATING_PASSWORD, str);
    }

    @NotNull
    public final byte[] generateSalt(int saltLength, @Nullable byte[] seed) throws TokenException {
        try {
            byte[] bArr = new byte[saltLength];
            (seed == null ? new SecureRandom() : new SecureRandom(seed)).nextBytes(bArr);
            return bArr;
        } catch (Exception e5) {
            throw b(e5, ERROR_GENERATING_SALT);
        }
    }

    @NotNull
    public final SecretKeyBundle generateSecretKey(@NotNull String password, @NotNull SecretKeyGeneratorAttributes attributes) throws Exception {
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        if (password.length() == 0) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            throw new TokenException(new InvalidKeyException(), ERROR_GENERATING_PASSWORD, a.i(new Object[]{"password"}, 1, ERROR_PARAMETER_MANDATORY, "format(format, *args)"));
        }
        try {
            if (attributes.getSalt() == null && attributes.getSaltLength() <= 0) {
                throw new TokenException(new Exception(), ERROR_GENERATING_PASSWORD, ERROR_DESCRIPTION_NO_SALT);
            }
            byte[] salt = attributes.getSalt();
            if (salt == null) {
                salt = generateSalt(attributes.getSaltLength(), attributes.getSaltSeed());
            }
            byte[] saltSeed = attributes.getSaltSeed();
            if (saltSeed == null) {
                saltSeed = salt;
            }
            return new SecretKeyBundle(a(password, saltSeed, attributes), salt);
        } catch (Exception e5) {
            if (e5 instanceof TokenException) {
                throw e5;
            }
            throw b(e5, null);
        }
    }

    /* JADX INFO: compiled from: SecretKeyGeneratorImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u0016\u0010\u0006\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0002R\u0016\u0010\b\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0002R\u0016\u0010\n\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0002¨\u0006\f"}, d2 = {"Lcom/bbva/ethermobilesdk/cipher/token/generator/impl/SecretKeyGeneratorImpl$Companion;", "", "()V", "ERROR_DESCRIPTION_NO_SALT", "", "getERROR_DESCRIPTION_NO_SALT$cipher_release$annotations", SecretKeyGeneratorImpl.ERROR_GENERATING_PASSWORD, "getERROR_GENERATING_PASSWORD$cipher_release$annotations", SecretKeyGeneratorImpl.ERROR_GENERATING_SALT, "getERROR_GENERATING_SALT$cipher_release$annotations", "ERROR_PARAMETER_MANDATORY", "getERROR_PARAMETER_MANDATORY$cipher_release$annotations", "cipher_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @VisibleForTesting(otherwise = 2)
        public static /* synthetic */ void getERROR_DESCRIPTION_NO_SALT$cipher_release$annotations() {
        }

        @VisibleForTesting(otherwise = 2)
        public static /* synthetic */ void getERROR_GENERATING_PASSWORD$cipher_release$annotations() {
        }

        @VisibleForTesting(otherwise = 2)
        public static /* synthetic */ void getERROR_GENERATING_SALT$cipher_release$annotations() {
        }

        @VisibleForTesting(otherwise = 2)
        public static /* synthetic */ void getERROR_PARAMETER_MANDATORY$cipher_release$annotations() {
        }
    }
}
