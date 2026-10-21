package com.bbva.ethermobilesdk.tokencompat.model.legacy;

import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.ethermobilesdk.cipher.softcipher.SoftCipher;
import com.bbva.ethermobilesdk.token.ocra.OcraParser;
import com.bbva.ethermobilesdk.token.storage.data.StorageOcraSuite;
import com.bbva.ethermobilesdk.token.storage.data.StorageToken;
import com.bbva.ethermobilesdk.token.storage.data.StorageTokenActivation;
import com.bbva.ethermobilesdk.tokencompat.TokenCompatError;
import com.bbva.ethermobilesdk.tokencompat.crypto.CryptoProvider;
import com.bbva.ethermobilesdk.tokencompat.extension.SoftCipherKt;
import com.bbva.ethermobilesdk.tokencompat.extension.StringKt;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LegacyTokenBuilder.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/LegacyTokenBuilder;", "", "Lcom/bbva/ethermobilesdk/token/storage/data/StorageToken;", "token", "Lcom/bbva/ethermobilesdk/tokencompat/crypto/CryptoProvider;", "crypto", "", "needsPin", "Lcom/bbva/ethermobile/help/kit/result/Result;", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/LegacyToken;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "(Lcom/bbva/ethermobilesdk/token/storage/data/StorageToken;Lcom/bbva/ethermobilesdk/tokencompat/crypto/CryptoProvider;Ljava/lang/Boolean;)Lcom/bbva/ethermobile/help/kit/result/Result;", "", "NAME", "Ljava/lang/String;", "OTP_TIME", "OCRA_SUITE", "KEYPAIR_ALGORITHM", "<init>", "()V", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0})
public final class LegacyTokenBuilder {

    @NotNull
    public static final LegacyTokenBuilder INSTANCE = new LegacyTokenBuilder();

    @NotNull
    public static final String KEYPAIR_ALGORITHM = "RSA";

    @NotNull
    public static final String NAME = "BBVA Token";

    @NotNull
    public static final String OCRA_SUITE = "OCRA-1:HOTP-SHA256-6:QN08-T30S";

    @NotNull
    public static final String OTP_TIME = "0";

    public static /* synthetic */ Result build$default(LegacyTokenBuilder legacyTokenBuilder, StorageToken storageToken, CryptoProvider cryptoProvider, Boolean bool, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            bool = Boolean.FALSE;
        }
        return legacyTokenBuilder.build(storageToken, cryptoProvider, bool);
    }

    @NotNull
    public final Result<LegacyToken> build(@NotNull StorageToken token, @NotNull CryptoProvider crypto, @Nullable Boolean needsPin) {
        LegacyToken.OathParams oathParams;
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(crypto, "crypto");
        SoftCipher softCipher = new SoftCipher();
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            StorageTokenActivation activation = token.getActivation();
            if (activation == null) {
                throw new TokenCompatError.TokenIsNotActive(0, null, null, 7, null);
            }
            byte[] bArrSeed = LegacyTokenBuilderKt.seed(token, softCipher);
            byte[] bArrEncryptTokenSeed = SoftCipherKt.encryptTokenSeed(softCipher, bArrSeed, crypto.getPin(), crypto.getDeviceInfo());
            TokenType tokenType = TokenType.TOTP;
            TokenStatus tokenStatus = TokenStatus.ACTIVE;
            String id = token.getId();
            int length = bArrSeed.length;
            LegacyToken.ExtraParams extraParams = new LegacyToken.ExtraParams("0", StringKt.crc32(crypto.getPin()), StringKt.crc32(crypto.getDeviceInfo()), crypto.getUuidType(), "app", "com.bbva.ethermobilesdk.tokencompat:5.1.0", "");
            boolean zBooleanValue = needsPin != null ? needsPin.booleanValue() : false;
            long timestamp = activation.getTimestamp();
            StorageOcraSuite ocraSuite = token.getOcraSuite();
            if (ocraSuite == null || (oathParams = LegacyTokenBuilderKt.toOathParams(ocraSuite)) == null) {
                oathParams = LegacyTokenBuilderKt.toOathParams(LegacyTokenBuilderKt.toStorageOcraSuite(new OcraParser().parse("OCRA-1:HOTP-SHA256-6:QN08-T30S")));
            }
            return new Result.Success(new LegacyToken(tokenType, tokenStatus, id, NAME, bArrEncryptTokenSeed, length, 0, "app", extraParams, zBooleanValue, false, 0L, 0L, timestamp, "1", oathParams));
        } catch (Throwable th2) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            Throwable thM5538exceptionOrNullimpl = kotlin.Result.m5538exceptionOrNullimpl(kotlin.Result.m5535constructorimpl(ResultKt.createFailure(th2)));
            if (thM5538exceptionOrNullimpl != null) {
                return new Result.Error(new TokenCompatError.LegacyTokenBuilderFailure(0, null, thM5538exceptionOrNullimpl, 3, null));
            }
            throw new KotlinNothingValueException();
        }
    }
}
