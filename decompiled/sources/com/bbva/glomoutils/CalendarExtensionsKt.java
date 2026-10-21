package com.bbva.glomoutils;

import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.glomoutils.time.CalendarProvider;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CalendarExtensions.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u001a\u0010\b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005¨\u0006\t"}, d2 = {"Ljava/util/Calendar;", "", "dateToCompare", "", "isSameDay", "", EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "isTimeInRange", "gl-utils_release"}, k = 2, mv = {1, 9, 0})
public final class CalendarExtensionsKt {
    public static final boolean isSameDay(@NotNull Calendar calendar, long j10) {
        Intrinsics.checkNotNullParameter(calendar, "<this>");
        Calendar calendar2 = CalendarProvider.INSTANCE.get();
        calendar2.setTimeInMillis(j10);
        return calendar2.get(6) == calendar.get(6) && calendar2.get(1) == calendar.get(1);
    }

    public static final boolean isTimeInRange(@NotNull Calendar calendar, @NotNull String start, @NotNull String end) {
        Calendar calendarDate;
        Intrinsics.checkNotNullParameter(calendar, "<this>");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        Calendar calendarDate2 = StringDateExtensionsKt.toCalendarDate(start, "HH:mm");
        if (calendarDate2 == null || (calendarDate = StringDateExtensionsKt.toCalendarDate(end, "HH:mm")) == null) {
            return false;
        }
        int i10 = calendar.get(11);
        int i11 = calendar.get(12);
        int i12 = calendarDate2.get(11);
        int i13 = calendarDate2.get(12);
        if (i10 < i12) {
            return false;
        }
        if (i10 == i12 && i11 < i13) {
            return false;
        }
        int i14 = calendar.get(11);
        int i15 = calendar.get(12);
        int i16 = calendarDate.get(11);
        int i17 = calendarDate.get(12);
        if (i14 <= i16) {
            return i14 != i16 || i15 <= i17;
        }
        return false;
    }
}
