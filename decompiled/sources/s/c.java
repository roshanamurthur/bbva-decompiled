package s;

import androidx.compose.animation.core.FloatAnimationSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorizedFloatAnimationSpec;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FloatAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c {
    public static float a(FloatAnimationSpec floatAnimationSpec, float f6, float f10, float f11) {
        return floatAnimationSpec.getVelocityFromNanos(floatAnimationSpec.getDurationNanos(f6, f10, f11), f6, f10, f11);
    }

    @NotNull
    public static VectorizedFloatAnimationSpec c(FloatAnimationSpec floatAnimationSpec, @NotNull TwoWayConverter converter) {
        Intrinsics.checkNotNullParameter(converter, "converter");
        return new VectorizedFloatAnimationSpec(floatAnimationSpec);
    }
}
