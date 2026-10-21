package com.bbva.glomohybrid.provider.module;

import com.bbva.glomohybrid.featureflags.domain.observer.FeatureFlagsObserver;
import com.bbva.glomohybrid.featureflags.domain.usecase.SyncFeatureFlagsUseCase;
import com.bbva.glomohybrid.featureflags.repository.FeatureFlagsRepository;
import com.bbva.glomohybrid.profiling.handler.ProfilingFeatureFlagsHandler;
import com.bbva.glomohybrid.profiling.repository.ProfilingRepository;
import com.bbva.glomoutils.scheduler.ThreadDispatchers;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: FeatureFlagsModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nFeatureFlagsModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeatureFlagsModule.kt\ncom/bbva/glomohybrid/provider/module/FeatureFlagsModuleKt$featureFlagsModule$1$5\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,48:1\n129#2,5:49\n352#2:54\n154#2,5:55\n*S KotlinDebug\n*F\n+ 1 FeatureFlagsModule.kt\ncom/bbva/glomohybrid/provider/module/FeatureFlagsModuleKt$featureFlagsModule$1$5\n*L\n30#1:49,5\n30#1:54\n30#1:55,5\n*E\n"})
public final class a3 extends Lambda implements Function2<Scope, ParametersHolder, SyncFeatureFlagsUseCase> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final a3 f34004p0 = new a3(2);

    @Override // kotlin.jvm.functions.Function2
    public final SyncFeatureFlagsUseCase invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new SyncFeatureFlagsUseCase((FeatureFlagsRepository) single.get(Reflection.getOrCreateKotlinClass(FeatureFlagsRepository.class), null, null), single.getAll(Reflection.getOrCreateKotlinClass(FeatureFlagsObserver.class)), (ThreadDispatchers) single.get(Reflection.getOrCreateKotlinClass(ThreadDispatchers.class), null, null), (ProfilingFeatureFlagsHandler) single.getOrNull(Reflection.getOrCreateKotlinClass(ProfilingFeatureFlagsHandler.class), null, null), (ProfilingRepository) single.getOrNull(Reflection.getOrCreateKotlinClass(ProfilingRepository.class), null, null));
    }
}
