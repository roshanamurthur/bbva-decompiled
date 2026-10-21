package androidx.transition;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class VisibilityPropagation extends TransitionPropagation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f23730a = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};

    @Override // androidx.transition.TransitionPropagation
    public void captureValues(@NonNull TransitionValues transitionValues) {
        View view = transitionValues.view;
        Integer numValueOf = (Integer) transitionValues.values.get("android:visibility:visibility");
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(view.getVisibility());
        }
        transitionValues.values.put("android:visibilityPropagation:visibility", numValueOf);
        int[] iArr = {iRound, 0};
        view.getLocationOnScreen(iArr);
        int iRound = Math.round(view.getTranslationX()) + iArr[0];
        iArr[0] = (view.getWidth() / 2) + iRound;
        int iRound2 = Math.round(view.getTranslationY()) + iArr[1];
        iArr[1] = iRound2;
        iArr[1] = (view.getHeight() / 2) + iRound2;
        transitionValues.values.put("android:visibilityPropagation:center", iArr);
    }

    @Override // androidx.transition.TransitionPropagation
    @Nullable
    public String[] getPropagationProperties() {
        return f23730a;
    }

    public int getViewVisibility(@Nullable TransitionValues transitionValues) {
        Integer num;
        if (transitionValues == null || (num = (Integer) transitionValues.values.get("android:visibilityPropagation:visibility")) == null) {
            return 8;
        }
        return num.intValue();
    }

    public int getViewX(@Nullable TransitionValues transitionValues) {
        int[] iArr;
        if (transitionValues == null || (iArr = (int[]) transitionValues.values.get("android:visibilityPropagation:center")) == null) {
            return -1;
        }
        return iArr[0];
    }

    public int getViewY(@Nullable TransitionValues transitionValues) {
        int[] iArr;
        if (transitionValues == null || (iArr = (int[]) transitionValues.values.get("android:visibilityPropagation:center")) == null) {
            return -1;
        }
        return iArr[1];
    }
}
