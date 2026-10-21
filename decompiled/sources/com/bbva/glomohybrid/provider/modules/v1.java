package com.bbva.glomohybrid.provider.modules;

import com.bbva.glomo.storage.MainStorage;
import com.bbva.glomo.user.domain.usecase.GetUserConfigurationUseCase;
import com.bbva.glomohybrid.base.datasource.AppVersionDataSource;
import com.bbva.glomohybrid.profiling.handler.ProfilingFeatureFlagsHandler;
import com.bbva.glomoutils.scheduler.ThreadDispatchers;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: ProfilingModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nProfilingModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProfilingModule.kt\ncom/bbva/glomohybrid/provider/modules/ProfilingModuleKt$profilingModule$1$6\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,30:1\n129#2,5:31\n129#2,5:36\n129#2,5:41\n129#2,5:46\n*S KotlinDebug\n*F\n+ 1 ProfilingModule.kt\ncom/bbva/glomohybrid/provider/modules/ProfilingModuleKt$profilingModule$1$6\n*L\n21#1:31,5\n24#1:36,5\n25#1:41,5\n26#1:46,5\n*E\n"})
public final class v1 extends Lambda implements Function2<Scope, ParametersHolder, ProfilingFeatureFlagsHandler> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final v1 f34351p0 = new v1(2);

    @Override // kotlin.jvm.functions.Function2
    public final ProfilingFeatureFlagsHandler invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope scope2 = scope;
        return new ProfilingFeatureFlagsHandler(null, ((AppVersionDataSource) scope2.get(androidx.activity.a.f(scope2, "$this$single", parametersHolder, "it", AppVersionDataSource.class), null, null)).getCurrentAppVersionName(), (MainStorage) scope2.get(Reflection.getOrCreateKotlinClass(MainStorage.class), null, null), (GetUserConfigurationUseCase) scope2.get(Reflection.getOrCreateKotlinClass(GetUserConfigurationUseCase.class), null, null), (ThreadDispatchers) scope2.get(Reflection.getOrCreateKotlinClass(ThreadDispatchers.class), null, null), 1, null);
    }
}
