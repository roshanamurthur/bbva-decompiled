package com.bbva.glomoutils;

import com.bbva.glomoutils.time.DateComparison;
import com.bbva.glomoutils.time.StringDate;
import com.noknok.android.client.utils.UIConfigTags;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: StringDateExtensions.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0002*\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u0000\u001a\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u0000\u001a\"\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u0000\u001a(\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u0000\u001a\n\u0010\f\u001a\u00020\n*\u00020\u0000¨\u0006\r"}, d2 = {"", "format", "Ljava/util/Calendar;", "toCalendarDate", "validateFormat", "date", "Lcom/bbva/glomoutils/time/DateComparison;", "compareDateWith", "", UIConfigTags.TAG_DAYS, "", "isTimeElapseUpperOrEqualsTo", "isBirthdayToday", "gl-utils_release"}, k = 2, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nStringDateExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringDateExtensions.kt\ncom/bbva/glomoutils/StringDateExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,100:1\n1#2:101\n*E\n"})
public final class StringDateExtensionsKt {
    public static final DateComparison a(Calendar calendar, Calendar calendar2, int i10) {
        int iCompare = Intrinsics.compare(calendar.get(i10), calendar2.get(i10));
        if (iCompare == -1) {
            return DateComparison.LOWER;
        }
        if (iCompare != 1) {
            return null;
        }
        return DateComparison.HIGHER;
    }

    @Nullable
    public static final DateComparison compareDateWith(@NotNull String str, @Nullable String str2, @NotNull String format) {
        Calendar calendar;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        Calendar calendarDate = toCalendarDate(str, format);
        if (calendarDate == null) {
            return null;
        }
        if (str2 == null || (calendar = toCalendarDate(str2, format)) == null) {
            calendar = Calendar.getInstance();
        }
        Intrinsics.checkNotNull(calendar);
        DateComparison dateComparisonA = a(calendarDate, calendar, 1);
        if (dateComparisonA != null) {
            return dateComparisonA;
        }
        DateComparison dateComparisonA2 = a(calendarDate, calendar, 2);
        if (dateComparisonA2 != null) {
            return dateComparisonA2;
        }
        DateComparison dateComparisonA3 = a(calendarDate, calendar, 5);
        return dateComparisonA3 == null ? DateComparison.EQUALS : dateComparisonA3;
    }

    public static /* synthetic */ DateComparison compareDateWith$default(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = null;
        }
        if ((i10 & 2) != 0) {
            str3 = "yyyy-MM-dd";
        }
        return compareDateWith(str, str2, str3);
    }

    public static final boolean isBirthdayToday(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Calendar calendarDate$default = toCalendarDate$default(str, null, 1, null);
        if (calendarDate$default == null) {
            return false;
        }
        Calendar calendarDate$default2 = toCalendarDate$default(StringDate.getToday$default(StringDate.INSTANCE, null, 1, null), null, 1, null);
        if (calendarDate$default2 == null) {
            calendarDate$default2 = Calendar.getInstance();
        }
        Intrinsics.checkNotNull(calendarDate$default2);
        DateComparison dateComparisonA = a(calendarDate$default, calendarDate$default2, 2);
        if (dateComparisonA == null && (dateComparisonA = a(calendarDate$default, calendarDate$default2, 5)) == null) {
            dateComparisonA = DateComparison.EQUALS;
        }
        return dateComparisonA == DateComparison.EQUALS;
    }

    public static final boolean isTimeElapseUpperOrEqualsTo(@NotNull String str, int i10, @Nullable String str2, @NotNull String format) {
        Calendar calendar;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        Long lValueOf = Long.valueOf(TimeUnit.DAYS.toMillis(i10));
        lValueOf.longValue();
        if (i10 < 0) {
            lValueOf = null;
        }
        if (lValueOf == null) {
            return false;
        }
        long jLongValue = lValueOf.longValue();
        Calendar calendarDate = toCalendarDate(str, format);
        if (calendarDate == null) {
            return false;
        }
        if (str2 == null || (calendar = toCalendarDate(str2, format)) == null) {
            calendar = Calendar.getInstance();
        }
        return calendar.getTimeInMillis() - calendarDate.getTimeInMillis() >= jLongValue;
    }

    public static /* synthetic */ boolean isTimeElapseUpperOrEqualsTo$default(String str, int i10, String str2, String str3, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        if ((i11 & 4) != 0) {
            str3 = "yyyy-MM-dd";
        }
        return isTimeElapseUpperOrEqualsTo(str, i10, str2, str3);
    }

    @Nullable
    public static final Calendar toCalendarDate(@NotNull String str, @NotNull String format) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format, Locale.getDefault());
        try {
            Result.Companion companion = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(simpleDateFormat.parse(str));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5540isFailureimpl(objM5535constructorimpl)) {
            objM5535constructorimpl = null;
        }
        Date date = (Date) objM5535constructorimpl;
        if (date == null) {
            return null;
        }
        calendar.setTime(date);
        return calendar;
    }

    public static /* synthetic */ Calendar toCalendarDate$default(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = "yyyy-MM-dd";
        }
        return toCalendarDate(str, str2);
    }

    @Nullable
    public static final String validateFormat(@NotNull String str, @NotNull String format) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format, Locale.getDefault());
        try {
            Result.Companion companion = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(simpleDateFormat.parse(str));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5540isFailureimpl(objM5535constructorimpl)) {
            objM5535constructorimpl = null;
        }
        if (objM5535constructorimpl != null) {
            return str;
        }
        return null;
    }

    public static /* synthetic */ String validateFormat$default(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = "yyyy-MM-dd";
        }
        return validateFormat(str, str2);
    }
}
