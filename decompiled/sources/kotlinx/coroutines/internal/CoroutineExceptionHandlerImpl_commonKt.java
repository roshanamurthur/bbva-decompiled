package kotlinx.coroutines.internal;

import ak.b;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CoroutineExceptionHandlerImpl.common.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¨\u0006\u0006"}, d2 = {"handleUncaughtCoroutineException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CoroutineExceptionHandlerImpl_commonKt {
    public static final void handleUncaughtCoroutineException(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th2) {
        Iterator<CoroutineExceptionHandler> it = CoroutineExceptionHandlerImplKt.getPlatformExceptionHandlers().iterator();
        while (it.hasNext()) {
            try {
                it.next().handleException(coroutineContext, th2);
            } catch (ExceptionSuccessfullyProcessed unused) {
                return;
            } catch (Throwable th3) {
                CoroutineExceptionHandlerImplKt.propagateExceptionFinalResort(CoroutineExceptionHandlerKt.handlerException(th2, th3));
            }
        }
        try {
            b.addSuppressed(th2, new DiagnosticCoroutineContextException(coroutineContext));
        } catch (Throwable unused2) {
        }
        CoroutineExceptionHandlerImplKt.propagateExceptionFinalResort(th2);
    }
}
