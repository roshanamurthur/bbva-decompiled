package m0;

import androidx.compose.runtime.RecomposerKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Recomposer.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/ProduceFrameSignal\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n*L\n1#1,1646:1\n89#2:1647\n89#2:1657\n314#3,9:1648\n323#3,2:1658\n50#4,7:1660\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/ProduceFrameSignal\n*L\n1592#1:1647\n1599#1:1657\n1598#1:1648,9\n1598#1:1658,2\n1616#1:1660,7\n*E\n"})
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Object f83335a;

    @Nullable
    public final Continuation<Unit> a() {
        Object obj = this.f83335a;
        if (obj instanceof Continuation) {
            this.f83335a = RecomposerKt.f14728b;
            return (Continuation) obj;
        }
        if (!Intrinsics.areEqual(obj, RecomposerKt.f14727a) && !Intrinsics.areEqual(obj, RecomposerKt.f14728b)) {
            if (obj != null) {
                throw new IllegalStateException(("invalid pendingFrameContinuation " + obj).toString());
            }
            this.f83335a = RecomposerKt.f14727a;
        }
        return null;
    }
}
