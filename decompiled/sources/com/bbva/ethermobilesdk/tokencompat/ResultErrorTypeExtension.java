package com.bbva.ethermobilesdk.tokencompat;

import androidx.annotation.Keep;
import com.bbva.ethermobile.help.kit.error.ResultErrorType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TokenCompatError.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\b\b'\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/ResultErrorTypeExtension;", "Lcom/bbva/ethermobile/help/kit/error/ResultErrorType;", "code", "", "message", "", "cause", "", "(ILjava/lang/String;Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "getCode", "()I", "getMessage", "()Ljava/lang/String;", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class ResultErrorTypeExtension extends ResultErrorType {

    @Nullable
    private final Throwable cause;
    private final int code;

    @NotNull
    private final String message;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResultErrorTypeExtension(int i10, @NotNull String message, @Nullable Throwable th2) {
        super(i10, message);
        Intrinsics.checkNotNullParameter(message, "message");
        this.code = i10;
        this.message = message;
        this.cause = th2;
    }

    @Override // java.lang.Throwable
    @Nullable
    public Throwable getCause() {
        return this.cause;
    }

    @Override // com.bbva.ethermobile.help.kit.error.ResultErrorType
    public int getCode() {
        return this.code;
    }

    @Override // com.bbva.ethermobile.help.kit.error.ResultErrorType, java.lang.Throwable
    @NotNull
    public String getMessage() {
        return this.message;
    }
}
