package com.bbva.ethermobilesdk.pinning.exception;

import com.bbva.ethermobilesdk.pinning.model.result.ErrorType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PinningException.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/bbva/ethermobilesdk/pinning/exception/PinningException;", "Ljava/lang/Exception;", "error", "Lcom/bbva/ethermobilesdk/pinning/model/result/ErrorType;", "cause", "", "(Lcom/bbva/ethermobilesdk/pinning/model/result/ErrorType;Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "getError", "()Lcom/bbva/ethermobilesdk/pinning/model/result/ErrorType;", "pinning_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PinningException extends Exception {

    @Nullable
    private final Throwable cause;

    @NotNull
    private final ErrorType error;

    public /* synthetic */ PinningException(ErrorType errorType, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(errorType, (i10 & 2) != 0 ? null : th2);
    }

    @Override // java.lang.Throwable
    @Nullable
    public Throwable getCause() {
        return this.cause;
    }

    @NotNull
    public final ErrorType getError() {
        return this.error;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinningException(@NotNull ErrorType error, @Nullable Throwable th2) {
        super(error.getDescription(), th2);
        Intrinsics.checkNotNullParameter(error, "error");
        this.error = error;
        this.cause = th2;
    }
}
