package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.work.Logger;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.utils.PackageManagerHelper;

/* JADX INFO: loaded from: classes2.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f24444a = Logger.tagWithPrefix("ConstrntProxyUpdtRecvr");

    public class a implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Intent f24445p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Context f24446q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ BroadcastReceiver.PendingResult f24447r0;

        public a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f24445p0 = intent;
            this.f24446q0 = context;
            this.f24447r0 = pendingResult;
        }

        @Override // java.lang.Runnable
        public final void run() {
            BroadcastReceiver.PendingResult pendingResult = this.f24447r0;
            Context context = this.f24446q0;
            Intent intent = this.f24445p0;
            try {
                boolean booleanExtra = intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                Logger.get().debug(ConstraintProxyUpdateReceiver.f24444a, String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4)), new Throwable[0]);
                PackageManagerHelper.setComponentEnabled(context, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                PackageManagerHelper.setComponentEnabled(context, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                PackageManagerHelper.setComponentEnabled(context, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                PackageManagerHelper.setComponentEnabled(context, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                pendingResult.finish();
            }
        }
    }

    public static Intent newConstraintProxyUpdateIntent(Context context, boolean z10, boolean z11, boolean z12, boolean z13) {
        Intent intent = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
        intent.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
        intent.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z10).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z11).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z12).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z13);
        return intent;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NonNull Context context, @Nullable Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            WorkManagerImpl.getInstance(context).getWorkTaskExecutor().executeOnBackgroundThread(new a(intent, context, goAsync()));
        } else {
            Logger.get().debug(f24444a, String.format("Ignoring unknown action %s", action), new Throwable[0]);
        }
    }
}
