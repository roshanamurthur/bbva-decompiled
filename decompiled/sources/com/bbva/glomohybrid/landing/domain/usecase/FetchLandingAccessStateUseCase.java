package com.bbva.glomohybrid.landing.domain.usecase;

import androidx.camera.core.imagecapture.a;
import com.bbva.component.dm.settings.AppSettingsResultExtensionsKt;
import com.bbva.component.dm.settings.domain.model.AppSettingsResult;
import com.bbva.component.dm.settings.domain.model.AppVersionsDataModel;
import com.bbva.component.dm.settings.domain.model.InAppUpdateConfiguration;
import com.bbva.component.dm.settings.domain.model.InAppUpdates;
import com.bbva.component.dm.settings.domain.model.VersionDataModel;
import com.bbva.component.dm.settings.repository.AppSettingsRepository;
import com.bbva.component.dm.settings.repository.SettingsPolicy;
import com.bbva.glomohybrid.base.viewmodel.ViewModelComponentsProviders;
import com.bbva.glomohybrid.landing.domain.model.LandingAppAccess;
import com.bbva.glomoutils.usecase.UseCase;
import com.bbva.semaas.model.Properties;
import com.veridas.contextualdata.ContextualDataConstants;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: compiled from: FetchLandingAccessStateUseCase.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\r"}, d2 = {"Lcom/bbva/glomohybrid/landing/domain/usecase/FetchLandingAccessStateUseCase;", "Lcom/bbva/glomoutils/usecase/UseCase;", "Lcom/bbva/glomohybrid/landing/domain/model/LandingAppAccess;", "execute", "", Properties.BUILD_VERSION, ContextualDataConstants.CD_SDK_VERSION, "Lcom/bbva/glomohybrid/landing/domain/usecase/ScheduledShutdownCheckerUseCase;", "scheduledShutdownCheckerUseCase", "Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;", "provider", "<init>", "(IILcom/bbva/glomohybrid/landing/domain/usecase/ScheduledShutdownCheckerUseCase;Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nFetchLandingAccessStateUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FetchLandingAccessStateUseCase.kt\ncom/bbva/glomohybrid/landing/domain/usecase/FetchLandingAccessStateUseCase\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n*L\n1#1,43:1\n56#2,6:44\n*S KotlinDebug\n*F\n+ 1 FetchLandingAccessStateUseCase.kt\ncom/bbva/glomohybrid/landing/domain/usecase/FetchLandingAccessStateUseCase\n*L\n22#1:44,6\n*E\n"})
public final class FetchLandingAccessStateUseCase implements UseCase<LandingAppAccess> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f32824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final ScheduledShutdownCheckerUseCase f32825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Lazy f32826d;

    /* JADX WARN: Multi-variable type inference failed */
    public FetchLandingAccessStateUseCase(int i10, int i11, @Nullable ScheduledShutdownCheckerUseCase scheduledShutdownCheckerUseCase, @NotNull final ViewModelComponentsProviders provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f32823a = i10;
        this.f32824b = i11;
        this.f32825c = scheduledShutdownCheckerUseCase;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.f32826d = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<AppSettingsRepository>() { // from class: com.bbva.glomohybrid.landing.domain.usecase.FetchLandingAccessStateUseCase$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.component.dm.settings.repository.AppSettingsRepository, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final AppSettingsRepository invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(AppSettingsRepository.class), qualifier, objArr);
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bbva.glomoutils.usecase.UseCase
    @NotNull
    public LandingAppAccess execute() {
        InAppUpdates inAppUpdates;
        InAppUpdateConfiguration immediate;
        AppSettingsResult settings = ((AppSettingsRepository) this.f32826d.getValue()).getSettings(SettingsPolicy.Local);
        int i10 = this.f32824b;
        if (!AppSettingsResultExtensionsKt.isAppAvailable(settings, i10)) {
            return new LandingAppAccess.NotAvailable(AppSettingsResultExtensionsKt.getAppStatusMessageBy(settings, i10));
        }
        ScheduledShutdownCheckerUseCase scheduledShutdownCheckerUseCase = this.f32825c;
        if (scheduledShutdownCheckerUseCase != null && scheduledShutdownCheckerUseCase.execute(AppSettingsResultExtensionsKt.getScheduledShutdown(settings)).booleanValue()) {
            return new LandingAppAccess.NotAvailable(AppSettingsResultExtensionsKt.getScheduledShutdownMessage(settings));
        }
        if (!AppSettingsResultExtensionsKt.needForceUpdate(settings, this.f32823a, Integer.valueOf(i10))) {
            return LandingAppAccess.Available.INSTANCE;
        }
        AppVersionsDataModel appVersion = settings.getData().getAppVersion();
        VersionDataModel android2 = appVersion != null ? appVersion.getAndroid() : null;
        boolean available = (android2 == null || (inAppUpdates = android2.getInAppUpdates()) == null || (immediate = inAppUpdates.getImmediate()) == null) ? true : immediate.getAvailable();
        String packageId = android2 != null ? android2.getPackageId() : null;
        if (packageId == null) {
            packageId = "";
        }
        return new LandingAppAccess.NotAvailableForUpdate(packageId, available);
    }
}
