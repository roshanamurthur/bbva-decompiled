package com.bbva.ethermobilesdk.tokencompat.extension;

import com.bbva.ethermobile.help.kit.error.ResultErrorType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Throwable.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¨\u0006\u0006"}, d2 = {"throwError", "", "error", "Lcom/bbva/ethermobile/help/kit/error/ResultErrorType;", "ex", "", "ethertoken-compat_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ThrowableKt {
    @NotNull
    public static final Void throwError(@NotNull ResultErrorType error, @Nullable Throwable th2) throws ResultErrorType {
        Intrinsics.checkNotNullParameter(error, "error");
        LoggerKt.logError(error.getMessage(), th2);
        throw error;
    }

    public static /* synthetic */ Void throwError$default(ResultErrorType resultErrorType, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        return throwError(resultErrorType, th2);
    }
}
