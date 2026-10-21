package com.bbva.glomohybrid.base.usecase.version;

import com.bbva.component.dm.settings.domain.model.AppSettings;
import com.bbva.component.dm.settings.domain.model.AppSettingsResult;
import com.bbva.component.dm.settings.domain.model.DataModelsKt;
import com.bbva.component.dm.settings.domain.model.WebViewVersionDataModel;
import com.bbva.component.dm.settings.repository.AppSettingsRepository;
import com.bbva.component.dm.settings.repository.SettingsPolicy;
import com.bbva.ethermobilesdk.deviceinfo.DeviceInfo;
import com.bbva.ethermobilesdk.deviceinfo.data.WebViewVersion;
import com.bbva.glomoutils.usecase.UseCase;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: IsWebViewVersionValidUseCase.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/base/usecase/version/IsWebViewVersionValidUseCase;", "Lcom/bbva/glomoutils/usecase/UseCase;", "", "execute", "()Ljava/lang/Boolean;", "Lcom/bbva/ethermobilesdk/deviceinfo/DeviceInfo;", "deviceInfo", "Lcom/bbva/component/dm/settings/repository/AppSettingsRepository;", "repository", "<init>", "(Lcom/bbva/ethermobilesdk/deviceinfo/DeviceInfo;Lcom/bbva/component/dm/settings/repository/AppSettingsRepository;)V", "Base_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nIsWebViewVersionValidUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IsWebViewVersionValidUseCase.kt\ncom/bbva/glomohybrid/base/usecase/version/IsWebViewVersionValidUseCase\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,50:1\n187#2,3:51\n*S KotlinDebug\n*F\n+ 1 IsWebViewVersionValidUseCase.kt\ncom/bbva/glomohybrid/base/usecase/version/IsWebViewVersionValidUseCase\n*L\n29#1:51,3\n*E\n"})
public final class IsWebViewVersionValidUseCase implements UseCase<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final DeviceInfo f31589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final AppSettingsRepository f31590b;

    public IsWebViewVersionValidUseCase(@NotNull DeviceInfo deviceInfo, @NotNull AppSettingsRepository repository) {
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f31589a = deviceInfo;
        this.f31590b = repository;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bbva.glomoutils.usecase.UseCase
    @NotNull
    public Boolean execute() {
        String version;
        List<WebViewVersionDataModel> webViewVersions;
        Object next;
        AppSettingsResult settings = this.f31590b.getSettings(SettingsPolicy.Local);
        boolean z10 = false;
        if (settings instanceof AppSettingsResult.CachedResult) {
            AppSettings data = settings.getData();
            WebViewVersion webViewVersion = this.f31589a.getCom.bbva.nativesettings.common.Constants.APPLICATION java.lang.String().getWebViewVersion();
            if (webViewVersion != null && (version = webViewVersion.getVersion()) != null && (webViewVersions = DataModelsKt.getWebViewVersions(data)) != null) {
                Iterator<T> it = webViewVersions.iterator();
                loop0: while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    Map<String, String> packageIds = ((WebViewVersionDataModel) next).getPackageIds();
                    if (!packageIds.isEmpty()) {
                        Iterator<Map.Entry<String, String>> it2 = packageIds.entrySet().iterator();
                        while (it2.hasNext()) {
                            if (Intrinsics.areEqual(it2.next().getKey(), webViewVersion.getPackageName())) {
                                break loop0;
                            }
                        }
                    }
                }
                WebViewVersionDataModel webViewVersionDataModel = (WebViewVersionDataModel) next;
                if (webViewVersionDataModel != null && IsWebViewVersionValidUseCaseKt.compareVersionWith(version, webViewVersionDataModel.getMinVersion()) < 0) {
                    z10 = true;
                }
            }
        }
        return Boolean.valueOf(z10);
    }
}
