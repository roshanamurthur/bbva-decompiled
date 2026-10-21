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
public final class EnterAlwaysScrollBehavior implements TopAppBarScrollBehavior {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final TopAppBarState f10218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final AnimationSpec<Float> f10219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final DecayAnimationSpec<Float> f10220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Function0<Boolean> f10221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final EnterAlwaysScrollBehavior$nestedScrollConnection$1 f10222e;

    public EnterAlwaysScrollBehavior(@NotNull TopAppBarState state, @Nullable AnimationSpec<Float> animationSpec, @Nullable DecayAnimationSpec<Float> decayAnimationSpec, @NotNull Function0<Boolean> canScroll) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(canScroll, "canScroll");
        this.f10218a = state;
        this.f10219b = animationSpec;
        this.f10220c = decayAnimationSpec;
        this.f10221d = canScroll;
        this.f10222e = new EnterAlwaysScrollBehavior$nestedScrollConnection$1(this);
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    @Nullable
    public final DecayAnimationSpec<Float> getFlingAnimationSpec() {
        return this.f10220c;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    @NotNull
    public final NestedScrollConnection getNestedScrollConnection() {
        return this.f10222e;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    @Nullable
    public final AnimationSpec<Float> getSnapAnimationSpec() {
        return this.f10219b;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    @NotNull
    public final TopAppBarState getState() {
        return this.f10218a;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    public final boolean isPinned() {
        return false;
    }
}
