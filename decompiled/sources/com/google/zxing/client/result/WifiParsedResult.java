package com.google.zxing.client.result;

/* JADX INFO: loaded from: classes10.dex */
public final class WifiParsedResult extends ParsedResult {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f49798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f49799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f49800d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f49801e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f49802f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f49803g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f49804h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f49805i;

    public WifiParsedResult(String str, String str2, String str3) {
        this(str, str2, str3, false);
    }

    public String getAnonymousIdentity() {
        return this.f49803g;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        StringBuilder sb2 = new StringBuilder(80);
        ParsedResult.maybeAppend(this.f49798b, sb2);
        ParsedResult.maybeAppend(this.f49799c, sb2);
        ParsedResult.maybeAppend(this.f49800d, sb2);
        ParsedResult.maybeAppend(Boolean.toString(this.f49801e), sb2);
        return sb2.toString();
    }

    public String getEapMethod() {
        return this.f49804h;
    }

    public String getIdentity() {
        return this.f49802f;
    }

    public String getNetworkEncryption() {
        return this.f49799c;
    }

    public String getPassword() {
        return this.f49800d;
    }

    public String getPhase2Method() {
        return this.f49805i;
    }

    public String getSsid() {
        return this.f49798b;
    }

    public boolean isHidden() {
        return this.f49801e;
    }

    public WifiParsedResult(String str, String str2, String str3, boolean z10) {
        this(str, str2, str3, z10, null, null, null, null);
    }

    public WifiParsedResult(String str, String str2, String str3, boolean z10, String str4, String str5, String str6, String str7) {
        super(ParsedResultType.WIFI);
        this.f49798b = str2;
        this.f49799c = str;
        this.f49800d = str3;
        this.f49801e = z10;
        this.f49802f = str4;
        this.f49803g = str5;
        this.f49804h = str6;
        this.f49805i = str7;
    }
}
