package l0;

import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.material3.SnapFlingBehavior;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SnapFlingBehavior.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.material3.SnapFlingBehavior", f = "SnapFlingBehavior.kt", i = {0, 0}, l = {135, 140}, m = "longSnap", n = {"this", "$this$longSnap"}, s = {"L$0", "L$1"})
public final class c4 extends ContinuationImpl {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public SnapFlingBehavior f82477p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ScrollScope f82478q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public /* synthetic */ Object f82479r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ SnapFlingBehavior f82480s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f82481t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(SnapFlingBehavior snapFlingBehavior, Continuation<? super c4> continuation) {
        super(continuation);
        this.f82480s0 = snapFlingBehavior;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f82479r0 = obj;
        this.f82481t0 |= Integer.MIN_VALUE;
        return SnapFlingBehavior.access$longSnap(this.f82480s0, null, 0.0f, this);
    }
}
