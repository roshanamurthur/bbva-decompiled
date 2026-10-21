package androidx.core.text;

import android.icu.util.ULocale;
import android.os.Build;
import android.util.Log;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class ICUCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Method f20121a;

    @RequiresApi(21)
    public static class a {
        @DoNotInline
        public static String a(Locale locale) {
            return locale.getScript();
        }
    }

    @RequiresApi(24)
    public static class b {
        @DoNotInline
        public static ULocale a(Object obj) {
            return ULocale.addLikelySubtags((ULocale) obj);
        }

        @DoNotInline
        public static ULocale b(Locale locale) {
            return ULocale.forLocale(locale);
        }

        @DoNotInline
        public static String c(Object obj) {
            return ((ULocale) obj).getScript();
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 24) {
            try {
                f20121a = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
            } catch (Exception e5) {
                throw new IllegalStateException(e5);
            }
        }
    }

    @Nullable
    public static String maximizeAndGetScript(@NonNull Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return b.c(b.a(b.b(locale)));
        }
        try {
            return a.a((Locale) f20121a.invoke(null, locale));
        } catch (IllegalAccessException e5) {
            Log.w("ICUCompat", e5);
            return a.a(locale);
        } catch (InvocationTargetException e7) {
            Log.w("ICUCompat", e7);
            return a.a(locale);
        }
    }
}
