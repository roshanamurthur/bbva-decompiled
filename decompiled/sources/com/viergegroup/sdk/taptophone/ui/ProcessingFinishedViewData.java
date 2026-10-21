package com.viergegroup.sdk.taptophone.ui;

import com.mypinpad.tsdk.api.callbacks.UiMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/viergegroup/sdk/taptophone/ui/ProcessingFinishedViewData;", "Lcom/viergegroup/sdk/taptophone/ui/ViewData;", "logMessage", "", "uiMessage", "Lcom/mypinpad/tsdk/api/callbacks/UiMessage;", "minimumHoldTimeMs", "", "(Ljava/lang/String;Lcom/mypinpad/tsdk/api/callbacks/UiMessage;J)V", "getLogMessage", "()Ljava/lang/String;", "getUiMessage", "()Lcom/mypinpad/tsdk/api/callbacks/UiMessage;", "PinPadSdk1032_1.0.32E_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ProcessingFinishedViewData extends ViewData {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f67608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final UiMessage f67609c;

    public /* synthetic */ ProcessingFinishedViewData(String str, UiMessage uiMessage, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : uiMessage, (i10 & 4) != 0 ? 3000L : j10);
    }

    @NotNull
    /* JADX INFO: renamed from: getLogMessage, reason: from getter */
    public final String getF67608b() {
        return this.f67608b;
    }

    @Nullable
    /* JADX INFO: renamed from: getUiMessage, reason: from getter */
    public final UiMessage getF67609c() {
        return this.f67609c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProcessingFinishedViewData(@NotNull String str, @Nullable UiMessage uiMessage, long j10) {
        super(new HoldStrategy.Milliseconds(Math.max(j10, uiMessage != null ? ViewDataKt.access$holdTimeMs(uiMessage) : 0L)), null);
        Intrinsics.checkNotNullParameter(str, "");
        this.f67608b = str;
        this.f67609c = uiMessage;
    }
}
