package com.bbva.glomohybrid.provider.module;

import com.bbva.component.dm.settings.domain.usecase.AppSettingsObserver;
import com.bbva.component.dm.settings.domain.usecase.FetchSettingsUseCase;
import com.bbva.component.dm.settings.repository.AppSettingsRepository;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: ArchitectureModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nArchitectureModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchitectureModule.kt\ncom/bbva/glomohybrid/provider/module/ArchitectureModuleKt$useCase$1$23\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,298:1\n129#2,5:299\n352#2:304\n*S KotlinDebug\n*F\n+ 1 ArchitectureModule.kt\ncom/bbva/glomohybrid/provider/module/ArchitectureModuleKt$useCase$1$23\n*L\n220#1:299,5\n220#1:304\n*E\n"})
public final class n1 extends Lambda implements Function2<Scope, ParametersHolder, FetchSettingsUseCase> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final n1 f34119p0 = new n1(2);

    @Override // kotlin.jvm.functions.Function2
    public final FetchSettingsUseCase invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope factory = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        return new FetchSettingsUseCase((AppSettingsRepository) factory.get(Reflection.getOrCreateKotlinClass(AppSettingsRepository.class), null, null), factory.getAll(Reflection.getOrCreateKotlinClass(AppSettingsObserver.class)), null, 4, null);
    }
}
