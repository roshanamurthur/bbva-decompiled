package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LifecycleService;
import androidx.work.Logger;
import androidx.work.impl.utils.WakeLocks;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class SystemAlarmService extends LifecycleService implements SystemAlarmDispatcher.c {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final String f24474s0 = Logger.tagWithPrefix("SystemAlarmService");

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public SystemAlarmDispatcher f24475q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f24476r0;

    @Override // androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.c
    @MainThread
    public void onAllCommandsCompleted() {
        this.f24476r0 = true;
        Logger.get().debug(f24474s0, "All commands completed in dispatcher", new Throwable[0]);
        WakeLocks.checkWakeLocks();
        stopSelf();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onCreate() {
        super.onCreate();
        SystemAlarmDispatcher systemAlarmDispatcher = new SystemAlarmDispatcher(this);
        this.f24475q0 = systemAlarmDispatcher;
        if (systemAlarmDispatcher.f24466y0 != null) {
            Logger.get().error(SystemAlarmDispatcher.E0, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            systemAlarmDispatcher.f24466y0 = this;
        }
        this.f24476r0 = false;
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f24476r0 = true;
        SystemAlarmDispatcher systemAlarmDispatcher = this.f24475q0;
        systemAlarmDispatcher.getClass();
        Logger.get().debug(SystemAlarmDispatcher.E0, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        systemAlarmDispatcher.f24461s0.removeExecutionListener(systemAlarmDispatcher);
        systemAlarmDispatcher.f24460r0.onDestroy();
        systemAlarmDispatcher.f24466y0 = null;
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f24476r0) {
            Logger.get().info(f24474s0, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            SystemAlarmDispatcher systemAlarmDispatcher = this.f24475q0;
            systemAlarmDispatcher.getClass();
            String str = SystemAlarmDispatcher.E0;
            Logger.get().debug(str, "Destroying SystemAlarmDispatcher", new Throwable[0]);
            systemAlarmDispatcher.f24461s0.removeExecutionListener(systemAlarmDispatcher);
            systemAlarmDispatcher.f24460r0.onDestroy();
            systemAlarmDispatcher.f24466y0 = null;
            SystemAlarmDispatcher systemAlarmDispatcher2 = new SystemAlarmDispatcher(this);
            this.f24475q0 = systemAlarmDispatcher2;
            if (systemAlarmDispatcher2.f24466y0 != null) {
                Logger.get().error(str, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
            } else {
                systemAlarmDispatcher2.f24466y0 = this;
            }
            this.f24476r0 = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f24475q0.add(intent, i11);
        return 3;
    }
}
