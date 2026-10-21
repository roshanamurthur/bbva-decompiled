package androidx.work;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class DelegatingWorkerFactory extends WorkerFactory {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f24290c = Logger.tagWithPrefix("DelegatingWkrFctry");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f24291b = new CopyOnWriteArrayList();

    public final void addFactory(@NonNull WorkerFactory workerFactory) {
        this.f24291b.add(workerFactory);
    }

    @Override // androidx.work.WorkerFactory
    @Nullable
    public final ListenableWorker createWorker(@NonNull Context context, @NonNull String str, @NonNull WorkerParameters workerParameters) {
        Iterator it = this.f24291b.iterator();
        while (it.hasNext()) {
            try {
                ListenableWorker listenableWorkerCreateWorker = ((WorkerFactory) it.next()).createWorker(context, str, workerParameters);
                if (listenableWorkerCreateWorker != null) {
                    return listenableWorkerCreateWorker;
                }
            } catch (Throwable th2) {
                Logger.get().error(f24290c, String.format("Unable to instantiate a ListenableWorker (%s)", str), th2);
                throw th2;
            }
        }
        return null;
    }
}
