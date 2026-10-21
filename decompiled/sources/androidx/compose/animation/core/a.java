package androidx.compose.animation.core;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: SuspendAnimation.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ AnimationState<Object, AnimationVector> f3212p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(AnimationState<Object, AnimationVector> animationState) {
        super(0);
        this.f3212p0 = animationState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f3212p0.setRunning$animation_core_release(false);
        return Unit.INSTANCE;
    }
}
