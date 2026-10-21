package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public final class YearGridAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final MaterialCalendar<?> f44549p0;

    public static class ViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final TextView f44550p0;

        public ViewHolder(TextView textView) {
            super(textView);
            this.f44550p0 = textView;
        }
    }

    public YearGridAdapter(MaterialCalendar<?> materialCalendar) {
        this.f44549p0 = materialCalendar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f44549p0.f44477r0.f44461u0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i10) {
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        MaterialCalendar<?> materialCalendar = this.f44549p0;
        int i11 = materialCalendar.f44477r0.f44456p0.f44523r0 + i10;
        viewHolder2.f44550p0.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i11)));
        TextView textView = viewHolder2.f44550p0;
        Context context = textView.getContext();
        textView.setContentDescription(w.h().get(1) == i11 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i11)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i11)));
        b bVar = materialCalendar.v0;
        Calendar calendarH = w.h();
        a aVar = calendarH.get(1) == i11 ? bVar.f44562f : bVar.f44560d;
        Iterator<Long> it = materialCalendar.getDateSelector().getSelectedDays().iterator();
        while (it.hasNext()) {
            calendarH.setTimeInMillis(it.next().longValue());
            if (calendarH.get(1) == i11) {
                aVar = bVar.f44561e;
            }
        }
        aVar.b(textView, null, null);
        textView.setOnClickListener(new x(this, i11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public final RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i10) {
        return new ViewHolder((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
