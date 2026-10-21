package u0;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Modifier.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Modifier.kt\nandroidx/compose/ui/ModifierNodeDetachedCancellationException\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,416:1\n26#2:417\n*S KotlinDebug\n*F\n+ 1 Modifier.kt\nandroidx/compose/ui/ModifierNodeDetachedCancellationException\n*L\n43#1:417\n*E\n"})
public final class g extends CancellationException {
    @Override // java.lang.Throwable
    @NotNull
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
