package g0;

import androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TextSelectionMouseDetector.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt", f = "TextSelectionMouseDetector.kt", i = {0}, l = {125}, m = "awaitMouseEventDown", n = {"$this$awaitMouseEventDown"}, s = {"L$0"})
public final class i extends ContinuationImpl {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public AwaitPointerEventScope f68574p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public /* synthetic */ Object f68575q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f68576r0;

    public i() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f68575q0 = obj;
        this.f68576r0 |= Integer.MIN_VALUE;
        return TextSelectionMouseDetectorKt.access$awaitMouseEventDown(null, this);
    }
}
