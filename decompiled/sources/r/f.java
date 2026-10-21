package r;

import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.TransitionData;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: EnterExitTransition.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
public final class f extends ExitTransition {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final TransitionData f92898b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@NotNull TransitionData data) {
        super(null);
        Intrinsics.checkNotNullParameter(data, "data");
        this.f92898b = data;
    }

    @Override // androidx.compose.animation.ExitTransition
    @NotNull
    public final TransitionData getData$animation_release() {
        return this.f92898b;
    }
}
