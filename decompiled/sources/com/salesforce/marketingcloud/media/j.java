package com.salesforce.marketingcloud.media;

import android.annotation.SuppressLint;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"UnknownNullness"})
public class j extends a<Object> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private f f64489f;

    public j(o oVar, s sVar, f fVar) {
        super(oVar, null, sVar);
        this.f64489f = fVar;
    }

    @Override // com.salesforce.marketingcloud.media.a
    public void a() {
        super.a();
        this.f64489f = null;
    }

    @Override // com.salesforce.marketingcloud.media.a
    public void a(u.b bVar) {
        f fVar = this.f64489f;
        if (fVar != null) {
            fVar.a();
        }
    }

    @Override // com.salesforce.marketingcloud.media.a
    public void a(Exception exc) {
        f fVar = this.f64489f;
        if (fVar != null) {
            fVar.a(exc);
        }
    }
}
