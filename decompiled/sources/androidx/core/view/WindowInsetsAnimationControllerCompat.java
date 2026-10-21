package androidx.core.view;

import android.view.WindowInsetsAnimationController;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.Insets;

/* JADX INFO: loaded from: classes2.dex */
public final class WindowInsetsAnimationControllerCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f20316a;

    @RequiresApi(30)
    public static class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WindowInsetsAnimationController f20317a;

        public a(@NonNull WindowInsetsAnimationController windowInsetsAnimationController) {
            this.f20317a = windowInsetsAnimationController;
        }
    }

    public static class b {
    }

    @RequiresApi(30)
    public WindowInsetsAnimationControllerCompat(@NonNull WindowInsetsAnimationController windowInsetsAnimationController) {
        this.f20316a = new a(windowInsetsAnimationController);
    }

    public void finish(boolean z10) {
        this.f20316a.f20317a.finish(z10);
    }

    public float getCurrentAlpha() {
        return this.f20316a.f20317a.getCurrentAlpha();
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float getCurrentFraction() {
        return this.f20316a.f20317a.getCurrentFraction();
    }

    @NonNull
    public Insets getCurrentInsets() {
        return Insets.toCompatInsets(this.f20316a.f20317a.getCurrentInsets());
    }

    @NonNull
    public Insets getHiddenStateInsets() {
        return Insets.toCompatInsets(this.f20316a.f20317a.getHiddenStateInsets());
    }

    @NonNull
    public Insets getShownStateInsets() {
        return Insets.toCompatInsets(this.f20316a.f20317a.getShownStateInsets());
    }

    public int getTypes() {
        return this.f20316a.f20317a.getTypes();
    }

    public boolean isCancelled() {
        return this.f20316a.f20317a.isCancelled();
    }

    public boolean isFinished() {
        return this.f20316a.f20317a.isFinished();
    }

    public boolean isReady() {
        return (isFinished() || isCancelled()) ? false : true;
    }

    public void setInsetsAndAlpha(@Nullable Insets insets, @FloatRange(from = 0.0d, to = 1.0d) float f6, @FloatRange(from = 0.0d, to = 1.0d) float f10) {
        android.graphics.Insets platformInsets;
        a aVar = this.f20316a;
        if (insets == null) {
            platformInsets = null;
        } else {
            aVar.getClass();
            platformInsets = insets.toPlatformInsets();
        }
        aVar.f20317a.setInsetsAndAlpha(platformInsets, f6, f10);
    }
}
