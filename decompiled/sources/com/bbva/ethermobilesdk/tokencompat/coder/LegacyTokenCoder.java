package com.bbva.ethermobilesdk.tokencompat.coder;

import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.ethermobilesdk.cipher.utils.EncodingUtilsKt;
import com.bbva.ethermobilesdk.tokencompat.extension.LoggerKt;
import com.bbva.ethermobilesdk.tokencompat.model.legacy.LegacyToken;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LegacyTokenCoder.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010\t\u001a\u00020\u0005¨\u0006\n"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/coder/LegacyTokenCoder;", "", "()V", "decode", "Lcom/bbva/ethermobile/help/kit/result/Result;", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/LegacyToken;", "encodedLegacyToken", "", "encode", "legacyToken", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLegacyTokenCoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyTokenCoder.kt\ncom/bbva/ethermobilesdk/tokencompat/coder/LegacyTokenCoder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,40:1\n1#2:41\n*E\n"})
public final class LegacyTokenCoder {

    @NotNull
    public static final LegacyTokenCoder INSTANCE = new LegacyTokenCoder();

    @NotNull
    public final Result<LegacyToken> decode(@NotNull String encodedLegacyToken) {
        Object objM5535constructorimpl;
        Object objM5535constructorimpl2;
        Intrinsics.checkNotNullParameter(encodedLegacyToken, "encodedLegacyToken");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(EncodingUtilsKt.toSimpleString(EncodingUtilsKt.base64ToByteArray(encodedLegacyToken)));
        } catch (Throwable th2) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM5538exceptionOrNullimpl = kotlin.Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
        if (thM5538exceptionOrNullimpl != null) {
            LoggerKt.logError("Failed to decode legacyToken", thM5538exceptionOrNullimpl);
            return new Result.Error(thM5538exceptionOrNullimpl);
        }
        try {
            objM5535constructorimpl2 = kotlin.Result.m5535constructorimpl(new Result.Success(LegacyToken.INSTANCE.from((String) objM5535constructorimpl)));
        } catch (Throwable th3) {
            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
            objM5535constructorimpl2 = kotlin.Result.m5535constructorimpl(ResultKt.createFailure(th3));
        }
        Throwable thM5538exceptionOrNullimpl2 = kotlin.Result.m5538exceptionOrNullimpl(objM5535constructorimpl2);
        if (thM5538exceptionOrNullimpl2 != null) {
            LoggerKt.logError("Failed to build legacyToken from serialized token", thM5538exceptionOrNullimpl2);
            objM5535constructorimpl2 = new Result.Error(thM5538exceptionOrNullimpl2);
        }
        return (Result) objM5535constructorimpl2;
    }

    @NotNull
    public final Result<String> encode(@NotNull LegacyToken legacyToken) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(legacyToken, "legacyToken");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            byte[] bytes = legacyToken.serialized$ethertoken_compat_release().getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(new Result.Success(EncodingUtilsKt.toBase64(bytes)));
        } catch (Throwable th2) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM5538exceptionOrNullimpl = kotlin.Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
        if (thM5538exceptionOrNullimpl != null) {
            LoggerKt.logError("Failed to encode legacyToken", thM5538exceptionOrNullimpl);
            objM5535constructorimpl = new Result.Error(thM5538exceptionOrNullimpl);
        }
        return (Result) objM5535constructorimpl;
    }
}
