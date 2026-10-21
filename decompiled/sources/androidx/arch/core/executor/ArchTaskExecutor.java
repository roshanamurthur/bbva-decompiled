package androidx.arch.core.executor;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.arch.core.executor.ArchTaskExecutor;
import java.util.concurrent.Executor;
import n.a;
import n.b;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ArchTaskExecutor extends TaskExecutor {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile ArchTaskExecutor f1717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public static final a f1718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public static final b f1719e = new b(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public TaskExecutor f1720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final DefaultTaskExecutor f1721b;

    /* JADX WARN: Type inference failed for: r0v0, types: [n.a] */
    static {
        final int i10 = 0;
        f1718d = new Executor() { // from class: n.a
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                switch (i10) {
                    case 0:
                        ArchTaskExecutor.getInstance().postToMainThread(runnable);
                        break;
                    default:
                        runnable.run();
                        break;
                }
            }
        };
    }

    public ArchTaskExecutor() {
        DefaultTaskExecutor defaultTaskExecutor = new DefaultTaskExecutor();
        this.f1721b = defaultTaskExecutor;
        this.f1720a = defaultTaskExecutor;
    }

    @NonNull
    public static Executor getIOThreadExecutor() {
        return f1719e;
    }

    @NonNull
    public static ArchTaskExecutor getInstance() {
        if (f1717c != null) {
            return f1717c;
        }
        synchronized (ArchTaskExecutor.class) {
            try {
                if (f1717c == null) {
                    f1717c = new ArchTaskExecutor();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f1717c;
    }

    @NonNull
    public static Executor getMainThreadExecutor() {
        return f1718d;
    }

    @Override // androidx.arch.core.executor.TaskExecutor
    public void executeOnDiskIO(@NonNull Runnable runnable) {
        this.f1720a.executeOnDiskIO(runnable);
    }

    @Override // androidx.arch.core.executor.TaskExecutor
    public boolean isMainThread() {
        return this.f1720a.isMainThread();
    }

    @Override // androidx.arch.core.executor.TaskExecutor
    public void postToMainThread(@NonNull Runnable runnable) {
        this.f1720a.postToMainThread(runnable);
    }

    public void setDelegate(@Nullable TaskExecutor taskExecutor) {
        if (taskExecutor == null) {
            taskExecutor = this.f1721b;
        }
        this.f1720a = taskExecutor;
    }
}
