package com.google.android.play.core.appupdate;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.IntentSenderRequest;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.appupdate.internal.zzx;
import com.google.android.play.core.common.IntentSenderForResultStarter;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.android.play.core.install.InstallException;
import com.google.android.play.core.install.InstallStateUpdatedListener;
import com.google.android.play.core.install.model.AppUpdateType;

/* JADX INFO: compiled from: com.google.android.play:app-update@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class a implements AppUpdateManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f46026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzc f46027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f46028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f46029d = new Handler(Looper.getMainLooper());

    public a(h hVar, zzc zzcVar, Context context) {
        this.f46026a = hVar;
        this.f46027b = zzcVar;
        this.f46028c = context;
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public final Task<Void> completeUpdate() {
        String packageName = this.f46028c.getPackageName();
        h hVar = this.f46026a;
        zzx zzxVar = hVar.f46044a;
        if (zzxVar == null) {
            h.f46042e.zzb("onError(%d)", -9);
            return Tasks.forException(new InstallException(-9));
        }
        h.f46042e.zzd("completeUpdate(%s)", packageName);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        zzxVar.zzs(new d(taskCompletionSource, taskCompletionSource, hVar, packageName), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public final Task<AppUpdateInfo> getAppUpdateInfo() {
        String packageName = this.f46028c.getPackageName();
        h hVar = this.f46026a;
        zzx zzxVar = hVar.f46044a;
        if (zzxVar == null) {
            h.f46042e.zzb("onError(%d)", -9);
            return Tasks.forException(new InstallException(-9));
        }
        h.f46042e.zzd("requestUpdateInfo(%s)", packageName);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        zzxVar.zzs(new c(taskCompletionSource, taskCompletionSource, hVar, packageName), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public final synchronized void registerListener(InstallStateUpdatedListener installStateUpdatedListener) {
        this.f46027b.zzb(installStateUpdatedListener);
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public final Task<Integer> startUpdateFlow(AppUpdateInfo appUpdateInfo, Activity activity, AppUpdateOptions appUpdateOptions) {
        if (appUpdateInfo == null || activity == null || appUpdateOptions == null || appUpdateInfo.f46025p) {
            return Tasks.forException(new InstallException(-4));
        }
        if (!appUpdateInfo.isUpdateTypeAllowed(appUpdateOptions)) {
            return Tasks.forException(new InstallException(-6));
        }
        appUpdateInfo.f46025p = true;
        Intent intent = new Intent(activity, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", appUpdateInfo.a(appUpdateOptions));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        intent.putExtra("result_receiver", new zze(this.f46029d, taskCompletionSource));
        activity.startActivity(intent);
        return taskCompletionSource.getTask();
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public final boolean startUpdateFlowForResult(AppUpdateInfo appUpdateInfo, @AppUpdateType int i10, Activity activity, int i11) throws IntentSender.SendIntentException {
        AppUpdateOptions appUpdateOptionsDefaultOptions = AppUpdateOptions.defaultOptions(i10);
        if (activity == null || appUpdateInfo == null || appUpdateOptionsDefaultOptions == null || !appUpdateInfo.isUpdateTypeAllowed(appUpdateOptionsDefaultOptions) || appUpdateInfo.f46025p) {
            return false;
        }
        appUpdateInfo.f46025p = true;
        activity.startIntentSenderForResult(appUpdateInfo.a(appUpdateOptionsDefaultOptions).getIntentSender(), i11, null, 0, 0, 0, null);
        return true;
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public final synchronized void unregisterListener(InstallStateUpdatedListener installStateUpdatedListener) {
        this.f46027b.zzc(installStateUpdatedListener);
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public final boolean startUpdateFlowForResult(AppUpdateInfo appUpdateInfo, @AppUpdateType int i10, IntentSenderForResultStarter intentSenderForResultStarter, int i11) throws IntentSender.SendIntentException {
        return startUpdateFlowForResult(appUpdateInfo, intentSenderForResultStarter, AppUpdateOptions.defaultOptions(i10), i11);
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public final boolean startUpdateFlowForResult(AppUpdateInfo appUpdateInfo, ActivityResultLauncher<IntentSenderRequest> activityResultLauncher, AppUpdateOptions appUpdateOptions) {
        if (appUpdateInfo == null || activityResultLauncher == null || appUpdateOptions == null || !appUpdateInfo.isUpdateTypeAllowed(appUpdateOptions) || appUpdateInfo.f46025p) {
            return false;
        }
        appUpdateInfo.f46025p = true;
        activityResultLauncher.launch(new IntentSenderRequest.Builder(appUpdateInfo.a(appUpdateOptions).getIntentSender()).build());
        return true;
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public final boolean startUpdateFlowForResult(AppUpdateInfo appUpdateInfo, Activity activity, AppUpdateOptions appUpdateOptions, int i10) throws IntentSender.SendIntentException {
        if (activity == null || appUpdateInfo == null || appUpdateOptions == null || !appUpdateInfo.isUpdateTypeAllowed(appUpdateOptions) || appUpdateInfo.f46025p) {
            return false;
        }
        appUpdateInfo.f46025p = true;
        activity.startIntentSenderForResult(appUpdateInfo.a(appUpdateOptions).getIntentSender(), i10, null, 0, 0, 0, null);
        return true;
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    public final boolean startUpdateFlowForResult(AppUpdateInfo appUpdateInfo, IntentSenderForResultStarter intentSenderForResultStarter, AppUpdateOptions appUpdateOptions, int i10) throws IntentSender.SendIntentException {
        if (appUpdateInfo == null || intentSenderForResultStarter == null || appUpdateOptions == null || !appUpdateInfo.isUpdateTypeAllowed(appUpdateOptions) || appUpdateInfo.f46025p) {
            return false;
        }
        appUpdateInfo.f46025p = true;
        intentSenderForResultStarter.startIntentSenderForResult(appUpdateInfo.a(appUpdateOptions).getIntentSender(), i10, null, 0, 0, 0, null);
        return true;
    }
}
