package com.bbva.push.model;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.mypinpad.tsdk.isolation.y2;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TokenResult.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/bbva/push/model/TokenError;", "Lcom/bbva/push/model/TokenResult;", "", "component1", "message", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "push_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class TokenError extends TokenResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String message;

    /* JADX WARN: Multi-variable type inference failed */
    public TokenError() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ TokenError copy$default(TokenError tokenError, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = tokenError.message;
        }
        return tokenError.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final TokenError copy(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return new TokenError(message);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TokenError) && Intrinsics.areEqual(this.message, ((TokenError) other).message);
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return this.message.hashCode();
    }

    @NotNull
    public String toString() {
        return y2.b(new StringBuilder("TokenError(message="), this.message, RootService.CLOSE_BRACKET);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenError(@NotNull String message) {
        super(null);
        Intrinsics.checkNotNullParameter(message, "message");
        this.message = message;
    }

    public /* synthetic */ TokenError(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str);
    }
}
