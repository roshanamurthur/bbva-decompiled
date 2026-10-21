package t;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MutatorMutex.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nMutatorMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutatorMutex.kt\nandroidx/compose/foundation/MutationInterruptedException\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,180:1\n26#2:181\n*S KotlinDebug\n*F\n+ 1 MutatorMutex.kt\nandroidx/compose/foundation/MutationInterruptedException\n*L\n64#1:181\n*E\n"})
public final class e0 extends CancellationException {
    @Override // java.lang.Throwable
    @NotNull
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
