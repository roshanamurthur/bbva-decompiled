package com.bbva.ethermobile.help.kit.error;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ResultErrorType.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/bbva/ethermobile/help/kit/error/ResultErrorType;", "", "code", "", "message", "", "(ILjava/lang/String;)V", "getCode", "()I", "getMessage", "()Ljava/lang/String;", "help-kit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class ResultErrorType extends Throwable {
    private final int code;

    @NotNull
    private final String message;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResultErrorType(int i10, @NotNull String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
        this.code = i10;
        this.message = message;
    }

    public int getCode() {
        return this.code;
    }

    @Override // java.lang.Throwable
    @NotNull
    public String getMessage() {
        return this.message;
    }
}
