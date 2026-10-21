package org.junit;

import androidx.camera.core.impl.utils.c;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes13.dex */
public class ComparisonFailure extends AssertionError {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final String f91793p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final String f91794q0;

    public ComparisonFailure(String str, String str2, String str3) {
        super(str);
        this.f91793p0 = str2;
        this.f91794q0 = str3;
    }

    public String getActual() {
        return this.f91794q0;
    }

    public String getExpected() {
        return this.f91793p0;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String strSubstring;
        String str;
        String str2;
        String message = super.getMessage();
        String str3 = this.f91793p0;
        String str4 = this.f91794q0;
        if (str3 == null || str4 == null || str3.equals(str4)) {
            return Assert.b(message, str3, str4);
        }
        int iMin = Math.min(str3.length(), str4.length());
        int i10 = 0;
        while (true) {
            if (i10 >= iMin) {
                strSubstring = str3.substring(0, iMin);
                break;
            }
            if (str3.charAt(i10) != str4.charAt(i10)) {
                strSubstring = str3.substring(0, i10);
                break;
            }
            i10++;
        }
        int iMin2 = Math.min(str3.length() - strSubstring.length(), str4.length() - strSubstring.length()) - 1;
        int i11 = 0;
        while (i11 <= iMin2 && str3.charAt((str3.length() - 1) - i11) == str4.charAt((str4.length() - 1) - i11)) {
            i11++;
        }
        String strSubstring2 = str3.substring(str3.length() - i11);
        if (strSubstring.length() <= 20) {
            str = strSubstring;
        } else {
            str = "..." + strSubstring.substring(strSubstring.length() - 20);
        }
        if (strSubstring2.length() <= 20) {
            str2 = strSubstring2;
        } else {
            str2 = strSubstring2.substring(0, 20) + "...";
        }
        StringBuilder sbD = c.d(str);
        sbD.append(Constant.BRACKET_OPEN + str3.substring(strSubstring.length(), str3.length() - strSubstring2.length()) + Constant.BRACKET_CLOSE);
        sbD.append(str2);
        String string = sbD.toString();
        StringBuilder sbD2 = c.d(str);
        sbD2.append(Constant.BRACKET_OPEN + str4.substring(strSubstring.length(), str4.length() - strSubstring2.length()) + Constant.BRACKET_CLOSE);
        sbD2.append(str2);
        return Assert.b(message, string, sbD2.toString());
    }
}
