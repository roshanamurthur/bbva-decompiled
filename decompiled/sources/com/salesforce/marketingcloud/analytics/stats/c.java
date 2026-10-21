package com.salesforce.marketingcloud.analytics.stats;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArrayMap;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.salesforce.marketingcloud.MarketingCloudConfig;
import com.salesforce.marketingcloud.analytics.i;
import com.salesforce.marketingcloud.internal.l;
import com.salesforce.marketingcloud.messages.iam.InAppMessage;
import com.salesforce.marketingcloud.sfmcsdk.components.events.Event;
import com.salesforce.marketingcloud.storage.db.k;
import com.salesforce.marketingcloud.storage.j;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class c extends i implements com.salesforce.marketingcloud.http.c.InterfaceC0253c, com.salesforce.marketingcloud.alarms.b.InterfaceC0239b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final String f63986k = com.salesforce.marketingcloud.g.a("DeviceStats");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f63987l = 1000;
    private static final int m = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final String f63988d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final j f63989e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final com.salesforce.marketingcloud.http.c f63990f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final MarketingCloudConfig f63991g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final com.salesforce.marketingcloud.alarms.b f63992h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final l f63993i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @VisibleForTesting
    public final boolean f63994j;

    public class a extends com.salesforce.marketingcloud.internal.g {
        public a(String str, Object... objArr) {
            super(str, objArr);
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            com.salesforce.marketingcloud.storage.d dVarN = c.this.f63989e.n();
            com.salesforce.marketingcloud.util.c cVarB = c.this.f63989e.b();
            List<com.salesforce.marketingcloud.analytics.stats.b> listO = dVarN.o(cVarB);
            if (!listO.isEmpty()) {
                Date date = new Date();
                for (com.salesforce.marketingcloud.analytics.stats.b bVar : listO) {
                    try {
                        bVar.a(date);
                        dVarN.a(bVar, cVarB);
                    } catch (Exception e5) {
                        com.salesforce.marketingcloud.g.b(c.f63986k, e5, "Unable to update sync event analytic [%s]", Integer.valueOf(bVar.d()));
                    }
                }
            }
            com.salesforce.marketingcloud.g.c(c.f63986k, "Handling app close and sending stats.", new Object[0]);
        }
    }

    public class b extends com.salesforce.marketingcloud.internal.g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InAppMessage f63996b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ JSONObject f63997c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Object[] objArr, InAppMessage inAppMessage, JSONObject jSONObject) {
            super(str, objArr);
            this.f63996b = inAppMessage;
            this.f63997c = jSONObject;
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            if (com.salesforce.marketingcloud.config.a.e() == null || com.salesforce.marketingcloud.config.a.e().h()) {
                com.salesforce.marketingcloud.g.c(c.f63986k, "InAppMessage throttled event stat for message id %s", this.f63996b.id());
                Date date = new Date();
                try {
                    c.this.f63993i.b().execute(new com.salesforce.marketingcloud.analytics.stats.a(c.this.f63989e.n(), c.this.f63989e.b(), com.salesforce.marketingcloud.analytics.stats.b.a(106, date, com.salesforce.marketingcloud.analytics.stats.d.a(c.this.f63991g.applicationId(), c.this.f63988d, date, this.f63996b.id(), com.salesforce.marketingcloud.internal.a.a(this.f63996b), this.f63997c), true)));
                } catch (JSONException e5) {
                    com.salesforce.marketingcloud.g.b(c.f63986k, e5, "Failed to record iam throttled event stat.", new Object[0]);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.salesforce.marketingcloud.analytics.stats.c$c, reason: collision with other inner class name */
    public class C0243c extends com.salesforce.marketingcloud.internal.g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONObject f63999b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0243c(String str, Object[] objArr, JSONObject jSONObject) {
            super(str, objArr);
            this.f63999b = jSONObject;
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            if (com.salesforce.marketingcloud.config.a.e() == null || com.salesforce.marketingcloud.config.a.e().h()) {
                try {
                    Date date = new Date();
                    c.this.f63993i.b().execute(new com.salesforce.marketingcloud.analytics.stats.a(c.this.f63989e.n(), c.this.f63989e.b(), com.salesforce.marketingcloud.analytics.stats.b.a(106, date, com.salesforce.marketingcloud.analytics.stats.d.a(c.this.f63991g.applicationId(), c.this.f63988d, date, (String) null, (String) null, this.f63999b), true)));
                } catch (Exception e5) {
                    com.salesforce.marketingcloud.g.b(c.f63986k, e5, "Failed to record syncGateTimeOut Event stat.", new Object[0]);
                }
            }
        }
    }

    public class d extends com.salesforce.marketingcloud.internal.g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONObject f64001b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, Object[] objArr, JSONObject jSONObject) {
            super(str, objArr);
            this.f64001b = jSONObject;
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            if (com.salesforce.marketingcloud.config.a.e() == null || com.salesforce.marketingcloud.config.a.e().h()) {
                try {
                    Date date = new Date();
                    c.this.f63993i.b().execute(new com.salesforce.marketingcloud.analytics.stats.a(c.this.f63989e.n(), c.this.f63989e.b(), com.salesforce.marketingcloud.analytics.stats.b.a(106, date, com.salesforce.marketingcloud.analytics.stats.d.a(c.this.f63991g.applicationId(), c.this.f63988d, date, (String) null, (String) null, this.f64001b), true)));
                } catch (JSONException e5) {
                    com.salesforce.marketingcloud.g.b(c.f63986k, e5, "Failed to record onInvalidConfig Event stat.", new Object[0]);
                }
            }
        }
    }

    public class e extends com.salesforce.marketingcloud.internal.g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONObject f64003b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.salesforce.marketingcloud.analytics.l.a f64004c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, Object[] objArr, JSONObject jSONObject, com.salesforce.marketingcloud.analytics.l.a aVar) {
            super(str, objArr);
            this.f64003b = jSONObject;
            this.f64004c = aVar;
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            try {
                if (com.salesforce.marketingcloud.config.a.e() == null || com.salesforce.marketingcloud.config.a.e().l()) {
                    Date date = new Date();
                    c.this.f63993i.b().execute(new com.salesforce.marketingcloud.analytics.stats.a(c.this.f63989e.n(), c.this.f63989e.b(), com.salesforce.marketingcloud.analytics.stats.b.a(107, date, com.salesforce.marketingcloud.analytics.stats.d.a(c.this.f63991g.applicationId(), c.this.f63988d, date, this.f64003b), true)));
                }
            } catch (Exception e5) {
                com.salesforce.marketingcloud.g.b(c.f63986k, e5, "Failed to record onTelemetryEvent stat. %s", this.f64004c.name());
            }
        }
    }

    public class f extends com.salesforce.marketingcloud.internal.g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Event[] f64006b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Date f64007c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.salesforce.marketingcloud.analytics.e f64008d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, Object[] objArr, Event[] eventArr, Date date, com.salesforce.marketingcloud.analytics.e eVar) {
            super(str, objArr);
            this.f64006b = eventArr;
            this.f64007c = date;
            this.f64008d = eVar;
        }

        /* JADX WARN: Code duplicated, block: B:40:0x0085 A[Catch: Exception -> 0x0048, PHI: r6 r7 r8 r9
          0x0085: PHI (r6v5 java.lang.Boolean) = 
          (r6v3 java.lang.Boolean)
          (r6v1 java.lang.Boolean)
          (r6v1 java.lang.Boolean)
          (r6v1 java.lang.Boolean)
          (r6v1 java.lang.Boolean)
         binds: [B:38:0x0082, B:33:0x0071, B:28:0x0060, B:23:0x004f, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]
          0x0085: PHI (r7v3 java.lang.Boolean) = 
          (r7v1 java.lang.Boolean)
          (r7v4 java.lang.Boolean)
          (r7v1 java.lang.Boolean)
          (r7v1 java.lang.Boolean)
          (r7v1 java.lang.Boolean)
         binds: [B:38:0x0082, B:33:0x0071, B:28:0x0060, B:23:0x004f, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]
          0x0085: PHI (r8v3 java.lang.Boolean) = 
          (r8v1 java.lang.Boolean)
          (r8v1 java.lang.Boolean)
          (r8v4 java.lang.Boolean)
          (r8v1 java.lang.Boolean)
          (r8v1 java.lang.Boolean)
         binds: [B:38:0x0082, B:33:0x0071, B:28:0x0060, B:23:0x004f, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]
          0x0085: PHI (r9v3 java.lang.Boolean) = 
          (r9v1 java.lang.Boolean)
          (r9v1 java.lang.Boolean)
          (r9v1 java.lang.Boolean)
          (r9v4 java.lang.Boolean)
          (r9v1 java.lang.Boolean)
         binds: [B:38:0x0082, B:33:0x0071, B:28:0x0060, B:23:0x004f, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {Exception -> 0x0048, blocks: (B:8:0x0018, B:11:0x0025, B:40:0x0085, B:19:0x003f, B:22:0x004b, B:26:0x0054, B:27:0x005c, B:31:0x0065, B:32:0x006d, B:36:0x0076, B:37:0x007e), top: B:45:0x0018 }] */
        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            char c10;
            f fVar = this;
            com.salesforce.marketingcloud.config.a aVarE = com.salesforce.marketingcloud.config.a.e();
            if (aVarE == null) {
                return;
            }
            Event[] eventArr = fVar.f64006b;
            int length = eventArr.length;
            char c11 = 0;
            Boolean boolValueOf = null;
            Boolean boolValueOf2 = null;
            Boolean boolValueOf3 = null;
            Boolean boolValueOf4 = null;
            int i10 = 0;
            while (i10 < length) {
                Event event = eventArr[i10];
                try {
                    if (aVarE.b(event.getName())) {
                        int i11 = h.f64012a[event.getCategory().ordinal()];
                        if (i11 == 1) {
                            if (boolValueOf == null) {
                                boolValueOf = Boolean.valueOf(aVarE.g());
                            }
                            if (boolValueOf.booleanValue()) {
                                String str = c.f63986k;
                                Object[] objArr = new Object[3];
                                objArr[c11] = event.getClass().getSimpleName();
                                objArr[1] = event.getName();
                                objArr[2] = event.attributes();
                                com.salesforce.marketingcloud.g.c(str, "Event tracked %s( %s ) with Attributes: %s", objArr);
                                c.this.f63993i.b().execute(new com.salesforce.marketingcloud.analytics.stats.a(c.this.f63989e.n(), c.this.f63989e.b(), com.salesforce.marketingcloud.analytics.stats.b.a(105, fVar.f64007c, com.salesforce.marketingcloud.analytics.stats.d.a(c.this.f63991g.applicationId(), c.this.f63988d, fVar.f64007c, event.getName(), event.id, event.toJson().getJSONObject(k.a.f65041h), fVar.f64008d.e(), aVarE.a(event.getName())), true)));
                                c10 = 0;
                            } else {
                                c10 = c11;
                            }
                        } else if (i11 == 2) {
                            if (boolValueOf2 == null) {
                                boolValueOf2 = Boolean.valueOf(aVarE.i());
                            }
                            if (boolValueOf2.booleanValue()) {
                                String str2 = c.f63986k;
                                Object[] objArr2 = new Object[3];
                                objArr2[c11] = event.getClass().getSimpleName();
                                objArr2[1] = event.getName();
                                objArr2[2] = event.attributes();
                                com.salesforce.marketingcloud.g.c(str2, "Event tracked %s( %s ) with Attributes: %s", objArr2);
                                c.this.f63993i.b().execute(new com.salesforce.marketingcloud.analytics.stats.a(c.this.f63989e.n(), c.this.f63989e.b(), com.salesforce.marketingcloud.analytics.stats.b.a(105, fVar.f64007c, com.salesforce.marketingcloud.analytics.stats.d.a(c.this.f63991g.applicationId(), c.this.f63988d, fVar.f64007c, event.getName(), event.id, event.toJson().getJSONObject(k.a.f65041h), fVar.f64008d.e(), aVarE.a(event.getName())), true)));
                                c10 = 0;
                            } else {
                                c10 = c11;
                            }
                        } else if (i11 != 3) {
                            if (i11 == 4) {
                                if (boolValueOf4 == null) {
                                    boolValueOf4 = Boolean.valueOf(aVarE.k());
                                }
                                if (!boolValueOf4.booleanValue()) {
                                    c10 = c11;
                                }
                            }
                            String str3 = c.f63986k;
                            Object[] objArr3 = new Object[3];
                            objArr3[c11] = event.getClass().getSimpleName();
                            objArr3[1] = event.getName();
                            objArr3[2] = event.attributes();
                            com.salesforce.marketingcloud.g.c(str3, "Event tracked %s( %s ) with Attributes: %s", objArr3);
                            c.this.f63993i.b().execute(new com.salesforce.marketingcloud.analytics.stats.a(c.this.f63989e.n(), c.this.f63989e.b(), com.salesforce.marketingcloud.analytics.stats.b.a(105, fVar.f64007c, com.salesforce.marketingcloud.analytics.stats.d.a(c.this.f63991g.applicationId(), c.this.f63988d, fVar.f64007c, event.getName(), event.id, event.toJson().getJSONObject(k.a.f65041h), fVar.f64008d.e(), aVarE.a(event.getName())), true)));
                            c10 = 0;
                        } else {
                            if (boolValueOf3 == null) {
                                boolValueOf3 = Boolean.valueOf(aVarE.j());
                            }
                            if (boolValueOf3.booleanValue()) {
                                String str4 = c.f63986k;
                                Object[] objArr4 = new Object[3];
                                objArr4[c11] = event.getClass().getSimpleName();
                                objArr4[1] = event.getName();
                                objArr4[2] = event.attributes();
                                com.salesforce.marketingcloud.g.c(str4, "Event tracked %s( %s ) with Attributes: %s", objArr4);
                                c.this.f63993i.b().execute(new com.salesforce.marketingcloud.analytics.stats.a(c.this.f63989e.n(), c.this.f63989e.b(), com.salesforce.marketingcloud.analytics.stats.b.a(105, fVar.f64007c, com.salesforce.marketingcloud.analytics.stats.d.a(c.this.f63991g.applicationId(), c.this.f63988d, fVar.f64007c, event.getName(), event.id, event.toJson().getJSONObject(k.a.f65041h), fVar.f64008d.e(), aVarE.a(event.getName())), true)));
                                c10 = 0;
                            } else {
                                c10 = c11;
                            }
                        }
                    } else {
                        c10 = c11;
                    }
                } catch (Exception e5) {
                    c10 = 0;
                    com.salesforce.marketingcloud.g.b(c.f63986k, "Failed to record event in devstats", e5);
                }
                i10++;
                fVar = this;
                c11 = c10;
            }
        }
    }

    public class g extends com.salesforce.marketingcloud.internal.g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.salesforce.marketingcloud.http.a f64010b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, Object[] objArr, com.salesforce.marketingcloud.http.a aVar) {
            super(str, objArr);
            this.f64010b = aVar;
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            com.salesforce.marketingcloud.http.a aVar = this.f64010b;
            com.salesforce.marketingcloud.http.a aVar2 = com.salesforce.marketingcloud.http.a.f64263r;
            if (aVar == aVar2 && !com.salesforce.marketingcloud.http.a.a(c.this.f63989e)) {
                c.this.f63992h.d(com.salesforce.marketingcloud.alarms.a.b.f63810j);
                return;
            }
            com.salesforce.marketingcloud.http.a aVar3 = this.f64010b;
            com.salesforce.marketingcloud.http.a aVar4 = com.salesforce.marketingcloud.http.a.f64262q;
            List<com.salesforce.marketingcloud.analytics.stats.b> listP = aVar3 == aVar4 ? c.this.f63989e.n().p(c.this.f63989e.b()) : c.this.f63989e.n().i(c.this.f63989e.b());
            if (listP.isEmpty()) {
                com.salesforce.marketingcloud.http.a aVar5 = this.f64010b;
                if (aVar5 == aVar4) {
                    c.this.f63992h.d(com.salesforce.marketingcloud.alarms.a.b.f63809i);
                    return;
                } else {
                    if (aVar5 == aVar2) {
                        c.this.f63992h.d(com.salesforce.marketingcloud.alarms.a.b.f63810j);
                        return;
                    }
                    return;
                }
            }
            com.salesforce.marketingcloud.g.c(c.f63986k, "Preparing payload for device statistics.", new Object[0]);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("applicationId", c.this.f63991g.applicationId());
                jSONObject.put("deviceId", c.this.f63988d);
                JSONArray jSONArray = new JSONArray();
                JSONObject jSONObject2 = new JSONObject();
                jSONArray.put(jSONObject2);
                jSONObject.put("nodes", jSONArray);
                jSONObject2.put("version", 1);
                jSONObject2.put("name", "event");
                Integer numE = 1000;
                String strF = null;
                if (this.f64010b == aVar2) {
                    com.salesforce.marketingcloud.config.b bVarA = com.salesforce.marketingcloud.config.a.e() != null ? com.salesforce.marketingcloud.config.a.e().a(c.this.f63989e, com.salesforce.marketingcloud.config.b.EnumC0247b.EVENTS.name()) : null;
                    if (bVarA != null) {
                        strF = bVarA.f();
                        if (bVarA.e() != null) {
                            numE = bVarA.e();
                        }
                    }
                }
                for (Map.Entry<String, JSONArray> entry : c.this.a(listP, numE.intValue()).entrySet()) {
                    jSONObject2.put(FirebaseAnalytics.Param.ITEMS, entry.getValue());
                    com.salesforce.marketingcloud.http.a aVar6 = this.f64010b;
                    c cVar = c.this;
                    com.salesforce.marketingcloud.http.b bVarA2 = aVar6.a(cVar.f63991g, cVar.f63989e.c(), jSONObject.toString(), strF);
                    bVarA2.a(entry.getKey());
                    c.this.f63990f.a(bVarA2);
                }
            } catch (Exception e5) {
                com.salesforce.marketingcloud.g.b(c.f63986k, e5, "Failed to start sync events request.", new Object[0]);
            }
        }
    }

    public static /* synthetic */ class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f64012a;

        static {
            int[] iArr = new int[Event.Category.values().length];
            f64012a = iArr;
            try {
                iArr[Event.Category.APPLICATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f64012a[Event.Category.ENGAGEMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f64012a[Event.Category.IDENTITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f64012a[Event.Category.SYSTEM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public c(@NonNull MarketingCloudConfig marketingCloudConfig, @NonNull String str, boolean z10, @NonNull j jVar, @NonNull com.salesforce.marketingcloud.http.c cVar, @NonNull com.salesforce.marketingcloud.alarms.b bVar, @NonNull l lVar) {
        this.f63991g = marketingCloudConfig;
        this.f63988d = str;
        this.f63994j = z10;
        this.f63989e = jVar;
        this.f63990f = cVar;
        this.f63992h = bVar;
        this.f63993i = lVar;
        cVar.a(com.salesforce.marketingcloud.http.a.f64262q, this);
        cVar.a(com.salesforce.marketingcloud.http.a.f64263r, this);
        bVar.a(this, com.salesforce.marketingcloud.alarms.a.b.f63809i, com.salesforce.marketingcloud.alarms.a.b.f63810j);
    }

    public Map<String, JSONArray> a(List<com.salesforce.marketingcloud.analytics.stats.b> list, int i10) {
        boolean z10;
        int size = list.size();
        int iCeil = (int) Math.ceil(((double) size) / ((double) i10));
        ArrayMap arrayMap = new ArrayMap(iCeil);
        for (int i11 = 0; i11 < iCeil; i11++) {
            StringBuilder sb2 = new StringBuilder();
            JSONArray jSONArray = new JSONArray();
            int i12 = i11 * i10;
            boolean z11 = true;
            int i13 = i12;
            while (i13 < size && i13 < i12 + i10) {
                com.salesforce.marketingcloud.analytics.stats.b bVar = list.get(i13);
                if (z11) {
                    z10 = false;
                } else {
                    sb2.append(AbstractJsonLexerKt.COMMA);
                    z10 = z11;
                }
                sb2.append(bVar.b());
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("eventType", bVar.d());
                    jSONObject.put("event", bVar.c().f64013a);
                    jSONArray.put(jSONObject);
                } catch (JSONException e5) {
                    com.salesforce.marketingcloud.g.b(f63986k, e5, "Unable to add device stats to payload.", new Object[0]);
                }
                i13++;
                z11 = z10;
            }
            arrayMap.put(sb2.toString(), jSONArray);
        }
        return arrayMap;
    }

    @Override // com.salesforce.marketingcloud.analytics.i, com.salesforce.marketingcloud.analytics.f
    public void b(@NonNull InAppMessage inAppMessage) {
        if (!this.f63994j) {
            com.salesforce.marketingcloud.g.a(f63986k, "Track user is false.  Ignoring onInAppMessageDownloaded event.", new Object[0]);
            return;
        }
        try {
            com.salesforce.marketingcloud.g.c(f63986k, "Creating download event stat for message id %s", inAppMessage.id());
            Date date = new Date();
            this.f63993i.b().execute(new com.salesforce.marketingcloud.analytics.stats.a(this.f63989e.n(), this.f63989e.b(), com.salesforce.marketingcloud.analytics.stats.b.a(101, date, com.salesforce.marketingcloud.analytics.stats.d.b(this.f63991g.applicationId(), this.f63988d, date, inAppMessage.id(), com.salesforce.marketingcloud.internal.a.a(inAppMessage)), true)));
        } catch (Exception e5) {
            com.salesforce.marketingcloud.g.b(f63986k, e5, "Failed to record analytic event for In App Message Downloaded", new Object[0]);
        }
    }

    public void a() {
        a(com.salesforce.marketingcloud.http.a.f64262q);
        a(com.salesforce.marketingcloud.http.a.f64263r);
    }

    @Override // com.salesforce.marketingcloud.analytics.i, com.salesforce.marketingcloud.analytics.m
    public void b(@NonNull JSONObject jSONObject) {
        try {
            this.f63993i.b().execute(new d("onInvalidConfigEvent", new Object[0], jSONObject));
        } catch (Exception e5) {
            com.salesforce.marketingcloud.g.b(f63986k, e5, "Failed to track onInvalidConfig Event stat.", new Object[0]);
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.i
    public void a(long j10) {
        this.f63993i.b().execute(new a("stats_app_close", new Object[0]));
    }

    @Override // com.salesforce.marketingcloud.alarms.b.InterfaceC0239b
    public void a(@NonNull com.salesforce.marketingcloud.alarms.a.b bVar) {
        if (bVar == com.salesforce.marketingcloud.alarms.a.b.f63809i) {
            com.salesforce.marketingcloud.g.c(f63986k, "Handling alarm to send stats", new Object[0]);
        } else if (bVar != com.salesforce.marketingcloud.alarms.a.b.f63810j) {
            return;
        } else {
            com.salesforce.marketingcloud.g.c(f63986k, "Handling alarm to send stats", new Object[0]);
        }
        a();
    }

    @Override // com.salesforce.marketingcloud.analytics.i, com.salesforce.marketingcloud.analytics.n
    public void a(@NonNull com.salesforce.marketingcloud.analytics.e eVar, @NonNull Event... eventArr) {
        try {
            this.f63993i.b().execute(new f("track_events", new Object[0], eventArr, new Date(), eVar));
        } catch (Exception e5) {
            com.salesforce.marketingcloud.g.b(f63986k, e5, "Failed to record iam displayed event stat.", new Object[0]);
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.i, com.salesforce.marketingcloud.analytics.l
    public void a(@NonNull com.salesforce.marketingcloud.analytics.l.a aVar, @NonNull JSONObject jSONObject) {
        try {
            this.f63993i.b().execute(new e("onTelemetryEvent", new Object[0], jSONObject, aVar));
        } catch (Exception e5) {
            com.salesforce.marketingcloud.g.b(f63986k, e5, "Failed to track onTelemetryEvent stat. %s", aVar.name());
        }
    }

    @VisibleForTesting
    public void a(com.salesforce.marketingcloud.http.a aVar) {
        this.f63993i.b().execute(new g("send_stats", new Object[0], aVar));
    }

    @Override // com.salesforce.marketingcloud.http.c.InterfaceC0253c
    public void a(@NonNull com.salesforce.marketingcloud.http.b bVar, @NonNull com.salesforce.marketingcloud.http.d dVar) {
        if (!dVar.g()) {
            com.salesforce.marketingcloud.g.c(f63986k, "Request failed: %d - %s", Integer.valueOf(dVar.getCode()), dVar.getMessage());
            if (bVar.p() == com.salesforce.marketingcloud.http.a.f64262q) {
                this.f63992h.b(com.salesforce.marketingcloud.alarms.a.b.f63809i);
            } else if (bVar.p() == com.salesforce.marketingcloud.http.a.f64263r) {
                this.f63992h.b(com.salesforce.marketingcloud.alarms.a.b.f63810j);
            }
            if (bVar.getCom.bbva.glomohybrid.logs.LogKeysKt.TAG java.lang.String() != null) {
                this.f63989e.n().d(com.salesforce.marketingcloud.analytics.c.a(bVar.getCom.bbva.glomohybrid.logs.LogKeysKt.TAG java.lang.String()));
                return;
            }
            return;
        }
        if (bVar.p() == com.salesforce.marketingcloud.http.a.f64262q) {
            this.f63992h.c(com.salesforce.marketingcloud.alarms.a.b.f63809i);
        } else if (bVar.p() == com.salesforce.marketingcloud.http.a.f64263r) {
            this.f63992h.c(com.salesforce.marketingcloud.alarms.a.b.f63810j);
        }
        if (bVar.getCom.bbva.glomohybrid.logs.LogKeysKt.TAG java.lang.String() != null) {
            String[] strArrA = com.salesforce.marketingcloud.analytics.c.a(bVar.getCom.bbva.glomohybrid.logs.LogKeysKt.TAG java.lang.String());
            com.salesforce.marketingcloud.g.c(f63986k, "Removing events %s from DB", Arrays.toString(strArrA));
            this.f63989e.n().c(strArrA);
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.i, com.salesforce.marketingcloud.analytics.f
    public void a(@NonNull InAppMessage inAppMessage) {
        try {
            com.salesforce.marketingcloud.g.c(f63986k, "InAppMessage displayed event stat for message id %s", inAppMessage.id());
            Date date = new Date();
            this.f63993i.b().execute(new com.salesforce.marketingcloud.analytics.stats.a(this.f63989e.n(), this.f63989e.b(), com.salesforce.marketingcloud.analytics.stats.b.a(104, date, com.salesforce.marketingcloud.analytics.stats.d.a(this.f63991g.applicationId(), this.f63988d, date, inAppMessage.id(), com.salesforce.marketingcloud.internal.a.a(inAppMessage)), true)));
        } catch (Exception e5) {
            com.salesforce.marketingcloud.g.b(f63986k, e5, "Failed to record iam displayed event stat.", new Object[0]);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004e  */
    @Override // com.salesforce.marketingcloud.analytics.i, com.salesforce.marketingcloud.analytics.f
    public void a(@NonNull InAppMessage inAppMessage, @NonNull com.salesforce.marketingcloud.messages.iam.j jVar) {
        byte b10;
        if (!this.f63994j) {
            com.salesforce.marketingcloud.g.a(f63986k, "Track user is false.  Ignoring onInAppMessageCompleted event.", new Object[0]);
            return;
        }
        try {
            int i10 = 1;
            com.salesforce.marketingcloud.g.c(f63986k, "Creating display event stat for message id %s", inAppMessage.id());
            InAppMessage.Button buttonA = jVar.a();
            String strD = jVar.d();
            int iHashCode = strD.hashCode();
            if (iHashCode != -935167046) {
                if (iHashCode == 2117198997 && strD.equals(com.salesforce.marketingcloud.messages.iam.j.f64667e)) {
                    b10 = 1;
                } else {
                    b10 = -1;
                }
            } else if (strD.equals(com.salesforce.marketingcloud.messages.iam.j.f64669g)) {
                b10 = 0;
            } else {
                b10 = -1;
            }
            String strId = null;
            if (b10 != 0) {
                if (b10 != 1) {
                    i10 = 3;
                } else {
                    strId = buttonA != null ? buttonA.id() : null;
                    i10 = 2;
                }
            }
            int i11 = i10;
            String str = strId;
            Date date = new Date(jVar.c().getTime() + jVar.b());
            this.f63993i.b().execute(new com.salesforce.marketingcloud.analytics.stats.a(this.f63989e.n(), this.f63989e.b(), com.salesforce.marketingcloud.analytics.stats.b.a(100, date, com.salesforce.marketingcloud.analytics.stats.d.a(this.f63991g.applicationId(), this.f63988d, date, inAppMessage.id(), com.salesforce.marketingcloud.internal.a.a(inAppMessage), (long) Math.ceil(jVar.b() / 1000.0d), i11, str), false)));
        } catch (Exception e5) {
            com.salesforce.marketingcloud.g.b(f63986k, e5, "Failed to record analytic event for In App Message Displayed", new Object[0]);
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.i, com.salesforce.marketingcloud.analytics.f
    public void a(@NonNull InAppMessage inAppMessage, @NonNull JSONObject jSONObject) {
        try {
            this.f63993i.b().execute(new b("onInAppMessageThrottled", new Object[0], inAppMessage, jSONObject));
        } catch (Exception e5) {
            com.salesforce.marketingcloud.g.b(f63986k, e5, "Failed to track iam throttled event stat.", new Object[0]);
        }
    }

    public static void a(@NonNull j jVar, boolean z10) {
        if (z10) {
            jVar.n().j();
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.i, com.salesforce.marketingcloud.analytics.m
    public void a(@NonNull String str, @NonNull String str2, @NonNull String str3, @Nullable String str4) {
        if (!this.f63994j) {
            com.salesforce.marketingcloud.g.a(f63986k, "Track user is false.  Ignoring onTriggerSuccessEvent event.", new Object[0]);
            return;
        }
        com.salesforce.marketingcloud.g.c(f63986k, "Creating trigger event stat for message id %s", str);
        try {
            Date date = new Date();
            this.f63993i.b().execute(new com.salesforce.marketingcloud.analytics.stats.a(this.f63989e.n(), this.f63989e.b(), com.salesforce.marketingcloud.analytics.stats.b.a(102, date, com.salesforce.marketingcloud.analytics.stats.d.a(this.f63991g.applicationId(), this.f63988d, date, str2, str4, str, str3), true)));
        } catch (Exception e5) {
            com.salesforce.marketingcloud.g.b(f63986k, e5, "Failed to record device stat for successful trigger event", new Object[0]);
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.i, com.salesforce.marketingcloud.analytics.f
    public void a(@NonNull String str, @NonNull String str2, @NonNull List<String> list) {
        com.salesforce.marketingcloud.g.c(f63986k, "Creating message validation error event stat for message id %s", str);
        try {
            Date date = new Date();
            this.f63993i.b().execute(new com.salesforce.marketingcloud.analytics.stats.a(this.f63989e.n(), this.f63989e.b(), com.salesforce.marketingcloud.analytics.stats.b.a(103, date, com.salesforce.marketingcloud.analytics.stats.d.a(this.f63991g.applicationId(), this.f63988d, date, str, str2, list), true)));
        } catch (Exception e5) {
            com.salesforce.marketingcloud.g.b(f63986k, e5, "Failed to record validation event stat.", new Object[0]);
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.i, com.salesforce.marketingcloud.analytics.m
    public void a(@NonNull JSONObject jSONObject) {
        try {
            this.f63993i.b().execute(new C0243c("onSyncGateTimedOutEvent", new Object[0], jSONObject));
        } catch (Exception e5) {
            com.salesforce.marketingcloud.g.b(f63986k, e5, "Failed to track syncGateTimeOut Event stat.", new Object[0]);
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.i
    public void a(boolean z10) {
        this.f63990f.a(com.salesforce.marketingcloud.http.a.f64262q);
        this.f63990f.a(com.salesforce.marketingcloud.http.a.f64263r);
        com.salesforce.marketingcloud.alarms.b bVar = this.f63992h;
        com.salesforce.marketingcloud.alarms.a.b bVar2 = com.salesforce.marketingcloud.alarms.a.b.f63809i;
        com.salesforce.marketingcloud.alarms.a.b bVar3 = com.salesforce.marketingcloud.alarms.a.b.f63810j;
        bVar.e(bVar2, bVar3);
        if (z10) {
            this.f63992h.d(bVar2, bVar3);
        }
    }
}
