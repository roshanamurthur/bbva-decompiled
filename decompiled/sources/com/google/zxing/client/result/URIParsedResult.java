package com.google.zxing.client.result;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes10.dex */
public final class URIParsedResult extends ParsedResult {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f49773d = Pattern.compile(":/*([^/@]+)@[^/]+");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f49774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f49775c;

    /* JADX WARN: Code duplicated, block: B:9:0x0026  */
    public URIParsedResult(String str, String str2) {
        super(ParsedResultType.URI);
        String strTrim = str.trim();
        int iIndexOf = strTrim.indexOf(58);
        if (iIndexOf >= 0) {
            int i10 = iIndexOf + 1;
            int iIndexOf2 = strTrim.indexOf(47, i10);
            strTrim = ResultParser.isSubstringOfDigits(strTrim, i10, (iIndexOf2 < 0 ? strTrim.length() : iIndexOf2) - i10) ? "http://".concat(strTrim) : strTrim;
        }
        this.f49774b = strTrim;
        this.f49775c = str2;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        StringBuilder sb2 = new StringBuilder(30);
        ParsedResult.maybeAppend(this.f49775c, sb2);
        ParsedResult.maybeAppend(this.f49774b, sb2);
        return sb2.toString();
    }

    public String getTitle() {
        return this.f49775c;
    }

    public String getURI() {
        return this.f49774b;
    }

    public boolean isPossiblyMaliciousURI() {
        return f49773d.matcher(this.f49774b).find();
    }
}
