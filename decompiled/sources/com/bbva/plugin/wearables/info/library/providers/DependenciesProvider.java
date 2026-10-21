package com.bbva.plugin.wearables.info.library.providers;

import android.content.Context;
import com.bbva.glomoutils.mobileservices.MobileServices;
import com.bbva.plugin.wearables.info.library.usecase.IsDevicePairedUserCase;
import com.bbva.plugin.wearables.info.library.usecase.IsPairedDeviceAppInstalledUseCase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DependenciesProvider.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/bbva/plugin/wearables/info/library/providers/DependenciesProvider;", "Lcom/bbva/plugin/wearables/info/library/providers/UseCaseProvider;", "Lcom/bbva/plugin/wearables/info/library/usecase/IsDevicePairedUserCase;", "isDeviceConnected", "()Lcom/bbva/plugin/wearables/info/library/usecase/IsDevicePairedUserCase;", "Lcom/bbva/plugin/wearables/info/library/usecase/IsPairedDeviceAppInstalledUseCase;", "isAppInstalled", "()Lcom/bbva/plugin/wearables/info/library/usecase/IsPairedDeviceAppInstalledUseCase;", "Landroid/content/Context;", "context", "Lcom/bbva/glomoutils/mobileservices/MobileServices;", "mobileServices", "<init>", "(Landroid/content/Context;Lcom/bbva/glomoutils/mobileservices/MobileServices;)V", "plugin-wearables-info_release"}, k = 1, mv = {1, 9, 0})
public final class DependenciesProvider implements UseCaseProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f36076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MobileServices f36077b;

    public DependenciesProvider(@NotNull Context context, @NotNull MobileServices mobileServices) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mobileServices, "mobileServices");
        this.f36076a = context;
        this.f36077b = mobileServices;
    }

    @Override // com.bbva.plugin.wearables.info.library.providers.UseCaseProvider
    @NotNull
    public IsPairedDeviceAppInstalledUseCase isAppInstalled() {
        return new IsPairedDeviceAppInstalledUseCase(this.f36076a, null, this.f36077b, null, 10, null);
    }

    @Override // com.bbva.plugin.wearables.info.library.providers.UseCaseProvider
    @NotNull
    public IsDevicePairedUserCase isDeviceConnected() {
        return new IsDevicePairedUserCase(this.f36076a, null, this.f36077b, null, 10, null);
    }
}
