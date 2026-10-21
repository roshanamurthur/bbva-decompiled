package androidx.databinding.adapters;

import android.widget.TimePicker;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingAdapter;
import androidx.databinding.InverseBindingAdapter;
import androidx.databinding.InverseBindingListener;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class TimePickerBindingAdapter {

    public class a implements TimePicker.OnTimeChangedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TimePicker.OnTimeChangedListener f20608a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InverseBindingListener f20609b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InverseBindingListener f20610c;

        public a(TimePicker.OnTimeChangedListener onTimeChangedListener, InverseBindingListener inverseBindingListener, InverseBindingListener inverseBindingListener2) {
            this.f20608a = onTimeChangedListener;
            this.f20609b = inverseBindingListener;
            this.f20610c = inverseBindingListener2;
        }

        @Override // android.widget.TimePicker.OnTimeChangedListener
        public final void onTimeChanged(TimePicker timePicker, int i10, int i11) {
            TimePicker.OnTimeChangedListener onTimeChangedListener = this.f20608a;
            if (onTimeChangedListener != null) {
                onTimeChangedListener.onTimeChanged(timePicker, i10, i11);
            }
            InverseBindingListener inverseBindingListener = this.f20609b;
            if (inverseBindingListener != null) {
                inverseBindingListener.onChange();
            }
            InverseBindingListener inverseBindingListener2 = this.f20610c;
            if (inverseBindingListener2 != null) {
                inverseBindingListener2.onChange();
            }
        }
    }

    @InverseBindingAdapter(attribute = "android:hour")
    public static int getHour(TimePicker timePicker) {
        return timePicker.getHour();
    }

    @InverseBindingAdapter(attribute = "android:minute")
    public static int getMinute(TimePicker timePicker) {
        return timePicker.getMinute();
    }

    @BindingAdapter({"android:hour"})
    public static void setHour(TimePicker timePicker, int i10) {
        if (timePicker.getHour() != i10) {
            timePicker.setHour(i10);
        }
    }

    @BindingAdapter(requireAll = false, value = {"android:onTimeChanged", "android:hourAttrChanged", "android:minuteAttrChanged"})
    public static void setListeners(TimePicker timePicker, TimePicker.OnTimeChangedListener onTimeChangedListener, InverseBindingListener inverseBindingListener, InverseBindingListener inverseBindingListener2) {
        if (inverseBindingListener == null && inverseBindingListener2 == null) {
            timePicker.setOnTimeChangedListener(onTimeChangedListener);
        } else {
            timePicker.setOnTimeChangedListener(new a(onTimeChangedListener, inverseBindingListener, inverseBindingListener2));
        }
    }

    @BindingAdapter({"android:minute"})
    public static void setMinute(TimePicker timePicker, int i10) {
        if (timePicker.getMinute() != i10) {
            timePicker.setMinute(i10);
        }
    }
}
