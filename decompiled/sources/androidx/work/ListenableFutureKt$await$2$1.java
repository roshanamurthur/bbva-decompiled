package androidx.work;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlinx.coroutines.CancellableContinuation;

/* JADX INFO: compiled from: ListenableFuture.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {"R", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
public final class ListenableFutureKt$await$2$1 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CancellableContinuation<R> f24299p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ ListenableFuture<R> f24300q0;

    /* JADX WARN: Multi-variable type inference failed */
    public ListenableFutureKt$await$2$1(CancellableContinuation<? super R> cancellableContinuation, ListenableFuture<R> listenableFuture) {
        this.f24299p0 = cancellableContinuation;
        this.f24300q0 = listenableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CancellableContinuation<R> cancellableContinuation = this.f24299p0;
        try {
            cancellableContinuation.resumeWith(Result.m5535constructorimpl(this.f24300q0.get()));
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                cause = th2;
            }
            if (th2 instanceof CancellationException) {
                cancellableContinuation.cancel(cause);
            } else {
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m5535constructorimpl(ResultKt.createFailure(cause)));
            }
        }
    }
}
