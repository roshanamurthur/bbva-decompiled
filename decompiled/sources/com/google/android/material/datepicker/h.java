package com.google.android.material.datepicker;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: compiled from: DaysOfWeekAdapter.java */
/* JADX INFO: loaded from: classes10.dex */
public final class h extends BaseAdapter {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final int f44575s0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final Calendar f44576p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f44577q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f44578r0;

    static {
        f44575s0 = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public h() {
        Calendar calendarI = w.i(null);
        this.f44576p0 = calendarI;
        this.f44577q0 = calendarI.getMaximum(7);
        this.f44578r0 = calendarI.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f44577q0;
    }

    @Override // android.widget.Adapter
    @Nullable
    public final Object getItem(int i10) {
        int i11 = this.f44577q0;
        if (i10 >= i11) {
            return null;
        }
        int i12 = i10 + this.f44578r0;
        if (i12 > i11) {
            i12 -= i11;
        }
        return Integer.valueOf(i12);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @Nullable
    @SuppressLint({"WrongConstant"})
    public final View getView(int i10, @Nullable View view, @NonNull ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i11 = i10 + this.f44578r0;
        int i12 = this.f44577q0;
        if (i11 > i12) {
            i11 -= i12;
        }
        Calendar calendar = this.f44576p0;
        calendar.set(7, i11);
        textView.setText(calendar.getDisplayName(7, f44575s0, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public h(int i10) {
        Calendar calendarI = w.i(null);
        this.f44576p0 = calendarI;
        this.f44577q0 = calendarI.getMaximum(7);
        this.f44578r0 = i10;
    }
}
