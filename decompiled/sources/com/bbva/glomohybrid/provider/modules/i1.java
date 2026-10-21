package com.bbva.glomohybrid.provider.modules;

import android.content.SharedPreferences;
import com.bbva.component.dm.biometriclogin.data.repository.datasource.FidoSettingsAdapter;
import com.bbva.component.dm.biometriclogin.domain.handler.BiometricMigratorHandler;
import com.bbva.glomo.storage.MainStorage;
import com.bbva.glomohybrid.biometric.migration.FidoLocalStorageMigrator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: NaturalAuthModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nNaturalAuthModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NaturalAuthModule.kt\ncom/bbva/glomohybrid/provider/modules/NaturalAuthModuleKt$biometricAuthenticationModule$1$3\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,98:1\n129#2,5:99\n*S KotlinDebug\n*F\n+ 1 NaturalAuthModule.kt\ncom/bbva/glomohybrid/provider/modules/NaturalAuthModuleKt$biometricAuthenticationModule$1$3\n*L\n85#1:99,5\n*E\n"})
public final class i1 extends Lambda implements Function2<Scope, ParametersHolder, BiometricMigratorHandler> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final i1 f34298p0 = new i1(2);

    @Override // kotlin.jvm.functions.Function2
    public final BiometricMigratorHandler invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new FidoLocalStorageMigrator((SharedPreferences) single.get(Reflection.getOrCreateKotlinClass(SharedPreferences.class), null, null), (FidoSettingsAdapter) single.get(Reflection.getOrCreateKotlinClass(FidoSettingsAdapter.class), null, null), (MainStorage) single.get(Reflection.getOrCreateKotlinClass(MainStorage.class), null, null));
    }
}
