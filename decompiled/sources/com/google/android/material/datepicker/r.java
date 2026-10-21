package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.material3.DatePickerDefaults;
import androidx.core.util.Pair;
import com.google.android.material.R;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: MonthAdapter.java */
/* JADX INFO: loaded from: classes10.dex */
public final class r extends BaseAdapter {
    public static final int v0 = w.i(null).getMaximum(4);

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final int f44596w0 = (w.i(null).getMaximum(7) + w.i(null).getMaximum(5)) - 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Month f44597p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final DateSelector<?> f44598q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Collection<Long> f44599r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public b f44600s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final CalendarConstraints f44601t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @Nullable
    public final DayViewDecorator f44602u0;

    public r(Month month, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints, @Nullable DayViewDecorator dayViewDecorator) {
        this.f44597p0 = month;
        this.f44598q0 = dateSelector;
        this.f44601t0 = calendarConstraints;
        this.f44602u0 = dayViewDecorator;
        this.f44599r0 = dateSelector.getSelectedDays();
    }

    public final int a() {
        int firstDayOfWeek = this.f44601t0.f44460t0;
        Month month = this.f44597p0;
        Calendar calendar = month.f44521p0;
        int i10 = calendar.get(7);
        if (firstDayOfWeek <= 0) {
            firstDayOfWeek = calendar.getFirstDayOfWeek();
        }
        int i11 = i10 - firstDayOfWeek;
        return i11 < 0 ? i11 + month.f44524s0 : i11;
    }

    @Override // android.widget.Adapter
    @Nullable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i10) {
        if (i10 < a() || i10 > c()) {
            return null;
        }
        int iA = (i10 - a()) + 1;
        Calendar calendarD = w.d(this.f44597p0.f44521p0);
        calendarD.set(5, iA);
        return Long.valueOf(calendarD.getTimeInMillis());
    }

    public final int c() {
        return (a() + this.f44597p0.f44525t0) - 1;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0114  */
    /* JADX WARN: Code duplicated, block: B:53:0x0125  */
    /* JADX WARN: Code duplicated, block: B:58:0x0141  */
    /* JADX WARN: Code duplicated, block: B:60:0x0148  */
    /* JADX WARN: Code duplicated, block: B:62:0x0154  */
    /* JADX WARN: Code duplicated, block: B:63:0x0159  */
    /* JADX WARN: Code duplicated, block: B:64:0x015e  */
    /* JADX WARN: Code duplicated, block: B:85:0x013b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:? A[LOOP:2: B:51:0x011f->B:86:?, LOOP_END, SYNTHETIC] */
    public final void d(@Nullable TextView textView, long j10, int i10) {
        boolean z10;
        boolean z11;
        String str;
        String str2;
        boolean zIsValid;
        a aVar;
        a aVar2;
        DayViewDecorator dayViewDecorator;
        Iterator<Long> it;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        boolean z12 = false;
        boolean z13 = w.h().getTimeInMillis() == j10;
        DateSelector<?> dateSelector = this.f44598q0;
        Iterator<Pair<Long, Long>> it2 = dateSelector.getSelectedRanges().iterator();
        while (true) {
            if (!it2.hasNext()) {
                z10 = false;
                break;
            }
            Long l6 = it2.next().first;
            if (l6 != null && l6.longValue() == j10) {
                z10 = true;
                break;
            }
        }
        Iterator<Pair<Long, Long>> it3 = dateSelector.getSelectedRanges().iterator();
        while (true) {
            if (!it3.hasNext()) {
                z11 = false;
                break;
            }
            Long l7 = it3.next().second;
            if (l7 != null && l7.longValue() == j10) {
                z11 = true;
                break;
            }
        }
        Calendar calendarH = w.h();
        Calendar calendarI = w.i(null);
        calendarI.setTimeInMillis(j10);
        if (calendarH.get(1) == calendarI.get(1)) {
            Locale locale = Locale.getDefault();
            str = Build.VERSION.SDK_INT >= 24 ? w.c("MMMMEEEEd", locale).format(new Date(j10)) : w.g(0, locale).format(new Date(j10));
        } else {
            Locale locale2 = Locale.getDefault();
            str = Build.VERSION.SDK_INT >= 24 ? w.c(DatePickerDefaults.YearMonthWeekdayDaySkeleton, locale2).format(new Date(j10)) : w.g(0, locale2).format(new Date(j10));
        }
        if (z13) {
            str = String.format(context.getString(R.string.mtrl_picker_today_description), str);
        }
        if (!z10) {
            if (z11) {
                str2 = String.format(context.getString(R.string.mtrl_picker_end_date_description), str);
            }
            textView.setContentDescription(str);
            zIsValid = this.f44601t0.getDateValidator().isValid(j10);
            if (zIsValid) {
                textView.setEnabled(true);
                it = dateSelector.getSelectedDays().iterator();
                while (it.hasNext()) {
                    if (w.a(j10) == w.a(it.next().longValue())) {
                        z12 = true;
                        break;
                    }
                }
                textView.setSelected(z12);
                if (z12) {
                    aVar = this.f44600s0.f44558b;
                } else if (w.h().getTimeInMillis() == j10) {
                    aVar = this.f44600s0.f44559c;
                } else {
                    aVar = this.f44600s0.f44557a;
                }
            } else {
                textView.setEnabled(false);
                aVar = this.f44600s0.f44563g;
            }
            aVar2 = aVar;
            boolean z14 = z12;
            dayViewDecorator = this.f44602u0;
            if (dayViewDecorator != null || i10 == -1) {
                aVar2.b(textView, null, null);
            }
            Month month = this.f44597p0;
            int i11 = month.f44523r0;
            int i12 = month.f44522q0;
            aVar2.b(textView, dayViewDecorator.getBackgroundColor(context, i11, i12, i10, zIsValid, z14), this.f44602u0.getTextColor(context, i11, i12, i10, zIsValid, z14));
            textView.setCompoundDrawables(this.f44602u0.getCompoundDrawableLeft(context, i11, i12, i10, zIsValid, z14), this.f44602u0.getCompoundDrawableTop(context, i11, i12, i10, zIsValid, z14), this.f44602u0.getCompoundDrawableRight(context, i11, i12, i10, zIsValid, z14), this.f44602u0.getCompoundDrawableBottom(context, i11, i12, i10, zIsValid, z14));
            textView.setContentDescription(this.f44602u0.getContentDescription(context, i11, i12, i10, zIsValid, z14, str));
            return;
        }
        str2 = String.format(context.getString(R.string.mtrl_picker_start_date_description), str);
        str = str2;
        textView.setContentDescription(str);
        zIsValid = this.f44601t0.getDateValidator().isValid(j10);
        if (zIsValid) {
            textView.setEnabled(true);
            it = dateSelector.getSelectedDays().iterator();
            while (it.hasNext()) {
                if (w.a(j10) == w.a(it.next().longValue())) {
                    z12 = true;
                    break;
                }
            }
            textView.setSelected(z12);
            if (z12) {
                aVar = this.f44600s0.f44558b;
            } else if (w.h().getTimeInMillis() == j10) {
                aVar = this.f44600s0.f44559c;
            } else {
                aVar = this.f44600s0.f44557a;
            }
        } else {
            textView.setEnabled(false);
            aVar = this.f44600s0.f44563g;
        }
        aVar2 = aVar;
        boolean z15 = z12;
        dayViewDecorator = this.f44602u0;
        if (dayViewDecorator != null) {
        }
        aVar2.b(textView, null, null);
    }

    public final void e(MaterialCalendarGridView materialCalendarGridView, long j10) {
        Month monthC = Month.c(j10);
        Month month = this.f44597p0;
        if (monthC.equals(month)) {
            Calendar calendarD = w.d(month.f44521p0);
            calendarD.setTimeInMillis(j10);
            int i10 = calendarD.get(5);
            d((TextView) materialCalendarGridView.getChildAt((materialCalendarGridView.b().a() + (i10 - 1)) - materialCalendarGridView.getFirstVisiblePosition()), j10, i10);
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return f44596w0;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10 / this.f44597p0.f44524s0;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005c  */
    @Override // android.widget.Adapter
    @NonNull
    public final View getView(int i10, @Nullable View view, @NonNull ViewGroup viewGroup) {
        int i11;
        Context context = viewGroup.getContext();
        if (this.f44600s0 == null) {
            this.f44600s0 = new b(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int iA = i10 - a();
        if (iA >= 0) {
            Month month = this.f44597p0;
            if (iA >= month.f44525t0) {
                textView.setVisibility(8);
                textView.setEnabled(false);
                i11 = -1;
            } else {
                i11 = iA + 1;
                textView.setTag(month);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(i11)));
                textView.setVisibility(0);
                textView.setEnabled(true);
            }
        } else {
            textView.setVisibility(8);
            textView.setEnabled(false);
            i11 = -1;
        }
        Long item = getItem(i10);
        if (item != null) {
            d(textView, item.longValue(), i11);
        }
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
