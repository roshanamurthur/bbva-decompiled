package com.viergegroup.sdk.taptophone.ui;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u000b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/viergegroup/sdk/taptophone/ui/ViewData;", "", "", "onCleared", "Lcom/viergegroup/sdk/taptophone/ui/HoldStrategy;", "holdStrategy", "Lcom/viergegroup/sdk/taptophone/ui/HoldStrategy;", "getHoldStrategy", "()Lcom/viergegroup/sdk/taptophone/ui/HoldStrategy;", "Lcom/viergegroup/sdk/taptophone/ui/DisplaySchemeHapticsViewData;", "Lcom/viergegroup/sdk/taptophone/ui/ProcessingFinishedViewData;", "Lcom/viergegroup/sdk/taptophone/ui/SessionErrorViewData;", "Lcom/viergegroup/sdk/taptophone/ui/TerminalActivatingViewData;", "Lcom/viergegroup/sdk/taptophone/ui/TerminalErrorViewData;", "Lcom/viergegroup/sdk/taptophone/ui/TerminalInProcessingViewData;", "Lcom/viergegroup/sdk/taptophone/ui/TerminalInSessionViewData;", "Lcom/viergegroup/sdk/taptophone/ui/TerminalInitialisingViewData;", "Lcom/viergegroup/sdk/taptophone/ui/TerminalNotCreatedViewData;", "Lcom/viergegroup/sdk/taptophone/ui/TerminalReadyViewData;", "Lcom/viergegroup/sdk/taptophone/ui/TerminalSessionTimeoutViewData;", "PinPadSdk1032_1.0.32E_release"}, k = 1, mv = {1, 8, 0})
public abstract class ViewData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final HoldStrategy f67616a;

    public ViewData(HoldStrategy holdStrategy, DefaultConstructorMarker defaultConstructorMarker) {
        this.f67616a = holdStrategy;
    }

    @NotNull
    /* JADX INFO: renamed from: getHoldStrategy, reason: from getter */
    public final HoldStrategy getF67616a() {
        return this.f67616a;
    }

    public /* synthetic */ ViewData(HoldStrategy holdStrategy, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? HoldStrategy.None.INSTANCE : holdStrategy, null);
    }

    public void onCleared() {
    }
}
