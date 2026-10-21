package com.bbva.ethermobilesdk.tokencompat;

import com.bbva.ethermobilesdk.cipher.utils.EncodingUtilsKt;
import com.bbva.ethermobilesdk.token.model.TokenActivation;
import com.bbva.ethermobilesdk.tokencompat.model.TokenCompatActivationResponse;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TokenCompat.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ethertoken-compat_release"}, k = 2, mv = {1, 8, 0})
public final class TokenCompatKt {
    public static final TokenActivation access$toTokenActivation(TokenCompatActivationResponse tokenCompatActivationResponse, String str) {
        String upperCase = tokenCompatActivationResponse.getData().getSeed().toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        String base64 = EncodingUtilsKt.toBase64(EncodingUtilsKt.hexStringToByteArray$default(upperCase, null, 1, null));
        return new TokenActivation(str, tokenCompatActivationResponse.getData().getActivationData(), tokenCompatActivationResponse.getData().getConfiguration(), base64, 0L, 16, null);
    }
}
