package k2;

import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.core.util.Preconditions;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: RequestExecutor.java */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements Executor {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Handler f79176p0;

    public d(@NonNull Handler handler) {
        this.f79176p0 = (Handler) Preconditions.checkNotNull(handler);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        Runnable runnable2 = (Runnable) Preconditions.checkNotNull(runnable);
        Handler handler = this.f79176p0;
        if (handler.post(runnable2)) {
            return;
        }
        throw new RejectedExecutionException(handler + " is shutting down");
    }
}
