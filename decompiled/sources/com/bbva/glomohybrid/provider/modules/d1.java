package com.bbva.glomohybrid.provider.modules;

import com.bbva.component.request.header.standin.StandInHeaderInterceptor;
import com.bbva.component.request.header.standin.StandInInterceptorConfig;
import com.bbva.glomo.localstorage.DeviceIdDataSource;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: InterceptorsModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nInterceptorsModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InterceptorsModule.kt\ncom/bbva/glomohybrid/provider/modules/InterceptorsModuleKt$interceptorsConfigurationModule$1$8\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,294:1\n129#2,5:295\n*S KotlinDebug\n*F\n+ 1 InterceptorsModule.kt\ncom/bbva/glomohybrid/provider/modules/InterceptorsModuleKt$interceptorsConfigurationModule$1$8\n*L\n157#1:295,5\n*E\n"})
public final class d1 extends Lambda implements Function2<Scope, ParametersHolder, StandInHeaderInterceptor> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final d1 f34276p0 = new d1(2);

    @Override // kotlin.jvm.functions.Function2
    public final StandInHeaderInterceptor invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new StandInHeaderInterceptor(new StandInInterceptorConfig(CollectionsKt__CollectionsKt.listOf((Object[]) new Regex[]{new Regex(".*/financial-overview/.*/financial-overview.*"), new Regex(".*/session/.*/tracking-data")})), (DeviceIdDataSource) single.get(Reflection.getOrCreateKotlinClass(DeviceIdDataSource.class), null, null));
    }
}
