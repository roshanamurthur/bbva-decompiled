package com.google.zxing.client.result;

import com.mypinpad.tsdk.isolation.y2;

/* JADX INFO: loaded from: classes10.dex */
public final class VINParsedResult extends ParsedResult {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f49787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f49788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f49789d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f49790e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f49791f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f49792g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f49793h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final char f49794i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f49795j;

    public VINParsedResult(String str, String str2, String str3, String str4, String str5, String str6, int i10, char c10, String str7) {
        super(ParsedResultType.VIN);
        this.f49787b = str;
        this.f49788c = str2;
        this.f49789d = str3;
        this.f49790e = str4;
        this.f49791f = str5;
        this.f49792g = str6;
        this.f49793h = i10;
        this.f49794i = c10;
        this.f49795j = str7;
    }

    public String getCountryCode() {
        return this.f49791f;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        StringBuilder sb2 = new StringBuilder(50);
        sb2.append(this.f49788c);
        sb2.append(' ');
        sb2.append(this.f49789d);
        sb2.append(' ');
        sb2.append(this.f49790e);
        sb2.append('\n');
        String str = this.f49791f;
        if (str != null) {
            sb2.append(str);
            sb2.append(' ');
        }
        sb2.append(this.f49793h);
        sb2.append(' ');
        sb2.append(this.f49794i);
        sb2.append(' ');
        return y2.b(sb2, this.f49795j, '\n');
    }

    public int getModelYear() {
        return this.f49793h;
    }

    public char getPlantCode() {
        return this.f49794i;
    }

    public String getSequentialNumber() {
        return this.f49795j;
    }

    public String getVIN() {
        return this.f49787b;
    }

    public String getVehicleAttributes() {
        return this.f49792g;
    }

    public String getVehicleDescriptorSection() {
        return this.f49789d;
    }

    public String getVehicleIdentifierSection() {
        return this.f49790e;
    }

    public String getWorldManufacturerID() {
        return this.f49788c;
    }
}
