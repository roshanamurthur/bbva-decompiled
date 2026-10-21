package u;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import com.esotericsoftware.asm.Opcodes;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TapGestureDetector.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", i = {0}, l = {Opcodes.MONITOREXIT}, m = "consumeUntilUp", n = {"$this$consumeUntilUp"}, s = {"L$0"})
public final class q extends ContinuationImpl {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public AwaitPointerEventScope f93692p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public /* synthetic */ Object f93693q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f93694r0;

    public q() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f93693q0 = obj;
        this.f93694r0 |= Integer.MIN_VALUE;
        return TapGestureDetectorKt.access$consumeUntilUp(null, this);
    }
}
