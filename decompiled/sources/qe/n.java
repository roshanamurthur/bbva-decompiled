package qe;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.RectF;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.transition.platform.VisibilityAnimatorProvider;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: MaterialVisibility.java */
/* JADX INFO: loaded from: classes10.dex */
@RequiresApi(21)
public abstract class n<P extends VisibilityAnimatorProvider> extends Visibility {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final P f92851p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @Nullable
    public VisibilityAnimatorProvider f92852q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ArrayList f92853r0 = new ArrayList();

    public n(P p4, @Nullable VisibilityAnimatorProvider visibilityAnimatorProvider) {
        this.f92851p0 = p4;
        this.f92852q0 = visibilityAnimatorProvider;
    }

    public static void a(ArrayList arrayList, @Nullable VisibilityAnimatorProvider visibilityAnimatorProvider, ViewGroup viewGroup, View view, boolean z10) {
        if (visibilityAnimatorProvider == null) {
            return;
        }
        Animator animatorCreateAppear = z10 ? visibilityAnimatorProvider.createAppear(viewGroup, view) : visibilityAnimatorProvider.createDisappear(viewGroup, view);
        if (animatorCreateAppear != null) {
            arrayList.add(animatorCreateAppear);
        }
    }

    public void addAdditionalAnimatorProvider(@NonNull VisibilityAnimatorProvider visibilityAnimatorProvider) {
        this.f92853r0.add(visibilityAnimatorProvider);
    }

    public final AnimatorSet b(@NonNull ViewGroup viewGroup, @NonNull View view, boolean z10) {
        int iResolveThemeDuration;
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        a(arrayList, this.f92851p0, viewGroup, view, z10);
        a(arrayList, this.f92852q0, viewGroup, view, z10);
        Iterator it = this.f92853r0.iterator();
        while (it.hasNext()) {
            a(arrayList, (VisibilityAnimatorProvider) it.next(), viewGroup, view, z10);
        }
        Context context = viewGroup.getContext();
        int iD = d(z10);
        RectF rectF = s.f92861a;
        if (iD != 0 && getDuration() == -1 && (iResolveThemeDuration = MotionUtils.resolveThemeDuration(context, iD, -1)) != -1) {
            setDuration(iResolveThemeDuration);
        }
        int iE = e(z10);
        TimeInterpolator timeInterpolatorC = c();
        if (iE != 0 && getInterpolator() == null) {
            setInterpolator(MotionUtils.resolveThemeInterpolator(context, iE, timeInterpolatorC));
        }
        AnimatorSetCompat.playTogether(animatorSet, arrayList);
        return animatorSet;
    }

    @NonNull
    public TimeInterpolator c() {
        return AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
    }

    public void clearAdditionalAnimatorProvider() {
        this.f92853r0.clear();
    }

    @AttrRes
    public int d(boolean z10) {
        return 0;
    }

    @AttrRes
    public int e(boolean z10) {
        return 0;
    }

    @NonNull
    public P getPrimaryAnimatorProvider() {
        return this.f92851p0;
    }

    @Nullable
    public VisibilityAnimatorProvider getSecondaryAnimatorProvider() {
        return this.f92852q0;
    }

    @Override // android.transition.Visibility
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return b(viewGroup, view, true);
    }

    @Override // android.transition.Visibility
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return b(viewGroup, view, false);
    }

    public boolean removeAdditionalAnimatorProvider(@NonNull VisibilityAnimatorProvider visibilityAnimatorProvider) {
        return this.f92853r0.remove(visibilityAnimatorProvider);
    }

    public void setSecondaryAnimatorProvider(@Nullable VisibilityAnimatorProvider visibilityAnimatorProvider) {
        this.f92852q0 = visibilityAnimatorProvider;
    }
}
