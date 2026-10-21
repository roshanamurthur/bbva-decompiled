package com.google.zxing.client.result;

import com.google.zxing.Result;
import yg.a;

/* JADX INFO: loaded from: classes10.dex */
public final class BookmarkDoCoMoResultParser extends a {
    @Override // com.google.zxing.client.result.ResultParser
    public URIParsedResult parse(Result result) {
        String text = result.getText();
        if (!text.startsWith("MEBKM:")) {
            return null;
        }
        String strC = a.c("TITLE:", text, true);
        String[] strArrA = ResultParser.a("URL:", text, ';', true);
        if (strArrA == null) {
            return null;
        }
        String str = strArrA[0];
        if (URIResultParser.c(str)) {
            return new URIParsedResult(str, strC);
        }
        return null;
    }
}
