package com.google.zxing.client.result;

import com.bbva.glomohybrid.login.domain.constants.LoginHelperConstants;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.Result;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes10.dex */
public final class VINResultParser extends ResultParser {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f49796e = Pattern.compile("[IOQ]");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f49797f = Pattern.compile("[A-Z0-9]{17}");

    public static String c(String str) {
        char cCharAt = str.charAt(0);
        char cCharAt2 = str.charAt(1);
        if (cCharAt == '9') {
            if (cCharAt2 >= 'A' && cCharAt2 <= 'E') {
                return "BR";
            }
            if (cCharAt2 < '3' || cCharAt2 > '9') {
                return null;
            }
            return "BR";
        }
        if (cCharAt == 'S') {
            if (cCharAt2 >= 'A' && cCharAt2 <= 'M') {
                return "UK";
            }
            if (cCharAt2 < 'N' || cCharAt2 > 'T') {
                return null;
            }
            return "DE";
        }
        if (cCharAt == 'Z') {
            if (cCharAt2 < 'A' || cCharAt2 > 'R') {
                return null;
            }
            return "IT";
        }
        switch (cCharAt) {
            case '1':
            case '4':
            case '5':
                return "US";
            case '2':
                return "CA";
            case '3':
                if (cCharAt2 < 'A' || cCharAt2 > 'W') {
                    return null;
                }
                return "MX";
            default:
                switch (cCharAt) {
                    case 'J':
                        if (cCharAt2 < 'A' || cCharAt2 > 'T') {
                            return null;
                        }
                        return "JP";
                    case 'K':
                        if (cCharAt2 < 'L' || cCharAt2 > 'R') {
                            return null;
                        }
                        return "KO";
                    case 'L':
                        return LoginHelperConstants.CLIENT_STATUS_CANCELLED_BY_BUSINESS;
                    case 'M':
                        if (cCharAt2 < 'A' || cCharAt2 > 'E') {
                            return null;
                        }
                        return "IN";
                    default:
                        switch (cCharAt) {
                            case 'V':
                                if (cCharAt2 >= 'F' && cCharAt2 <= 'R') {
                                    return "FR";
                                }
                                if (cCharAt2 < 'S' || cCharAt2 > 'W') {
                                    return null;
                                }
                                return "ES";
                            case 'W':
                                return "DE";
                            case 'X':
                                if (cCharAt2 == '0') {
                                    return "RU";
                                }
                                if (cCharAt2 < '3' || cCharAt2 > '9') {
                                    return null;
                                }
                                return "RU";
                            default:
                                return null;
                        }
                }
        }
    }

    @Override // com.google.zxing.client.result.ResultParser
    public VINParsedResult parse(Result result) {
        char c10;
        int i10;
        int i11;
        if (result.getBarcodeFormat() != BarcodeFormat.CODE_39) {
            return null;
        }
        String strTrim = f49796e.matcher(result.getText()).replaceAll("").trim();
        if (!f49797f.matcher(strTrim).matches()) {
            return null;
        }
        int i12 = 0;
        int i13 = 0;
        while (true) {
            try {
                int i14 = 10;
                if (i12 >= strTrim.length()) {
                    char cCharAt = strTrim.charAt(8);
                    int i15 = i13 % 11;
                    if (i15 < 10) {
                        c10 = (char) (i15 + 48);
                    } else {
                        if (i15 != 10) {
                            throw new IllegalArgumentException();
                        }
                        c10 = 'X';
                    }
                    if (cCharAt != c10) {
                        return null;
                    }
                    String strSubstring = strTrim.substring(0, 3);
                    String strSubstring2 = strTrim.substring(3, 9);
                    String strSubstring3 = strTrim.substring(9, 17);
                    String strC = c(strSubstring);
                    String strSubstring4 = strTrim.substring(3, 8);
                    char cCharAt2 = strTrim.charAt(9);
                    if (cCharAt2 >= 'E' && cCharAt2 <= 'H') {
                        i10 = cCharAt2 + 1915;
                    } else if (cCharAt2 >= 'J' && cCharAt2 <= 'N') {
                        i10 = cCharAt2 + 1914;
                    } else if (cCharAt2 == 'P') {
                        i10 = 1993;
                    } else if (cCharAt2 >= 'R' && cCharAt2 <= 'T') {
                        i10 = cCharAt2 + 1912;
                    } else if (cCharAt2 >= 'V' && cCharAt2 <= 'Y') {
                        i10 = cCharAt2 + 1911;
                    } else if (cCharAt2 >= '1' && cCharAt2 <= '9') {
                        i10 = cCharAt2 + 1952;
                    } else {
                        if (cCharAt2 < 'A' || cCharAt2 > 'D') {
                            throw new IllegalArgumentException();
                        }
                        i10 = cCharAt2 + 1945;
                    }
                    return new VINParsedResult(strTrim, strSubstring, strSubstring2, strSubstring3, strC, strSubstring4, i10, strTrim.charAt(10), strTrim.substring(11));
                }
                int i16 = i12 + 1;
                if (i16 > 0 && i16 <= 7) {
                    i14 = 9 - i16;
                } else if (i16 != 8) {
                    if (i16 == 9) {
                        i14 = 0;
                    } else {
                        if (i16 < 10 || i16 > 17) {
                            throw new IllegalArgumentException();
                        }
                        i14 = 19 - i16;
                    }
                }
                char cCharAt3 = strTrim.charAt(i12);
                if (cCharAt3 >= 'A' && cCharAt3 <= 'I') {
                    i11 = cCharAt3 - '@';
                } else if (cCharAt3 >= 'J' && cCharAt3 <= 'R') {
                    i11 = cCharAt3 - 'I';
                } else if (cCharAt3 >= 'S' && cCharAt3 <= 'Z') {
                    i11 = cCharAt3 - 'Q';
                } else {
                    if (cCharAt3 < '0' || cCharAt3 > '9') {
                        throw new IllegalArgumentException();
                    }
                    i11 = cCharAt3 - '0';
                }
                i13 += i14 * i11;
                i12 = i16;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }
}
