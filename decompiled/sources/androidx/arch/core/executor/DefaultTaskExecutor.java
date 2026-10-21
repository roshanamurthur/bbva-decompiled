package androidx.arch.core.executor;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class DefaultTaskExecutor extends TaskExecutor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1722a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f1723b = Executors.newFixedThreadPool(4, new a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public volatile Handler f1724c;

    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final AtomicInteger f1725p0 = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("arch_disk_io_" + this.f1725p0.getAndIncrement());
            return thread;
        }
    }

    @RequiresApi(28)
    public static class b {
        @NonNull
        public static Handler a(@NonNull Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    @NonNull
    public static Handler a(@NonNull Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return b.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    @Override // androidx.arch.core.executor.TaskExecutor
    public void executeOnDiskIO(@NonNull Runnable runnable) {
        this.f1723b.execute(runnable);
    }

    @Override // androidx.arch.core.executor.TaskExecutor
    public boolean isMainThread() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // androidx.arch.core.executor.TaskExecutor
    public void postToMainThread(@NonNull Runnable runnable) {
        if (this.f1724c == null) {
            synchronized (this.f1722a) {
                try {
                    if (this.f1724c == null) {
                        this.f1724c = a(Looper.getMainLooper());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f1724c.post(runnable);
    }
}
