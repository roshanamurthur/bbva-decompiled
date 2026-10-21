package com.facetec.sdk;

import android.view.View;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class x2 implements View.OnClickListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f42957p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f42958q0;

    public /* synthetic */ x2(Object obj, int i10) {
        this.f42957p0 = i10;
        this.f42958q0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f42957p0;
        Object obj = this.f42958q0;
        switch (i10) {
            case 0:
                ((be) obj).a(view);
                break;
            default:
                ((co) obj).d(view);
                break;
        }
    }
}
