package com.google.zxing.client.result;

import com.google.zxing.Result;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ResultParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ResultParser[] f49760a = {new BookmarkDoCoMoResultParser(), new AddressBookDoCoMoResultParser(), new EmailDoCoMoResultParser(), new AddressBookAUResultParser(), new VCardResultParser(), new BizcardResultParser(), new VEventResultParser(), new EmailAddressResultParser(), new SMTPResultParser(), new TelResultParser(), new SMSMMSResultParser(), new SMSTOMMSTOResultParser(), new GeoResultParser(), new WifiResultParser(), new URLTOResultParser(), new URIResultParser(), new ISBNResultParser(), new ProductResultParser(), new ExpandedProductResultParser(), new VINResultParser()};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f49761b = Pattern.compile("\\d+");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f49762c = Pattern.compile("&");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f49763d = Pattern.compile("=");

    public static String[] a(String str, String str2, char c10, boolean z10) {
        int length = str2.length();
        ArrayList arrayList = null;
        int i10 = 0;
        while (i10 < length) {
            int iIndexOf = str2.indexOf(str, i10);
            if (iIndexOf < 0) {
                break;
            }
            int length2 = str.length() + iIndexOf;
            boolean z11 = true;
            ArrayList arrayList2 = arrayList;
            int length3 = length2;
            while (z11) {
                int iIndexOf2 = str2.indexOf(c10, length3);
                if (iIndexOf2 < 0) {
                    length3 = str2.length();
                } else {
                    int i11 = 0;
                    for (int i12 = iIndexOf2 - 1; i12 >= 0 && str2.charAt(i12) == '\\'; i12--) {
                        i11++;
                    }
                    if (i11 % 2 != 0) {
                        length3 = iIndexOf2 + 1;
                    } else {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList(3);
                        }
                        String strUnescapeBackslash = unescapeBackslash(str2.substring(length2, iIndexOf2));
                        if (z10) {
                            strUnescapeBackslash = strUnescapeBackslash.trim();
                        }
                        if (!strUnescapeBackslash.isEmpty()) {
                            arrayList2.add(strUnescapeBackslash);
                        }
                        length3 = iIndexOf2 + 1;
                    }
                }
                z11 = false;
            }
            i10 = length3;
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static HashMap b(String str) {
        int iIndexOf = str.indexOf(63);
        if (iIndexOf < 0) {
            return null;
        }
        HashMap map = new HashMap(3);
        for (String str2 : f49762c.split(str.substring(iIndexOf + 1))) {
            String[] strArrSplit = f49763d.split(str2, 2);
            if (strArrSplit.length == 2) {
                try {
                    try {
                        map.put(strArrSplit[0], URLDecoder.decode(strArrSplit[1], "UTF-8"));
                    } catch (UnsupportedEncodingException e5) {
                        throw new IllegalStateException(e5);
                    }
                } catch (IllegalArgumentException unused) {
                }
            }
        }
        return map;
    }

    public static String getMassagedText(Result result) {
        String text = result.getText();
        return text.startsWith("\ufeff") ? text.substring(1) : text;
    }

    public static boolean isStringOfDigits(CharSequence charSequence, int i10) {
        return charSequence != null && i10 > 0 && i10 == charSequence.length() && f49761b.matcher(charSequence).matches();
    }

    public static boolean isSubstringOfDigits(CharSequence charSequence, int i10, int i11) {
        int i12;
        return charSequence != null && i11 > 0 && charSequence.length() >= (i12 = i11 + i10) && f49761b.matcher(charSequence.subSequence(i10, i12)).matches();
    }

    public static void maybeAppend(String str, StringBuilder sb2) {
        if (str != null) {
            sb2.append('\n');
            sb2.append(str);
        }
    }

    public static String[] maybeWrap(String str) {
        if (str == null) {
            return null;
        }
        return new String[]{str};
    }

    public static int parseHexDigit(char c10) {
        if (c10 >= '0' && c10 <= '9') {
            return c10 - '0';
        }
        if (c10 >= 'a' && c10 <= 'f') {
            return c10 - 'W';
        }
        if (c10 < 'A' || c10 > 'F') {
            return -1;
        }
        return c10 - '7';
    }

    public static ParsedResult parseResult(Result result) {
        for (ResultParser resultParser : f49760a) {
            ParsedResult parsedResult = resultParser.parse(result);
            if (parsedResult != null) {
                return parsedResult;
            }
        }
        return new TextParsedResult(result.getText(), null);
    }

    public static String unescapeBackslash(String str) {
        int iIndexOf = str.indexOf(92);
        if (iIndexOf < 0) {
            return str;
        }
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(length - 1);
        sb2.append(str.toCharArray(), 0, iIndexOf);
        boolean z10 = false;
        while (iIndexOf < length) {
            char cCharAt = str.charAt(iIndexOf);
            if (z10 || cCharAt != '\\') {
                sb2.append(cCharAt);
                z10 = false;
            } else {
                z10 = true;
            }
            iIndexOf++;
        }
        return sb2.toString();
    }

    public abstract ParsedResult parse(Result result);

    public static void maybeAppend(String[] strArr, StringBuilder sb2) {
        if (strArr != null) {
            for (String str : strArr) {
                sb2.append('\n');
                sb2.append(str);
            }
        }
    }
}
