package s;

import androidx.compose.animation.core.AnimationKt;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: VectorizedAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h {
    public static long a(VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, @NotNull AnimationVector initialValue, @NotNull AnimationVector targetValue, @NotNull AnimationVector initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        return ((long) (vectorizedDurationBasedAnimationSpec.getDurationMillis() + vectorizedDurationBasedAnimationSpec.getDelayMillis())) * AnimationKt.MillisToNanos;
    }
}
