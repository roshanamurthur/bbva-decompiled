package com.adobe.marketing.mobile;

import com.bbva.ethermobilesdk.deviceinfo.component.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
final class TimeUtil {
    private static final String ISO8601_DATE_FORMATTER_TIMEZONE_RFC822 = "yyyy-MM-dd'T'HH:mm:ssZZZ";
    private static final String ISO8601_DATE_FORMATTER_TIMEZONE_UTC = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
    private static final long MILLISECONDS_PER_SECOND = 1000;
    private static final SimpleDateFormat iso8601DateFormatterUtc;

    static {
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", new Locale(locale.getLanguage(), locale.getCountry(), "POSIX"));
        iso8601DateFormatterUtc = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(Time.GMT));
    }

    private TimeUtil() {
    }

    public static String getIso8601Date() {
        return getIso8601Date(new Date(), ISO8601_DATE_FORMATTER_TIMEZONE_RFC822);
    }

    public static String getIso8601DateTimeZoneISO8601() {
        return iso8601DateFormatterUtc.format(new Date());
    }

    public static long getUnixTimeInSeconds() {
        return System.currentTimeMillis() / 1000;
    }

    public static String getIso8601Date(Date date, String str) {
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, new Locale(locale.getLanguage(), locale.getCountry(), "POSIX"));
        if (date == null) {
            date = new Date();
        }
        return simpleDateFormat.format(date);
    }
}
