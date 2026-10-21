package com.google.zxing.client.result;

import com.google.zxing.Result;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes10.dex */
public final class URIResultParser extends ResultParser {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f49776e = Pattern.compile("[a-zA-Z][a-zA-Z0-9+-.]+:");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f49777f = Pattern.compile("([a-zA-Z0-9\\-]+\\.){1,6}[a-zA-Z]{2,}(:\\d{1,5})?(/|\\?|$)");

    public static boolean c(String str) {
        if (str.contains(" ")) {
            return false;
        }
        Matcher matcher = f49776e.matcher(str);
        if (matcher.find() && matcher.start() == 0) {
            return true;
        }
        Matcher matcher2 = f49777f.matcher(str);
        return matcher2.find() && matcher2.start() == 0;
    }

    @Override // com.google.zxing.client.result.ResultParser
    public URIParsedResult parse(Result result) {
        String massagedText = ResultParser.getMassagedText(result);
        if (massagedText.startsWith("URL:") || massagedText.startsWith("URI:")) {
            return new URIParsedResult(massagedText.substring(4).trim(), null);
        }
        String strTrim = massagedText.trim();
        if (c(strTrim)) {
            return new URIParsedResult(strTrim, null);
        }
        return null;
    }
}
