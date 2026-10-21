package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.animation.ArgbEvaluatorCompat;
import com.google.android.material.animation.ChildrenAlphaProperty;
import com.google.android.material.animation.DrawableAlphaProperty;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.animation.MotionTiming;
import com.google.android.material.animation.Positioning;
import com.google.android.material.circularreveal.CircularRevealCompat;
import com.google.android.material.circularreveal.CircularRevealHelper;
import com.google.android.material.circularreveal.CircularRevealWidget;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.math.MathUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Rect f45823r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final RectF f45824s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final RectF f45825t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final int[] f45826u0;
    public float v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public float f45827w0;

    public static class FabTransformationSpec {
        public Positioning positioning;

        @Nullable
        public MotionSpec timings;
    }

    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f45828a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f45829b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f45830c;

        public a(boolean z10, View view, View view2) {
            this.f45828a = z10;
            this.f45829b = view;
            this.f45830c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.f45828a) {
                return;
            }
            this.f45829b.setVisibility(4);
            View view = this.f45830c;
            view.setAlpha(1.0f);
            view.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            if (this.f45828a) {
                this.f45829b.setVisibility(0);
                View view = this.f45830c;
                view.setAlpha(0.0f);
                view.setVisibility(4);
            }
        }
    }

    public FabTransformationBehavior() {
        this.f45823r0 = new Rect();
        this.f45824s0 = new RectF();
        this.f45825t0 = new RectF();
        this.f45826u0 = new int[2];
    }

    @NonNull
    public static Pair a(float f6, float f10, boolean z10, @NonNull FabTransformationSpec fabTransformationSpec) {
        MotionTiming timing;
        MotionTiming timing2;
        if (f6 == 0.0f || f10 == 0.0f) {
            timing = fabTransformationSpec.timings.getTiming("translationXLinear");
            timing2 = fabTransformationSpec.timings.getTiming("translationYLinear");
        } else if ((!z10 || f10 >= 0.0f) && (z10 || f10 <= 0.0f)) {
            timing = fabTransformationSpec.timings.getTiming("translationXCurveDownwards");
            timing2 = fabTransformationSpec.timings.getTiming("translationYCurveDownwards");
        } else {
            timing = fabTransformationSpec.timings.getTiming("translationXCurveUpwards");
            timing2 = fabTransformationSpec.timings.getTiming("translationYCurveUpwards");
        }
        return new Pair(timing, timing2);
    }

    public static float d(@NonNull FabTransformationSpec fabTransformationSpec, @NonNull MotionTiming motionTiming, float f6) {
        long delay = motionTiming.getDelay();
        long duration = motionTiming.getDuration();
        MotionTiming timing = fabTransformationSpec.timings.getTiming("expansion");
        return AnimationUtils.lerp(f6, 0.0f, motionTiming.getInterpolator().getInterpolation((((timing.getDuration() + timing.getDelay()) + 17) - delay) / duration));
    }

    public final float b(@NonNull View view, @NonNull View view2, @NonNull Positioning positioning) {
        float fCenterX;
        float fCenterX2;
        float f6;
        RectF rectF = this.f45824s0;
        RectF rectF2 = this.f45825t0;
        e(view, rectF);
        rectF.offset(this.v0, this.f45827w0);
        e(view2, rectF2);
        int i10 = positioning.gravity & 7;
        if (i10 == 1) {
            fCenterX = rectF2.centerX();
            fCenterX2 = rectF.centerX();
        } else {
            if (i10 != 3) {
                if (i10 != 5) {
                    f6 = 0.0f;
                } else {
                    fCenterX = rectF2.right;
                    fCenterX2 = rectF.right;
                }
                return f6 + positioning.xAdjustment;
            }
            fCenterX = rectF2.left;
            fCenterX2 = rectF.left;
        }
        f6 = fCenterX - fCenterX2;
        return f6 + positioning.xAdjustment;
    }

    public final float c(@NonNull View view, @NonNull View view2, @NonNull Positioning positioning) {
        float fCenterY;
        float fCenterY2;
        float f6;
        RectF rectF = this.f45824s0;
        RectF rectF2 = this.f45825t0;
        e(view, rectF);
        rectF.offset(this.v0, this.f45827w0);
        e(view2, rectF2);
        int i10 = positioning.gravity & 112;
        if (i10 == 16) {
            fCenterY = rectF2.centerY();
            fCenterY2 = rectF.centerY();
        } else {
            if (i10 != 48) {
                if (i10 != 80) {
                    f6 = 0.0f;
                } else {
                    fCenterY = rectF2.bottom;
                    fCenterY2 = rectF.bottom;
                }
                return f6 + positioning.yAdjustment;
            }
            fCenterY = rectF2.top;
            fCenterY2 = rectF.top;
        }
        f6 = fCenterY - fCenterY2;
        return f6 + positioning.yAdjustment;
    }

    public final void e(@NonNull View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        int[] iArr = this.f45826u0;
        view.getLocationInWindow(iArr);
        rectF.offsetTo(iArr[0], iArr[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @CallSuper
    public boolean layoutDependsOn(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        if (!(view2 instanceof FloatingActionButton)) {
            return false;
        }
        int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
        return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @CallSuper
    public void onAttachedToLayoutParams(@NonNull CoordinatorLayout.LayoutParams layoutParams) {
        if (layoutParams.dodgeInsetEdges == 0) {
            layoutParams.dodgeInsetEdges = 80;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x014e  */
    /* JADX WARN: Code duplicated, block: B:74:0x02e1  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    @NonNull
    public AnimatorSet onCreateExpandedStateChangeAnimation(@NonNull View view, @NonNull View view2, boolean z10, boolean z11) {
        ObjectAnimator objectAnimatorOfFloat;
        ObjectAnimator objectAnimatorOfFloat2;
        ObjectAnimator objectAnimatorOfFloat3;
        ArrayList arrayList;
        Animator animatorCreateCircularReveal;
        ArrayList arrayList2;
        CircularRevealWidget circularRevealWidget;
        ArrayList arrayList3;
        int i10;
        ObjectAnimator objectAnimatorOfFloat4;
        ObjectAnimator objectAnimatorOfInt;
        ObjectAnimator objectAnimatorOfInt2;
        FabTransformationSpec fabTransformationSpecOnCreateMotionSpec = onCreateMotionSpec(view2.getContext(), z10);
        if (z10) {
            this.v0 = view.getTranslationX();
            this.f45827w0 = view.getTranslationY();
        }
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        float elevation = ViewCompat.getElevation(view2) - ViewCompat.getElevation(view);
        if (z10) {
            if (!z11) {
                view2.setTranslationZ(-elevation);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -elevation);
        }
        fabTransformationSpecOnCreateMotionSpec.timings.getTiming("elevation").apply(objectAnimatorOfFloat);
        arrayList4.add(objectAnimatorOfFloat);
        RectF rectF = this.f45824s0;
        float fB = b(view, view2, fabTransformationSpecOnCreateMotionSpec.positioning);
        float fC = c(view, view2, fabTransformationSpecOnCreateMotionSpec.positioning);
        Pair pairA = a(fB, fC, z10, fabTransformationSpecOnCreateMotionSpec);
        MotionTiming motionTiming = (MotionTiming) pairA.first;
        MotionTiming motionTiming2 = (MotionTiming) pairA.second;
        RectF rectF2 = this.f45825t0;
        Rect rect = this.f45823r0;
        if (z10) {
            if (!z11) {
                view2.setTranslationX(-fB);
                view2.setTranslationY(-fC);
            }
            ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            float fD = d(fabTransformationSpecOnCreateMotionSpec, motionTiming, -fB);
            float fD2 = d(fabTransformationSpecOnCreateMotionSpec, motionTiming2, -fC);
            view2.getWindowVisibleDisplayFrame(rect);
            rectF.set(rect);
            e(view2, rectF2);
            rectF2.offset(fD, fD2);
            rectF2.intersect(rectF);
            rectF.set(rectF2);
            objectAnimatorOfFloat3 = objectAnimatorOfFloat6;
            objectAnimatorOfFloat2 = objectAnimatorOfFloat5;
        } else {
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -fB);
            objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -fC);
        }
        motionTiming.apply(objectAnimatorOfFloat2);
        motionTiming2.apply(objectAnimatorOfFloat3);
        arrayList4.add(objectAnimatorOfFloat2);
        arrayList4.add(objectAnimatorOfFloat3);
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        float fB2 = b(view, view2, fabTransformationSpecOnCreateMotionSpec.positioning);
        float fC2 = c(view, view2, fabTransformationSpecOnCreateMotionSpec.positioning);
        Pair pairA2 = a(fB2, fC2, z10, fabTransformationSpecOnCreateMotionSpec);
        MotionTiming motionTiming3 = (MotionTiming) pairA2.first;
        MotionTiming motionTiming4 = (MotionTiming) pairA2.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z10) {
            fB2 = this.v0;
        }
        fArr[0] = fB2;
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z10) {
            fC2 = this.f45827w0;
        }
        fArr2[0] = fC2;
        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fArr2);
        motionTiming3.apply(objectAnimatorOfFloat7);
        motionTiming4.apply(objectAnimatorOfFloat8);
        arrayList4.add(objectAnimatorOfFloat7);
        arrayList4.add(objectAnimatorOfFloat8);
        boolean z12 = view2 instanceof CircularRevealWidget;
        if (z12 && (view instanceof ImageView)) {
            CircularRevealWidget circularRevealWidget2 = (CircularRevealWidget) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable == null) {
                arrayList = arrayList5;
            } else {
                drawable.mutate();
                if (z10) {
                    if (!z11) {
                        drawable.setAlpha(255);
                    }
                    objectAnimatorOfInt2 = ObjectAnimator.ofInt(drawable, DrawableAlphaProperty.DRAWABLE_ALPHA_COMPAT, 0);
                } else {
                    objectAnimatorOfInt2 = ObjectAnimator.ofInt(drawable, DrawableAlphaProperty.DRAWABLE_ALPHA_COMPAT, 255);
                }
                objectAnimatorOfInt2.addUpdateListener(new com.google.android.material.transformation.a(view2));
                fabTransformationSpecOnCreateMotionSpec.timings.getTiming("iconFade").apply(objectAnimatorOfInt2);
                arrayList4.add(objectAnimatorOfInt2);
                b bVar = new b(circularRevealWidget2, drawable);
                arrayList = arrayList5;
                arrayList.add(bVar);
            }
        } else {
            arrayList = arrayList5;
        }
        if (z12) {
            CircularRevealWidget circularRevealWidget3 = (CircularRevealWidget) view2;
            Positioning positioning = fabTransformationSpecOnCreateMotionSpec.positioning;
            e(view, rectF);
            rectF.offset(this.v0, this.f45827w0);
            e(view2, rectF2);
            rectF2.offset(-b(view, view2, positioning), 0.0f);
            float fCenterX = rectF.centerX() - rectF2.left;
            Positioning positioning2 = fabTransformationSpecOnCreateMotionSpec.positioning;
            e(view, rectF);
            rectF.offset(this.v0, this.f45827w0);
            e(view2, rectF2);
            rectF2.offset(0.0f, -c(view, view2, positioning2));
            float fCenterY = rectF.centerY() - rectF2.top;
            ((FloatingActionButton) view).getContentRect(rect);
            float fWidth2 = rect.width() / 2.0f;
            MotionTiming timing = fabTransformationSpecOnCreateMotionSpec.timings.getTiming("expansion");
            if (z10) {
                if (!z11) {
                    circularRevealWidget3.setRevealInfo(new CircularRevealWidget.RevealInfo(fCenterX, fCenterY, fWidth2));
                }
                if (z11) {
                    fWidth2 = circularRevealWidget3.getRevealInfo().radius;
                }
                animatorCreateCircularReveal = CircularRevealCompat.createCircularReveal(circularRevealWidget3, fCenterX, fCenterY, MathUtils.distanceToFurthestCorner(fCenterX, fCenterY, 0.0f, 0.0f, fWidth, fHeight));
                animatorCreateCircularReveal.addListener(new c(circularRevealWidget3));
                long delay = timing.getDelay();
                int i11 = (int) fCenterX;
                int i12 = (int) fCenterY;
                if (delay > 0) {
                    Animator animatorCreateCircularReveal2 = ViewAnimationUtils.createCircularReveal(view2, i11, i12, fWidth2, fWidth2);
                    animatorCreateCircularReveal2.setStartDelay(0L);
                    animatorCreateCircularReveal2.setDuration(delay);
                    arrayList4.add(animatorCreateCircularReveal2);
                }
                arrayList2 = arrayList;
                circularRevealWidget = circularRevealWidget3;
            } else {
                float f6 = circularRevealWidget3.getRevealInfo().radius;
                animatorCreateCircularReveal = CircularRevealCompat.createCircularReveal(circularRevealWidget3, fCenterX, fCenterY, fWidth2);
                long delay2 = timing.getDelay();
                int i13 = (int) fCenterX;
                int i14 = (int) fCenterY;
                arrayList2 = arrayList;
                circularRevealWidget = circularRevealWidget3;
                if (delay2 > 0) {
                    Animator animatorCreateCircularReveal3 = ViewAnimationUtils.createCircularReveal(view2, i13, i14, f6, f6);
                    animatorCreateCircularReveal3.setStartDelay(0L);
                    animatorCreateCircularReveal3.setDuration(delay2);
                    arrayList4.add(animatorCreateCircularReveal3);
                }
                long delay3 = timing.getDelay();
                long duration = timing.getDuration();
                long totalDuration = fabTransformationSpecOnCreateMotionSpec.timings.getTotalDuration();
                long j10 = delay3 + duration;
                if (j10 < totalDuration) {
                    Animator animatorCreateCircularReveal4 = ViewAnimationUtils.createCircularReveal(view2, i13, i14, fWidth2, fWidth2);
                    animatorCreateCircularReveal4.setStartDelay(j10);
                    animatorCreateCircularReveal4.setDuration(totalDuration - j10);
                    arrayList4.add(animatorCreateCircularReveal4);
                }
            }
            timing.apply(animatorCreateCircularReveal);
            arrayList4.add(animatorCreateCircularReveal);
            arrayList3 = arrayList2;
            arrayList3.add(CircularRevealCompat.createCircularRevealListener(circularRevealWidget));
        } else {
            arrayList3 = arrayList;
        }
        if (z12) {
            CircularRevealWidget circularRevealWidget4 = (CircularRevealWidget) view2;
            ColorStateList backgroundTintList = ViewCompat.getBackgroundTintList(view);
            int colorForState = backgroundTintList != null ? backgroundTintList.getColorForState(view.getDrawableState(), backgroundTintList.getDefaultColor()) : 0;
            int i15 = 16777215 & colorForState;
            if (z10) {
                if (!z11) {
                    circularRevealWidget4.setCircularRevealScrimColor(colorForState);
                }
                objectAnimatorOfInt = ObjectAnimator.ofInt(circularRevealWidget4, CircularRevealWidget.CircularRevealScrimColorProperty.CIRCULAR_REVEAL_SCRIM_COLOR, i15);
            } else {
                objectAnimatorOfInt = ObjectAnimator.ofInt(circularRevealWidget4, CircularRevealWidget.CircularRevealScrimColorProperty.CIRCULAR_REVEAL_SCRIM_COLOR, colorForState);
            }
            objectAnimatorOfInt.setEvaluator(ArgbEvaluatorCompat.getInstance());
            fabTransformationSpecOnCreateMotionSpec.timings.getTiming("color").apply(objectAnimatorOfInt);
            arrayList4.add(objectAnimatorOfInt);
        }
        boolean z13 = view2 instanceof ViewGroup;
        if (z13 && !(z12 && CircularRevealHelper.STRATEGY == 0)) {
            View viewFindViewById = view2.findViewById(R.id.mtrl_child_content_container);
            ViewGroup viewGroup = null;
            if (viewFindViewById != null) {
                if (viewFindViewById instanceof ViewGroup) {
                    viewGroup = (ViewGroup) viewFindViewById;
                }
            } else if ((view2 instanceof TransformationChildLayout) || (view2 instanceof TransformationChildCard)) {
                View childAt = ((ViewGroup) view2).getChildAt(0);
                if (childAt instanceof ViewGroup) {
                    viewGroup = (ViewGroup) childAt;
                }
            } else if (z13) {
                viewGroup = (ViewGroup) view2;
            }
            if (viewGroup == null) {
                i10 = 0;
            } else {
                if (z10) {
                    if (!z11) {
                        ChildrenAlphaProperty.CHILDREN_ALPHA.set(viewGroup, Float.valueOf(0.0f));
                    }
                    i10 = 0;
                    objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(viewGroup, ChildrenAlphaProperty.CHILDREN_ALPHA, 1.0f);
                } else {
                    i10 = 0;
                    objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(viewGroup, ChildrenAlphaProperty.CHILDREN_ALPHA, 0.0f);
                }
                fabTransformationSpecOnCreateMotionSpec.timings.getTiming("contentFade").apply(objectAnimatorOfFloat4);
                arrayList4.add(objectAnimatorOfFloat4);
            }
        } else {
            i10 = 0;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSetCompat.playTogether(animatorSet, arrayList4);
        animatorSet.addListener(new a(z10, view2, view));
        int size = arrayList3.size();
        for (int i16 = i10; i16 < size; i16++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList3.get(i16));
        }
        return animatorSet;
    }

    public abstract FabTransformationSpec onCreateMotionSpec(Context context, boolean z10);

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45823r0 = new Rect();
        this.f45824s0 = new RectF();
        this.f45825t0 = new RectF();
        this.f45826u0 = new int[2];
    }
}
