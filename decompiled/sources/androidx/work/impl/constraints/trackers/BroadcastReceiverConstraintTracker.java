package androidx.work.impl.constraints.trackers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class BroadcastReceiverConstraintTracker<T> extends ConstraintTracker<T> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f24505f = Logger.tagWithPrefix("BrdcstRcvrCnstrntTrckr");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f24506e;

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent != null) {
                BroadcastReceiverConstraintTracker.this.onBroadcastReceive(context, intent);
            }
        }
    }

    public BroadcastReceiverConstraintTracker(@NonNull Context context, @NonNull TaskExecutor taskExecutor) {
        super(context, taskExecutor);
        this.f24506e = new a();
    }

    public abstract IntentFilter getIntentFilter();

    public abstract void onBroadcastReceive(Context context, @NonNull Intent intent);

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public void startTracking() {
        Logger.get().debug(f24505f, String.format("%s: registering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.mAppContext.registerReceiver(this.f24506e, getIntentFilter());
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public void stopTracking() {
        Logger.get().debug(f24505f, String.format("%s: unregistering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.mAppContext.unregisterReceiver(this.f24506e);
    }
}
