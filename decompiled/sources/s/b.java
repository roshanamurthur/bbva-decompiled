package s;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.FloatDecayAnimationSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorizedDecayAnimationSpec;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DecayAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b<T> implements DecayAnimationSpec<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final FloatDecayAnimationSpec f93109a;

    public b(@NotNull FloatDecayAnimationSpec floatDecaySpec) {
        Intrinsics.checkNotNullParameter(floatDecaySpec, "floatDecaySpec");
        this.f93109a = floatDecaySpec;
    }

    @Override // androidx.compose.animation.core.DecayAnimationSpec
    @NotNull
    public final <V extends AnimationVector> VectorizedDecayAnimationSpec<V> vectorize(@NotNull TwoWayConverter<T, V> typeConverter) {
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
        return new j(this.f93109a);
    }
}
