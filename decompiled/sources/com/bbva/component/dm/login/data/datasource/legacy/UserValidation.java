package com.bbva.component.dm.login.data.datasource.legacy;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class UserValidation {
    public static String getFormattedUserId(String str) {
        boolean z10;
        String string = null;
        String strTrim = str != null ? str.trim() : null;
        if (TextUtils.isEmpty(strTrim)) {
            return null;
        }
        String upperCase = strTrim.toUpperCase();
        int length = upperCase.length();
        int i10 = length - 1;
        boolean z11 = false;
        char cCharAt = upperCase.charAt(0);
        char cCharAt2 = upperCase.charAt(i10);
        int length2 = upperCase.length();
        if (length2 > 0) {
            z10 = true;
            for (int i11 = 0; i11 < length2 && z10; i11++) {
                if (!Character.isDigit(upperCase.charAt(i11))) {
                    z10 = false;
                }
            }
        } else {
            z10 = false;
        }
        try {
            if (length <= 2 || !Character.isUpperCase(cCharAt) || !Character.isUpperCase(cCharAt2) || Character.isDigit(cCharAt) || Character.isDigit(cCharAt2)) {
                if (length <= 1 || !Character.isUpperCase(cCharAt2) || Character.isDigit(cCharAt2)) {
                    if (z10 && length == 9) {
                        Integer.parseInt(upperCase);
                        StringBuilder sb2 = new StringBuilder("404134");
                        sb2.append(upperCase);
                        String string2 = sb2.toString();
                        int length3 = string2.length();
                        int i12 = 0;
                        int i13 = 0;
                        int i14 = 0;
                        int i15 = 0;
                        while (i12 < length3) {
                            int i16 = i12 + 1;
                            int i17 = Integer.parseInt(string2.substring(i12, i16));
                            if (i12 % 2 != 0) {
                                i13 += i17;
                            } else {
                                int i18 = i17 * 2;
                                if (i18 > 9) {
                                    i14 += (i18 / 10) + (i18 % 10);
                                } else {
                                    i15 += i18;
                                }
                            }
                            i12 = i16;
                        }
                        int i19 = ((i13 + i14) + i15) % 10;
                        if (i19 > 0) {
                            i19 = 10 - i19;
                        }
                        sb2.append(i19);
                        string = sb2.toString();
                    } else if (z10 && (length == 7 || length == 16)) {
                        string = upperCase;
                    }
                    z11 = true;
                } else if (length <= 10) {
                    int i20 = Integer.parseInt(upperCase.substring(0, i10)) % 23;
                    if (i20 >= 0 && i20 < 23 && "TRWAGMYFPDXBNJZSQVHLCKE".charAt(i20) == cCharAt2) {
                        StringBuilder sb3 = new StringBuilder("0019-");
                        int i21 = 10 - length;
                        for (int i22 = 0; i22 < i21; i22++) {
                            sb3.append("0");
                        }
                        sb3.append(upperCase);
                        string = sb3.toString();
                    }
                    z11 = true;
                }
            } else if (length <= 10) {
                String strSubstring = upperCase.substring(1, i10);
                int i23 = Integer.parseInt(strSubstring);
                if ("XJLKMYZR".indexOf(cCharAt) >= 0) {
                    if (cCharAt == 'Y') {
                        i23 += 10000000;
                        Integer.toString(i23);
                    } else if (cCharAt == 'Z') {
                        i23 += 20000000;
                        Integer.toString(i23);
                    }
                    int i24 = i23 % 23;
                    if (i24 >= 0 && i24 < 24 && "TRWAGMYFPDXBNJZSQVHLCKET".charAt(i24) == cCharAt2) {
                        string = "0019-" + cCharAt + strSubstring + cCharAt2;
                    }
                }
                z11 = true;
            }
        } catch (NumberFormatException unused) {
        }
        return !z11 ? "0019-".concat(upperCase) : string;
    }
}
