package pe;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.transition.TransitionValues;
import androidx.transition.Visibility;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.transition.VisibilityAnimatorProvider;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: MaterialVisibility.java */
/* JADX INFO: loaded from: classes10.dex */
public abstract class k<P extends VisibilityAnimatorProvider> extends Visibility {

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public final P f92667l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    @Nullable
    public VisibilityAnimatorProvider f92668m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public final ArrayList f92669n1 = new ArrayList();

    public k(P p4, @Nullable VisibilityAnimatorProvider visibilityAnimatorProvider) {
        this.f92667l1 = p4;
        this.f92668m1 = visibilityAnimatorProvider;
    }

    public static void s(ArrayList arrayList, @Nullable VisibilityAnimatorProvider visibilityAnimatorProvider, ViewGroup viewGroup, View view, boolean z10) {
        if (visibilityAnimatorProvider == null) {
            return;
        }
        Animator animatorCreateAppear = z10 ? visibilityAnimatorProvider.createAppear(viewGroup, view) : visibilityAnimatorProvider.createDisappear(viewGroup, view);
        if (animatorCreateAppear != null) {
            arrayList.add(animatorCreateAppear);
        }
    }

    public void addAdditionalAnimatorProvider(@NonNull VisibilityAnimatorProvider visibilityAnimatorProvider) {
        this.f92669n1.add(visibilityAnimatorProvider);
    }

    public void clearAdditionalAnimatorProvider() {
        this.f92669n1.clear();
    }

    @NonNull
    public P getPrimaryAnimatorProvider() {
        return this.f92667l1;
    }

    @Nullable
    public VisibilityAnimatorProvider getSecondaryAnimatorProvider() {
        return this.f92668m1;
    }

    @Override // androidx.transition.Transition
    public boolean isSeekingSupported() {
        return true;
    }

    @Override // androidx.transition.Visibility
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return t(viewGroup, view, true);
    }

    @Override // androidx.transition.Visibility
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return t(viewGroup, view, false);
    }

    public boolean removeAdditionalAnimatorProvider(@NonNull VisibilityAnimatorProvider visibilityAnimatorProvider) {
        return this.f92669n1.remove(visibilityAnimatorProvider);
    }

    public void setSecondaryAnimatorProvider(@Nullable VisibilityAnimatorProvider visibilityAnimatorProvider) {
        this.f92668m1 = visibilityAnimatorProvider;
    }

    public final AnimatorSet t(@NonNull ViewGroup viewGroup, @NonNull View view, boolean z10) {
        int iResolveThemeDuration;
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        s(arrayList, this.f92667l1, viewGroup, view, z10);
        s(arrayList, this.f92668m1, viewGroup, view, z10);
        Iterator it = this.f92669n1.iterator();
        while (it.hasNext()) {
            s(arrayList, (VisibilityAnimatorProvider) it.next(), viewGroup, view, z10);
        }
        Context context = viewGroup.getContext();
        int iV = v(z10);
        RectF rectF = p.f92677a;
        if (iV != 0 && getDuration() == -1 && (iResolveThemeDuration = MotionUtils.resolveThemeDuration(context, iV, -1)) != -1) {
            setDuration(iResolveThemeDuration);
        }
        int iW = w(z10);
        TimeInterpolator timeInterpolatorU = u();
        if (iW != 0 && getInterpolator() == null) {
            setInterpolator(MotionUtils.resolveThemeInterpolator(context, iW, timeInterpolatorU));
        }
        AnimatorSetCompat.playTogether(animatorSet, arrayList);
        return animatorSet;
    }

    @NonNull
    public TimeInterpolator u() {
        return AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
    }

    @AttrRes
    public int v(boolean z10) {
        return 0;
    }

    @AttrRes
    public int w(boolean z10) {
        return 0;
    }
}
