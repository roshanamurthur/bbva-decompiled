package com.fasterxml.jackson.databind.util;

import ad.d;
import androidx.core.app.NotificationManagerCompat;
import androidx.fragment.app.a;
import com.fasterxml.jackson.core.io.NumberInput;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes9.dex */
public class StdDateFormat extends DateFormat {
    protected static final String[] ALL_FORMATS;
    protected static final Calendar CALENDAR;
    protected static final DateFormat DATE_FORMAT_ISO8601;
    protected static final DateFormat DATE_FORMAT_RFC1123;
    public static final String DATE_FORMAT_STR_ISO8601 = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";
    protected static final String DATE_FORMAT_STR_PLAIN = "yyyy-MM-dd";
    protected static final String DATE_FORMAT_STR_RFC1123 = "EEE, dd MMM yyyy HH:mm:ss zzz";
    protected static final Locale DEFAULT_LOCALE;
    protected static final TimeZone DEFAULT_TIMEZONE;
    protected static final Pattern PATTERN_ISO8601;
    public static final StdDateFormat instance;
    protected Boolean _lenient;
    protected final Locale _locale;
    protected transient TimeZone _timezone;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public transient Calendar f43527p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public transient DateFormat f43528q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final boolean f43529r0;
    protected static final String PATTERN_PLAIN_STR = "\\d\\d\\d\\d[-]\\d\\d[-]\\d\\d";
    protected static final Pattern PATTERN_PLAIN = Pattern.compile(PATTERN_PLAIN_STR);

    static {
        try {
            PATTERN_ISO8601 = Pattern.compile("\\d\\d\\d\\d[-]\\d\\d[-]\\d\\d[T]\\d\\d[:]\\d\\d(?:[:]\\d\\d)?(\\.\\d+)?(Z|[+-]\\d\\d(?:[:]?\\d\\d)?)?");
            ALL_FORMATS = new String[]{"yyyy-MM-dd'T'HH:mm:ss.SSSZ", "yyyy-MM-dd'T'HH:mm:ss.SSS", DATE_FORMAT_STR_RFC1123, "yyyy-MM-dd"};
            TimeZone timeZone = TimeZone.getTimeZone("UTC");
            DEFAULT_TIMEZONE = timeZone;
            Locale locale = Locale.US;
            DEFAULT_LOCALE = locale;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_FORMAT_STR_RFC1123, locale);
            DATE_FORMAT_RFC1123 = simpleDateFormat;
            simpleDateFormat.setTimeZone(timeZone);
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", locale);
            DATE_FORMAT_ISO8601 = simpleDateFormat2;
            simpleDateFormat2.setTimeZone(timeZone);
            instance = new StdDateFormat();
            CALENDAR = new GregorianCalendar(timeZone, locale);
        } catch (Throwable th2) {
            throw new RuntimeException(th2);
        }
    }

    public StdDateFormat() {
        this.f43529r0 = false;
        this._locale = DEFAULT_LOCALE;
    }

    public static <T> boolean _equals(T t10, T t11) {
        if (t10 == t11) {
            return true;
        }
        return t10 != null && t10.equals(t11);
    }

    public static final DateFormat a(DateFormat dateFormat, String str, TimeZone timeZone, Locale locale, Boolean bool) {
        DateFormat simpleDateFormat;
        if (locale.equals(DEFAULT_LOCALE)) {
            simpleDateFormat = (DateFormat) dateFormat.clone();
            if (timeZone != null) {
                simpleDateFormat.setTimeZone(timeZone);
            }
        } else {
            simpleDateFormat = new SimpleDateFormat(str, locale);
            if (timeZone == null) {
                timeZone = DEFAULT_TIMEZONE;
            }
            simpleDateFormat.setTimeZone(timeZone);
        }
        if (bool != null) {
            simpleDateFormat.setLenient(bool.booleanValue());
        }
        return simpleDateFormat;
    }

    public static int b(int i10, String str) {
        return (str.charAt(i10 + 1) - '0') + ((str.charAt(i10) - '0') * 10);
    }

    public static int c(String str) {
        return (str.charAt(3) - '0') + ((str.charAt(2) - '0') * 10) + ((str.charAt(1) - '0') * 100) + ((str.charAt(0) - '0') * 1000);
    }

    public static void d(StringBuffer stringBuffer, int i10) {
        int i11 = i10 / 10;
        if (i11 == 0) {
            stringBuffer.append('0');
        } else {
            stringBuffer.append((char) (i11 + 48));
            i10 -= i11 * 10;
        }
        stringBuffer.append((char) (i10 + 48));
    }

    public static void e(StringBuffer stringBuffer, int i10) {
        int i11 = i10 / 100;
        if (i11 == 0) {
            stringBuffer.append('0');
            stringBuffer.append('0');
        } else {
            if (i11 > 99) {
                stringBuffer.append(i11);
            } else {
                d(stringBuffer, i11);
            }
            i10 -= i11 * 100;
        }
        d(stringBuffer, i10);
    }

    public static TimeZone getDefaultTimeZone() {
        return DEFAULT_TIMEZONE;
    }

    @Deprecated
    public static DateFormat getISO8601Format(TimeZone timeZone, Locale locale) {
        return a(DATE_FORMAT_ISO8601, "yyyy-MM-dd'T'HH:mm:ss.SSSZ", timeZone, locale, null);
    }

    @Deprecated
    public static DateFormat getRFC1123Format(TimeZone timeZone, Locale locale) {
        return a(DATE_FORMAT_RFC1123, DATE_FORMAT_STR_RFC1123, timeZone, locale, null);
    }

    public void _clearFormats() {
        this.f43528q0 = null;
    }

    public void _format(TimeZone timeZone, Locale locale, Date date, StringBuffer stringBuffer) {
        Calendar calendar_getCalendar = _getCalendar(timeZone);
        calendar_getCalendar.setTime(date);
        int i10 = calendar_getCalendar.get(1);
        if (calendar_getCalendar.get(0) == 0) {
            _formatBCEYear(stringBuffer, i10);
        } else {
            if (i10 > 9999) {
                stringBuffer.append('+');
            }
            e(stringBuffer, i10);
        }
        stringBuffer.append('-');
        d(stringBuffer, calendar_getCalendar.get(2) + 1);
        stringBuffer.append('-');
        d(stringBuffer, calendar_getCalendar.get(5));
        stringBuffer.append('T');
        d(stringBuffer, calendar_getCalendar.get(11));
        stringBuffer.append(AbstractJsonLexerKt.COLON);
        d(stringBuffer, calendar_getCalendar.get(12));
        stringBuffer.append(AbstractJsonLexerKt.COLON);
        d(stringBuffer, calendar_getCalendar.get(13));
        stringBuffer.append('.');
        int i11 = calendar_getCalendar.get(14);
        int i12 = i11 / 100;
        if (i12 == 0) {
            stringBuffer.append('0');
        } else {
            stringBuffer.append((char) (i12 + 48));
            i11 -= i12 * 100;
        }
        d(stringBuffer, i11);
        int offset = timeZone.getOffset(calendar_getCalendar.getTimeInMillis());
        boolean z10 = this.f43529r0;
        if (offset == 0) {
            if (z10) {
                stringBuffer.append("+00:00");
                return;
            } else {
                stringBuffer.append("+0000");
                return;
            }
        }
        int i13 = offset / 60000;
        int iAbs = Math.abs(i13 / 60);
        int iAbs2 = Math.abs(i13 % 60);
        stringBuffer.append(offset < 0 ? '-' : '+');
        d(stringBuffer, iAbs);
        if (z10) {
            stringBuffer.append(AbstractJsonLexerKt.COLON);
        }
        d(stringBuffer, iAbs2);
    }

    public void _formatBCEYear(StringBuffer stringBuffer, int i10) {
        if (i10 == 1) {
            stringBuffer.append("+0000");
        } else {
            stringBuffer.append('-');
            e(stringBuffer, i10 - 1);
        }
    }

    public Calendar _getCalendar(TimeZone timeZone) {
        Calendar calendar = this.f43527p0;
        if (calendar == null) {
            calendar = (Calendar) CALENDAR.clone();
            this.f43527p0 = calendar;
        }
        if (!calendar.getTimeZone().equals(timeZone)) {
            calendar.setTimeZone(timeZone);
        }
        calendar.setLenient(isLenient());
        return calendar;
    }

    public Date _parseAsISO8601(String str, ParsePosition parsePosition) throws ParseException, IllegalArgumentException {
        int i10;
        String str2;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int length = str.length();
        TimeZone timeZone = DEFAULT_TIMEZONE;
        if (this._timezone != null && 'Z' != str.charAt(length - 1)) {
            timeZone = this._timezone;
        }
        Calendar calendar_getCalendar = _getCalendar(timeZone);
        calendar_getCalendar.clear();
        if (length > 10) {
            Matcher matcher = PATTERN_ISO8601.matcher(str);
            if (matcher.matches()) {
                int iStart = matcher.start(2);
                int iEnd = matcher.end(2);
                int i11 = iEnd - iStart;
                if (i11 > 1) {
                    int iB = b(iStart + 1, str) * 3600;
                    if (i11 >= 5) {
                        iB += b(iEnd - 2, str) * 60;
                    }
                    calendar_getCalendar.set(15, str.charAt(iStart) == '-' ? iB * NotificationManagerCompat.IMPORTANCE_UNSPECIFIED : iB * 1000);
                    calendar_getCalendar.set(16, 0);
                }
                calendar_getCalendar.set(c(str), b(5, str) - 1, b(8, str), b(11, str), b(14, str), (length <= 16 || str.charAt(16) != ':') ? 0 : b(17, str));
                int iStart2 = matcher.start(1);
                int i12 = iStart2 + 1;
                int iEnd2 = matcher.end(1);
                if (i12 >= iEnd2) {
                    calendar_getCalendar.set(14, 0);
                } else {
                    int i13 = iEnd2 - i12;
                    if (i13 != 0) {
                        if (i13 != 1) {
                            if (i13 == 2) {
                                iCharAt3 = 0;
                            } else {
                                if (i13 != 3 && i13 > 9) {
                                    throw new ParseException(String.format("Cannot parse date \"%s\": invalid fractional seconds '%s'; can use at most 9 digits", str, matcher.group(1).substring(1)), i12);
                                }
                                iCharAt3 = str.charAt(iStart2 + 3) - '0';
                            }
                            iCharAt2 = iCharAt3 + ((str.charAt(iStart2 + 2) - '0') * 10);
                        } else {
                            iCharAt2 = 0;
                        }
                        iCharAt = iCharAt2 + ((str.charAt(i12) - '0') * 100);
                    } else {
                        iCharAt = 0;
                    }
                    calendar_getCalendar.set(14, iCharAt);
                }
                return calendar_getCalendar.getTime();
            }
            i10 = 0;
            str2 = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";
        } else {
            if (PATTERN_PLAIN.matcher(str).matches()) {
                calendar_getCalendar.set(c(str), b(5, str) - 1, b(8, str), 0, 0, 0);
                calendar_getCalendar.set(14, 0);
                return calendar_getCalendar.getTime();
            }
            str2 = "yyyy-MM-dd";
            i10 = 0;
        }
        Object[] objArr = new Object[3];
        objArr[i10] = str;
        objArr[1] = str2;
        objArr[2] = this._lenient;
        throw new ParseException(String.format("Cannot parse date \"%s\": while it seems to fit format '%s', parsing fails (leniency? %s)", objArr), i10);
    }

    public Date _parseDate(String str, ParsePosition parsePosition) throws ParseException {
        if (looksLikeISO8601(str)) {
            return parseAsISO8601(str, parsePosition);
        }
        int length = str.length();
        while (true) {
            length--;
            if (length < 0) {
                break;
            }
            char cCharAt = str.charAt(length);
            if (cCharAt < '0' || cCharAt > '9') {
                if (length > 0 || cCharAt != '-') {
                    break;
                }
            }
        }
        if (length >= 0 || !(str.charAt(0) == '-' || NumberInput.inLongRange(str, false))) {
            return parseAsRFC1123(str, parsePosition);
        }
        try {
            return new Date(NumberInput.parseLong(str));
        } catch (NumberFormatException unused) {
            throw new ParseException(String.format("Timestamp value %s out of 64-bit value range", str), parsePosition.getErrorIndex());
        }
    }

    @Override // java.text.DateFormat
    public boolean equals(Object obj) {
        return obj == this;
    }

    @Override // java.text.DateFormat
    public StringBuffer format(Date date, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        TimeZone timeZone = this._timezone;
        if (timeZone == null) {
            timeZone = DEFAULT_TIMEZONE;
        }
        _format(timeZone, this._locale, date, stringBuffer);
        return stringBuffer;
    }

    @Override // java.text.DateFormat
    public TimeZone getTimeZone() {
        return this._timezone;
    }

    @Override // java.text.DateFormat
    public int hashCode() {
        return System.identityHashCode(this);
    }

    public boolean isColonIncludedInTimeZone() {
        return this.f43529r0;
    }

    @Override // java.text.DateFormat
    public boolean isLenient() {
        Boolean bool = this._lenient;
        return bool == null || bool.booleanValue();
    }

    public boolean looksLikeISO8601(String str) {
        return str.length() >= 7 && Character.isDigit(str.charAt(0)) && Character.isDigit(str.charAt(3)) && str.charAt(4) == '-' && Character.isDigit(str.charAt(5));
    }

    @Override // java.text.DateFormat
    public Date parse(String str) throws ParseException {
        String strTrim = str.trim();
        ParsePosition parsePosition = new ParsePosition(0);
        Date date_parseDate = _parseDate(strTrim, parsePosition);
        if (date_parseDate != null) {
            return date_parseDate;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : ALL_FORMATS) {
            if (sb2.length() > 0) {
                sb2.append("\", \"");
            } else {
                sb2.append('\"');
            }
            sb2.append(str2);
        }
        sb2.append('\"');
        throw new ParseException(String.format("Cannot parse date \"%s\": not compatible with any of standard forms (%s)", strTrim, sb2.toString()), parsePosition.getErrorIndex());
    }

    public Date parseAsISO8601(String str, ParsePosition parsePosition) throws ParseException {
        try {
            return _parseAsISO8601(str, parsePosition);
        } catch (IllegalArgumentException e5) {
            throw new ParseException(String.format("Cannot parse date \"%s\", problem: %s", str, e5.getMessage()), parsePosition.getErrorIndex());
        }
    }

    public Date parseAsRFC1123(String str, ParsePosition parsePosition) {
        if (this.f43528q0 == null) {
            this.f43528q0 = a(DATE_FORMAT_RFC1123, DATE_FORMAT_STR_RFC1123, this._timezone, this._locale, this._lenient);
        }
        return this.f43528q0.parse(str, parsePosition);
    }

    @Override // java.text.DateFormat
    public void setLenient(boolean z10) {
        Boolean boolValueOf = Boolean.valueOf(z10);
        if (_equals(boolValueOf, this._lenient)) {
            return;
        }
        this._lenient = boolValueOf;
        _clearFormats();
    }

    @Override // java.text.DateFormat
    public void setTimeZone(TimeZone timeZone) {
        if (timeZone.equals(this._timezone)) {
            return;
        }
        _clearFormats();
        this._timezone = timeZone;
    }

    public String toPattern() {
        return d.f(a.a(100, "[one of: 'yyyy-MM-dd'T'HH:mm:ss.SSSZ', 'EEE, dd MMM yyyy HH:mm:ss zzz' ("), Boolean.FALSE.equals(this._lenient) ? "strict" : "lenient", ")]");
    }

    public String toString() {
        return String.format("DateFormat %s: (timezone: %s, locale: %s, lenient: %s)", getClass().getName(), this._timezone, this._locale, this._lenient);
    }

    public StdDateFormat withColonInTimeZone(boolean z10) {
        return this.f43529r0 == z10 ? this : new StdDateFormat(this._timezone, this._locale, this._lenient, z10);
    }

    public StdDateFormat withLenient(Boolean bool) {
        return _equals(bool, this._lenient) ? this : new StdDateFormat(this._timezone, this._locale, bool, this.f43529r0);
    }

    public StdDateFormat withLocale(Locale locale) {
        return locale.equals(this._locale) ? this : new StdDateFormat(this._timezone, locale, this._lenient, this.f43529r0);
    }

    public StdDateFormat withTimeZone(TimeZone timeZone) {
        if (timeZone == null) {
            timeZone = DEFAULT_TIMEZONE;
        }
        TimeZone timeZone2 = this._timezone;
        return (timeZone == timeZone2 || timeZone.equals(timeZone2)) ? this : new StdDateFormat(timeZone, this._locale, this._lenient, this.f43529r0);
    }

    @Override // java.text.DateFormat, java.text.Format
    public StdDateFormat clone() {
        return new StdDateFormat(this._timezone, this._locale, this._lenient, this.f43529r0);
    }

    @Deprecated
    public StdDateFormat(TimeZone timeZone, Locale locale) {
        this.f43529r0 = false;
        this._timezone = timeZone;
        this._locale = locale;
    }

    public StdDateFormat(TimeZone timeZone, Locale locale, Boolean bool) {
        this(timeZone, locale, bool, false);
    }

    public StdDateFormat(TimeZone timeZone, Locale locale, Boolean bool, boolean z10) {
        this._timezone = timeZone;
        this._locale = locale;
        this._lenient = bool;
        this.f43529r0 = z10;
    }

    @Override // java.text.DateFormat
    public Date parse(String str, ParsePosition parsePosition) {
        try {
            return _parseDate(str, parsePosition);
        } catch (ParseException unused) {
            return null;
        }
    }
}
