package com.bbva.ethermobilesdk.securesharing.extension;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Exception.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0000¨\u0006\u0006"}, d2 = {"throwError", "", "message", "", "exception", "Ljava/lang/Exception;", "securesharing_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class ExceptionKt {
    @NotNull
    public static final Void throwError(@NotNull String message, @Nullable Exception exc) throws Exception {
        Intrinsics.checkNotNullParameter(message, "message");
        LoggerKt.logError(message, exc);
        if (exc == null) {
            throw new IllegalStateException(message);
        }
        throw exc;
    }

    public static /* synthetic */ Void throwError$default(String str, Exception exc, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            exc = null;
        }
        return throwError(str, exc);
    }
}
