package com.viergegroup.sdk.taptophone.ui;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/viergegroup/sdk/taptophone/ui/SessionErrorViewData;", "Lcom/viergegroup/sdk/taptophone/ui/ViewData;", "cause", "", "(Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "PinPadSdk1032_1.0.32E_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SessionErrorViewData extends ViewData {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Throwable f67610b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionErrorViewData(@NotNull Throwable th2) {
        super(null, 1, null);
        Intrinsics.checkNotNullParameter(th2, "");
        this.f67610b = th2;
    }

    @NotNull
    /* JADX INFO: renamed from: getCause, reason: from getter */
    public final Throwable getF67610b() {
        return this.f67610b;
    }
}
