package com.google.android.play.core.appupdate;

import android.app.Activity;
import android.content.IntentSender;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.IntentSenderRequest;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.common.IntentSenderForResultStarter;
import com.google.android.play.core.install.InstallStateUpdatedListener;
import com.google.android.play.core.install.model.AppUpdateType;

/* JADX INFO: compiled from: com.google.android.play:app-update@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public interface AppUpdateManager {
    @NonNull
    Task<Void> completeUpdate();

    @NonNull
    Task<AppUpdateInfo> getAppUpdateInfo();

    void registerListener(@NonNull InstallStateUpdatedListener installStateUpdatedListener);

    Task<Integer> startUpdateFlow(@NonNull AppUpdateInfo appUpdateInfo, @NonNull Activity activity, @NonNull AppUpdateOptions appUpdateOptions);

    @Deprecated
    boolean startUpdateFlowForResult(@NonNull AppUpdateInfo appUpdateInfo, @AppUpdateType int i10, @NonNull Activity activity, int i11) throws IntentSender.SendIntentException;

    @Deprecated
    boolean startUpdateFlowForResult(@NonNull AppUpdateInfo appUpdateInfo, @AppUpdateType int i10, @NonNull IntentSenderForResultStarter intentSenderForResultStarter, int i11) throws IntentSender.SendIntentException;

    boolean startUpdateFlowForResult(@NonNull AppUpdateInfo appUpdateInfo, @NonNull Activity activity, @NonNull AppUpdateOptions appUpdateOptions, int i10) throws IntentSender.SendIntentException;

    boolean startUpdateFlowForResult(@NonNull AppUpdateInfo appUpdateInfo, @NonNull ActivityResultLauncher<IntentSenderRequest> activityResultLauncher, @NonNull AppUpdateOptions appUpdateOptions);

    boolean startUpdateFlowForResult(@NonNull AppUpdateInfo appUpdateInfo, @NonNull IntentSenderForResultStarter intentSenderForResultStarter, @NonNull AppUpdateOptions appUpdateOptions, int i10) throws IntentSender.SendIntentException;

    void unregisterListener(@NonNull InstallStateUpdatedListener installStateUpdatedListener);
}
