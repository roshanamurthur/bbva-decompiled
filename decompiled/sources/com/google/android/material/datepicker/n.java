package com.google.android.material.datepicker;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;

/* JADX INFO: compiled from: MaterialCalendar.java */
/* JADX INFO: loaded from: classes10.dex */
public final class n extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MonthsPagerAdapter f44587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialButton f44588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendar f44589c;

    public n(MaterialCalendar materialCalendar, MonthsPagerAdapter monthsPagerAdapter, MaterialButton materialButton) {
        this.f44589c = materialCalendar;
        this.f44587a = monthsPagerAdapter;
        this.f44588b = materialButton;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            recyclerView.announceForAccessibility(this.f44588b.getText());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(@NonNull RecyclerView recyclerView, int i10, int i11) {
        MaterialCalendar materialCalendar = this.f44589c;
        int iFindFirstVisibleItemPosition = i10 < 0 ? ((LinearLayoutManager) materialCalendar.f44482x0.getLayoutManager()).findFirstVisibleItemPosition() : ((LinearLayoutManager) materialCalendar.f44482x0.getLayoutManager()).findLastVisibleItemPosition();
        MonthsPagerAdapter monthsPagerAdapter = this.f44587a;
        Calendar calendarD = w.d(monthsPagerAdapter.f44527p0.f44456p0.f44521p0);
        calendarD.add(2, iFindFirstVisibleItemPosition);
        materialCalendar.f44479t0 = new Month(calendarD);
        Calendar calendarD2 = w.d(monthsPagerAdapter.f44527p0.f44456p0.f44521p0);
        calendarD2.add(2, iFindFirstVisibleItemPosition);
        this.f44588b.setText(new Month(calendarD2).d());
    }
}
