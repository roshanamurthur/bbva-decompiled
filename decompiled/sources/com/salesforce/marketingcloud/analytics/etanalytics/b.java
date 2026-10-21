package com.salesforce.marketingcloud.analytics.etanalytics;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.salesforce.marketingcloud.analytics.AnalyticsManager;
import com.salesforce.marketingcloud.analytics.i;
import com.salesforce.marketingcloud.internal.g;
import com.salesforce.marketingcloud.internal.l;
import com.salesforce.marketingcloud.messages.Region;
import com.salesforce.marketingcloud.messages.inbox.InboxMessage;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.salesforce.marketingcloud.storage.j;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class b extends i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f63875f = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final j f63876d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final l f63877e;

    public class a extends g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f63878b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Object[] objArr, j jVar) {
            super(str, objArr);
            this.f63878b = jVar;
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            this.f63878b.m().a(0);
        }
    }

    /* JADX INFO: renamed from: com.salesforce.marketingcloud.analytics.etanalytics.b$b, reason: collision with other inner class name */
    public class C0242b extends g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f63879b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0242b(String str, Object[] objArr, long j10) {
            super(str, objArr);
            this.f63879b = j10;
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            if (b.this.f63876d.m().c(0)) {
                return;
            }
            try {
                b.this.f63876d.m().a(com.salesforce.marketingcloud.analytics.b.a(new Date(this.f63879b), 0, 4), b.this.f63876d.b());
            } catch (Exception e5) {
                com.salesforce.marketingcloud.g.b(AnalyticsManager.TAG, e5, "Failed to create our EtAnalyticItem for TimeInApp.", new Object[0]);
            }
        }
    }

    public class c extends g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f63881b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, Object[] objArr, long j10) {
            super(str, objArr);
            this.f63881b = j10;
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            try {
                List<com.salesforce.marketingcloud.analytics.b> listD = b.this.f63876d.m().d(b.this.f63876d.b());
                if (listD.isEmpty()) {
                    return;
                }
                for (com.salesforce.marketingcloud.analytics.b bVar : listD) {
                    int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(this.f63881b - bVar.b().getTime());
                    if (seconds > 0) {
                        bVar.b(seconds);
                        bVar.a(true);
                        b.this.f63876d.m().b(bVar, b.this.f63876d.b());
                    }
                }
            } catch (Exception e5) {
                com.salesforce.marketingcloud.g.b(AnalyticsManager.TAG, e5, "Failed to update our EtAnalytic TimeInApp.", new Object[0]);
            }
        }
    }

    public class d extends g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f63883b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, Object[] objArr, long j10) {
            super(str, objArr);
            this.f63883b = j10;
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            try {
                List<com.salesforce.marketingcloud.analytics.b> listM = b.this.f63876d.m().m(b.this.f63876d.b());
                if (listM.isEmpty()) {
                    return;
                }
                for (com.salesforce.marketingcloud.analytics.b bVar : listM) {
                    int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(this.f63883b - bVar.b().getTime());
                    if (seconds > 0) {
                        bVar.b(seconds);
                        bVar.a(true);
                        b.this.f63876d.m().b(bVar, b.this.f63876d.b());
                    }
                }
            } catch (Exception e5) {
                com.salesforce.marketingcloud.g.b(AnalyticsManager.TAG, e5, "Failed to update local storage for stopTimeInAllRegions.", new Object[0]);
            }
        }
    }

    public class e extends g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Region f63885b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Date f63886c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, Object[] objArr, Region region, Date date) {
            super(str, objArr);
            this.f63885b = region;
            this.f63886c = date;
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            try {
                List<com.salesforce.marketingcloud.analytics.b> listB = b.this.f63876d.m().b(this.f63885b, b.this.f63876d.b());
                if (listB.isEmpty()) {
                    return;
                }
                for (com.salesforce.marketingcloud.analytics.b bVar : listB) {
                    int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(this.f63886c.getTime() - bVar.b().getTime());
                    if (seconds > 0) {
                        bVar.b(seconds);
                        bVar.a(true);
                        b.this.f63876d.m().b(bVar, b.this.f63876d.b());
                    }
                }
            } catch (Exception e5) {
                com.salesforce.marketingcloud.g.b(AnalyticsManager.TAG, e5, "Failed to record EtAnalyticItem for stopTimeInRegion.", new Object[0]);
            }
        }
    }

    public b(@NonNull j jVar, @NonNull l lVar) {
        this.f63876d = jVar;
        this.f63877e = lVar;
    }

    @Override // com.salesforce.marketingcloud.analytics.i
    public void a(long j10) {
        this.f63877e.b().execute(new c("end_app_counter", new Object[0], j10));
    }

    @Override // com.salesforce.marketingcloud.analytics.i
    public void b(long j10) {
        this.f63877e.b().execute(new C0242b("start_app_counter", new Object[0], j10));
    }

    @Override // com.salesforce.marketingcloud.analytics.i
    public void c(long j10) {
        this.f63877e.b().execute(new d("end_region_counter", new Object[0], j10));
    }

    @Override // com.salesforce.marketingcloud.analytics.i, com.salesforce.marketingcloud.analytics.AnalyticsManager
    public void trackInboxOpenEvent(@NonNull InboxMessage inboxMessage) {
        if (inboxMessage == null) {
            com.salesforce.marketingcloud.g.e(AnalyticsManager.TAG, "InboxMessage was null. Call to trackInboxOpenEvent() ignored.", new Object[0]);
        } else {
            this.f63877e.b().execute(new com.salesforce.marketingcloud.analytics.a(this.f63876d.m(), this.f63876d.b(), com.salesforce.marketingcloud.analytics.b.a(new Date(), 0, 15, Collections.singletonList(inboxMessage.id()), com.salesforce.marketingcloud.internal.b.b(inboxMessage), true)));
        }
    }

    private static void a(l lVar, j jVar) {
        lVar.b().execute(new a("delete_analytics", new Object[0], jVar));
    }

    @Override // com.salesforce.marketingcloud.analytics.i, com.salesforce.marketingcloud.analytics.k
    public void b(@NonNull Region region) {
        Date date = new Date();
        a(region, date);
        this.f63877e.b().execute(new com.salesforce.marketingcloud.analytics.a(this.f63876d.m(), this.f63876d.b(), com.salesforce.marketingcloud.analytics.b.a(date, 0, region.regionType() == 1 ? 6 : 12, (List<String>) Collections.singletonList(region.id()), true)));
    }

    private void b(@NonNull Region region, @NonNull Date date) {
        this.f63877e.b().execute(new e("end_region_counter", new Object[0], region, date));
    }

    @Override // com.salesforce.marketingcloud.analytics.i, com.salesforce.marketingcloud.analytics.k
    public void a(@NonNull Region region) {
        Date date = new Date();
        b(region, date);
        if (region.regionType() == 3) {
            return;
        }
        this.f63877e.b().execute(new com.salesforce.marketingcloud.analytics.a(this.f63876d.m(), this.f63876d.b(), com.salesforce.marketingcloud.analytics.b.a(date, 0, 7, (List<String>) Collections.singletonList(region.id()), true)));
    }

    private void a(@NonNull Region region, Date date) {
        this.f63877e.b().execute(new com.salesforce.marketingcloud.analytics.a(this.f63876d.m(), this.f63876d.b(), com.salesforce.marketingcloud.analytics.b.a(date, 0, region.regionType() == 1 ? 11 : 13, (List<String>) Collections.singletonList(region.id()), false)));
    }

    @Override // com.salesforce.marketingcloud.analytics.i, com.salesforce.marketingcloud.analytics.j
    public void b(@NonNull NotificationMessage notificationMessage) {
        a(System.currentTimeMillis());
        this.f63877e.b().execute(new com.salesforce.marketingcloud.analytics.a(this.f63876d.m(), this.f63876d.b(), com.salesforce.marketingcloud.analytics.b.a(new Date(), 0, 5, notificationMessage, false)));
    }

    public static void a(@NonNull j jVar, @NonNull l lVar, boolean z10) {
        if (z10) {
            a(lVar, jVar);
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.i
    public void a(boolean z10) {
        if (z10) {
            a(this.f63877e, this.f63876d);
        }
    }
}
