package com.salesforce.marketingcloud.analytics.piwama;

import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/salesforce/marketingcloud/analytics/piwama/b;", "Lcom/salesforce/marketingcloud/analytics/piwama/c;", "Lorg/json/JSONObject;", "c", "Ljava/util/Date;", "a", "Ljava/util/Date;", "e", "()Ljava/util/Date;", "timestamp", "", "b", "()I", "analyticType", "", "d", "()Ljava/lang/String;", "apiEndpoint", com.salesforce.marketingcloud.config.a.f64108s, "<init>", "(Ljava/util/Date;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPiCloseEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PiCloseEvent.kt\ncom/salesforce/marketingcloud/analytics/piwama/PiCloseEvent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,16:1\n1#2:17\n*E\n"})
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final Date timestamp;

    public b(@NotNull Date timestamp) {
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        this.timestamp = timestamp;
    }

    @Override // com.salesforce.marketingcloud.analytics.piwama.c
    @NotNull
    public String a() {
        return "app_close";
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
