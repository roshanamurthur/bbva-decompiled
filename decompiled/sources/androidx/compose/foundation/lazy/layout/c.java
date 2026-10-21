package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationVector1D;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LazyAnimateScroll.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c extends CancellationException {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f5082p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final AnimationState<Float, AnimationVector1D> f5083q0;

    public c(int i10, @NotNull AnimationState<Float, AnimationVector1D> previousAnimation) {
        Intrinsics.checkNotNullParameter(previousAnimation, "previousAnimation");
        this.f5082p0 = i10;
        this.f5083q0 = previousAnimation;
    }
}
