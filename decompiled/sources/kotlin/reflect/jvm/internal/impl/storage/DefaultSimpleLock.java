package kotlin.reflect.jvm.internal.impl.storage;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: locks.kt */
/* JADX INFO: loaded from: classes12.dex */
public class DefaultSimpleLock implements SimpleLock {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Lock f81858a;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultSimpleLock() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @NotNull
    public final Lock getLock() {
        return this.f81858a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.SimpleLock
    public void lock() {
        this.f81858a.lock();
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.SimpleLock
    public void unlock() {
        this.f81858a.unlock();
    }

    public DefaultSimpleLock(@NotNull Lock lock) {
        Intrinsics.checkNotNullParameter(lock, "lock");
        this.f81858a = lock;
    }

    public /* synthetic */ DefaultSimpleLock(Lock lock, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new ReentrantLock() : lock);
    }
}
