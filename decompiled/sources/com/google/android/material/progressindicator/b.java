package com.google.android.material.progressindicator;

import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.annotation.NonNull;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.animation.ArgbEvaluatorCompat;
import java.util.ArrayList;

/* JADX INFO: compiled from: CircularIndeterminateAnimatorDelegate.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b extends d<ObjectAnimator> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f45045k = {0, 1350, 2700, 4050};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f45046l = {667, 2017, 3367, 4717};
    public static final int[] m = {1000, 2350, 3700, 5050};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f45047n = new a(Float.class, "animationFraction");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C0199b f45048o = new C0199b(Float.class, "completeEndFraction");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ObjectAnimator f45049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ObjectAnimator f45050d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FastOutSlowInInterpolator f45051e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CircularProgressIndicatorSpec f45052f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f45053g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f45054h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f45055i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Animatable2Compat.AnimationCallback f45056j;

    /* JADX INFO: compiled from: CircularIndeterminateAnimatorDelegate.java */
    public class a extends Property<b, Float> {
        @Override // android.util.Property
        public final Float get(b bVar) {
            return Float.valueOf(bVar.f45054h);
        }

        @Override // android.util.Property
        public final void set(b bVar, Float f6) {
            FastOutSlowInInterpolator fastOutSlowInInterpolator;
            b bVar2 = bVar;
            float fFloatValue = f6.floatValue();
            bVar2.f45054h = fFloatValue;
            int i10 = (int) (fFloatValue * 5400.0f);
            ArrayList arrayList = bVar2.f45067b;
            DrawingDelegate.ActiveIndicator activeIndicator = (DrawingDelegate.ActiveIndicator) arrayList.get(0);
            float f10 = bVar2.f45054h * 1520.0f;
            activeIndicator.f45035a = (-20.0f) + f10;
            activeIndicator.f45036b = f10;
            int i11 = 0;
            while (true) {
                fastOutSlowInInterpolator = bVar2.f45051e;
                if (i11 >= 4) {
                    break;
                }
                activeIndicator.f45036b = (fastOutSlowInInterpolator.getInterpolation(d.b(i10, b.f45045k[i11], 667)) * 250.0f) + activeIndicator.f45036b;
                activeIndicator.f45035a = (fastOutSlowInInterpolator.getInterpolation(d.b(i10, b.f45046l[i11], 667)) * 250.0f) + activeIndicator.f45035a;
                i11++;
            }
            float f11 = activeIndicator.f45035a;
            float f12 = activeIndicator.f45036b;
            activeIndicator.f45035a = (((f12 - f11) * bVar2.f45055i) + f11) / 360.0f;
            activeIndicator.f45036b = f12 / 360.0f;
            for (int i12 = 0; i12 < 4; i12++) {
                float fB = d.b(i10, b.m[i12], 333);
                if (fB >= 0.0f && fB <= 1.0f) {
                    int i13 = i12 + bVar2.f45053g;
                    int[] iArr = bVar2.f45052f.indicatorColors;
                    int length = i13 % iArr.length;
                    int length2 = (length + 1) % iArr.length;
                    int i14 = iArr[length];
                    int i15 = iArr[length2];
                    ((DrawingDelegate.ActiveIndicator) arrayList.get(0)).f45037c = ArgbEvaluatorCompat.getInstance().evaluate(fastOutSlowInInterpolator.getInterpolation(fB), Integer.valueOf(i14), Integer.valueOf(i15)).intValue();
                    break;
                }
            }
            bVar2.f45066a.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.progressindicator.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CircularIndeterminateAnimatorDelegate.java */
    public class C0199b extends Property<b, Float> {
        @Override // android.util.Property
        public final Float get(b bVar) {
            return Float.valueOf(bVar.f45055i);
        }

        @Override // android.util.Property
        public final void set(b bVar, Float f6) {
            bVar.f45055i = f6.floatValue();
        }
    }

    public b(@NonNull CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(1);
        this.f45053g = 0;
        this.f45056j = null;
        this.f45052f = circularProgressIndicatorSpec;
        this.f45051e = new FastOutSlowInInterpolator();
    }

    @Override // com.google.android.material.progressindicator.d
    public final void a() {
        ObjectAnimator objectAnimator = this.f45049c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.d
    public final void c() {
        this.f45053g = 0;
        ((DrawingDelegate.ActiveIndicator) this.f45067b.get(0)).f45037c = this.f45052f.indicatorColors[0];
        this.f45055i = 0.0f;
    }

    @Override // com.google.android.material.progressindicator.d
    public final void d(@NonNull BaseProgressIndicator.c cVar) {
        this.f45056j = cVar;
    }

    @Override // com.google.android.material.progressindicator.d
    public final void e() {
        ObjectAnimator objectAnimator = this.f45050d;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (this.f45066a.isVisible()) {
            this.f45050d.start();
        } else {
            a();
        }
    }

    @Override // com.google.android.material.progressindicator.d
    public final void f() {
        if (this.f45049c == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f45047n, 0.0f, 1.0f);
            this.f45049c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(5400L);
            this.f45049c.setInterpolator(null);
            this.f45049c.setRepeatCount(-1);
            this.f45049c.addListener(new le.a(this));
        }
        if (this.f45050d == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, f45048o, 0.0f, 1.0f);
            this.f45050d = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(333L);
            this.f45050d.setInterpolator(this.f45051e);
            this.f45050d.addListener(new le.b(this));
        }
        this.f45053g = 0;
        ((DrawingDelegate.ActiveIndicator) this.f45067b.get(0)).f45037c = this.f45052f.indicatorColors[0];
        this.f45055i = 0.0f;
        this.f45049c.start();
    }

    @Override // com.google.android.material.progressindicator.d
    public final void g() {
        this.f45056j = null;
    }
}
