package com.bbva.ui.components.timer;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TimeFormat.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001¨\u0006\u0004"}, d2 = {"toMilliSeconds", "", "Lcom/bbva/ui/components/timer/TimeFormat;", "time", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TimeFormatKt {
    public static final long toMilliSeconds(@NotNull TimeFormat timeFormat, long j10) {
        Intrinsics.checkNotNullParameter(timeFormat, "<this>");
        return timeFormat.getConversionFactor() * j10;
    }
}
