package com.salesforce.marketingcloud.analytics.stats;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.salesforce.marketingcloud.analytics.AnalyticsManager;
import com.salesforce.marketingcloud.internal.g;

/* JADX INFO: loaded from: classes11.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class a extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.salesforce.marketingcloud.storage.d f63971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.salesforce.marketingcloud.util.c f63972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f63973d;

    public a(@NonNull com.salesforce.marketingcloud.storage.d dVar, @NonNull com.salesforce.marketingcloud.util.c cVar, @NonNull b bVar) {
        super("add_device_stat", new Object[0]);
        this.f63971b = dVar;
        this.f63972c = cVar;
        this.f63973d = bVar;
    }

    @Override // com.salesforce.marketingcloud.internal.g
    public void a() {
        try {
            this.f63971b.a(this.f63973d, this.f63972c);
        } catch (Exception e5) {
            com.salesforce.marketingcloud.g.b(AnalyticsManager.TAG, e5, "Unable to record device stat [%d].", Integer.valueOf(this.f63973d.d()));
        }
    }
}
