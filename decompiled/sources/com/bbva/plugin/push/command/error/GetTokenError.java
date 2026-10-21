package com.bbva.plugin.push.command.error;

import com.bbva.androidtoolkit.plugin.response.ErrorMessage;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.mypinpad.tsdk.isolation.y2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: HandlerNotFoundError.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001J\t\u0010\b\u001a\u00020\u0004HÖ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¨\u0006\u0010"}, d2 = {"Lcom/bbva/plugin/push/command/error/GetTokenError;", "Lcom/bbva/androidtoolkit/plugin/response/ErrorMessage;", "", "getCode", "", "getMessage", "message", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "<init>", "(Ljava/lang/String;)V", "push-plugin_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class GetTokenError implements ErrorMessage {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final String f35940p0;

    public GetTokenError(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f35940p0 = message;
    }

    public static /* synthetic */ GetTokenError copy$default(GetTokenError getTokenError, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = getTokenError.f35940p0;
        }
        return getTokenError.copy(str);
    }

    @NotNull
    public final GetTokenError copy(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return new GetTokenError(message);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GetTokenError) && Intrinsics.areEqual(this.f35940p0, ((GetTokenError) other).f35940p0);
    }

    @Override // com.bbva.androidtoolkit.plugin.response.ErrorMessage
    public int getCode() {
        return 11;
    }

    @Override // com.bbva.androidtoolkit.plugin.response.ErrorMessage
    @NotNull
    /* JADX INFO: renamed from: getMessage, reason: from getter */
    public String getF35940p0() {
        return this.f35940p0;
    }

    public int hashCode() {
        return this.f35940p0.hashCode();
    }

    @NotNull
    public String toString() {
        return y2.b(new StringBuilder("GetTokenError(message="), this.f35940p0, RootService.CLOSE_BRACKET);
    }
}
