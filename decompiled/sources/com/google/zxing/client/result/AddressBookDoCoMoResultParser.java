package com.google.zxing.client.result;

import com.google.zxing.Result;
import yg.a;

/* JADX INFO: loaded from: classes10.dex */
public final class AddressBookDoCoMoResultParser extends a {
    @Override // com.google.zxing.client.result.ResultParser
    public AddressBookParsedResult parse(Result result) {
        String[] strArrA;
        String massagedText = ResultParser.getMassagedText(result);
        if (!massagedText.startsWith("MECARD:") || (strArrA = ResultParser.a("N:", massagedText, ';', true)) == null) {
            return null;
        }
        String str = strArrA[0];
        int iIndexOf = str.indexOf(44);
        if (iIndexOf >= 0) {
            str = str.substring(iIndexOf + 1) + ' ' + str.substring(0, iIndexOf);
        }
        String strC = a.c("SOUND:", massagedText, true);
        String[] strArrA2 = ResultParser.a("TEL:", massagedText, ';', true);
        String[] strArrA3 = ResultParser.a("EMAIL:", massagedText, ';', true);
        String strC2 = a.c("NOTE:", massagedText, false);
        String[] strArrA4 = ResultParser.a("ADR:", massagedText, ';', true);
        String strC3 = a.c("BDAY:", massagedText, true);
        return new AddressBookParsedResult(ResultParser.maybeWrap(str), null, strC, strArrA2, null, strArrA3, null, null, strC2, strArrA4, null, a.c("ORG:", massagedText, true), !ResultParser.isStringOfDigits(strC3, 8) ? null : strC3, null, ResultParser.a("URL:", massagedText, ';', true), null);
    }
}
