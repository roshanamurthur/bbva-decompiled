package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AppBar.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ExitUntilCollapsedScrollBehavior implements TopAppBarScrollBehavior {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final TopAppBarState f10229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final AnimationSpec<Float> f10230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final DecayAnimationSpec<Float> f10231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Function0<Boolean> f10232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1 f10233e;

    public ExitUntilCollapsedScrollBehavior(@NotNull TopAppBarState state, @Nullable AnimationSpec<Float> animationSpec, @Nullable DecayAnimationSpec<Float> decayAnimationSpec, @NotNull Function0<Boolean> canScroll) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(canScroll, "canScroll");
        this.f10229a = state;
        this.f10230b = animationSpec;
        this.f10231c = decayAnimationSpec;
        this.f10232d = canScroll;
        this.f10233e = new ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1(this);
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    @Nullable
    public final DecayAnimationSpec<Float> getFlingAnimationSpec() {
        return this.f10231c;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    @NotNull
    public final NestedScrollConnection getNestedScrollConnection() {
        return this.f10233e;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    @Nullable
    public final AnimationSpec<Float> getSnapAnimationSpec() {
        return this.f10230b;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    @NotNull
    public final TopAppBarState getState() {
        return this.f10229a;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    public final boolean isPinned() {
        return false;
    }
}
