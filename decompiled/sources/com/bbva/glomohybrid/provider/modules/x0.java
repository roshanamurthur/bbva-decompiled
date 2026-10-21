package com.bbva.glomohybrid.provider.modules;

import com.bbva.component.ic.security.SecurityDataManager;
import com.bbva.network.NetworkWorker;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: InterceptorsModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nInterceptorsModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InterceptorsModule.kt\ncom/bbva/glomohybrid/provider/modules/InterceptorsModuleKt$interceptorsConfigurationModule$1$2\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,294:1\n129#2,5:295\n129#2,5:300\n*S KotlinDebug\n*F\n+ 1 InterceptorsModule.kt\ncom/bbva/glomohybrid/provider/modules/InterceptorsModuleKt$interceptorsConfigurationModule$1$2\n*L\n45#1:295,5\n47#1:300,5\n*E\n"})
public final class x0 extends Lambda implements Function2<Scope, ParametersHolder, SecurityDataManager> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final x0 f34356p0 = new x0(2);

    @Override // kotlin.jvm.functions.Function2
    public final SecurityDataManager invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        SecurityDataManager securityDataManager = new SecurityDataManager((NetworkWorker) single.get(Reflection.getOrCreateKotlinClass(NetworkWorker.class), null, null));
        securityDataManager.setProperties((Map) single.get(Reflection.getOrCreateKotlinClass(Map.class), QualifierKt.named(securityDataManager.getF28076q0()), null));
        return securityDataManager;
    }
}
