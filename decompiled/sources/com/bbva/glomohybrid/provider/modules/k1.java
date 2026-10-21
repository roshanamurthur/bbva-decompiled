package com.bbva.glomohybrid.provider.modules;

import com.bbva.component.dm.biometriclogin.domain.provider.BiometricsAdapter;
import com.bbva.component.dm.biometriclogin.domain.provider.DefaultBiometricsAdapter;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: NaturalAuthModule.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class k1 extends Lambda implements Function2<Scope, ParametersHolder, BiometricsAdapter> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final k1 f34306p0 = new k1(2);

    @Override // kotlin.jvm.functions.Function2
    public final BiometricsAdapter invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new DefaultBiometricsAdapter(ModuleExtKt.androidContext(single));
    }
}
