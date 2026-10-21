package androidx.lifecycle;

import androidx.annotation.AnyThread;
import androidx.annotation.MainThread;
import com.adobe.marketing.mobile.EventDataKeys;
import java.util.ArrayDeque;
import java.util.Queue;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DispatchQueue.jvm.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0002H\u0007J\b\u0010\u0006\u001a\u00020\u0002H\u0007J\b\u0010\b\u001a\u00020\u0007H\u0007J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Landroidx/lifecycle/DispatchQueue;", "", "", EventDataKeys.Lifecycle.LIFECYCLE_PAUSE, "resume", "finish", "drainQueue", "", "canRun", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/lang/Runnable;", "runnable", "dispatchAndEnqueue", "Ljava/util/Queue;", "d", "Ljava/util/Queue;", "queue", "<init>", "()V", "lifecycle-common"}, k = 1, mv = {1, 8, 0})
public final class DispatchQueue {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f21848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f21849c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f21847a = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final Queue<Runnable> queue = new ArrayDeque();

    @MainThread
    public final void a(Runnable runnable) {
        if (!this.queue.offer(runnable)) {
            throw new IllegalStateException("cannot enqueue any more runnables".toString());
        }
        drainQueue();
    }

    @MainThread
    public final boolean canRun() {
        return this.f21848b || !this.f21847a;
    }

    @AnyThread
    public final void dispatchAndEnqueue(@NotNull CoroutineContext context, @NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        MainCoroutineDispatcher immediate = Dispatchers.getMain().getImmediate();
        if (immediate.isDispatchNeeded(context) || canRun()) {
            immediate.mo6007dispatch(context, new d(this, runnable, 0));
        } else {
            a(runnable);
        }
    }

    @MainThread
    public final void drainQueue() {
        if (this.f21849c) {
            return;
        }
        try {
            this.f21849c = true;
            while ((!this.queue.isEmpty()) && canRun()) {
                Runnable runnablePoll = this.queue.poll();
                if (runnablePoll != null) {
                    runnablePoll.run();
                }
            }
            this.f21849c = false;
        } catch (Throwable th2) {
            this.f21849c = false;
            throw th2;
        }
    }

    @MainThread
    public final void finish() {
        this.f21848b = true;
        drainQueue();
    }

    @MainThread
    public final void pause() {
        this.f21847a = true;
    }

    @MainThread
    public final void resume() {
        if (this.f21847a) {
            if (!(!this.f21848b)) {
                throw new IllegalStateException("Cannot resume a finished dispatcher".toString());
            }
            this.f21847a = false;
            drainQueue();
        }
    }
}
