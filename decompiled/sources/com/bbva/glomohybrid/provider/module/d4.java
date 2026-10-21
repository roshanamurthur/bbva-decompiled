package com.bbva.glomohybrid.provider.module;

import com.bbva.component_devicemanager.data.datasource.RegisterDeviceManagerDataSource;
import com.bbva.component_devicemanager.data.datasource.request.NetworkRequestBuilder;
import com.bbva.network.NetworkWorker;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: LoginModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nLoginModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginModule.kt\ncom/bbva/glomohybrid/provider/module/LoginModuleKt$loginModule$1$10\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,58:1\n129#2,5:59\n*S KotlinDebug\n*F\n+ 1 LoginModule.kt\ncom/bbva/glomohybrid/provider/module/LoginModuleKt$loginModule$1$10\n*L\n40#1:59,5\n*E\n"})
public final class d4 extends Lambda implements Function2<Scope, ParametersHolder, RegisterDeviceManagerDataSource> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final d4 f34032p0 = new d4(2);

    @Override // kotlin.jvm.functions.Function2
    public final RegisterDeviceManagerDataSource invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope factory = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        return new RegisterDeviceManagerDataSource((NetworkWorker) factory.get(Reflection.getOrCreateKotlinClass(NetworkWorker.class), null, null), (NetworkRequestBuilder) factory.get(Reflection.getOrCreateKotlinClass(NetworkRequestBuilder.class), null, null));
    }
}
