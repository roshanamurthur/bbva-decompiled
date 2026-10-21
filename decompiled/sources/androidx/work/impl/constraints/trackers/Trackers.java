package androidx.work.impl.constraints.trackers;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class Trackers {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Trackers f24521e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BatteryChargingTracker f24522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BatteryNotLowTracker f24523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public NetworkStateTracker f24524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public StorageNotLowTracker f24525d;

    @NonNull
    public static synchronized Trackers getInstance(Context context, TaskExecutor taskExecutor) {
        try {
            if (f24521e == null) {
                Trackers trackers = new Trackers();
                Context applicationContext = context.getApplicationContext();
                trackers.f24522a = new BatteryChargingTracker(applicationContext, taskExecutor);
                trackers.f24523b = new BatteryNotLowTracker(applicationContext, taskExecutor);
                trackers.f24524c = new NetworkStateTracker(applicationContext, taskExecutor);
                trackers.f24525d = new StorageNotLowTracker(applicationContext, taskExecutor);
                f24521e = trackers;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f24521e;
    }

    @VisibleForTesting
    public static synchronized void setInstance(@NonNull Trackers trackers) {
        f24521e = trackers;
    }

    @NonNull
    public BatteryChargingTracker getBatteryChargingTracker() {
        return this.f24522a;
    }

    @NonNull
    public BatteryNotLowTracker getBatteryNotLowTracker() {
        return this.f24523b;
    }

    @NonNull
    public NetworkStateTracker getNetworkStateTracker() {
        return this.f24524c;
    }

    @NonNull
    public StorageNotLowTracker getStorageNotLowTracker() {
        return this.f24525d;
    }
}
