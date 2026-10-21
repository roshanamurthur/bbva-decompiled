package com.bbva.plugin.push.command.response;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GetMessagesResponse.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/bbva/plugin/push/command/response/WebBulkMessagesResponse;", "", "bulk", "Lcom/bbva/plugin/push/command/response/WebMessagesResponse;", "(Lcom/bbva/plugin/push/command/response/WebMessagesResponse;)V", "getBulk", "()Lcom/bbva/plugin/push/command/response/WebMessagesResponse;", "component1", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "push-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class WebBulkMessagesResponse {

    @NotNull
    private final WebMessagesResponse bulk;

    public WebBulkMessagesResponse(@NotNull WebMessagesResponse bulk) {
        Intrinsics.checkNotNullParameter(bulk, "bulk");
        this.bulk = bulk;
    }

    public static /* synthetic */ WebBulkMessagesResponse copy$default(WebBulkMessagesResponse webBulkMessagesResponse, WebMessagesResponse webMessagesResponse, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            webMessagesResponse = webBulkMessagesResponse.bulk;
        }
        return webBulkMessagesResponse.copy(webMessagesResponse);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final WebMessagesResponse getBulk() {
        return this.bulk;
    }

    @NotNull
    public final WebBulkMessagesResponse copy(@NotNull WebMessagesResponse bulk) {
        Intrinsics.checkNotNullParameter(bulk, "bulk");
        return new WebBulkMessagesResponse(bulk);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof WebBulkMessagesResponse) && Intrinsics.areEqual(this.bulk, ((WebBulkMessagesResponse) other).bulk);
    }

    @NotNull
    public final WebMessagesResponse getBulk() {
        return this.bulk;
    }

    public int hashCode() {
        return this.bulk.hashCode();
    }

    @NotNull
    public String toString() {
        return "WebBulkMessagesResponse(bulk=" + this.bulk + RootService.CLOSE_BRACKET;
    }
}
