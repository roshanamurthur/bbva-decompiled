package com.salesforce.marketingcloud.analytics.piwama;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.Size;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.salesforce.marketingcloud.MarketingCloudConfig;
import com.salesforce.marketingcloud.MarketingCloudSdk;
import com.salesforce.marketingcloud.analytics.PiCart;
import com.salesforce.marketingcloud.analytics.PiOrder;
import com.salesforce.marketingcloud.messages.Region;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"UnknownNullness"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class i extends com.salesforce.marketingcloud.analytics.i implements com.salesforce.marketingcloud.http.c.InterfaceC0253c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final String f63934h = "user_id";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final String f63935i = "session_id";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @VisibleForTesting
    static final int f63936j = 100;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f63937k = 30;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f63938l = "et_background_time_cache";
    static final String m = com.salesforce.marketingcloud.g.a("PiWamaAnalytic");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f63939n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static j f63940o;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final com.salesforce.marketingcloud.storage.j f63941d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final com.salesforce.marketingcloud.http.c f63942e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final MarketingCloudConfig f63943f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final com.salesforce.marketingcloud.internal.l f63944g;

    public class a extends com.salesforce.marketingcloud.internal.g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.salesforce.marketingcloud.storage.j f63945b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Object[] objArr, com.salesforce.marketingcloud.storage.j jVar) {
            super(str, objArr);
            this.f63945b = jVar;
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            this.f63945b.m().e(1);
        }
    }

    public class b implements Comparator<com.salesforce.marketingcloud.analytics.b> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(com.salesforce.marketingcloud.analytics.b bVar, com.salesforce.marketingcloud.analytics.b bVar2) {
            if (bVar.f() == null) {
                return bVar2.f() == null ? 0 : -1;
            }
            if (bVar2.f() == null) {
                return 1;
            }
            return bVar.f().compareTo(bVar2.f());
        }
    }

    public class c extends com.salesforce.marketingcloud.internal.g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f63946b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, Object[] objArr, long j10) {
            super(str, objArr);
            this.f63946b = j10;
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            try {
                com.salesforce.marketingcloud.storage.a aVarM = i.this.f63941d.m();
                for (com.salesforce.marketingcloud.analytics.b bVar : aVarM.n(i.this.f63941d.b())) {
                    int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(this.f63946b - bVar.b().getTime());
                    if (seconds > 0) {
                        bVar.b(seconds);
                        bVar.a(true);
                        bVar.d(i.this.a());
                        aVarM.b(bVar, i.this.f63941d.b());
                    }
                }
                com.salesforce.marketingcloud.analytics.b bVarA = com.salesforce.marketingcloud.analytics.b.a(new Date(this.f63946b), 1, 2);
                bVarA.d(i.this.a());
                bVarA.a(true);
                bVarA.c(new com.salesforce.marketingcloud.analytics.piwama.b(new Date(this.f63946b)).c().toString());
                aVarM.a(bVarA, i.this.f63941d.b());
            } catch (Exception e5) {
                com.salesforce.marketingcloud.g.b(i.m, e5, "Failed to update our PiWama TimeInApp.", new Object[0]);
            }
        }
    }

    public class d extends com.salesforce.marketingcloud.internal.g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ NotificationMessage f63948b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, Object[] objArr, NotificationMessage notificationMessage) {
            super(str, objArr);
            this.f63948b = notificationMessage;
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            if (i.this.f63941d.m().c(1)) {
                i.this.a(System.currentTimeMillis());
            }
            Date date = new Date();
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f63948b.id());
            Region region = this.f63948b.region();
            if (region != null) {
                arrayList.add(region.id());
            }
            com.salesforce.marketingcloud.analytics.b bVarA = com.salesforce.marketingcloud.analytics.b.a(date, 1, 5, (List<String>) arrayList, false);
            bVarA.d(i.this.a());
            bVarA.c(new com.salesforce.marketingcloud.analytics.piwama.e(date, true, bVarA.i()).c().toString());
            i.this.f63944g.b().execute(new com.salesforce.marketingcloud.analytics.a(i.this.f63941d.m(), i.this.f63941d.b(), bVarA));
        }
    }

    public class e extends com.salesforce.marketingcloud.internal.g {
        public e(String str, Object... objArr) {
            super(str, objArr);
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            i iVar = i.this;
            i.a(iVar.f63942e, iVar.f63941d.m().h(i.this.f63941d.b()));
        }
    }

    public i(@NonNull MarketingCloudConfig marketingCloudConfig, @NonNull com.salesforce.marketingcloud.storage.j jVar, @NonNull com.salesforce.marketingcloud.http.c cVar, @NonNull com.salesforce.marketingcloud.internal.l lVar) {
        com.salesforce.marketingcloud.util.j.a(marketingCloudConfig, "MarketingCloudConfig may not be null.");
        this.f63941d = (com.salesforce.marketingcloud.storage.j) com.salesforce.marketingcloud.util.j.a(jVar, "MCStorage may not be null.");
        this.f63942e = (com.salesforce.marketingcloud.http.c) com.salesforce.marketingcloud.util.j.a(cVar, "RequestManager may not be null.");
        this.f63943f = marketingCloudConfig;
        f63940o = a(marketingCloudConfig) ? new k(marketingCloudConfig, jVar) : new com.salesforce.marketingcloud.analytics.piwama.a(marketingCloudConfig, jVar);
        cVar.a(com.salesforce.marketingcloud.http.a.f64255i, this);
        this.f63944g = lVar;
    }

    @VisibleForTesting
    public static List<List<com.salesforce.marketingcloud.analytics.b>> b(List<com.salesforce.marketingcloud.analytics.b> list) {
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (int i11 = size; i11 > 0; i11 -= 100) {
            int i12 = i10 * 100;
            i10++;
            int i13 = i10 * 100;
            if (i13 > size) {
                i13 = i11 + i12;
            }
            arrayList.add(new ArrayList(list.subList(i12, i13)));
        }
        return arrayList;
    }

    public String a() {
        String piIdentifier = getPiIdentifier();
        return (piIdentifier == null && this.f63943f.useLegacyPiIdentifier()) ? com.salesforce.marketingcloud.registration.d.a(this.f63941d) : piIdentifier;
    }

    public void c() {
        this.f63944g.b().execute(new e("send_pi_analytics", new Object[0]));
    }

    @Override // com.salesforce.marketingcloud.analytics.i, com.salesforce.marketingcloud.analytics.AnalyticsManager
    @Nullable
    public String getPiIdentifier() {
        return this.f63941d.c().getString("predictive_intelligence_identifier", null);
    }

    @Override // com.salesforce.marketingcloud.analytics.i, com.salesforce.marketingcloud.analytics.AnalyticsManager
    public void setPiIdentifier(@Nullable @Size(min = 1) String str) {
        if (str == null) {
            this.f63941d.c().remove("predictive_intelligence_identifier");
        } else {
            this.f63941d.c().putString("predictive_intelligence_identifier", str.trim());
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.i, com.salesforce.marketingcloud.analytics.AnalyticsManager
    public void trackCartContents(@NonNull PiCart piCart) {
        if (piCart != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                a(new f(piCart, new Date(jCurrentTimeMillis)), jCurrentTimeMillis);
            } catch (Exception e5) {
                com.salesforce.marketingcloud.g.b(m, e5, "Failed to add PiWamaAnalytic for trackCartContents.  See LogCat for details.", new Object[0]);
            }
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.i, com.salesforce.marketingcloud.analytics.AnalyticsManager
    public void trackCartConversion(@NonNull PiOrder piOrder) {
        if (piOrder != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                a(new g(piOrder, new Date(jCurrentTimeMillis)), jCurrentTimeMillis);
            } catch (IllegalArgumentException e5) {
                com.salesforce.marketingcloud.g.b(m, e5, "Failed to add PiWamaAnalytic for trackCartConversion.  See LogCat for details.", new Object[0]);
            }
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.i, com.salesforce.marketingcloud.analytics.AnalyticsManager
    public void trackPageView(@NonNull @Size(min = 1) String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            a(new h(str, str2, str3, str4, new Date(jCurrentTimeMillis)), jCurrentTimeMillis);
        } catch (IllegalArgumentException e5) {
            com.salesforce.marketingcloud.g.b(m, e5, "Failed to record PiWamaItem for trackPageView.", new Object[0]);
        }
    }

    public static List<List<com.salesforce.marketingcloud.analytics.b>> a(List<com.salesforce.marketingcloud.analytics.b> list) {
        ArrayList arrayList = new ArrayList();
        Collections.sort(list, new b());
        ArrayList arrayList2 = new ArrayList();
        String strF = null;
        for (com.salesforce.marketingcloud.analytics.b bVar : list) {
            if ((strF == null || !strF.equals(bVar.f())) && bVar.f() != null) {
                if (!arrayList2.isEmpty()) {
                    arrayList.add(arrayList2);
                }
                strF = bVar.f();
                arrayList2 = new ArrayList();
                arrayList2.add(bVar);
            } else {
                arrayList2.add(bVar);
            }
        }
        arrayList.add(arrayList2);
        return arrayList;
    }

    private void b() {
        long j10 = this.f63941d.f().getLong(f63938l, -1L);
        if (j10 != -1) {
            this.f63941d.f().edit().remove(f63938l).apply();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j10);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.add(12, -30);
            if (calendar.before(calendar2)) {
                this.f63941d.c().remove(com.salesforce.marketingcloud.storage.c.f64953f);
            }
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.i
    public void a(long j10) {
        this.f63941d.f().edit().putLong(f63938l, j10).apply();
        this.f63944g.b().execute(new c("end_time_in_app", new Object[0], j10));
    }

    @Override // com.salesforce.marketingcloud.analytics.i
    public void b(long j10) {
        Date date = new Date(j10);
        b();
        if (this.f63941d.m().c(1)) {
            return;
        }
        try {
            com.salesforce.marketingcloud.analytics.b bVarA = com.salesforce.marketingcloud.analytics.b.a(date, 1, 5);
            bVarA.c(new com.salesforce.marketingcloud.analytics.piwama.e(date, false, Collections.emptyList()).c().toString());
            this.f63944g.b().execute(new com.salesforce.marketingcloud.analytics.a(this.f63941d.m(), this.f63941d.b(), bVarA));
        } catch (Exception e5) {
            com.salesforce.marketingcloud.g.b(m, e5, "Failed to create WamaItem for TimeInApp.", new Object[0]);
        }
    }

    private void a(@NonNull com.salesforce.marketingcloud.analytics.piwama.c cVar, long j10) throws IllegalArgumentException {
        JSONObject jSONObjectC = cVar.c();
        if (jSONObjectC == null) {
            throw new IllegalArgumentException("Failed to convert your input type to a JSON Object.");
        }
        try {
            com.salesforce.marketingcloud.analytics.b bVarA = com.salesforce.marketingcloud.analytics.b.a(new Date(j10), 1, cVar.b());
            bVarA.d(a());
            bVarA.c(jSONObjectC.toString());
            bVarA.a(true);
            if (TextUtils.isEmpty(bVarA.e())) {
                return;
            }
            this.f63944g.b().execute(new com.salesforce.marketingcloud.analytics.a(this.f63941d.m(), this.f63941d.b(), bVarA));
        } catch (Exception e5) {
            com.salesforce.marketingcloud.g.b(m, e5, "Failed to record PiWamaItem in local storage.", new Object[0]);
            throw new IllegalArgumentException("Failed to record PiWamaItem in local storage.");
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.i, com.salesforce.marketingcloud.analytics.j
    public void b(@NonNull NotificationMessage notificationMessage) {
        try {
            this.f63944g.b().execute(new d("notification_opened", new Object[0], notificationMessage));
        } catch (Exception e5) {
            com.salesforce.marketingcloud.g.b(m, e5, "Failed to store our WamaItem for message opened.", new Object[0]);
        }
    }

    @Override // com.salesforce.marketingcloud.http.c.InterfaceC0253c
    public void a(com.salesforce.marketingcloud.http.b bVar, com.salesforce.marketingcloud.http.d dVar) {
        if (!dVar.g()) {
            com.salesforce.marketingcloud.g.c(m, "Request failed: %d - %s", Integer.valueOf(dVar.getCode()), dVar.getMessage());
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(dVar.getBody());
            a(com.salesforce.marketingcloud.analytics.c.a(bVar.getTag() != null ? bVar.getTag() : ""), jSONObject.getString("user_id"), jSONObject.getString("session_id"));
        } catch (Exception e5) {
            com.salesforce.marketingcloud.g.b(m, e5, "Error parsing response.", new Object[0]);
        }
    }

    @WorkerThread
    public static void a(com.salesforce.marketingcloud.http.c cVar, List<com.salesforce.marketingcloud.analytics.b> list) {
        MarketingCloudSdk marketingCloudSdk;
        if ((!MarketingCloudSdk.isReady() && !MarketingCloudSdk.isInitializing()) || (marketingCloudSdk = MarketingCloudSdk.getInstance()) == null || list.isEmpty()) {
            return;
        }
        Iterator<List<com.salesforce.marketingcloud.analytics.b>> it = a(list).iterator();
        while (it.hasNext()) {
            for (List<com.salesforce.marketingcloud.analytics.b> list2 : b(it.next())) {
                com.salesforce.marketingcloud.http.b bVarA = f63940o.a(marketingCloudSdk.getRegistrationManager(), marketingCloudSdk.getPushMessageManager(), marketingCloudSdk.getRegionMessageManager(), list2);
                bVarA.a(com.salesforce.marketingcloud.analytics.c.a(list2));
                cVar.a(bVarA);
            }
        }
    }

    public static void a(com.salesforce.marketingcloud.storage.j jVar, com.salesforce.marketingcloud.http.c cVar, com.salesforce.marketingcloud.internal.l lVar, boolean z10) {
        if (z10) {
            a(jVar, lVar);
            jVar.c().remove("predictive_intelligence_identifier");
        }
        cVar.a(com.salesforce.marketingcloud.http.a.f64255i);
    }

    private static void a(com.salesforce.marketingcloud.storage.j jVar, com.salesforce.marketingcloud.internal.l lVar) {
        lVar.b().execute(new a("deleting_pi_analytics", new Object[0], jVar));
    }

    @Override // com.salesforce.marketingcloud.analytics.i
    public void a(boolean z10) {
        if (z10) {
            a(this.f63941d, this.f63944g);
        }
        com.salesforce.marketingcloud.http.c cVar = this.f63942e;
        if (cVar != null) {
            cVar.a(com.salesforce.marketingcloud.http.a.f64255i);
        }
    }

    private void a(String[] strArr, String str, String str2) {
        this.f63941d.c().putString(com.salesforce.marketingcloud.storage.c.f64954g, str);
        this.f63941d.c().putString(com.salesforce.marketingcloud.storage.c.f64953f, str2);
        if (strArr != null) {
            this.f63944g.b().execute(new com.salesforce.marketingcloud.analytics.d(this.f63941d.m(), strArr));
        }
    }

    private boolean a(@NonNull MarketingCloudConfig marketingCloudConfig) {
        String strTrim = marketingCloudConfig.predictiveIntelligenceServerUrl().toLowerCase(Locale.ENGLISH).trim();
        return (strTrim.startsWith("https://stage.app.igodigital.com/api/v1/collect/qa/qa1s1/process_batch") || strTrim.startsWith("https://stage.app.igodigital.com/api/v1/collect/qa/qa3s1/process_batch") || strTrim.startsWith("https://app.igodigital.com/api/v1/collect/process_batch")) ? false : true;
    }
}
