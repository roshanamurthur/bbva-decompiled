package com.bbva.component.dm.naturalauth.domain.model.params;

import ad.d;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ListAuthenticatorsParams.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0005\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0011\u0010\r\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/bbva/component/dm/naturalauth/domain/model/params/ListAuthenticatorsParams;", "", "", "consumerId", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "getOriginAppId", "()Ljava/lang/String;", Constants.originAppId, "<init>", "(Ljava/lang/String;)V", "component-dm-naturalauth_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class ListAuthenticatorsParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f27883a;

    public ListAuthenticatorsParams(@NotNull String consumerId) {
        Intrinsics.checkNotNullParameter(consumerId, "consumerId");
        this.f27883a = consumerId;
    }

    public static /* synthetic */ ListAuthenticatorsParams copy$default(ListAuthenticatorsParams listAuthenticatorsParams, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = listAuthenticatorsParams.f27883a;
        }
        return listAuthenticatorsParams.copy(str);
    }

    @NotNull
    public final ListAuthenticatorsParams copy(@NotNull String consumerId) {
        Intrinsics.checkNotNullParameter(consumerId, "consumerId");
        return new ListAuthenticatorsParams(consumerId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ListAuthenticatorsParams) && Intrinsics.areEqual(this.f27883a, ((ListAuthenticatorsParams) other).f27883a);
    }

    @NotNull
    /* JADX INFO: renamed from: getOriginAppId, reason: from getter */
    public final String getF27883a() {
        return this.f27883a;
    }

    public int hashCode() {
        return this.f27883a.hashCode();
    }

    @NotNull
    public String toString() {
        return d.f(new StringBuilder("ListAuthenticatorsParams(consumerId="), this.f27883a, ")");
    }
}
