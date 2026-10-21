package com.bbva.ethermobilesdk.cipher.token.generator.impl;

import androidx.annotation.VisibleForTesting;
import com.bbva.ethermobilesdk.cipher.token.exception.TokenException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: HashGeneratorImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\t"}, d2 = {"Lcom/bbva/ethermobilesdk/cipher/token/generator/impl/HashGeneratorImpl;", "", "()V", "generateHash", "", "text", "", "algorithm", "Companion", "cipher_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class HashGeneratorImpl {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String ERROR_HASHING_PASSWORD = "ERROR_HASHING_PASSWORD";

    @NotNull
    public final byte[] generateHash(@NotNull String text, @NotNull String algorithm) throws TokenException {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
            Intrinsics.checkNotNullExpressionValue(messageDigest, "getInstance(algorithm)");
            byte[] bytes = text.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            messageDigest.update(bytes);
            byte[] bArrDigest = messageDigest.digest();
            Intrinsics.checkNotNullExpressionValue(bArrDigest, "messageDigest.digest()");
            return bArrDigest;
        } catch (NoSuchAlgorithmException e5) {
            throw new TokenException(e5, ERROR_HASHING_PASSWORD, "Error generating hash.");
        }
    }

    /* JADX INFO: compiled from: HashGeneratorImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002¨\u0006\u0006"}, d2 = {"Lcom/bbva/ethermobilesdk/cipher/token/generator/impl/HashGeneratorImpl$Companion;", "", "()V", HashGeneratorImpl.ERROR_HASHING_PASSWORD, "", "getERROR_HASHING_PASSWORD$cipher_release$annotations", "cipher_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @VisibleForTesting(otherwise = 2)
        public static /* synthetic */ void getERROR_HASHING_PASSWORD$cipher_release$annotations() {
        }
    }
}
