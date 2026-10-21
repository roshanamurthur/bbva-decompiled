package r;

import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.TransitionData;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: EnterExitTransition.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
public final class e extends EnterTransition {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final TransitionData f92897b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@NotNull TransitionData data) {
        super(null);
        Intrinsics.checkNotNullParameter(data, "data");
        this.f92897b = data;
    }

    @Override // androidx.compose.animation.EnterTransition
    @NotNull
    public final TransitionData getData$animation_release() {
        return this.f92897b;
    }
}
