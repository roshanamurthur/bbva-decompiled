package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.IntSize;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AnimatedVisibility.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0012\u0010\tR(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR#\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Landroidx/compose/animation/AnimatedVisibilityScopeImpl;", "Landroidx/compose/animation/AnimatedVisibilityScope;", "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/EnterExitState;", "a", "Landroidx/compose/animation/core/Transition;", "getTransition", "()Landroidx/compose/animation/core/Transition;", "setTransition", "(Landroidx/compose/animation/core/Transition;)V", ConstantsKt.TRANSITION_EXTRA_ID, "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/ui/unit/IntSize;", "b", "Landroidx/compose/runtime/MutableState;", "getTargetSize$animation_release", "()Landroidx/compose/runtime/MutableState;", "targetSize", "<init>", "animation_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalAnimationApi
public final class AnimatedVisibilityScopeImpl implements AnimatedVisibilityScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Transition<EnterExitState> transition;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState<IntSize> targetSize;

    public AnimatedVisibilityScopeImpl(@NotNull Transition<EnterExitState> transition) {
        Intrinsics.checkNotNullParameter(transition, "transition");
        this.transition = transition;
        this.targetSize = SnapshotStateKt.mutableStateOf$default(IntSize.m4541boximpl(IntSize.INSTANCE.m4554getZeroYbymL2g()), null, 2, null);
    }

    @Override // androidx.compose.animation.AnimatedVisibilityScope
    public final /* synthetic */ Modifier animateEnterExit(Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str) {
        return AnimatedVisibilityScope.CC.a(this, modifier, enterTransition, exitTransition, str);
    }

    @NotNull
    public final MutableState<IntSize> getTargetSize$animation_release() {
        return this.targetSize;
    }

    @Override // androidx.compose.animation.AnimatedVisibilityScope
    @NotNull
    public Transition<EnterExitState> getTransition() {
        return this.transition;
    }

    public void setTransition(@NotNull Transition<EnterExitState> transition) {
        Intrinsics.checkNotNullParameter(transition, "<set-?>");
        this.transition = transition;
    }
}
