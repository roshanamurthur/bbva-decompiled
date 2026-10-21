package l0;

import androidx.compose.material3.CalendarDate;
import androidx.compose.material3.CalendarModel;
import androidx.compose.material3.CalendarModel_androidKt;
import androidx.compose.material3.CalendarMonth;
import androidx.compose.material3.DateInputFormat;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CalendarModel.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z {
    @NotNull
    public static String a(CalendarModel calendarModel, @NotNull CalendarDate date, @NotNull String skeleton, @NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(skeleton, "skeleton");
        Intrinsics.checkNotNullParameter(locale, "locale");
        return CalendarModel_androidKt.formatWithSkeleton(date.getUtcTimeMillis(), skeleton, locale);
    }

    @NotNull
    public static String b(CalendarModel calendarModel, @NotNull CalendarMonth month, @NotNull String skeleton, @NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(month, "month");
        Intrinsics.checkNotNullParameter(skeleton, "skeleton");
        Intrinsics.checkNotNullParameter(locale, "locale");
        return CalendarModel_androidKt.formatWithSkeleton(month.getStartUtcTimeMillis(), skeleton, locale);
    }

    public static /* synthetic */ String c(CalendarModel calendarModel, CalendarDate calendarDate, String str, Locale locale, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: formatWithSkeleton");
        }
        if ((i10 & 4) != 0) {
            locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        }
        return calendarModel.formatWithSkeleton(calendarDate, str, locale);
    }

    public static /* synthetic */ String d(CalendarModel calendarModel, CalendarMonth calendarMonth, String str, Locale locale, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: formatWithSkeleton");
        }
        if ((i10 & 4) != 0) {
            locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        }
        return calendarModel.formatWithSkeleton(calendarMonth, str, locale);
    }

    public static /* synthetic */ DateInputFormat e(CalendarModel calendarModel, Locale locale, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDateInputFormat");
        }
        if ((i10 & 1) != 0) {
            locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        }
        return calendarModel.getDateInputFormat(locale);
    }
}
