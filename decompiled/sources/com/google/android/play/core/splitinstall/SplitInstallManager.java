package com.google.android.play.core.splitinstall;

import android.app.Activity;
import android.content.IntentSender;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.IntentSenderRequest;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.common.IntentSenderForResultStarter;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public interface SplitInstallManager {
    @NonNull
    Task<Void> cancelInstall(int i10);

    @NonNull
    Task<Void> deferredInstall(List<String> list);

    @NonNull
    Task<Void> deferredLanguageInstall(List<Locale> list);

    @NonNull
    Task<Void> deferredLanguageUninstall(List<Locale> list);

    @NonNull
    Task<Void> deferredUninstall(List<String> list);

    @NonNull
    Set<String> getInstalledLanguages();

    @NonNull
    Set<String> getInstalledModules();

    @NonNull
    Task<SplitInstallSessionState> getSessionState(int i10);

    @NonNull
    Task<List<SplitInstallSessionState>> getSessionStates();

    void registerListener(@NonNull SplitInstallStateUpdatedListener splitInstallStateUpdatedListener);

    boolean startConfirmationDialogForResult(@NonNull SplitInstallSessionState splitInstallSessionState, @NonNull Activity activity, int i10) throws IntentSender.SendIntentException;

    boolean startConfirmationDialogForResult(@NonNull SplitInstallSessionState splitInstallSessionState, @NonNull ActivityResultLauncher<IntentSenderRequest> activityResultLauncher);

    boolean startConfirmationDialogForResult(@NonNull SplitInstallSessionState splitInstallSessionState, @NonNull IntentSenderForResultStarter intentSenderForResultStarter, int i10) throws IntentSender.SendIntentException;

    Task<Integer> startInstall(@NonNull SplitInstallRequest splitInstallRequest);

    void unregisterListener(@NonNull SplitInstallStateUpdatedListener splitInstallStateUpdatedListener);

    void zza(@NonNull SplitInstallStateUpdatedListener splitInstallStateUpdatedListener);

    void zzb(@NonNull SplitInstallStateUpdatedListener splitInstallStateUpdatedListener);
}
