package r;

import androidx.compose.animation.SizeTransform;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AnimatedContent.kt */
/* JADX INFO: loaded from: classes.dex */
public final class g implements SizeTransform {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f92899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function2<IntSize, IntSize, FiniteAnimationSpec<IntSize>> f92900b;

    /* JADX WARN: Multi-variable type inference failed */
    public g(boolean z10, @NotNull Function2<? super IntSize, ? super IntSize, ? extends FiniteAnimationSpec<IntSize>> sizeAnimationSpec) {
        Intrinsics.checkNotNullParameter(sizeAnimationSpec, "sizeAnimationSpec");
        this.f92899a = z10;
        this.f92900b = sizeAnimationSpec;
    }

    @Override // androidx.compose.animation.SizeTransform
    @NotNull
    /* JADX INFO: renamed from: createAnimationSpec-TemP2vQ */
    public final FiniteAnimationSpec<IntSize> mo64createAnimationSpecTemP2vQ(long j10, long j11) {
        return this.f92900b.invoke(IntSize.m4541boximpl(j10), IntSize.m4541boximpl(j11));
    }

    @Override // androidx.compose.animation.SizeTransform
    public final boolean getClip() {
        return this.f92899a;
    }
}
