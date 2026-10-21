package com.google.android.material.datepicker;

import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R;
import java.util.Calendar;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public final class MonthsPagerAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final CalendarConstraints f44527p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final DateSelector<?> f44528q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @Nullable
    public final DayViewDecorator f44529r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final MaterialCalendar.e f44530s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final int f44531t0;

    public static class ViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final TextView f44532p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final MaterialCalendarGridView f44533q0;

        public ViewHolder(@NonNull LinearLayout linearLayout, boolean z10) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
            this.f44532p0 = textView;
            ViewCompat.setAccessibilityHeading(textView, true);
            this.f44533q0 = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
            if (z10) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    public MonthsPagerAdapter(@NonNull ContextThemeWrapper contextThemeWrapper, DateSelector dateSelector, @NonNull CalendarConstraints calendarConstraints, @Nullable DayViewDecorator dayViewDecorator, MaterialCalendar.c cVar) {
        Month month = calendarConstraints.f44456p0;
        Month month2 = calendarConstraints.f44459s0;
        if (month.compareTo(month2) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (month2.compareTo(calendarConstraints.f44457q0) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        int i10 = r.v0;
        int i11 = MaterialCalendar.H0;
        Resources resources = contextThemeWrapper.getResources();
        int i12 = R.dimen.mtrl_calendar_day_height;
        this.f44531t0 = (resources.getDimensionPixelSize(i12) * i10) + (MaterialDatePicker.e(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(i12) : 0);
        this.f44527p0 = calendarConstraints;
        this.f44528q0 = dateSelector;
        this.f44529r0 = dayViewDecorator;
        this.f44530s0 = cVar;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f44527p0.v0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i10) {
        Calendar calendarD = w.d(this.f44527p0.f44456p0.f44521p0);
        calendarD.add(2, i10);
        return new Month(calendarD).f44521p0.getTimeInMillis();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i10) {
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        CalendarConstraints calendarConstraints = this.f44527p0;
        Calendar calendarD = w.d(calendarConstraints.f44456p0.f44521p0);
        calendarD.add(2, i10);
        Month month = new Month(calendarD);
        viewHolder2.f44532p0.setText(month.d());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) viewHolder2.f44533q0.findViewById(R.id.month_grid);
        if (materialCalendarGridView.b() == null || !month.equals(materialCalendarGridView.b().f44597p0)) {
            r rVar = new r(month, this.f44528q0, calendarConstraints, this.f44529r0);
            materialCalendarGridView.setNumColumns(month.f44524s0);
            materialCalendarGridView.setAdapter((ListAdapter) rVar);
        } else {
            materialCalendarGridView.invalidate();
            r rVarB = materialCalendarGridView.b();
            Iterator<Long> it = rVarB.f44599r0.iterator();
            while (it.hasNext()) {
                rVarB.e(materialCalendarGridView, it.next().longValue());
            }
            DateSelector<?> dateSelector = rVarB.f44598q0;
            if (dateSelector != null) {
                Iterator<Long> it2 = dateSelector.getSelectedDays().iterator();
                while (it2.hasNext()) {
                    rVarB.e(materialCalendarGridView, it2.next().longValue());
                }
                rVarB.f44599r0 = dateSelector.getSelectedDays();
            }
        }
        materialCalendarGridView.setOnItemClickListener(new s(this, materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public final RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i10) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!MaterialDatePicker.e(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new ViewHolder(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, this.f44531t0));
        return new ViewHolder(linearLayout, true);
    }
}
