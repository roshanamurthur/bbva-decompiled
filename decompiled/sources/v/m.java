package v;

import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;
import androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider;
import androidx.compose.ui.unit.Density;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SnapFlingBehavior.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", f = "SnapFlingBehavior.kt", i = {0, 0}, l = {312}, m = "approach", n = {"snapLayoutInfoProvider", "density"}, s = {"L$0", "L$1"})
public final class m extends ContinuationImpl {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public SnapLayoutInfoProvider f93947p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Density f93948q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public /* synthetic */ Object f93949r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f93950s0;

    public m() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f93949r0 = obj;
        this.f93950s0 |= Integer.MIN_VALUE;
        return SnapFlingBehaviorKt.access$approach(null, 0.0f, 0.0f, null, null, null, null, this);
    }
}
