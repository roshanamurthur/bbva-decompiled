package v;

import androidx.compose.animation.core.AnimationState;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SnapFlingBehavior.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", f = "SnapFlingBehavior.kt", i = {0, 0, 0}, l = {362}, m = "animateDecay", n = {"animationState", "previousValue", "targetOffset"}, s = {"L$0", "L$1", "F$0"})
public final class i extends ContinuationImpl {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public float f93928p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public AnimationState f93929q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Ref.FloatRef f93930r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public /* synthetic */ Object f93931s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f93932t0;

    public i() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f93931s0 = obj;
        this.f93932t0 |= Integer.MIN_VALUE;
        return SnapFlingBehaviorKt.access$animateDecay(null, 0.0f, null, null, null, this);
    }
}
