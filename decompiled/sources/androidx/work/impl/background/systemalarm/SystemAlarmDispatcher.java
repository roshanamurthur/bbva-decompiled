package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.Processor;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.utils.SerialExecutor;
import androidx.work.impl.utils.WakeLocks;
import androidx.work.impl.utils.WorkTimer;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class SystemAlarmDispatcher implements ExecutionListener {
    public static final String E0 = Logger.tagWithPrefix("SystemAlarmDispatcher");

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Context f24458p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final TaskExecutor f24459q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final WorkTimer f24460r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Processor f24461s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final WorkManagerImpl f24462t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final CommandHandler f24463u0;
    public final Handler v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final ArrayList f24464w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public Intent f24465x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @Nullable
    public c f24466y0;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            SystemAlarmDispatcher systemAlarmDispatcher;
            d dVar;
            synchronized (SystemAlarmDispatcher.this.f24464w0) {
                SystemAlarmDispatcher systemAlarmDispatcher2 = SystemAlarmDispatcher.this;
                systemAlarmDispatcher2.f24465x0 = (Intent) systemAlarmDispatcher2.f24464w0.get(0);
            }
            Intent intent = SystemAlarmDispatcher.this.f24465x0;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = SystemAlarmDispatcher.this.f24465x0.getIntExtra("KEY_START_ID", 0);
                Logger logger = Logger.get();
                String str = SystemAlarmDispatcher.E0;
                logger.debug(str, String.format("Processing command %s, %s", SystemAlarmDispatcher.this.f24465x0, Integer.valueOf(intExtra)), new Throwable[0]);
                PowerManager.WakeLock wakeLockNewWakeLock = WakeLocks.newWakeLock(SystemAlarmDispatcher.this.f24458p0, String.format("%s (%s)", action, Integer.valueOf(intExtra)));
                try {
                    Logger.get().debug(str, String.format("Acquiring operation wake lock (%s) %s", action, wakeLockNewWakeLock), new Throwable[0]);
                    wakeLockNewWakeLock.acquire();
                    SystemAlarmDispatcher systemAlarmDispatcher3 = SystemAlarmDispatcher.this;
                    systemAlarmDispatcher3.f24463u0.d(intExtra, systemAlarmDispatcher3.f24465x0, systemAlarmDispatcher3);
                    Logger.get().debug(str, String.format("Releasing operation wake lock (%s) %s", action, wakeLockNewWakeLock), new Throwable[0]);
                    wakeLockNewWakeLock.release();
                    systemAlarmDispatcher = SystemAlarmDispatcher.this;
                    dVar = new d(systemAlarmDispatcher);
                } catch (Throwable th2) {
                    try {
                        Logger logger2 = Logger.get();
                        String str2 = SystemAlarmDispatcher.E0;
                        logger2.error(str2, "Unexpected error in onHandleIntent", th2);
                        Logger.get().debug(str2, String.format("Releasing operation wake lock (%s) %s", action, wakeLockNewWakeLock), new Throwable[0]);
                        wakeLockNewWakeLock.release();
                        systemAlarmDispatcher = SystemAlarmDispatcher.this;
                        dVar = new d(systemAlarmDispatcher);
                    } catch (Throwable th3) {
                        Logger.get().debug(SystemAlarmDispatcher.E0, String.format("Releasing operation wake lock (%s) %s", action, wakeLockNewWakeLock), new Throwable[0]);
                        wakeLockNewWakeLock.release();
                        SystemAlarmDispatcher systemAlarmDispatcher4 = SystemAlarmDispatcher.this;
                        systemAlarmDispatcher4.c(new d(systemAlarmDispatcher4));
                        throw th3;
                    }
                }
                systemAlarmDispatcher.c(dVar);
            }
        }
    }

    public static class b implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SystemAlarmDispatcher f24468p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Intent f24469q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final int f24470r0;

        public b(int i10, @NonNull Intent intent, @NonNull SystemAlarmDispatcher systemAlarmDispatcher) {
            this.f24468p0 = systemAlarmDispatcher;
            this.f24469q0 = intent;
            this.f24470r0 = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f24468p0.add(this.f24469q0, this.f24470r0);
        }
    }

    public interface c {
        void onAllCommandsCompleted();
    }

    public static class d implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SystemAlarmDispatcher f24471p0;

        public d(@NonNull SystemAlarmDispatcher systemAlarmDispatcher) {
            this.f24471p0 = systemAlarmDispatcher;
        }

        @Override // java.lang.Runnable
        public final void run() {
            SystemAlarmDispatcher systemAlarmDispatcher = this.f24471p0;
            systemAlarmDispatcher.getClass();
            Logger logger = Logger.get();
            String str = SystemAlarmDispatcher.E0;
            logger.debug(str, "Checking if commands are complete.", new Throwable[0]);
            systemAlarmDispatcher.a();
            synchronized (systemAlarmDispatcher.f24464w0) {
                try {
                    if (systemAlarmDispatcher.f24465x0 != null) {
                        Logger.get().debug(str, String.format("Removing command %s", systemAlarmDispatcher.f24465x0), new Throwable[0]);
                        if (!((Intent) systemAlarmDispatcher.f24464w0.remove(0)).equals(systemAlarmDispatcher.f24465x0)) {
                            throw new IllegalStateException("Dequeue-d command is not the first.");
                        }
                        systemAlarmDispatcher.f24465x0 = null;
                    }
                    SerialExecutor backgroundExecutor = systemAlarmDispatcher.f24459q0.getBackgroundExecutor();
                    if (!systemAlarmDispatcher.f24463u0.c() && systemAlarmDispatcher.f24464w0.isEmpty() && !backgroundExecutor.hasPendingTasks()) {
                        Logger.get().debug(str, "No more commands & intents.", new Throwable[0]);
                        c cVar = systemAlarmDispatcher.f24466y0;
                        if (cVar != null) {
                            cVar.onAllCommandsCompleted();
                        }
                    } else if (!systemAlarmDispatcher.f24464w0.isEmpty()) {
                        systemAlarmDispatcher.d();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public SystemAlarmDispatcher(@NonNull Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f24458p0 = applicationContext;
        this.f24463u0 = new CommandHandler(applicationContext);
        this.f24460r0 = new WorkTimer();
        WorkManagerImpl workManagerImpl = WorkManagerImpl.getInstance(context);
        this.f24462t0 = workManagerImpl;
        Processor processor = workManagerImpl.getProcessor();
        this.f24461s0 = processor;
        this.f24459q0 = workManagerImpl.getWorkTaskExecutor();
        processor.addExecutionListener(this);
        this.f24464w0 = new ArrayList();
        this.f24465x0 = null;
        this.v0 = new Handler(Looper.getMainLooper());
    }

    public final void a() {
        if (this.v0.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    @MainThread
    public boolean add(@NonNull Intent intent, int i10) {
        Logger logger = Logger.get();
        String str = E0;
        logger.debug(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i10)), new Throwable[0]);
        a();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            Logger.get().warning(str, "Unknown command. Ignoring", new Throwable[0]);
            return false;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && b()) {
            return false;
        }
        intent.putExtra("KEY_START_ID", i10);
        synchronized (this.f24464w0) {
            try {
                boolean z10 = !this.f24464w0.isEmpty();
                this.f24464w0.add(intent);
                if (!z10) {
                    d();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }

    @MainThread
    public final boolean b() {
        a();
        synchronized (this.f24464w0) {
            try {
                Iterator it = this.f24464w0.iterator();
                while (it.hasNext()) {
                    if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(@NonNull Runnable runnable) {
        this.v0.post(runnable);
    }

    @MainThread
    public final void d() {
        a();
        PowerManager.WakeLock wakeLockNewWakeLock = WakeLocks.newWakeLock(this.f24458p0, "ProcessCommand");
        try {
            wakeLockNewWakeLock.acquire();
            this.f24462t0.getWorkTaskExecutor().executeOnBackgroundThread(new a());
        } finally {
            wakeLockNewWakeLock.release();
        }
    }

    @Override // androidx.work.impl.ExecutionListener
    public void onExecuted(@NonNull String str, boolean z10) {
        String str2 = CommandHandler.f24439s0;
        Intent intent = new Intent(this.f24458p0, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z10);
        c(new b(0, intent, this));
    }
}
