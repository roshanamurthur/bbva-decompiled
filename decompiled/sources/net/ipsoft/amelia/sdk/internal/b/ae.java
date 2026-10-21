package net.ipsoft.amelia.sdk.internal.b;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class ae extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f84692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f84693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map<String, String> f84694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map<String, String> f84695d;

    public ae(String str, long j10, String str2, Map<String, String> map, Map<String, String> map2) {
        super(str);
        this.f84692a = j10;
        this.f84693b = str2;
        this.f84694c = map;
        this.f84695d = map2;
    }

    @Override // net.ipsoft.amelia.sdk.internal.b.m
    public String a(String str) {
        return androidx.camera.camera2.internal.compat.u.f(str, "/Amelia/api/conversations/new");
    }

    @Override // net.ipsoft.amelia.sdk.internal.b.m
    public String toString() {
        return "{ xCsrfToken: " + this.f84744k + ", cts: " + this.f84692a + ", domainCode: " + this.f84693b + ", bpnVariables: " + this.f84694c + ", initialAttributes: " + this.f84695d + " }";
    }

    @Override // net.ipsoft.amelia.sdk.internal.b.m
    public JSONObject a() {
        if (this.f84742i == null) {
            JSONObject jSONObject = new JSONObject();
            this.f84742i = jSONObject;
            try {
                jSONObject.put("channel", "Mobile_Android");
                this.f84742i.put("domainCode", String.valueOf(this.f84693b));
                if (this.f84695d != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    for (Map.Entry<String, String> entry : this.f84695d.entrySet()) {
                        jSONObject2.put(entry.getKey(), entry.getValue());
                    }
                    this.f84742i.put("initialAttributes", jSONObject2);
                }
                if (this.f84694c != null) {
                    JSONObject jSONObject3 = new JSONObject();
                    for (Map.Entry<String, String> entry2 : this.f84694c.entrySet()) {
                        jSONObject3.put(entry2.getKey(), entry2.getValue());
                    }
                    this.f84742i.put("initialBpnVariables", jSONObject3);
                }
            } catch (Exception unused) {
            }
        }
        return this.f84742i;
    }
}
