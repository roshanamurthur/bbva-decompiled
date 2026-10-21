package com.bbva.ethermobilesdk.sslpinning.exception;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.sl.ar.android.sslpinning.exception.InitializationException;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RepositoryInitializationException.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J'\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\t\u0010\f\u001a\u00020\u0004HÖ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\n\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/bbva/ethermobilesdk/sslpinning/exception/RepositoryInitializationException;", "Lcom/bbva/sl/ar/android/sslpinning/exception/InitializationException;", "", "component1", "", "component2", "", "component3", "code", "message", "cause", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "p0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getCode", "()I", "q0", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "r0", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "<init>", "(ILjava/lang/String;Ljava/lang/Throwable;)V", "sslpinning_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class RepositoryInitializationException extends InitializationException {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    public final int code;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String message;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Throwable cause;

    public RepositoryInitializationException(int i10, @NotNull String str, @NotNull Throwable th2) {
        super(i10, str, th2);
        this.code = i10;
        this.message = str;
        this.cause = th2;
    }

    public static /* synthetic */ RepositoryInitializationException copy$default(RepositoryInitializationException repositoryInitializationException, int i10, String str, Throwable th2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = repositoryInitializationException.code;
        }
        if ((i11 & 2) != 0) {
            str = repositoryInitializationException.getMessage();
        }
        if ((i11 & 4) != 0) {
            th2 = repositoryInitializationException.getCause();
        }
        return repositoryInitializationException.copy(i10, str, th2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final String component2() {
        return getMessage();
    }

    @NotNull
    public final Throwable component3() {
        return getCause();
    }

    @NotNull
    public final RepositoryInitializationException copy(int code, @NotNull String message, @NotNull Throwable cause) {
        return new RepositoryInitializationException(code, message, cause);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RepositoryInitializationException)) {
            return false;
        }
        RepositoryInitializationException repositoryInitializationException = (RepositoryInitializationException) other;
        return this.code == repositoryInitializationException.code && Intrinsics.areEqual(getMessage(), repositoryInitializationException.getMessage()) && Intrinsics.areEqual(getCause(), repositoryInitializationException.getCause());
    }

    @Override // java.lang.Throwable
    @NotNull
    public Throwable getCause() {
        return this.cause;
    }

    public final int getCode() {
        return this.code;
    }

    @Override // com.bbva.sl.ar.android.sslpinning.exception.ErrorCodeException, java.lang.Throwable
    @NotNull
    public String getMessage() {
        return this.message;
    }

    public int hashCode() {
        int i10 = this.code * 31;
        String message = getMessage();
        int iHashCode = (i10 + (message != null ? message.hashCode() : 0)) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    @NotNull
    public String toString() {
        return "RepositoryInitializationException(code=" + this.code + ", message=" + getMessage() + ", cause=" + getCause() + ")";
    }
}
