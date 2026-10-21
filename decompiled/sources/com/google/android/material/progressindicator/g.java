package com.google.android.material.progressindicator;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.core.math.MathUtils;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import androidx.vectordrawable.graphics.drawable.AnimationUtilsCompat;
import com.google.android.material.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: LinearIndeterminateDisjointAnimatorDelegate.java */
/* JADX INFO: loaded from: classes10.dex */
public final class g extends d<ObjectAnimator> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f45080k = {533, 567, 850, 750};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f45081l = {1267, 1000, 333, 0};
    public static final a m = new a(Float.class, "animationFraction");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ObjectAnimator f45082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ObjectAnimator f45083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Interpolator[] f45084e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinearProgressIndicatorSpec f45085f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f45086g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f45087h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f45088i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Animatable2Compat.AnimationCallback f45089j;

    /* JADX INFO: compiled from: LinearIndeterminateDisjointAnimatorDelegate.java */
    public class a extends Property<g, Float> {
        @Override // android.util.Property
        public final Float get(g gVar) {
            return Float.valueOf(gVar.f45088i);
        }

        @Override // android.util.Property
        public final void set(g gVar, Float f6) {
            ArrayList arrayList;
            g gVar2 = gVar;
            float fFloatValue = f6.floatValue();
            gVar2.f45088i = fFloatValue;
            int i10 = (int) (fFloatValue * 1800.0f);
            int i11 = 0;
            while (true) {
                arrayList = gVar2.f45067b;
                if (i11 >= arrayList.size()) {
                    break;
                }
                DrawingDelegate.ActiveIndicator activeIndicator = (DrawingDelegate.ActiveIndicator) arrayList.get(i11);
                int[] iArr = g.f45081l;
                int i12 = i11 * 2;
                int i13 = iArr[i12];
                int[] iArr2 = g.f45080k;
                float fB = d.b(i10, i13, iArr2[i12]);
                Interpolator[] interpolatorArr = gVar2.f45084e;
                activeIndicator.f45035a = MathUtils.clamp(interpolatorArr[i12].getInterpolation(fB), 0.0f, 1.0f);
                int i14 = i12 + 1;
                activeIndicator.f45036b = MathUtils.clamp(interpolatorArr[i14].getInterpolation(d.b(i10, iArr[i14], iArr2[i14])), 0.0f, 1.0f);
                i11++;
            }
            if (gVar2.f45087h) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((DrawingDelegate.ActiveIndicator) it.next()).f45037c = gVar2.f45085f.indicatorColors[gVar2.f45086g];
                }
                gVar2.f45087h = false;
            }
            gVar2.f45066a.invalidateSelf();
        }
    }

    public g(@NonNull Context context, @NonNull LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(2);
        this.f45086g = 0;
        this.f45089j = null;
        this.f45085f = linearProgressIndicatorSpec;
        this.f45084e = new Interpolator[]{AnimationUtilsCompat.loadInterpolator(context, R.anim.linear_indeterminate_line1_head_interpolator), AnimationUtilsCompat.loadInterpolator(context, R.anim.linear_indeterminate_line1_tail_interpolator), AnimationUtilsCompat.loadInterpolator(context, R.anim.linear_indeterminate_line2_head_interpolator), AnimationUtilsCompat.loadInterpolator(context, R.anim.linear_indeterminate_line2_tail_interpolator)};
    }

    @Override // com.google.android.material.progressindicator.d
    public final void a() {
        ObjectAnimator objectAnimator = this.f45082c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.d
    public final void c() {
        h();
    }

    @Override // com.google.android.material.progressindicator.d
    public final void d(@NonNull BaseProgressIndicator.c cVar) {
        this.f45089j = cVar;
    }

    @Override // com.google.android.material.progressindicator.d
    public final void e() {
        ObjectAnimator objectAnimator = this.f45083d;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        a();
        if (this.f45066a.isVisible()) {
            this.f45083d.setFloatValues(this.f45088i, 1.0f);
            this.f45083d.setDuration((long) ((1.0f - this.f45088i) * 1800.0f));
            this.f45083d.start();
        }
    }

    @Override // com.google.android.material.progressindicator.d
    public final void f() {
        ObjectAnimator objectAnimator = this.f45082c;
        a aVar = m;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, aVar, 0.0f, 1.0f);
            this.f45082c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(1800L);
            this.f45082c.setInterpolator(null);
            this.f45082c.setRepeatCount(-1);
            this.f45082c.addListener(new le.f(this));
        }
        if (this.f45083d == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, aVar, 1.0f);
            this.f45083d = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(1800L);
            this.f45083d.setInterpolator(null);
            this.f45083d.addListener(new le.g(this));
        }
        h();
        this.f45082c.start();
    }

    @Override // com.google.android.material.progressindicator.d
    public final void g() {
        this.f45089j = null;
    }

    @VisibleForTesting
    public final void h() {
        this.f45086g = 0;
        Iterator it = this.f45067b.iterator();
        while (it.hasNext()) {
            ((DrawingDelegate.ActiveIndicator) it.next()).f45037c = this.f45085f.indicatorColors[0];
        }
    }
}
