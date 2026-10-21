package com.bbva.ethermobilesdk.tokencompat.model;

import com.bbva.ethermobilesdk.cipher.model.CipherResultKt;
import com.bbva.ethermobilesdk.cipher.softcipher.SoftCipher;
import com.bbva.ethermobilesdk.cipher.utils.EncodingUtilsKt;
import com.bbva.ethermobilesdk.token.ocra.OcraParser;
import com.bbva.ethermobilesdk.token.storage.data.StorageOcraSuite;
import com.bbva.ethermobilesdk.token.storage.data.StorageToken;
import com.bbva.ethermobilesdk.token.storage.data.StorageTokenActivation;
import com.bbva.ethermobilesdk.token.storage.data.StorageTokenRSA;
import com.bbva.ethermobilesdk.tokencompat.TokenCompatError;
import com.bbva.ethermobilesdk.tokencompat.crypto.CryptoProvider;
import com.bbva.ethermobilesdk.tokencompat.extension.SoftCipherKt;
import com.bbva.ethermobilesdk.tokencompat.model.legacy.LegacyToken;
import com.bbva.ethermobilesdk.tokencompat.model.legacy.LegacyTokenBuilderKt;
import com.bbva.ethermobilesdk.tokencompat.model.legacy.TokenType;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.security.KeyPair;
import java.security.PublicKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: StorageTokenBuilder.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0000¢\u0006\u0002\b\u0011J\u0019\u0010\u0012\u001a\u00020\u0013*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0000¢\u0006\u0002\b\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/model/StorageTokenBuilder;", "", "()V", "OCRA_SUITE", "", "OTP_LAPSE", "OTP_LENGTH", "PROTOCOL_VERSION", "SEED_ENCRYPTION_ALGORITHM", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/bbva/ethermobilesdk/token/storage/data/StorageToken;", "token", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/LegacyToken;", "crypto", "Lcom/bbva/ethermobilesdk/tokencompat/crypto/CryptoProvider;", "keyPair", "Ljava/security/KeyPair;", "build$ethertoken_compat_release", "toOcraSuite", "Lcom/bbva/ethermobilesdk/token/storage/data/StorageOcraSuite;", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/LegacyToken$OathParams;", "tokenType", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/TokenType;", "toOcraSuite$ethertoken_compat_release", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class StorageTokenBuilder {

    @NotNull
    public static final StorageTokenBuilder INSTANCE = new StorageTokenBuilder();

    @NotNull
    public static final String OCRA_SUITE = "OCRA-1:HOTP-SHA256-6:QN08-T30S";

    @NotNull
    public static final String OTP_LAPSE = "30";

    @NotNull
    public static final String OTP_LENGTH = "6";

    @NotNull
    public static final String PROTOCOL_VERSION = "1.0";

    @NotNull
    public static final String SEED_ENCRYPTION_ALGORITHM = "RSA/ECB/PKCS1Padding";

    @NotNull
    public final StorageToken build$ethertoken_compat_release(@NotNull LegacyToken token, @NotNull CryptoProvider crypto, @NotNull KeyPair keyPair) throws TokenCompatError.IllegalState {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(crypto, "crypto");
        Intrinsics.checkNotNullParameter(keyPair, "keyPair");
        byte[] encoded = keyPair.getPrivate().getEncoded();
        Intrinsics.checkNotNullExpressionValue(encoded, "keyPair.private.encoded");
        String hex$default = EncodingUtilsKt.toHex$default(encoded, null, 1, null);
        SoftCipher softCipher = new SoftCipher();
        byte[] bArrDecryptTokenSeed = SoftCipherKt.decryptTokenSeed(softCipher, token.getEncryptedSeed(), crypto.getPin(), crypto.getDeviceInfo());
        PublicKey publicKey = keyPair.getPublic();
        Intrinsics.checkNotNullExpressionValue(publicKey, "keyPair.public");
        byte[] bArr = (byte[]) CipherResultKt.getOrThrow(softCipher.encrypt(bArrDecryptTokenSeed, publicKey, "RSA/ECB/PKCS1Padding"));
        return new StorageToken(token.getSerial(), new StorageTokenRSA(hex$default, "", "", "1.0"), new StorageTokenActivation(token.getSerial(), "", "", EncodingUtilsKt.toBase64(bArr), token.getDateCreationMillis()), toOcraSuite$ethertoken_compat_release(token.getOathParams(), token.getType()));
    }

    @NotNull
    public final StorageOcraSuite toOcraSuite$ethertoken_compat_release(@NotNull LegacyToken.OathParams oathParams, @NotNull TokenType tokenType) {
        Intrinsics.checkNotNullParameter(oathParams, "<this>");
        Intrinsics.checkNotNullParameter(tokenType, "tokenType");
        String ocraSuite = oathParams.getOcraSuite();
        if (ocraSuite == null) {
            ocraSuite = "OCRA-1:HOTP-SHA256-6:QN08-T30S";
        }
        return LegacyTokenBuilderKt.toStorageOcraSuite(new OcraParser().parse(StorageTokenBuilderKt.merge(ocraSuite, oathParams.getOtpLapse(), oathParams.getOtpLength(), tokenType)));
    }
}
