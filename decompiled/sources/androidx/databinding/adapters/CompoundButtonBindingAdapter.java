package androidx.databinding.adapters;

import android.widget.CompoundButton;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingAdapter;
import androidx.databinding.BindingMethod;
import androidx.databinding.BindingMethods;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.InverseBindingMethod;
import androidx.databinding.InverseBindingMethods;

/* JADX INFO: loaded from: classes2.dex */
@BindingMethods({@BindingMethod(attribute = "android:buttonTint", method = "setButtonTintList", type = CompoundButton.class), @BindingMethod(attribute = "android:onCheckedChanged", method = "setOnCheckedChangeListener", type = CompoundButton.class)})
@InverseBindingMethods({@InverseBindingMethod(attribute = "android:checked", type = CompoundButton.class)})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class CompoundButtonBindingAdapter {

    public class a implements CompoundButton.OnCheckedChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CompoundButton.OnCheckedChangeListener f20581a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InverseBindingListener f20582b;

        public a(CompoundButton.OnCheckedChangeListener onCheckedChangeListener, InverseBindingListener inverseBindingListener) {
            this.f20581a = onCheckedChangeListener;
            this.f20582b = inverseBindingListener;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f20581a;
            if (onCheckedChangeListener != null) {
                onCheckedChangeListener.onCheckedChanged(compoundButton, z10);
            }
            this.f20582b.onChange();
        }
    }

    @BindingAdapter({"android:checked"})
    public static void setChecked(CompoundButton compoundButton, boolean z10) {
        if (compoundButton.isChecked() != z10) {
            compoundButton.setChecked(z10);
        }
    }

    @BindingAdapter(requireAll = false, value = {"android:onCheckedChanged", "android:checkedAttrChanged"})
    public static void setListeners(CompoundButton compoundButton, CompoundButton.OnCheckedChangeListener onCheckedChangeListener, InverseBindingListener inverseBindingListener) {
        if (inverseBindingListener == null) {
            compoundButton.setOnCheckedChangeListener(onCheckedChangeListener);
        } else {
            compoundButton.setOnCheckedChangeListener(new a(onCheckedChangeListener, inverseBindingListener));
        }
    }
}
