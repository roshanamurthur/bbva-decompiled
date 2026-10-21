package com.bbva.glomohybrid.provider.modules;

import com.bbva.component.dm.biometriclogin.data.repository.datasource.FidoSettingsAdapter;
import com.bbva.glomohybrid.biometric.v0.FidoLocalStorageAdapterV0;
import com.bbva.glomohybrid.biometric.v1.FidoLocalStorageAdapterV1;
import com.bbva.localstorage.storage.Storage;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: NaturalAuthModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nNaturalAuthModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NaturalAuthModule.kt\ncom/bbva/glomohybrid/provider/modules/NaturalAuthModuleKt$biometricAuthenticationModule$1$2\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,98:1\n129#2,5:99\n*S KotlinDebug\n*F\n+ 1 NaturalAuthModule.kt\ncom/bbva/glomohybrid/provider/modules/NaturalAuthModuleKt$biometricAuthenticationModule$1$2\n*L\n80#1:99,5\n*E\n"})
public final class h1 extends Lambda implements Function2<Scope, ParametersHolder, FidoSettingsAdapter> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final h1 f34294p0 = new h1(2);

    @Override // kotlin.jvm.functions.Function2
    public final FidoSettingsAdapter invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope scope2 = scope;
        Storage storage = (Storage) scope2.get(androidx.activity.a.f(scope2, "$this$single", parametersHolder, "it", Storage.class), null, null);
        return new FidoLocalStorageAdapterV1(storage, new FidoLocalStorageAdapterV0(storage));
    }
}
