package com.bbva.glomohybrid.provider.modules;

import com.bbva.component.dm.biometriclogin.proxy.NaturalAuthenticationClientProxy;
import com.bbva.component.dm.biometriclogin.proxy.PostInitConfiguration;
import com.bbva.ethermobilesdk.naturalauthentication.NaturalAuthentication;
import kotlin.Lazy;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: NaturalAuthModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nNaturalAuthModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NaturalAuthModule.kt\ncom/bbva/glomohybrid/provider/modules/NaturalAuthModuleKt$biometricAuthenticationModule$1$1\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,98:1\n129#2,5:99\n129#2,5:104\n129#2,5:109\n*S KotlinDebug\n*F\n+ 1 NaturalAuthModule.kt\ncom/bbva/glomohybrid/provider/modules/NaturalAuthModuleKt$biometricAuthenticationModule$1$1\n*L\n70#1:99,5\n72#1:104,5\n73#1:109,5\n*E\n"})
public final class g1 extends Lambda implements Function2<Scope, ParametersHolder, NaturalAuthenticationClientProxy> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final g1 f34290p0 = new g1(2);

    @Override // kotlin.jvm.functions.Function2
    public final NaturalAuthenticationClientProxy invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new NaturalAuthenticationClientProxy((NaturalAuthentication) single.get(Reflection.getOrCreateKotlinClass(NaturalAuthentication.class), null, null), new PostInitConfiguration((Lazy) single.get(Reflection.getOrCreateKotlinClass(Lazy.class), EtherModuleKt.getKOIN_EXTERNAL_DEVICE_ID_NAME(), null), (String) single.get(Reflection.getOrCreateKotlinClass(String.class), NaturalAuthModuleKt.getFACETS_URL(), null)), null, ModuleExtKt.androidContext(single), 4, null);
    }
}
