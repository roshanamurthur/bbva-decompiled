package com.bbva.component.ay.catalyst.data.response;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CatalystCustomError.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/bbva/component/ay/catalyst/data/response/CatalystCustomError;", "", "", "component1", "", "component2", "code", "message", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "p0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getCode", "()I", "q0", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "<init>", "(ILjava/lang/String;)V", "component-ay-catalyst_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class CatalystCustomError extends Throwable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    public final int code;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String message;

    public CatalystCustomError(int i10, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.code = i10;
        this.message = message;
    }

    public static /* synthetic */ CatalystCustomError copy$default(CatalystCustomError catalystCustomError, int i10, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = catalystCustomError.code;
        }
        if ((i11 & 2) != 0) {
            str = catalystCustomError.getMessage();
        }
        return catalystCustomError.copy(i10, str);
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
    public final CatalystCustomError copy(int code, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return new CatalystCustomError(code, message);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CatalystCustomError)) {
            return false;
        }
        CatalystCustomError catalystCustomError = (CatalystCustomError) other;
        return this.code == catalystCustomError.code && Intrinsics.areEqual(getMessage(), catalystCustomError.getMessage());
    }

    public final int getCode() {
        return this.code;
    }

    @Override // java.lang.Throwable
    @NotNull
    public String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return getMessage().hashCode() + (this.code * 31);
    }

    @Override // java.lang.Throwable
    @NotNull
    public String toString() {
        return "CatalystCustomError(code=" + this.code + ", message=" + getMessage() + RootService.CLOSE_BRACKET;
    }
}
