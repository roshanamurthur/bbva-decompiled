package com.fasterxml.jackson.databind.util;

import androidx.camera.core.impl.utils.a;
import androidx.camera.core.impl.utils.c;
import com.bbva.ethermobilesdk.deviceinfo.component.Time;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* JADX INFO: loaded from: classes9.dex */
@Deprecated
public class ISO8601Utils {
    protected static final int DEF_8601_LEN = 29;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TimeZone f43513a = TimeZone.getTimeZone("UTC");

    public static boolean a(String str, int i10, char c10) {
        return i10 < str.length() && str.charAt(i10) == c10;
    }

    public static int b(String str, int i10, int i11) throws NumberFormatException {
        int i12;
        int i13;
        if (i10 < 0 || i11 > str.length() || i10 > i11) {
            throw new NumberFormatException(str);
        }
        if (i10 < i11) {
            i13 = i10 + 1;
            int iDigit = Character.digit(str.charAt(i10), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i10, i11));
            }
            i12 = -iDigit;
        } else {
            i12 = 0;
            i13 = i10;
        }
        while (i13 < i11) {
            int i14 = i13 + 1;
            int iDigit2 = Character.digit(str.charAt(i13), 10);
            if (iDigit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i10, i11));
            }
            i12 = (i12 * 10) - iDigit2;
            i13 = i14;
        }
        return -i12;
    }

    public static String format(Date date) {
        return format(date, false, f43513a);
    }

    public static Date parse(String str, ParsePosition parsePosition) throws ParseException {
        int i10;
        int i11;
        int iB;
        int iB2;
        int length;
        char cCharAt;
        int length2;
        try {
            int index = parsePosition.getIndex();
            int i12 = index + 4;
            int iB3 = b(str, index, i12);
            if (a(str, i12, '-')) {
                i12 = index + 5;
            }
            int i13 = i12 + 2;
            int iB4 = b(str, i12, i13);
            if (a(str, i13, '-')) {
                i13 = i12 + 3;
            }
            int i14 = i13 + 2;
            int iB5 = b(str, i13, i14);
            boolean zA = a(str, i14, 'T');
            if (!zA && str.length() <= i14) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(iB3, iB4 - 1, iB5);
                parsePosition.setIndex(i14);
                return gregorianCalendar.getTime();
            }
            if (zA) {
                int i15 = i13 + 5;
                int iB6 = b(str, i13 + 3, i15);
                if (a(str, i15, AbstractJsonLexerKt.COLON)) {
                    i15 = i13 + 6;
                }
                int i16 = i15 + 2;
                int iB7 = b(str, i15, i16);
                if (a(str, i16, AbstractJsonLexerKt.COLON)) {
                    i16 = i15 + 3;
                }
                if (str.length() <= i16 || (cCharAt = str.charAt(i16)) == 'Z' || cCharAt == '+' || cCharAt == '-') {
                    i11 = iB7;
                    iB = 0;
                    iB2 = 0;
                    i14 = i16;
                    i10 = iB6;
                } else {
                    int i17 = i16 + 2;
                    iB2 = b(str, i16, i17);
                    if (iB2 > 59 && iB2 < 63) {
                        iB2 = 59;
                    }
                    if (a(str, i17, '.')) {
                        int i18 = i16 + 3;
                        int i19 = i16 + 4;
                        while (true) {
                            if (i19 >= str.length()) {
                                length2 = str.length();
                                break;
                            }
                            char cCharAt2 = str.charAt(i19);
                            if (cCharAt2 >= '0' && cCharAt2 <= '9') {
                                i19++;
                            }
                            length2 = i19;
                            break;
                        }
                        int iMin = Math.min(length2, i16 + 6);
                        iB = b(str, i18, iMin);
                        int i20 = iMin - i18;
                        if (i20 == 1) {
                            iB *= 100;
                        } else if (i20 == 2) {
                            iB *= 10;
                        }
                        i10 = iB6;
                        i14 = length2;
                        i11 = iB7;
                    } else {
                        i10 = iB6;
                        i14 = i17;
                        i11 = iB7;
                        iB = 0;
                    }
                }
            } else {
                i10 = 0;
                i11 = 0;
                iB = 0;
                iB2 = 0;
            }
            if (str.length() <= i14) {
                throw new IllegalArgumentException("No time zone indicator");
            }
            char cCharAt3 = str.charAt(i14);
            TimeZone timeZone = f43513a;
            if (cCharAt3 == 'Z') {
                length = i14 + 1;
            } else {
                if (cCharAt3 != '+' && cCharAt3 != '-') {
                    throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt3 + "'");
                }
                String strSubstring = str.substring(i14);
                length = i14 + strSubstring.length();
                if (!"+0000".equals(strSubstring) && !"+00:00".equals(strSubstring)) {
                    String str2 = Time.GMT + strSubstring;
                    timeZone = TimeZone.getTimeZone(str2);
                    String id = timeZone.getID();
                    if (!id.equals(str2) && !id.replace(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER, "").equals(str2)) {
                        throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str2 + " given, resolves to " + timeZone.getID());
                    }
                }
            }
            GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
            gregorianCalendar2.setLenient(false);
            gregorianCalendar2.set(1, iB3);
            gregorianCalendar2.set(2, iB4 - 1);
            gregorianCalendar2.set(5, iB5);
            gregorianCalendar2.set(11, i10);
            gregorianCalendar2.set(12, i11);
            gregorianCalendar2.set(13, iB2);
            gregorianCalendar2.set(14, iB);
            parsePosition.setIndex(length);
            return gregorianCalendar2.getTime();
        } catch (Exception e5) {
            String strA = str == null ? null : a.a("\"", str, '\"');
            String message = e5.getMessage();
            if (message == null || message.isEmpty()) {
                message = "(" + e5.getClass().getName() + ")";
            }
            ParseException parseException = new ParseException(c.a("Failed to parse date ", strA, ": ", message), parsePosition.getIndex());
            parseException.initCause(e5);
            throw parseException;
        }
    }

    public static String format(Date date, boolean z10) {
        return format(date, z10, f43513a);
    }

    @Deprecated
    public static String format(Date date, boolean z10, TimeZone timeZone) {
        return format(date, z10, timeZone, Locale.US);
    }

    public static String format(Date date, boolean z10, TimeZone timeZone, Locale locale) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, locale);
        gregorianCalendar.setTime(date);
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append(String.format("%04d-%02d-%02dT%02d:%02d:%02d", Integer.valueOf(gregorianCalendar.get(1)), Integer.valueOf(gregorianCalendar.get(2) + 1), Integer.valueOf(gregorianCalendar.get(5)), Integer.valueOf(gregorianCalendar.get(11)), Integer.valueOf(gregorianCalendar.get(12)), Integer.valueOf(gregorianCalendar.get(13))));
        if (z10) {
            sb2.append(String.format(".%03d", Integer.valueOf(gregorianCalendar.get(14))));
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i10 = offset / 60000;
            int iAbs = Math.abs(i10 / 60);
            int iAbs2 = Math.abs(i10 % 60);
            Object[] objArr = new Object[3];
            objArr[0] = Character.valueOf(offset < 0 ? '-' : '+');
            objArr[1] = Integer.valueOf(iAbs);
            objArr[2] = Integer.valueOf(iAbs2);
            sb2.append(String.format("%c%02d:%02d", objArr));
        } else {
            sb2.append(Matrix.MATRIX_TYPE_ZERO);
        }
        return sb2.toString();
    }
}
