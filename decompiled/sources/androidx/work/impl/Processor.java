package androidx.work.impl;

import android.content.Context;
import android.os.PowerManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.content.ContextCompat;
import androidx.work.Configuration;
import androidx.work.ForegroundInfo;
import androidx.work.Logger;
import androidx.work.WorkerParameters;
import androidx.work.impl.foreground.ForegroundProcessor;
import androidx.work.impl.foreground.SystemForegroundDispatcher;
import androidx.work.impl.utils.WakeLocks;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class Processor implements ExecutionListener, ForegroundProcessor {
    public static final String F0 = Logger.tagWithPrefix("Processor");

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Context f24354q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Configuration f24355r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final TaskExecutor f24356s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final WorkDatabase f24357t0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final List<Scheduler> f24359w0;
    public final HashMap v0 = new HashMap();

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final HashMap f24358u0 = new HashMap();

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final HashSet f24360x0 = new HashSet();

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final ArrayList f24361y0 = new ArrayList();

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    public PowerManager.WakeLock f24353p0 = null;
    public final Object E0 = new Object();

    public static class a implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NonNull
        public ExecutionListener f24362p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        @NonNull
        public String f24363q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        @NonNull
        public ListenableFuture<Boolean> f24364r0;

        @Override // java.lang.Runnable
        public final void run() {
            boolean zBooleanValue;
            try {
                zBooleanValue = this.f24364r0.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                zBooleanValue = true;
            }
            this.f24362p0.onExecuted(this.f24363q0, zBooleanValue);
        }
    }

    public Processor(@NonNull Context context, @NonNull Configuration configuration, @NonNull TaskExecutor taskExecutor, @NonNull WorkDatabase workDatabase, @NonNull List<Scheduler> list) {
        this.f24354q0 = context;
        this.f24355r0 = configuration;
        this.f24356s0 = taskExecutor;
        this.f24357t0 = workDatabase;
        this.f24359w0 = list;
    }

    public static boolean a(@NonNull String str, @Nullable WorkerWrapper workerWrapper) {
        String str2 = F0;
        if (workerWrapper == null) {
            Logger.get().debug(str2, String.format("WorkerWrapper could not be found for %s", str), new Throwable[0]);
            return false;
        }
        workerWrapper.interrupt();
        Logger.get().debug(str2, String.format("WorkerWrapper interrupted for %s", str), new Throwable[0]);
        return true;
    }

    public void addExecutionListener(@NonNull ExecutionListener executionListener) {
        synchronized (this.E0) {
            this.f24361y0.add(executionListener);
        }
    }

    public final void b() {
        synchronized (this.E0) {
            try {
                if (!(!this.f24358u0.isEmpty())) {
                    try {
                        this.f24354q0.startService(SystemForegroundDispatcher.createStopForegroundIntent(this.f24354q0));
                    } catch (Throwable th2) {
                        Logger.get().error(F0, "Unable to stop foreground service", th2);
                    }
                    PowerManager.WakeLock wakeLock = this.f24353p0;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f24353p0 = null;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public boolean hasWork() {
        boolean z10;
        synchronized (this.E0) {
            try {
                z10 = (this.v0.isEmpty() && this.f24358u0.isEmpty()) ? false : true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public boolean isCancelled(@NonNull String str) {
        boolean zContains;
        synchronized (this.E0) {
            zContains = this.f24360x0.contains(str);
        }
        return zContains;
    }

    public boolean isEnqueued(@NonNull String str) {
        boolean z10;
        synchronized (this.E0) {
            try {
                z10 = this.v0.containsKey(str) || this.f24358u0.containsKey(str);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public boolean isEnqueuedInForeground(@NonNull String str) {
        boolean zContainsKey;
        synchronized (this.E0) {
            zContainsKey = this.f24358u0.containsKey(str);
        }
        return zContainsKey;
    }

    @Override // androidx.work.impl.ExecutionListener
    public void onExecuted(@NonNull String str, boolean z10) {
        synchronized (this.E0) {
            try {
                this.v0.remove(str);
                Logger.get().debug(F0, String.format("%s %s executed; reschedule = %s", getClass().getSimpleName(), str, Boolean.valueOf(z10)), new Throwable[0]);
                Iterator it = this.f24361y0.iterator();
                while (it.hasNext()) {
                    ((ExecutionListener) it.next()).onExecuted(str, z10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void removeExecutionListener(@NonNull ExecutionListener executionListener) {
        synchronized (this.E0) {
            this.f24361y0.remove(executionListener);
        }
    }

    @Override // androidx.work.impl.foreground.ForegroundProcessor
    public void startForeground(@NonNull String str, @NonNull ForegroundInfo foregroundInfo) {
        synchronized (this.E0) {
            try {
                Logger.get().info(F0, String.format("Moving WorkSpec (%s) to the foreground", str), new Throwable[0]);
                WorkerWrapper workerWrapper = (WorkerWrapper) this.v0.remove(str);
                if (workerWrapper != null) {
                    if (this.f24353p0 == null) {
                        PowerManager.WakeLock wakeLockNewWakeLock = WakeLocks.newWakeLock(this.f24354q0, "ProcessorForegroundLck");
                        this.f24353p0 = wakeLockNewWakeLock;
                        wakeLockNewWakeLock.acquire();
                    }
                    this.f24358u0.put(str, workerWrapper);
                    ContextCompat.startForegroundService(this.f24354q0, SystemForegroundDispatcher.createStartForegroundIntent(this.f24354q0, str, foregroundInfo));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean startWork(@NonNull String str) {
        return startWork(str, null);
    }

    public boolean stopAndCancelWork(@NonNull String str) {
        boolean zA;
        synchronized (this.E0) {
            try {
                boolean z10 = true;
                Logger.get().debug(F0, String.format("Processor cancelling %s", str), new Throwable[0]);
                this.f24360x0.add(str);
                WorkerWrapper workerWrapper = (WorkerWrapper) this.f24358u0.remove(str);
                if (workerWrapper == null) {
                    z10 = false;
                }
                if (workerWrapper == null) {
                    workerWrapper = (WorkerWrapper) this.v0.remove(str);
                }
                zA = a(str, workerWrapper);
                if (z10) {
                    b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zA;
    }

    @Override // androidx.work.impl.foreground.ForegroundProcessor
    public void stopForeground(@NonNull String str) {
        synchronized (this.E0) {
            this.f24358u0.remove(str);
            b();
        }
    }

    public boolean stopForegroundWork(@NonNull String str) {
        boolean zA;
        synchronized (this.E0) {
            Logger.get().debug(F0, String.format("Processor stopping foreground work %s", str), new Throwable[0]);
            zA = a(str, (WorkerWrapper) this.f24358u0.remove(str));
        }
        return zA;
    }

    public boolean stopWork(@NonNull String str) {
        boolean zA;
        synchronized (this.E0) {
            Logger.get().debug(F0, String.format("Processor stopping background work %s", str), new Throwable[0]);
            zA = a(str, (WorkerWrapper) this.v0.remove(str));
        }
        return zA;
    }

    public boolean startWork(@NonNull String str, @Nullable WorkerParameters.RuntimeExtras runtimeExtras) {
        synchronized (this.E0) {
            try {
                if (isEnqueued(str)) {
                    Logger.get().debug(F0, String.format("Work %s is already enqueued for processing", str), new Throwable[0]);
                    return false;
                }
                WorkerWrapper workerWrapperBuild = new WorkerWrapper.Builder(this.f24354q0, this.f24355r0, this.f24356s0, this, this.f24357t0, str).withSchedulers(this.f24359w0).withRuntimeExtras(runtimeExtras).build();
                ListenableFuture<Boolean> future = workerWrapperBuild.getFuture();
                a aVar = new a();
                aVar.f24362p0 = this;
                aVar.f24363q0 = str;
                aVar.f24364r0 = future;
                future.addListener(aVar, this.f24356s0.getMainThreadExecutor());
                this.v0.put(str, workerWrapperBuild);
                this.f24356s0.getBackgroundExecutor().execute(workerWrapperBuild);
                Logger.get().debug(F0, String.format("%s: processing %s", getClass().getSimpleName(), str), new Throwable[0]);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
