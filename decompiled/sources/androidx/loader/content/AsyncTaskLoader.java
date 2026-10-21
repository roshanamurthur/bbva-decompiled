package androidx.loader.content;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.SystemClock;
import android.text.format.DateUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.os.OperationCanceledException;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AsyncTaskLoader<D> extends Loader<D> {
    private static final boolean DEBUG = false;
    private static final String TAG = "AsyncTaskLoader";
    private volatile AsyncTaskLoader<D>.a mCancellingTask;
    private Executor mExecutor;
    private Handler mHandler;
    private long mLastLoadCompleteTime;
    private volatile AsyncTaskLoader<D>.a mTask;
    private long mUpdateThrottle;

    public final class a extends ModernAsyncTask<D> implements Runnable {

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public boolean f22216u0;

        public a() {
        }

        @Override // androidx.loader.content.ModernAsyncTask
        public final D a() {
            try {
                return (D) AsyncTaskLoader.this.onLoadInBackground();
            } catch (OperationCanceledException e5) {
                if (this.f22229r0.get()) {
                    return null;
                }
                throw e5;
            }
        }

        @Override // androidx.loader.content.ModernAsyncTask
        public final void b(D d2) {
            AsyncTaskLoader.this.dispatchOnCancelled(this, d2);
        }

        @Override // androidx.loader.content.ModernAsyncTask
        public final void c(D d2) {
            AsyncTaskLoader.this.dispatchOnLoadComplete(this, d2);
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f22216u0 = false;
            AsyncTaskLoader.this.executePendingTask();
        }
    }

    public AsyncTaskLoader(@NonNull Context context) {
        super(context);
        this.mLastLoadCompleteTime = -10000L;
    }

    public void dispatchOnCancelled(AsyncTaskLoader<D>.a aVar, D d2) {
        onCanceled(d2);
        if (this.mCancellingTask == aVar) {
            rollbackContentChanged();
            this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
            this.mCancellingTask = null;
            deliverCancellation();
            executePendingTask();
        }
    }

    public void dispatchOnLoadComplete(AsyncTaskLoader<D>.a aVar, D d2) {
        if (this.mTask != aVar) {
            dispatchOnCancelled(aVar, d2);
            return;
        }
        if (isAbandoned()) {
            onCanceled(d2);
            return;
        }
        commitContentChanged();
        this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
        this.mTask = null;
        deliverResult(d2);
    }

    @Override // androidx.loader.content.Loader
    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2;
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (this.mTask != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.mTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mTask.f22216u0);
        }
        if (this.mCancellingTask != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.mCancellingTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mCancellingTask.f22216u0);
        }
        if (this.mUpdateThrottle != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            printWriter.print(DateUtils.formatElapsedTime(timeUnit.toSeconds(this.mUpdateThrottle)));
            printWriter.print(" mLastLoadCompleteTime=");
            if (this.mLastLoadCompleteTime == -10000) {
                str2 = "--";
            } else {
                str2 = Constant.DASH_STRING + DateUtils.formatElapsedTime(timeUnit.toSeconds(SystemClock.uptimeMillis() - this.mLastLoadCompleteTime));
            }
            printWriter.print(str2);
            printWriter.println();
        }
    }

    public void executePendingTask() {
        if (this.mCancellingTask != null || this.mTask == null) {
            return;
        }
        if (this.mTask.f22216u0) {
            this.mTask.f22216u0 = false;
            this.mHandler.removeCallbacks(this.mTask);
        }
        if (this.mUpdateThrottle > 0 && SystemClock.uptimeMillis() < this.mLastLoadCompleteTime + this.mUpdateThrottle) {
            this.mTask.f22216u0 = true;
            this.mHandler.postAtTime(this.mTask, this.mLastLoadCompleteTime + this.mUpdateThrottle);
            return;
        }
        if (this.mExecutor == null) {
            this.mExecutor = getExecutor();
        }
        AsyncTaskLoader<D>.a aVar = this.mTask;
        Executor executor = this.mExecutor;
        if (aVar.f22228q0 == ModernAsyncTask.Status.PENDING) {
            aVar.f22228q0 = ModernAsyncTask.Status.RUNNING;
            executor.execute(aVar.f22227p0);
            return;
        }
        int i10 = ModernAsyncTask.d.f22235a[aVar.f22228q0.ordinal()];
        if (i10 == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i10 == 2) {
            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        throw new IllegalStateException("We should never reach this state");
    }

    @NonNull
    public Executor getExecutor() {
        return AsyncTask.THREAD_POOL_EXECUTOR;
    }

    public boolean isLoadInBackgroundCanceled() {
        return this.mCancellingTask != null;
    }

    @Nullable
    public abstract D loadInBackground();

    @Override // androidx.loader.content.Loader
    public boolean onCancelLoad() {
        if (this.mTask == null) {
            return false;
        }
        if (!isStarted()) {
            onContentChanged();
        }
        if (this.mCancellingTask != null) {
            if (this.mTask.f22216u0) {
                this.mTask.f22216u0 = false;
                this.mHandler.removeCallbacks(this.mTask);
            }
            this.mTask = null;
            return false;
        }
        if (this.mTask.f22216u0) {
            this.mTask.f22216u0 = false;
            this.mHandler.removeCallbacks(this.mTask);
            this.mTask = null;
            return false;
        }
        AsyncTaskLoader<D>.a aVar = this.mTask;
        aVar.f22229r0.set(true);
        boolean zCancel = aVar.f22227p0.cancel(false);
        if (zCancel) {
            this.mCancellingTask = this.mTask;
            cancelLoadInBackground();
        }
        this.mTask = null;
        return zCancel;
    }

    @Override // androidx.loader.content.Loader
    public void onForceLoad() {
        super.onForceLoad();
        cancelLoad();
        this.mTask = new a();
        executePendingTask();
    }

    @Nullable
    public D onLoadInBackground() {
        return loadInBackground();
    }

    public void setUpdateThrottle(long j10) {
        this.mUpdateThrottle = j10;
        if (j10 != 0) {
            this.mHandler = new Handler();
        }
    }

    public void cancelLoadInBackground() {
    }

    public void onCanceled(@Nullable D d2) {
    }
}
