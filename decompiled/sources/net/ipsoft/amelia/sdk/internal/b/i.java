package net.ipsoft.amelia.sdk.internal.b;

import com.google.firebase.analytics.FirebaseAnalytics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class i extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f84728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f84729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f84730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f84731d = "Amelia";

    public i(String str, String str2, String str3) {
        this.f84728a = str;
        this.f84729b = str2;
        this.f84730c = str3;
    }

    @Override // net.ipsoft.amelia.sdk.internal.b.m
    public String a(String str) {
        return androidx.camera.camera2.internal.compat.u.f(str, "/Amelia/api/speech/generate");
    }

    @Override // net.ipsoft.amelia.sdk.internal.b.m
    public String toString() {
        StringBuilder sb2 = new StringBuilder("{ text: ");
        sb2.append(this.f84728a);
        sb2.append(", voice: ");
        sb2.append(this.f84729b);
        sb2.append("character:");
        sb2.append(this.f84731d);
        sb2.append("conversationId");
        return ad.d.f(sb2, this.f84730c, " }");
    }

    @Override // net.ipsoft.amelia.sdk.internal.b.m
    public JSONObject a() {
        if (this.f84742i == null) {
            JSONObject jSONObject = new JSONObject();
            this.f84742i = jSONObject;
            try {
                jSONObject.put("text", this.f84728a);
                this.f84742i.put("voice", this.f84729b);
                this.f84742i.put(FirebaseAnalytics.Param.CHARACTER, "Amelia");
                this.f84742i.put("conversationId", this.f84730c);
            } catch (Exception unused) {
            }
        }
        return this.f84742i;
    }
}
