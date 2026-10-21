package r;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitState;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.ExperimentalAnimationApi;
import androidx.compose.animation.core.Transition;
import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AnimatedContent.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a implements AnimatedContentScope, AnimatedVisibilityScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AnimatedVisibilityScope f92882a;

    public a(@NotNull AnimatedVisibilityScope animatedVisibilityScope) {
        Intrinsics.checkNotNullParameter(animatedVisibilityScope, "animatedVisibilityScope");
        this.f92882a = animatedVisibilityScope;
    }

    @Override // androidx.compose.animation.AnimatedVisibilityScope
    @ExperimentalAnimationApi
    @NotNull
    public final Modifier animateEnterExit(@NotNull Modifier modifier, @NotNull EnterTransition enter, @NotNull ExitTransition exit, @NotNull String label) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(enter, "enter");
        Intrinsics.checkNotNullParameter(exit, "exit");
        Intrinsics.checkNotNullParameter(label, "label");
        return this.f92882a.animateEnterExit(modifier, enter, exit, label);
    }

    @Override // androidx.compose.animation.AnimatedVisibilityScope
    @ExperimentalAnimationApi
    @NotNull
    public final Transition<EnterExitState> getTransition() {
        return this.f92882a.getTransition();
    }
}
