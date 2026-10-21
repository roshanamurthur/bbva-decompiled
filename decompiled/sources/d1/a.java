package d1;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Velocity;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NestedScrollModifier.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a {
    @Nullable
    public static Object a(NestedScrollConnection nestedScrollConnection, long j10, long j11, @NotNull Continuation continuation) {
        return i(nestedScrollConnection, j10, j11, continuation);
    }

    public static long b(NestedScrollConnection nestedScrollConnection, long j10, long j11, int i10) {
        return Offset.INSTANCE.m2291getZeroF1C5BW0();
    }

    @Nullable
    public static Object c(NestedScrollConnection nestedScrollConnection, long j10, @NotNull Continuation continuation) {
        return j(nestedScrollConnection, j10, continuation);
    }

    public static long d(NestedScrollConnection nestedScrollConnection, long j10, int i10) {
        return Offset.INSTANCE.m2291getZeroF1C5BW0();
    }

    public static /* synthetic */ Object i(NestedScrollConnection nestedScrollConnection, long j10, long j11, Continuation<? super Velocity> continuation) {
        return Velocity.m4605boximpl(Velocity.INSTANCE.m4625getZero9UxMQ8M());
    }

    public static /* synthetic */ Object j(NestedScrollConnection nestedScrollConnection, long j10, Continuation<? super Velocity> continuation) {
        return Velocity.m4605boximpl(Velocity.INSTANCE.m4625getZero9UxMQ8M());
    }
}
