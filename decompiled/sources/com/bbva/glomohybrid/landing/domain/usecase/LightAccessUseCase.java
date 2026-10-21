package com.bbva.glomohybrid.landing.domain.usecase;

import androidx.camera.core.imagecapture.a;
import com.bbva.component.dm.settings.domain.fetcher.LandingConfigurationFetcher;
import com.bbva.component.dm.settings.domain.model.LandingConfiguration;
import com.bbva.glomohybrid.base.session.Session;
import com.bbva.glomohybrid.base.viewmodel.ViewModelComponentsProviders;
import com.bbva.glomohybrid.landing.domain.model.LandingLightAccessParams;
import com.bbva.glomohybrid.landing.presentation.model.LandingHeaderState;
import com.bbva.glomoutils.usecase.UseCaseWithParams;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: compiled from: LightAccessUseCase.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/landing/domain/usecase/LightAccessUseCase;", "Lcom/bbva/glomoutils/usecase/UseCaseWithParams;", "Lcom/bbva/glomohybrid/landing/domain/model/LandingLightAccessParams;", "", "params", "execute", "(Lcom/bbva/glomohybrid/landing/domain/model/LandingLightAccessParams;)Ljava/lang/Boolean;", "Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;", "provider", "<init>", "(Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLightAccessUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LightAccessUseCase.kt\ncom/bbva/glomohybrid/landing/domain/usecase/LightAccessUseCase\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n*L\n1#1,33:1\n56#2,6:34\n56#2,6:40\n*S KotlinDebug\n*F\n+ 1 LightAccessUseCase.kt\ncom/bbva/glomohybrid/landing/domain/usecase/LightAccessUseCase\n*L\n15#1:34,6\n16#1:40,6\n*E\n"})
public final class LightAccessUseCase implements UseCaseWithParams<LandingLightAccessParams, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Lazy f32872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f32873b;

    /* JADX WARN: Multi-variable type inference failed */
    public LightAccessUseCase(@NotNull final ViewModelComponentsProviders provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.f32872a = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<LandingConfigurationFetcher>() { // from class: com.bbva.glomohybrid.landing.domain.usecase.LightAccessUseCase$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.component.dm.settings.domain.fetcher.LandingConfigurationFetcher, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final LandingConfigurationFetcher invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(LandingConfigurationFetcher.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.f32873b = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<Session>() { // from class: com.bbva.glomohybrid.landing.domain.usecase.LightAccessUseCase$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.glomohybrid.base.session.Session, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Session invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(Session.class), objArr2, objArr3);
            }
        });
    }

    @Override // com.bbva.glomoutils.usecase.UseCaseWithParams
    @NotNull
    public Boolean execute(@NotNull LandingLightAccessParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        LandingConfiguration landingConfigurationFetchConfiguration = ((LandingConfigurationFetcher) this.f32872a.getValue()).fetchConfiguration(params.getUserProfile());
        LandingHeaderState header = params.getHeader();
        boolean z10 = false;
        if (landingConfigurationFetchConfiguration != null && landingConfigurationFetchConfiguration.getLightAccess() && header.getAccessType() == LandingHeaderState.AccessType.BIOMETRIC && (header.getType() instanceof LandingHeaderState.Type.Enabled)) {
            Lazy lazy = this.f32873b;
            boolean f31503d = ((Session) lazy.getValue()).getF31503d();
            ((Session) lazy.getValue()).setComeFromSplash(false);
            if (f31503d) {
                z10 = true;
            }
        }
        return Boolean.valueOf(z10);
    }
}
