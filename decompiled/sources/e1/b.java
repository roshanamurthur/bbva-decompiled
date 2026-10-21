package e1;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SuspendingPointerInputFilter.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSuspendingPointerInputFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/CancelTimeoutCancellationException\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,775:1\n26#2:776\n*S KotlinDebug\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/CancelTimeoutCancellationException\n*L\n771#1:776\n*E\n"})
public final class b extends CancellationException {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public static final b f68258p0 = new b();

    @Override // java.lang.Throwable
    @NotNull
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
