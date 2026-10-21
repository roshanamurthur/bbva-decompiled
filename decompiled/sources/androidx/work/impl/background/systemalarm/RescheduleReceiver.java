package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.Logger;
import androidx.work.impl.WorkManagerImpl;

/* JADX INFO: loaded from: classes2.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f24457a = Logger.tagWithPrefix("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String str = f24457a;
        Logger.get().debug(str, String.format("Received intent %s", intent), new Throwable[0]);
        try {
            WorkManagerImpl.getInstance(context).setReschedulePendingResult(goAsync());
        } catch (IllegalStateException e5) {
            Logger.get().error(str, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e5);
        }
    }
}
