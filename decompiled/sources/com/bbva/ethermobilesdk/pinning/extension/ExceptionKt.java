package com.bbva.ethermobilesdk.pinning.extension;

import com.bbva.ethermobilesdk.cipher.error.TrustVerifierErrorType;
import com.bbva.ethermobilesdk.pinning.exception.PinningException;
import com.bbva.ethermobilesdk.pinning.logger.LoggerKt;
import com.bbva.ethermobilesdk.pinning.model.result.ErrorType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Exception.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00072\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0000\u001a\f\u0010\b\u001a\u00020\t*\u00020\u0005H\u0000¨\u0006\n"}, d2 = {"throwError", "", "error", "Lcom/bbva/ethermobilesdk/pinning/model/result/ErrorType;", "ex", "", "message", "", "cipherToPinningException", "Lcom/bbva/ethermobilesdk/pinning/exception/PinningException;", "pinning_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ExceptionKt {
    @NotNull
    public static final PinningException cipherToPinningException(@NotNull Throwable th2) {
        Intrinsics.checkNotNullParameter(th2, "<this>");
        if (th2 instanceof TrustVerifierErrorType.TrustDateAfterValidity) {
            return new PinningException(new ErrorType.TrustDateAfterValidity(((TrustVerifierErrorType.TrustDateAfterValidity) th2).getDate()), th2);
        }
        if (th2 instanceof TrustVerifierErrorType.TrustDateBeforeValidity) {
            return new PinningException(new ErrorType.TrustDateBeforeValidity(((TrustVerifierErrorType.TrustDateBeforeValidity) th2).getDate()), th2);
        }
        return th2 instanceof TrustVerifierErrorType.TrustServerHandshakeError ? new PinningException(new ErrorType.TrustServerHandshakeError(((TrustVerifierErrorType.TrustServerHandshakeError) th2).getMessage()), th2) : new PinningException(ErrorType.TrustUnknownError.INSTANCE, null, 2, null);
    }

    @NotNull
    public static final Void throwError(@NotNull ErrorType error, @Nullable Throwable th2) throws PinningException {
        Intrinsics.checkNotNullParameter(error, "error");
        LoggerKt.logError(error.getDescription(), th2);
        throw new PinningException(error, th2);
    }

    public static /* synthetic */ Void throwError$default(ErrorType errorType, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        return throwError(errorType, th2);
    }

    public static /* synthetic */ Void throwError$default(String str, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        return throwError(str, th2);
    }

    @NotNull
    public static final Void throwError(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        LoggerKt.logError$default(message, null, 2, null);
        throw new IllegalStateException(message);
    }

    @NotNull
    public static final Void throwError(@NotNull String error, @Nullable Throwable th2) {
        Intrinsics.checkNotNullParameter(error, "error");
        LoggerKt.logError(error, th2);
        throw new IllegalStateException(error, th2);
    }
}
