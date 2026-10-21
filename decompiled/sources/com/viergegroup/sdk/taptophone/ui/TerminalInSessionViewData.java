package com.viergegroup.sdk.taptophone.ui;

import com.mypinpad.tsdk.api.TerminalSession;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/viergegroup/sdk/taptophone/ui/TerminalInSessionViewData;", "Lcom/viergegroup/sdk/taptophone/ui/ViewData;", "session", "Lcom/mypinpad/tsdk/api/TerminalSession;", "(Lcom/mypinpad/tsdk/api/TerminalSession;)V", "getSession", "()Lcom/mypinpad/tsdk/api/TerminalSession;", "onCleared", "", "PinPadSdk1032_1.0.32E_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TerminalInSessionViewData extends ViewData {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final TerminalSession f67615b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TerminalInSessionViewData(@NotNull TerminalSession terminalSession) {
        super(null, 1, null);
        Intrinsics.checkNotNullParameter(terminalSession, "");
        this.f67615b = terminalSession;
    }

    @NotNull
    /* JADX INFO: renamed from: getSession, reason: from getter */
    public final TerminalSession getF67615b() {
        return this.f67615b;
    }

    @Override // com.viergegroup.sdk.taptophone.ui.ViewData
    public final void onCleared() {
        this.f67615b.deactivate();
    }
}
