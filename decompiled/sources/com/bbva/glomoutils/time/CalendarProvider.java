package com.bbva.glomoutils.time;

import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CalendarProvider.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/bbva/glomoutils/time/CalendarProvider;", "", "()V", "get", "Ljava/util/Calendar;", "gl-utils_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CalendarProvider {

    @NotNull
    public static final CalendarProvider INSTANCE = new CalendarProvider();

    @NotNull
    public final Calendar get() {
        Calendar calendar = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(calendar, "getInstance(...)");
        return calendar;
    }
}
