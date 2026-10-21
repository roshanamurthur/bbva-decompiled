package androidx.databinding.adapters;

import android.widget.DatePicker;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingAdapter;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.InverseBindingMethod;
import androidx.databinding.InverseBindingMethods;
import androidx.databinding.library.baseAdapters.R;

/* JADX INFO: loaded from: classes2.dex */
@InverseBindingMethods({@InverseBindingMethod(attribute = "android:year", type = DatePicker.class), @InverseBindingMethod(attribute = "android:month", type = DatePicker.class), @InverseBindingMethod(attribute = "android:day", method = "getDayOfMonth", type = DatePicker.class)})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class DatePickerBindingAdapter {

    public static class a implements DatePicker.OnDateChangedListener {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public DatePicker.OnDateChangedListener f20583p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public InverseBindingListener f20584q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public InverseBindingListener f20585r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public InverseBindingListener f20586s0;

        @Override // android.widget.DatePicker.OnDateChangedListener
        public final void onDateChanged(DatePicker datePicker, int i10, int i11, int i12) {
            DatePicker.OnDateChangedListener onDateChangedListener = this.f20583p0;
            if (onDateChangedListener != null) {
                onDateChangedListener.onDateChanged(datePicker, i10, i11, i12);
            }
            InverseBindingListener inverseBindingListener = this.f20584q0;
            if (inverseBindingListener != null) {
                inverseBindingListener.onChange();
            }
            InverseBindingListener inverseBindingListener2 = this.f20585r0;
            if (inverseBindingListener2 != null) {
                inverseBindingListener2.onChange();
            }
            InverseBindingListener inverseBindingListener3 = this.f20586s0;
            if (inverseBindingListener3 != null) {
                inverseBindingListener3.onChange();
            }
        }
    }

    @BindingAdapter(requireAll = false, value = {"android:year", "android:month", "android:day", "android:onDateChanged", "android:yearAttrChanged", "android:monthAttrChanged", "android:dayAttrChanged"})
    public static void setListeners(DatePicker datePicker, int i10, int i11, int i12, DatePicker.OnDateChangedListener onDateChangedListener, InverseBindingListener inverseBindingListener, InverseBindingListener inverseBindingListener2, InverseBindingListener inverseBindingListener3) {
        if (i10 == 0) {
            i10 = datePicker.getYear();
        }
        if (i12 == 0) {
            i12 = datePicker.getDayOfMonth();
        }
        if (inverseBindingListener == null && inverseBindingListener2 == null && inverseBindingListener3 == null) {
            datePicker.init(i10, i11, i12, onDateChangedListener);
            return;
        }
        int i13 = R.id.onDateChanged;
        a aVar = (a) ListenerUtil.getListener(datePicker, i13);
        if (aVar == null) {
            aVar = new a();
            ListenerUtil.trackListener(datePicker, aVar, i13);
        }
        aVar.f20583p0 = onDateChangedListener;
        aVar.f20584q0 = inverseBindingListener;
        aVar.f20585r0 = inverseBindingListener2;
        aVar.f20586s0 = inverseBindingListener3;
        datePicker.init(i10, i11, i12, aVar);
    }
}
