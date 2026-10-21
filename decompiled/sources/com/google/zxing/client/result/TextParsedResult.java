package com.google.zxing.client.result;

/* JADX INFO: loaded from: classes10.dex */
public final class TextParsedResult extends ParsedResult {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f49771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f49772c;

    public TextParsedResult(String str, String str2) {
        super(ParsedResultType.TEXT);
        this.f49771b = str;
        this.f49772c = str2;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        return this.f49771b;
    }

    public String getLanguage() {
        return this.f49772c;
    }

    public String getText() {
        return this.f49771b;
    }
}
