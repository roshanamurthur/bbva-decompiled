package androidx.databinding.adapters;

import android.widget.SeekBar;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingAdapter;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.InverseBindingMethod;
import androidx.databinding.InverseBindingMethods;

/* JADX INFO: loaded from: classes2.dex */
@InverseBindingMethods({@InverseBindingMethod(attribute = "android:progress", type = SeekBar.class)})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class SeekBarBindingAdapter {

    public interface OnProgressChanged {
        void onProgressChanged(SeekBar seekBar, int i10, boolean z10);
    }

    public interface OnStartTrackingTouch {
        void onStartTrackingTouch(SeekBar seekBar);
    }

    public interface OnStopTrackingTouch {
        void onStopTrackingTouch(SeekBar seekBar);
    }

    public class a implements SeekBar.OnSeekBarChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ OnProgressChanged f20597a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InverseBindingListener f20598b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ OnStartTrackingTouch f20599c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ OnStopTrackingTouch f20600d;

        public a(OnProgressChanged onProgressChanged, InverseBindingListener inverseBindingListener, OnStartTrackingTouch onStartTrackingTouch, OnStopTrackingTouch onStopTrackingTouch) {
            this.f20597a = onProgressChanged;
            this.f20598b = inverseBindingListener;
            this.f20599c = onStartTrackingTouch;
            this.f20600d = onStopTrackingTouch;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            OnProgressChanged onProgressChanged = this.f20597a;
            if (onProgressChanged != null) {
                onProgressChanged.onProgressChanged(seekBar, i10, z10);
            }
            InverseBindingListener inverseBindingListener = this.f20598b;
            if (inverseBindingListener != null) {
                inverseBindingListener.onChange();
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStartTrackingTouch(SeekBar seekBar) {
            OnStartTrackingTouch onStartTrackingTouch = this.f20599c;
            if (onStartTrackingTouch != null) {
                onStartTrackingTouch.onStartTrackingTouch(seekBar);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStopTrackingTouch(SeekBar seekBar) {
            OnStopTrackingTouch onStopTrackingTouch = this.f20600d;
            if (onStopTrackingTouch != null) {
                onStopTrackingTouch.onStopTrackingTouch(seekBar);
            }
        }
    }

    @BindingAdapter(requireAll = false, value = {"android:onStartTrackingTouch", "android:onStopTrackingTouch", "android:onProgressChanged", "android:progressAttrChanged"})
    public static void setOnSeekBarChangeListener(SeekBar seekBar, OnStartTrackingTouch onStartTrackingTouch, OnStopTrackingTouch onStopTrackingTouch, OnProgressChanged onProgressChanged, InverseBindingListener inverseBindingListener) {
        if (onStartTrackingTouch == null && onStopTrackingTouch == null && onProgressChanged == null && inverseBindingListener == null) {
            seekBar.setOnSeekBarChangeListener(null);
        } else {
            seekBar.setOnSeekBarChangeListener(new a(onProgressChanged, inverseBindingListener, onStartTrackingTouch, onStopTrackingTouch));
        }
    }

    @BindingAdapter({"android:progress"})
    public static void setProgress(SeekBar seekBar, int i10) {
        if (i10 != seekBar.getProgress()) {
            seekBar.setProgress(i10);
        }
    }
}
