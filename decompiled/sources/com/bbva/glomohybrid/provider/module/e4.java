package com.bbva.glomohybrid.provider.module;

import com.bbva.component_devicemanager.data.datasource.ActiveServicesDataSource;
import com.bbva.component_devicemanager.data.datasource.BlackBoxDataSource;
import com.bbva.component_devicemanager.data.repository.DeviceManagerDataRepository;
import com.bbva.component_devicemanager.domain.model.DeviceManagerDataSource;
import com.bbva.glomohybrid.BuildConfig;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: LoginModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nLoginModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginModule.kt\ncom/bbva/glomohybrid/provider/module/LoginModuleKt$loginModule$1$11\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,58:1\n129#2,5:59\n129#2,5:64\n129#2,5:69\n*S KotlinDebug\n*F\n+ 1 LoginModule.kt\ncom/bbva/glomohybrid/provider/module/LoginModuleKt$loginModule$1$11\n*L\n44#1:59,5\n46#1:64,5\n47#1:69,5\n*E\n"})
public final class e4 extends Lambda implements Function2<Scope, ParametersHolder, DeviceManagerDataRepository> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final e4 f34041p0 = new e4(2);

    @Override // kotlin.jvm.functions.Function2
    public final DeviceManagerDataRepository invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope factory = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        return new DeviceManagerDataRepository((DeviceManagerDataSource) factory.get(Reflection.getOrCreateKotlinClass(DeviceManagerDataSource.class), null, null), BuildConfig.COUNTRY_CODE, (ActiveServicesDataSource) factory.get(Reflection.getOrCreateKotlinClass(ActiveServicesDataSource.class), null, null), (BlackBoxDataSource) factory.get(Reflection.getOrCreateKotlinClass(BlackBoxDataSource.class), null, null));
    }
}
