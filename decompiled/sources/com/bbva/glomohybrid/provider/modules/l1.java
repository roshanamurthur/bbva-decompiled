package com.bbva.glomohybrid.provider.modules;

import com.bbva.component.dm.biometriclogin.BiometricAuthenticationDataManager;
import com.bbva.component.dm.biometriclogin.data.repository.datasource.BiometricDatasource;
import com.bbva.component.dm.biometriclogin.data.repository.datasource.FidoFeatureFlagDataSource;
import com.bbva.component.dm.biometriclogin.domain.provider.BiometricsAdapter;
import com.bbva.component.dm.biometriclogin.proxy.NaturalAuthenticationClientProxy;
import com.bbva.component.dm.settings.domain.usecase.FetchQuickLoginConfigUseCase;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: NaturalAuthModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nNaturalAuthModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NaturalAuthModule.kt\ncom/bbva/glomohybrid/provider/modules/NaturalAuthModuleKt$biometricAuthenticationModule$1$6\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,98:1\n129#2,5:99\n154#2,5:104\n*S KotlinDebug\n*F\n+ 1 NaturalAuthModule.kt\ncom/bbva/glomohybrid/provider/modules/NaturalAuthModuleKt$biometricAuthenticationModule$1$6\n*L\n95#1:99,5\n95#1:104,5\n*E\n"})
public final class l1 extends Lambda implements Function2<Scope, ParametersHolder, BiometricAuthenticationDataManager> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final l1 f34310p0 = new l1(2);

    @Override // kotlin.jvm.functions.Function2
    public final BiometricAuthenticationDataManager invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new BiometricAuthenticationDataManager((NaturalAuthenticationClientProxy) single.get(Reflection.getOrCreateKotlinClass(NaturalAuthenticationClientProxy.class), null, null), (BiometricDatasource) single.get(Reflection.getOrCreateKotlinClass(BiometricDatasource.class), null, null), (BiometricsAdapter) single.get(Reflection.getOrCreateKotlinClass(BiometricsAdapter.class), null, null), (FetchQuickLoginConfigUseCase) single.getOrNull(Reflection.getOrCreateKotlinClass(FetchQuickLoginConfigUseCase.class), null, null), (FidoFeatureFlagDataSource) single.get(Reflection.getOrCreateKotlinClass(FidoFeatureFlagDataSource.class), null, null), null, 32, null);
    }
}
