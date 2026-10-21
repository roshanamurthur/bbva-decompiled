package com.bbva.glomohybrid.provider.modules;

import com.bbva.component.dm.security.SecurityInterceptor;
import com.bbva.component.dm.security.SecurityInterceptorConfig;
import com.bbva.ethermobilesdk.deviceinfo.DeviceInfo;
import com.bbva.glomo.localstorage.DeviceIdDataSource;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: InterceptorsModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nInterceptorsModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InterceptorsModule.kt\ncom/bbva/glomohybrid/provider/modules/InterceptorsModuleKt$interceptorsConfigurationModule$1$13\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,294:1\n129#2,5:295\n129#2,5:300\n*S KotlinDebug\n*F\n+ 1 InterceptorsModule.kt\ncom/bbva/glomohybrid/provider/modules/InterceptorsModuleKt$interceptorsConfigurationModule$1$13\n*L\n240#1:295,5\n241#1:300,5\n*E\n"})
public final class o0 extends Lambda implements Function2<Scope, ParametersHolder, SecurityInterceptor> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final o0 f34321p0 = new o0(2);

    @Override // kotlin.jvm.functions.Function2
    public final SecurityInterceptor invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope factory = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        return new SecurityInterceptor(new SecurityInterceptorConfig(CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{".*/transfers/.*/mobile-transfers.*", ".*/transfers/.*/internal-transfers.*", ".*/transfers/.*/interbank-transfers.*", ".*/transfers/.*/own-transfers.*", ".*/payments/.*/service-payments.*"})), ModuleExtKt.androidContext(factory), (DeviceIdDataSource) factory.get(Reflection.getOrCreateKotlinClass(DeviceIdDataSource.class), null, null), (DeviceInfo) factory.get(Reflection.getOrCreateKotlinClass(DeviceInfo.class), null, null));
    }
}
