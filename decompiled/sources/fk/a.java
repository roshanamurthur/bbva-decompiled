package fk;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RunSuspend.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class a implements Continuation<Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    public Result<Unit> f68453p0;

    public final void await() {
        synchronized (this) {
            while (true) {
                try {
                    Result<Unit> result = this.f68453p0;
                    if (result == null) {
                        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
                        wait();
                    } else {
                        ResultKt.throwOnFailure(result.getF79387p0());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // kotlin.coroutines.Continuation
    @NotNull
    public CoroutineContext getContext() {
        return EmptyCoroutineContext.INSTANCE;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(@NotNull Object obj) {
        synchronized (this) {
            this.f68453p0 = Result.m5534boximpl(obj);
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
            Unit unit = Unit.INSTANCE;
        }
    }
}
