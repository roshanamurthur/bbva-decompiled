package com.bbva.glomohybrid.provider.module;

import com.bbva.glomoconfig.GlobalConfig;
import com.bbva.glomoconfig.login.configurator.CustomerDataManagerPropertiesDefault;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: ComponentModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nComponentModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComponentModule.kt\ncom/bbva/glomohybrid/provider/module/ComponentModuleKt$componentModule$1$2\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,42:1\n129#2,5:43\n*S KotlinDebug\n*F\n+ 1 ComponentModule.kt\ncom/bbva/glomohybrid/provider/module/ComponentModuleKt$componentModule$1$2\n*L\n22#1:43,5\n*E\n"})
public final class e2 extends Lambda implements Function2<Scope, ParametersHolder, CustomerDataManagerPropertiesDefault> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final e2 f34039p0 = new e2(2);

    @Override // kotlin.jvm.functions.Function2
    public final CustomerDataManagerPropertiesDefault invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope factory = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        return new CustomerDataManagerPropertiesDefault((GlobalConfig) factory.get(Reflection.getOrCreateKotlinClass(GlobalConfig.class), null, null));
    }
}
