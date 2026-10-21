package androidx.databinding.adapters;

import android.widget.RatingBar;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingAdapter;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.InverseBindingMethod;
import androidx.databinding.InverseBindingMethods;

/* JADX INFO: loaded from: classes2.dex */
@InverseBindingMethods({@InverseBindingMethod(attribute = "android:rating", type = RatingBar.class)})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class RatingBarBindingAdapter {

    public class a implements RatingBar.OnRatingBarChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RatingBar.OnRatingBarChangeListener f20591a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InverseBindingListener f20592b;

        public a(RatingBar.OnRatingBarChangeListener onRatingBarChangeListener, InverseBindingListener inverseBindingListener) {
            this.f20591a = onRatingBarChangeListener;
            this.f20592b = inverseBindingListener;
        }

        @Override // android.widget.RatingBar.OnRatingBarChangeListener
        public final void onRatingChanged(RatingBar ratingBar, float f6, boolean z10) {
            RatingBar.OnRatingBarChangeListener onRatingBarChangeListener = this.f20591a;
            if (onRatingBarChangeListener != null) {
                onRatingBarChangeListener.onRatingChanged(ratingBar, f6, z10);
            }
            this.f20592b.onChange();
        }
    }

    @BindingAdapter(requireAll = false, value = {"android:onRatingChanged", "android:ratingAttrChanged"})
    public static void setListeners(RatingBar ratingBar, RatingBar.OnRatingBarChangeListener onRatingBarChangeListener, InverseBindingListener inverseBindingListener) {
        if (inverseBindingListener == null) {
            ratingBar.setOnRatingBarChangeListener(onRatingBarChangeListener);
        } else {
            ratingBar.setOnRatingBarChangeListener(new a(onRatingBarChangeListener, inverseBindingListener));
        }
    }

    @BindingAdapter({"android:rating"})
    public static void setRating(RatingBar ratingBar, float f6) {
        if (ratingBar.getRating() != f6) {
            ratingBar.setRating(f6);
        }
    }
}
