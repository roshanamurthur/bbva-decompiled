package com.bbva.ethermobilesdk.tokencompat.extension;

import com.bbva.ethermobilesdk.tokencompat.model.legacy.LegacyToken;
import com.bbva.ethermobilesdk.tokencompat.model.legacy.TokenPub;
import com.bbva.ethermobilesdk.tokencompat.model.legacy.TokenType;
import com.bbva.ethermobilesdk.tokencompat.model.legacy.impl.STTokenPubImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LegacyTokenExtensions.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toTokenPub", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/TokenPub;", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/LegacyToken;", "ethertoken-compat_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LegacyTokenExtensionsKt {
    @NotNull
    public static final TokenPub toTokenPub(@NotNull LegacyToken legacyToken) {
        Intrinsics.checkNotNullParameter(legacyToken, "<this>");
        TokenType type = legacyToken.getType();
        String serial = legacyToken.getSerial();
        String name = legacyToken.getName();
        boolean needsPin = legacyToken.getNeedsPin();
        boolean useQrCode = legacyToken.getUseQrCode();
        String otpLapse = legacyToken.getOathParams().getOtpLapse();
        long j10 = otpLapse != null ? Long.parseLong(otpLapse) : 0L;
        String otpLapse2 = legacyToken.getOathParams().getOtpLapse();
        return new STTokenPubImpl(type, serial, name, needsPin, useQrCode, j10, otpLapse2 != null ? Long.parseLong(otpLapse2) : 0L);
    }
}
