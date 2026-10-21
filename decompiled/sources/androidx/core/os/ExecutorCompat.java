package androidx.core.os;

import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.core.util.Preconditions;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes2.dex */
public final class ExecutorCompat {

    public static class a implements Executor {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Handler f19997p0;

        public a(@NonNull Handler handler) {
            this.f19997p0 = (Handler) Preconditions.checkNotNull(handler);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(@NonNull Runnable runnable) {
            Runnable runnable2 = (Runnable) Preconditions.checkNotNull(runnable);
            Handler handler = this.f19997p0;
            if (handler.post(runnable2)) {
                return;
            }
            throw new RejectedExecutionException(handler + " is shutting down");
        }
    }

    @NonNull
    public static Executor create(@NonNull Handler handler) {
        return new a(handler);
    }
}
