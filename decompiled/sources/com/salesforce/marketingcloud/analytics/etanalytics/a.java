package com.salesforce.marketingcloud.analytics.etanalytics;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.salesforce.marketingcloud.analytics.i;
import com.salesforce.marketingcloud.internal.g;
import com.salesforce.marketingcloud.internal.l;
import com.salesforce.marketingcloud.messages.Region;
import com.salesforce.marketingcloud.messages.inbox.InboxMessage;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.salesforce.marketingcloud.storage.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"UnknownNullness"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class a extends i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f63871f = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final j f63872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final l f63873e;

    /* JADX INFO: renamed from: com.salesforce.marketingcloud.analytics.etanalytics.a$a, reason: collision with other inner class name */
    public class C0241a extends g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f63874b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0241a(String str, Object[] objArr, j jVar) {
            super(str, objArr);
            this.f63874b = jVar;
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            this.f63874b.m().b(0);
        }
    }

    public a(@NonNull j jVar, @NonNull l lVar) {
        this.f63872d = jVar;
        this.f63873e = lVar;
    }

    private static void a(l lVar, j jVar) {
        lVar.b().execute(new C0241a("delete_analytics", new Object[0], jVar));
    }

    @Override // com.salesforce.marketingcloud.analytics.i, com.salesforce.marketingcloud.analytics.g
    public void a(@NonNull InboxMessage inboxMessage) {
        this.f63873e.b().execute(new com.salesforce.marketingcloud.analytics.a(this.f63872d.m(), this.f63872d.b(), com.salesforce.marketingcloud.analytics.b.a(new Date(), 0, 14, Collections.singletonList(inboxMessage.id()), com.salesforce.marketingcloud.internal.b.b(inboxMessage), true)));
    }

    @Override // com.salesforce.marketingcloud.analytics.i, com.salesforce.marketingcloud.analytics.j
    public void a(@NonNull NotificationMessage notificationMessage) {
        Region region = notificationMessage.region();
        if (TextUtils.isEmpty(notificationMessage.id()) || region == null) {
            return;
        }
        this.f63873e.b().execute(new com.salesforce.marketingcloud.analytics.a(this.f63872d.m(), this.f63872d.b(), com.salesforce.marketingcloud.analytics.b.a(new Date(), 0, 3, Arrays.asList(notificationMessage.id(), region.id()), notificationMessage.requestId(), true)));
    }

    @Override // com.salesforce.marketingcloud.analytics.i, com.salesforce.marketingcloud.analytics.j
    public void a(@NonNull NotificationMessage notificationMessage, boolean z10) {
        if (notificationMessage.region() != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(notificationMessage.id());
            arrayList.add(notificationMessage.region().id());
            com.salesforce.marketingcloud.analytics.b bVarA = com.salesforce.marketingcloud.analytics.b.a(new Date(), 0, 17, arrayList, notificationMessage.requestId(), true);
            bVarA.b(z10 ? 1 : 0);
            this.f63873e.b().execute(new com.salesforce.marketingcloud.analytics.a(this.f63872d.m(), this.f63872d.b(), bVarA));
        }
    }

    public static void a(j jVar, l lVar, boolean z10) {
        if (z10) {
            a(lVar, jVar);
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.i
    public void a(boolean z10) {
        if (z10) {
            a(this.f63873e, this.f63872d);
        }
    }
}
