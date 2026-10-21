package com.google.zxing.client.result;

import ad.d;
import com.google.zxing.Result;
import java.util.ArrayList;
import yg.a;

/* JADX INFO: loaded from: classes10.dex */
public final class BizcardResultParser extends a {
    @Override // com.google.zxing.client.result.ResultParser
    public AddressBookParsedResult parse(Result result) {
        String massagedText = ResultParser.getMassagedText(result);
        if (!massagedText.startsWith("BIZCARD:")) {
            return null;
        }
        String strC = a.c("N:", massagedText, true);
        String strC2 = a.c("X:", massagedText, true);
        if (strC == null) {
            strC = strC2;
        } else if (strC2 != null) {
            strC = d.e(strC, ' ', strC2);
        }
        String strC3 = a.c("T:", massagedText, true);
        String strC4 = a.c("C:", massagedText, true);
        String[] strArrA = ResultParser.a("A:", massagedText, ';', true);
        String strC5 = a.c("B:", massagedText, true);
        String strC6 = a.c("M:", massagedText, true);
        String strC7 = a.c("F:", massagedText, true);
        String strC8 = a.c("E:", massagedText, true);
        String[] strArrMaybeWrap = ResultParser.maybeWrap(strC);
        ArrayList arrayList = new ArrayList(3);
        if (strC5 != null) {
            arrayList.add(strC5);
        }
        if (strC6 != null) {
            arrayList.add(strC6);
        }
        if (strC7 != null) {
            arrayList.add(strC7);
        }
        int size = arrayList.size();
        return new AddressBookParsedResult(strArrMaybeWrap, null, null, size != 0 ? (String[]) arrayList.toArray(new String[size]) : null, null, ResultParser.maybeWrap(strC8), null, null, null, strArrA, null, strC4, null, strC3, null, null);
    }
}
