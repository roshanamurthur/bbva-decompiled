package com.huawei.hms.feature.install;

import android.app.Activity;
import android.content.Context;
import android.content.IntentSender;
import android.os.Handler;
import android.os.Looper;
import com.huawei.hms.feature.broadcast.FeatureInstallListenerRegistry;
import com.huawei.hms.feature.broadcast.d;
import com.huawei.hms.feature.install.featureinfo.FeatureInfoManager;
import com.huawei.hms.feature.listener.InstallStateListener;
import com.huawei.hms.feature.model.FeatureInstallRequest;
import com.huawei.hms.feature.model.InstallState;
import com.huawei.hms.feature.tasks.FeatureTask;
import com.huawei.hms.feature.tasks.FeatureTasks;
import com.huawei.hms.feature.utils.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public class b implements FeatureInstallManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f50392a = "b";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.huawei.hms.feature.g.b f50393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FeatureInstallListenerRegistry f50394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final FeatureInfoManager f50395d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.huawei.hms.feature.install.a f50396e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Handler f50397f;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InstallState f50398a;

        public a(InstallState installState) {
            this.f50398a = installState;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.f50394c.notifyListeners(this.f50398a);
        }
    }

    public b(Context context) {
        this(new com.huawei.hms.feature.g.b(context), context, context.getPackageName());
    }

    private boolean b(FeatureInstallRequest featureInstallRequest) {
        return getAllInstalledModules().containsAll(featureInstallRequest.getModuleNames()) && Collections.disjoint(featureInstallRequest.getModuleNames(), this.f50396e.a());
    }

    private void c(FeatureInstallRequest featureInstallRequest) {
        this.f50397f.post(new a(InstallState.makeSessionState(com.huawei.hms.feature.utils.b.a(featureInstallRequest.getModuleNames(), a(featureInstallRequest.getLanguages())))));
    }

    @Override // com.huawei.hms.feature.install.FeatureInstallManager
    public FeatureTask<Void> abortInstallFeature(int i10) {
        return this.f50393b.a(i10);
    }

    @Override // com.huawei.hms.feature.install.FeatureInstallManager
    public FeatureTask<Void> delayedInstallFeature(List<String> list) {
        return this.f50393b.a(list);
    }

    @Override // com.huawei.hms.feature.install.FeatureInstallManager
    public FeatureTask<Void> delayedUninstallFeature(List<String> list) {
        this.f50396e.b(list);
        return this.f50393b.b(list);
    }

    @Override // com.huawei.hms.feature.install.FeatureInstallManager
    public FeatureTask<List<InstallState>> getAllInstallStates() {
        return this.f50393b.c();
    }

    @Override // com.huawei.hms.feature.install.FeatureInstallManager
    public Set<String> getAllInstalledModules() {
        return this.f50395d.getFeatureMasterSplitsNames();
    }

    @Override // com.huawei.hms.feature.install.FeatureInstallManager
    public FeatureTask<InstallState> getInstallState(int i10) {
        return this.f50393b.b(i10);
    }

    @Override // com.huawei.hms.feature.install.FeatureInstallManager
    public FeatureTask<Integer> installFeature(FeatureInstallRequest featureInstallRequest) {
        featureInstallRequest.getLanguages().isEmpty();
        boolean zA = a(featureInstallRequest);
        boolean zB = b(featureInstallRequest);
        if (zA && zB) {
            c(featureInstallRequest);
            Logger.i(f50392a, "The modules have been installed.");
            return FeatureTasks.createFeatureTask(0);
        }
        Logger.i(f50392a, "Ready to installFeature from the market.");
        this.f50394c.setModuleName(featureInstallRequest.getModuleNames());
        return this.f50393b.a(featureInstallRequest.getModuleNames(), a(featureInstallRequest.getLanguages()));
    }

    @Override // com.huawei.hms.feature.install.FeatureInstallManager
    public void registerInstallListener(InstallStateListener installStateListener) {
        this.f50394c.registerListener(installStateListener);
    }

    @Override // com.huawei.hms.feature.install.FeatureInstallManager
    public boolean triggerUserConfirm(InstallState installState, Activity activity, int i10) throws IntentSender.SendIntentException {
        if ((installState.status() != 8 && installState.status() != 10) || installState.resolutionIntent() == null) {
            return false;
        }
        activity.startIntentSenderForResult(installState.resolutionIntent().getIntentSender(), i10, null, 0, 0, 0);
        return true;
    }

    @Override // com.huawei.hms.feature.install.FeatureInstallManager
    public void unregisterInstallListener(InstallStateListener installStateListener) {
        this.f50394c.unregisterListener(installStateListener);
    }

    public b(com.huawei.hms.feature.g.b bVar, Context context) {
        this(bVar, context, context.getPackageName());
    }

    private static List<String> a(List<Locale> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<Locale> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toLanguageTag());
        }
        return arrayList;
    }

    private b(com.huawei.hms.feature.g.b bVar, Context context, String str) {
        this.f50397f = new Handler(Looper.getMainLooper());
        this.f50393b = bVar;
        this.f50394c = d.a(context);
        this.f50395d = new FeatureInfoManager(context, str);
        this.f50396e = new com.huawei.hms.feature.install.a(context);
    }

    private boolean a(FeatureInstallRequest featureInstallRequest) {
        List<Locale> languages = featureInstallRequest.getLanguages();
        Set<String> installedLanguagesKey = this.f50395d.getInstalledLanguagesKey();
        if (installedLanguagesKey == null || installedLanguagesKey.size() == 0) {
            return true;
        }
        HashSet hashSet = new HashSet();
        Iterator<Locale> it = languages.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().getLanguage());
        }
        return installedLanguagesKey.containsAll(hashSet);
    }
}
