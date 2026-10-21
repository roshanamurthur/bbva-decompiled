package com.google.android.material.datepicker;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: UtcDates.java */
/* JADX INFO: loaded from: classes10.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReference<v> f44608a = new AtomicReference<>();

    public static long a(long j10) {
        Calendar calendarI = i(null);
        calendarI.setTimeInMillis(j10);
        return d(calendarI).getTimeInMillis();
    }

    public static int b(int i10, int i11, @NonNull String str, @NonNull String str2) {
        while (i11 >= 0 && i11 < str.length() && str2.indexOf(str.charAt(i11)) == -1) {
            if (str.charAt(i11) == '\'') {
                do {
                    i11 += i10;
                    if (i11 < 0 || i11 >= str.length()) {
                        break;
                    }
                } while (str.charAt(i11) != '\'');
            }
            i11 += i10;
        }
        return i11;
    }

    @TargetApi(24)
    public static DateFormat c(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        return instanceForSkeleton;
    }

    public static Calendar d(Calendar calendar) {
        Calendar calendarI = i(calendar);
        Calendar calendarI2 = i(null);
        calendarI2.set(calendarI.get(1), calendarI.get(2), calendarI.get(5));
        return calendarI2;
    }

    public static SimpleDateFormat e() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(((SimpleDateFormat) java.text.DateFormat.getDateInstance(3, Locale.getDefault())).toPattern().replaceAll("[^dMy/\\-.]", "").replaceAll("d{1,2}", "dd").replaceAll("M{1,2}", "MM").replaceAll("y{1,4}", "yyyy").replaceAll("\\.$", "").replaceAll("My", "M/y"), Locale.getDefault());
        simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
        simpleDateFormat.setLenient(false);
        return simpleDateFormat;
    }

    public static String f(Resources resources, SimpleDateFormat simpleDateFormat) {
        String pattern = simpleDateFormat.toPattern();
        String string = resources.getString(R.string.mtrl_picker_text_input_year_abbr);
        String string2 = resources.getString(R.string.mtrl_picker_text_input_month_abbr);
        String string3 = resources.getString(R.string.mtrl_picker_text_input_day_abbr);
        if (Locale.getDefault().getLanguage().equals(Locale.KOREAN.getLanguage())) {
            pattern = pattern.replaceAll("d+", "d").replaceAll("M+", "M").replaceAll("y+", "y");
        }
        return pattern.replace("d", string3).replace("M", string2).replace("y", string);
    }

    public static java.text.DateFormat g(int i10, Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(i10, locale);
        dateInstance.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
        return dateInstance;
    }

    public static Calendar h() {
        v vVar = f44608a.get();
        if (vVar == null) {
            vVar = v.f44605c;
        }
        java.util.TimeZone timeZone = vVar.f44607b;
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l6 = vVar.f44606a;
        if (l6 != null) {
            calendar.setTimeInMillis(l6.longValue());
        }
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
        return calendar;
    }

    public static Calendar i(@Nullable Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(java.util.TimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }
}
