package com.bbva.glomohybrid.provider.module;

import com.bbva.component_devicemanager.data.datasource.request.NetworkRequestBuilder;
import com.bbva.component_devicemanager.domain.model.DeviceManagerRequestConfig;
import com.bbva.glomo.user.repository.datasource.RememberedUserDataSource;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: LoginModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nLoginModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginModule.kt\ncom/bbva/glomohybrid/provider/module/LoginModuleKt$loginModule$1$8\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,58:1\n129#2,5:59\n*S KotlinDebug\n*F\n+ 1 LoginModule.kt\ncom/bbva/glomohybrid/provider/module/LoginModuleKt$loginModule$1$8\n*L\n38#1:59,5\n*E\n"})
public final class p4 extends Lambda implements Function2<Scope, ParametersHolder, NetworkRequestBuilder> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final p4 f34138p0 = new p4(2);

    @Override // kotlin.jvm.functions.Function2
    public final NetworkRequestBuilder invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new NetworkRequestBuilder((RememberedUserDataSource) single.get(Reflection.getOrCreateKotlinClass(RememberedUserDataSource.class), null, null), (DeviceManagerRequestConfig) single.get(Reflection.getOrCreateKotlinClass(DeviceManagerRequestConfig.class), null, null));
    }
}
