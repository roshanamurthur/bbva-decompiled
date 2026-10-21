package com.bbva.glomohybrid.landing.domain.usecase;

import androidx.camera.core.imagecapture.a;
import com.bbva.glomohybrid.base.viewmodel.ViewModelComponentsProviders;
import com.bbva.glomohybrid.landing.data.repository.DeviceInfoRepository;
import com.bbva.glomoutils.usecase.UseCase;
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

/* JADX INFO: compiled from: CheckIsDeviceSecureUseCase.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/bbva/glomohybrid/landing/domain/usecase/CheckIsDeviceSecureUseCase;", "Lcom/bbva/glomoutils/usecase/UseCase;", "", "execute", "()Ljava/lang/Boolean;", "Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;", "provider", "<init>", "(Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nCheckIsDeviceSecureUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckIsDeviceSecureUseCase.kt\ncom/bbva/glomohybrid/landing/domain/usecase/CheckIsDeviceSecureUseCase\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n*L\n1#1,16:1\n56#2,6:17\n*S KotlinDebug\n*F\n+ 1 CheckIsDeviceSecureUseCase.kt\ncom/bbva/glomohybrid/landing/domain/usecase/CheckIsDeviceSecureUseCase\n*L\n10#1:17,6\n*E\n"})
public final class CheckIsDeviceSecureUseCase implements UseCase<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Lazy f32792a;

    /* JADX WARN: Multi-variable type inference failed */
    public CheckIsDeviceSecureUseCase(@NotNull final ViewModelComponentsProviders provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.f32792a = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceInfoRepository>() { // from class: com.bbva.glomohybrid.landing.domain.usecase.CheckIsDeviceSecureUseCase$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.glomohybrid.landing.data.repository.DeviceInfoRepository, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceInfoRepository invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class), qualifier, objArr);
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bbva.glomoutils.usecase.UseCase
    @NotNull
    public Boolean execute() {
        return Boolean.valueOf(((DeviceInfoRepository) this.f32792a.getValue()).getIsDeviceSecure(true));
    }
}
