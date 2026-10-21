package com.bbva.ethermobilesdk.cipher.token.generator;

import com.bbva.ethermobilesdk.cipher.model.CipherResult;
import com.bbva.ethermobilesdk.cipher.token.generator.impl.OTPGeneratorImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: OTPGenerator.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J4\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bJ4\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\t¨\u0006\u0014"}, d2 = {"Lcom/bbva/ethermobilesdk/cipher/token/generator/OTPGenerator;", "", "()V", "generateHOTP256", "Lcom/bbva/ethermobilesdk/cipher/model/CipherResult;", "", "secret", "", "movingFactor", "", "codeDigits", "", "addChecksum", "", "truncationOffset", "generateOTP", "seed", "timeIncrement", "timeDrift", "currentTimeInMillis", "cipher_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OTPGenerator {

    @NotNull
    public static final OTPGenerator INSTANCE = new OTPGenerator();

    @NotNull
    public final CipherResult<String> generateHOTP256(@NotNull byte[] secret, long movingFactor, int codeDigits, boolean addChecksum, int truncationOffset) {
        Intrinsics.checkNotNullParameter(secret, "secret");
        try {
            String strGenerateHOTP256 = new OTPGeneratorImpl().generateHOTP256(secret, movingFactor, codeDigits, addChecksum, truncationOffset);
            Intrinsics.checkNotNullExpressionValue(strGenerateHOTP256, "OTPGeneratorImpl().gener…ecksum, truncationOffset)");
            return new CipherResult.Success(strGenerateHOTP256);
        } catch (Exception e5) {
            return new CipherResult.Error(e5);
        }
    }

    @NotNull
    public final CipherResult<String> generateOTP(@NotNull byte[] seed, int codeDigits, int timeIncrement, int timeDrift, long currentTimeInMillis) {
        Intrinsics.checkNotNullParameter(seed, "seed");
        try {
            String strGenerateOTP = new OTPGeneratorImpl().generateOTP(seed, codeDigits, timeIncrement, timeDrift, currentTimeInMillis);
            Intrinsics.checkNotNullExpressionValue(strGenerateOTP, "OTPGeneratorImpl().gener…ift, currentTimeInMillis)");
            return new CipherResult.Success(strGenerateOTP);
        } catch (Exception e5) {
            return new CipherResult.Error(e5);
        }
    }
}
