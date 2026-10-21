package androidx.transition;

import android.graphics.Rect;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class SidePropagation extends VisibilityPropagation {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f23643b = 3.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23644c = 80;

    /* JADX WARN: Code duplicated, block: B:21:0x0077  */
    /* JADX WARN: Code duplicated, block: B:22:0x0079  */
    @Override // androidx.transition.TransitionPropagation
    public long getStartDelay(@NonNull ViewGroup viewGroup, @NonNull Transition transition, @Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        int i10;
        int iCenterX;
        int iCenterY;
        int iAbs;
        TransitionValues transitionValues3 = transitionValues;
        if (transitionValues3 == null && transitionValues2 == null) {
            return 0L;
        }
        Rect epicenter = transition.getEpicenter();
        if (transitionValues2 == null || getViewVisibility(transitionValues3) == 0) {
            i10 = -1;
        } else {
            transitionValues3 = transitionValues2;
            i10 = 1;
        }
        int viewX = getViewX(transitionValues3);
        int viewY = getViewY(transitionValues3);
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        int iRound = Math.round(viewGroup.getTranslationX()) + iArr[0];
        int iRound2 = Math.round(viewGroup.getTranslationY()) + iArr[1];
        int width = viewGroup.getWidth() + iRound;
        int height = viewGroup.getHeight() + iRound2;
        if (epicenter != null) {
            iCenterX = epicenter.centerX();
            iCenterY = epicenter.centerY();
        } else {
            iCenterX = (iRound + width) / 2;
            iCenterY = (iRound2 + height) / 2;
        }
        int i11 = this.f23644c;
        if (i11 == 8388611) {
            if (viewGroup.getLayoutDirection() == 1) {
                i11 = 5;
            } else {
                i11 = 3;
            }
        } else if (i11 == 8388613) {
            if (viewGroup.getLayoutDirection() == 1) {
                i11 = 3;
            } else {
                i11 = 5;
            }
        }
        if (i11 == 3) {
            iAbs = Math.abs(iCenterY - viewY) + (width - viewX);
        } else if (i11 == 5) {
            iAbs = Math.abs(iCenterY - viewY) + (viewX - iRound);
        } else if (i11 != 48) {
            iAbs = i11 != 80 ? 0 : (viewY - iRound2) + Math.abs(iCenterX - viewX);
        } else {
            iAbs = Math.abs(iCenterX - viewX) + (height - viewY);
        }
        float f6 = iAbs;
        int i12 = this.f23644c;
        float width2 = f6 / ((i12 == 3 || i12 == 5 || i12 == 8388611 || i12 == 8388613) ? viewGroup.getWidth() : viewGroup.getHeight());
        long duration = transition.getDuration();
        if (duration < 0) {
            duration = 300;
        }
        return Math.round(((duration * ((long) i10)) / this.f23643b) * width2);
    }

    public void setPropagationSpeed(float f6) {
        if (f6 == 0.0f) {
            throw new IllegalArgumentException("propagationSpeed may not be 0");
        }
        this.f23643b = f6;
    }

    public void setSide(int i10) {
        this.f23644c = i10;
    }
}
