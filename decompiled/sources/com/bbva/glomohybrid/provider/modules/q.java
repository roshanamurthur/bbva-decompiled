package com.bbva.glomohybrid.provider.modules;

import com.bbva.glomohybrid.featureflags.repository.FeatureFlagsRepository;
import com.bbva.glomohybrid.login.data.repository.CountryFidoFeatureFlagDataSource;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: CountryPresentationModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nCountryPresentationModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryPresentationModule.kt\ncom/bbva/glomohybrid/provider/modules/CountryPresentationModuleKt$countryPresentationModule$1$10\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,110:1\n129#2,5:111\n*S KotlinDebug\n*F\n+ 1 CountryPresentationModule.kt\ncom/bbva/glomohybrid/provider/modules/CountryPresentationModuleKt$countryPresentationModule$1$10\n*L\n96#1:111,5\n*E\n"})
public final class q extends Lambda implements Function2<Scope, ParametersHolder, CountryFidoFeatureFlagDataSource> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final q f34328p0 = new q(2);

    @Override // kotlin.jvm.functions.Function2
    public final CountryFidoFeatureFlagDataSource invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope factory = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        return new CountryFidoFeatureFlagDataSource((FeatureFlagsRepository) factory.get(Reflection.getOrCreateKotlinClass(FeatureFlagsRepository.class), null, null));
    }
}
