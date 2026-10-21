package androidx.databinding.adapters;

import android.widget.RadioGroup;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingAdapter;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.InverseBindingMethod;
import androidx.databinding.InverseBindingMethods;

/* JADX INFO: loaded from: classes2.dex */
@InverseBindingMethods({@InverseBindingMethod(attribute = "android:checkedButton", method = "getCheckedRadioButtonId", type = RadioGroup.class)})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class RadioGroupBindingAdapter {

    public class a implements RadioGroup.OnCheckedChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RadioGroup.OnCheckedChangeListener f20589a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InverseBindingListener f20590b;

        public a(RadioGroup.OnCheckedChangeListener onCheckedChangeListener, InverseBindingListener inverseBindingListener) {
            this.f20589a = onCheckedChangeListener;
            this.f20590b = inverseBindingListener;
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public final void onCheckedChanged(RadioGroup radioGroup, int i10) {
            RadioGroup.OnCheckedChangeListener onCheckedChangeListener = this.f20589a;
            if (onCheckedChangeListener != null) {
                onCheckedChangeListener.onCheckedChanged(radioGroup, i10);
            }
            this.f20590b.onChange();
        }
    }

    @BindingAdapter({"android:checkedButton"})
    public static void setCheckedButton(RadioGroup radioGroup, int i10) {
        if (i10 != radioGroup.getCheckedRadioButtonId()) {
            radioGroup.check(i10);
        }
    }

    @BindingAdapter(requireAll = false, value = {"android:onCheckedChanged", "android:checkedButtonAttrChanged"})
    public static void setListeners(RadioGroup radioGroup, RadioGroup.OnCheckedChangeListener onCheckedChangeListener, InverseBindingListener inverseBindingListener) {
        if (inverseBindingListener == null) {
            radioGroup.setOnCheckedChangeListener(onCheckedChangeListener);
        } else {
            radioGroup.setOnCheckedChangeListener(new a(onCheckedChangeListener, inverseBindingListener));
        }
    }
}
