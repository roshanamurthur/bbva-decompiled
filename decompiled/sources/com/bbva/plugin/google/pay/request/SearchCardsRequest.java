package com.bbva.plugin.google.pay.request;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.mypinpad.tsdk.isolation.y2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SearchCardsRequest.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/bbva/plugin/google/pay/request/SearchCardsRequest;", "", "state", "", "(Ljava/lang/String;)V", "getState", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "google-pay-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SearchCardsRequest {

    @Nullable
    private final String state;

    public SearchCardsRequest(@Nullable String str) {
        this.state = str;
    }

    public static /* synthetic */ SearchCardsRequest copy$default(SearchCardsRequest searchCardsRequest, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = searchCardsRequest.state;
        }
        return searchCardsRequest.copy(str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getState() {
        return this.state;
    }

    @NotNull
    public final SearchCardsRequest copy(@Nullable String state) {
        return new SearchCardsRequest(state);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SearchCardsRequest) && Intrinsics.areEqual(this.state, ((SearchCardsRequest) other).state);
    }

    @Nullable
    public final String getState() {
        return this.state;
    }

    public int hashCode() {
        String str = this.state;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @NotNull
    public String toString() {
        return y2.b(new StringBuilder("SearchCardsRequest(state="), this.state, RootService.CLOSE_BRACKET);
    }
}
