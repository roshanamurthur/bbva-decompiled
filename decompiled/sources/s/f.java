package s;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.TwoWayConverter;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: VectorConverters.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f<T, V extends AnimationVector> implements TwoWayConverter<T, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Function1<T, V> f93110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function1<V, T> f93111b;

    /* JADX WARN: Multi-variable type inference failed */
    public f(@NotNull Function1<? super T, ? extends V> convertToVector, @NotNull Function1<? super V, ? extends T> convertFromVector) {
        Intrinsics.checkNotNullParameter(convertToVector, "convertToVector");
        Intrinsics.checkNotNullParameter(convertFromVector, "convertFromVector");
        this.f93110a = convertToVector;
        this.f93111b = convertFromVector;
    }

    @Override // androidx.compose.animation.core.TwoWayConverter
    @NotNull
    public final Function1<V, T> getConvertFromVector() {
        return this.f93111b;
    }

    @Override // androidx.compose.animation.core.TwoWayConverter
    @NotNull
    public final Function1<T, V> getConvertToVector() {
        return this.f93110a;
    }
}
