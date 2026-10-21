package com.bbva.glomohybrid.provider.modules;

import com.bbva.glomo.storage.MainStorage;
import com.bbva.glomohybrid.profiling.repository.ProfilingRepository;
import com.bbva.glomohybrid.profiling.repository.datasource.NetworkProfilingDataSource;
import com.bbva.glomohybrid.profiling.repository.datasource.ProfilingLocalDataSource;
import com.bbva.glomohybrid.profiling.repository.datasource.ProfilingMemoryDataSource;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: ProfilingModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nProfilingModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProfilingModule.kt\ncom/bbva/glomohybrid/provider/modules/ProfilingModuleKt$profilingModule$1$4\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,30:1\n129#2,5:31\n*S KotlinDebug\n*F\n+ 1 ProfilingModule.kt\ncom/bbva/glomohybrid/provider/modules/ProfilingModuleKt$profilingModule$1$4\n*L\n17#1:31,5\n*E\n"})
public final class t1 extends Lambda implements Function2<Scope, ParametersHolder, ProfilingRepository> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final t1 f34343p0 = new t1(2);

    @Override // kotlin.jvm.functions.Function2
    public final ProfilingRepository invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new ProfilingRepository((NetworkProfilingDataSource) single.get(Reflection.getOrCreateKotlinClass(NetworkProfilingDataSource.class), null, null), (ProfilingLocalDataSource) single.get(Reflection.getOrCreateKotlinClass(ProfilingLocalDataSource.class), null, null), (ProfilingMemoryDataSource) single.get(Reflection.getOrCreateKotlinClass(ProfilingMemoryDataSource.class), null, null), (MainStorage) single.get(Reflection.getOrCreateKotlinClass(MainStorage.class), null, null));
    }
}
