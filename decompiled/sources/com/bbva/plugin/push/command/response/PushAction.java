package com.bbva.plugin.push.command.response;

import androidx.annotation.Keep;
import com.bbva.androidtoolkit.plugin.postmessage.PayloadDTO;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.push.model.Push;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PushAction.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/bbva/plugin/push/command/response/PushAction;", "Lcom/bbva/androidtoolkit/plugin/postmessage/PayloadDTO;", "action", "", "push", "Lcom/bbva/push/model/Push;", "(Ljava/lang/String;Lcom/bbva/push/model/Push;)V", "getAction", "()Ljava/lang/String;", "getPush", "()Lcom/bbva/push/model/Push;", "component1", "component2", "copy", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "push-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PushAction extends PayloadDTO {

    @NotNull
    private final String action;

    @NotNull
    private final Push push;

    public PushAction(@NotNull String action, @NotNull Push push) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(push, "push");
        this.action = action;
        this.push = push;
    }

    public static /* synthetic */ PushAction copy$default(PushAction pushAction, String str, Push push, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = pushAction.action;
        }
        if ((i10 & 2) != 0) {
            push = pushAction.push;
        }
        return pushAction.copy(str, push);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Push getPush() {
        return this.push;
    }

    @NotNull
    public final PushAction copy(@NotNull String action, @NotNull Push push) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(push, "push");
        return new PushAction(action, push);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PushAction)) {
            return false;
        }
        PushAction pushAction = (PushAction) other;
        return Intrinsics.areEqual(this.action, pushAction.action) && Intrinsics.areEqual(this.push, pushAction.push);
    }

    @NotNull
    public final String getAction() {
        return this.action;
    }

    @NotNull
    public final Push getPush() {
        return this.push;
    }

    public int hashCode() {
        return this.push.hashCode() + (this.action.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "PushAction(action=" + this.action + ", push=" + this.push + RootService.CLOSE_BRACKET;
    }

    public /* synthetic */ PushAction(String str, Push push, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "onNotification" : str, push);
    }
}
