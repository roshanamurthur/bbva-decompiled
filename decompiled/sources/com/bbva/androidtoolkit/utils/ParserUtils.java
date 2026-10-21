package com.bbva.androidtoolkit.utils;

import androidx.annotation.Nullable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class ParserUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f26547a = new a();

    public class a extends ThreadLocal<SimpleDateFormat> {
        @Override // java.lang.ThreadLocal
        public final SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.getDefault());
        }
    }

    @Nullable
    public static String formatISODate(Date date) {
        if (date != null) {
            return f26547a.get().format(date);
        }
        return null;
    }

    public static boolean parseBoolean(String str, boolean z10) {
        return str != null ? Boolean.parseBoolean(str) : z10;
    }

    @Nullable
    public static Double parseDouble(String str) {
        if (str != null) {
            try {
                return Double.valueOf(Double.parseDouble(str));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    @Nullable
    public static Date parseISODate(String str) {
        if (str != null) {
            try {
                return f26547a.get().parse(str);
            } catch (ParseException unused) {
            }
        }
        return null;
    }

    @Nullable
    public static Integer parseInteger(String str) {
        if (str != null) {
            try {
                return Integer.valueOf(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    @Nullable
    public static Long parseLong(String str) {
        if (str != null) {
            try {
                return Long.valueOf(Long.parseLong(str));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public static double parseDouble(String str, double d2) {
        if (str != null) {
            try {
                return Double.parseDouble(str);
            } catch (NumberFormatException unused) {
            }
        }
        return d2;
    }

    public static int parseInteger(String str, int i10) {
        if (str != null) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
            }
        }
        return i10;
    }

    public static long parseLong(String str, long j10) {
        if (str != null) {
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException unused) {
            }
        }
        return j10;
    }
}
