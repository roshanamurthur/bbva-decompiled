package com.google.android.material.progressindicator;

import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import java.util.ArrayList;

/* JADX INFO: compiled from: LinearIndeterminateContiguousAnimatorDelegate.java */
/* JADX INFO: loaded from: classes10.dex */
public final class f extends d<ObjectAnimator> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f45073i = new a(Float.class, "animationFraction");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ObjectAnimator f45074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FastOutSlowInInterpolator f45075d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinearProgressIndicatorSpec f45076e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f45077f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f45078g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f45079h;

    /* JADX INFO: compiled from: LinearIndeterminateContiguousAnimatorDelegate.java */
    public class a extends Property<f, Float> {
        @Override // android.util.Property
        public final Float get(f fVar) {
            return Float.valueOf(fVar.f45079h);
        }

        @Override // android.util.Property
        public final void set(f fVar, Float f6) {
            f fVar2 = fVar;
            float fFloatValue = f6.floatValue();
            fVar2.f45079h = fFloatValue;
            ArrayList arrayList = fVar2.f45067b;
            ((DrawingDelegate.ActiveIndicator) arrayList.get(0)).f45035a = 0.0f;
            float fB = d.b((int) (fFloatValue * 333.0f), 0, 667);
            DrawingDelegate.ActiveIndicator activeIndicator = (DrawingDelegate.ActiveIndicator) arrayList.get(0);
            DrawingDelegate.ActiveIndicator activeIndicator2 = (DrawingDelegate.ActiveIndicator) arrayList.get(1);
            FastOutSlowInInterpolator fastOutSlowInInterpolator = fVar2.f45075d;
            float interpolation = fastOutSlowInInterpolator.getInterpolation(fB);
            activeIndicator2.f45035a = interpolation;
            activeIndicator.f45036b = interpolation;
            DrawingDelegate.ActiveIndicator activeIndicator3 = (DrawingDelegate.ActiveIndicator) arrayList.get(1);
            DrawingDelegate.ActiveIndicator activeIndicator4 = (DrawingDelegate.ActiveIndicator) arrayList.get(2);
            float interpolation2 = fastOutSlowInInterpolator.getInterpolation(fB + 0.49925038f);
            activeIndicator4.f45035a = interpolation2;
            activeIndicator3.f45036b = interpolation2;
            ((DrawingDelegate.ActiveIndicator) arrayList.get(2)).f45036b = 1.0f;
            if (fVar2.f45078g && ((DrawingDelegate.ActiveIndicator) arrayList.get(1)).f45036b < 1.0f) {
                ((DrawingDelegate.ActiveIndicator) arrayList.get(2)).f45037c = ((DrawingDelegate.ActiveIndicator) arrayList.get(1)).f45037c;
                ((DrawingDelegate.ActiveIndicator) arrayList.get(1)).f45037c = ((DrawingDelegate.ActiveIndicator) arrayList.get(0)).f45037c;
                ((DrawingDelegate.ActiveIndicator) arrayList.get(0)).f45037c = fVar2.f45076e.indicatorColors[fVar2.f45077f];
                fVar2.f45078g = false;
            }
            fVar2.f45066a.invalidateSelf();
        }
    }

    public f(@NonNull LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(3);
        this.f45077f = 1;
        this.f45076e = linearProgressIndicatorSpec;
        this.f45075d = new FastOutSlowInInterpolator();
    }

    @Override // com.google.android.material.progressindicator.d
    public final void a() {
        ObjectAnimator objectAnimator = this.f45074c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.d
    public final void c() {
        h();
    }

    @Override // com.google.android.material.progressindicator.d
    public final void f() {
        if (this.f45074c == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f45073i, 0.0f, 1.0f);
            this.f45074c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(333L);
            this.f45074c.setInterpolator(null);
            this.f45074c.setRepeatCount(-1);
            this.f45074c.addListener(new le.e(this));
        }
        h();
        this.f45074c.start();
    }

    @VisibleForTesting
    public final void h() {
        this.f45078g = true;
        this.f45077f = 1;
        for (DrawingDelegate.ActiveIndicator activeIndicator : this.f45067b) {
            LinearProgressIndicatorSpec linearProgressIndicatorSpec = this.f45076e;
            activeIndicator.f45037c = linearProgressIndicatorSpec.indicatorColors[0];
            activeIndicator.f45038d = linearProgressIndicatorSpec.indicatorTrackGapSize / 2;
        }
    }

    @Override // com.google.android.material.progressindicator.d
    public final void e() {
    }

    @Override // com.google.android.material.progressindicator.d
    public final void g() {
    }

    @Override // com.google.android.material.progressindicator.d
    public final void d(@Nullable BaseProgressIndicator.c cVar) {
    }
}
