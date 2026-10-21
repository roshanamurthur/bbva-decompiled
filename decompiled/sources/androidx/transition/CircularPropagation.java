package androidx.transition;

import android.graphics.Rect;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class CircularPropagation extends VisibilityPropagation {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f23616b = 3.0f;

    @Override // androidx.transition.TransitionPropagation
    public long getStartDelay(@NonNull ViewGroup viewGroup, @NonNull Transition transition, @Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        int i10;
        int iRound;
        int iCenterX;
        if (transitionValues == null && transitionValues2 == null) {
            return 0L;
        }
        if (transitionValues2 == null || getViewVisibility(transitionValues) == 0) {
            i10 = -1;
        } else {
            transitionValues = transitionValues2;
            i10 = 1;
        }
        int viewX = getViewX(transitionValues);
        int viewY = getViewY(transitionValues);
        Rect epicenter = transition.getEpicenter();
        if (epicenter != null) {
            iCenterX = epicenter.centerX();
            iRound = epicenter.centerY();
        } else {
            int[] iArr = new int[2];
            viewGroup.getLocationOnScreen(iArr);
            int iRound2 = Math.round(viewGroup.getTranslationX() + (viewGroup.getWidth() / 2) + iArr[0]);
            iRound = Math.round(viewGroup.getTranslationY() + (viewGroup.getHeight() / 2) + iArr[1]);
            iCenterX = iRound2;
        }
        float f6 = iCenterX - viewX;
        float f10 = iRound - viewY;
        float fSqrt = (float) Math.sqrt((f10 * f10) + (f6 * f6));
        float width = viewGroup.getWidth() - 0.0f;
        float height = viewGroup.getHeight() - 0.0f;
        float fSqrt2 = fSqrt / ((float) Math.sqrt((height * height) + (width * width)));
        long duration = transition.getDuration();
        if (duration < 0) {
            duration = 300;
        }
        return Math.round(((duration * ((long) i10)) / this.f23616b) * fSqrt2);
    }

    public void setPropagationSpeed(float f6) {
        if (f6 == 0.0f) {
            throw new IllegalArgumentException("propagationSpeed may not be 0");
        }
        this.f23616b = f6;
    }
}
