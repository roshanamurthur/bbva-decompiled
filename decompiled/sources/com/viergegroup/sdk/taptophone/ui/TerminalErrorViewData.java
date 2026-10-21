package com.viergegroup.sdk.taptophone.ui;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/viergegroup/sdk/taptophone/ui/TerminalErrorViewData;", "Lcom/viergegroup/sdk/taptophone/ui/ViewData;", "cause", "", "logMessage", "", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "getLogMessage", "()Ljava/lang/String;", "PinPadSdk1032_1.0.32E_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TerminalErrorViewData extends ViewData {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f67611b;

    public /* synthetic */ TerminalErrorViewData(Throwable th2, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(th2, (i10 & 2) != 0 ? SequencesKt___SequencesKt.joinToString$default(SequencesKt__SequencesKt.generateSequence(th2, new PropertyReference1Impl() { // from class: com.viergegroup.sdk.taptophone.ui.TerminalErrorViewData.a
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            @Nullable
            public final Object get(@Nullable Object obj) {
                return ((Throwable) obj).getCause();
            }
        }), null, "causedBy[", "]\n", 0, null, null, 57, null) : str);
    }

    @NotNull
    /* JADX INFO: renamed from: getLogMessage, reason: from getter */
    public final String getF67611b() {
        return this.f67611b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TerminalErrorViewData(@NotNull Throwable th2, @NotNull String str) {
        super(null, 1, null);
        Intrinsics.checkNotNullParameter(th2, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.f67611b = str;
    }
}
