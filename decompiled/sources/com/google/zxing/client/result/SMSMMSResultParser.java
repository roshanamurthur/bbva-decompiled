package com.google.zxing.client.result;

import com.google.zxing.Result;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public final class SMSMMSResultParser extends ResultParser {
    public static void c(ArrayList arrayList, ArrayList arrayList2, String str) {
        int iIndexOf = str.indexOf(59);
        if (iIndexOf < 0) {
            arrayList.add(str);
            arrayList2.add(null);
        } else {
            arrayList.add(str.substring(0, iIndexOf));
            String strSubstring = str.substring(iIndexOf + 1);
            arrayList2.add(strSubstring.startsWith("via=") ? strSubstring.substring(4) : null);
        }
    }

    @Override // com.google.zxing.client.result.ResultParser
    public SMSParsedResult parse(Result result) {
        boolean z10;
        String str;
        String massagedText = ResultParser.getMassagedText(result);
        String str2 = null;
        if (!massagedText.startsWith("sms:") && !massagedText.startsWith("SMS:") && !massagedText.startsWith("mms:") && !massagedText.startsWith("MMS:")) {
            return null;
        }
        HashMap mapB = ResultParser.b(massagedText);
        if (mapB == null || mapB.isEmpty()) {
            z10 = false;
            str = null;
        } else {
            str2 = (String) mapB.get("subject");
            str = (String) mapB.get("body");
            z10 = true;
        }
        int iIndexOf = massagedText.indexOf(63, 4);
        String strSubstring = (iIndexOf < 0 || !z10) ? massagedText.substring(4) : massagedText.substring(4, iIndexOf);
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        int i10 = -1;
        while (true) {
            int i11 = i10 + 1;
            int iIndexOf2 = strSubstring.indexOf(44, i11);
            if (iIndexOf2 <= i10) {
                c(arrayList, arrayList2, strSubstring.substring(i11));
                return new SMSParsedResult((String[]) arrayList.toArray(new String[arrayList.size()]), (String[]) arrayList2.toArray(new String[arrayList2.size()]), str2, str);
            }
            c(arrayList, arrayList2, strSubstring.substring(i11, iIndexOf2));
            i10 = iIndexOf2;
        }
    }
}
