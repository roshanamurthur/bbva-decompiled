package com.facetec.sdk;

import com.google.firebase.dynamiclinks.DynamicLink;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
final class z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f43007b = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f43010e = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f43009d = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f43008c = new Date().getTime();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    byte[] f43006a = new byte[0];

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("i", this.f43007b);
            jSONObject.put("sid", this.f43010e);
            jSONObject.put(DynamicLink.ItunesConnectAnalyticsParameters.KEY_ITUNES_CONNECT_CT, this.f43008c);
            jSONObject.put("h", this.f43009d);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
