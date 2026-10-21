package com.salesforce.marketingcloud.events;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.salesforce.marketingcloud.InitializationStatus;
import com.salesforce.marketingcloud.MarketingCloudSdk;
import com.salesforce.marketingcloud.analytics.l;
import com.salesforce.marketingcloud.analytics.m;
import com.salesforce.marketingcloud.analytics.n;
import com.salesforce.marketingcloud.k;
import com.salesforce.marketingcloud.messages.push.PushMessageManager;
import com.salesforce.marketingcloud.sfmcsdk.SFMCSdkComponents;
import com.salesforce.marketingcloud.sfmcsdk.components.events.EventSubscriber;
import com.salesforce.marketingcloud.sfmcsdk.components.identity.Identity;
import com.salesforce.marketingcloud.storage.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"UnknownNullness"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class c extends EventManager implements com.salesforce.marketingcloud.e, k.e, com.salesforce.marketingcloud.behaviors.b, EventSubscriber {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f64146r = "$opencount";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f64147s = "event_gate_time_mills";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f64148t = "event_max_display_in_session";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f64149u = "event_min_time_sec_in_session";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f64151w = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    final SFMCSdkComponents f64153d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final j f64154e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final k f64155f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.salesforce.marketingcloud.behaviors.c f64156g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.salesforce.marketingcloud.events.f f64157h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final l f64158i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected final m f64159j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final n f64160k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final com.salesforce.marketingcloud.internal.l f64161l;
    private final AtomicBoolean m = new AtomicBoolean(false);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected CountDownLatch f64162n = new CountDownLatch(1);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Context f64163o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private com.salesforce.marketingcloud.registration.f f64164p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected com.salesforce.marketingcloud.config.a f64165q;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    static final String f64150v = com.salesforce.marketingcloud.g.a("EventManager");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final EnumSet<k.d> f64152x = EnumSet.of(k.d.triggers);

    public class a extends com.salesforce.marketingcloud.internal.g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Event[] f64166b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Object[] objArr, Event... eventArr) {
            super(str, objArr);
            this.f64166b = eventArr;
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            int i10 = c.this.f64154e.f().getInt(c.f64147s, 0);
            if (i10 > 0) {
                try {
                    if (!c.this.f64162n.await(i10, TimeUnit.MILLISECONDS)) {
                        com.salesforce.marketingcloud.g.e(c.f64150v, "Track await time of %s milliseconds exceeded!", Integer.valueOf(i10));
                        c.this.f64162n.countDown();
                        if (c.this.f64165q.h()) {
                            c.this.f64159j.a(new JSONObject().put(com.salesforce.marketingcloud.config.a.f64106q, i10));
                        }
                    }
                } catch (InterruptedException e5) {
                    com.salesforce.marketingcloud.g.b(c.f64150v, e5, "Encountered exception while awaiting at track.", new Object[0]);
                } catch (JSONException e7) {
                    com.salesforce.marketingcloud.g.b(c.f64150v, e7, "Failed to log analytics for onSyncGateTimedOut", new Object[0]);
                }
            }
            Event[] eventArr = this.f64166b;
            ArrayList arrayList = null;
            if (eventArr != null && eventArr.length > 0) {
                for (Event event : eventArr) {
                    if (event != null) {
                        com.salesforce.marketingcloud.g.a(c.f64150v, "(%s) event logged with attributes %s", event.getName(), event.attributes());
                        c cVar = c.this;
                        List<com.salesforce.marketingcloud.events.e> listA = cVar.a(event, cVar.a(event));
                        if (listA != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.addAll(listA);
                        }
                    }
                }
            }
            if (arrayList != null) {
                c.this.a(arrayList);
            }
        }
    }

    public class b extends com.salesforce.marketingcloud.internal.g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Event[] f64168b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Object[] objArr, Event... eventArr) {
            super(str, objArr);
            this.f64168b = eventArr;
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            Event[] eventArr = this.f64168b;
            if (eventArr == null || eventArr.length <= 0) {
                return;
            }
            c cVar = c.this;
            SFMCSdkComponents sFMCSdkComponents = cVar.f64153d;
            if (sFMCSdkComponents != null) {
                sFMCSdkComponents.getEventManager().track(com.salesforce.marketingcloud.events.d.b(this.f64168b, EnumSet.of(com.salesforce.marketingcloud.sfmcsdk.components.events.Event.Producer.PUSH)));
            } else {
                cVar.a(eventArr);
            }
        }
    }

    /* JADX INFO: renamed from: com.salesforce.marketingcloud.events.c$c, reason: collision with other inner class name */
    public class C0248c extends ArrayList<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f64170a;

        public C0248c(h hVar) {
            this.f64170a = hVar;
            add(Integer.valueOf(c.this.f64154e.v().a(hVar)));
        }
    }

    public class d extends com.salesforce.marketingcloud.internal.g {
        public d(String str, Object... objArr) {
            super(str, objArr);
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            c.this.f64154e.v().c();
            c.this.a(new com.salesforce.marketingcloud.events.a());
        }
    }

    public class e extends com.salesforce.marketingcloud.internal.g {
        public e(String str, Object... objArr) {
            super(str, objArr);
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            com.salesforce.marketingcloud.g.c(c.f64150v, "Purged %d outdated debug/telemetry events.", Integer.valueOf(c.this.f64154e.n().a()));
        }
    }

    public static /* synthetic */ class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f64174a;

        static {
            int[] iArr = new int[g.b.values().length];
            f64174a = iArr;
            try {
                iArr[g.b.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f64174a[g.b.DOUBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f64174a[g.b.BOOL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f64174a[g.b.STRING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public c(Context context, com.salesforce.marketingcloud.registration.f fVar, j jVar, k kVar, com.salesforce.marketingcloud.behaviors.c cVar, com.salesforce.marketingcloud.analytics.h hVar, com.salesforce.marketingcloud.internal.l lVar, @Nullable SFMCSdkComponents sFMCSdkComponents, com.salesforce.marketingcloud.config.a aVar, com.salesforce.marketingcloud.events.f fVar2) {
        this.f64163o = context;
        this.f64164p = fVar;
        this.f64154e = jVar;
        this.f64155f = kVar;
        this.f64156g = cVar;
        this.f64159j = hVar;
        this.f64160k = hVar;
        this.f64157h = fVar2;
        this.f64161l = lVar;
        this.f64153d = sFMCSdkComponents;
        this.f64158i = hVar;
        this.f64165q = aVar;
    }

    @NonNull
    private com.salesforce.marketingcloud.events.predicates.f a(h hVar, Event event, @Nullable List<g> list) {
        ArrayList arrayList;
        if (list == null || list.size() == 0) {
            return com.salesforce.marketingcloud.events.predicates.f.f64212b;
        }
        Map<String, List<Object>> mapA = com.salesforce.marketingcloud.events.d.a(event);
        Map<String, List<Object>> mapA2 = a(hVar);
        mapA2.putAll(mapA);
        String strG = hVar.g();
        if (strG != null) {
            HashMap map = new HashMap(list.size());
            for (g gVar : list) {
                map.put(Integer.valueOf(gVar.f()), gVar);
            }
            arrayList = new ArrayList(map.size());
            for (String str : strG.split(strG.contains("||") ? "\\|\\|" : "&&")) {
                arrayList.add(a(mapA2, (g) map.get(Integer.valueOf(Integer.parseInt(str)))));
            }
        } else {
            ArrayList arrayList2 = new ArrayList(list.size());
            Iterator<g> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(a(mapA2, it.next()));
            }
            arrayList = arrayList2;
        }
        return (strG == null || !strG.contains("||")) ? new com.salesforce.marketingcloud.events.predicates.a((com.salesforce.marketingcloud.events.predicates.f[]) arrayList.toArray(new com.salesforce.marketingcloud.events.predicates.f[0])) : new com.salesforce.marketingcloud.events.predicates.e((com.salesforce.marketingcloud.events.predicates.f[]) arrayList.toArray(new com.salesforce.marketingcloud.events.predicates.f[0]));
    }

    private void b() {
        SFMCSdkComponents sFMCSdkComponents = this.f64153d;
        if (sFMCSdkComponents != null) {
            sFMCSdkComponents.getEventManager().unsubscribe(this);
        }
    }

    @Override // com.salesforce.marketingcloud.d
    @NonNull
    public String componentName() {
        return "Event";
    }

    @Override // com.salesforce.marketingcloud.d
    @Nullable
    public JSONObject componentState() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(com.salesforce.marketingcloud.storage.db.m.f65058g, this.f64154e.v().n());
        } catch (Exception e5) {
            com.salesforce.marketingcloud.g.b(f64150v, e5, "Unable to compile componentState for EventComponent", new Object[0]);
        }
        return jSONObject;
    }

    @Override // com.salesforce.marketingcloud.e
    public void controlChannelInit(int i10) {
        if (!com.salesforce.marketingcloud.b.a(i10, 4096)) {
            this.f64155f.a(f64152x, this);
            this.f64156g.a(this, EnumSet.of(com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_APP_FOREGROUNDED));
            a();
            this.m.set(false);
            return;
        }
        this.m.set(true);
        this.f64155f.a(f64152x, (k.e) null);
        this.f64156g.a(this);
        if (com.salesforce.marketingcloud.b.c(i10, 4096)) {
            this.f64154e.v().b(Collections.emptyList());
        }
        b();
    }

    @Override // com.salesforce.marketingcloud.e
    public void init(@NonNull InitializationStatus.a aVar, int i10) {
        if (!com.salesforce.marketingcloud.b.b(i10, 4096)) {
            b();
            this.m.set(true);
        } else {
            this.f64155f.a(f64152x, this);
            this.f64156g.a(this, EnumSet.of(com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_APP_FOREGROUNDED));
            a();
        }
    }

    @Override // com.salesforce.marketingcloud.behaviors.b
    public void onBehavior(@NonNull com.salesforce.marketingcloud.behaviors.a aVar, @NonNull Bundle bundle) {
        if (this.m.get() || aVar != com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_APP_FOREGROUNDED) {
            return;
        }
        if (this.f64162n.getCount() <= 0) {
            this.f64162n = new CountDownLatch(1);
        }
        try {
            this.f64161l.b().execute(new d("app_foreground_trigger", new Object[0]));
            this.f64161l.b().execute(new e("dev_stats_db_cleanup", new Object[0]));
        } catch (Exception e5) {
            com.salesforce.marketingcloud.g.e(f64150v, e5, "An error occurred while triggering app foreground", new Object[0]);
        }
    }

    @Override // com.salesforce.marketingcloud.sfmcsdk.components.events.EventSubscriber
    @WorkerThread
    public void onEventPublished(@NonNull com.salesforce.marketingcloud.sfmcsdk.components.events.Event... eventArr) {
        try {
            SFMCSdkComponents sFMCSdkComponents = this.f64153d;
            PushMessageManager pushMessageManager = null;
            Identity identity = sFMCSdkComponents != null ? sFMCSdkComponents.getIdentity() : null;
            try {
                MarketingCloudSdk marketingCloudSdk = MarketingCloudSdk.getInstance();
                if (marketingCloudSdk != null) {
                    pushMessageManager = marketingCloudSdk.getPushMessageManager();
                }
            } catch (Exception unused) {
            }
            a(com.salesforce.marketingcloud.events.d.a((Object[]) eventArr));
            this.f64160k.a(new com.salesforce.marketingcloud.analytics.e(this.f64164p, pushMessageManager, com.salesforce.marketingcloud.util.h.b(this.f64163o), identity), eventArr);
        } catch (Exception e5) {
            com.salesforce.marketingcloud.g.b(f64150v, e5, "Could not process events from onEventPublished()", new Object[0]);
        }
    }

    @Override // com.salesforce.marketingcloud.k.e
    @WorkerThread
    public void onSyncReceived(@NonNull k.d dVar, @NonNull JSONObject jSONObject) {
        if (this.m.get() || !f64152x.contains(dVar)) {
            return;
        }
        if (jSONObject.optInt("version") != 1) {
            com.salesforce.marketingcloud.g.b(f64150v, "Unable to handle sync payload due to version mismatch", new Object[0]);
        } else if (dVar == k.d.triggers) {
            a(jSONObject);
        }
    }

    @Override // com.salesforce.marketingcloud.d
    public void tearDown(boolean z10) {
        this.f64155f.a(f64152x, (k.e) null);
        this.f64156g.a(this);
        b();
    }

    @Override // com.salesforce.marketingcloud.events.EventManager
    public void track(Event... eventArr) {
        if (this.m.get()) {
            return;
        }
        try {
            this.f64161l.b().execute(new b("trigger_event", new Object[0], eventArr));
        } catch (Exception e5) {
            com.salesforce.marketingcloud.g.e(f64150v, e5, "An error occurred while triggering track event", new Object[0]);
        }
    }

    @VisibleForTesting
    public c(Context context, com.salesforce.marketingcloud.registration.f fVar, j jVar, k kVar, com.salesforce.marketingcloud.behaviors.c cVar, m mVar, n nVar, com.salesforce.marketingcloud.internal.l lVar, @Nullable SFMCSdkComponents sFMCSdkComponents, com.salesforce.marketingcloud.events.f fVar2, com.salesforce.marketingcloud.config.a aVar, l lVar2) {
        this.f64163o = context;
        this.f64164p = fVar;
        this.f64154e = jVar;
        this.f64155f = kVar;
        this.f64156g = cVar;
        this.f64159j = mVar;
        this.f64160k = nVar;
        this.f64157h = fVar2;
        this.f64161l = lVar;
        this.f64153d = sFMCSdkComponents;
        this.f64158i = lVar2;
        this.f64165q = aVar;
    }

    private com.salesforce.marketingcloud.events.predicates.f a(Object obj, g gVar) {
        int i10 = f.f64174a[gVar.j().ordinal()];
        if (i10 == 1) {
            return new com.salesforce.marketingcloud.events.predicates.d(obj, gVar.h(), gVar.i());
        }
        if (i10 == 2) {
            return new com.salesforce.marketingcloud.events.predicates.c(obj, gVar.h(), gVar.i());
        }
        if (i10 != 3) {
            return i10 != 4 ? com.salesforce.marketingcloud.events.predicates.f.f64213c : new com.salesforce.marketingcloud.events.predicates.g(obj, gVar.h(), gVar.i());
        }
        return new com.salesforce.marketingcloud.events.predicates.b(obj, gVar.h(), gVar.i());
    }

    private com.salesforce.marketingcloud.events.predicates.f a(Map<String, List<Object>> map, @Nullable g gVar) {
        int i10;
        if (gVar == null) {
            return com.salesforce.marketingcloud.events.predicates.f.f64213c;
        }
        ArrayList arrayList = new ArrayList();
        List<Object> list = map.get(gVar.g().toLowerCase(Locale.getDefault()));
        if (list != null) {
            i10 = 0;
            for (Object obj : list) {
                if (obj instanceof List) {
                    try {
                        Iterator it = ((List) obj).iterator();
                        while (it.hasNext()) {
                            arrayList.add(a(it.next(), gVar));
                            i10++;
                        }
                    } catch (Exception unused) {
                    }
                } else {
                    arrayList.add(a(obj, gVar));
                    i10++;
                }
            }
        } else {
            i10 = 0;
        }
        if (i10 > 1) {
            return new com.salesforce.marketingcloud.events.predicates.e((com.salesforce.marketingcloud.events.predicates.f[]) arrayList.toArray(new com.salesforce.marketingcloud.events.predicates.f[0]));
        }
        return i10 == 1 ? new com.salesforce.marketingcloud.events.predicates.a((com.salesforce.marketingcloud.events.predicates.f[]) arrayList.toArray(new com.salesforce.marketingcloud.events.predicates.f[0])) : com.salesforce.marketingcloud.events.predicates.f.f64213c;
    }

    @Nullable
    @VisibleForTesting
    public List<h> a(Event event) {
        return this.f64154e.v().c(event.getName());
    }

    public List<com.salesforce.marketingcloud.events.e> a(Event event, @Nullable List<h> list) {
        ArrayList arrayList = null;
        if (list != null && list.size() != 0) {
            try {
                for (h hVar : list) {
                    if (a(hVar, event, hVar.k()).b()) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        for (com.salesforce.marketingcloud.events.e eVar : hVar.j()) {
                            arrayList.add(eVar);
                            try {
                                this.f64159j.a(hVar.h(), eVar.e(), eVar.f(), eVar.d());
                            } catch (Exception e5) {
                                com.salesforce.marketingcloud.g.b(f64150v, e5, "Failed to log analytics for trigger [%s]", hVar.h());
                            }
                        }
                    }
                }
            } catch (IllegalArgumentException e7) {
                com.salesforce.marketingcloud.g.b(f64150v, e7, "An outcome could not be reached with the given trigger(s) for the event.", new Object[0]);
            }
        }
        return arrayList;
    }

    @NonNull
    private Map<String, List<Object>> a(h hVar) {
        HashMap map = new HashMap();
        map.put(f64146r, new C0248c(hVar));
        return map;
    }

    private void a() {
        SFMCSdkComponents sFMCSdkComponents = this.f64153d;
        if (sFMCSdkComponents != null) {
            sFMCSdkComponents.getEventManager().subscribe(this);
        }
    }

    @VisibleForTesting
    public void a(List<com.salesforce.marketingcloud.events.e> list) {
        com.salesforce.marketingcloud.events.f fVar;
        TreeSet treeSet = null;
        for (com.salesforce.marketingcloud.events.e eVar : list) {
            if ("iam".equals(eVar.f())) {
                if (treeSet == null) {
                    treeSet = new TreeSet();
                }
                treeSet.add(eVar.e());
            }
        }
        if (treeSet == null || (fVar = this.f64157h) == null) {
            return;
        }
        fVar.handleOutcomes(treeSet);
    }

    private void a(JSONObject jSONObject) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray(FirebaseAnalytics.Param.ITEMS);
            int length = jSONArray.length();
            com.salesforce.marketingcloud.g.a(f64150v, "%d triggers received from sync.", Integer.valueOf(length));
            TreeSet treeSet = new TreeSet();
            com.salesforce.marketingcloud.storage.n nVarV = this.f64154e.v();
            for (int i10 = 0; i10 < length; i10++) {
                try {
                    h hVar = new h(jSONArray.getJSONObject(i10));
                    nVarV.b(hVar);
                    treeSet.add(hVar.h());
                } catch (Exception e5) {
                    com.salesforce.marketingcloud.g.b(f64150v, e5, "Unable to parse trigger from payload", new Object[0]);
                }
            }
            nVarV.b(treeSet);
            JSONObject jSONObject2 = new JSONObject();
            l.a aVar = l.a.TRIGGER_PROCESS;
            jSONObject2.put(aVar.b(), System.currentTimeMillis() - jCurrentTimeMillis);
            if (this.f64165q.l()) {
                this.f64158i.a(aVar, jSONObject2);
            }
        } catch (JSONException e7) {
            com.salesforce.marketingcloud.g.b(f64150v, e7, "Unable to parse trigger sync payload", new Object[0]);
        }
        this.f64162n.countDown();
    }

    public void a(Event... eventArr) {
        if (this.m.get()) {
            return;
        }
        try {
            this.f64161l.b().execute(new a("trigger_event", new Object[0], eventArr));
        } catch (Exception e5) {
            com.salesforce.marketingcloud.g.e(f64150v, e5, "An error occurred while processing the event", new Object[0]);
        }
    }
}
