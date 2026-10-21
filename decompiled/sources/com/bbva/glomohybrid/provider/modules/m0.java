package com.bbva.glomohybrid.provider.modules;

import com.bbva.component.request.behavior.HandlePublicZoneHeadersBehavior;
import com.bbva.component.request.header.deviceid.DeviceIdInterceptor;
import com.bbva.component.request.header.deviceid.DeviceIdInterceptorConfig;
import com.bbva.component.request.header.deviceid.HeadersProvider;
import com.bbva.component.request.header.standin.StandInHeaderInterceptor;
import com.bbva.glomo.localstorage.DeviceIdDataSource;
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
@SourceDebugExtension({"SMAP\nInterceptorsModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InterceptorsModule.kt\ncom/bbva/glomohybrid/provider/modules/InterceptorsModuleKt$interceptorsConfigurationModule$1$11\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,294:1\n129#2,5:295\n129#2,5:300\n154#2,5:305\n*S KotlinDebug\n*F\n+ 1 InterceptorsModule.kt\ncom/bbva/glomohybrid/provider/modules/InterceptorsModuleKt$interceptorsConfigurationModule$1$11\n*L\n210#1:295,5\n211#1:300,5\n212#1:305,5\n*E\n"})
public final class m0 extends Lambda implements Function2<Scope, ParametersHolder, DeviceIdInterceptor> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final m0 f34313p0 = new m0(2);

    @Override // kotlin.jvm.functions.Function2
    public final DeviceIdInterceptor invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope factory = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        return new DeviceIdInterceptor(new DeviceIdInterceptorConfig(CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{".*/business-documents/.*/business-documents", ".*/business-documents/.*/insurance-documents/generate", ".*/customers/.*/customers\\?.*", ".*/customer-logins/.*/indicators", ".*/single-sign-on/.*/single-sign-on"}), StandInHeaderInterceptor.AUTHTYPE58, CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{".*/int.bbvaempresas.mx/.*", ".*/pr-gema-mx.bbvaempresas.mx/qsrv_gemapr_mx_v2/.*", ".*/lo-gema-mx.bbvaempresas.mx/qsrv_gemalo_v2_mx/.*", ".*/financial-overview/.*/financial-overview.*"}), bk.d.listOf(".*/business-documents/.*/business-documents")), (DeviceIdDataSource) factory.get(Reflection.getOrCreateKotlinClass(DeviceIdDataSource.class), null, null), (HeadersProvider) factory.get(Reflection.getOrCreateKotlinClass(HeadersProvider.class), null, null), (HandlePublicZoneHeadersBehavior) factory.getOrNull(Reflection.getOrCreateKotlinClass(HandlePublicZoneHeadersBehavior.class), null, null));
    }
}
