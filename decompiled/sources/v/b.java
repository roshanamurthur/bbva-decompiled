package v;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.foundation.gestures.ScrollScope;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SnapFlingBehavior.kt */
/* JADX INFO: loaded from: classes.dex */
public interface b<T, V extends AnimationVector> {
    @Nullable
    Object a(@NotNull ScrollScope scrollScope, Float f6, Float f10, @NotNull Function1 function1, @NotNull m mVar);
}
