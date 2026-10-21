package com.google.zxing.client.result;

/* JADX INFO: loaded from: classes10.dex */
public final class ISBNParsedResult extends ParsedResult {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f49756b;

    public ISBNParsedResult(String str) {
        super(ParsedResultType.ISBN);
        this.f49756b = str;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        return this.f49756b;
    }

    public String getISBN() {
        return this.f49756b;
    }
}
