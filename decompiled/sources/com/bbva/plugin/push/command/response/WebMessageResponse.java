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
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/bbva/plugin/push/command/response/WebMessageResponse;", "", "id", "", "read", "", "favorite", "push", "Lcom/bbva/plugin/push/command/response/WebPushResponse;", "(Ljava/lang/String;ZZLcom/bbva/plugin/push/command/response/WebPushResponse;)V", "getFavorite", "()Z", "getId", "()Ljava/lang/String;", "getPush", "()Lcom/bbva/plugin/push/command/response/WebPushResponse;", "getRead", "component1", "component2", "component3", "component4", "copy", "equals", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "push-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class WebMessageResponse {
    private final boolean favorite;

    @NotNull
    private final String id;

    @NotNull
    private final WebPushResponse push;
    private final boolean read;

    public WebMessageResponse(@NotNull String id, boolean z10, boolean z11, @NotNull WebPushResponse push) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(push, "push");
        this.id = id;
        this.read = z10;
        this.favorite = z11;
        this.push = push;
    }

    public static /* synthetic */ WebMessageResponse copy$default(WebMessageResponse webMessageResponse, String str, boolean z10, boolean z11, WebPushResponse webPushResponse, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = webMessageResponse.id;
        }
        if ((i10 & 2) != 0) {
            z10 = webMessageResponse.read;
        }
        if ((i10 & 4) != 0) {
            z11 = webMessageResponse.favorite;
        }
        if ((i10 & 8) != 0) {
            webPushResponse = webMessageResponse.push;
        }
        return webMessageResponse.copy(str, z10, z11, webPushResponse);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getFavorite() {
        return this.favorite;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final WebPushResponse getPush() {
        return this.push;
    }

    @NotNull
    public final WebMessageResponse copy(@NotNull String id, boolean read, boolean favorite, @NotNull WebPushResponse push) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(push, "push");
        return new WebMessageResponse(id, read, favorite, push);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WebMessageResponse)) {
            return false;
        }
        WebMessageResponse webMessageResponse = (WebMessageResponse) other;
        return Intrinsics.areEqual(this.id, webMessageResponse.id) && this.read == webMessageResponse.read && this.favorite == webMessageResponse.favorite && Intrinsics.areEqual(this.push, webMessageResponse.push);
    }

    public final boolean getFavorite() {
        return this.favorite;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final WebPushResponse getPush() {
        return this.push;
    }

    public final boolean getRead() {
        return this.read;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        boolean z10 = this.read;
        ?? r1 = z10;
        if (z10) {
            r1 = 1;
        }
        int i10 = (iHashCode + r1) * 31;
        boolean z11 = this.favorite;
        return this.push.hashCode() + ((i10 + (z11 ? 1 : z11)) * 31);
    }

    @NotNull
    public String toString() {
        return "WebMessageResponse(id=" + this.id + ", read=" + this.read + ", favorite=" + this.favorite + ", push=" + this.push + RootService.CLOSE_BRACKET;
    }
}
