package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LifecycleService;
import androidx.work.Logger;
import androidx.work.impl.WorkManagerImpl;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class SystemForegroundService extends LifecycleService implements SystemForegroundDispatcher.a {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final String f24536u0 = Logger.tagWithPrefix("SystemFgService");

    @Nullable
    public static SystemForegroundService v0 = null;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Handler f24537q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f24538r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public SystemForegroundDispatcher f24539s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public NotificationManager f24540t0;

    public class a implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ int f24541p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Notification f24542q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f24543r0;

        public a(int i10, Notification notification, int i11) {
            this.f24541p0 = i10;
            this.f24542q0 = notification;
            this.f24543r0 = i11;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i10 = Build.VERSION.SDK_INT;
            Notification notification = this.f24542q0;
            int i11 = this.f24541p0;
            SystemForegroundService systemForegroundService = SystemForegroundService.this;
            if (i10 >= 29) {
                systemForegroundService.startForeground(i11, notification, this.f24543r0);
            } else {
                systemForegroundService.startForeground(i11, notification);
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ int f24545p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Notification f24546q0;

        public b(int i10, Notification notification) {
            this.f24545p0 = i10;
            this.f24546q0 = notification;
        }

        @Override // java.lang.Runnable
        public final void run() {
            SystemForegroundService.this.f24540t0.notify(this.f24545p0, this.f24546q0);
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ int f24548p0;

        public c(int i10) {
            this.f24548p0 = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            SystemForegroundService.this.f24540t0.cancel(this.f24548p0);
        }
    }

    @Nullable
    public static SystemForegroundService getInstance() {
        return v0;
    }

    @MainThread
    public final void a() {
        this.f24537q0 = new Handler(Looper.getMainLooper());
        this.f24540t0 = (NotificationManager) getApplicationContext().getSystemService("notification");
        SystemForegroundDispatcher systemForegroundDispatcher = new SystemForegroundDispatcher(getApplicationContext());
        this.f24539s0 = systemForegroundDispatcher;
        if (systemForegroundDispatcher.f24535x0 == null) {
            systemForegroundDispatcher.f24535x0 = this;
        } else {
            Logger.get().error(SystemForegroundDispatcher.f24527y0, "A callback already exists.", new Throwable[0]);
        }
    }

    @Override // androidx.work.impl.foreground.SystemForegroundDispatcher.a
    public void cancelNotification(int i10) {
        this.f24537q0.post(new c(i10));
    }

    @Override // androidx.work.impl.foreground.SystemForegroundDispatcher.a
    public void notify(int i10, @NonNull Notification notification) {
        this.f24537q0.post(new b(i10, notification));
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onCreate() {
        super.onCreate();
        v0 = this;
        a();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f24539s0.b();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public int onStartCommand(@Nullable Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f24538r0) {
            Logger.get().info(f24536u0, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.f24539s0.b();
            a();
            this.f24538r0 = false;
        }
        if (intent == null) {
            return 3;
        }
        SystemForegroundDispatcher systemForegroundDispatcher = this.f24539s0;
        systemForegroundDispatcher.getClass();
        String action = intent.getAction();
        boolean zEquals = "ACTION_START_FOREGROUND".equals(action);
        String str = SystemForegroundDispatcher.f24527y0;
        WorkManagerImpl workManagerImpl = systemForegroundDispatcher.f24528p0;
        if (zEquals) {
            Logger.get().info(str, String.format("Started foreground service %s", intent), new Throwable[0]);
            systemForegroundDispatcher.f24529q0.executeOnBackgroundThread(new q3.a(systemForegroundDispatcher, workManagerImpl.getWorkDatabase(), intent.getStringExtra("KEY_WORKSPEC_ID")));
            systemForegroundDispatcher.a(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            systemForegroundDispatcher.a(intent);
            return 3;
        }
        if ("ACTION_CANCEL_WORK".equals(action)) {
            Logger.get().info(str, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
                return 3;
            }
            workManagerImpl.cancelWorkById(UUID.fromString(stringExtra));
            return 3;
        }
        if (!"ACTION_STOP_FOREGROUND".equals(action)) {
            return 3;
        }
        Logger.get().info(str, "Stopping foreground service", new Throwable[0]);
        SystemForegroundDispatcher.a aVar = systemForegroundDispatcher.f24535x0;
        if (aVar == null) {
            return 3;
        }
        aVar.stop();
        return 3;
    }

    @Override // androidx.work.impl.foreground.SystemForegroundDispatcher.a
    public void startForeground(int i10, int i11, @NonNull Notification notification) {
        this.f24537q0.post(new a(i10, notification, i11));
    }

    @Override // androidx.work.impl.foreground.SystemForegroundDispatcher.a
    @MainThread
    public void stop() {
        this.f24538r0 = true;
        Logger.get().debug(f24536u0, "All commands completed.", new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        v0 = null;
        stopSelf();
    }
}
