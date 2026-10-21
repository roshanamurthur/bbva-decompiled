package androidx.transition;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class Explode extends Visibility {

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public static final DecelerateInterpolator f23617m1 = new DecelerateInterpolator();

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public static final AccelerateInterpolator f23618n1 = new AccelerateInterpolator();

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public final int[] f23619l1;

    public Explode() {
        this.f23619l1 = new int[2];
        setPropagation(new CircularPropagation());
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void captureEndValues(@NonNull TransitionValues transitionValues) {
        super.captureEndValues(transitionValues);
        t(transitionValues);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void captureStartValues(@NonNull TransitionValues transitionValues) {
        super.captureStartValues(transitionValues);
        t(transitionValues);
    }

    @Override // androidx.transition.Transition
    public boolean isSeekingSupported() {
        return true;
    }

    @Override // androidx.transition.Visibility
    @Nullable
    public Animator onAppear(@NonNull ViewGroup viewGroup, @NonNull View view, @Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        if (transitionValues2 == null) {
            return null;
        }
        Rect rect = (Rect) transitionValues2.values.get("android:explode:screenBounds");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = this.f23619l1;
        s(viewGroup, rect, iArr);
        return d.a(view, transitionValues2, rect.left, rect.top, translationX + iArr[0], translationY + iArr[1], translationX, translationY, f23617m1, this);
    }

    @Override // androidx.transition.Visibility
    @Nullable
    public Animator onDisappear(@NonNull ViewGroup viewGroup, @NonNull View view, @Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        float f6;
        float f10;
        if (transitionValues == null) {
            return null;
        }
        Rect rect = (Rect) transitionValues.values.get("android:explode:screenBounds");
        int i10 = rect.left;
        int i11 = rect.top;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) transitionValues.view.getTag(R.id.transition_position);
        if (iArr != null) {
            int i12 = iArr[0];
            f6 = (i12 - rect.left) + translationX;
            int i13 = iArr[1];
            f10 = (i13 - rect.top) + translationY;
            rect.offsetTo(i12, i13);
        } else {
            f6 = translationX;
            f10 = translationY;
        }
        int[] iArr2 = this.f23619l1;
        s(viewGroup, rect, iArr2);
        return d.a(view, transitionValues, i10, i11, translationX, translationY, f6 + iArr2[0], f10 + iArr2[1], f23618n1, this);
    }

    public final void s(View view, Rect rect, int[] iArr) {
        int iCenterX;
        int iCenterY;
        int[] iArr2 = this.f23619l1;
        view.getLocationOnScreen(iArr2);
        int i10 = iArr2[0];
        int i11 = iArr2[1];
        Rect epicenter = getEpicenter();
        if (epicenter == null) {
            iCenterX = Math.round(view.getTranslationX()) + (view.getWidth() / 2) + i10;
            iCenterY = Math.round(view.getTranslationY()) + (view.getHeight() / 2) + i11;
        } else {
            iCenterX = epicenter.centerX();
            iCenterY = epicenter.centerY();
        }
        float fCenterX = rect.centerX() - iCenterX;
        float fCenterY = rect.centerY() - iCenterY;
        if (fCenterX == 0.0f && fCenterY == 0.0f) {
            fCenterX = ((float) (Math.random() * 2.0d)) - 1.0f;
            fCenterY = ((float) (Math.random() * 2.0d)) - 1.0f;
        }
        float fSqrt = (float) Math.sqrt((fCenterY * fCenterY) + (fCenterX * fCenterX));
        int i12 = iCenterX - i10;
        int i13 = iCenterY - i11;
        float fMax = Math.max(i12, view.getWidth() - i12);
        float fMax2 = Math.max(i13, view.getHeight() - i13);
        float fSqrt2 = (float) Math.sqrt((fMax2 * fMax2) + (fMax * fMax));
        iArr[0] = Math.round((fCenterX / fSqrt) * fSqrt2);
        iArr[1] = Math.round(fSqrt2 * (fCenterY / fSqrt));
    }

    public final void t(TransitionValues transitionValues) {
        View view = transitionValues.view;
        int[] iArr = this.f23619l1;
        view.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        int i11 = iArr[1];
        transitionValues.values.put("android:explode:screenBounds", new Rect(i10, i11, view.getWidth() + i10, view.getHeight() + i11));
    }

    public Explode(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23619l1 = new int[2];
        setPropagation(new CircularPropagation());
    }
}
