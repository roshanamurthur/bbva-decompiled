package com.google.zxing.client.result;

/* JADX INFO: loaded from: classes10.dex */
public final class ProductParsedResult extends ParsedResult {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f49758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f49759c;

    public ProductParsedResult(String str, String str2) {
        super(ParsedResultType.PRODUCT);
        this.f49758b = str;
        this.f49759c = str2;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        return this.f49758b;
    }

    public String getNormalizedProductID() {
        return this.f49759c;
    }

    public String getProductID() {
        return this.f49758b;
    }
}
