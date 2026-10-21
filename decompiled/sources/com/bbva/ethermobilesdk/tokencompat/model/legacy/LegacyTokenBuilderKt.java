package com.bbva.ethermobilesdk.tokencompat.model.legacy;

import com.bbva.ethermobilesdk.cipher.softcipher.SoftCipher;
import com.bbva.ethermobilesdk.cipher.token.generator.RSAKeyGenerator;
import com.bbva.ethermobilesdk.cipher.utils.EncodingUtilsKt;
import com.bbva.ethermobilesdk.token.model.OcraSuite;
import com.bbva.ethermobilesdk.token.storage.data.StorageOcraSuite;
import com.bbva.ethermobilesdk.token.storage.data.StorageToken;
import com.bbva.ethermobilesdk.token.storage.data.StorageTokenActivation;
import com.bbva.ethermobilesdk.tokencompat.TokenCompatError;
import com.bbva.ethermobilesdk.tokencompat.extension.CipherKt;
import java.security.interfaces.RSAPrivateKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LegacyTokenBuilder.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0007H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\bH\u0000\u001a\f\u0010\t\u001a\u00020\u0007*\u00020\bH\u0000\u001a\f\u0010\n\u001a\u00020\b*\u00020\u0007H\u0000¨\u0006\u000b"}, d2 = {"seed", "", "Lcom/bbva/ethermobilesdk/token/storage/data/StorageToken;", "cipher", "Lcom/bbva/ethermobilesdk/cipher/softcipher/SoftCipher;", "toOathParams", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/LegacyToken$OathParams;", "Lcom/bbva/ethermobilesdk/token/model/OcraSuite;", "Lcom/bbva/ethermobilesdk/token/storage/data/StorageOcraSuite;", "toOcraSuite", "toStorageOcraSuite", "ethertoken-compat_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LegacyTokenBuilderKt {
    @NotNull
    public static final byte[] seed(@NotNull StorageToken storageToken, @NotNull SoftCipher cipher) throws TokenCompatError.TokenIsNotActive {
        Intrinsics.checkNotNullParameter(storageToken, "<this>");
        Intrinsics.checkNotNullParameter(cipher, "cipher");
        StorageTokenActivation activation = storageToken.getActivation();
        if (activation == null) {
            throw new TokenCompatError.TokenIsNotActive(0, null, null, 7, null);
        }
        return (byte[]) CipherKt.valueOrThrow(cipher.decrypt(EncodingUtilsKt.base64ToByteArray(activation.getSeed()), (RSAPrivateKey) CipherKt.valueOrThrow(RSAKeyGenerator.INSTANCE.loadPrivateKey("RSA", EncodingUtilsKt.hexStringToByteArray$default(storageToken.getRsa().getPrivateKey(), null, 1, null))), "RSA/ECB/PKCS1Padding"));
    }

    @NotNull
    public static final LegacyToken.OathParams toOathParams(@NotNull OcraSuite ocraSuite) {
        Intrinsics.checkNotNullParameter(ocraSuite, "<this>");
        LegacyToken.OathParams oathParams = new LegacyToken.OathParams(null, null, null, null, null, null, 63, null);
        oathParams.setOcraSuite(ocraSuite.toString());
        oathParams.setOtpLapse(String.valueOf(ocraSuite.getTimeStep().getSeconds()));
        oathParams.setOtpLength(String.valueOf(ocraSuite.getOtpLength().getValue()));
        oathParams.setOtpTime("0");
        return oathParams;
    }

    @NotNull
    public static final OcraSuite toOcraSuite(@NotNull StorageOcraSuite storageOcraSuite) {
        Intrinsics.checkNotNullParameter(storageOcraSuite, "<this>");
        return new OcraSuite(storageOcraSuite.getVersion(), storageOcraSuite.getFunction(), storageOcraSuite.getOtpLength(), storageOcraSuite.getTimeStep(), storageOcraSuite.getChallengeType(), storageOcraSuite.getChallengeLength(), storageOcraSuite.getHasCounter());
    }

    @NotNull
    public static final StorageOcraSuite toStorageOcraSuite(@NotNull OcraSuite ocraSuite) {
        Intrinsics.checkNotNullParameter(ocraSuite, "<this>");
        return new StorageOcraSuite(ocraSuite.getVersion(), ocraSuite.getFunction(), ocraSuite.getOtpLength(), ocraSuite.getTimeStep(), ocraSuite.getChallengeType(), ocraSuite.getChallengeLength(), ocraSuite.getHasCounter());
    }

    @NotNull
    public static final LegacyToken.OathParams toOathParams(@NotNull StorageOcraSuite storageOcraSuite) {
        Intrinsics.checkNotNullParameter(storageOcraSuite, "<this>");
        return toOathParams(toOcraSuite(storageOcraSuite));
    }
}
