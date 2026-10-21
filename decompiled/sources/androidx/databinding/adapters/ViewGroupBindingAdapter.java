package androidx.databinding.adapters;

import android.animation.LayoutTransition;
import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingAdapter;
import androidx.databinding.BindingMethod;
import androidx.databinding.BindingMethods;

/* JADX INFO: loaded from: classes2.dex */
@BindingMethods({@BindingMethod(attribute = "android:alwaysDrawnWithCache", method = "setAlwaysDrawnWithCacheEnabled", type = ViewGroup.class), @BindingMethod(attribute = "android:animationCache", method = "setAnimationCacheEnabled", type = ViewGroup.class), @BindingMethod(attribute = "android:splitMotionEvents", method = "setMotionEventSplittingEnabled", type = ViewGroup.class)})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class ViewGroupBindingAdapter {

    public interface OnAnimationEnd {
        void onAnimationEnd(Animation animation);
    }

    public interface OnAnimationRepeat {
        void onAnimationRepeat(Animation animation);
    }

    public interface OnAnimationStart {
        void onAnimationStart(Animation animation);
    }

    public interface OnChildViewAdded {
        void onChildViewAdded(View view, View view2);
    }

    public interface OnChildViewRemoved {
        void onChildViewRemoved(View view, View view2);
    }

    public class a implements ViewGroup.OnHierarchyChangeListener {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ OnChildViewAdded f20613p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ OnChildViewRemoved f20614q0;

        public a(OnChildViewAdded onChildViewAdded, OnChildViewRemoved onChildViewRemoved) {
            this.f20613p0 = onChildViewAdded;
            this.f20614q0 = onChildViewRemoved;
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(View view, View view2) {
            OnChildViewAdded onChildViewAdded = this.f20613p0;
            if (onChildViewAdded != null) {
                onChildViewAdded.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View view, View view2) {
            OnChildViewRemoved onChildViewRemoved = this.f20614q0;
            if (onChildViewRemoved != null) {
                onChildViewRemoved.onChildViewRemoved(view, view2);
            }
        }
    }

    public class b implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ OnAnimationStart f20615a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ OnAnimationEnd f20616b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ OnAnimationRepeat f20617c;

        public b(OnAnimationStart onAnimationStart, OnAnimationEnd onAnimationEnd, OnAnimationRepeat onAnimationRepeat) {
            this.f20615a = onAnimationStart;
            this.f20616b = onAnimationEnd;
            this.f20617c = onAnimationRepeat;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            OnAnimationEnd onAnimationEnd = this.f20616b;
            if (onAnimationEnd != null) {
                onAnimationEnd.onAnimationEnd(animation);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
            OnAnimationRepeat onAnimationRepeat = this.f20617c;
            if (onAnimationRepeat != null) {
                onAnimationRepeat.onAnimationRepeat(animation);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
            OnAnimationStart onAnimationStart = this.f20615a;
            if (onAnimationStart != null) {
                onAnimationStart.onAnimationStart(animation);
            }
        }
    }

    @BindingAdapter({"android:animateLayoutChanges"})
    @TargetApi(11)
    public static void setAnimateLayoutChanges(ViewGroup viewGroup, boolean z10) {
        if (z10) {
            viewGroup.setLayoutTransition(new LayoutTransition());
        } else {
            viewGroup.setLayoutTransition(null);
        }
    }

    @BindingAdapter(requireAll = false, value = {"android:onChildViewAdded", "android:onChildViewRemoved"})
    public static void setListener(ViewGroup viewGroup, OnChildViewAdded onChildViewAdded, OnChildViewRemoved onChildViewRemoved) {
        if (onChildViewAdded == null && onChildViewRemoved == null) {
            viewGroup.setOnHierarchyChangeListener(null);
        } else {
            viewGroup.setOnHierarchyChangeListener(new a(onChildViewAdded, onChildViewRemoved));
        }
    }

    @BindingAdapter(requireAll = false, value = {"android:onAnimationStart", "android:onAnimationEnd", "android:onAnimationRepeat"})
    public static void setListener(ViewGroup viewGroup, OnAnimationStart onAnimationStart, OnAnimationEnd onAnimationEnd, OnAnimationRepeat onAnimationRepeat) {
        if (onAnimationStart == null && onAnimationEnd == null && onAnimationRepeat == null) {
            viewGroup.setLayoutAnimationListener(null);
        } else {
            viewGroup.setLayoutAnimationListener(new b(onAnimationStart, onAnimationEnd, onAnimationRepeat));
        }
    }
}
