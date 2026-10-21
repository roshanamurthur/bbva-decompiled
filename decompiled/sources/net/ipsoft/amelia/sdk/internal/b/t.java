package net.ipsoft.amelia.sdk.internal.b;

import net.ipsoft.amelia.sdk.ConversationInfo;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class t extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f84773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f84774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f84775c;

    public t(String str, ConversationInfo conversationInfo) {
        super(str);
        this.f84774b = null;
        this.f84775c = null;
        this.f84773a = 0L;
        this.f84774b = conversationInfo.getConversationId();
        this.f84775c = conversationInfo.getSessionMode();
    }

    @Override // net.ipsoft.amelia.sdk.internal.b.m
    public String a(String str) {
        return ad.d.f(androidx.camera.core.processing.f.e(str, "/Amelia/api/conversations/"), this.f84774b, "/join");
    }

    @Override // net.ipsoft.amelia.sdk.internal.b.m
    public String toString() {
        return "{}";
    }

    @Override // net.ipsoft.amelia.sdk.internal.b.m
    public JSONObject a() {
        if (this.f84742i == null) {
            JSONObject jSONObject = new JSONObject();
            this.f84742i = jSONObject;
            try {
                jSONObject.put("channel", "Mobile_Android");
                this.f84742i.put("sessionMode", this.f84775c);
            } catch (Exception unused) {
            }
        }
        return this.f84742i;
    }
}
