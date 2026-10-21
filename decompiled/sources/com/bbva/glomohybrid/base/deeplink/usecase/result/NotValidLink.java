package com.bbva.glomohybrid.base.deeplink.usecase.result;

import ad.d;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DynamicLinkResult.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/bbva/glomohybrid/base/deeplink/usecase/result/NotValidLink;", "Lcom/bbva/glomohybrid/base/deeplink/usecase/result/DynamicLinkResult;", "", "component1", "error", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/String;", "getError", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "Base_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class NotValidLink extends DynamicLinkResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String error;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotValidLink(@NotNull String error) {
        super(null);
        Intrinsics.checkNotNullParameter(error, "error");
        this.error = error;
    }

    public static /* synthetic */ NotValidLink copy$default(NotValidLink notValidLink, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = notValidLink.error;
        }
        return notValidLink.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getError() {
        return this.error;
    }

    @NotNull
    public final NotValidLink copy(@NotNull String error) {
        Intrinsics.checkNotNullParameter(error, "error");
        return new NotValidLink(error);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof NotValidLink) && Intrinsics.areEqual(this.error, ((NotValidLink) other).error);
    }

    @NotNull
    public final String getError() {
        return this.error;
    }

    public int hashCode() {
        return this.error.hashCode();
    }

    @NotNull
    public String toString() {
        return d.f(new StringBuilder("NotValidLink(error="), this.error, ")");
    }
}
