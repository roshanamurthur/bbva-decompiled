package com.google.zxing.client.result;

import com.bbva.actionlauncher.AndroidActionLauncher;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes10.dex */
public final class GeoParsedResult extends ParsedResult {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f49751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f49752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f49753d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f49754e;

    public GeoParsedResult(double d2, double d3, double d7, String str) {
        super(ParsedResultType.GEO);
        this.f49751b = d2;
        this.f49752c = d3;
        this.f49753d = d7;
        this.f49754e = str;
    }

    public double getAltitude() {
        return this.f49753d;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        StringBuilder sb2 = new StringBuilder(20);
        sb2.append(this.f49751b);
        sb2.append(", ");
        sb2.append(this.f49752c);
        double d2 = this.f49753d;
        if (d2 > 0.0d) {
            sb2.append(", ");
            sb2.append(d2);
            sb2.append('m');
        }
        String str = this.f49754e;
        if (str != null) {
            sb2.append(" (");
            sb2.append(str);
            sb2.append(RootService.CLOSE_BRACKET);
        }
        return sb2.toString();
    }

    public String getGeoURI() {
        StringBuilder sb2 = new StringBuilder(AndroidActionLauncher.GEO_SCHEME);
        sb2.append(this.f49751b);
        sb2.append(AbstractJsonLexerKt.COMMA);
        sb2.append(this.f49752c);
        double d2 = this.f49753d;
        if (d2 > 0.0d) {
            sb2.append(AbstractJsonLexerKt.COMMA);
            sb2.append(d2);
        }
        String str = this.f49754e;
        if (str != null) {
            sb2.append('?');
            sb2.append(str);
        }
        return sb2.toString();
    }

    public double getLatitude() {
        return this.f49751b;
    }

    public double getLongitude() {
        return this.f49752c;
    }

    public String getQuery() {
        return this.f49754e;
    }
}
