package com.salesforce.marketingcloud.events.predicates;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes11.dex */
public class a extends f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final f[] f64207e;

    public a(@NonNull f... fVarArr) {
        this.f64207e = fVarArr;
    }

    @Override // com.salesforce.marketingcloud.events.predicates.f
    public boolean a() {
        for (f fVar : this.f64207e) {
            if (!fVar.b()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.salesforce.marketingcloud.events.predicates.f
    @NonNull
    public String c() {
        return "And";
    }
}
