package com.bbva.glomohybrid.provider.modules;

import com.bbva.glomohybrid.profiling.domain.usecase.SyncProfilingUseCase;
import com.bbva.glomohybrid.profiling.repository.ProfilingRepository;
import com.bbva.glomoutils.scheduler.ThreadDispatchers;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: ProfilingModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nProfilingModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProfilingModule.kt\ncom/bbva/glomohybrid/provider/modules/ProfilingModuleKt$profilingModule$1$5\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,30:1\n129#2,5:31\n*S KotlinDebug\n*F\n+ 1 ProfilingModule.kt\ncom/bbva/glomohybrid/provider/modules/ProfilingModuleKt$profilingModule$1$5\n*L\n18#1:31,5\n*E\n"})
public final class u1 extends Lambda implements Function2<Scope, ParametersHolder, SyncProfilingUseCase> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final u1 f34347p0 = new u1(2);

    @Override // kotlin.jvm.functions.Function2
    public final SyncProfilingUseCase invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new SyncProfilingUseCase((ProfilingRepository) single.get(Reflection.getOrCreateKotlinClass(ProfilingRepository.class), null, null), (ThreadDispatchers) single.get(Reflection.getOrCreateKotlinClass(ThreadDispatchers.class), null, null));
    }
}
