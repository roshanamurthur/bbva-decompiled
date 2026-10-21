package kotlin.reflect.jvm.internal.impl.storage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: locks.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface SimpleLock {

    @NotNull
    public static final Companion Companion = Companion.f81876a;

    /* JADX INFO: compiled from: locks.kt */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f81876a = new Companion();

        @NotNull
        public final DefaultSimpleLock simpleLock(@Nullable Runnable runnable, @Nullable Function1<? super InterruptedException, Unit> function1) {
            return (runnable == null || function1 == null) ? new DefaultSimpleLock(null, 1, null) : new CancellableSimpleLock(runnable, function1);
        }
    }

    void lock();

    void unlock();
}
