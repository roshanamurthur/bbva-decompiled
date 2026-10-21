package com.salesforce.marketingcloud.analytics.piwama;

import com.noknok.android.client.extension.PlayIntegrity;
import java.util.Date;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0002H\u0016J\u001c\u0010\u0005\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016R\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u000fR\u0014\u0010\u0015\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, d2 = {"Lcom/salesforce/marketingcloud/analytics/piwama/c;", "", "Lorg/json/JSONObject;", "c", "", "a", "", "fieldName", "", PlayIntegrity.KEY_REQUIRED, "", "b", "()I", "analyticType", "d", "()Ljava/lang/String;", "apiEndpoint", com.salesforce.marketingcloud.config.a.f64108s, "Ljava/util/Date;", "e", "()Ljava/util/Date;", "timestamp", "sdk_release"}, k = 1, mv = {1, 8, 0})
public interface c {
    @NotNull
    String a();

    @NotNull
    String a(@NotNull String str, @NotNull String str2, boolean z10);

    void a(@NotNull JSONObject jSONObject);

    int b();

    @NotNull
    JSONObject c();

    @NotNull
    String d();

    @NotNull
    Date e();
}
