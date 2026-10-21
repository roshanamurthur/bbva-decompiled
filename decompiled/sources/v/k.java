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
@DebugMetadata(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", f = "SnapFlingBehavior.kt", i = {0, 0, 0, 0}, l = {407}, m = "animateSnap", n = {"animationState", "consumedUpToNow", "targetOffset", "initialVelocity"}, s = {"L$0", "L$1", "F$0", "F$1"})
public final class k extends ContinuationImpl {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public float f93937p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public float f93938q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public AnimationState f93939r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public Ref.FloatRef f93940s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public /* synthetic */ Object f93941t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f93942u0;

    public k() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f93941t0 = obj;
        this.f93942u0 |= Integer.MIN_VALUE;
        return SnapFlingBehaviorKt.access$animateSnap(null, 0.0f, 0.0f, null, null, null, this);
    }
}
