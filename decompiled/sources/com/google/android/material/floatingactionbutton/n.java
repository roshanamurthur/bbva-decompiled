package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import androidx.core.util.Preconditions;
import com.google.android.material.R;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.util.ArrayList;

/* JADX INFO: compiled from: FloatingActionButtonImplLollipop.java */
/* JADX INFO: loaded from: classes10.dex */
@RequiresApi(21)
public final class n extends j {

    @Nullable
    public StateListAnimator N;

    /* JADX INFO: compiled from: FloatingActionButtonImplLollipop.java */
    public static class a extends MaterialShapeDrawable {
        @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
        public final boolean isStateful() {
            return true;
        }
    }

    @Override // com.google.android.material.floatingactionbutton.j
    public final float e() {
        return this.f44736v.getElevation();
    }

    @Override // com.google.android.material.floatingactionbutton.j
    public final void f(@NonNull Rect rect) {
        if (this.f44737w.isCompatPaddingEnabled()) {
            super.f(rect);
            return;
        }
        if (this.f44721f) {
            FloatingActionButton floatingActionButton = this.f44736v;
            int sizeDimension = floatingActionButton.getSizeDimension();
            int i10 = this.f44726k;
            if (sizeDimension < i10) {
                int sizeDimension2 = (i10 - floatingActionButton.getSizeDimension()) / 2;
                rect.set(sizeDimension2, sizeDimension2, sizeDimension2, sizeDimension2);
                return;
            }
        }
        rect.set(0, 0, 0, 0);
    }

    @Override // com.google.android.material.floatingactionbutton.j
    public final void g(ColorStateList colorStateList, @Nullable PorterDuff.Mode mode, ColorStateList colorStateList2, int i10) {
        Drawable layerDrawable;
        MaterialShapeDrawable materialShapeDrawableS = s();
        this.f44717b = materialShapeDrawableS;
        materialShapeDrawableS.setTintList(colorStateList);
        if (mode != null) {
            this.f44717b.setTintMode(mode);
        }
        MaterialShapeDrawable materialShapeDrawable = this.f44717b;
        FloatingActionButton floatingActionButton = this.f44736v;
        materialShapeDrawable.initializeElevationOverlay(floatingActionButton.getContext());
        if (i10 > 0) {
            Context context = floatingActionButton.getContext();
            c cVar = new c((ShapeAppearanceModel) Preconditions.checkNotNull(this.f44716a));
            int color = ContextCompat.getColor(context, R.color.design_fab_stroke_top_outer_color);
            int color2 = ContextCompat.getColor(context, R.color.design_fab_stroke_top_inner_color);
            int color3 = ContextCompat.getColor(context, R.color.design_fab_stroke_end_inner_color);
            int color4 = ContextCompat.getColor(context, R.color.design_fab_stroke_end_outer_color);
            cVar.f44693i = color;
            cVar.f44694j = color2;
            cVar.f44695k = color3;
            cVar.f44696l = color4;
            float f6 = i10;
            if (cVar.f44692h != f6) {
                cVar.f44692h = f6;
                cVar.f44686b.setStrokeWidth(f6 * 1.3333f);
                cVar.f44697n = true;
                cVar.invalidateSelf();
            }
            if (colorStateList != null) {
                cVar.m = colorStateList.getColorForState(cVar.getState(), cVar.m);
            }
            cVar.f44699p = colorStateList;
            cVar.f44697n = true;
            cVar.invalidateSelf();
            this.f44719d = cVar;
            layerDrawable = new LayerDrawable(new Drawable[]{(Drawable) Preconditions.checkNotNull(this.f44719d), (Drawable) Preconditions.checkNotNull(this.f44717b)});
        } else {
            this.f44719d = null;
            layerDrawable = this.f44717b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(RippleUtils.sanitizeRippleDrawableColor(colorStateList2), layerDrawable, null);
        this.f44718c = rippleDrawable;
        this.f44720e = rippleDrawable;
    }

    @Override // com.google.android.material.floatingactionbutton.j
    public final void i() {
        q();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.material.floatingactionbutton.j
    public final void k(float f6, float f10, float f11) {
        int i10 = Build.VERSION.SDK_INT;
        FloatingActionButton floatingActionButton = this.f44736v;
        if (floatingActionButton.getStateListAnimator() == this.N) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(j.H, r(f6, f11));
            stateListAnimator.addState(j.I, r(f6, f10));
            stateListAnimator.addState(j.J, r(f6, f10));
            stateListAnimator.addState(j.K, r(f6, f10));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f6).setDuration(0L));
            if (i10 <= 24) {
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(j.C);
            stateListAnimator.addState(j.L, animatorSet);
            stateListAnimator.addState(j.M, r(0.0f, 0.0f));
            this.N = stateListAnimator;
            floatingActionButton.setStateListAnimator(stateListAnimator);
        }
        if (o()) {
            q();
        }
    }

    @Override // com.google.android.material.floatingactionbutton.j
    public final void m(@Nullable ColorStateList colorStateList) {
        Drawable drawable = this.f44718c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(RippleUtils.sanitizeRippleDrawableColor(colorStateList));
        } else {
            super.m(colorStateList);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.j
    public final boolean o() {
        return this.f44737w.isCompatPaddingEnabled() || (this.f44721f && this.f44736v.getSizeDimension() < this.f44726k);
    }

    @NonNull
    public final AnimatorSet r(float f6, float f10) {
        AnimatorSet animatorSet = new AnimatorSet();
        FloatingActionButton floatingActionButton = this.f44736v;
        animatorSet.play(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f6).setDuration(0L)).with(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f10).setDuration(100L));
        animatorSet.setInterpolator(j.C);
        return animatorSet;
    }

    @NonNull
    public final MaterialShapeDrawable s() {
        return new a((ShapeAppearanceModel) Preconditions.checkNotNull(this.f44716a));
    }

    @Override // com.google.android.material.floatingactionbutton.j
    public final void h() {
    }

    @Override // com.google.android.material.floatingactionbutton.j
    public final void p() {
    }

    @Override // com.google.android.material.floatingactionbutton.j
    public final void j(int[] iArr) {
    }
}
