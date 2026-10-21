package androidx.databinding.adapters;

import android.widget.NumberPicker;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingAdapter;
import androidx.databinding.BindingMethod;
import androidx.databinding.BindingMethods;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.InverseBindingMethod;
import androidx.databinding.InverseBindingMethods;

/* JADX INFO: loaded from: classes2.dex */
@BindingMethods({@BindingMethod(attribute = "android:format", method = "setFormatter", type = NumberPicker.class), @BindingMethod(attribute = "android:onScrollStateChange", method = "setOnScrollListener", type = NumberPicker.class)})
@InverseBindingMethods({@InverseBindingMethod(attribute = "android:value", type = NumberPicker.class)})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class NumberPickerBindingAdapter {

    public class a implements NumberPicker.OnValueChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ NumberPicker.OnValueChangeListener f20587a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InverseBindingListener f20588b;

        public a(NumberPicker.OnValueChangeListener onValueChangeListener, InverseBindingListener inverseBindingListener) {
            this.f20587a = onValueChangeListener;
            this.f20588b = inverseBindingListener;
        }

        @Override // android.widget.NumberPicker.OnValueChangeListener
        public final void onValueChange(NumberPicker numberPicker, int i10, int i11) {
            NumberPicker.OnValueChangeListener onValueChangeListener = this.f20587a;
            if (onValueChangeListener != null) {
                onValueChangeListener.onValueChange(numberPicker, i10, i11);
            }
            this.f20588b.onChange();
        }
    }

    @BindingAdapter(requireAll = false, value = {"android:onValueChange", "android:valueAttrChanged"})
    public static void setListeners(NumberPicker numberPicker, NumberPicker.OnValueChangeListener onValueChangeListener, InverseBindingListener inverseBindingListener) {
        if (inverseBindingListener == null) {
            numberPicker.setOnValueChangedListener(onValueChangeListener);
        } else {
            numberPicker.setOnValueChangedListener(new a(onValueChangeListener, inverseBindingListener));
        }
    }

    @BindingAdapter({"android:value"})
    public static void setValue(NumberPicker numberPicker, int i10) {
        if (numberPicker.getValue() != i10) {
            numberPicker.setValue(i10);
        }
    }
}
