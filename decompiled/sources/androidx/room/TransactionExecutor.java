package androidx.room;

import com.sun.mail.imap.IMAPStore;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TransactionExecutor.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0006\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Landroidx/room/TransactionExecutor;", "Ljava/util/concurrent/Executor;", "Ljava/lang/Runnable;", IMAPStore.ID_COMMAND, "", "execute", "scheduleNext", "executor", "<init>", "(Ljava/util/concurrent/Executor;)V", "room-runtime_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTransactionExecutor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionExecutor.kt\nandroidx/room/TransactionExecutor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,55:1\n1#2:56\n*E\n"})
public final class TransactionExecutor implements Executor {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final Executor f23358p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final ArrayDeque<Runnable> f23359q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @Nullable
    public Runnable f23360r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final Object f23361s0;

    public TransactionExecutor(@NotNull Executor executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f23358p0 = executor;
        this.f23359q0 = new ArrayDeque<>();
        this.f23361s0 = new Object();
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NotNull Runnable command) {
        Intrinsics.checkNotNullParameter(command, "command");
        synchronized (this.f23361s0) {
            try {
                this.f23359q0.offer(new i(command, this, 0));
                if (this.f23360r0 == null) {
                    scheduleNext();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void scheduleNext() {
        synchronized (this.f23361s0) {
            try {
                Runnable runnablePoll = this.f23359q0.poll();
                Runnable runnable = runnablePoll;
                this.f23360r0 = runnable;
                if (runnablePoll != null) {
                    this.f23358p0.execute(runnable);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
