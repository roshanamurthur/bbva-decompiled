package com.salesforce.marketingcloud.registration;

import androidx.annotation.RestrictTo;
import com.salesforce.marketingcloud.storage.m;

/* JADX INFO: loaded from: classes11.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class a extends com.salesforce.marketingcloud.internal.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f64867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.salesforce.marketingcloud.util.c f64868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Registration f64869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f64870e;

    public a(m mVar, com.salesforce.marketingcloud.util.c cVar, Registration registration, boolean z10) {
        super(z10 ? "update_registration" : "add_registration", new Object[0]);
        this.f64867b = mVar;
        this.f64868c = cVar;
        this.f64869d = registration;
        this.f64870e = z10;
    }

    @Override // com.salesforce.marketingcloud.internal.g
    public void a() {
        try {
            if (this.f64870e) {
                this.f64867b.b(this.f64869d, this.f64868c);
            } else {
                this.f64867b.a(this.f64869d, this.f64868c);
            }
        } catch (Exception e5) {
            String str = RegistrationManager.f64864a;
            Object[] objArr = new Object[1];
            objArr[0] = this.f64870e ? "update" : "add";
            com.salesforce.marketingcloud.g.b(str, e5, "Unable to %s registration", objArr);
        }
    }
}
