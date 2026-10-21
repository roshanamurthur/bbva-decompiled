package s;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.VectorizedAnimationSpec;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: VectorizedAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g {
    @NotNull
    public static AnimationVector a(VectorizedAnimationSpec vectorizedAnimationSpec, @NotNull AnimationVector initialValue, @NotNull AnimationVector targetValue, @NotNull AnimationVector initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        return vectorizedAnimationSpec.getVelocityFromNanos(vectorizedAnimationSpec.getDurationNanos(initialValue, targetValue, initialVelocity), initialValue, targetValue, initialVelocity);
    }
}
