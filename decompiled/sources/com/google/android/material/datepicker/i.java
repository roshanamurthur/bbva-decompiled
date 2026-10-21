package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

/* JADX INFO: compiled from: MaterialCalendar.java */
/* JADX INFO: loaded from: classes10.dex */
public final class i implements View.OnClickListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ MonthsPagerAdapter f44579p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendar f44580q0;

    public i(MaterialCalendar materialCalendar, MonthsPagerAdapter monthsPagerAdapter) {
        this.f44580q0 = materialCalendar;
        this.f44579p0 = monthsPagerAdapter;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MaterialCalendar materialCalendar = this.f44580q0;
        int iFindLastVisibleItemPosition = ((LinearLayoutManager) materialCalendar.f44482x0.getLayoutManager()).findLastVisibleItemPosition() - 1;
        if (iFindLastVisibleItemPosition >= 0) {
            Calendar calendarD = w.d(this.f44579p0.f44527p0.f44456p0.f44521p0);
            calendarD.add(2, iFindLastVisibleItemPosition);
            materialCalendar.a(new Month(calendarD));
        }
    }
}
