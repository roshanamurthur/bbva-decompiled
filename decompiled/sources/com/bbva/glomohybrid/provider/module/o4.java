package com.bbva.glomohybrid.provider.module;

import com.bbva.component_devicemanager.data.datasource.ActiveServicesDataSource;
import com.bbva.glomo.storage.MainStorage;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: LoginModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nLoginModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginModule.kt\ncom/bbva/glomohybrid/provider/module/LoginModuleKt$loginModule$1$7\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,58:1\n129#2,5:59\n*S KotlinDebug\n*F\n+ 1 LoginModule.kt\ncom/bbva/glomohybrid/provider/module/LoginModuleKt$loginModule$1$7\n*L\n37#1:59,5\n*E\n"})
public final class o4 extends Lambda implements Function2<Scope, ParametersHolder, ActiveServicesDataSource> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final o4 f34130p0 = new o4(2);

    @Override // kotlin.jvm.functions.Function2
    public final ActiveServicesDataSource invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new ActiveServicesDataSource((MainStorage) single.get(Reflection.getOrCreateKotlinClass(MainStorage.class), null, null));
    }
}
