package androidx.core.text.util;

import android.icu.number.NumberFormatter;
import android.icu.number.UnlocalizedNumberFormatter;
import android.icu.text.DateFormat;
import android.icu.text.DateTimePatternGenerator;
import android.icu.util.Calendar;
import android.icu.util.MeasureUnit;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(21)
public final class LocalePreferences {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f20151a = {"BS", "BZ", "KY", "PR", "PW", "US"};

    public static class CalendarType {
        public static final String CHINESE = "chinese";
        public static final String DANGI = "dangi";
        public static final String DEFAULT = "";
        public static final String GREGORIAN = "gregorian";
        public static final String HEBREW = "hebrew";
        public static final String INDIAN = "indian";
        public static final String ISLAMIC = "islamic";
        public static final String ISLAMIC_CIVIL = "islamic-civil";
        public static final String ISLAMIC_RGSA = "islamic-rgsa";
        public static final String ISLAMIC_TBLA = "islamic-tbla";
        public static final String ISLAMIC_UMALQURA = "islamic-umalqura";
        public static final String PERSIAN = "persian";

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public @interface CalendarTypes {
        }
    }

    public static class FirstDayOfWeek {
        public static final String DEFAULT = "";
        public static final String FRIDAY = "fri";
        public static final String MONDAY = "mon";
        public static final String SATURDAY = "sat";
        public static final String SUNDAY = "sun";
        public static final String THURSDAY = "thu";
        public static final String TUESDAY = "tue";
        public static final String WEDNESDAY = "wed";

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public @interface Days {
        }
    }

    public static class HourCycle {
        public static final String DEFAULT = "";
        public static final String H11 = "h11";
        public static final String H12 = "h12";
        public static final String H23 = "h23";
        public static final String H24 = "h24";

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public @interface HourCycleTypes {
        }
    }

    public static class TemperatureUnit {
        public static final String CELSIUS = "celsius";
        public static final String DEFAULT = "";
        public static final String FAHRENHEIT = "fahrenhe";
        public static final String KELVIN = "kelvin";

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public @interface TemperatureUnits {
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20152a;

        static {
            int[] iArr = new int[DateFormat.HourCycle.values().length];
            f20152a = iArr;
            try {
                iArr[DateFormat.HourCycle.HOUR_CYCLE_11.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20152a[DateFormat.HourCycle.HOUR_CYCLE_12.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20152a[DateFormat.HourCycle.HOUR_CYCLE_23.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20152a[DateFormat.HourCycle.HOUR_CYCLE_24.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @RequiresApi(24)
    public static class b {
        @DoNotInline
        public static String a(@NonNull Locale locale) {
            return Calendar.getInstance(locale).getType();
        }

        @DoNotInline
        public static Locale b() {
            return Locale.getDefault(Locale.Category.FORMAT);
        }
    }

    @RequiresApi(33)
    public static class c {
        @DoNotInline
        public static String a(@NonNull Locale locale) {
            int i10 = a.f20152a[DateTimePatternGenerator.getInstance(locale).getDefaultHourCycle().ordinal()];
            if (i10 == 1) {
                return HourCycle.H11;
            }
            if (i10 == 2) {
                return HourCycle.H12;
            }
            if (i10 != 3) {
                return i10 != 4 ? "" : HourCycle.H24;
            }
            return HourCycle.H23;
        }

        @DoNotInline
        public static String b(@NonNull Locale locale) {
            String identifier = ((UnlocalizedNumberFormatter) ((UnlocalizedNumberFormatter) NumberFormatter.with().usage("weather")).unit(MeasureUnit.CELSIUS)).locale(locale).format(1L).getOutputUnit().getIdentifier();
            return identifier.startsWith(TemperatureUnit.FAHRENHEIT) ? TemperatureUnit.FAHRENHEIT : identifier;
        }
    }

    @NonNull
    public static String getCalendarType() {
        return getCalendarType(true);
    }

    @NonNull
    public static String getFirstDayOfWeek() {
        return getFirstDayOfWeek(true);
    }

    @NonNull
    public static String getHourCycle() {
        return getHourCycle(true);
    }

    @NonNull
    public static String getTemperatureUnit() {
        return getTemperatureUnit(true);
    }

    @NonNull
    public static String getCalendarType(@NonNull Locale locale) {
        return getCalendarType(locale, true);
    }

    @NonNull
    public static String getFirstDayOfWeek(@NonNull Locale locale) {
        return getFirstDayOfWeek(locale, true);
    }

    @NonNull
    public static String getHourCycle(@NonNull Locale locale) {
        return getHourCycle(locale, true);
    }

    @NonNull
    public static String getTemperatureUnit(@NonNull Locale locale) {
        return getTemperatureUnit(locale, true);
    }

    @NonNull
    public static String getCalendarType(boolean z10) {
        Locale localeB;
        if (Build.VERSION.SDK_INT >= 24) {
            localeB = b.b();
        } else {
            localeB = Locale.getDefault();
        }
        return getCalendarType(localeB, z10);
    }

    @NonNull
    public static String getFirstDayOfWeek(boolean z10) {
        Locale localeB;
        if (Build.VERSION.SDK_INT >= 24) {
            localeB = b.b();
        } else {
            localeB = Locale.getDefault();
        }
        return getFirstDayOfWeek(localeB, z10);
    }

    @NonNull
    public static String getHourCycle(boolean z10) {
        Locale localeB;
        if (Build.VERSION.SDK_INT >= 24) {
            localeB = b.b();
        } else {
            localeB = Locale.getDefault();
        }
        return getHourCycle(localeB, z10);
    }

    @NonNull
    public static String getTemperatureUnit(boolean z10) {
        Locale localeB;
        if (Build.VERSION.SDK_INT >= 24) {
            localeB = b.b();
        } else {
            localeB = Locale.getDefault();
        }
        return getTemperatureUnit(localeB, z10);
    }

    @NonNull
    public static String getCalendarType(@NonNull Locale locale, boolean z10) {
        String unicodeLocaleType = locale.getUnicodeLocaleType("ca");
        if (unicodeLocaleType == null) {
            unicodeLocaleType = !z10 ? "" : null;
        }
        if (unicodeLocaleType != null) {
            return unicodeLocaleType;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return b.a(locale);
        }
        return z10 ? CalendarType.GREGORIAN : "";
    }

    @NonNull
    public static String getFirstDayOfWeek(@NonNull Locale locale, boolean z10) {
        String unicodeLocaleType = locale.getUnicodeLocaleType("fw");
        String str = "";
        if (unicodeLocaleType == null) {
            unicodeLocaleType = !z10 ? "" : null;
        }
        if (unicodeLocaleType != null) {
            return unicodeLocaleType;
        }
        int firstDayOfWeek = java.util.Calendar.getInstance(locale).getFirstDayOfWeek();
        String[] strArr = {FirstDayOfWeek.SUNDAY, FirstDayOfWeek.MONDAY, FirstDayOfWeek.TUESDAY, FirstDayOfWeek.WEDNESDAY, FirstDayOfWeek.THURSDAY, FirstDayOfWeek.FRIDAY, FirstDayOfWeek.SATURDAY};
        if (firstDayOfWeek >= 1 && firstDayOfWeek <= 7) {
            str = strArr[firstDayOfWeek - 1];
        }
        return str;
    }

    @NonNull
    public static String getHourCycle(@NonNull Locale locale, boolean z10) {
        String unicodeLocaleType = locale.getUnicodeLocaleType("hc");
        if (unicodeLocaleType == null) {
            unicodeLocaleType = !z10 ? "" : null;
        }
        if (unicodeLocaleType != null) {
            return unicodeLocaleType;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            return c.a(locale);
        }
        return android.text.format.DateFormat.getBestDateTimePattern(locale, "jm").contains("H") ? HourCycle.H23 : HourCycle.H12;
    }

    @NonNull
    public static String getTemperatureUnit(@NonNull Locale locale, boolean z10) {
        String unicodeLocaleType = locale.getUnicodeLocaleType("mu");
        if (unicodeLocaleType == null) {
            unicodeLocaleType = !z10 ? "" : null;
        }
        if (unicodeLocaleType != null) {
            return unicodeLocaleType;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            return c.b(locale);
        }
        return Arrays.binarySearch(f20151a, locale.getCountry()) >= 0 ? TemperatureUnit.FAHRENHEIT : TemperatureUnit.CELSIUS;
    }
}
