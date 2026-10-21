package com.google.zxing.client.result;

import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class ExpandedProductParsedResult extends ParsedResult {
    public static final String KILOGRAM = "KG";
    public static final String POUND = "LB";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f49737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f49738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f49739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f49740e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f49741f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f49742g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f49743h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f49744i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f49745j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f49746k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f49747l;
    public final String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f49748n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f49749o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Map<String, String> f49750p;

    public ExpandedProductParsedResult(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Map<String, String> map) {
        super(ParsedResultType.PRODUCT);
        this.f49737b = str;
        this.f49738c = str2;
        this.f49739d = str3;
        this.f49740e = str4;
        this.f49741f = str5;
        this.f49742g = str6;
        this.f49743h = str7;
        this.f49744i = str8;
        this.f49745j = str9;
        this.f49746k = str10;
        this.f49747l = str11;
        this.m = str12;
        this.f49748n = str13;
        this.f49749o = str14;
        this.f49750p = map;
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static int b(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ExpandedProductParsedResult)) {
            return false;
        }
        ExpandedProductParsedResult expandedProductParsedResult = (ExpandedProductParsedResult) obj;
        return a(this.f49738c, expandedProductParsedResult.f49738c) && a(this.f49739d, expandedProductParsedResult.f49739d) && a(this.f49740e, expandedProductParsedResult.f49740e) && a(this.f49741f, expandedProductParsedResult.f49741f) && a(this.f49743h, expandedProductParsedResult.f49743h) && a(this.f49744i, expandedProductParsedResult.f49744i) && a(this.f49745j, expandedProductParsedResult.f49745j) && a(this.f49746k, expandedProductParsedResult.f49746k) && a(this.f49747l, expandedProductParsedResult.f49747l) && a(this.m, expandedProductParsedResult.m) && a(this.f49748n, expandedProductParsedResult.f49748n) && a(this.f49749o, expandedProductParsedResult.f49749o) && a(this.f49750p, expandedProductParsedResult.f49750p);
    }

    public String getBestBeforeDate() {
        return this.f49743h;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        return String.valueOf(this.f49737b);
    }

    public String getExpirationDate() {
        return this.f49744i;
    }

    public String getLotNumber() {
        return this.f49740e;
    }

    public String getPackagingDate() {
        return this.f49742g;
    }

    public String getPrice() {
        return this.m;
    }

    public String getPriceCurrency() {
        return this.f49749o;
    }

    public String getPriceIncrement() {
        return this.f49748n;
    }

    public String getProductID() {
        return this.f49738c;
    }

    public String getProductionDate() {
        return this.f49741f;
    }

    public String getRawText() {
        return this.f49737b;
    }

    public String getSscc() {
        return this.f49739d;
    }

    public Map<String, String> getUncommonAIs() {
        return this.f49750p;
    }

    public String getWeight() {
        return this.f49745j;
    }

    public String getWeightIncrement() {
        return this.f49747l;
    }

    public String getWeightType() {
        return this.f49746k;
    }

    public int hashCode() {
        return (((((((((((b(this.f49738c) ^ b(this.f49739d)) ^ b(this.f49740e)) ^ b(this.f49741f)) ^ b(this.f49743h)) ^ b(this.f49744i)) ^ b(this.f49745j)) ^ b(this.f49746k)) ^ b(this.f49747l)) ^ b(this.m)) ^ b(this.f49748n)) ^ b(this.f49749o)) ^ b(this.f49750p);
    }
}
