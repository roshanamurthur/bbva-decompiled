package com.bbva.glomohybrid.provider.module;

import com.bbva.component.dm.settings.repository.AppSettingsRepository;
import com.bbva.ethermobilesdk.deviceinfo.DeviceInfo;
import com.bbva.glomohybrid.infoscreen.webView.force.domain.usecase.GetWebViewStoreUrlUseCase;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: ArchitectureModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nArchitectureModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchitectureModule.kt\ncom/bbva/glomohybrid/provider/module/ArchitectureModuleKt$useCase$1$1\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,298:1\n129#2,5:299\n*S KotlinDebug\n*F\n+ 1 ArchitectureModule.kt\ncom/bbva/glomohybrid/provider/module/ArchitectureModuleKt$useCase$1$1\n*L\n184#1:299,5\n*E\n"})
public final class j1 extends Lambda implements Function2<Scope, ParametersHolder, GetWebViewStoreUrlUseCase> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final j1 f34083p0 = new j1(2);

    @Override // kotlin.jvm.functions.Function2
    public final GetWebViewStoreUrlUseCase invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope factory = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        return new GetWebViewStoreUrlUseCase((DeviceInfo) factory.get(Reflection.getOrCreateKotlinClass(DeviceInfo.class), null, null), (AppSettingsRepository) factory.get(Reflection.getOrCreateKotlinClass(AppSettingsRepository.class), null, null));
    }
}
