package androidx.databinding.adapters;

import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingAdapter;
import androidx.databinding.BindingMethod;
import androidx.databinding.BindingMethods;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.InverseBindingMethod;
import androidx.databinding.InverseBindingMethods;

/* JADX INFO: loaded from: classes2.dex */
@BindingMethods({@BindingMethod(attribute = "android:onItemClick", method = "setOnItemClickListener", type = AdapterView.class), @BindingMethod(attribute = "android:onItemLongClick", method = "setOnItemLongClickListener", type = AdapterView.class)})
@InverseBindingMethods({@InverseBindingMethod(attribute = "android:selectedItemPosition", type = AdapterView.class), @InverseBindingMethod(attribute = "android:selection", event = "android:selectedItemPositionAttrChanged", method = "getSelectedItemPosition", type = AdapterView.class)})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class AdapterViewBindingAdapter {

    public interface OnItemSelected {
        void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10);
    }

    public static class OnItemSelectedComponentListener implements AdapterView.OnItemSelectedListener {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final OnItemSelected f20574p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final OnNothingSelected f20575q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final InverseBindingListener f20576r0;

        public OnItemSelectedComponentListener(OnItemSelected onItemSelected, OnNothingSelected onNothingSelected, InverseBindingListener inverseBindingListener) {
            this.f20574p0 = onItemSelected;
            this.f20575q0 = onNothingSelected;
            this.f20576r0 = inverseBindingListener;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            OnItemSelected onItemSelected = this.f20574p0;
            if (onItemSelected != null) {
                onItemSelected.onItemSelected(adapterView, view, i10, j10);
            }
            InverseBindingListener inverseBindingListener = this.f20576r0;
            if (inverseBindingListener != null) {
                inverseBindingListener.onChange();
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            OnNothingSelected onNothingSelected = this.f20575q0;
            if (onNothingSelected != null) {
                onNothingSelected.onNothingSelected(adapterView);
            }
            InverseBindingListener inverseBindingListener = this.f20576r0;
            if (inverseBindingListener != null) {
                inverseBindingListener.onChange();
            }
        }
    }

    public interface OnNothingSelected {
        void onNothingSelected(AdapterView<?> adapterView);
    }

    @BindingAdapter(requireAll = false, value = {"android:onItemSelected", "android:onNothingSelected", "android:selectedItemPositionAttrChanged"})
    public static void setOnItemSelectedListener(AdapterView adapterView, OnItemSelected onItemSelected, OnNothingSelected onNothingSelected, InverseBindingListener inverseBindingListener) {
        if (onItemSelected == null && onNothingSelected == null && inverseBindingListener == null) {
            adapterView.setOnItemSelectedListener(null);
        } else {
            adapterView.setOnItemSelectedListener(new OnItemSelectedComponentListener(onItemSelected, onNothingSelected, inverseBindingListener));
        }
    }

    @BindingAdapter({"android:selectedItemPosition"})
    public static void setSelectedItemPosition(AdapterView adapterView, int i10) {
        if (adapterView.getSelectedItemPosition() != i10) {
            adapterView.setSelection(i10);
        }
    }

    @BindingAdapter({"android:selection"})
    public static void setSelection(AdapterView adapterView, int i10) {
        setSelectedItemPosition(adapterView, i10);
    }

    @BindingAdapter({"android:selection", "android:adapter"})
    public static void setSelection(AdapterView adapterView, int i10, Adapter adapter) {
        setSelectedItemPosition(adapterView, i10, adapter);
    }

    @BindingAdapter({"android:selectedItemPosition", "android:adapter"})
    public static void setSelectedItemPosition(AdapterView adapterView, int i10, Adapter adapter) {
        if (adapter != adapterView.getAdapter()) {
            adapterView.setAdapter(adapter);
            adapterView.setSelection(i10);
        } else if (adapterView.getSelectedItemPosition() != i10) {
            adapterView.setSelection(i10);
        }
    }
}
