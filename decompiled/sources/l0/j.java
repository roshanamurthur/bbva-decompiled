package l0;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.material3.TopAppBarState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: AppBar.kt */
/* JADX INFO: loaded from: classes.dex */
public final class j extends Lambda implements Function1<AnimationScope<Float, AnimationVector1D>, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ TopAppBarState f82621p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(TopAppBarState topAppBarState) {
        super(1);
        this.f82621p0 = topAppBarState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
        AnimationScope<Float, AnimationVector1D> animateTo = animationScope;
        Intrinsics.checkNotNullParameter(animateTo, "$this$animateTo");
        this.f82621p0.setHeightOffset(animateTo.getValue().floatValue());
        return Unit.INSTANCE;
    }
}
