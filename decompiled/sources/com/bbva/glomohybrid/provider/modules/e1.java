package com.bbva.glomohybrid.provider.modules;

import com.bbva.component.request.header.customerid.CustomerIdInterceptor;
import com.bbva.component.request.header.customerid.CustomerIdInterceptorConfig;
import com.bbva.glomo.user.repository.datasource.RememberedUserDataSource;
import com.bbva.glomoconfig.GlobalConfig;
import com.bbva.glomoconfig.constants.ConfigConstantsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: InterceptorsModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nInterceptorsModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InterceptorsModule.kt\ncom/bbva/glomohybrid/provider/modules/InterceptorsModuleKt$interceptorsConfigurationModule$1$9\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,294:1\n129#2,5:295\n129#2,5:300\n*S KotlinDebug\n*F\n+ 1 InterceptorsModule.kt\ncom/bbva/glomohybrid/provider/modules/InterceptorsModuleKt$interceptorsConfigurationModule$1$9\n*L\n171#1:295,5\n172#1:300,5\n*E\n"})
public final class e1 extends Lambda implements Function2<Scope, ParametersHolder, CustomerIdInterceptor> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final e1 f34280p0 = new e1(2);

    @Override // kotlin.jvm.functions.Function2
    public final CustomerIdInterceptor invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new CustomerIdInterceptor(new CustomerIdInterceptorConfig(bk.d.listOf(".*/TechArchitecture/mx/grantingTicket/.*"), bk.d.listOf(".*/single-sign-on/.*/single-sign-on")), (RememberedUserDataSource) single.get(Reflection.getOrCreateKotlinClass(RememberedUserDataSource.class), null, null), ((GlobalConfig) single.get(Reflection.getOrCreateKotlinClass(GlobalConfig.class), null, null)).getHost(), ConfigConstantsKt.GLOMO_CONSUMER_ID_ANONYMOUS);
    }
}
