package com.google.zxing.client.result;

import com.google.zxing.Result;

/* JADX INFO: loaded from: classes10.dex */
public final class WifiResultParser extends ResultParser {
    @Override // com.google.zxing.client.result.ResultParser
    public WifiParsedResult parse(Result result) {
        String massagedText = ResultParser.getMassagedText(result);
        if (!massagedText.startsWith("WIFI:")) {
            return null;
        }
        String strSubstring = massagedText.substring(5);
        String[] strArrA = ResultParser.a("S:", strSubstring, ';', false);
        String str = strArrA == null ? null : strArrA[0];
        if (str == null || str.isEmpty()) {
            return null;
        }
        String[] strArrA2 = ResultParser.a("P:", strSubstring, ';', false);
        String str2 = strArrA2 == null ? null : strArrA2[0];
        String[] strArrA3 = ResultParser.a("T:", strSubstring, ';', false);
        String str3 = strArrA3 == null ? null : strArrA3[0];
        if (str3 == null) {
            str3 = "nopass";
        }
        String str4 = str3;
        String[] strArrA4 = ResultParser.a("H:", strSubstring, ';', false);
        boolean z10 = Boolean.parseBoolean(strArrA4 == null ? null : strArrA4[0]);
        String[] strArrA5 = ResultParser.a("I:", strSubstring, ';', false);
        String str5 = strArrA5 == null ? null : strArrA5[0];
        String[] strArrA6 = ResultParser.a("A:", strSubstring, ';', false);
        String str6 = strArrA6 == null ? null : strArrA6[0];
        String[] strArrA7 = ResultParser.a("E:", strSubstring, ';', false);
        String str7 = strArrA7 == null ? null : strArrA7[0];
        String[] strArrA8 = ResultParser.a("H:", strSubstring, ';', false);
        return new WifiParsedResult(str4, str, str2, z10, str5, str6, str7, strArrA8 != null ? strArrA8[0] : null);
    }
}
