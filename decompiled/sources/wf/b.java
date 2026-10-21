package wf;

import com.google.firebase.crashlytics.internal.CrashlyticsRemoteConfigListener;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import com.google.firebase.remoteconfig.interop.FirebaseRemoteConfigInterop;
import com.salesforce.marketingcloud.InitializationStatus;
import com.salesforce.marketingcloud.MarketingCloudConfig;
import com.salesforce.marketingcloud.MarketingCloudSdk;
import com.salesforce.marketingcloud.sfmcsdk.modules.ModuleReadyListener;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements Deferred.DeferredHandler, MarketingCloudSdk.InitializationListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Object f94242p0;

    public /* synthetic */ b(Object obj) {
        this.f94242p0 = obj;
    }

    @Override // com.salesforce.marketingcloud.MarketingCloudSdk.InitializationListener
    public final void complete(InitializationStatus initializationStatus) {
        MarketingCloudConfig.init$lambda$1((ModuleReadyListener) this.f94242p0, initializationStatus);
    }

    @Override // com.google.firebase.inject.Deferred.DeferredHandler
    public final void handle(Provider provider) {
        ((FirebaseRemoteConfigInterop) provider.get()).registerRolloutsStateSubscriber("firebase", (CrashlyticsRemoteConfigListener) this.f94242p0);
        Logger.getLogger().d("Registering RemoteConfig Rollouts subscriber");
    }
}
