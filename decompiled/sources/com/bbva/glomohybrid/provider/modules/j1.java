package com.bbva.glomohybrid.provider.modules;

import com.bbva.component.dm.biometriclogin.data.repository.datasource.BiometricDatasource;
import com.bbva.component.dm.biometriclogin.data.repository.datasource.FidoSettingsAdapter;
import com.bbva.component.dm.biometriclogin.data.repository.datasource.impl.SessionBiometricsDataSource;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: NaturalAuthModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nNaturalAuthModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NaturalAuthModule.kt\ncom/bbva/glomohybrid/provider/modules/NaturalAuthModuleKt$biometricAuthenticationModule$1$4\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,98:1\n129#2,5:99\n*S KotlinDebug\n*F\n+ 1 NaturalAuthModule.kt\ncom/bbva/glomohybrid/provider/modules/NaturalAuthModuleKt$biometricAuthenticationModule$1$4\n*L\n89#1:99,5\n*E\n"})
public final class j1 extends Lambda implements Function2<Scope, ParametersHolder, BiometricDatasource> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final j1 f34302p0 = new j1(2);

    @Override // kotlin.jvm.functions.Function2
    public final BiometricDatasource invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new SessionBiometricsDataSource((FidoSettingsAdapter) single.get(Reflection.getOrCreateKotlinClass(FidoSettingsAdapter.class), null, null));
    }
}
