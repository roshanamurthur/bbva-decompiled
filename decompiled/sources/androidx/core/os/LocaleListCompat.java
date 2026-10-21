package androidx.core.os;

import android.os.Build;
import android.os.LocaleList;
import androidx.annotation.DoNotInline;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.Size;
import androidx.camera.camera2.internal.h0;
import androidx.core.app.m;
import androidx.core.text.ICUCompat;
import com.bbva.notifications.constants.PushConstants;
import j2.d;
import j2.e;
import j2.f;
import java.util.Locale;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes2.dex */
public final class LocaleListCompat {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LocaleListCompat f20000b = create(new Locale[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f20001a;

    @RequiresApi(21)
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Locale[] f20002a = {new Locale("en", "XA"), new Locale("ar", "XB")};

        @DoNotInline
        public static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }

        @DoNotInline
        public static boolean b(@NonNull Locale locale, @NonNull Locale locale2) {
            if (locale.equals(locale2)) {
                return true;
            }
            if (!locale.getLanguage().equals(locale2.getLanguage())) {
                return false;
            }
            Locale[] localeArr = f20002a;
            for (Locale locale3 : localeArr) {
                if (locale3.equals(locale)) {
                    return false;
                }
            }
            for (Locale locale4 : localeArr) {
                if (locale4.equals(locale2)) {
                    return false;
                }
            }
            String strMaximizeAndGetScript = ICUCompat.maximizeAndGetScript(locale);
            if (!strMaximizeAndGetScript.isEmpty()) {
                return strMaximizeAndGetScript.equals(ICUCompat.maximizeAndGetScript(locale2));
            }
            String country = locale.getCountry();
            return country.isEmpty() || country.equals(locale2.getCountry());
        }
    }

    @RequiresApi(24)
    public static class b {
        @DoNotInline
        public static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        @DoNotInline
        public static LocaleList b() {
            return LocaleList.getAdjustedDefault();
        }

        @DoNotInline
        public static LocaleList c() {
            return LocaleList.getDefault();
        }
    }

    public LocaleListCompat(e eVar) {
        this.f20001a = eVar;
    }

    public static Locale a(String str) {
        if (str.contains(Constant.DASH_STRING)) {
            String[] strArrSplit = str.split(Constant.DASH_STRING, -1);
            if (strArrSplit.length > 2) {
                return new Locale(strArrSplit[0], strArrSplit[1], strArrSplit[2]);
            }
            if (strArrSplit.length > 1) {
                return new Locale(strArrSplit[0], strArrSplit[1]);
            }
            if (strArrSplit.length == 1) {
                return new Locale(strArrSplit[0]);
            }
        } else {
            if (!str.contains(PushConstants.GE_PARAMS_SEPARATOR)) {
                return new Locale(str);
            }
            String[] strArrSplit2 = str.split(PushConstants.GE_PARAMS_SEPARATOR, -1);
            if (strArrSplit2.length > 2) {
                return new Locale(strArrSplit2[0], strArrSplit2[1], strArrSplit2[2]);
            }
            if (strArrSplit2.length > 1) {
                return new Locale(strArrSplit2[0], strArrSplit2[1]);
            }
            if (strArrSplit2.length == 1) {
                return new Locale(strArrSplit2[0]);
            }
        }
        throw new IllegalArgumentException(h0.b("Can not parse language tag: [", str, Constant.BRACKET_CLOSE));
    }

    @NonNull
    public static LocaleListCompat create(@NonNull Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? wrap(b.a(localeArr)) : new LocaleListCompat(new d(localeArr));
    }

    @NonNull
    public static LocaleListCompat forLanguageTags(@Nullable String str) {
        if (str == null || str.isEmpty()) {
            return getEmptyLocaleList();
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i10 = 0; i10 < length; i10++) {
            localeArr[i10] = a.a(strArrSplit[i10]);
        }
        return create(localeArr);
    }

    @NonNull
    @Size(min = 1)
    public static LocaleListCompat getAdjustedDefault() {
        return Build.VERSION.SDK_INT >= 24 ? wrap(b.b()) : create(Locale.getDefault());
    }

    @NonNull
    @Size(min = 1)
    public static LocaleListCompat getDefault() {
        return Build.VERSION.SDK_INT >= 24 ? wrap(b.c()) : create(Locale.getDefault());
    }

    @NonNull
    public static LocaleListCompat getEmptyLocaleList() {
        return f20000b;
    }

    @RequiresApi(21)
    public static boolean matchesLanguageAndScript(@NonNull Locale locale, @NonNull Locale locale2) {
        return Build.VERSION.SDK_INT >= 33 ? LocaleList.matchesLanguageAndScript(locale, locale2) : a.b(locale, locale2);
    }

    @RequiresApi(24)
    @Deprecated
    public static LocaleListCompat wrap(Object obj) {
        return wrap(m.c(obj));
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocaleListCompat) {
            if (this.f20001a.equals(((LocaleListCompat) obj).f20001a)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public Locale get(int i10) {
        return this.f20001a.get(i10);
    }

    @Nullable
    public Locale getFirstMatch(@NonNull String[] strArr) {
        return this.f20001a.d(strArr);
    }

    public int hashCode() {
        return this.f20001a.hashCode();
    }

    @IntRange(from = -1)
    public int indexOf(@Nullable Locale locale) {
        return this.f20001a.a(locale);
    }

    public boolean isEmpty() {
        return this.f20001a.isEmpty();
    }

    @IntRange(from = 0)
    public int size() {
        return this.f20001a.size();
    }

    @NonNull
    public String toLanguageTags() {
        return this.f20001a.b();
    }

    @NonNull
    public String toString() {
        return this.f20001a.toString();
    }

    @Nullable
    public Object unwrap() {
        return this.f20001a.c();
    }

    @NonNull
    @RequiresApi(24)
    public static LocaleListCompat wrap(@NonNull LocaleList localeList) {
        return new LocaleListCompat(new f(localeList));
    }
}
