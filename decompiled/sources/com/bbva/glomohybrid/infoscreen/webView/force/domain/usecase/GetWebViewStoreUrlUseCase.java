package com.bbva.glomohybrid.infoscreen.webView.force.domain.usecase;

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
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GetWebViewStoreUrlUseCase.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/webView/force/domain/usecase/GetWebViewStoreUrlUseCase;", "Lcom/bbva/glomoutils/usecase/UseCase;", "", "execute", "Lcom/bbva/ethermobilesdk/deviceinfo/DeviceInfo;", "deviceInfo", "Lcom/bbva/component/dm/settings/repository/AppSettingsRepository;", "repository", "<init>", "(Lcom/bbva/ethermobilesdk/deviceinfo/DeviceInfo;Lcom/bbva/component/dm/settings/repository/AppSettingsRepository;)V", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nGetWebViewStoreUrlUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetWebViewStoreUrlUseCase.kt\ncom/bbva/glomohybrid/infoscreen/webView/force/domain/usecase/GetWebViewStoreUrlUseCase\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,34:1\n187#2,3:35\n*S KotlinDebug\n*F\n+ 1 GetWebViewStoreUrlUseCase.kt\ncom/bbva/glomohybrid/infoscreen/webView/force/domain/usecase/GetWebViewStoreUrlUseCase\n*L\n28#1:35,3\n*E\n"})
public final class GetWebViewStoreUrlUseCase implements UseCase<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final DeviceInfo f32501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final AppSettingsRepository f32502b;

    public GetWebViewStoreUrlUseCase(@NotNull DeviceInfo deviceInfo, @NotNull AppSettingsRepository repository) {
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f32501a = deviceInfo;
        this.f32502b = repository;
    }

    @Override // com.bbva.glomoutils.usecase.UseCase
    @Nullable
    public String execute() {
        String packageName;
        List<WebViewVersionDataModel> webViewVersions;
        Object next;
        AppSettingsResult settings = this.f32502b.getSettings(SettingsPolicy.Local);
        if (!(settings instanceof AppSettingsResult.CachedResult)) {
            return null;
        }
        AppSettings data = settings.getData();
        WebViewVersion webViewVersion = this.f32501a.getCom.bbva.nativesettings.common.Constants.APPLICATION java.lang.String().getWebViewVersion();
        if (webViewVersion == null || (packageName = webViewVersion.getPackageName()) == null || (webViewVersions = DataModelsKt.getWebViewVersions(data)) == null) {
            return null;
        }
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
                    if (Intrinsics.areEqual(it2.next().getKey(), packageName)) {
                        break loop0;
                    }
                }
            }
        }
        WebViewVersionDataModel webViewVersionDataModel = (WebViewVersionDataModel) next;
        if (webViewVersionDataModel == null) {
            return null;
        }
        return webViewVersionDataModel.getPackageIds().get(packageName);
    }
}
