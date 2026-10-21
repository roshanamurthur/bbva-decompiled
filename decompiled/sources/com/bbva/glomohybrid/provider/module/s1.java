package com.bbva.glomohybrid.provider.module;

import com.bbva.component.dm.settings.repository.AppSettingsRepository;
import com.bbva.glomohybrid.BuildConfig;
import com.bbva.notifications.usecase.GetNotificationOperativesNonCommercialUseCase;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: ArchitectureModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nArchitectureModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchitectureModule.kt\ncom/bbva/glomohybrid/provider/module/ArchitectureModuleKt$useCase$1$28\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,298:1\n129#2,5:299\n*S KotlinDebug\n*F\n+ 1 ArchitectureModule.kt\ncom/bbva/glomohybrid/provider/module/ArchitectureModuleKt$useCase$1$28\n*L\n225#1:299,5\n*E\n"})
public final class s1 extends Lambda implements Function2<Scope, ParametersHolder, GetNotificationOperativesNonCommercialUseCase> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final s1 f34160p0 = new s1(2);

    @Override // kotlin.jvm.functions.Function2
    public final GetNotificationOperativesNonCommercialUseCase invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new GetNotificationOperativesNonCommercialUseCase((AppSettingsRepository) single.get(Reflection.getOrCreateKotlinClass(AppSettingsRepository.class), null, null), BuildConfig.VERSION_CODE, null, null, 12, null);
    }
}
