package com.google.zxing.client.result;

import com.google.zxing.Result;
import java.util.ArrayList;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes10.dex */
public final class AddressBookAUResultParser extends ResultParser {
    public static String[] c(String str, String str2) {
        ArrayList arrayList = null;
        for (int i10 = 1; i10 <= 3; i10++) {
            String[] strArrA = ResultParser.a(str + i10 + AbstractJsonLexerKt.COLON, str2, '\r', true);
            String str3 = strArrA == null ? null : strArrA[0];
            if (str3 == null) {
                break;
            }
            if (arrayList == null) {
                arrayList = new ArrayList(3);
            }
            arrayList.add(str3);
        }
        if (arrayList == null) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @Override // com.google.zxing.client.result.ResultParser
    public AddressBookParsedResult parse(Result result) {
        String massagedText = ResultParser.getMassagedText(result);
        if (!massagedText.contains("MEMORY") || !massagedText.contains("\r\n")) {
            return null;
        }
        String[] strArrA = ResultParser.a("NAME1:", massagedText, '\r', true);
        String str = strArrA == null ? null : strArrA[0];
        String[] strArrA2 = ResultParser.a("NAME2:", massagedText, '\r', true);
        String str2 = strArrA2 == null ? null : strArrA2[0];
        String[] strArrC = c("TEL", massagedText);
        String[] strArrC2 = c("MAIL", massagedText);
        String[] strArrA3 = ResultParser.a("MEMORY:", massagedText, '\r', false);
        String str3 = strArrA3 == null ? null : strArrA3[0];
        String[] strArrA4 = ResultParser.a("ADD:", massagedText, '\r', true);
        String str4 = strArrA4 == null ? null : strArrA4[0];
        return new AddressBookParsedResult(ResultParser.maybeWrap(str), null, str2, strArrC, null, strArrC2, null, null, str3, str4 != null ? new String[]{str4} : null, null, null, null, null, null, null);
    }
}
