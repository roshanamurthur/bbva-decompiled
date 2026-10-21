package kotlin.reflect.jvm.internal.impl.storage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: locks.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class CancellableSimpleLock extends DefaultSimpleLock {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Runnable f81856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Function1<InterruptedException, Unit> f81857c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CancellableSimpleLock(@NotNull Lock lock, @NotNull Runnable checkCancelled, @NotNull Function1<? super InterruptedException, Unit> interruptedExceptionHandler) {
        super(lock);
        Intrinsics.checkNotNullParameter(lock, "lock");
        Intrinsics.checkNotNullParameter(checkCancelled, "checkCancelled");
        Intrinsics.checkNotNullParameter(interruptedExceptionHandler, "interruptedExceptionHandler");
        this.f81856b = checkCancelled;
        this.f81857c = interruptedExceptionHandler;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.DefaultSimpleLock, kotlin.reflect.jvm.internal.impl.storage.SimpleLock
    public void lock() {
        while (!getLock().tryLock(50L, TimeUnit.MILLISECONDS)) {
            try {
                this.f81856b.run();
            } catch (InterruptedException e5) {
                this.f81857c.invoke(e5);
                return;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CancellableSimpleLock(@NotNull Runnable checkCancelled, @NotNull Function1<? super InterruptedException, Unit> interruptedExceptionHandler) {
        this(new ReentrantLock(), checkCancelled, interruptedExceptionHandler);
        Intrinsics.checkNotNullParameter(checkCancelled, "checkCancelled");
        Intrinsics.checkNotNullParameter(interruptedExceptionHandler, "interruptedExceptionHandler");
    }
}
