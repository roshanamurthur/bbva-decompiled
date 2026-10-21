package com.viergegroup.sdk.taptophone.ui;

import com.mypinpad.tsdk.api.TerminalSession;
import com.mypinpad.tsdk.api.callbacks.UiMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/viergegroup/sdk/taptophone/ui/TerminalInProcessingViewData;", "Lcom/viergegroup/sdk/taptophone/ui/ViewData;", "session", "Lcom/mypinpad/tsdk/api/TerminalSession;", "uiMessage", "Lcom/mypinpad/tsdk/api/callbacks/UiMessage;", "holdTimeMs", "", "(Lcom/mypinpad/tsdk/api/TerminalSession;Lcom/mypinpad/tsdk/api/callbacks/UiMessage;J)V", "getSession", "()Lcom/mypinpad/tsdk/api/TerminalSession;", "getUiMessage", "()Lcom/mypinpad/tsdk/api/callbacks/UiMessage;", "onCleared", "", "PinPadSdk1032_1.0.32E_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TerminalInProcessingViewData extends ViewData {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final TerminalSession f67613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final UiMessage f67614c;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TerminalInProcessingViewData(TerminalSession terminalSession, UiMessage uiMessage, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        uiMessage = (i10 & 2) != 0 ? null : uiMessage;
        this(terminalSession, uiMessage, (i10 & 4) != 0 ? uiMessage != null ? ViewDataKt.access$holdTimeMs(uiMessage) : 0L : j10);
    }

    @NotNull
    /* JADX INFO: renamed from: getSession, reason: from getter */
    public final TerminalSession getF67613b() {
        return this.f67613b;
    }

    @Nullable
    /* JADX INFO: renamed from: getUiMessage, reason: from getter */
    public final UiMessage getF67614c() {
        return this.f67614c;
    }

    @Override // com.viergegroup.sdk.taptophone.ui.ViewData
    public final void onCleared() {
        this.f67613b.deactivate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TerminalInProcessingViewData(@NotNull TerminalSession terminalSession, @Nullable UiMessage uiMessage, long j10) {
        super(new HoldStrategy.Milliseconds(j10), null);
        Intrinsics.checkNotNullParameter(terminalSession, "");
        this.f67613b = terminalSession;
        this.f67614c = uiMessage;
    }
}
