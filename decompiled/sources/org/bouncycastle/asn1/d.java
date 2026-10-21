package org.bouncycastle.asn1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes12.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Long f87091a = 0L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f87092b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Locale f87093c;

    static {
        Locale locale;
        if ("en".equalsIgnoreCase(Locale.getDefault().getLanguage())) {
            locale = Locale.getDefault();
        } else {
            Locale[] availableLocales = Locale.getAvailableLocales();
            for (int i10 = 0; i10 != availableLocales.length; i10++) {
                if ("en".equalsIgnoreCase(availableLocales[i10].getLanguage())) {
                    locale = availableLocales[i10];
                }
            }
            locale = Locale.getDefault();
        }
        f87093c = locale;
    }

    public static Date a(Date date) throws ParseException {
        Locale locale = Locale.getDefault();
        if (locale == null) {
            return date;
        }
        HashMap map = f87092b;
        synchronized (map) {
            try {
                Long lValueOf = (Long) map.get(locale);
                if (lValueOf == null) {
                    long time = new SimpleDateFormat("yyyyMMddHHmmssz").parse("19700101000000GMT+00:00").getTime();
                    lValueOf = time == 0 ? f87091a : Long.valueOf(time);
                    map.put(locale, lValueOf);
                }
                if (lValueOf != f87091a) {
                    return new Date(date.getTime() - lValueOf.longValue());
                }
                return date;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
