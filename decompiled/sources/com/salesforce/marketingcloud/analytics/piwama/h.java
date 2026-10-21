package com.salesforce.marketingcloud.analytics.piwama;

import android.text.TextUtils;
import com.bbva.component.dm.analytics.constants.AnalyticsConstants;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000eR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\u0015\u0010\u000eR\u0014\u0010\u0019\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000eR\u0014\u0010\u001b\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/salesforce/marketingcloud/analytics/piwama/h;", "Lcom/salesforce/marketingcloud/analytics/piwama/c;", "Lorg/json/JSONObject;", "c", "Ljava/util/Date;", "a", "Ljava/util/Date;", "e", "()Ljava/util/Date;", "timestamp", "", "b", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "url", "h", "title", "d", "f", AnalyticsConstants.Key.ITEM, "g", "searchTerms", "", "()I", "analyticType", "apiEndpoint", com.salesforce.marketingcloud.config.a.f64108s, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
public final class h implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final Date timestamp;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final String url;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    private final String title;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    private final String item;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    private final String searchTerms;

    public h(@NotNull String url, @Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull Date timestamp) throws IllegalArgumentException {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        this.timestamp = timestamp;
        this.url = m.a(this, url, "url", true);
        this.title = str != null ? m.a(this, str, "title", false) : null;
        this.item = str2 != null ? m.a(this, str2, AnalyticsConstants.Key.ITEM, false) : null;
        this.searchTerms = str3 != null ? m.a(this, str3, "search", false) : null;
    }

    @Override // com.salesforce.marketingcloud.analytics.piwama.c
    @NotNull
    public String a() {
        return "";
    }

    @Override // com.salesforce.marketingcloud.analytics.piwama.c
    public int b() {
        return com.salesforce.marketingcloud.analytics.b.D;
    }

    @Override // com.salesforce.marketingcloud.analytics.piwama.c
    @NotNull
    public JSONObject c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("api_endpoint", d());
        jSONObject.put("timestamp", com.salesforce.marketingcloud.internal.m.a(getTimestamp()));
        jSONObject.put("url", this.url);
        if (!TextUtils.isEmpty(this.title)) {
            jSONObject.put("title", this.title);
        }
        if (!TextUtils.isEmpty(this.item)) {
            jSONObject.put(AnalyticsConstants.Key.ITEM, this.item);
        }
        if (!TextUtils.isEmpty(this.searchTerms)) {
            jSONObject.put("search", this.searchTerms);
        }
        return jSONObject;
    }

    @Override // com.salesforce.marketingcloud.analytics.piwama.c
    @NotNull
    public String d() {
        return "track_view";
    }

    @Override // com.salesforce.marketingcloud.analytics.piwama.c
    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public Date getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getItem() {
        return this.item;
    }

    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getSearchTerms() {
        return this.searchTerms;
    }

    @Nullable
    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getUrl() {
        return this.url;
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
