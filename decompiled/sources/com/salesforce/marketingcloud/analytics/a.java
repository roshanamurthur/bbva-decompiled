package com.salesforce.marketingcloud.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes11.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class a extends com.salesforce.marketingcloud.internal.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.salesforce.marketingcloud.storage.a f63837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.salesforce.marketingcloud.util.c f63838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f63839d;

    public a(@NonNull com.salesforce.marketingcloud.storage.a aVar, @NonNull com.salesforce.marketingcloud.util.c cVar, @NonNull b bVar) {
        super("add_analytic", new Object[0]);
        this.f63837b = aVar;
        this.f63838c = cVar;
        this.f63839d = bVar;
    }

    @Override // com.salesforce.marketingcloud.internal.g
    public void a() {
        try {
            this.f63837b.a(this.f63839d, this.f63838c);
        } catch (Exception e5) {
            com.salesforce.marketingcloud.g.b(AnalyticsManager.TAG, e5, "Unable to record analytic [%d].", Integer.valueOf(this.f63839d.a()));
        }
    }
}
