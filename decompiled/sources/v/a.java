package v;

import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationVector;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SnapFlingBehavior.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a<T, V extends AnimationVector> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f93910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final AnimationState<T, V> f93911b;

    /* JADX WARN: Multi-variable type inference failed */
    public a(Float f6, @NotNull AnimationState currentAnimationState) {
        Intrinsics.checkNotNullParameter(currentAnimationState, "currentAnimationState");
        this.f93910a = f6;
        this.f93911b = currentAnimationState;
    }
}
