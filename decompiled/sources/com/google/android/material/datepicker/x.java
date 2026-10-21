package com.google.android.material.datepicker;

import android.view.View;

/* JADX INFO: compiled from: YearGridAdapter.java */
/* JADX INFO: loaded from: classes10.dex */
public final class x implements View.OnClickListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f44609p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ YearGridAdapter f44610q0;

    public x(YearGridAdapter yearGridAdapter, int i10) {
        this.f44610q0 = yearGridAdapter;
        this.f44609p0 = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        YearGridAdapter yearGridAdapter = this.f44610q0;
        Month monthB = Month.b(this.f44609p0, yearGridAdapter.f44549p0.f44479t0.f44522q0);
        CalendarConstraints calendarConstraints = yearGridAdapter.f44549p0.f44477r0;
        Month month = calendarConstraints.f44456p0;
        if (monthB.compareTo(month) < 0) {
            monthB = month;
        } else {
            Month month2 = calendarConstraints.f44457q0;
            if (monthB.compareTo(month2) > 0) {
                monthB = month2;
            }
        }
        yearGridAdapter.f44549p0.a(monthB);
        yearGridAdapter.f44549p0.b(MaterialCalendar.d.DAY);
    }
}
