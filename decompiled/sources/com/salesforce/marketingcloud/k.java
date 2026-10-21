package com.salesforce.marketingcloud;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import com.salesforce.marketingcloud.internal.l;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"UnknownNullness"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class k implements com.salesforce.marketingcloud.e, com.salesforce.marketingcloud.behaviors.b, com.salesforce.marketingcloud.http.c.InterfaceC0253c, com.salesforce.marketingcloud.alarms.b.InterfaceC0239b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f64374n = g.a("SyncRouteComponent");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f64375o = 202;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final MarketingCloudConfig f64376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final com.salesforce.marketingcloud.http.c f64377e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final com.salesforce.marketingcloud.storage.j f64378f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final String f64379g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final l f64380h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.salesforce.marketingcloud.behaviors.c f64381i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.salesforce.marketingcloud.alarms.b f64382j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.salesforce.marketingcloud.analytics.l f64383k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected Map<d, e> f64384l = new ArrayMap(d.values().length);
    private boolean m;

    public class a implements MarketingCloudSdk.WhenReadyListener {
        public a() {
        }

        @Override // com.salesforce.marketingcloud.MarketingCloudSdk.WhenReadyListener
        public void ready(@NonNull MarketingCloudSdk marketingCloudSdk) {
            k kVar = k.this;
            kVar.f64377e.a(com.salesforce.marketingcloud.http.a.f64261p.a(kVar.f64376d, kVar.f64378f.c(), com.salesforce.marketingcloud.http.a.c(k.this.f64376d.applicationId(), k.this.f64379g), "{}"));
        }
    }

    public class b extends com.salesforce.marketingcloud.internal.g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f64386b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ JSONObject f64387c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Object[] objArr, d dVar, JSONObject jSONObject) {
            super(str, objArr);
            this.f64386b = dVar;
            this.f64387c = jSONObject;
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            e eVar = k.this.f64384l.get(this.f64386b);
            if (eVar != null) {
                eVar.onSyncReceived(this.f64386b, this.f64387c);
            }
        }
    }

    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f64389a;

        static {
            int[] iArr = new int[com.salesforce.marketingcloud.behaviors.a.values().length];
            f64389a = iArr;
            try {
                iArr[com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_APP_FOREGROUNDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f64389a[com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_SDK_PUSH_RECEIVED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum d {
        blocked,
        inAppMessages,
        triggers,
        pushFeaturesInUse,
        appConfig
    }

    public interface e {
        @WorkerThread
        void onSyncReceived(@NonNull d dVar, @NonNull JSONObject jSONObject);
    }

    public k(String str, MarketingCloudConfig marketingCloudConfig, com.salesforce.marketingcloud.storage.j jVar, com.salesforce.marketingcloud.http.c cVar, com.salesforce.marketingcloud.behaviors.c cVar2, com.salesforce.marketingcloud.alarms.b bVar, l lVar, com.salesforce.marketingcloud.analytics.l lVar2) {
        this.f64379g = str;
        this.f64376d = marketingCloudConfig;
        this.f64378f = jVar;
        this.f64381i = cVar2;
        this.f64377e = cVar;
        this.f64382j = bVar;
        this.f64380h = lVar;
        this.f64383k = lVar2;
    }

    private void a() {
        if (c()) {
            MarketingCloudSdk.requestSdk(b());
        }
    }

    private boolean c() {
        return !this.m;
    }

    @VisibleForTesting
    public MarketingCloudSdk.WhenReadyListener b() {
        return new a();
    }

    @Override // com.salesforce.marketingcloud.d
    @NonNull
    public String componentName() {
        return "SyncRoute";
    }

    @Override // com.salesforce.marketingcloud.d
    @Nullable
    public JSONObject componentState() {
        return null;
    }

    @Override // com.salesforce.marketingcloud.e
    public void controlChannelInit(int i10) {
        if (com.salesforce.marketingcloud.b.a(i10, com.salesforce.marketingcloud.b.c.RTBF.f64041a)) {
            this.f64381i.a(this);
            this.f64377e.a(com.salesforce.marketingcloud.http.a.f64261p);
            com.salesforce.marketingcloud.alarms.b bVar = this.f64382j;
            com.salesforce.marketingcloud.alarms.a.b bVar2 = com.salesforce.marketingcloud.alarms.a.b.f63807g;
            bVar.e(bVar2);
            this.f64382j.d(bVar2);
            this.m = true;
        }
    }

    @Override // com.salesforce.marketingcloud.e
    public void init(@NonNull InitializationStatus.a aVar, int i10) {
        if (com.salesforce.marketingcloud.b.a(i10, com.salesforce.marketingcloud.b.c.RTBF.f64041a)) {
            this.m = true;
            return;
        }
        this.f64377e.a(com.salesforce.marketingcloud.http.a.f64261p, this);
        this.f64381i.a(this, EnumSet.of(com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_APP_FOREGROUNDED, com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_SDK_PUSH_RECEIVED));
        this.f64382j.a(this, com.salesforce.marketingcloud.alarms.a.b.f63807g);
    }

    @Override // com.salesforce.marketingcloud.behaviors.b
    public void onBehavior(@NonNull com.salesforce.marketingcloud.behaviors.a aVar, @NonNull Bundle bundle) {
        int i10 = c.f64389a[aVar.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                return;
            }
            if (!bundle.containsKey("_sync")) {
                if (bundle.containsKey("_nodes")) {
                    a(bundle.getString("_nodes"));
                    return;
                }
                return;
            }
        }
        a();
    }

    @Override // com.salesforce.marketingcloud.d
    public void tearDown(boolean z10) {
        this.f64381i.a(this);
        this.f64377e.a(com.salesforce.marketingcloud.http.a.f64261p);
        com.salesforce.marketingcloud.alarms.b bVar = this.f64382j;
        com.salesforce.marketingcloud.alarms.a.b bVar2 = com.salesforce.marketingcloud.alarms.a.b.f63807g;
        bVar.e(bVar2);
        if (z10) {
            this.f64382j.d(bVar2);
        }
    }

    private void a(long j10) {
        JSONObject jSONObject = new JSONObject();
        try {
            com.salesforce.marketingcloud.analytics.l.a aVar = com.salesforce.marketingcloud.analytics.l.a.SYNC_API;
            jSONObject.put(aVar.b(), j10);
            if (com.salesforce.marketingcloud.config.a.e() == null || !com.salesforce.marketingcloud.config.a.e().l()) {
                return;
            }
            this.f64383k.a(aVar, jSONObject);
        } catch (JSONException e5) {
            g.b(f64374n, e5, "Failed to log TelemetryEvent for Sync Route", new Object[0]);
        }
    }

    @Override // com.salesforce.marketingcloud.alarms.b.InterfaceC0239b
    public void a(@NonNull com.salesforce.marketingcloud.alarms.a.b bVar) {
        if (bVar == com.salesforce.marketingcloud.alarms.a.b.f63807g) {
            a();
        }
    }

    @Override // com.salesforce.marketingcloud.http.c.InterfaceC0253c
    public void a(com.salesforce.marketingcloud.http.b bVar, com.salesforce.marketingcloud.http.d dVar) {
        if (!dVar.g()) {
            this.f64382j.b(com.salesforce.marketingcloud.alarms.a.b.f63807g);
            g.b(f64374n, "Sync route request failed with message: %s", dVar.getMessage());
            return;
        }
        this.f64382j.d(com.salesforce.marketingcloud.alarms.a.b.f63807g);
        com.salesforce.marketingcloud.http.a.a(dVar.d(), this.f64378f.c());
        a(dVar.h());
        try {
            JSONArray jSONArray = new JSONObject(dVar.getBody()).getJSONArray("nodes");
            if (jSONArray != null) {
                a(jSONArray, dVar.getCode());
            }
        } catch (Exception e5) {
            g.b(f64374n, e5, "Failed to parse /sync route response", new Object[0]);
        }
    }

    public void a(d dVar, e eVar) {
        e eVar2 = this.f64384l.get(dVar);
        if (eVar2 == null || eVar == null || eVar2 == eVar) {
            this.f64384l.put(dVar, eVar);
        } else {
            g.e(f64374n, "Node %s already assigned to listener %s.  %s was not added for the Node.", dVar, eVar2, eVar);
        }
    }

    private void a(String str) {
        if (str != null) {
            try {
                a(new JSONArray(str));
            } catch (Exception e5) {
                g.b(f64374n, e5, "Failed to parse sync push message", new Object[0]);
            }
        }
    }

    public void a(@NonNull EnumSet<d> enumSet, e eVar) {
        Iterator<d> it = enumSet.iterator();
        while (it.hasNext()) {
            a(it.next(), eVar);
        }
    }

    private void a(@NonNull JSONArray jSONArray) throws JSONException {
        a(jSONArray, 202);
    }

    private void a(@NonNull JSONArray jSONArray, int i10) throws JSONException {
        String strOptString;
        int length = jSONArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i11);
            try {
                strOptString = jSONObject.optString("name");
                try {
                    d dVarValueOf = d.valueOf(strOptString);
                    if (i10 != 202 || dVarValueOf == d.appConfig || dVarValueOf == d.blocked) {
                        this.f64380h.a().execute(new b(strOptString + "-sync_node_process", new Object[0], dVarValueOf, jSONObject));
                    }
                } catch (Exception unused) {
                    g.a(f64374n, "Failed to process node %s sync route", strOptString);
                }
            } catch (Exception unused2) {
                strOptString = null;
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static boolean a(@NonNull Map<String, String> map) {
        return map.containsKey("_sync") || map.containsKey("_nodes");
    }
}
