package com.facetec.sdk;

import com.bbva.ethermobilesdk.deviceinfo.component.Time;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes9.dex */
public final class fx {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final TimeZone f41707c = TimeZone.getTimeZone("UTC");

    private static int b(String str, int i10, int i11) throws NumberFormatException {
        int i12;
        int i13;
        if (i10 < 0 || i11 > str.length() || i10 > i11) {
            throw new NumberFormatException(str);
        }
        if (i10 < i11) {
            i13 = i10 + 1;
            int iDigit = Character.digit(str.charAt(i10), 10);
            if (iDigit < 0) {
                StringBuilder sb2 = new StringBuilder("Invalid number: ");
                sb2.append(str.substring(i10, i11));
                throw new NumberFormatException(sb2.toString());
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
                StringBuilder sb3 = new StringBuilder("Invalid number: ");
                sb3.append(str.substring(i10, i11));
                throw new NumberFormatException(sb3.toString());
            }
            i12 = (i12 * 10) - iDigit2;
            i13 = i14;
        }
        return -i12;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:103:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:97:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:98:0x01db  */
    public static Date d(String str, ParsePosition parsePosition) throws ParseException {
        String string;
        String message;
        int i10;
        int i11;
        int iB;
        int iB2;
        int length;
        TimeZone timeZone;
        char cCharAt;
        int length2;
        try {
            int index = parsePosition.getIndex();
            int i12 = index + 4;
            int iB3 = b(str, index, i12);
            if (d(str, i12, '-')) {
                i12 = index + 5;
            }
            int i13 = i12 + 2;
            int iB4 = b(str, i12, i13);
            if (d(str, i13, '-')) {
                i13 = i12 + 3;
            }
            int i14 = i13 + 2;
            int iB5 = b(str, i13, i14);
            boolean zD = d(str, i14, 'T');
            if (!zD && str.length() <= i14) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(iB3, iB4 - 1, iB5);
                parsePosition.setIndex(i14);
                return gregorianCalendar.getTime();
            }
            if (zD) {
                int i15 = i13 + 5;
                int iB6 = b(str, i13 + 3, i15);
                if (d(str, i15, AbstractJsonLexerKt.COLON)) {
                    i15 = i13 + 6;
                }
                int i16 = i15 + 2;
                int iB7 = b(str, i15, i16);
                if (d(str, i16, AbstractJsonLexerKt.COLON)) {
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
                    if (d(str, i17, '.')) {
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
            if (cCharAt3 == 'Z') {
                timeZone = f41707c;
                length = i14 + 1;
            } else {
                if (cCharAt3 != '+' && cCharAt3 != '-') {
                    StringBuilder sb2 = new StringBuilder("Invalid time zone indicator '");
                    sb2.append(cCharAt3);
                    sb2.append("'");
                    throw new IndexOutOfBoundsException(sb2.toString());
                }
                String strSubstring = str.substring(i14);
                if (strSubstring.length() < 5) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(strSubstring);
                    sb3.append("00");
                    strSubstring = sb3.toString();
                }
                length = i14 + strSubstring.length();
                if ("+0000".equals(strSubstring) || "+00:00".equals(strSubstring)) {
                    timeZone = f41707c;
                } else {
                    String strConcat = Time.GMT.concat(strSubstring);
                    TimeZone timeZone2 = TimeZone.getTimeZone(strConcat);
                    String id = timeZone2.getID();
                    if (!id.equals(strConcat) && !id.replace(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER, "").equals(strConcat)) {
                        StringBuilder sb4 = new StringBuilder("Mismatching time zone indicator: ");
                        sb4.append(strConcat);
                        sb4.append(" given, resolves to ");
                        sb4.append(timeZone2.getID());
                        throw new IndexOutOfBoundsException(sb4.toString());
                    }
                    timeZone = timeZone2;
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
        } catch (IllegalArgumentException e5) {
            e = e5;
            if (str == null) {
                string = null;
            } else {
                StringBuilder sb5 = new StringBuilder("\"");
                sb5.append(str);
                sb5.append('\"');
                string = sb5.toString();
            }
            message = e.getMessage();
            if (message != null || message.isEmpty()) {
                StringBuilder sb6 = new StringBuilder("(");
                sb6.append(e.getClass().getName());
                sb6.append(")");
                message = sb6.toString();
            }
            StringBuilder sb7 = new StringBuilder("Failed to parse date [");
            sb7.append(string);
            sb7.append("]: ");
            sb7.append(message);
            ParseException parseException = new ParseException(sb7.toString(), parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        } catch (IndexOutOfBoundsException e7) {
            e = e7;
            if (str == null) {
                string = null;
            } else {
                StringBuilder sb8 = new StringBuilder("\"");
                sb8.append(str);
                sb8.append('\"');
                string = sb8.toString();
            }
            message = e.getMessage();
            if (message != null) {
                StringBuilder sb9 = new StringBuilder("(");
                sb9.append(e.getClass().getName());
                sb9.append(")");
                message = sb9.toString();
            } else {
                StringBuilder sb10 = new StringBuilder("(");
                sb10.append(e.getClass().getName());
                sb10.append(")");
                message = sb10.toString();
            }
            StringBuilder sb11 = new StringBuilder("Failed to parse date [");
            sb11.append(string);
            sb11.append("]: ");
            sb11.append(message);
            ParseException parseException2 = new ParseException(sb11.toString(), parsePosition.getIndex());
            parseException2.initCause(e);
            throw parseException2;
        } catch (NumberFormatException e10) {
            e = e10;
            if (str == null) {
                string = null;
            } else {
                StringBuilder sb12 = new StringBuilder("\"");
                sb12.append(str);
                sb12.append('\"');
                string = sb12.toString();
            }
            message = e.getMessage();
            if (message != null) {
                StringBuilder sb13 = new StringBuilder("(");
                sb13.append(e.getClass().getName());
                sb13.append(")");
                message = sb13.toString();
            } else {
                StringBuilder sb14 = new StringBuilder("(");
                sb14.append(e.getClass().getName());
                sb14.append(")");
                message = sb14.toString();
            }
            StringBuilder sb15 = new StringBuilder("Failed to parse date [");
            sb15.append(string);
            sb15.append("]: ");
            sb15.append(message);
            ParseException parseException3 = new ParseException(sb15.toString(), parsePosition.getIndex());
            parseException3.initCause(e);
            throw parseException3;
        }
    }

    private static boolean d(String str, int i10, char c10) {
        return i10 < str.length() && str.charAt(i10) == c10;
    }
}
