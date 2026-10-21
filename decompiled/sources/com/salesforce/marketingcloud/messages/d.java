package com.salesforce.marketingcloud.messages;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArraySet;
import com.bbva.ethermobilesdk.devicechecker.magisk.permission.MagiskApp;
import com.salesforce.marketingcloud.InitializationStatus;
import com.salesforce.marketingcloud.MarketingCloudConfig;
import com.salesforce.marketingcloud.internal.l;
import com.salesforce.marketingcloud.location.LatLon;
import com.salesforce.marketingcloud.messages.geofence.GeofenceMessageResponse;
import com.salesforce.marketingcloud.messages.proximity.ProximityMessageResponse;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.salesforce.marketingcloud.storage.j;
import com.salesforce.marketingcloud.util.h;
import java.util.EnumSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"UnknownNullness"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class d implements com.salesforce.marketingcloud.e, RegionMessageManager, com.salesforce.marketingcloud.alarms.b.InterfaceC0239b, com.salesforce.marketingcloud.location.e, com.salesforce.marketingcloud.behaviors.b, com.salesforce.marketingcloud.messages.c.b, com.salesforce.marketingcloud.messages.c.a, com.salesforce.marketingcloud.location.c {
    private static final float B = 0.8f;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @VisibleForTesting
    static final String f64574w = "et_geo_enabled_key";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @VisibleForTesting
    static final String f64575x = "et_region_message_toggled_key";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @VisibleForTesting
    static final String f64576y = "et_proximity_enabled_key";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @VisibleForTesting
    static final int f64577z = 5000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final j f64578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.salesforce.marketingcloud.alarms.b f64579e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.salesforce.marketingcloud.location.f f64580f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.salesforce.marketingcloud.proximity.e f64581g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final MarketingCloudConfig f64582h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f64583i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Context f64584j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.salesforce.marketingcloud.notifications.a f64585k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final com.salesforce.marketingcloud.behaviors.c f64586l;
    private final com.salesforce.marketingcloud.http.c m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Set<RegionMessageManager.GeofenceMessageResponseListener> f64587n = new ArraySet();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Set<RegionMessageManager.ProximityMessageResponseListener> f64588o = new ArraySet();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Set<RegionMessageManager.RegionTransitionEventListener> f64589p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final AtomicBoolean f64590q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final l f64591r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private com.salesforce.marketingcloud.messages.geofence.a f64592s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private com.salesforce.marketingcloud.messages.proximity.a f64593t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private com.salesforce.marketingcloud.toggles.a f64594u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private com.salesforce.marketingcloud.toggles.a f64595v;
    private static final String A = "RegionMessageManager";
    static final String C = com.salesforce.marketingcloud.g.a(A);

    public class a extends com.salesforce.marketingcloud.internal.g {
        public a(String str, Object... objArr) {
            super(str, objArr);
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            LatLon latLonL;
            j jVar = d.this.f64578d;
            if (jVar == null || (latLonL = jVar.r().l(d.this.f64578d.b())) == null) {
                return;
            }
            d.this.a(latLonL);
        }
    }

    public class b extends com.salesforce.marketingcloud.internal.g {
        public b(String str, Object... objArr) {
            super(str, objArr);
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            LatLon latLonL;
            j jVar = d.this.f64578d;
            if (jVar == null || (latLonL = jVar.r().l(d.this.f64578d.b())) == null) {
                return;
            }
            d.this.b(latLonL);
        }
    }

    public class c extends com.salesforce.marketingcloud.internal.g {
        public c(String str, Object... objArr) {
            super(str, objArr);
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            d.this.f64578d.t().d();
        }
    }

    /* JADX INFO: renamed from: com.salesforce.marketingcloud.messages.d$d, reason: collision with other inner class name */
    public class C0259d extends com.salesforce.marketingcloud.internal.g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ LatLon f64599b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0259d(String str, Object[] objArr, LatLon latLon) {
            super(str, objArr);
            this.f64599b = latLon;
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            try {
                d dVar = d.this;
                boolean zA = dVar.a(this.f64599b, dVar.f64578d.t().f(d.this.f64578d.b()));
                d.this.f64578d.r().a(this.f64599b, d.this.f64578d.b());
                if (zA) {
                    d.this.a(this.f64599b, d.f64577z);
                    d.this.a(this.f64599b);
                    d.this.b(this.f64599b);
                }
            } catch (Exception e5) {
                com.salesforce.marketingcloud.g.b(d.C, e5, "Unable to store last location", new Object[0]);
            }
        }
    }

    public class e extends com.salesforce.marketingcloud.internal.g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Region f64601b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, Object[] objArr, Region region) {
            super(str, objArr);
            this.f64601b = region;
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            try {
                d.this.f64578d.t().a(this.f64601b, d.this.f64578d.b());
            } catch (Exception e5) {
                com.salesforce.marketingcloud.g.b(d.C, e5, "Unable to set magic region", new Object[0]);
            }
        }
    }

    public class f implements com.salesforce.marketingcloud.notifications.a.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Message f64603a;

        public f(Message message) {
            this.f64603a = message;
        }

        @Override // com.salesforce.marketingcloud.notifications.a.b
        public void a(int i10) {
            if (i10 != -1) {
                try {
                    com.salesforce.marketingcloud.internal.f.a(this.f64603a, i10);
                    d.this.f64578d.s().a(this.f64603a, d.this.f64578d.b());
                } catch (Exception e5) {
                    com.salesforce.marketingcloud.g.b(d.C, e5, "Unable to update message id with notification id.", new Object[0]);
                }
            }
        }
    }

    public static /* synthetic */ class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f64605a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f64606b;

        static {
            int[] iArr = new int[com.salesforce.marketingcloud.behaviors.a.values().length];
            f64606b = iArr;
            try {
                iArr[com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_DEVICE_BOOT_COMPLETE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f64606b[com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_APP_PACKAGE_REPLACED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f64606b[com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_DEVICE_SHUTDOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f64606b[com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_APP_FOREGROUNDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[com.salesforce.marketingcloud.alarms.a.b.values().length];
            f64605a = iArr2;
            try {
                iArr2[com.salesforce.marketingcloud.alarms.a.b.f63804d.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public d(@NonNull Context context, @NonNull MarketingCloudConfig marketingCloudConfig, @NonNull j jVar, @NonNull String str, @NonNull com.salesforce.marketingcloud.location.f fVar, @NonNull com.salesforce.marketingcloud.proximity.e eVar, @NonNull com.salesforce.marketingcloud.behaviors.c cVar, @NonNull com.salesforce.marketingcloud.alarms.b bVar, @NonNull com.salesforce.marketingcloud.http.c cVar2, @NonNull com.salesforce.marketingcloud.notifications.a aVar, l lVar, RegionMessageManager.RegionTransitionEventListener regionTransitionEventListener) {
        ArraySet arraySet = new ArraySet();
        this.f64589p = arraySet;
        this.f64590q = new AtomicBoolean(false);
        this.f64584j = context;
        this.f64578d = jVar;
        this.f64580f = fVar;
        this.f64581g = eVar;
        this.f64585k = aVar;
        this.f64579e = bVar;
        this.f64586l = cVar;
        this.m = cVar2;
        this.f64583i = str;
        this.f64582h = marketingCloudConfig;
        arraySet.add(regionTransitionEventListener);
        this.f64591r = lVar;
    }

    private com.salesforce.marketingcloud.toggles.a a(String str, com.salesforce.marketingcloud.toggles.a aVar) {
        if (aVar == null) {
            return this.f64578d.f().getBoolean(str, false) ? com.salesforce.marketingcloud.toggles.a.ENABLED : com.salesforce.marketingcloud.toggles.a.DISABLED;
        }
        return aVar;
    }

    private void b() {
        disableProximityMessaging();
        disableGeofenceMessaging();
    }

    @NonNull
    private static com.salesforce.marketingcloud.location.b c(Region region) {
        return new com.salesforce.marketingcloud.location.b(region.id(), B * region.radius(), region.center().latitude(), region.center().longitude(), 2);
    }

    private void d(Region region) {
        this.f64591r.b().execute(new e("storing_fence", new Object[0], region));
    }

    private void e() {
        if (Build.VERSION.SDK_INT >= 31) {
            com.salesforce.marketingcloud.g.a(C, "Missing %s or %s", "android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_CONNECT");
        }
    }

    private void f() {
        if (Build.VERSION.SDK_INT < 29) {
            com.salesforce.marketingcloud.g.a(C, "Missing %s", "android.permission.ACCESS_FINE_LOCATION");
        } else {
            com.salesforce.marketingcloud.g.a(C, "Missing %s or %s", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_BACKGROUND_LOCATION");
        }
    }

    private void g() {
        if (isGeofenceMessagingEnabled() && a(true)) {
            this.f64592s.c();
        }
        if (isProximityMessagingEnabled() && b(true)) {
            this.f64593t.c();
        }
    }

    private void h() {
        this.f64591r.b().execute(new c("reset_flags", new Object[0]));
    }

    private void i() {
        if (isGeofenceMessagingEnabled()) {
            this.f64591r.b().execute(new a("update_geofence", new Object[0]));
        }
    }

    private void j() {
        if (isProximityMessagingEnabled()) {
            this.f64591r.b().execute(new b("update_proximity", new Object[0]));
        }
    }

    @Override // com.salesforce.marketingcloud.d
    @NonNull
    public final String componentName() {
        return A;
    }

    @Override // com.salesforce.marketingcloud.d
    @Nullable
    public final JSONObject componentState() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("geofenceMessagingEnabled", isGeofenceMessagingEnabled());
            jSONObject.put("proximityMessagingEnabled", isProximityMessagingEnabled());
            com.salesforce.marketingcloud.storage.l lVarT = this.f64578d.t();
            com.salesforce.marketingcloud.util.c cVarB = this.f64578d.b();
            if (lVarT != null) {
                Region regionF = lVarT.f(cVarB);
                if (regionF != null) {
                    jSONObject.put("magic_fence", regionF);
                }
                jSONObject.put("geofence_regions", lVarT.a(1, cVarB));
                jSONObject.put("geofence_region_messages", this.f64578d.s().j(cVarB));
                jSONObject.put("proximity_regions", lVarT.a(3, cVarB));
                jSONObject.put("proximity_region_messages", this.f64578d.s().k(cVarB));
                jSONObject.put("boot_complete_permission", h.a(this.f64584j, MagiskApp.RECEIVE_BOOT_COMPLETED));
            }
        } catch (Exception e5) {
            com.salesforce.marketingcloud.g.a(C, e5, "Error creating RegionMessageManager state.", new Object[0]);
        }
        return jSONObject;
    }

    @Override // com.salesforce.marketingcloud.e
    public final synchronized void controlChannelInit(int i10) {
        try {
            if (com.salesforce.marketingcloud.b.a(i10, 32)) {
                disableGeofenceMessaging();
                this.f64592s = null;
                com.salesforce.marketingcloud.messages.geofence.a.a(this.f64578d, this.f64580f, this.m, com.salesforce.marketingcloud.b.c(i10, 32));
            } else if (this.f64592s == null && this.f64582h.geofencingEnabled()) {
                a((InitializationStatus.a) null, i10);
            }
            if (com.salesforce.marketingcloud.b.a(i10, 64)) {
                disableProximityMessaging();
                this.f64593t = null;
                com.salesforce.marketingcloud.messages.proximity.a.a(this.f64578d, this.f64581g, this.m, com.salesforce.marketingcloud.b.c(i10, 64));
            } else if (this.f64593t == null && this.f64582h.proximityEnabled()) {
                b(null, i10);
            }
            if (com.salesforce.marketingcloud.b.a(i10, 96)) {
                this.f64580f.b((com.salesforce.marketingcloud.location.c) this);
                this.f64580f.b((com.salesforce.marketingcloud.location.e) this);
                this.f64586l.a(this);
                this.f64578d.r().b();
                com.salesforce.marketingcloud.alarms.b bVar = this.f64579e;
                com.salesforce.marketingcloud.alarms.a.b bVar2 = com.salesforce.marketingcloud.alarms.a.b.f63804d;
                bVar.e(bVar2);
                this.f64579e.d(bVar2);
            } else {
                this.f64586l.a(this, EnumSet.of(com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_DEVICE_BOOT_COMPLETE, com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_APP_PACKAGE_REPLACED, com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_DEVICE_SHUTDOWN, com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_APP_FOREGROUNDED));
                this.f64580f.a((com.salesforce.marketingcloud.location.c) this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.salesforce.marketingcloud.messages.RegionMessageManager
    public final synchronized void disableGeofenceMessaging() {
        try {
            com.salesforce.marketingcloud.g.a(C, "Disabling geofence messaging", new Object[0]);
            if (isGeofenceMessagingEnabled()) {
                j jVar = this.f64578d;
                if (jVar != null) {
                    jVar.f().edit().putBoolean(f64574w, false).apply();
                }
                this.f64594u = com.salesforce.marketingcloud.toggles.a.DISABLED;
                Bundle bundle = new Bundle();
                bundle.putBoolean(RegionMessageManager.BUNDLE_KEY_MESSAGING_ENABLED, false);
                com.salesforce.marketingcloud.behaviors.c.a(this.f64584j, com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_CUSTOMER_FENCE_MESSAGING_TOGGLED, bundle);
                com.salesforce.marketingcloud.messages.geofence.a aVar = this.f64592s;
                if (aVar != null) {
                    aVar.a();
                }
            }
            a();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.salesforce.marketingcloud.messages.RegionMessageManager
    public final synchronized void disableProximityMessaging() {
        try {
            com.salesforce.marketingcloud.g.a(C, "Disabling proximity messaging", new Object[0]);
            if (isProximityMessagingEnabled()) {
                j jVar = this.f64578d;
                if (jVar != null) {
                    jVar.f().edit().putBoolean(f64576y, false).apply();
                }
                this.f64595v = com.salesforce.marketingcloud.toggles.a.DISABLED;
                Bundle bundle = new Bundle();
                bundle.putBoolean(RegionMessageManager.BUNDLE_KEY_MESSAGING_ENABLED, false);
                com.salesforce.marketingcloud.behaviors.c.a(this.f64584j, com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_CUSTOMER_PROXIMITY_MESSAGING_TOGGLED, bundle);
                com.salesforce.marketingcloud.messages.proximity.a aVar = this.f64593t;
                if (aVar != null) {
                    aVar.a();
                }
            }
            a();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.salesforce.marketingcloud.messages.RegionMessageManager
    @SuppressLint({"MissingPermission"})
    public final synchronized boolean enableGeofenceMessaging() {
        return c(false);
    }

    @Override // com.salesforce.marketingcloud.messages.RegionMessageManager
    @SuppressLint({"MissingPermission"})
    public final synchronized boolean enableProximityMessaging() {
        return d(false);
    }

    @Override // com.salesforce.marketingcloud.e
    public final synchronized void init(@NonNull InitializationStatus.a aVar, int i10) {
        try {
            a(aVar, i10);
            b(aVar, i10);
            if (this.f64592s != null || this.f64593t != null) {
                this.f64586l.a(this, EnumSet.of(com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_DEVICE_BOOT_COMPLETE, com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_APP_PACKAGE_REPLACED, com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_DEVICE_SHUTDOWN, com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_APP_FOREGROUNDED));
                this.f64580f.a((com.salesforce.marketingcloud.location.c) this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.salesforce.marketingcloud.messages.RegionMessageManager
    public final boolean isGeofenceMessagingEnabled() {
        if (com.salesforce.marketingcloud.b.a(com.salesforce.marketingcloud.b.a(this.f64578d.o()), 32)) {
            return false;
        }
        if (this.f64594u == null) {
            this.f64594u = a(f64574w, (com.salesforce.marketingcloud.toggles.a) null);
        }
        com.salesforce.marketingcloud.toggles.a aVar = this.f64594u;
        return aVar == com.salesforce.marketingcloud.toggles.a.ENABLED || (aVar == com.salesforce.marketingcloud.toggles.a.UNKNOWN && this.f64582h.geofencingEnabled());
    }

    @Override // com.salesforce.marketingcloud.messages.RegionMessageManager
    public final boolean isProximityMessagingEnabled() {
        if (com.salesforce.marketingcloud.b.a(com.salesforce.marketingcloud.b.a(this.f64578d.o()), 64)) {
            return false;
        }
        if (this.f64595v == null) {
            this.f64595v = a(f64576y, (com.salesforce.marketingcloud.toggles.a) null);
        }
        com.salesforce.marketingcloud.toggles.a aVar = this.f64595v;
        return aVar == com.salesforce.marketingcloud.toggles.a.ENABLED || (aVar == com.salesforce.marketingcloud.toggles.a.UNKNOWN && this.f64582h.proximityEnabled());
    }

    @Override // com.salesforce.marketingcloud.behaviors.b
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void onBehavior(@NonNull com.salesforce.marketingcloud.behaviors.a aVar, @NonNull Bundle bundle) {
        if (aVar == null) {
            return;
        }
        int i10 = g.f64606b[aVar.ordinal()];
        if (i10 == 1) {
            h();
        } else if (i10 != 2) {
            if (i10 == 3) {
                h();
                return;
            }
            if (i10 != 4) {
                return;
            }
            i();
            j();
            if (isGeofenceMessagingEnabled() || isProximityMessagingEnabled()) {
                com.salesforce.marketingcloud.alarms.b bVar = this.f64579e;
                com.salesforce.marketingcloud.alarms.a.b bVar2 = com.salesforce.marketingcloud.alarms.a.b.f63804d;
                bVar.d(bVar2);
                this.f64579e.b(bVar2);
                return;
            }
            return;
        }
        g();
    }

    @Override // com.salesforce.marketingcloud.messages.RegionMessageManager
    public final void registerGeofenceMessageResponseListener(@NonNull RegionMessageManager.GeofenceMessageResponseListener geofenceMessageResponseListener) {
        if (geofenceMessageResponseListener != null) {
            synchronized (this.f64587n) {
                this.f64587n.add(geofenceMessageResponseListener);
            }
        }
    }

    @Override // com.salesforce.marketingcloud.messages.RegionMessageManager
    public final void registerProximityMessageResponseListener(@NonNull RegionMessageManager.ProximityMessageResponseListener proximityMessageResponseListener) {
        if (proximityMessageResponseListener != null) {
            synchronized (this.f64588o) {
                this.f64588o.add(proximityMessageResponseListener);
            }
        }
    }

    @Override // com.salesforce.marketingcloud.messages.RegionMessageManager
    public final void registerRegionTransitionEventListener(@NonNull RegionMessageManager.RegionTransitionEventListener regionTransitionEventListener) {
        if (regionTransitionEventListener != null) {
            synchronized (this.f64589p) {
                this.f64589p.add(regionTransitionEventListener);
            }
        }
    }

    @Override // com.salesforce.marketingcloud.messages.RegionMessageManager
    public final void unregisterGeofenceMessageResponseListener(@NonNull RegionMessageManager.GeofenceMessageResponseListener geofenceMessageResponseListener) {
        synchronized (this.f64587n) {
            this.f64587n.remove(geofenceMessageResponseListener);
        }
    }

    @Override // com.salesforce.marketingcloud.messages.RegionMessageManager
    public final void unregisterProximityMessageResponseListener(@NonNull RegionMessageManager.ProximityMessageResponseListener proximityMessageResponseListener) {
        synchronized (this.f64588o) {
            this.f64588o.remove(proximityMessageResponseListener);
        }
    }

    @Override // com.salesforce.marketingcloud.messages.RegionMessageManager
    public final void unregisterRegionTransitionEventListener(@NonNull RegionMessageManager.RegionTransitionEventListener regionTransitionEventListener) {
        synchronized (this.f64589p) {
            this.f64589p.remove(regionTransitionEventListener);
        }
    }

    private void a() {
        if (isProximityMessagingEnabled() || isGeofenceMessagingEnabled()) {
            return;
        }
        this.f64579e.d(com.salesforce.marketingcloud.alarms.a.b.f63804d);
    }

    private void b(@Nullable InitializationStatus.a aVar, int i10) {
        if (com.salesforce.marketingcloud.b.a(i10, 64)) {
            return;
        }
        this.f64593t = new com.salesforce.marketingcloud.messages.proximity.a(this.f64578d, this.f64581g, this.m, this.f64591r, this);
        this.f64579e.a(this, com.salesforce.marketingcloud.alarms.a.b.f63804d);
        if (isProximityMessagingEnabled()) {
            if (!d(true)) {
                disableProximityMessaging();
            }
            if (aVar != null) {
                aVar.c(!h.b(this.f64584j));
            }
        }
    }

    @SuppressLint({"MissingPermission"})
    private boolean c() {
        if (this.f64592s == null && this.f64593t == null) {
            return false;
        }
        if (this.f64590q.compareAndSet(false, true)) {
            try {
                this.f64580f.a((com.salesforce.marketingcloud.location.e) this);
            } catch (Exception e5) {
                com.salesforce.marketingcloud.g.b(C, e5, "Unable to request location update", new Object[0]);
                b();
                return false;
            }
        }
        this.f64579e.b(com.salesforce.marketingcloud.alarms.a.b.f63804d);
        return true;
    }

    public boolean d() {
        j jVar;
        return (isProximityMessagingEnabled() || isGeofenceMessagingEnabled()) && (jVar = this.f64578d) != null && jVar.f().getBoolean(f64575x, false);
    }

    private void a(int i10, Region region) {
        synchronized (this.f64589p) {
            if (!this.f64589p.isEmpty()) {
                for (RegionMessageManager.RegionTransitionEventListener regionTransitionEventListener : this.f64589p) {
                    if (regionTransitionEventListener != null) {
                        try {
                            regionTransitionEventListener.onTransitionEvent(i10, region);
                        } catch (Exception e5) {
                            com.salesforce.marketingcloud.g.b(C, e5, "%s threw an exception while processing the region (%s) transition (%d)", regionTransitionEventListener.getClass().getName(), region.id(), Integer.valueOf(i10));
                        }
                    }
                }
            }
        }
    }

    private synchronized boolean c(boolean z10) {
        if (!com.salesforce.marketingcloud.util.d.b()) {
            com.salesforce.marketingcloud.g.e(C, "GooglePlayServices Location dependency missing from build.", new Object[0]);
            return false;
        }
        if (!a(z10)) {
            return false;
        }
        com.salesforce.marketingcloud.g.d(C, "Enabling geofence messaging", new Object[0]);
        if (!z10) {
            this.f64578d.f().edit().putBoolean(f64574w, true).apply();
            this.f64578d.f().edit().putBoolean(f64575x, true).apply();
            this.f64594u = com.salesforce.marketingcloud.toggles.a.ENABLED;
            Bundle bundle = new Bundle();
            bundle.putBoolean(RegionMessageManager.BUNDLE_KEY_MESSAGING_ENABLED, true);
            com.salesforce.marketingcloud.behaviors.c.a(this.f64584j, com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_CUSTOMER_FENCE_MESSAGING_TOGGLED, bundle);
        }
        this.f64592s.b();
        return c();
    }

    private boolean d(boolean z10) {
        if (!com.salesforce.marketingcloud.util.d.a()) {
            com.salesforce.marketingcloud.g.e(C, "If you wish to use proximity messenger then you need to add the AltBeacon dependency.", new Object[0]);
            return false;
        }
        if (!b(z10)) {
            return false;
        }
        com.salesforce.marketingcloud.g.d(C, "Enabling proximity messaging.", new Object[0]);
        if (z10) {
            this.f64593t.c();
        } else {
            j jVar = this.f64578d;
            if (jVar != null) {
                jVar.f().edit().putBoolean(f64576y, true).apply();
                this.f64578d.f().edit().putBoolean(f64575x, true).apply();
            }
            this.f64595v = com.salesforce.marketingcloud.toggles.a.ENABLED;
            Bundle bundle = new Bundle();
            bundle.putBoolean(RegionMessageManager.BUNDLE_KEY_MESSAGING_ENABLED, true);
            com.salesforce.marketingcloud.behaviors.c.a(this.f64584j, com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_CUSTOMER_PROXIMITY_MESSAGING_TOGGLED, bundle);
        }
        this.f64593t.b();
        return c();
    }

    public void b(LatLon latLon) {
        com.salesforce.marketingcloud.messages.proximity.a aVar;
        if (!isProximityMessagingEnabled() || (aVar = this.f64593t) == null || latLon == null) {
            com.salesforce.marketingcloud.g.a(C, "Tried to update proximity messages, but was not enabled.", new Object[0]);
        } else {
            aVar.a(latLon, this.f64583i, this.f64582h, this);
        }
    }

    private void b(MessageResponse messageResponse) {
        if (messageResponse instanceof GeofenceMessageResponse) {
            synchronized (this.f64587n) {
                if (!this.f64587n.isEmpty()) {
                    for (RegionMessageManager.GeofenceMessageResponseListener geofenceMessageResponseListener : this.f64587n) {
                        if (geofenceMessageResponseListener != null) {
                            try {
                                geofenceMessageResponseListener.onGeofenceMessageResponse((GeofenceMessageResponse) messageResponse);
                            } catch (Exception e5) {
                                com.salesforce.marketingcloud.g.b(C, e5, "%s threw an exception while processing the geofence response", geofenceMessageResponseListener.getClass().getName());
                            }
                        }
                    }
                }
            }
            return;
        }
        if (messageResponse instanceof ProximityMessageResponse) {
            synchronized (this.f64588o) {
                if (!this.f64588o.isEmpty()) {
                    for (RegionMessageManager.ProximityMessageResponseListener proximityMessageResponseListener : this.f64588o) {
                        if (proximityMessageResponseListener != null) {
                            try {
                                proximityMessageResponseListener.onProximityMessageResponse((ProximityMessageResponse) messageResponse);
                            } catch (Exception e7) {
                                com.salesforce.marketingcloud.g.b(C, e7, "%s threw an exception while processing the proximity response", proximityMessageResponseListener.getClass().getName());
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // com.salesforce.marketingcloud.location.c
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void a(int i10, @Nullable String str) {
        com.salesforce.marketingcloud.g.a(C, "Region error %d - %s", Integer.valueOf(i10), str);
    }

    @Override // com.salesforce.marketingcloud.location.e
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void a(Location location) {
        this.f64590q.set(false);
        if (location == null) {
            return;
        }
        try {
            this.f64591r.b().execute(new C0259d("store_latlon", new Object[0], new LatLon(location.getLatitude(), location.getLongitude())));
        } catch (Exception e5) {
            com.salesforce.marketingcloud.g.b(C, e5, "Unable to make geofence message request after location update", new Object[0]);
        }
    }

    @Override // com.salesforce.marketingcloud.messages.c.a
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void b(Region region) {
        a(1, region);
    }

    private void a(@Nullable InitializationStatus.a aVar, int i10) {
        if (com.salesforce.marketingcloud.b.a(i10, 32)) {
            return;
        }
        this.f64592s = new com.salesforce.marketingcloud.messages.geofence.a(this.f64578d, this.f64580f, this.m, this.f64591r, this);
        this.f64579e.a(this, com.salesforce.marketingcloud.alarms.a.b.f63804d);
        if (isGeofenceMessagingEnabled()) {
            if (!c(true)) {
                disableGeofenceMessaging();
            }
            if (aVar != null) {
                aVar.c(!h.b(this.f64584j));
            }
        }
    }

    private boolean b(boolean z10) {
        if (com.salesforce.marketingcloud.b.a(com.salesforce.marketingcloud.b.a(this.f64578d.o()), 64)) {
            return false;
        }
        if (!z10 && isProximityMessagingEnabled()) {
            com.salesforce.marketingcloud.g.a(C, "Proximity messaging is already enabled.", new Object[0]);
            return false;
        }
        if (this.f64593t == null) {
            com.salesforce.marketingcloud.g.a(C, "Proximity messaging was not enabled while configuring the SDK.  Messaging will not be enabled.", new Object[0]);
            return false;
        }
        if (Build.VERSION.SDK_INT >= 31 && this.f64582h.proximityNotificationCustomizationOptions() == null) {
            com.salesforce.marketingcloud.g.a(C, "Proximity messaging configuration is not passed while configuring the SDK.  Messaging will not be enabled.", new Object[0]);
            return false;
        }
        if (!this.f64593t.d() || !this.f64580f.a()) {
            com.salesforce.marketingcloud.g.a(C, "Proximity messaging was not enabled due to device limitation.", new Object[0]);
            return false;
        }
        if (!h.b(this.f64584j)) {
            f();
            return false;
        }
        if (h.c(this.f64584j)) {
            return true;
        }
        e();
        return false;
    }

    @Override // com.salesforce.marketingcloud.alarms.b.InterfaceC0239b
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void a(@NonNull com.salesforce.marketingcloud.alarms.a.b bVar) {
        if (g.f64605a[bVar.ordinal()] != 1) {
            return;
        }
        i();
        j();
        if (isGeofenceMessagingEnabled() || isProximityMessagingEnabled()) {
            this.f64579e.b(com.salesforce.marketingcloud.alarms.a.b.f63804d);
        }
    }

    public void a(LatLon latLon) {
        com.salesforce.marketingcloud.messages.geofence.a aVar;
        if (!isGeofenceMessagingEnabled() || (aVar = this.f64592s) == null || latLon == null) {
            com.salesforce.marketingcloud.g.a(C, "Tried to update geofence messages, but was not enabled.", new Object[0]);
        } else {
            aVar.a(latLon, this.f64583i, this.f64582h, this);
        }
    }

    public void a(LatLon latLon, int i10) {
        if (h.b(this.f64584j)) {
            Region regionA = com.salesforce.marketingcloud.internal.j.a(latLon, i10);
            d(regionA);
            this.f64580f.a(c(regionA));
        }
    }

    @Override // com.salesforce.marketingcloud.messages.c.b
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void a(MessageResponse messageResponse) {
        if (messageResponse == null) {
            return;
        }
        b(messageResponse);
        try {
            Region regionA = com.salesforce.marketingcloud.internal.j.a(messageResponse.getRefreshCenter(), messageResponse.getRefreshRadius());
            d(regionA);
            this.f64580f.a(c(regionA));
        } catch (Exception e5) {
            com.salesforce.marketingcloud.g.b(C, e5, "Failed to updated radius for magic region.", new Object[0]);
        }
    }

    @Override // com.salesforce.marketingcloud.messages.c.a
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void a(Region region) {
        a(2, region);
    }

    @Override // com.salesforce.marketingcloud.messages.c.a
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void a(Region region, Message message) {
        if (region == null || message == null) {
            return;
        }
        com.salesforce.marketingcloud.g.d(C, "showMessage(%s, %s)", region.id(), message.id());
        NotificationMessage notificationMessageA = com.salesforce.marketingcloud.internal.h.a(message, region);
        if (notificationMessageA == null || !com.salesforce.marketingcloud.messages.b.c(message)) {
            return;
        }
        try {
            com.salesforce.marketingcloud.messages.b.a(message, this.f64578d);
            this.f64585k.a(notificationMessageA, new f(message));
        } catch (Exception e5) {
            com.salesforce.marketingcloud.g.b(C, e5, "Failed to show message", new Object[0]);
        }
    }

    @Override // com.salesforce.marketingcloud.location.c
    @SuppressLint({"MissingPermission"})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void a(@NonNull String str, int i10, @Nullable Location location) {
        if (i10 == 2 && Region.MAGIC_REGION_ID.equals(str)) {
            String str2 = C;
            com.salesforce.marketingcloud.g.d(str2, "MagicRegion exited", new Object[0]);
            if (!h.b(this.f64584j)) {
                com.salesforce.marketingcloud.g.a(str2, "MagicRegion exited, but was missing location permission.", new Object[0]);
                b();
            } else if (location != null) {
                a(location);
            } else {
                this.f64580f.a((com.salesforce.marketingcloud.location.e) this);
            }
        }
    }

    public boolean a(@NonNull LatLon latLon, @Nullable Region region) {
        boolean z10 = true;
        if (region != null) {
            try {
                float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f};
                Location.distanceBetween(latLon.latitude(), latLon.longitude(), region.center().latitude(), region.center().longitude(), fArr);
                if (!d() && fArr[0] <= region.radius() * B) {
                    z10 = false;
                }
            } catch (Exception unused) {
                com.salesforce.marketingcloud.g.b(C, "An error occurred while calculating distance between last known location and the current location.", new Object[0]);
            }
        }
        j jVar = this.f64578d;
        if (jVar != null) {
            jVar.f().edit().remove(f64575x).apply();
        }
        return z10;
    }

    private boolean a(boolean z10) {
        if (com.salesforce.marketingcloud.b.a(com.salesforce.marketingcloud.b.a(this.f64578d.o()), 32)) {
            return false;
        }
        if (!z10 && isGeofenceMessagingEnabled()) {
            com.salesforce.marketingcloud.g.a(C, "Geofence messaging is already enabled", new Object[0]);
            return false;
        }
        com.salesforce.marketingcloud.messages.geofence.a aVar = this.f64592s;
        if (aVar != null && !aVar.d()) {
            com.salesforce.marketingcloud.g.a(C, "Geofence messaging was not enabled due to device limitation.", new Object[0]);
            return false;
        }
        if (h.b(this.f64584j)) {
            return true;
        }
        f();
        return false;
    }

    @Override // com.salesforce.marketingcloud.d
    public void tearDown(boolean z10) {
    }
}
