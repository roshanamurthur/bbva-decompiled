package androidx.work;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.camera.core.processing.f;

/* JADX INFO: loaded from: classes2.dex */
public abstract class WorkerFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f24339a = Logger.tagWithPrefix("WorkerFactory");

    public class a extends WorkerFactory {
        @Override // androidx.work.WorkerFactory
        @Nullable
        public final ListenableWorker createWorker(@NonNull Context context, @NonNull String str, @NonNull WorkerParameters workerParameters) {
            return null;
        }
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static WorkerFactory getDefaultWorkerFactory() {
        return new a();
    }

    @Nullable
    public abstract ListenableWorker createWorker(@NonNull Context context, @NonNull String str, @NonNull WorkerParameters workerParameters);

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final ListenableWorker createWorkerWithDefaultFallback(@NonNull Context context, @NonNull String str, @NonNull WorkerParameters workerParameters) {
        Class clsAsSubclass;
        String str2 = f24339a;
        ListenableWorker listenableWorkerCreateWorker = createWorker(context, str, workerParameters);
        if (listenableWorkerCreateWorker == null) {
            try {
                clsAsSubclass = Class.forName(str).asSubclass(ListenableWorker.class);
            } catch (Throwable th2) {
                Logger.get().error(str2, f.d("Invalid class: ", str), th2);
                clsAsSubclass = null;
            }
            if (clsAsSubclass != null) {
                try {
                    listenableWorkerCreateWorker = (ListenableWorker) clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                } catch (Throwable th3) {
                    Logger.get().error(str2, f.d("Could not instantiate ", str), th3);
                }
            }
        }
        if (listenableWorkerCreateWorker == null || !listenableWorkerCreateWorker.isUsed()) {
            return listenableWorkerCreateWorker;
        }
        throw new IllegalStateException(String.format("WorkerFactory (%s) returned an instance of a ListenableWorker (%s) which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.", getClass().getName(), str));
    }
}
