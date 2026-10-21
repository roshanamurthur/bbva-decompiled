package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import androidx.work.impl.utils.futures.SettableFuture;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Worker extends ListenableWorker {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public SettableFuture<ListenableWorker.Result> f24337u0;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Worker worker = Worker.this;
            try {
                worker.f24337u0.set(worker.doWork());
            } catch (Throwable th2) {
                worker.f24337u0.setException(th2);
            }
        }
    }

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public Worker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @NonNull
    @WorkerThread
    public abstract ListenableWorker.Result doWork();

    @Override // androidx.work.ListenableWorker
    @NonNull
    public final ListenableFuture<ListenableWorker.Result> startWork() {
        this.f24337u0 = SettableFuture.create();
        getBackgroundExecutor().execute(new a());
        return this.f24337u0;
    }
}
