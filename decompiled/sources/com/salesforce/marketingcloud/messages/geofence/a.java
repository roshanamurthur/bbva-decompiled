package com.salesforce.marketingcloud.messages.geofence;

import android.annotation.SuppressLint;
import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.salesforce.marketingcloud.MarketingCloudConfig;
import com.salesforce.marketingcloud.MarketingCloudSdk;
import com.salesforce.marketingcloud.g;
import com.salesforce.marketingcloud.internal.l;
import com.salesforce.marketingcloud.location.LatLon;
import com.salesforce.marketingcloud.location.f;
import com.salesforce.marketingcloud.messages.Message;
import com.salesforce.marketingcloud.messages.Region;
import com.salesforce.marketingcloud.storage.j;
import com.salesforce.marketingcloud.storage.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"UnknownNullness"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class a implements com.salesforce.marketingcloud.messages.c, com.salesforce.marketingcloud.location.c, com.salesforce.marketingcloud.http.c.InterfaceC0253c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final String f64608k = g.a("GeofenceMessageManager");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final f f64609d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final j f64610e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final com.salesforce.marketingcloud.messages.c.a f64611f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final com.salesforce.marketingcloud.http.c f64612g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final l f64613h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    AtomicBoolean f64614i = new AtomicBoolean(false);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.salesforce.marketingcloud.messages.c.b f64615j;

    /* JADX INFO: renamed from: com.salesforce.marketingcloud.messages.geofence.a$a, reason: collision with other inner class name */
    public class C0260a implements MarketingCloudSdk.WhenReadyListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MarketingCloudConfig f64616a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f64617b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ LatLon f64618c;

        public C0260a(MarketingCloudConfig marketingCloudConfig, String str, LatLon latLon) {
            this.f64616a = marketingCloudConfig;
            this.f64617b = str;
            this.f64618c = latLon;
        }

        @Override // com.salesforce.marketingcloud.MarketingCloudSdk.WhenReadyListener
        public void ready(@NonNull MarketingCloudSdk marketingCloudSdk) {
            a aVar = a.this;
            aVar.f64612g.a(com.salesforce.marketingcloud.http.a.m.a(this.f64616a, aVar.f64610e.c(), com.salesforce.marketingcloud.http.a.a(this.f64616a.applicationId(), this.f64617b, this.f64618c)));
        }
    }

    public class b extends com.salesforce.marketingcloud.internal.g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f64620b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f64621c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Object[] objArr, String str2, int i10) {
            super(str, objArr);
            this.f64620b = str2;
            this.f64621c = i10;
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            int i10;
            try {
                com.salesforce.marketingcloud.storage.l lVarT = a.this.f64610e.t();
                Region regionA = lVarT.a(this.f64620b, a.this.f64610e.b());
                if (regionA == null) {
                    g.c(a.f64608k, "Removing stale geofence from being monitored.", new Object[0]);
                    a.this.f64609d.a(Collections.singletonList(this.f64620b));
                    return;
                }
                int i11 = this.f64621c;
                if (i11 == 1) {
                    a.this.f64611f.b(regionA);
                    i10 = 3;
                } else if (i11 == 2) {
                    a.this.f64611f.a(regionA);
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                if (i10 != 0) {
                    List<String> listC = lVarT.c(regionA.id(), i10);
                    if (listC.isEmpty()) {
                        return;
                    }
                    k kVarS = a.this.f64610e.s();
                    com.salesforce.marketingcloud.util.c cVarB = a.this.f64610e.b();
                    for (String str : listC) {
                        Message messageA = kVarS.a(str, cVarB);
                        if (messageA != null) {
                            a.this.f64611f.a(regionA, messageA);
                        } else {
                            g.a(a.f64608k, "Message with id [%s] not found", str);
                        }
                    }
                }
            } catch (Exception e5) {
                g.b(a.f64608k, e5, "Geofence (%s - %d) was tripped, but failed to check for associated message", this.f64620b, Integer.valueOf(this.f64621c));
            }
        }
    }

    public class c extends com.salesforce.marketingcloud.internal.g {
        public c(String str, Object... objArr) {
            super(str, objArr);
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            List<String> listD = a.this.f64610e.t().d(1);
            if (!listD.isEmpty()) {
                a.this.f64609d.a(listD);
            }
            a.this.f64610e.t().g(1);
        }
    }

    public class d extends com.salesforce.marketingcloud.internal.g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ GeofenceMessageResponse f64624b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, Object[] objArr, GeofenceMessageResponse geofenceMessageResponse) {
            super(str, objArr);
            this.f64624b = geofenceMessageResponse;
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            com.salesforce.marketingcloud.storage.l lVarT = a.this.f64610e.t();
            List<String> listD = lVarT.d(1);
            lVarT.g(1);
            k kVarS = a.this.f64610e.s();
            com.salesforce.marketingcloud.util.c cVarB = a.this.f64610e.b();
            if (!this.f64624b.fences().isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (Region region : this.f64624b.fences()) {
                    try {
                        boolean z10 = false;
                        for (Message message : region.messages()) {
                            com.salesforce.marketingcloud.messages.b.a(message, kVarS, cVarB);
                            kVarS.a(message, cVarB);
                            z10 = true;
                        }
                        if (z10) {
                            if (!listD.remove(region.id())) {
                                arrayList.add(region);
                            }
                            lVarT.a(region, cVarB);
                        }
                    } catch (Exception e5) {
                        g.b(a.f64608k, e5, "Unable to start monitoring geofence region: %s", region.id());
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    a.this.f64609d.a(a.a((Region) it.next()));
                }
            }
            if (!listD.isEmpty()) {
                a.this.f64609d.a(listD);
            }
            a.this.f64614i.set(true);
        }
    }

    public class e extends com.salesforce.marketingcloud.internal.g {
        public e(String str, Object... objArr) {
            super(str, objArr);
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            if (a.this.f64614i.get()) {
                g.d(a.f64608k, "Attempt to monitor fences from DB ignored, because they're already monitored.", new Object[0]);
            }
            g.d(a.f64608k, "monitorStoredRegions", new Object[0]);
            try {
                List<Region> listA = a.this.f64610e.t().a(1, a.this.f64610e.b());
                if (listA.isEmpty()) {
                    return;
                }
                Iterator<Region> it = listA.iterator();
                while (it.hasNext()) {
                    a.this.f64609d.a(a.a(it.next()));
                }
            } catch (Exception e5) {
                g.b(a.f64608k, e5, "Unable to monitor stored geofence regions.", new Object[0]);
            }
        }
    }

    public a(@NonNull j jVar, @NonNull f fVar, @NonNull com.salesforce.marketingcloud.http.c cVar, l lVar, @NonNull com.salesforce.marketingcloud.messages.c.a aVar) {
        this.f64610e = jVar;
        this.f64609d = fVar;
        this.f64612g = cVar;
        this.f64611f = aVar;
        this.f64613h = lVar;
        cVar.a(com.salesforce.marketingcloud.http.a.m, this);
    }

    private static int a(int i10) {
        if (i10 < 100) {
            return 100;
        }
        return i10;
    }

    @Override // com.salesforce.marketingcloud.messages.c
    public void b() {
        this.f64609d.a(this);
        this.f64612g.a(com.salesforce.marketingcloud.http.a.m, this);
    }

    @Override // com.salesforce.marketingcloud.messages.c
    public void c() {
        this.f64613h.b().execute(new e("monitor_stored_regions", new Object[0]));
    }

    public boolean d() {
        return this.f64609d.a();
    }

    public static com.salesforce.marketingcloud.location.b a(Region region) {
        return new com.salesforce.marketingcloud.location.b(region.id(), a(region.radius()), region.center().latitude(), region.center().longitude(), 3);
    }

    @Override // com.salesforce.marketingcloud.messages.c
    public void a() {
        f fVar = this.f64609d;
        if (fVar != null) {
            fVar.b(this);
            if (this.f64610e != null) {
                this.f64613h.b().execute(new c("disable_fence_tracking", new Object[0]));
            }
        }
        this.f64612g.a(com.salesforce.marketingcloud.http.a.m);
        this.f64614i.set(false);
    }

    @Override // com.salesforce.marketingcloud.location.c
    public void a(int i10, @Nullable String str) {
        g.a(f64608k, "Region error %d - %s", Integer.valueOf(i10), str);
    }

    @Override // com.salesforce.marketingcloud.http.c.InterfaceC0253c
    public void a(com.salesforce.marketingcloud.http.b bVar, com.salesforce.marketingcloud.http.d dVar) {
        if (!dVar.g()) {
            g.c(f64608k, "Request failed: %d - %s", Integer.valueOf(dVar.getCode()), dVar.getMessage());
            return;
        }
        try {
            a(new GeofenceMessageResponse(new JSONObject(dVar.getBody())));
        } catch (Exception e5) {
            g.b(f64608k, e5, "Error parsing response.", new Object[0]);
        }
    }

    @Override // com.salesforce.marketingcloud.messages.c
    public void a(LatLon latLon, String str, MarketingCloudConfig marketingCloudConfig, com.salesforce.marketingcloud.messages.c.b bVar) {
        this.f64615j = bVar;
        try {
            MarketingCloudSdk.requestSdk(new C0260a(marketingCloudConfig, str, latLon));
        } catch (Exception e5) {
            g.b(f64608k, e5, "Failed to update geofence messages", new Object[0]);
        }
    }

    @VisibleForTesting
    public void a(GeofenceMessageResponse geofenceMessageResponse) {
        g.c(f64608k, "Geofence message request contained %d regions", Integer.valueOf(geofenceMessageResponse.fences().size()));
        com.salesforce.marketingcloud.messages.c.b bVar = this.f64615j;
        if (bVar != null) {
            bVar.a(geofenceMessageResponse);
        }
        this.f64613h.b().execute(new d("fence_response", new Object[0], geofenceMessageResponse));
    }

    public static void a(j jVar, f fVar, com.salesforce.marketingcloud.http.c cVar, boolean z10) {
        List<String> listD = jVar.t().d(1);
        if (!listD.isEmpty()) {
            fVar.a(listD);
        }
        if (z10) {
            jVar.t().g(1);
            k kVarS = jVar.s();
            kVarS.f(3);
            kVarS.f(4);
        }
        cVar.a(com.salesforce.marketingcloud.http.a.m);
    }

    @Override // com.salesforce.marketingcloud.location.c
    public void a(@NonNull String str, int i10, @Nullable Location location) {
        String str2 = f64608k;
        g.d(str2, "Geofence (%s - %s) was tripped.", str, Integer.valueOf(i10));
        if (i10 == 4) {
            g.d(str2, "Dwell transition ignore for %s", str);
        } else {
            this.f64613h.b().execute(new b("fence_event", new Object[0], str, i10));
        }
    }
}
