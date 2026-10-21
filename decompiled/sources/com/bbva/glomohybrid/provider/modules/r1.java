package com.bbva.glomohybrid.provider.modules;

import com.bbva.glomo.storage.MainStorage;
import com.bbva.glomohybrid.profiling.repository.datasource.ProfilingLocalDataSource;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: ProfilingModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nProfilingModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProfilingModule.kt\ncom/bbva/glomohybrid/provider/modules/ProfilingModuleKt$profilingModule$1$2\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,30:1\n129#2,5:31\n*S KotlinDebug\n*F\n+ 1 ProfilingModule.kt\ncom/bbva/glomohybrid/provider/modules/ProfilingModuleKt$profilingModule$1$2\n*L\n15#1:31,5\n*E\n"})
public final class r1 extends Lambda implements Function2<Scope, ParametersHolder, ProfilingLocalDataSource> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final r1 f34335p0 = new r1(2);

    @Override // kotlin.jvm.functions.Function2
    public final ProfilingLocalDataSource invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new ProfilingLocalDataSource((MainStorage) single.get(Reflection.getOrCreateKotlinClass(MainStorage.class), null, null));
    }
}
