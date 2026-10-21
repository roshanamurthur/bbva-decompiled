package v;

import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior;
import com.esotericsoftware.asm.Opcodes;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SnapFlingBehavior.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", f = "SnapFlingBehavior.kt", i = {0, 0, 0, 0}, l = {179, Opcodes.ATHROW}, m = "longSnap", n = {"this", "$this$longSnap", "onAnimationStep", "remainingScrollOffset"}, s = {"L$0", "L$1", "L$2", "L$3"})
public final class e extends ContinuationImpl {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public SnapFlingBehavior f93916p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ScrollScope f93917q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Function1 f93918r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public Ref.FloatRef f93919s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public /* synthetic */ Object f93920t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ SnapFlingBehavior f93921u0;
    public int v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(SnapFlingBehavior snapFlingBehavior, Continuation<? super e> continuation) {
        super(continuation);
        this.f93921u0 = snapFlingBehavior;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f93920t0 = obj;
        this.v0 |= Integer.MIN_VALUE;
        return SnapFlingBehavior.access$longSnap(this.f93921u0, null, 0.0f, null, this);
    }
}
