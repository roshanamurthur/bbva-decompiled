package com.google.zxing.client.result;

import androidx.core.net.MailTo;
import com.google.android.gms.stats.CodePackage;
import com.google.zxing.Result;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class VEventResultParser extends ResultParser {
    public static String c(String str, String str2) {
        List listC = VCardResultParser.c(str, str2, true, false);
        if (listC == null || listC.isEmpty()) {
            return null;
        }
        return (String) listC.get(0);
    }

    @Override // com.google.zxing.client.result.ResultParser
    public CalendarParsedResult parse(Result result) {
        String[] strArr;
        double d2;
        double d3;
        String massagedText = ResultParser.getMassagedText(result);
        if (massagedText.indexOf("BEGIN:VEVENT") < 0) {
            return null;
        }
        String strC = c("SUMMARY", massagedText);
        String strC2 = c("DTSTART", massagedText);
        if (strC2 == null) {
            return null;
        }
        String strC3 = c("DTEND", massagedText);
        String strC4 = c("DURATION", massagedText);
        String strC5 = c(CodePackage.LOCATION, massagedText);
        String strC6 = c("ORGANIZER", massagedText);
        if (strC6 != null && (strC6.startsWith(MailTo.MAILTO_SCHEME) || strC6.startsWith("MAILTO:"))) {
            strC6 = strC6.substring(7);
        }
        ArrayList arrayListD = VCardResultParser.d("ATTENDEE", massagedText, true, false);
        if (arrayListD == null || arrayListD.isEmpty()) {
            strArr = null;
        } else {
            int size = arrayListD.size();
            strArr = new String[size];
            for (int i10 = 0; i10 < size; i10++) {
                strArr[i10] = (String) ((List) arrayListD.get(i10)).get(0);
            }
        }
        if (strArr != null) {
            for (int i11 = 0; i11 < strArr.length; i11++) {
                String strSubstring = strArr[i11];
                if (strSubstring != null && (strSubstring.startsWith(MailTo.MAILTO_SCHEME) || strSubstring.startsWith("MAILTO:"))) {
                    strSubstring = strSubstring.substring(7);
                }
                strArr[i11] = strSubstring;
            }
        }
        String strC7 = c("DESCRIPTION", massagedText);
        String strC8 = c("GEO", massagedText);
        if (strC8 == null) {
            d3 = Double.NaN;
            d2 = Double.NaN;
        } else {
            int iIndexOf = strC8.indexOf(59);
            if (iIndexOf < 0) {
                return null;
            }
            try {
                double d7 = Double.parseDouble(strC8.substring(0, iIndexOf));
                d2 = Double.parseDouble(strC8.substring(iIndexOf + 1));
                d3 = d7;
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        try {
            return new CalendarParsedResult(strC, strC2, strC3, strC4, strC5, strC6, strArr, strC7, d3, d2);
        } catch (IllegalArgumentException unused2) {
            return null;
        }
    }
}
