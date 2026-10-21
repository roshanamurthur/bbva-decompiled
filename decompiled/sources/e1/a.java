package e1;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventPass;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SuspendingPointerInputFilter.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a {
    public static long a(AwaitPointerEventScope awaitPointerEventScope) {
        return Size.INSTANCE.m2353getZeroNHjbRc();
    }

    @Nullable
    public static Object b(AwaitPointerEventScope awaitPointerEventScope, long j10, @NotNull Function2 function2, @NotNull Continuation continuation) {
        return u(awaitPointerEventScope, j10, function2, continuation);
    }

    @Nullable
    public static Object c(AwaitPointerEventScope awaitPointerEventScope, long j10, @NotNull Function2 function2, @NotNull Continuation continuation) {
        return v(awaitPointerEventScope, j10, function2, continuation);
    }

    public static /* synthetic */ Object t(AwaitPointerEventScope awaitPointerEventScope, PointerEventPass pointerEventPass, Continuation continuation, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitPointerEvent");
        }
        if ((i10 & 1) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return awaitPointerEventScope.awaitPointerEvent(pointerEventPass, continuation);
    }

    public static /* synthetic */ <T> Object u(AwaitPointerEventScope awaitPointerEventScope, long j10, Function2<? super AwaitPointerEventScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        return function2.invoke(awaitPointerEventScope, continuation);
    }

    public static /* synthetic */ <T> Object v(AwaitPointerEventScope awaitPointerEventScope, long j10, Function2<? super AwaitPointerEventScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        return function2.invoke(awaitPointerEventScope, continuation);
    }
}
