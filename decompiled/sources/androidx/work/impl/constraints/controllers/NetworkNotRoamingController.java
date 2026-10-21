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
public class NetworkNotRoamingController extends ConstraintController<NetworkState> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f24502e = Logger.tagWithPrefix("NetworkNotRoamingCtrlr");

    public NetworkNotRoamingController(Context context, TaskExecutor taskExecutor) {
        super(Trackers.getInstance(context, taskExecutor).getNetworkStateTracker());
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public final boolean a(@NonNull WorkSpec workSpec) {
        return workSpec.constraints.getRequiredNetworkType() == NetworkType.NOT_ROAMING;
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public final boolean b(@NonNull NetworkState networkState) {
        NetworkState networkState2 = networkState;
        boolean z10 = true;
        if (Build.VERSION.SDK_INT < 24) {
            Logger.get().debug(f24502e, "Not-roaming network constraint is not supported before API 24, only checking for connected state.", new Throwable[0]);
            return !networkState2.isConnected();
        }
        if (networkState2.isConnected() && networkState2.isNotRoaming()) {
            z10 = false;
        }
        return z10;
    }
}
