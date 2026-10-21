package com.salesforce.marketingcloud.messages.proximity;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.salesforce.marketingcloud.MarketingCloudConfig;
import com.salesforce.marketingcloud.MarketingCloudSdk;
import com.salesforce.marketingcloud.g;
import com.salesforce.marketingcloud.internal.l;
import com.salesforce.marketingcloud.location.LatLon;
import com.salesforce.marketingcloud.messages.Message;
import com.salesforce.marketingcloud.messages.Region;
import com.salesforce.marketingcloud.storage.j;
import com.salesforce.marketingcloud.storage.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"UnknownNullness"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class a implements com.salesforce.marketingcloud.messages.c, com.salesforce.marketingcloud.proximity.e.a, com.salesforce.marketingcloud.http.c.InterfaceC0253c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final String f64759j = g.a("ProximityMessageManager");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final j f64760d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final com.salesforce.marketingcloud.proximity.e f64761e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final com.salesforce.marketingcloud.messages.c.a f64762f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final com.salesforce.marketingcloud.http.c f64763g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final l f64764h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.salesforce.marketingcloud.messages.c.b f64765i;

    /* JADX INFO: renamed from: com.salesforce.marketingcloud.messages.proximity.a$a, reason: collision with other inner class name */
    public class C0263a implements MarketingCloudSdk.WhenReadyListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MarketingCloudConfig f64766a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f64767b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ LatLon f64768c;

        public C0263a(MarketingCloudConfig marketingCloudConfig, String str, LatLon latLon) {
            this.f64766a = marketingCloudConfig;
            this.f64767b = str;
            this.f64768c = latLon;
        }

        @Override // com.salesforce.marketingcloud.MarketingCloudSdk.WhenReadyListener
        public void ready(@NonNull MarketingCloudSdk marketingCloudSdk) {
            a aVar = a.this;
            aVar.f64763g.a(com.salesforce.marketingcloud.http.a.f64259n.a(this.f64766a, aVar.f64760d.c(), com.salesforce.marketingcloud.http.a.a(this.f64766a.applicationId(), this.f64767b, this.f64768c)));
        }
    }

    public class b extends com.salesforce.marketingcloud.internal.g {
        public b(String str, Object... objArr) {
            super(str, objArr);
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            a.this.f64760d.t().g(3);
        }
    }

    public class c extends com.salesforce.marketingcloud.internal.g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.salesforce.marketingcloud.proximity.c f64771b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, Object[] objArr, com.salesforce.marketingcloud.proximity.c cVar) {
            super(str, objArr);
            this.f64771b = cVar;
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            try {
                com.salesforce.marketingcloud.storage.l lVarT = a.this.f64760d.t();
                Region regionA = lVarT.a(this.f64771b.f(), a.this.f64760d.b());
                if (regionA == null) {
                    g.a(a.f64759j, "BeaconRegion [%s] did not have matching Region in storage.", this.f64771b);
                    return;
                }
                if (com.salesforce.marketingcloud.internal.j.a(regionA)) {
                    g.a(a.f64759j, "Ignoring entry event.  Already inside Region [%s]", regionA);
                    return;
                }
                g.d(a.f64759j, "Region [%s] was entered.  Will attempt to show associated message.", regionA.id());
                com.salesforce.marketingcloud.internal.j.a(regionA, true);
                lVarT.a(regionA.id(), true);
                a.this.f64762f.b(regionA);
                List<String> listC = lVarT.c(regionA.id(), 5);
                if (listC.isEmpty()) {
                    return;
                }
                k kVarS = a.this.f64760d.s();
                com.salesforce.marketingcloud.util.c cVarB = a.this.f64760d.b();
                for (String str : listC) {
                    Message messageA = kVarS.a(str, cVarB);
                    if (messageA != null) {
                        a.this.f64762f.a(regionA, messageA);
                    } else {
                        g.a(a.f64759j, "Message with id [%s] not found", str);
                    }
                }
            } catch (Exception e5) {
                g.b(a.f64759j, e5, "Proximity region (%s) was entered, but failed to check for associated message", this.f64771b.f());
            }
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.salesforce.marketingcloud.proximity.c f64773a;

        public d(com.salesforce.marketingcloud.proximity.c cVar) {
            this.f64773a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.salesforce.marketingcloud.storage.l lVarT = a.this.f64760d.t();
            Region regionA = lVarT.a(this.f64773a.f(), a.this.f64760d.b());
            if (regionA == null) {
                g.a(a.f64759j, "BeaconRegion [%s] did not have matching Region in storage.", this.f64773a);
            } else {
                if (!com.salesforce.marketingcloud.internal.j.a(regionA)) {
                    g.a(a.f64759j, "Ignoring exit event.  Was not inside BeaconRegion [%s]", this.f64773a);
                    return;
                }
                com.salesforce.marketingcloud.internal.j.a(regionA, false);
                a.this.f64762f.a(regionA);
                lVarT.a(regionA.id(), false);
            }
        }
    }

    public class e extends com.salesforce.marketingcloud.internal.g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ProximityMessageResponse f64775b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, Object[] objArr, ProximityMessageResponse proximityMessageResponse) {
            super(str, objArr);
            this.f64775b = proximityMessageResponse;
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            com.salesforce.marketingcloud.util.c cVarB = a.this.f64760d.b();
            com.salesforce.marketingcloud.storage.l lVarT = a.this.f64760d.t();
            List<Region> listA = lVarT.a(3, a.this.f64760d.b());
            if (!listA.isEmpty()) {
                Collections.sort(listA);
            }
            lVarT.g(3);
            k kVarS = a.this.f64760d.s();
            if (!this.f64775b.beacons().isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (Region region : this.f64775b.beacons()) {
                    try {
                        boolean z10 = false;
                        for (Message message : region.messages()) {
                            com.salesforce.marketingcloud.messages.b.a(message, kVarS, cVarB);
                            kVarS.a(message, cVarB);
                            z10 = true;
                        }
                        if (z10) {
                            int iBinarySearch = Collections.binarySearch(listA, region);
                            if (iBinarySearch >= 0) {
                                com.salesforce.marketingcloud.internal.j.a(region, com.salesforce.marketingcloud.internal.j.a(listA.remove(iBinarySearch)));
                            }
                            lVarT.a(region, cVarB);
                            arrayList.add(new com.salesforce.marketingcloud.proximity.c(region));
                        }
                    } catch (Exception e5) {
                        g.b(a.f64759j, e5, "Unable to start monitoring proximity region: %s", region.id());
                    }
                }
                g.a(a.f64759j, "Monitoring beacons from request [%s]", arrayList);
                a.this.f64761e.a(arrayList);
            }
            if (listA.isEmpty()) {
                return;
            }
            ArrayList arrayList2 = new ArrayList(listA.size());
            Iterator<Region> it = listA.iterator();
            while (it.hasNext()) {
                arrayList2.add(new com.salesforce.marketingcloud.proximity.c(it.next()));
            }
            g.a(a.f64759j, "Unmonitoring beacons [%s]", arrayList2);
            a.this.f64761e.b(arrayList2);
        }
    }

    public a(@NonNull j jVar, @NonNull com.salesforce.marketingcloud.proximity.e eVar, @NonNull com.salesforce.marketingcloud.http.c cVar, @NonNull l lVar, @NonNull com.salesforce.marketingcloud.messages.c.a aVar) {
        this.f64760d = jVar;
        this.f64761e = eVar;
        this.f64763g = cVar;
        this.f64764h = lVar;
        this.f64762f = aVar;
        cVar.a(com.salesforce.marketingcloud.http.a.f64259n, this);
    }

    @Override // com.salesforce.marketingcloud.messages.c
    public void a() {
        this.f64761e.c();
        this.f64761e.b(this);
        this.f64763g.a(com.salesforce.marketingcloud.http.a.f64259n);
        this.f64764h.b().execute(new b("disable_beacon_tracking", new Object[0]));
    }

    @Override // com.salesforce.marketingcloud.messages.c
    public void b() {
        this.f64761e.a(this);
        this.f64763g.a(com.salesforce.marketingcloud.http.a.f64259n, this);
    }

    @Override // com.salesforce.marketingcloud.messages.c
    public void c() {
        g.c(f64759j, "monitorStoredRegions", new Object[0]);
        try {
            List<Region> listA = this.f64760d.t().a(3, this.f64760d.b());
            if (listA.isEmpty()) {
                return;
            }
            ArrayList arrayList = new ArrayList(listA.size());
            Iterator<Region> it = listA.iterator();
            while (it.hasNext()) {
                arrayList.add(new com.salesforce.marketingcloud.proximity.c(it.next()));
            }
            g.a(f64759j, "Monitoring beacons [%s]", arrayList);
            this.f64761e.a(arrayList);
        } catch (Exception unused) {
            g.b(f64759j, "Unable to monitor stored proximity regions.", new Object[0]);
        }
    }

    public boolean d() {
        return this.f64761e.b();
    }

    @Override // com.salesforce.marketingcloud.http.c.InterfaceC0253c
    public void a(com.salesforce.marketingcloud.http.b bVar, com.salesforce.marketingcloud.http.d dVar) {
        if (!dVar.g()) {
            g.c(f64759j, "Request failed: %d - %s", Integer.valueOf(dVar.getCode()), dVar.getMessage());
            return;
        }
        try {
            a(new ProximityMessageResponse(new JSONObject(dVar.getBody())));
        } catch (Exception e5) {
            g.b(f64759j, e5, "Error parsing response.", new Object[0]);
        }
    }

    @Override // com.salesforce.marketingcloud.proximity.e.a
    public void b(@NonNull com.salesforce.marketingcloud.proximity.c cVar) {
        g.d(f64759j, "Proximity region (%s) entered.", cVar.f());
        this.f64764h.b().execute(new c("", new Object[0], cVar));
    }

    @Override // com.salesforce.marketingcloud.messages.c
    public void a(LatLon latLon, String str, MarketingCloudConfig marketingCloudConfig, com.salesforce.marketingcloud.messages.c.b bVar) {
        this.f64765i = bVar;
        try {
            MarketingCloudSdk.requestSdk(new C0263a(marketingCloudConfig, str, latLon));
        } catch (Exception e5) {
            g.b(f64759j, e5, "Failed to update proximity messages", new Object[0]);
        }
    }

    @VisibleForTesting
    public void a(ProximityMessageResponse proximityMessageResponse) {
        g.c(f64759j, "Proximity message request contained %d regions", Integer.valueOf(proximityMessageResponse.beacons().size()));
        com.salesforce.marketingcloud.messages.c.b bVar = this.f64765i;
        if (bVar != null) {
            bVar.a(proximityMessageResponse);
        }
        this.f64764h.b().execute(new e("beacon_response", new Object[0], proximityMessageResponse));
    }

    @Override // com.salesforce.marketingcloud.proximity.e.a
    public void a(@NonNull com.salesforce.marketingcloud.proximity.c cVar) {
        g.d(f64759j, "Proximity region (%s) exited.", cVar.f());
        this.f64764h.b().execute(new d(cVar));
    }

    public static void a(j jVar, com.salesforce.marketingcloud.proximity.e eVar, com.salesforce.marketingcloud.http.c cVar, boolean z10) {
        eVar.c();
        if (z10) {
            jVar.t().g(3);
            jVar.s().f(5);
        }
        cVar.a(com.salesforce.marketingcloud.http.a.f64259n);
    }
}
