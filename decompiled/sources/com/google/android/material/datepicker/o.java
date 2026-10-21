package com.google.android.material.datepicker;

import android.view.View;

/* JADX INFO: compiled from: MaterialCalendar.java */
/* JADX INFO: loaded from: classes10.dex */
public final class o implements View.OnClickListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendar f44590p0;

    public o(MaterialCalendar materialCalendar) {
        this.f44590p0 = materialCalendar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MaterialCalendar materialCalendar = this.f44590p0;
        MaterialCalendar.d dVar = materialCalendar.f44480u0;
        MaterialCalendar.d dVar2 = MaterialCalendar.d.YEAR;
        if (dVar == dVar2) {
            materialCalendar.b(MaterialCalendar.d.DAY);
        } else if (dVar == MaterialCalendar.d.DAY) {
            materialCalendar.b(dVar2);
        }
    }
}
