package j2;

import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.os.LocaleListCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: compiled from: LocaleListCompatWrapper.java */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Locale[] f78760c = new Locale[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Locale f78761d = new Locale("en", "XA");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Locale f78762e = new Locale("ar", "XB");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Locale[] f78763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final String f78764b;

    /* JADX INFO: compiled from: LocaleListCompatWrapper.java */
    @RequiresApi(21)
    public static class a {
        @DoNotInline
        public static String a(Locale locale) {
            return locale.getScript();
        }
    }

    static {
        LocaleListCompat.a("en-Latn");
    }

    public d(@NonNull Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f78763a = f78760c;
            this.f78764b = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < localeArr.length; i10++) {
            Locale locale = localeArr[i10];
            if (locale == null) {
                throw new NullPointerException(androidx.camera.core.impl.utils.b.a("list[", i10, "] is null"));
            }
            if (!hashSet.contains(locale)) {
                Locale locale2 = (Locale) locale.clone();
                arrayList.add(locale2);
                sb2.append(locale2.getLanguage());
                String country = locale2.getCountry();
                if (country != null && !country.isEmpty()) {
                    sb2.append('-');
                    sb2.append(locale2.getCountry());
                }
                if (i10 < localeArr.length - 1) {
                    sb2.append(AbstractJsonLexerKt.COMMA);
                }
                hashSet.add(locale2);
            }
        }
        this.f78763a = (Locale[]) arrayList.toArray(new Locale[0]);
        this.f78764b = sb2.toString();
    }

    @Override // j2.e
    public final int a(Locale locale) {
        int i10 = 0;
        while (true) {
            Locale[] localeArr = this.f78763a;
            if (i10 >= localeArr.length) {
                return -1;
            }
            if (localeArr[i10].equals(locale)) {
                return i10;
            }
            i10++;
        }
    }

    @Override // j2.e
    public final String b() {
        return this.f78764b;
    }

    @Override // j2.e
    @Nullable
    public final Object c() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [boolean] */
    @Override // j2.e
    public final Locale d(@NonNull String[] strArr) {
        List listAsList = Arrays.asList(strArr);
        Locale[] localeArr = this.f78763a;
        int i10 = 0;
        if (localeArr.length != 1) {
            if (localeArr.length == 0) {
                i10 = -1;
            } else {
                Iterator it = listAsList.iterator();
                int i11 = Integer.MAX_VALUE;
                while (it.hasNext()) {
                    Locale localeA = LocaleListCompat.a((String) it.next());
                    int i12 = 0;
                    while (true) {
                        if (i12 >= localeArr.length) {
                            i12 = Integer.MAX_VALUE;
                            break;
                        }
                        Locale locale = localeArr[i12];
                        if (localeA.equals(locale)) {
                            break;
                        }
                        if (localeA.getLanguage().equals(locale.getLanguage())) {
                            Locale locale2 = f78761d;
                            if (locale2.equals(localeA)) {
                                continue;
                            } else {
                                Locale locale3 = f78762e;
                                if (!locale3.equals(localeA) && !locale2.equals(locale) && !locale3.equals(locale)) {
                                    String strA = a.a(localeA);
                                    if (strA.isEmpty()) {
                                        strA = "";
                                    }
                                    if (strA.isEmpty()) {
                                        String country = localeA.getCountry();
                                        if (country.isEmpty() || country.equals(locale.getCountry())) {
                                            break;
                                        }
                                    } else {
                                        String strA2 = a.a(locale);
                                        if (strA.equals(strA2.isEmpty() ? "" : strA2) > 0) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        i12++;
                    }
                    if (i12 != 0) {
                        if (i12 < i11) {
                            i11 = i12;
                        }
                    }
                }
                if (i11 != Integer.MAX_VALUE) {
                    i10 = i11;
                }
            }
        }
        if (i10 == -1) {
            return null;
        }
        return localeArr[i10];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        Locale[] localeArr = ((d) obj).f78763a;
        Locale[] localeArr2 = this.f78763a;
        if (localeArr2.length != localeArr.length) {
            return false;
        }
        for (int i10 = 0; i10 < localeArr2.length; i10++) {
            if (!localeArr2[i10].equals(localeArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // j2.e
    public final Locale get(int i10) {
        if (i10 >= 0) {
            Locale[] localeArr = this.f78763a;
            if (i10 < localeArr.length) {
                return localeArr[i10];
            }
        }
        return null;
    }

    public final int hashCode() {
        int iHashCode = 1;
        for (Locale locale : this.f78763a) {
            iHashCode = (iHashCode * 31) + locale.hashCode();
        }
        return iHashCode;
    }

    @Override // j2.e
    public final boolean isEmpty() {
        return this.f78763a.length == 0;
    }

    @Override // j2.e
    public final int size() {
        return this.f78763a.length;
    }

    @NonNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder(Constant.BRACKET_OPEN);
        int i10 = 0;
        while (true) {
            Locale[] localeArr = this.f78763a;
            if (i10 >= localeArr.length) {
                sb2.append(Constant.BRACKET_CLOSE);
                return sb2.toString();
            }
            sb2.append(localeArr[i10]);
            if (i10 < localeArr.length - 1) {
                sb2.append(AbstractJsonLexerKt.COMMA);
            }
            i10++;
        }
    }
}
