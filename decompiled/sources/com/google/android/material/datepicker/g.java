package com.google.android.material.datepicker;

import android.os.Build;
import androidx.annotation.Nullable;
import androidx.compose.material3.DatePickerDefaults;
import androidx.core.util.Pair;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: compiled from: DateStrings.java */
/* JADX INFO: loaded from: classes10.dex */
public final class g {
    public static Pair<String, String> a(@Nullable Long l6, @Nullable Long l7) {
        if (l6 == null && l7 == null) {
            return Pair.create(null, null);
        }
        if (l6 == null) {
            return Pair.create(null, b(l7.longValue()));
        }
        if (l7 == null) {
            return Pair.create(b(l6.longValue()), null);
        }
        Calendar calendarH = w.h();
        Calendar calendarI = w.i(null);
        calendarI.setTimeInMillis(l6.longValue());
        Calendar calendarI2 = w.i(null);
        calendarI2.setTimeInMillis(l7.longValue());
        if (calendarI.get(1) == calendarI2.get(1)) {
            return calendarI.get(1) == calendarH.get(1) ? Pair.create(c(l6.longValue(), Locale.getDefault()), c(l7.longValue(), Locale.getDefault())) : Pair.create(c(l6.longValue(), Locale.getDefault()), d(l7.longValue(), Locale.getDefault()));
        }
        return Pair.create(d(l6.longValue(), Locale.getDefault()), d(l7.longValue(), Locale.getDefault()));
    }

    public static String b(long j10) {
        Calendar calendarH = w.h();
        Calendar calendarI = w.i(null);
        calendarI.setTimeInMillis(j10);
        return calendarH.get(1) == calendarI.get(1) ? c(j10, Locale.getDefault()) : d(j10, Locale.getDefault());
    }

    public static String c(long j10, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return w.c("MMMd", locale).format(new Date(j10));
        }
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) w.g(2, locale);
        String pattern = simpleDateFormat.toPattern();
        int iB = w.b(1, 0, pattern, "yY");
        if (iB < pattern.length()) {
            int iB2 = w.b(1, iB, pattern, "EMd");
            pattern = pattern.replace(pattern.substring(w.b(-1, iB, pattern, iB2 < pattern.length() ? "EMd," : "EMd") + 1, iB2), " ").trim();
        }
        simpleDateFormat.applyPattern(pattern);
        return simpleDateFormat.format(new Date(j10));
    }

    public static String d(long j10, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? w.c(DatePickerDefaults.YearAbbrMonthDaySkeleton, locale).format(new Date(j10)) : w.g(2, locale).format(new Date(j10));
    }
}
