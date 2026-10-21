package com.google.zxing.client.result;

import com.google.zxing.Result;
import java.util.regex.Pattern;
import yg.a;

/* JADX INFO: loaded from: classes10.dex */
public final class EmailDoCoMoResultParser extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f49736e = Pattern.compile("[a-zA-Z0-9@.!#$%&'*+\\-/=?^_`{|}~]+");

    @Override // com.google.zxing.client.result.ResultParser
    public EmailAddressParsedResult parse(Result result) {
        String[] strArrA;
        String massagedText = ResultParser.getMassagedText(result);
        if (!massagedText.startsWith("MATMSG:") || (strArrA = ResultParser.a("TO:", massagedText, ';', true)) == null) {
            return null;
        }
        for (String str : strArrA) {
            if (str == null || !f49736e.matcher(str).matches() || str.indexOf(64) < 0) {
                return null;
            }
        }
        return new EmailAddressParsedResult(strArrA, null, null, a.c("SUB:", massagedText, false), a.c("BODY:", massagedText, false));
    }
}
