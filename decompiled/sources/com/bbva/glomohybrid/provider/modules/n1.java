package com.bbva.glomohybrid.provider.modules;

import com.bbva.component.dm.naturalauth.NaturalAuthDataManager;
import com.bbva.component.dm.naturalauth.domain.model.NaturalAuthEndpoints;
import com.bbva.component.dm.naturalauth.domain.model.ServiceType;
import com.bbva.component.dm.naturalauth.domain.model.Version;
import com.bbva.glomoconfig.constants.ConfigConstantsKt;
import com.bbva.network.NetworkWorker;
import com.bbva.sl.ar.android.secsdk.fido.FidoNetworkManager;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: NaturalAuthModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nNaturalAuthModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NaturalAuthModule.kt\ncom/bbva/glomohybrid/provider/modules/NaturalAuthModuleKt$naturalAuthModule$1$2\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,98:1\n129#2,5:99\n*S KotlinDebug\n*F\n+ 1 NaturalAuthModule.kt\ncom/bbva/glomohybrid/provider/modules/NaturalAuthModuleKt$naturalAuthModule$1$2\n*L\n42#1:99,5\n*E\n"})
public final class n1 extends Lambda implements Function2<Scope, ParametersHolder, FidoNetworkManager> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final n1 f34318p0 = new n1(2);

    @Override // kotlin.jvm.functions.Function2
    public final FidoNetworkManager invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new NaturalAuthDataManager(new ServiceType.AsoServiceType(null, Version.V1.INSTANCE, 1, null), (NetworkWorker) single.get(Reflection.getOrCreateKotlinClass(NetworkWorker.class), null, null), (NaturalAuthEndpoints) single.get(Reflection.getOrCreateKotlinClass(NaturalAuthEndpoints.class), null, null), ConfigConstantsKt.GLOMO_CONSUMER_ID, null, 16, null);
    }
}
