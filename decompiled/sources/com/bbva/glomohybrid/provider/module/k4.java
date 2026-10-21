package com.bbva.glomohybrid.provider.module;

import com.bbva.component.dm.biometriclogin.data.repository.datasource.BiometricDatasource;
import com.bbva.component.dm.biometriclogin.data.repository.datasource.FidoFeatureFlagDataSource;
import com.bbva.component.dm.biometriclogin.domain.usecase.GetIsBiometricAccessEnabledUseCase;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: LoginModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nLoginModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginModule.kt\ncom/bbva/glomohybrid/provider/module/LoginModuleKt$loginModule$1$3\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,58:1\n154#2,5:59\n129#2,5:64\n*S KotlinDebug\n*F\n+ 1 LoginModule.kt\ncom/bbva/glomohybrid/provider/module/LoginModuleKt$loginModule$1$3\n*L\n32#1:59,5\n32#1:64,5\n*E\n"})
public final class k4 extends Lambda implements Function2<Scope, ParametersHolder, GetIsBiometricAccessEnabledUseCase> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final k4 f34095p0 = new k4(2);

    @Override // kotlin.jvm.functions.Function2
    public final GetIsBiometricAccessEnabledUseCase invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope factory = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        return new GetIsBiometricAccessEnabledUseCase((BiometricDatasource) factory.getOrNull(Reflection.getOrCreateKotlinClass(BiometricDatasource.class), null, null), (FidoFeatureFlagDataSource) factory.get(Reflection.getOrCreateKotlinClass(FidoFeatureFlagDataSource.class), null, null));
    }
}
