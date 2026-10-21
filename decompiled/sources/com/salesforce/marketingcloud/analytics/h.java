package com.salesforce.marketingcloud.analytics;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.Size;
import androidx.annotation.VisibleForTesting;
import com.salesforce.marketingcloud.InitializationStatus;
import com.salesforce.marketingcloud.MarketingCloudConfig;
import com.salesforce.marketingcloud.messages.Region;
import com.salesforce.marketingcloud.messages.RegionMessageManager;
import com.salesforce.marketingcloud.messages.iam.InAppMessage;
import com.salesforce.marketingcloud.messages.inbox.InboxMessage;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.salesforce.marketingcloud.sfmcsdk.components.events.Event;
import java.util.EnumSet;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"UnknownNullness"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class h implements com.salesforce.marketingcloud.e, com.salesforce.marketingcloud.behaviors.b, j, RegionMessageManager.RegionTransitionEventListener, AnalyticsManager, g, f, m, n, l {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f63895s = "ETAnalyticsEnabled";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f63896t = "PIAnalyticsEnabled";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final Object f63897u = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.salesforce.marketingcloud.behaviors.c f63898d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final EnumSet<com.salesforce.marketingcloud.behaviors.a> f63899e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final com.salesforce.marketingcloud.storage.j f63900f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.salesforce.marketingcloud.http.c f63901g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f63902h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final MarketingCloudConfig f63903i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.salesforce.marketingcloud.alarms.b f63904j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.salesforce.marketingcloud.analytics.etanalytics.c f63905k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    com.salesforce.marketingcloud.analytics.etanalytics.b f63906l;
    com.salesforce.marketingcloud.analytics.etanalytics.a m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    com.salesforce.marketingcloud.analytics.piwama.i f63907n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @VisibleForTesting
    com.salesforce.marketingcloud.analytics.stats.c f63908o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private com.salesforce.marketingcloud.internal.l f63909p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private com.salesforce.marketingcloud.toggles.a f63910q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private com.salesforce.marketingcloud.toggles.a f63911r;

    public class a extends com.salesforce.marketingcloud.internal.g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InboxMessage f63912b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Object[] objArr, InboxMessage inboxMessage) {
            super(str, objArr);
            this.f63912b = inboxMessage;
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            if (this.f63912b == null || !h.this.f63900f.q().f(this.f63912b.id())) {
                com.salesforce.marketingcloud.g.e(AnalyticsManager.TAG, "InboxMessage is a Legacy message, null or unknown.  Call to trackInboxOpenEvent() ignored.", new Object[0]);
                return;
            }
            com.salesforce.marketingcloud.analytics.etanalytics.a aVar = h.this.m;
            if (aVar != null) {
                aVar.trackInboxOpenEvent(this.f63912b);
            }
            com.salesforce.marketingcloud.analytics.etanalytics.b bVar = h.this.f63906l;
            if (bVar != null) {
                bVar.trackInboxOpenEvent(this.f63912b);
            }
            com.salesforce.marketingcloud.analytics.piwama.i iVar = h.this.f63907n;
            if (iVar != null) {
                iVar.trackInboxOpenEvent(this.f63912b);
            }
            com.salesforce.marketingcloud.analytics.stats.c cVar = h.this.f63908o;
            if (cVar != null) {
                cVar.trackInboxOpenEvent(this.f63912b);
            }
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f63914a;

        static {
            int[] iArr = new int[com.salesforce.marketingcloud.behaviors.a.values().length];
            f63914a = iArr;
            try {
                iArr[com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_APP_BACKGROUNDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f63914a[com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_APP_FOREGROUNDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f63914a[com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_DEVICE_SHUTDOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f63914a[com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_DEVICE_BOOT_COMPLETE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.TESTS})
    public h(@NonNull MarketingCloudConfig marketingCloudConfig, @NonNull com.salesforce.marketingcloud.storage.j jVar, @NonNull String str, @NonNull com.salesforce.marketingcloud.alarms.b bVar, @NonNull com.salesforce.marketingcloud.behaviors.c cVar, @NonNull com.salesforce.marketingcloud.http.c cVar2, com.salesforce.marketingcloud.analytics.etanalytics.a aVar, com.salesforce.marketingcloud.analytics.etanalytics.b bVar2, com.salesforce.marketingcloud.analytics.piwama.i iVar, com.salesforce.marketingcloud.internal.l lVar, com.salesforce.marketingcloud.analytics.stats.c cVar3, com.salesforce.marketingcloud.analytics.etanalytics.c cVar4) {
        this(marketingCloudConfig, jVar, str, bVar, cVar, cVar2, lVar);
        this.m = aVar;
        this.f63906l = bVar2;
        this.f63907n = iVar;
        this.f63908o = cVar3;
        this.f63905k = cVar4;
    }

    private com.salesforce.marketingcloud.toggles.a a(String str, com.salesforce.marketingcloud.toggles.a aVar) {
        if (aVar != null) {
            return aVar;
        }
        String string = this.f63900f.f().getString(str, null);
        return string == null ? com.salesforce.marketingcloud.toggles.a.UNKNOWN : com.salesforce.marketingcloud.toggles.a.valueOf(string);
    }

    private void b(int i10, com.salesforce.marketingcloud.toggles.a aVar) {
        if (com.salesforce.marketingcloud.b.a(i10, 512)) {
            return;
        }
        this.f63911r = aVar;
        if (aVar == com.salesforce.marketingcloud.toggles.a.ENABLED || (this.f63903i.piAnalyticsEnabled() && aVar == com.salesforce.marketingcloud.toggles.a.UNKNOWN)) {
            this.f63907n = new com.salesforce.marketingcloud.analytics.piwama.i(this.f63903i, this.f63900f, this.f63901g, this.f63909p);
        }
    }

    private void c(Bundle bundle) {
        long j10 = bundle.getLong("timestamp", 0L);
        com.salesforce.marketingcloud.analytics.etanalytics.a aVar = this.m;
        if (aVar != null) {
            aVar.c(j10);
        }
        com.salesforce.marketingcloud.analytics.etanalytics.b bVar = this.f63906l;
        if (bVar != null) {
            bVar.c(j10);
        }
        com.salesforce.marketingcloud.analytics.piwama.i iVar = this.f63907n;
        if (iVar != null) {
            iVar.c(j10);
        }
        com.salesforce.marketingcloud.analytics.stats.c cVar = this.f63908o;
        if (cVar != null) {
            cVar.c(j10);
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.AnalyticsManager
    public boolean areAnalyticsEnabled() {
        if (com.salesforce.marketingcloud.b.a(com.salesforce.marketingcloud.b.a(this.f63900f.o()), 256)) {
            return false;
        }
        if (this.f63910q == null) {
            this.f63910q = a(f63895s, (com.salesforce.marketingcloud.toggles.a) null);
        }
        com.salesforce.marketingcloud.toggles.a aVar = this.f63910q;
        return aVar == com.salesforce.marketingcloud.toggles.a.ENABLED || (aVar == com.salesforce.marketingcloud.toggles.a.UNKNOWN && this.f63903i.analyticsEnabled());
    }

    @Override // com.salesforce.marketingcloud.analytics.AnalyticsManager
    public boolean arePiAnalyticsEnabled() {
        if (com.salesforce.marketingcloud.b.a(com.salesforce.marketingcloud.b.a(this.f63900f.o()), 512)) {
            return false;
        }
        if (this.f63911r == null) {
            this.f63911r = a(f63896t, (com.salesforce.marketingcloud.toggles.a) null);
        }
        com.salesforce.marketingcloud.toggles.a aVar = this.f63911r;
        return aVar == com.salesforce.marketingcloud.toggles.a.ENABLED || (aVar == com.salesforce.marketingcloud.toggles.a.UNKNOWN && this.f63903i.piAnalyticsEnabled());
    }

    @Override // com.salesforce.marketingcloud.d
    public String componentName() {
        return "AnalyticsManager";
    }

    @Override // com.salesforce.marketingcloud.d
    public JSONObject componentState() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("bet_analytics", this.m != null);
            jSONObject.put("et_analytics", this.f63906l != null);
            jSONObject.put("pi_analytics", this.f63907n != null);
            jSONObject.put("device_stats", this.f63908o != null);
            com.salesforce.marketingcloud.analytics.piwama.i iVar = this.f63907n;
            if (iVar != null) {
                jSONObject.put("predictive_intelligence_identifier", iVar.getPiIdentifier());
            }
            jSONObject.put("analyticsEnabled", areAnalyticsEnabled());
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // com.salesforce.marketingcloud.e
    public void controlChannelInit(int i10) {
        boolean zA = com.salesforce.marketingcloud.b.a(i10, 256);
        if (com.salesforce.marketingcloud.b.a(i10, 2048)) {
            com.salesforce.marketingcloud.analytics.etanalytics.a aVar = this.m;
            if (aVar != null) {
                aVar.a(false);
                this.m = null;
            }
            com.salesforce.marketingcloud.analytics.etanalytics.a.a(this.f63900f, this.f63909p, com.salesforce.marketingcloud.b.c(i10, 2048));
            com.salesforce.marketingcloud.analytics.stats.c cVar = this.f63908o;
            if (cVar != null) {
                cVar.a(false);
                this.f63908o = null;
            }
            com.salesforce.marketingcloud.analytics.stats.c.a(this.f63900f, com.salesforce.marketingcloud.b.c(i10, 2048));
        } else {
            this.m = new com.salesforce.marketingcloud.analytics.etanalytics.a(this.f63900f, this.f63909p);
            MarketingCloudConfig marketingCloudConfig = this.f63903i;
            this.f63908o = new com.salesforce.marketingcloud.analytics.stats.c(marketingCloudConfig, this.f63902h, marketingCloudConfig.analyticsEnabled() && !zA, this.f63900f, this.f63901g, this.f63904j, this.f63909p);
        }
        if (zA) {
            com.salesforce.marketingcloud.analytics.etanalytics.b bVar = this.f63906l;
            if (bVar != null) {
                bVar.a(false);
                this.f63906l = null;
            }
            com.salesforce.marketingcloud.analytics.etanalytics.b.a(this.f63900f, this.f63909p, com.salesforce.marketingcloud.b.c(i10, 256));
        } else if (this.f63906l == null && this.f63903i.analyticsEnabled()) {
            this.f63906l = new com.salesforce.marketingcloud.analytics.etanalytics.b(this.f63900f, this.f63909p);
        }
        if (com.salesforce.marketingcloud.b.a(i10, 512)) {
            com.salesforce.marketingcloud.analytics.piwama.i iVar = this.f63907n;
            if (iVar != null) {
                iVar.a(false);
                this.f63907n = null;
            }
            com.salesforce.marketingcloud.analytics.piwama.i.a(this.f63900f, this.f63901g, this.f63909p, com.salesforce.marketingcloud.b.c(i10, 512));
        } else if (this.f63907n == null && this.f63903i.piAnalyticsEnabled()) {
            this.f63907n = new com.salesforce.marketingcloud.analytics.piwama.i(this.f63903i, this.f63900f, this.f63901g, this.f63909p);
        }
        if (this.m != null || this.f63906l != null) {
            if (this.f63905k == null) {
                this.f63905k = new com.salesforce.marketingcloud.analytics.etanalytics.c(this.f63903i, this.f63902h, this.f63900f, this.f63901g, this.f63904j, this.f63909p);
            }
        } else {
            this.f63904j.d(com.salesforce.marketingcloud.alarms.a.b.f63803c);
            com.salesforce.marketingcloud.analytics.etanalytics.c cVar2 = this.f63905k;
            if (cVar2 != null) {
                cVar2.b();
                this.f63905k = null;
            }
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.AnalyticsManager
    public void disableAnalytics() {
        synchronized (f63897u) {
            try {
                this.f63910q = com.salesforce.marketingcloud.toggles.a.DISABLED;
                this.f63900f.f().edit().putString(f63895s, this.f63910q.name()).apply();
                com.salesforce.marketingcloud.analytics.etanalytics.b bVar = this.f63906l;
                if (bVar != null) {
                    bVar.a(true);
                    this.f63906l = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.AnalyticsManager
    public void disablePiAnalytics() {
        synchronized (f63897u) {
            try {
                this.f63911r = com.salesforce.marketingcloud.toggles.a.DISABLED;
                this.f63900f.f().edit().putString(f63896t, this.f63911r.name()).apply();
                com.salesforce.marketingcloud.g.a(AnalyticsManager.TAG, "Pi Analytics runtime toggle set to " + this.f63911r.name(), new Object[0]);
                com.salesforce.marketingcloud.analytics.piwama.i iVar = this.f63907n;
                if (iVar != null) {
                    iVar.a(true);
                    this.f63907n = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.AnalyticsManager
    public void enableAnalytics() {
        synchronized (f63897u) {
            try {
                if (com.salesforce.marketingcloud.b.a(com.salesforce.marketingcloud.b.a(this.f63900f.o()), 256)) {
                    return;
                }
                this.f63910q = com.salesforce.marketingcloud.toggles.a.ENABLED;
                this.f63900f.f().edit().putString(f63895s, this.f63910q.name()).apply();
                this.f63906l = new com.salesforce.marketingcloud.analytics.etanalytics.b(this.f63900f, this.f63909p);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.AnalyticsManager
    public void enablePiAnalytics() {
        synchronized (f63897u) {
            try {
                if (com.salesforce.marketingcloud.b.a(com.salesforce.marketingcloud.b.a(this.f63900f.o()), 512)) {
                    return;
                }
                this.f63911r = com.salesforce.marketingcloud.toggles.a.ENABLED;
                this.f63900f.f().edit().putString(f63896t, this.f63911r.name()).apply();
                com.salesforce.marketingcloud.g.a(AnalyticsManager.TAG, "Pi Analytics runtime toggle set to " + this.f63911r.name(), new Object[0]);
                this.f63907n = new com.salesforce.marketingcloud.analytics.piwama.i(this.f63903i, this.f63900f, this.f63901g, this.f63909p);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.AnalyticsManager
    @Nullable
    public String getPiIdentifier() {
        com.salesforce.marketingcloud.analytics.piwama.i iVar = this.f63907n;
        if (iVar != null) {
            return iVar.getPiIdentifier();
        }
        return null;
    }

    @Override // com.salesforce.marketingcloud.e
    public void init(@NonNull InitializationStatus.a aVar, int i10) {
        boolean zA = a(i10, a(f63895s, this.f63910q));
        if (com.salesforce.marketingcloud.b.b(i10, 2048)) {
            this.m = new com.salesforce.marketingcloud.analytics.etanalytics.a(this.f63900f, this.f63909p);
            this.f63908o = new com.salesforce.marketingcloud.analytics.stats.c(this.f63903i, this.f63902h, zA, this.f63900f, this.f63901g, this.f63904j, this.f63909p);
        }
        b(i10, a(f63896t, this.f63911r));
        if (this.m != null || this.f63906l != null) {
            this.f63905k = new com.salesforce.marketingcloud.analytics.etanalytics.c(this.f63903i, this.f63902h, this.f63900f, this.f63901g, this.f63904j, this.f63909p);
        }
        this.f63898d.a(this, this.f63899e);
    }

    @Override // com.salesforce.marketingcloud.behaviors.b
    public void onBehavior(@NonNull com.salesforce.marketingcloud.behaviors.a aVar, @NonNull Bundle bundle) {
        int i10 = b.f63914a[aVar.ordinal()];
        if (i10 == 1) {
            a(bundle);
            return;
        }
        if (i10 == 2) {
            b(bundle);
        } else if (i10 == 3 || i10 == 4) {
            c(bundle);
        }
    }

    @Override // com.salesforce.marketingcloud.messages.RegionMessageManager.RegionTransitionEventListener
    public void onTransitionEvent(int i10, @NonNull Region region) {
        if (i10 == 1) {
            com.salesforce.marketingcloud.analytics.etanalytics.a aVar = this.m;
            if (aVar != null) {
                aVar.b(region);
            }
            com.salesforce.marketingcloud.analytics.etanalytics.b bVar = this.f63906l;
            if (bVar != null) {
                bVar.b(region);
            }
            com.salesforce.marketingcloud.analytics.piwama.i iVar = this.f63907n;
            if (iVar != null) {
                iVar.b(region);
            }
            com.salesforce.marketingcloud.analytics.stats.c cVar = this.f63908o;
            if (cVar != null) {
                cVar.b(region);
                return;
            }
            return;
        }
        if (i10 != 2) {
            return;
        }
        com.salesforce.marketingcloud.analytics.etanalytics.a aVar2 = this.m;
        if (aVar2 != null) {
            aVar2.a(region);
        }
        com.salesforce.marketingcloud.analytics.etanalytics.b bVar2 = this.f63906l;
        if (bVar2 != null) {
            bVar2.a(region);
        }
        com.salesforce.marketingcloud.analytics.piwama.i iVar2 = this.f63907n;
        if (iVar2 != null) {
            iVar2.a(region);
        }
        com.salesforce.marketingcloud.analytics.stats.c cVar2 = this.f63908o;
        if (cVar2 != null) {
            cVar2.a(region);
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.AnalyticsManager
    public void setPiIdentifier(@Nullable @Size(min = 1) String str) {
        if (str != null && TextUtils.getTrimmedLength(str) == 0) {
            com.salesforce.marketingcloud.g.e(AnalyticsManager.TAG, "Call to setPiIdentifier() ignored. Predictive Intelligence Identifier contained only whitespace.", new Object[0]);
            return;
        }
        com.salesforce.marketingcloud.analytics.piwama.i iVar = this.f63907n;
        if (iVar != null) {
            iVar.setPiIdentifier(str);
        }
    }

    @Override // com.salesforce.marketingcloud.d
    public void tearDown(boolean z10) {
        this.f63898d.a(this);
        com.salesforce.marketingcloud.analytics.etanalytics.a aVar = this.m;
        if (aVar != null) {
            aVar.a(z10);
            this.m = null;
        }
        com.salesforce.marketingcloud.analytics.etanalytics.b bVar = this.f63906l;
        if (bVar != null) {
            bVar.a(z10);
            this.f63906l = null;
        }
        com.salesforce.marketingcloud.analytics.etanalytics.c cVar = this.f63905k;
        if (cVar != null) {
            cVar.b();
            this.f63905k = null;
        }
        com.salesforce.marketingcloud.analytics.stats.c cVar2 = this.f63908o;
        if (cVar2 != null) {
            cVar2.a(z10);
            this.f63908o = null;
        }
        com.salesforce.marketingcloud.analytics.piwama.i iVar = this.f63907n;
        if (iVar != null) {
            iVar.a(z10);
            this.f63907n = null;
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.AnalyticsManager
    public void trackCartContents(@NonNull PiCart piCart) {
        if (piCart == null) {
            com.salesforce.marketingcloud.g.e(AnalyticsManager.TAG, "PiCart may not be null.  We could not complete your trackCartContents() request.", new Object[0]);
            return;
        }
        com.salesforce.marketingcloud.analytics.etanalytics.a aVar = this.m;
        if (aVar != null) {
            aVar.trackCartContents(piCart);
        }
        com.salesforce.marketingcloud.analytics.etanalytics.b bVar = this.f63906l;
        if (bVar != null) {
            bVar.trackCartContents(piCart);
        }
        com.salesforce.marketingcloud.analytics.piwama.i iVar = this.f63907n;
        if (iVar != null) {
            iVar.trackCartContents(piCart);
        }
        com.salesforce.marketingcloud.analytics.stats.c cVar = this.f63908o;
        if (cVar != null) {
            cVar.trackCartContents(piCart);
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.AnalyticsManager
    public void trackCartConversion(@NonNull PiOrder piOrder) {
        if (piOrder == null) {
            com.salesforce.marketingcloud.g.e(AnalyticsManager.TAG, "PiOrder may not be null.  We could not complete your trackCartConversion() request.", new Object[0]);
            return;
        }
        com.salesforce.marketingcloud.analytics.etanalytics.a aVar = this.m;
        if (aVar != null) {
            aVar.trackCartConversion(piOrder);
        }
        com.salesforce.marketingcloud.analytics.etanalytics.b bVar = this.f63906l;
        if (bVar != null) {
            bVar.trackCartConversion(piOrder);
        }
        com.salesforce.marketingcloud.analytics.piwama.i iVar = this.f63907n;
        if (iVar != null) {
            iVar.trackCartConversion(piOrder);
        }
        com.salesforce.marketingcloud.analytics.stats.c cVar = this.f63908o;
        if (cVar != null) {
            cVar.trackCartConversion(piOrder);
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.AnalyticsManager
    public void trackInboxOpenEvent(@NonNull InboxMessage inboxMessage) {
        this.f63909p.b().execute(new a("track_inbox_open", new Object[0], inboxMessage));
    }

    @Override // com.salesforce.marketingcloud.analytics.AnalyticsManager
    public void trackPageView(@NonNull @Size(min = 1) String str) {
        trackPageView(str, null, null, null);
    }

    public h(@NonNull MarketingCloudConfig marketingCloudConfig, @NonNull com.salesforce.marketingcloud.storage.j jVar, @NonNull String str, @NonNull com.salesforce.marketingcloud.alarms.b bVar, @NonNull com.salesforce.marketingcloud.behaviors.c cVar, @NonNull com.salesforce.marketingcloud.http.c cVar2, @NonNull com.salesforce.marketingcloud.internal.l lVar) {
        this.f63899e = EnumSet.of(com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_APP_BACKGROUNDED, com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_APP_FOREGROUNDED, com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_DEVICE_SHUTDOWN, com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_DEVICE_BOOT_COMPLETE);
        this.f63900f = (com.salesforce.marketingcloud.storage.j) com.salesforce.marketingcloud.util.j.a(jVar, "MCStorage may not be null.");
        this.f63898d = (com.salesforce.marketingcloud.behaviors.c) com.salesforce.marketingcloud.util.j.a(cVar, "BehaviorManager may not be null.");
        this.f63901g = cVar2;
        this.f63902h = str;
        this.f63903i = marketingCloudConfig;
        this.f63904j = bVar;
        this.f63909p = lVar;
    }

    private void a(Bundle bundle) {
        long j10 = bundle.getLong("timestamp", 0L);
        com.salesforce.marketingcloud.analytics.etanalytics.a aVar = this.m;
        if (aVar != null) {
            aVar.a(j10);
        }
        com.salesforce.marketingcloud.analytics.etanalytics.b bVar = this.f63906l;
        if (bVar != null) {
            bVar.a(j10);
        }
        com.salesforce.marketingcloud.analytics.piwama.i iVar = this.f63907n;
        if (iVar != null) {
            iVar.a(j10);
            this.f63907n.c();
        }
        com.salesforce.marketingcloud.analytics.stats.c cVar = this.f63908o;
        if (cVar != null) {
            cVar.a(j10);
            this.f63908o.a();
        }
        com.salesforce.marketingcloud.analytics.etanalytics.c cVar2 = this.f63905k;
        if (cVar2 != null) {
            cVar2.a();
        }
    }

    private void b(Bundle bundle) {
        long j10 = bundle.getLong("timestamp", System.currentTimeMillis());
        com.salesforce.marketingcloud.analytics.etanalytics.c cVar = this.f63905k;
        if (cVar != null) {
            cVar.a();
        }
        com.salesforce.marketingcloud.analytics.etanalytics.a aVar = this.m;
        if (aVar != null) {
            aVar.b(j10);
        }
        com.salesforce.marketingcloud.analytics.etanalytics.b bVar = this.f63906l;
        if (bVar != null) {
            bVar.b(j10);
        }
        com.salesforce.marketingcloud.analytics.piwama.i iVar = this.f63907n;
        if (iVar != null) {
            iVar.c();
            this.f63907n.b(j10);
        }
        com.salesforce.marketingcloud.analytics.stats.c cVar2 = this.f63908o;
        if (cVar2 != null) {
            cVar2.a();
            this.f63908o.b(j10);
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.AnalyticsManager
    public void trackPageView(@NonNull @Size(min = 1) String str, @Nullable String str2) {
        trackPageView(str, str2, null, null);
    }

    @Override // com.salesforce.marketingcloud.analytics.n
    public void a(@NonNull e eVar, @NonNull Event... eventArr) {
        com.salesforce.marketingcloud.analytics.etanalytics.a aVar = this.m;
        if (aVar != null) {
            aVar.a(eVar, eventArr);
        }
        com.salesforce.marketingcloud.analytics.etanalytics.b bVar = this.f63906l;
        if (bVar != null) {
            bVar.a(eVar, eventArr);
        }
        com.salesforce.marketingcloud.analytics.piwama.i iVar = this.f63907n;
        if (iVar != null) {
            iVar.a(eVar, eventArr);
        }
        com.salesforce.marketingcloud.analytics.stats.c cVar = this.f63908o;
        if (cVar != null) {
            cVar.a(eVar, eventArr);
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.f
    public void b(@NonNull InAppMessage inAppMessage) {
        if (inAppMessage == null) {
            com.salesforce.marketingcloud.g.e(AnalyticsManager.TAG, "InAppMessage is null.  Call to onInAppMessageDownloaded() ignored.", new Object[0]);
            return;
        }
        com.salesforce.marketingcloud.analytics.etanalytics.a aVar = this.m;
        if (aVar != null) {
            aVar.b(inAppMessage);
        }
        com.salesforce.marketingcloud.analytics.etanalytics.b bVar = this.f63906l;
        if (bVar != null) {
            bVar.b(inAppMessage);
        }
        com.salesforce.marketingcloud.analytics.piwama.i iVar = this.f63907n;
        if (iVar != null) {
            iVar.b(inAppMessage);
        }
        com.salesforce.marketingcloud.analytics.stats.c cVar = this.f63908o;
        if (cVar != null) {
            cVar.b(inAppMessage);
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.AnalyticsManager
    public void trackPageView(@NonNull @Size(min = 1) String str, @Nullable String str2, @Nullable String str3) {
        trackPageView(str, str2, str3, null);
    }

    @Override // com.salesforce.marketingcloud.analytics.l
    public void a(@NonNull l.a aVar, @NonNull JSONObject jSONObject) {
        com.salesforce.marketingcloud.analytics.etanalytics.a aVar2 = this.m;
        if (aVar2 != null) {
            aVar2.a(aVar, jSONObject);
        }
        com.salesforce.marketingcloud.analytics.etanalytics.b bVar = this.f63906l;
        if (bVar != null) {
            bVar.a(aVar, jSONObject);
        }
        com.salesforce.marketingcloud.analytics.piwama.i iVar = this.f63907n;
        if (iVar != null) {
            iVar.a(aVar, jSONObject);
        }
        com.salesforce.marketingcloud.analytics.stats.c cVar = this.f63908o;
        if (cVar != null) {
            cVar.a(aVar, jSONObject);
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.j
    public void b(@NonNull NotificationMessage notificationMessage) {
        com.salesforce.marketingcloud.analytics.etanalytics.a aVar = this.m;
        if (aVar != null) {
            aVar.b(notificationMessage);
        }
        com.salesforce.marketingcloud.analytics.etanalytics.b bVar = this.f63906l;
        if (bVar != null) {
            bVar.b(notificationMessage);
        }
        com.salesforce.marketingcloud.analytics.piwama.i iVar = this.f63907n;
        if (iVar != null) {
            iVar.b(notificationMessage);
        }
        com.salesforce.marketingcloud.analytics.stats.c cVar = this.f63908o;
        if (cVar != null) {
            cVar.b(notificationMessage);
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.AnalyticsManager
    public void trackPageView(@NonNull @Size(min = 1) String str, String str2, String str3, String str4) {
        if (TextUtils.isEmpty(str)) {
            com.salesforce.marketingcloud.g.e(AnalyticsManager.TAG, "url may not be null or empty.  We could not complete your trackPageView() request.", new Object[0]);
            return;
        }
        com.salesforce.marketingcloud.analytics.etanalytics.a aVar = this.m;
        if (aVar != null) {
            aVar.trackPageView(str, str2, str3, str4);
        }
        com.salesforce.marketingcloud.analytics.etanalytics.b bVar = this.f63906l;
        if (bVar != null) {
            bVar.trackPageView(str, str2, str3, str4);
        }
        com.salesforce.marketingcloud.analytics.piwama.i iVar = this.f63907n;
        if (iVar != null) {
            iVar.trackPageView(str, str2, str3, str4);
        }
        com.salesforce.marketingcloud.analytics.stats.c cVar = this.f63908o;
        if (cVar != null) {
            cVar.trackPageView(str, str2, str3, str4);
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.f
    public void a(@NonNull InAppMessage inAppMessage) {
        if (inAppMessage == null) {
            com.salesforce.marketingcloud.g.e(AnalyticsManager.TAG, "InAppMessage is null.  Call to onIamDisplayed() ignored.", new Object[0]);
            return;
        }
        com.salesforce.marketingcloud.analytics.etanalytics.a aVar = this.m;
        if (aVar != null) {
            aVar.a(inAppMessage);
        }
        com.salesforce.marketingcloud.analytics.etanalytics.b bVar = this.f63906l;
        if (bVar != null) {
            bVar.a(inAppMessage);
        }
        com.salesforce.marketingcloud.analytics.piwama.i iVar = this.f63907n;
        if (iVar != null) {
            iVar.a(inAppMessage);
        }
        com.salesforce.marketingcloud.analytics.stats.c cVar = this.f63908o;
        if (cVar != null) {
            cVar.a(inAppMessage);
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.m
    public void b(@NonNull JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() <= 0) {
            com.salesforce.marketingcloud.g.e(AnalyticsManager.TAG, "Information not valid. Call to onInvalidConfigEvent() ignored", new Object[0]);
            return;
        }
        com.salesforce.marketingcloud.analytics.etanalytics.a aVar = this.m;
        if (aVar != null) {
            aVar.b(jSONObject);
        }
        com.salesforce.marketingcloud.analytics.etanalytics.b bVar = this.f63906l;
        if (bVar != null) {
            bVar.b(jSONObject);
        }
        com.salesforce.marketingcloud.analytics.piwama.i iVar = this.f63907n;
        if (iVar != null) {
            iVar.b(jSONObject);
        }
        com.salesforce.marketingcloud.analytics.stats.c cVar = this.f63908o;
        if (cVar != null) {
            cVar.b(jSONObject);
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.f
    public void a(@NonNull InAppMessage inAppMessage, @NonNull com.salesforce.marketingcloud.messages.iam.j jVar) {
        if (inAppMessage == null || jVar == null) {
            com.salesforce.marketingcloud.g.e(AnalyticsManager.TAG, "InAppMessage or MessageCompletedEvent is null.  Call to onInAppMessageCompleted() ignored.", new Object[0]);
            return;
        }
        com.salesforce.marketingcloud.analytics.etanalytics.a aVar = this.m;
        if (aVar != null) {
            aVar.a(inAppMessage, jVar);
        }
        com.salesforce.marketingcloud.analytics.etanalytics.b bVar = this.f63906l;
        if (bVar != null) {
            bVar.a(inAppMessage, jVar);
        }
        com.salesforce.marketingcloud.analytics.piwama.i iVar = this.f63907n;
        if (iVar != null) {
            iVar.a(inAppMessage, jVar);
        }
        com.salesforce.marketingcloud.analytics.stats.c cVar = this.f63908o;
        if (cVar != null) {
            cVar.a(inAppMessage, jVar);
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.f
    public void a(@NonNull InAppMessage inAppMessage, @NonNull JSONObject jSONObject) {
        if (inAppMessage == null || jSONObject == null || jSONObject.length() <= 0) {
            com.salesforce.marketingcloud.g.e(AnalyticsManager.TAG, "Message and/or Information not valid. Call to onInAppMessageThrottled() ignored", new Object[0]);
            return;
        }
        com.salesforce.marketingcloud.analytics.etanalytics.a aVar = this.m;
        if (aVar != null) {
            aVar.a(inAppMessage, jSONObject);
        }
        com.salesforce.marketingcloud.analytics.etanalytics.b bVar = this.f63906l;
        if (bVar != null) {
            bVar.a(inAppMessage, jSONObject);
        }
        com.salesforce.marketingcloud.analytics.piwama.i iVar = this.f63907n;
        if (iVar != null) {
            iVar.a(inAppMessage, jSONObject);
        }
        com.salesforce.marketingcloud.analytics.stats.c cVar = this.f63908o;
        if (cVar != null) {
            cVar.a(inAppMessage, jSONObject);
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.g
    public void a(@NonNull InboxMessage inboxMessage) {
        if (inboxMessage == null) {
            com.salesforce.marketingcloud.g.e(AnalyticsManager.TAG, "InboxMessage is null.  Call to onMessageDownloaded() ignored.", new Object[0]);
            return;
        }
        com.salesforce.marketingcloud.analytics.etanalytics.a aVar = this.m;
        if (aVar != null) {
            aVar.a(inboxMessage);
        }
        com.salesforce.marketingcloud.analytics.etanalytics.b bVar = this.f63906l;
        if (bVar != null) {
            bVar.a(inboxMessage);
        }
        com.salesforce.marketingcloud.analytics.piwama.i iVar = this.f63907n;
        if (iVar != null) {
            iVar.a(inboxMessage);
        }
        com.salesforce.marketingcloud.analytics.stats.c cVar = this.f63908o;
        if (cVar != null) {
            cVar.a(inboxMessage);
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.j
    public void a(@NonNull NotificationMessage notificationMessage) {
        com.salesforce.marketingcloud.analytics.etanalytics.a aVar = this.m;
        if (aVar != null) {
            aVar.a(notificationMessage);
        }
        com.salesforce.marketingcloud.analytics.etanalytics.b bVar = this.f63906l;
        if (bVar != null) {
            bVar.a(notificationMessage);
        }
        com.salesforce.marketingcloud.analytics.piwama.i iVar = this.f63907n;
        if (iVar != null) {
            iVar.a(notificationMessage);
        }
        com.salesforce.marketingcloud.analytics.stats.c cVar = this.f63908o;
        if (cVar != null) {
            cVar.a(notificationMessage);
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.j
    public void a(@NonNull NotificationMessage notificationMessage, boolean z10) {
        com.salesforce.marketingcloud.analytics.etanalytics.a aVar = this.m;
        if (aVar != null) {
            aVar.a(notificationMessage, z10);
        }
        com.salesforce.marketingcloud.analytics.etanalytics.b bVar = this.f63906l;
        if (bVar != null) {
            bVar.a(notificationMessage, z10);
        }
        com.salesforce.marketingcloud.analytics.piwama.i iVar = this.f63907n;
        if (iVar != null) {
            iVar.a(notificationMessage, z10);
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.m
    public void a(@NonNull String str, @NonNull String str2, @NonNull String str3, @Nullable String str4) {
        if (str == null || str2 == null || str3 == null) {
            com.salesforce.marketingcloud.g.e(AnalyticsManager.TAG, "triggerId, outcomeId or outcomeType is null.  Call to onTriggerSuccessEvent() ignored.", new Object[0]);
            return;
        }
        com.salesforce.marketingcloud.analytics.etanalytics.a aVar = this.m;
        if (aVar != null) {
            aVar.a(str, str2, str3, str4);
        }
        com.salesforce.marketingcloud.analytics.etanalytics.b bVar = this.f63906l;
        if (bVar != null) {
            bVar.a(str, str2, str3, str4);
        }
        com.salesforce.marketingcloud.analytics.piwama.i iVar = this.f63907n;
        if (iVar != null) {
            iVar.a(str, str2, str3, str4);
        }
        com.salesforce.marketingcloud.analytics.stats.c cVar = this.f63908o;
        if (cVar != null) {
            cVar.a(str, str2, str3, str4);
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.f
    public void a(@NonNull String str, @NonNull String str2, @NonNull List<String> list) {
        if (str == null || str2 == null || list == null || list.isEmpty()) {
            com.salesforce.marketingcloud.g.e(AnalyticsManager.TAG, "messageId, activityInstanceId or reasons is null.  Call to onInAppMessageValidationError() ignored.", new Object[0]);
            return;
        }
        com.salesforce.marketingcloud.analytics.etanalytics.a aVar = this.m;
        if (aVar != null) {
            aVar.a(str, str2, list);
        }
        com.salesforce.marketingcloud.analytics.etanalytics.b bVar = this.f63906l;
        if (bVar != null) {
            bVar.a(str, str2, list);
        }
        com.salesforce.marketingcloud.analytics.piwama.i iVar = this.f63907n;
        if (iVar != null) {
            iVar.a(str, str2, list);
        }
        com.salesforce.marketingcloud.analytics.stats.c cVar = this.f63908o;
        if (cVar != null) {
            cVar.a(str, str2, list);
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.m
    public void a(@NonNull JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() <= 0) {
            com.salesforce.marketingcloud.g.e(AnalyticsManager.TAG, "Information not valid. Call to onSyncGateTimeOutEvent() ignored", new Object[0]);
            return;
        }
        com.salesforce.marketingcloud.analytics.etanalytics.a aVar = this.m;
        if (aVar != null) {
            aVar.a(jSONObject);
        }
        com.salesforce.marketingcloud.analytics.etanalytics.b bVar = this.f63906l;
        if (bVar != null) {
            bVar.a(jSONObject);
        }
        com.salesforce.marketingcloud.analytics.piwama.i iVar = this.f63907n;
        if (iVar != null) {
            iVar.a(jSONObject);
        }
        com.salesforce.marketingcloud.analytics.stats.c cVar = this.f63908o;
        if (cVar != null) {
            cVar.a(jSONObject);
        }
    }

    @VisibleForTesting
    public boolean a(int i10, com.salesforce.marketingcloud.toggles.a aVar) {
        boolean z10 = false;
        if (com.salesforce.marketingcloud.b.a(i10, 256)) {
            return false;
        }
        this.f63910q = aVar;
        if (aVar == com.salesforce.marketingcloud.toggles.a.ENABLED || (this.f63903i.analyticsEnabled() && aVar == com.salesforce.marketingcloud.toggles.a.UNKNOWN)) {
            z10 = true;
        }
        if (z10) {
            this.f63906l = new com.salesforce.marketingcloud.analytics.etanalytics.b(this.f63900f, this.f63909p);
        }
        return z10;
    }
}
