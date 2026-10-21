package androidx.core.os;

import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes2.dex */
public final class ConfigurationCompat {

    @RequiresApi(17)
    public static class a {
        @DoNotInline
        public static void a(@NonNull Configuration configuration, @NonNull LocaleListCompat localeListCompat) {
            if (localeListCompat.isEmpty()) {
                return;
            }
            configuration.setLocale(localeListCompat.get(0));
        }
    }

    @RequiresApi(24)
    public static class b {
        @DoNotInline
        public static LocaleList a(Configuration configuration) {
            return configuration.getLocales();
        }

        @DoNotInline
        public static void b(@NonNull Configuration configuration, @NonNull LocaleListCompat localeListCompat) {
            configuration.setLocales((LocaleList) localeListCompat.unwrap());
        }
    }

    @NonNull
    public static LocaleListCompat getLocales(@NonNull Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? LocaleListCompat.wrap(b.a(configuration)) : LocaleListCompat.create(configuration.locale);
    }

    public static void setLocales(@NonNull Configuration configuration, @NonNull LocaleListCompat localeListCompat) {
        if (Build.VERSION.SDK_INT >= 24) {
            b.b(configuration, localeListCompat);
        } else {
            a.a(configuration, localeListCompat);
        }
    }
}
