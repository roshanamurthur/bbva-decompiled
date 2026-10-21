package de;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.animation.AnimationUtils;
import java.util.List;

/* JADX INFO: compiled from: InsetsAnimationCallback.java */
/* JADX INFO: loaded from: classes10.dex */
public final class g extends WindowInsetsAnimationCompat.Callback {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final View f68177r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f68178s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f68179t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final int[] f68180u0;

    public g(View view) {
        super(0);
        this.f68180u0 = new int[2];
        this.f68177r0 = view;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public final void onEnd(@NonNull WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        this.f68177r0.setTranslationY(0.0f);
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public final void onPrepare(@NonNull WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        View view = this.f68177r0;
        int[] iArr = this.f68180u0;
        view.getLocationOnScreen(iArr);
        this.f68178s0 = iArr[1];
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    @NonNull
    public final WindowInsetsCompat onProgress(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull List<WindowInsetsAnimationCompat> list) {
        for (WindowInsetsAnimationCompat windowInsetsAnimationCompat : list) {
            if ((windowInsetsAnimationCompat.getTypeMask() & WindowInsetsCompat.Type.ime()) != 0) {
                this.f68177r0.setTranslationY(AnimationUtils.lerp(this.f68179t0, 0, windowInsetsAnimationCompat.getInterpolatedFraction()));
                break;
            }
        }
        return windowInsetsCompat;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    @NonNull
    public final WindowInsetsAnimationCompat.BoundsCompat onStart(@NonNull WindowInsetsAnimationCompat windowInsetsAnimationCompat, @NonNull WindowInsetsAnimationCompat.BoundsCompat boundsCompat) {
        View view = this.f68177r0;
        int[] iArr = this.f68180u0;
        view.getLocationOnScreen(iArr);
        int i10 = this.f68178s0 - iArr[1];
        this.f68179t0 = i10;
        view.setTranslationY(i10);
        return boundsCompat;
    }
}
