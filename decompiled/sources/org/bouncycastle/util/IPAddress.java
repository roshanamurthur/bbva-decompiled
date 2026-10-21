package org.bouncycastle.util;

import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes13.dex */
public class IPAddress {
    public static boolean isValid(String str) {
        return isValidIPv4(str) || isValidIPv6(str);
    }

    public static boolean isValidIPv4(String str) {
        int iIndexOf;
        if (str.length() == 0) {
            return false;
        }
        String strConcat = str.concat(Constant.DOT_STRING);
        int i10 = 0;
        int i11 = 0;
        while (i10 < strConcat.length() && (iIndexOf = strConcat.indexOf(46, i10)) > i10) {
            if (i11 == 4) {
                return false;
            }
            try {
                int i12 = Integer.parseInt(strConcat.substring(i10, iIndexOf));
                if (i12 < 0 || i12 > 255) {
                    return false;
                }
                i10 = iIndexOf + 1;
                i11++;
            } catch (NumberFormatException unused) {
            }
        }
        return i11 == 4;
    }

    public static boolean isValidIPv4WithNetmask(String str) {
        int iIndexOf = str.indexOf("/");
        String strSubstring = str.substring(iIndexOf + 1);
        if (iIndexOf <= 0 || !isValidIPv4(str.substring(0, iIndexOf))) {
            return false;
        }
        if (!isValidIPv4(strSubstring)) {
            try {
                int i10 = Integer.parseInt(strSubstring);
                if (i10 < 0 || i10 > 32) {
                    return false;
                }
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return true;
    }

    public static boolean isValidIPv6(String str) {
        int iIndexOf;
        if (str.length() == 0) {
            return false;
        }
        String strConcat = str.concat(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        while (i10 < strConcat.length() && (iIndexOf = strConcat.indexOf(58, i10)) >= i10) {
            if (i11 == 8) {
                return false;
            }
            if (i10 != iIndexOf) {
                String strSubstring = strConcat.substring(i10, iIndexOf);
                if (iIndexOf != strConcat.length() - 1 || strSubstring.indexOf(46) <= 0) {
                    try {
                        int i12 = Integer.parseInt(strConcat.substring(i10, iIndexOf), 16);
                        if (i12 < 0 || i12 > 65535) {
                            return false;
                        }
                    } catch (NumberFormatException unused) {
                    }
                } else {
                    if (!isValidIPv4(strSubstring)) {
                        return false;
                    }
                    i11++;
                }
            } else {
                if (iIndexOf != 1 && iIndexOf != strConcat.length() - 1 && z10) {
                    return false;
                }
                z10 = true;
            }
            i10 = iIndexOf + 1;
            i11++;
        }
        return i11 == 8 || z10;
    }

    public static boolean isValidIPv6WithNetmask(String str) {
        int iIndexOf = str.indexOf("/");
        String strSubstring = str.substring(iIndexOf + 1);
        if (iIndexOf <= 0 || !isValidIPv6(str.substring(0, iIndexOf))) {
            return false;
        }
        if (!isValidIPv6(strSubstring)) {
            try {
                int i10 = Integer.parseInt(strSubstring);
                if (i10 < 0 || i10 > 128) {
                    return false;
                }
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return true;
    }

    public static boolean isValidWithNetMask(String str) {
        return isValidIPv4WithNetmask(str) || isValidIPv6WithNetmask(str);
    }
}
