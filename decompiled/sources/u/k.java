package u;

import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Scrollable.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableKt", f = "Scrollable.kt", i = {0}, l = {371}, m = "awaitScrollEvent", n = {"$this$awaitScrollEvent"}, s = {"L$0"})
public final class k extends ContinuationImpl {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public AwaitPointerEventScope f93677p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public /* synthetic */ Object f93678q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f93679r0;

    public k() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f93678q0 = obj;
        this.f93679r0 |= Integer.MIN_VALUE;
        return ScrollableKt.access$awaitScrollEvent(null, this);
    }
}
