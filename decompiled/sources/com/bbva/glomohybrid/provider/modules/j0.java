package com.bbva.glomohybrid.provider.modules;

import com.bbva.ethermobilesdk.naturalauthentication.NaturalAuthentication;
import com.bbva.ethermobilesdk.naturalauthentication.NaturalAuthenticationConfig;
import com.bbva.glomohybrid.BuildConfig;
import com.bbva.sl.ar.android.secsdk.fido.FidoNetworkManager;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: EtherModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nEtherModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EtherModule.kt\ncom/bbva/glomohybrid/provider/modules/EtherModuleKt$etherModule$1$3\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,32:1\n129#2,5:33\n*S KotlinDebug\n*F\n+ 1 EtherModule.kt\ncom/bbva/glomohybrid/provider/modules/EtherModuleKt$etherModule$1$3\n*L\n25#1:33,5\n*E\n"})
public final class j0 extends Lambda implements Function2<Scope, ParametersHolder, NaturalAuthentication> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final j0 f34301p0 = new j0(2);

    @Override // kotlin.jvm.functions.Function2
    public final NaturalAuthentication invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new NaturalAuthentication(new NaturalAuthenticationConfig((FidoNetworkManager) single.get(Reflection.getOrCreateKotlinClass(FidoNetworkManager.class), null, null), BuildConfig.COUNTRY_CODE, 30));
    }
}
