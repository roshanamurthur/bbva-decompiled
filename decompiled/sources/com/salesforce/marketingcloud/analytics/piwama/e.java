package com.salesforce.marketingcloud.analytics.piwama;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\n\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/salesforce/marketingcloud/analytics/piwama/e;", "Lcom/salesforce/marketingcloud/analytics/piwama/c;", "Lorg/json/JSONObject;", "c", "Ljava/util/Date;", "a", "Ljava/util/Date;", "e", "()Ljava/util/Date;", "timestamp", "", "b", "Z", "openFromPush", "", "", "Ljava/util/List;", "objectIds", "", "()I", "analyticType", "d", "()Ljava/lang/String;", "apiEndpoint", com.salesforce.marketingcloud.config.a.f64108s, "<init>", "(Ljava/util/Date;ZLjava/util/List;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
public final class e implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final Date timestamp;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean openFromPush;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final List<String> objectIds;

    public e(@NotNull Date timestamp, boolean z10, @NotNull List<String> objectIds) {
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(objectIds, "objectIds");
        this.timestamp = timestamp;
        this.openFromPush = z10;
        this.objectIds = objectIds;
    }

    @Override // com.salesforce.marketingcloud.analytics.piwama.c
    @NotNull
    public String a() {
        return FirebaseAnalytics.Event.APP_OPEN;
    }

    @Override // com.salesforce.marketingcloud.analytics.piwama.c
    public int b() {
        return 0;
    }

    @Override // com.salesforce.marketingcloud.analytics.piwama.c
    @NotNull
    public JSONObject c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        m.b(this, jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("open_from_push", this.openFromPush);
        if (!this.objectIds.isEmpty()) {
            jSONObject2.put("message_ids", new JSONArray((Collection) this.objectIds));
        }
        Unit unit = Unit.INSTANCE;
        jSONObject.put(ErrorBundle.DETAIL_ENTRY, jSONObject2);
        return jSONObject;
    }

    @Override // com.salesforce.marketingcloud.analytics.piwama.c
    @NotNull
    public String d() {
        return "track_event";
    }

    @Override // com.salesforce.marketingcloud.analytics.piwama.c
    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public Date getTimestamp() {
        return this.timestamp;
    }

    @Override // com.salesforce.marketingcloud.analytics.piwama.c
    public final /* synthetic */ String a(String str, String str2, boolean z10) {
        return m.a(this, str, str2, z10);
    }

    @Override // com.salesforce.marketingcloud.analytics.piwama.c
    public final /* synthetic */ void a(JSONObject jSONObject) throws JSONException {
        m.b(this, jSONObject);
    }
}
