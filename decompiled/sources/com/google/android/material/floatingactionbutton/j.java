package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.util.Preconditions;
import com.bbva.cells.component.kit.ui.property.impl.image.ImageScaleTypeHandler;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.animation.ImageMatrixProperty;
import com.google.android.material.animation.MatrixEvaluator;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.internal.StateListAnimator;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shadow.ShadowViewDelegate;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: FloatingActionButtonImpl.java */
/* JADX INFO: loaded from: classes10.dex */
public class j {
    public static final TimeInterpolator C = AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR;
    public static final int D = R.attr.motionDurationLong2;
    public static final int E = R.attr.motionEasingEmphasizedInterpolator;
    public static final int F = R.attr.motionDurationMedium1;
    public static final int G = R.attr.motionEasingEmphasizedAccelerateInterpolator;
    public static final int[] H = {android.R.attr.state_pressed, android.R.attr.state_enabled};
    public static final int[] I = {android.R.attr.state_hovered, android.R.attr.state_focused, android.R.attr.state_enabled};
    public static final int[] J = {android.R.attr.state_focused, android.R.attr.state_enabled};
    public static final int[] K = {android.R.attr.state_hovered, android.R.attr.state_enabled};
    public static final int[] L = {android.R.attr.state_enabled};
    public static final int[] M = new int[0];

    @Nullable
    public m B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public ShapeAppearanceModel f44716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public MaterialShapeDrawable f44717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Drawable f44718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public com.google.android.material.floatingactionbutton.c f44719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public LayerDrawable f44720e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f44721f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f44723h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f44724i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f44725j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f44726k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public Animator f44727l;

    @Nullable
    public MotionSpec m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public MotionSpec f44728n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f44729o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f44731q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ArrayList<Animator.AnimatorListener> f44733s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ArrayList<Animator.AnimatorListener> f44734t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ArrayList<e> f44735u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final FloatingActionButton f44736v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ShadowViewDelegate f44737w;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f44722g = true;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f44730p = 1.0f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f44732r = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Rect f44738x = new Rect();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final RectF f44739y = new RectF();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final RectF f44740z = new RectF();
    public final Matrix A = new Matrix();

    /* JADX INFO: compiled from: FloatingActionButtonImpl.java */
    public class a extends MatrixEvaluator {
        public a() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.android.material.animation.MatrixEvaluator, android.animation.TypeEvaluator
        public final Matrix evaluate(float f6, @NonNull Matrix matrix, @NonNull Matrix matrix2) {
            j.this.f44730p = f6;
            return super.evaluate(f6, matrix, matrix2);
        }
    }

    /* JADX INFO: compiled from: FloatingActionButtonImpl.java */
    public class b extends h {
        @Override // com.google.android.material.floatingactionbutton.j.h
        public final float a() {
            return 0.0f;
        }
    }

    /* JADX INFO: compiled from: FloatingActionButtonImpl.java */
    public class c extends h {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ j f44742e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(n nVar) {
            super(nVar);
            this.f44742e = nVar;
        }

        @Override // com.google.android.material.floatingactionbutton.j.h
        public final float a() {
            j jVar = this.f44742e;
            return jVar.f44723h + jVar.f44724i;
        }
    }

    /* JADX INFO: compiled from: FloatingActionButtonImpl.java */
    public class d extends h {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ j f44743e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(n nVar) {
            super(nVar);
            this.f44743e = nVar;
        }

        @Override // com.google.android.material.floatingactionbutton.j.h
        public final float a() {
            j jVar = this.f44743e;
            return jVar.f44723h + jVar.f44725j;
        }
    }

    /* JADX INFO: compiled from: FloatingActionButtonImpl.java */
    public interface e {
        void a();

        void b();
    }

    /* JADX INFO: compiled from: FloatingActionButtonImpl.java */
    public interface f {
    }

    /* JADX INFO: compiled from: FloatingActionButtonImpl.java */
    public class g extends h {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ j f44744e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(n nVar) {
            super(nVar);
            this.f44744e = nVar;
        }

        @Override // com.google.android.material.floatingactionbutton.j.h
        public final float a() {
            return this.f44744e.f44723h;
        }
    }

    /* JADX INFO: compiled from: FloatingActionButtonImpl.java */
    public abstract class h extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f44745a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f44746b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f44747c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ j f44748d;

        public h(n nVar) {
            this.f44748d = nVar;
        }

        public abstract float a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            float f6 = (int) this.f44747c;
            MaterialShapeDrawable materialShapeDrawable = this.f44748d.f44717b;
            if (materialShapeDrawable != null) {
                materialShapeDrawable.setElevation(f6);
            }
            this.f44745a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            boolean z10 = this.f44745a;
            j jVar = this.f44748d;
            if (!z10) {
                MaterialShapeDrawable materialShapeDrawable = jVar.f44717b;
                this.f44746b = materialShapeDrawable == null ? 0.0f : materialShapeDrawable.getElevation();
                this.f44747c = a();
                this.f44745a = true;
            }
            float f6 = this.f44746b;
            float animatedFraction = (int) ((valueAnimator.getAnimatedFraction() * (this.f44747c - f6)) + f6);
            MaterialShapeDrawable materialShapeDrawable2 = jVar.f44717b;
            if (materialShapeDrawable2 != null) {
                materialShapeDrawable2.setElevation(animatedFraction);
            }
        }
    }

    public j(FloatingActionButton floatingActionButton, FloatingActionButton.a aVar) {
        this.f44736v = floatingActionButton;
        this.f44737w = aVar;
        StateListAnimator stateListAnimator = new StateListAnimator();
        n nVar = (n) this;
        stateListAnimator.addState(H, d(new d(nVar)));
        stateListAnimator.addState(I, d(new c(nVar)));
        stateListAnimator.addState(J, d(new c(nVar)));
        stateListAnimator.addState(K, d(new c(nVar)));
        stateListAnimator.addState(L, d(new g(nVar)));
        stateListAnimator.addState(M, d(new b(nVar)));
        this.f44729o = floatingActionButton.getRotation();
    }

    @NonNull
    public static ValueAnimator d(@NonNull h hVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(C);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(hVar);
        valueAnimator.addUpdateListener(hVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    public final void a(float f6, @NonNull Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f44736v.getDrawable();
        if (drawable == null || this.f44731q == 0) {
            return;
        }
        RectF rectF = this.f44739y;
        RectF rectF2 = this.f44740z;
        rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        int i10 = this.f44731q;
        rectF2.set(0.0f, 0.0f, i10, i10);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i11 = this.f44731q;
        matrix.postScale(f6, f6, i11 / 2.0f, i11 / 2.0f);
    }

    @NonNull
    public final AnimatorSet b(@NonNull MotionSpec motionSpec, float f6, float f10, float f11) {
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float[] fArr = {f6};
        FloatingActionButton floatingActionButton = this.f44736v;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) property, fArr);
        motionSpec.getTiming("opacity").apply(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_X, f10);
        motionSpec.getTiming(ImageScaleTypeHandler.ID).apply(objectAnimatorOfFloat2);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 26) {
            l lVar = new l();
            lVar.f44758a = new FloatEvaluator();
            objectAnimatorOfFloat2.setEvaluator(lVar);
        }
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_Y, f10);
        motionSpec.getTiming(ImageScaleTypeHandler.ID).apply(objectAnimatorOfFloat3);
        if (i10 == 26) {
            l lVar2 = new l();
            lVar2.f44758a = new FloatEvaluator();
            objectAnimatorOfFloat3.setEvaluator(lVar2);
        }
        arrayList.add(objectAnimatorOfFloat3);
        Matrix matrix = this.A;
        a(f11, matrix);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(floatingActionButton, new ImageMatrixProperty(), new a(), new Matrix(matrix));
        motionSpec.getTiming("iconScale").apply(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSetCompat.playTogether(animatorSet, arrayList);
        return animatorSet;
    }

    public final AnimatorSet c(float f6, int i10, int i11, float f10, float f11) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        FloatingActionButton floatingActionButton = this.f44736v;
        valueAnimatorOfFloat.addUpdateListener(new k(this, floatingActionButton.getAlpha(), f6, floatingActionButton.getScaleX(), f10, floatingActionButton.getScaleY(), this.f44730p, f11, new Matrix(this.A)));
        arrayList.add(valueAnimatorOfFloat);
        AnimatorSetCompat.playTogether(animatorSet, arrayList);
        animatorSet.setDuration(MotionUtils.resolveThemeDuration(floatingActionButton.getContext(), i10, floatingActionButton.getContext().getResources().getInteger(R.integer.material_motion_duration_long_1)));
        animatorSet.setInterpolator(MotionUtils.resolveThemeInterpolator(floatingActionButton.getContext(), i11, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        return animatorSet;
    }

    public float e() {
        throw null;
    }

    public void f(@NonNull Rect rect) {
        int iMax = this.f44721f ? Math.max((this.f44726k - this.f44736v.getSizeDimension()) / 2, 0) : 0;
        float fE = this.f44722g ? e() + this.f44725j : 0.0f;
        int iMax2 = Math.max(iMax, (int) Math.ceil(fE));
        int iMax3 = Math.max(iMax, (int) Math.ceil(fE * 1.5f));
        rect.set(iMax2, iMax3, iMax2, iMax3);
    }

    public void g(ColorStateList colorStateList, @Nullable PorterDuff.Mode mode, ColorStateList colorStateList2, int i10) {
        throw null;
    }

    public void h() {
        throw null;
    }

    public void i() {
        throw null;
    }

    public void j(int[] iArr) {
        throw null;
    }

    public void k(float f6, float f10, float f11) {
        throw null;
    }

    public final void l() {
        ArrayList<e> arrayList = this.f44735u;
        if (arrayList != null) {
            Iterator<e> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    public void m(@Nullable ColorStateList colorStateList) {
        Drawable drawable = this.f44718c;
        if (drawable != null) {
            DrawableCompat.setTintList(drawable, RippleUtils.sanitizeRippleDrawableColor(colorStateList));
        }
    }

    public final void n(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        this.f44716a = shapeAppearanceModel;
        MaterialShapeDrawable materialShapeDrawable = this.f44717b;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModel);
        }
        Object obj = this.f44718c;
        if (obj instanceof Shapeable) {
            ((Shapeable) obj).setShapeAppearanceModel(shapeAppearanceModel);
        }
        com.google.android.material.floatingactionbutton.c cVar = this.f44719d;
        if (cVar != null) {
            cVar.f44698o = shapeAppearanceModel;
            cVar.invalidateSelf();
        }
    }

    public boolean o() {
        throw null;
    }

    public void p() {
        throw null;
    }

    public final void q() {
        Rect rect = this.f44738x;
        f(rect);
        Preconditions.checkNotNull(this.f44720e, "Didn't initialize content background");
        boolean zO = o();
        ShadowViewDelegate shadowViewDelegate = this.f44737w;
        if (zO) {
            shadowViewDelegate.setBackgroundDrawable(new InsetDrawable((Drawable) this.f44720e, rect.left, rect.top, rect.right, rect.bottom));
        } else {
            shadowViewDelegate.setBackgroundDrawable(this.f44720e);
        }
        shadowViewDelegate.setShadowPadding(rect.left, rect.top, rect.right, rect.bottom);
    }
}
