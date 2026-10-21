package xe;

import android.app.Activity;
import android.content.IntentSender;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.IntentSenderRequest;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.common.IntentSenderForResultStarter;
import com.google.android.play.core.splitinstall.SplitInstallManager;
import com.google.android.play.core.splitinstall.SplitInstallRequest;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener;
import com.google.android.play.core.splitinstall.internal.zzby;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class w implements SplitInstallManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzby f94590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzby f94591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzby f94592c;

    public w(zzby zzbyVar, zzby zzbyVar2, zzby zzbyVar3) {
        this.f94590a = zzbyVar;
        this.f94591b = zzbyVar2;
        this.f94592c = zzbyVar3;
    }

    public final SplitInstallManager a() {
        return this.f94592c.zza() != null ? (SplitInstallManager) this.f94591b.zza() : (SplitInstallManager) this.f94590a.zza();
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    @NonNull
    public final Task<Void> cancelInstall(int i10) {
        return a().cancelInstall(i10);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    @NonNull
    public final Task<Void> deferredInstall(List<String> list) {
        return a().deferredInstall(list);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    @NonNull
    public final Task<Void> deferredLanguageInstall(List<Locale> list) {
        return a().deferredLanguageInstall(list);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    @NonNull
    public final Task<Void> deferredLanguageUninstall(List<Locale> list) {
        return a().deferredLanguageUninstall(list);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    @NonNull
    public final Task<Void> deferredUninstall(List<String> list) {
        return a().deferredUninstall(list);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    @NonNull
    public final Set<String> getInstalledLanguages() {
        return a().getInstalledLanguages();
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    @NonNull
    public final Set<String> getInstalledModules() {
        return a().getInstalledModules();
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    @NonNull
    public final Task<SplitInstallSessionState> getSessionState(int i10) {
        return a().getSessionState(i10);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    @NonNull
    public final Task<List<SplitInstallSessionState>> getSessionStates() {
        return a().getSessionStates();
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final void registerListener(@NonNull SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        a().registerListener(splitInstallStateUpdatedListener);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final boolean startConfirmationDialogForResult(@NonNull SplitInstallSessionState splitInstallSessionState, @NonNull Activity activity, int i10) throws IntentSender.SendIntentException {
        return a().startConfirmationDialogForResult(splitInstallSessionState, activity, i10);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<Integer> startInstall(@NonNull SplitInstallRequest splitInstallRequest) {
        return a().startInstall(splitInstallRequest);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final void unregisterListener(@NonNull SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        a().unregisterListener(splitInstallStateUpdatedListener);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final void zza(@NonNull SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        a().zza(splitInstallStateUpdatedListener);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final void zzb(@NonNull SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        a().zzb(splitInstallStateUpdatedListener);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final boolean startConfirmationDialogForResult(@NonNull SplitInstallSessionState splitInstallSessionState, @NonNull ActivityResultLauncher<IntentSenderRequest> activityResultLauncher) {
        return a().startConfirmationDialogForResult(splitInstallSessionState, activityResultLauncher);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final boolean startConfirmationDialogForResult(@NonNull SplitInstallSessionState splitInstallSessionState, @NonNull IntentSenderForResultStarter intentSenderForResultStarter, int i10) throws IntentSender.SendIntentException {
        return a().startConfirmationDialogForResult(splitInstallSessionState, intentSenderForResultStarter, i10);
    }
}
