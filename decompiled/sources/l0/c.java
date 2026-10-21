package l0;

import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationVector;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SnapFlingBehavior.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c<T, V extends AnimationVector> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f82460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final AnimationState<T, V> f82461b;

    /* JADX WARN: Multi-variable type inference failed */
    public c(Float f6, @NotNull AnimationState currentAnimationState) {
        Intrinsics.checkNotNullParameter(currentAnimationState, "currentAnimationState");
        this.f82460a = f6;
        this.f82461b = currentAnimationState;
    }
}
