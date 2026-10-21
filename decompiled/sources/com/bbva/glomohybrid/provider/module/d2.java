package com.bbva.glomohybrid.provider.module;

import com.bbva.component.dm.customer.CustomerDataManager;
import com.bbva.glomo.user.domain.model.UserType;
import com.bbva.glomoconfig.login.configurator.CustomerDataManagerPropertiesDefault;
import com.bbva.network.NetworkWorker;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: ComponentModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nComponentModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComponentModule.kt\ncom/bbva/glomohybrid/provider/module/ComponentModuleKt$componentModule$1$1\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,42:1\n129#2,5:43\n129#2,5:48\n*S KotlinDebug\n*F\n+ 1 ComponentModule.kt\ncom/bbva/glomohybrid/provider/module/ComponentModuleKt$componentModule$1$1\n*L\n15#1:43,5\n16#1:48,5\n*E\n"})
public final class d2 extends Lambda implements Function2<Scope, ParametersHolder, CustomerDataManager> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final d2 f34030p0 = new d2(2);

    @Override // kotlin.jvm.functions.Function2
    public final CustomerDataManager invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope factory = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        CustomerDataManager customerDataManager = new CustomerDataManager((NetworkWorker) factory.get(Reflection.getOrCreateKotlinClass(NetworkWorker.class), null, null));
        customerDataManager.setProperties(((CustomerDataManagerPropertiesDefault) factory.get(Reflection.getOrCreateKotlinClass(CustomerDataManagerPropertiesDefault.class), null, null)).config(UserType.PERSONAL));
        return customerDataManager;
    }
}
