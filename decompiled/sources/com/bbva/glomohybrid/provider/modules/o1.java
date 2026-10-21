package com.bbva.glomohybrid.provider.modules;

import com.bbva.ethermobilesdk.naturalauthentication.NaturalAuthentication;
import com.bbva.plugin.naturalauthentication.NaturalAuthenticationPlugin;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: NaturalAuthModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nNaturalAuthModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NaturalAuthModule.kt\ncom/bbva/glomohybrid/provider/modules/NaturalAuthModuleKt$naturalAuthModule$1$3\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,98:1\n129#2,5:99\n*S KotlinDebug\n*F\n+ 1 NaturalAuthModule.kt\ncom/bbva/glomohybrid/provider/modules/NaturalAuthModuleKt$naturalAuthModule$1$3\n*L\n47#1:99,5\n*E\n"})
public final class o1 extends Lambda implements Function2<Scope, ParametersHolder, NaturalAuthenticationPlugin> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final o1 f34322p0 = new o1(2);

    @Override // kotlin.jvm.functions.Function2
    public final NaturalAuthenticationPlugin invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new NaturalAuthenticationPlugin((NaturalAuthentication) single.get(Reflection.getOrCreateKotlinClass(NaturalAuthentication.class), null, null), "Biometrics");
    }
}
