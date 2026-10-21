package net.ipsoft.amelia.sdk.internal.b;

import androidx.autofill.HintConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class v extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f84779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f84780b;

    public v(String str, String str2, String str3) {
        super(str);
        this.f84779a = str2;
        this.f84780b = str3;
    }

    @Override // net.ipsoft.amelia.sdk.internal.b.m
    public String a(String str) {
        return androidx.camera.camera2.internal.compat.u.f(str, "/Amelia/api/login");
    }

    @Override // net.ipsoft.amelia.sdk.internal.b.m
    public String toString() {
        StringBuilder sb2 = new StringBuilder("{ xCsrfToken: ");
        sb2.append(this.f84744k);
        sb2.append(", username: ");
        sb2.append(this.f84779a);
        sb2.append(", password: ");
        return ad.d.f(sb2, this.f84780b, " }");
    }

    @Override // net.ipsoft.amelia.sdk.internal.b.m
    public JSONObject a() {
        if (this.f84742i == null) {
            JSONObject jSONObject = new JSONObject();
            this.f84742i = jSONObject;
            try {
                jSONObject.put(HintConstants.AUTOFILL_HINT_USERNAME, String.valueOf(this.f84779a));
                this.f84742i.put("password", String.valueOf(this.f84780b));
            } catch (JSONException unused) {
            }
        }
        return this.f84742i;
    }
}
