package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FloatDecayAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a*\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0000¨\u0006\u0007"}, d2 = {"Landroidx/compose/animation/core/FloatDecayAnimationSpec;", "", "startValue", "startVelocity", "Landroidx/compose/animation/core/Animation;", "Landroidx/compose/animation/core/AnimationVector1D;", "createAnimation", "animation-core_release"}, k = 2, mv = {1, 8, 0})
public final class FloatDecayAnimationSpecKt {
    @NotNull
    public static final Animation<Float, AnimationVector1D> createAnimation(@NotNull FloatDecayAnimationSpec floatDecayAnimationSpec, float f6, float f10) {
        Intrinsics.checkNotNullParameter(floatDecayAnimationSpec, "<this>");
        return AnimationKt.DecayAnimation(floatDecayAnimationSpec, f6, f10);
    }

    public static /* synthetic */ Animation createAnimation$default(FloatDecayAnimationSpec floatDecayAnimationSpec, float f6, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        return createAnimation(floatDecayAnimationSpec, f6, f10);
    }
}
