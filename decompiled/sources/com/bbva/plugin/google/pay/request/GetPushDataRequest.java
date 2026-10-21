package com.bbva.plugin.google.pay.request;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.mypinpad.tsdk.isolation.y2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GetPushDataRequest.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/bbva/plugin/google/pay/request/GetPushDataRequest;", "", "panTruncated", "", "(Ljava/lang/String;)V", "getPanTruncated", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "google-pay-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class GetPushDataRequest {

    @NotNull
    private final String panTruncated;

    public GetPushDataRequest(@NotNull String panTruncated) {
        Intrinsics.checkNotNullParameter(panTruncated, "panTruncated");
        this.panTruncated = panTruncated;
    }

    public static /* synthetic */ GetPushDataRequest copy$default(GetPushDataRequest getPushDataRequest, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = getPushDataRequest.panTruncated;
        }
        return getPushDataRequest.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPanTruncated() {
        return this.panTruncated;
    }

    @NotNull
    public final GetPushDataRequest copy(@NotNull String panTruncated) {
        Intrinsics.checkNotNullParameter(panTruncated, "panTruncated");
        return new GetPushDataRequest(panTruncated);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GetPushDataRequest) && Intrinsics.areEqual(this.panTruncated, ((GetPushDataRequest) other).panTruncated);
    }

    @NotNull
    public final String getPanTruncated() {
        return this.panTruncated;
    }

    public int hashCode() {
        return this.panTruncated.hashCode();
    }

    @NotNull
    public String toString() {
        return y2.b(new StringBuilder("GetPushDataRequest(panTruncated="), this.panTruncated, RootService.CLOSE_BRACKET);
    }
}
