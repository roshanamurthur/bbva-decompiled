package androidx.work.impl.constraints.controllers;

import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.work.Logger;
import androidx.work.NetworkType;
import androidx.work.impl.constraints.NetworkState;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;

/* JADX INFO: loaded from: classes2.dex */
public class NetworkMeteredController extends ConstraintController<NetworkState> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f24501e = Logger.tagWithPrefix("NetworkMeteredCtrlr");

    public NetworkMeteredController(Context context, TaskExecutor taskExecutor) {
        super(Trackers.getInstance(context, taskExecutor).getNetworkStateTracker());
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public final boolean a(@NonNull WorkSpec workSpec) {
        return workSpec.constraints.getRequiredNetworkType() == NetworkType.METERED;
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public final boolean b(@NonNull NetworkState networkState) {
        NetworkState networkState2 = networkState;
        boolean z10 = true;
        if (Build.VERSION.SDK_INT < 26) {
            Logger.get().debug(f24501e, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
            return !networkState2.isConnected();
        }
        if (networkState2.isConnected() && networkState2.isMetered()) {
            z10 = false;
        }
        return z10;
    }
}
