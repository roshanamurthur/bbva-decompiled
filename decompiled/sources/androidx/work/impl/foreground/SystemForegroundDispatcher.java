package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.work.ForegroundInfo;
import androidx.work.Logger;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.constraints.WorkConstraintsCallback;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class SystemForegroundDispatcher implements WorkConstraintsCallback, ExecutionListener {

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final String f24527y0 = Logger.tagWithPrefix("SystemFgDispatcher");

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final WorkManagerImpl f24528p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final TaskExecutor f24529q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Object f24530r0 = new Object();

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public String f24531s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final LinkedHashMap f24532t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final HashMap f24533u0;
    public final HashSet v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final WorkConstraintsTracker f24534w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @Nullable
    public a f24535x0;

    public interface a {
        void cancelNotification(int i10);

        void notify(int i10, @NonNull Notification notification);

        void startForeground(int i10, int i11, @NonNull Notification notification);

        void stop();
    }

    public SystemForegroundDispatcher(@NonNull Context context) {
        WorkManagerImpl workManagerImpl = WorkManagerImpl.getInstance(context);
        this.f24528p0 = workManagerImpl;
        TaskExecutor workTaskExecutor = workManagerImpl.getWorkTaskExecutor();
        this.f24529q0 = workTaskExecutor;
        this.f24531s0 = null;
        this.f24532t0 = new LinkedHashMap();
        this.v0 = new HashSet();
        this.f24533u0 = new HashMap();
        this.f24534w0 = new WorkConstraintsTracker(context, workTaskExecutor, this);
        workManagerImpl.getProcessor().addExecutionListener(this);
    }

    @NonNull
    public static Intent createCancelWorkIntent(@NonNull Context context, @NonNull String str) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_CANCEL_WORK");
        intent.setData(Uri.parse(String.format("workspec://%s", str)));
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @NonNull
    public static Intent createNotifyIntent(@NonNull Context context, @NonNull String str, @NonNull ForegroundInfo foregroundInfo) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", foregroundInfo.getNotificationId());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", foregroundInfo.getForegroundServiceType());
        intent.putExtra("KEY_NOTIFICATION", foregroundInfo.getNotification());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @NonNull
    public static Intent createStartForegroundIntent(@NonNull Context context, @NonNull String str, @NonNull ForegroundInfo foregroundInfo) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", foregroundInfo.getNotificationId());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", foregroundInfo.getForegroundServiceType());
        intent.putExtra("KEY_NOTIFICATION", foregroundInfo.getNotification());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @NonNull
    public static Intent createStopForegroundIntent(@NonNull Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    @MainThread
    public final void a(@NonNull Intent intent) {
        int foregroundServiceType = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        Logger.get().debug(f24527y0, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2)), new Throwable[0]);
        if (notification == null || this.f24535x0 == null) {
            return;
        }
        ForegroundInfo foregroundInfo = new ForegroundInfo(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.f24532t0;
        linkedHashMap.put(stringExtra, foregroundInfo);
        if (TextUtils.isEmpty(this.f24531s0)) {
            this.f24531s0 = stringExtra;
            this.f24535x0.startForeground(intExtra, intExtra2, notification);
            return;
        }
        this.f24535x0.notify(intExtra, notification);
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            foregroundServiceType |= ((ForegroundInfo) ((Map.Entry) it.next()).getValue()).getForegroundServiceType();
        }
        ForegroundInfo foregroundInfo2 = (ForegroundInfo) linkedHashMap.get(this.f24531s0);
        if (foregroundInfo2 != null) {
            this.f24535x0.startForeground(foregroundInfo2.getNotificationId(), foregroundServiceType, foregroundInfo2.getNotification());
        }
    }

    @MainThread
    public final void b() {
        this.f24535x0 = null;
        synchronized (this.f24530r0) {
            this.f24534w0.reset();
        }
        this.f24528p0.getProcessor().removeExecutionListener(this);
    }

    @Override // androidx.work.impl.constraints.WorkConstraintsCallback
    public void onAllConstraintsNotMet(@NonNull List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        for (String str : list) {
            Logger.get().debug(f24527y0, String.format("Constraints unmet for WorkSpec %s", str), new Throwable[0]);
            this.f24528p0.stopForegroundWork(str);
        }
    }

    @Override // androidx.work.impl.ExecutionListener
    @MainThread
    public void onExecuted(@NonNull String str, boolean z10) {
        Map.Entry entry;
        synchronized (this.f24530r0) {
            try {
                WorkSpec workSpec = (WorkSpec) this.f24533u0.remove(str);
                if (workSpec != null && this.v0.remove(workSpec)) {
                    this.f24534w0.replace(this.v0);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ForegroundInfo foregroundInfo = (ForegroundInfo) this.f24532t0.remove(str);
        if (str.equals(this.f24531s0) && this.f24532t0.size() > 0) {
            Iterator it = this.f24532t0.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.f24531s0 = (String) entry.getKey();
            if (this.f24535x0 != null) {
                ForegroundInfo foregroundInfo2 = (ForegroundInfo) entry.getValue();
                this.f24535x0.startForeground(foregroundInfo2.getNotificationId(), foregroundInfo2.getForegroundServiceType(), foregroundInfo2.getNotification());
                this.f24535x0.cancelNotification(foregroundInfo2.getNotificationId());
            }
        }
        a aVar = this.f24535x0;
        if (foregroundInfo == null || aVar == null) {
            return;
        }
        Logger.get().debug(f24527y0, String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", Integer.valueOf(foregroundInfo.getNotificationId()), str, Integer.valueOf(foregroundInfo.getForegroundServiceType())), new Throwable[0]);
        aVar.cancelNotification(foregroundInfo.getNotificationId());
    }

    @Override // androidx.work.impl.constraints.WorkConstraintsCallback
    public void onAllConstraintsMet(@NonNull List<String> list) {
    }
}
