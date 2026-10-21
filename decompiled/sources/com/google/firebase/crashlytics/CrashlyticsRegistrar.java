package com.google.firebase.crashlytics;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.crashlytics.AnalyticsDeferredProxy;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy;
import com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.RemoteConfigDeferredProxy;
import com.google.firebase.crashlytics.internal.common.AppData;
import com.google.firebase.crashlytics.internal.common.BuildIdInfo;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsSubscriber;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.crashlytics.internal.common.DataCollectionArbiter;
import com.google.firebase.crashlytics.internal.common.ExecutorUtils;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.google.firebase.crashlytics.internal.network.HttpRequestFactory;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.settings.SettingsController;
import com.google.firebase.inject.Deferred;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.remoteconfig.interop.FirebaseRemoteConfigInterop;
import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import com.google.firebase.sessions.api.SessionSubscriber;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes10.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f47690a = 0;

    static {
        FirebaseSessionsDependencies.INSTANCE.addDependency(SessionSubscriber.Name.CRASHLYTICS);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        return Arrays.asList(Component.builder(FirebaseCrashlytics.class).name("fire-cls").add(Dependency.required((Class<?>) FirebaseApp.class)).add(Dependency.required((Class<?>) FirebaseInstallationsApi.class)).add(Dependency.deferred((Class<?>) CrashlyticsNativeComponent.class)).add(Dependency.deferred((Class<?>) AnalyticsConnector.class)).add(Dependency.deferred((Class<?>) FirebaseRemoteConfigInterop.class)).factory(new ComponentFactory() { // from class: vf.c
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                int i10 = CrashlyticsRegistrar.f47690a;
                this.f94049a.getClass();
                FirebaseApp firebaseApp = (FirebaseApp) componentContainer.get(FirebaseApp.class);
                Deferred deferred = componentContainer.getDeferred(CrashlyticsNativeComponent.class);
                Deferred deferred2 = componentContainer.getDeferred(AnalyticsConnector.class);
                FirebaseInstallationsApi firebaseInstallationsApi = (FirebaseInstallationsApi) componentContainer.get(FirebaseInstallationsApi.class);
                Deferred deferred3 = componentContainer.getDeferred(FirebaseRemoteConfigInterop.class);
                Context applicationContext = firebaseApp.getApplicationContext();
                String packageName = applicationContext.getPackageName();
                Logger.getLogger().i("Initializing Firebase Crashlytics " + CrashlyticsCore.getVersion() + " for " + packageName);
                FileStore fileStore = new FileStore(applicationContext);
                DataCollectionArbiter dataCollectionArbiter = new DataCollectionArbiter(firebaseApp);
                IdManager idManager = new IdManager(applicationContext, packageName, firebaseInstallationsApi, dataCollectionArbiter);
                CrashlyticsNativeComponentDeferredProxy crashlyticsNativeComponentDeferredProxy = new CrashlyticsNativeComponentDeferredProxy(deferred);
                AnalyticsDeferredProxy analyticsDeferredProxy = new AnalyticsDeferredProxy(deferred2);
                ExecutorService executorServiceBuildSingleThreadExecutorService = ExecutorUtils.buildSingleThreadExecutorService("Crashlytics Exception Handler");
                CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber = new CrashlyticsAppQualitySessionsSubscriber(dataCollectionArbiter, fileStore);
                FirebaseSessionsDependencies.register(crashlyticsAppQualitySessionsSubscriber);
                CrashlyticsCore crashlyticsCore = new CrashlyticsCore(firebaseApp, idManager, crashlyticsNativeComponentDeferredProxy, dataCollectionArbiter, analyticsDeferredProxy.getDeferredBreadcrumbSource(), analyticsDeferredProxy.getAnalyticsEventLogger(), fileStore, executorServiceBuildSingleThreadExecutorService, crashlyticsAppQualitySessionsSubscriber, new RemoteConfigDeferredProxy(deferred3));
                String applicationId = firebaseApp.getOptions().getApplicationId();
                String mappingFileId = CommonUtils.getMappingFileId(applicationContext);
                List<BuildIdInfo> buildIdInfo = CommonUtils.getBuildIdInfo(applicationContext);
                Logger.getLogger().d("Mapping file ID is: " + mappingFileId);
                for (BuildIdInfo buildIdInfo2 : buildIdInfo) {
                    Logger.getLogger().d(String.format("Build id for %s on %s: %s", buildIdInfo2.getLibraryName(), buildIdInfo2.getArch(), buildIdInfo2.getBuildId()));
                }
                try {
                    AppData appDataCreate = AppData.create(applicationContext, idManager, applicationId, mappingFileId, buildIdInfo, new DevelopmentPlatformProvider(applicationContext));
                    Logger.getLogger().v("Installer package name is: " + appDataCreate.installerPackageName);
                    ExecutorService executorServiceBuildSingleThreadExecutorService2 = ExecutorUtils.buildSingleThreadExecutorService("com.google.firebase.crashlytics.startup");
                    SettingsController settingsControllerCreate = SettingsController.create(applicationContext, applicationId, idManager, new HttpRequestFactory(), appDataCreate.versionCode, appDataCreate.versionName, fileStore, dataCollectionArbiter);
                    settingsControllerCreate.loadSettingsData(executorServiceBuildSingleThreadExecutorService2).continueWith(executorServiceBuildSingleThreadExecutorService2, new d());
                    Tasks.call(executorServiceBuildSingleThreadExecutorService2, new e(crashlyticsCore.onPreExecute(appDataCreate, settingsControllerCreate), crashlyticsCore, settingsControllerCreate));
                    return new FirebaseCrashlytics(crashlyticsCore);
                } catch (PackageManager.NameNotFoundException e5) {
                    Logger.getLogger().e("Error retrieving app package info.", e5);
                    return null;
                }
            }
        }).eagerInDefaultApp().build(), LibraryVersionComponent.create("fire-cls", BuildConfig.VERSION_NAME));
    }
}
