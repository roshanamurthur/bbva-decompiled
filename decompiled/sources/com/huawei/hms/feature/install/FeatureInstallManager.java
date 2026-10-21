package com.huawei.hms.feature.install;

import android.app.Activity;
import android.content.IntentSender;
import com.huawei.hms.feature.listener.InstallStateListener;
import com.huawei.hms.feature.model.FeatureInstallRequest;
import com.huawei.hms.feature.model.InstallState;
import com.huawei.hms.feature.tasks.FeatureTask;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public interface FeatureInstallManager {
    FeatureTask<Void> abortInstallFeature(int i10);

    FeatureTask<Void> delayedInstallFeature(List<String> list);

    FeatureTask<Void> delayedUninstallFeature(List<String> list);

    FeatureTask<List<InstallState>> getAllInstallStates();

    Set<String> getAllInstalledModules();

    FeatureTask<InstallState> getInstallState(int i10);

    FeatureTask<Integer> installFeature(FeatureInstallRequest featureInstallRequest);

    void registerInstallListener(InstallStateListener installStateListener);

    boolean triggerUserConfirm(InstallState installState, Activity activity, int i10) throws IntentSender.SendIntentException;

    void unregisterInstallListener(InstallStateListener installStateListener);
}
