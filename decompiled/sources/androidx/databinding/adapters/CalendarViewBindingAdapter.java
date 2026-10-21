package androidx.databinding.adapters;

import android.widget.CalendarView;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingAdapter;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.InverseBindingMethod;
import androidx.databinding.InverseBindingMethods;

/* JADX INFO: loaded from: classes2.dex */
@InverseBindingMethods({@InverseBindingMethod(attribute = "android:date", type = CalendarView.class)})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class CalendarViewBindingAdapter {

    public class a implements CalendarView.OnDateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CalendarView.OnDateChangeListener f20579a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InverseBindingListener f20580b;

        public a(CalendarView.OnDateChangeListener onDateChangeListener, InverseBindingListener inverseBindingListener) {
            this.f20579a = onDateChangeListener;
            this.f20580b = inverseBindingListener;
        }

        @Override // android.widget.CalendarView.OnDateChangeListener
        public final void onSelectedDayChange(CalendarView calendarView, int i10, int i11, int i12) {
            CalendarView.OnDateChangeListener onDateChangeListener = this.f20579a;
            if (onDateChangeListener != null) {
                onDateChangeListener.onSelectedDayChange(calendarView, i10, i11, i12);
            }
            this.f20580b.onChange();
        }
    }

    @BindingAdapter({"android:date"})
    public static void setDate(CalendarView calendarView, long j10) {
        if (calendarView.getDate() != j10) {
            calendarView.setDate(j10);
        }
    }

    @BindingAdapter(requireAll = false, value = {"android:onSelectedDayChange", "android:dateAttrChanged"})
    public static void setListeners(CalendarView calendarView, CalendarView.OnDateChangeListener onDateChangeListener, InverseBindingListener inverseBindingListener) {
        if (inverseBindingListener == null) {
            calendarView.setOnDateChangeListener(onDateChangeListener);
        } else {
            calendarView.setOnDateChangeListener(new a(onDateChangeListener, inverseBindingListener));
        }
    }
}
