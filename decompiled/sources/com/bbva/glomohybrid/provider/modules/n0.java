package com.bbva.glomohybrid.provider.modules;

import com.bbva.component.request.header.flowmeter.FlowmeterInterceptor;
import com.bbva.component.request.header.flowmeter.FlowmeterInterceptorConfig;
import com.bbva.glomo.user.repository.datasource.FlowmeterDataSource;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: InterceptorsModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nInterceptorsModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InterceptorsModule.kt\ncom/bbva/glomohybrid/provider/modules/InterceptorsModuleKt$interceptorsConfigurationModule$1$12\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,294:1\n129#2,5:295\n*S KotlinDebug\n*F\n+ 1 InterceptorsModule.kt\ncom/bbva/glomohybrid/provider/modules/InterceptorsModuleKt$interceptorsConfigurationModule$1$12\n*L\n224#1:295,5\n*E\n"})
public final class n0 extends Lambda implements Function2<Scope, ParametersHolder, FlowmeterInterceptor> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final n0 f34317p0 = new n0(2);

    @Override // kotlin.jvm.functions.Function2
    public final FlowmeterInterceptor invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope factory = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        return new FlowmeterInterceptor(new FlowmeterInterceptorConfig(CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{".*/QSRV_A02/TechArchitecture/mx/grantingTicket/.*", ".*/SRVS_A02/transfers/.*/interbank-transfers.*"})), (FlowmeterDataSource) factory.get(Reflection.getOrCreateKotlinClass(FlowmeterDataSource.class), null, null));
    }
}
