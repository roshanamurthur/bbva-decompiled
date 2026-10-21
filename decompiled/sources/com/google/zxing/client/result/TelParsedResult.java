package com.google.zxing.client.result;

/* JADX INFO: loaded from: classes10.dex */
public final class TelParsedResult extends ParsedResult {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f49768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f49769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f49770d;

    public TelParsedResult(String str, String str2, String str3) {
        super(ParsedResultType.TEL);
        this.f49768b = str;
        this.f49769c = str2;
        this.f49770d = str3;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        StringBuilder sb2 = new StringBuilder(20);
        ParsedResult.maybeAppend(this.f49768b, sb2);
        ParsedResult.maybeAppend(this.f49770d, sb2);
        return sb2.toString();
    }

    public String getNumber() {
        return this.f49768b;
    }

    public String getTelURI() {
        return this.f49769c;
    }

    public String getTitle() {
        return this.f49770d;
    }
}
