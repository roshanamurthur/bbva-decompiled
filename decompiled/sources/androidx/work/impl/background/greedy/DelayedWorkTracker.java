package androidx.work.impl.background.greedy;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.RunnableScheduler;
import androidx.work.impl.model.WorkSpec;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class DelayedWorkTracker {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f24425d = Logger.tagWithPrefix("DelayedWorkTracker");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GreedyScheduler f24426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RunnableScheduler f24427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f24428c = new HashMap();

    public class a implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ WorkSpec f24429p0;

        public a(WorkSpec workSpec) {
            this.f24429p0 = workSpec;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Logger logger = Logger.get();
            String str = DelayedWorkTracker.f24425d;
            WorkSpec workSpec = this.f24429p0;
            logger.debug(str, String.format("Scheduling work %s", workSpec.id), new Throwable[0]);
            DelayedWorkTracker.this.f24426a.schedule(workSpec);
        }
    }

    public DelayedWorkTracker(@NonNull GreedyScheduler greedyScheduler, @NonNull RunnableScheduler runnableScheduler) {
        this.f24426a = greedyScheduler;
        this.f24427b = runnableScheduler;
    }

    public void schedule(@NonNull WorkSpec workSpec) {
        HashMap map = this.f24428c;
        Runnable runnable = (Runnable) map.remove(workSpec.id);
        RunnableScheduler runnableScheduler = this.f24427b;
        if (runnable != null) {
            runnableScheduler.cancel(runnable);
        }
        a aVar = new a(workSpec);
        map.put(workSpec.id, aVar);
        runnableScheduler.scheduleWithDelay(workSpec.calculateNextRunTime() - System.currentTimeMillis(), aVar);
    }

    public void unschedule(@NonNull String str) {
        Runnable runnable = (Runnable) this.f24428c.remove(str);
        if (runnable != null) {
            this.f24427b.cancel(runnable);
        }
    }
}
