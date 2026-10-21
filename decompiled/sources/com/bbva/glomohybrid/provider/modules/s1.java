package com.bbva.glomohybrid.provider.modules;

import com.bbva.glomo.localstorage.LocalStorageConstantsKt;
import com.bbva.glomoconfig.GlobalConfig;
import com.bbva.glomohybrid.profiling.repository.datasource.NetworkProfilingDataSource;
import com.bbva.network.NetworkWorker;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: ProfilingModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nProfilingModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProfilingModule.kt\ncom/bbva/glomohybrid/provider/modules/ProfilingModuleKt$profilingModule$1$3\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,30:1\n129#2,5:31\n*S KotlinDebug\n*F\n+ 1 ProfilingModule.kt\ncom/bbva/glomohybrid/provider/modules/ProfilingModuleKt$profilingModule$1$3\n*L\n16#1:31,5\n*E\n"})
public final class s1 extends Lambda implements Function2<Scope, ParametersHolder, NetworkProfilingDataSource> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final s1 f34339p0 = new s1(2);

    @Override // kotlin.jvm.functions.Function2
    public final NetworkProfilingDataSource invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new NetworkProfilingDataSource(((GlobalConfig) single.get(Reflection.getOrCreateKotlinClass(GlobalConfig.class), null, null)).settings(LocalStorageConstantsKt.KEY_PROFILING), (NetworkWorker) single.get(Reflection.getOrCreateKotlinClass(NetworkWorker.class), null, null));
    }
}
