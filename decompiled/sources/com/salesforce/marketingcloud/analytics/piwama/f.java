package com.salesforce.marketingcloud.analytics.piwama;

import com.salesforce.marketingcloud.analytics.PiCart;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/salesforce/marketingcloud/analytics/piwama/f;", "Lcom/salesforce/marketingcloud/analytics/piwama/c;", "Lorg/json/JSONObject;", "c", "Lcom/salesforce/marketingcloud/analytics/PiCart;", "a", "Lcom/salesforce/marketingcloud/analytics/PiCart;", "piCart", "Ljava/util/Date;", "b", "Ljava/util/Date;", "e", "()Ljava/util/Date;", "timestamp", "", "()I", "analyticType", "", "d", "()Ljava/lang/String;", "apiEndpoint", com.salesforce.marketingcloud.config.a.f64108s, "<init>", "(Lcom/salesforce/marketingcloud/analytics/PiCart;Ljava/util/Date;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
public final class f implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final PiCart piCart;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final Date timestamp;

    public f(@NotNull PiCart piCart, @NotNull Date timestamp) {
        Intrinsics.checkNotNullParameter(piCart, "piCart");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        this.piCart = piCart;
        this.timestamp = timestamp;
    }

    @Override // com.salesforce.marketingcloud.analytics.piwama.c
    @NotNull
    public String a() {
        return "";
    }

    @Override // com.salesforce.marketingcloud.analytics.piwama.c
    public int b() {
        return com.salesforce.marketingcloud.analytics.b.C;
    }

    @Override // com.salesforce.marketingcloud.analytics.piwama.c
    @NotNull
    public JSONObject c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        m.b(this, jSONObject);
        if (!this.piCart.cartItems().isEmpty()) {
            jSONObject.put("cart", this.piCart.m5329toJson());
        } else {
            jSONObject.put("clear_cart", true);
        }
        return jSONObject;
    }

    @Override // com.salesforce.marketingcloud.analytics.piwama.c
    @NotNull
    public String d() {
        return "track_cart";
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
