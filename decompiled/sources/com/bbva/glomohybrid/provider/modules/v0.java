package com.bbva.glomohybrid.provider.modules;

import com.bbva.component.request.behavior.HandlePublicZoneHeadersBehavior;
import com.bbva.component.request.header.deviceid.HeadersProvider;
import com.bbva.glomohybrid.behaviours.CountryPublicZoneHeadersBehavior;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: InterceptorsModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nInterceptorsModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InterceptorsModule.kt\ncom/bbva/glomohybrid/provider/modules/InterceptorsModuleKt$interceptorsConfigurationModule$1$19\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,294:1\n129#2,5:295\n*S KotlinDebug\n*F\n+ 1 InterceptorsModule.kt\ncom/bbva/glomohybrid/provider/modules/InterceptorsModuleKt$interceptorsConfigurationModule$1$19\n*L\n286#1:295,5\n*E\n"})
public final class v0 extends Lambda implements Function2<Scope, ParametersHolder, HandlePublicZoneHeadersBehavior> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final v0 f34350p0 = new v0(2);

    @Override // kotlin.jvm.functions.Function2
    public final HandlePublicZoneHeadersBehavior invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope factory = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        return new CountryPublicZoneHeadersBehavior((HeadersProvider) factory.get(Reflection.getOrCreateKotlinClass(HeadersProvider.class), null, null), new u0(factory));
    }
}
