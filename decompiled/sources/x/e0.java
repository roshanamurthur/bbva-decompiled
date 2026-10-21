package x;

import android.os.Build;
import android.view.View;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: WindowInsets.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends WindowInsetsAnimationCompat.Callback implements Runnable, OnApplyWindowInsetsListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final WindowInsetsHolder f94319r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f94320s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f94321t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @Nullable
    public WindowInsetsCompat f94322u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(@NotNull WindowInsetsHolder composeInsets) {
        super(!composeInsets.getConsumes() ? 1 : 0);
        Intrinsics.checkNotNullParameter(composeInsets, "composeInsets");
        this.f94319r0 = composeInsets;
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    @NotNull
    public final WindowInsetsCompat onApplyWindowInsets(@NotNull View view, @NotNull WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(insets, "insets");
        this.f94322u0 = insets;
        WindowInsetsHolder windowInsetsHolder = this.f94319r0;
        windowInsetsHolder.updateImeAnimationTarget(insets);
        if (this.f94320s0) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.f94321t0) {
            windowInsetsHolder.updateImeAnimationSource(insets);
            WindowInsetsHolder.update$default(windowInsetsHolder, insets, 0, 2, null);
        }
        if (!windowInsetsHolder.getConsumes()) {
            return insets;
        }
        WindowInsetsCompat CONSUMED = WindowInsetsCompat.CONSUMED;
        Intrinsics.checkNotNullExpressionValue(CONSUMED, "CONSUMED");
        return CONSUMED;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public final void onEnd(@NotNull WindowInsetsAnimationCompat animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.f94320s0 = false;
        this.f94321t0 = false;
        WindowInsetsCompat windowInsetsCompat = this.f94322u0;
        if (animation.getDurationMillis() != 0 && windowInsetsCompat != null) {
            WindowInsetsHolder windowInsetsHolder = this.f94319r0;
            windowInsetsHolder.updateImeAnimationSource(windowInsetsCompat);
            windowInsetsHolder.updateImeAnimationTarget(windowInsetsCompat);
            WindowInsetsHolder.update$default(windowInsetsHolder, windowInsetsCompat, 0, 2, null);
        }
        this.f94322u0 = null;
        super.onEnd(animation);
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public final void onPrepare(@NotNull WindowInsetsAnimationCompat animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.f94320s0 = true;
        this.f94321t0 = true;
        super.onPrepare(animation);
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    @NotNull
    public final WindowInsetsCompat onProgress(@NotNull WindowInsetsCompat insets, @NotNull List<WindowInsetsAnimationCompat> runningAnimations) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        Intrinsics.checkNotNullParameter(runningAnimations, "runningAnimations");
        WindowInsetsHolder windowInsetsHolder = this.f94319r0;
        WindowInsetsHolder.update$default(windowInsetsHolder, insets, 0, 2, null);
        if (!windowInsetsHolder.getConsumes()) {
            return insets;
        }
        WindowInsetsCompat CONSUMED = WindowInsetsCompat.CONSUMED;
        Intrinsics.checkNotNullExpressionValue(CONSUMED, "CONSUMED");
        return CONSUMED;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    @NotNull
    public final WindowInsetsAnimationCompat.BoundsCompat onStart(@NotNull WindowInsetsAnimationCompat animation, @NotNull WindowInsetsAnimationCompat.BoundsCompat bounds) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        this.f94320s0 = false;
        WindowInsetsAnimationCompat.BoundsCompat boundsCompatOnStart = super.onStart(animation, bounds);
        Intrinsics.checkNotNullExpressionValue(boundsCompatOnStart, "super.onStart(animation, bounds)");
        return boundsCompatOnStart;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.requestApplyInsets();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(@NotNull View v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f94320s0) {
            this.f94320s0 = false;
            this.f94321t0 = false;
            WindowInsetsCompat windowInsetsCompat = this.f94322u0;
            if (windowInsetsCompat != null) {
                WindowInsetsHolder windowInsetsHolder = this.f94319r0;
                windowInsetsHolder.updateImeAnimationSource(windowInsetsCompat);
                WindowInsetsHolder.update$default(windowInsetsHolder, windowInsetsCompat, 0, 2, null);
                this.f94322u0 = null;
            }
        }
    }
}
