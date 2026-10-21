package com.salesforce.marketingcloud.analytics.etanalytics;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.salesforce.marketingcloud.MarketingCloudConfig;
import com.salesforce.marketingcloud.analytics.AnalyticsManager;
import com.salesforce.marketingcloud.internal.g;
import com.salesforce.marketingcloud.internal.l;
import com.salesforce.marketingcloud.storage.j;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"UnknownNullness"})
public class c implements com.salesforce.marketingcloud.http.c.InterfaceC0253c, com.salesforce.marketingcloud.alarms.b.InterfaceC0239b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final MarketingCloudConfig f63888d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final String f63889e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final j f63890f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final com.salesforce.marketingcloud.http.c f63891g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final com.salesforce.marketingcloud.alarms.b f63892h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final l f63893i;

    public class a extends g {
        public a(String str, Object... objArr) {
            super(str, objArr);
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            List<com.salesforce.marketingcloud.analytics.b> listA = c.this.f63890f.m().a(c.this.f63890f.b());
            if (listA.isEmpty()) {
                c.this.f63892h.d(com.salesforce.marketingcloud.alarms.a.b.f63803c);
                return;
            }
            com.salesforce.marketingcloud.http.a aVar = com.salesforce.marketingcloud.http.a.f64254h;
            c cVar = c.this;
            MarketingCloudConfig marketingCloudConfig = cVar.f63888d;
            com.salesforce.marketingcloud.storage.c cVarC = cVar.f63890f.c();
            c cVar2 = c.this;
            com.salesforce.marketingcloud.http.b bVarA = aVar.a(marketingCloudConfig, cVarC, cVar2.a(cVar2.f63888d.applicationId(), c.this.f63889e, listA).toString());
            bVarA.a(com.salesforce.marketingcloud.analytics.c.a(listA));
            c.this.f63891g.a(bVarA);
        }
    }

    public c(MarketingCloudConfig marketingCloudConfig, String str, j jVar, com.salesforce.marketingcloud.http.c cVar, com.salesforce.marketingcloud.alarms.b bVar, @NonNull l lVar) {
        this.f63888d = (MarketingCloudConfig) com.salesforce.marketingcloud.util.j.a(marketingCloudConfig, "Config is null");
        this.f63889e = (String) com.salesforce.marketingcloud.util.j.a(str, "DeviceId is null");
        this.f63890f = (j) com.salesforce.marketingcloud.util.j.a(jVar, "MCStorage is null");
        this.f63891g = (com.salesforce.marketingcloud.http.c) com.salesforce.marketingcloud.util.j.a(cVar, "RequestManager is null");
        this.f63892h = (com.salesforce.marketingcloud.alarms.b) com.salesforce.marketingcloud.util.j.a(bVar, "AlarmScheduler is null");
        this.f63893i = lVar;
        cVar.a(com.salesforce.marketingcloud.http.a.f64254h, this);
        bVar.a(this, com.salesforce.marketingcloud.alarms.a.b.f63803c);
    }

    public JSONArray a(String str, String str2, List<com.salesforce.marketingcloud.analytics.b> list) {
        JSONArray jSONArray = new JSONArray();
        for (com.salesforce.marketingcloud.analytics.b bVar : list) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("etAppId", str);
                jSONObject.put("deviceId", str2);
                jSONObject.put("eventDate", com.salesforce.marketingcloud.util.l.a(bVar.b()));
                jSONObject.put("value", bVar.g());
                jSONObject.put("analyticTypes", new JSONArray((Collection) Collections.singletonList(Integer.valueOf(bVar.a()))));
                jSONObject.put("objectIds", new JSONArray((Collection) bVar.i()));
                String strC = bVar.c();
                if (!TextUtils.isEmpty(strC)) {
                    JSONObject jSONObject2 = new JSONObject(strC);
                    String strOptString = jSONObject2.optString("requestId");
                    if (!TextUtils.isEmpty(strOptString)) {
                        jSONObject.put("requestId", strOptString);
                    }
                    jSONObject.put("propertyBag", jSONObject2.opt("propertyBag"));
                }
                jSONArray.put(jSONObject);
            } catch (Exception e5) {
                com.salesforce.marketingcloud.g.b(AnalyticsManager.TAG, e5, "Failed to update EtAnalyticItem or convert it to JSON for transmission.", new Object[0]);
            }
        }
        return jSONArray;
    }

    public void b() {
        this.f63891g.a(com.salesforce.marketingcloud.http.a.f64254h);
        com.salesforce.marketingcloud.alarms.b bVar = this.f63892h;
        com.salesforce.marketingcloud.alarms.a.b bVar2 = com.salesforce.marketingcloud.alarms.a.b.f63803c;
        bVar.d(bVar2);
        this.f63892h.e(bVar2);
    }

    public void a() {
        this.f63893i.b().execute(new a("send_analytics", new Object[0]));
    }

    @Override // com.salesforce.marketingcloud.alarms.b.InterfaceC0239b
    public void a(@NonNull com.salesforce.marketingcloud.alarms.a.b bVar) {
        if (bVar == com.salesforce.marketingcloud.alarms.a.b.f63803c) {
            a();
        }
    }

    @Override // com.salesforce.marketingcloud.http.c.InterfaceC0253c
    public void a(com.salesforce.marketingcloud.http.b bVar, com.salesforce.marketingcloud.http.d dVar) {
        if (!dVar.g()) {
            com.salesforce.marketingcloud.g.c(AnalyticsManager.TAG, "Request failed: %d - %s", Integer.valueOf(dVar.getCode()), dVar.getMessage());
            this.f63892h.b(com.salesforce.marketingcloud.alarms.a.b.f63803c);
        } else {
            this.f63892h.c(com.salesforce.marketingcloud.alarms.a.b.f63803c);
            if (bVar.getCom.bbva.glomohybrid.logs.LogKeysKt.TAG java.lang.String() != null) {
                this.f63893i.b().execute(new com.salesforce.marketingcloud.analytics.d(this.f63890f.m(), com.salesforce.marketingcloud.analytics.c.a(bVar.getCom.bbva.glomohybrid.logs.LogKeysKt.TAG java.lang.String())));
            }
        }
    }
}
