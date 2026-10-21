package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import androidx.annotation.AnimRes;
import androidx.annotation.NonNull;
import androidx.core.view.OneShotPreDrawListener;

/* JADX INFO: compiled from: FragmentAnim.java */
/* JADX INFO: loaded from: classes2.dex */
public final class o {
    @AnimRes
    public static int a(@NonNull Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i10});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    /* JADX INFO: compiled from: FragmentAnim.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Animation f21733a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Animator f21734b;

        public a(Animation animation) {
            this.f21733a = animation;
            this.f21734b = null;
        }

        public a(Animator animator) {
            this.f21733a = null;
            this.f21734b = animator;
        }
    }

    /* JADX INFO: compiled from: FragmentAnim.java */
    public static class b extends AnimationSet implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final ViewGroup f21735p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final View f21736q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f21737r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f21738s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f21739t0;

        public b(@NonNull Animation animation, @NonNull ViewGroup viewGroup, @NonNull View view) {
            super(false);
            this.f21739t0 = true;
            this.f21735p0 = viewGroup;
            this.f21736q0 = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public final boolean getTransformation(long j10, @NonNull Transformation transformation) {
            this.f21739t0 = true;
            if (this.f21737r0) {
                return !this.f21738s0;
            }
            if (!super.getTransformation(j10, transformation)) {
                this.f21737r0 = true;
                OneShotPreDrawListener.add(this.f21735p0, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z10 = this.f21737r0;
            ViewGroup viewGroup = this.f21735p0;
            if (z10 || !this.f21739t0) {
                viewGroup.endViewTransition(this.f21736q0);
                this.f21738s0 = true;
            } else {
                this.f21739t0 = false;
                viewGroup.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public final boolean getTransformation(long j10, @NonNull Transformation transformation, float f6) {
            this.f21739t0 = true;
            if (this.f21737r0) {
                return !this.f21738s0;
            }
            if (!super.getTransformation(j10, transformation, f6)) {
                this.f21737r0 = true;
                OneShotPreDrawListener.add(this.f21735p0, this);
            }
            return true;
        }
    }
}
