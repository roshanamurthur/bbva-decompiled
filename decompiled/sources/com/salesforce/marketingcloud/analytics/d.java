package com.salesforce.marketingcloud.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes11.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class d extends com.salesforce.marketingcloud.internal.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.salesforce.marketingcloud.storage.a f63865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String[] f63866c;

    public d(@NonNull com.salesforce.marketingcloud.storage.a aVar, @NonNull String[] strArr) {
        super("delete_analytics", new Object[0]);
        this.f63865b = aVar;
        this.f63866c = strArr;
    }

    @Override // com.salesforce.marketingcloud.internal.g
    public void a() {
        this.f63865b.a(this.f63866c);
    }
}
