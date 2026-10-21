package com.bbva.glomohybrid.provider;

import com.bbva.glomoconfig.constants.ConfigConstantsKt;
import com.bbva.glomoconfig.login.configurator.CountryPersonalAuthConfiguration;
import com.bbva.glomoconfig.login.type.LoginType;
import com.bbva.glomohybrid.featureflags.repository.FeatureFlagsRepository;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: CountryDependenciesProvider.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nCountryDependenciesProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryDependenciesProvider.kt\ncom/bbva/glomohybrid/provider/CountryDependenciesProvider$countryModule$1$5\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,355:1\n129#2,5:356\n129#2,5:361\n*S KotlinDebug\n*F\n+ 1 CountryDependenciesProvider.kt\ncom/bbva/glomohybrid/provider/CountryDependenciesProvider$countryModule$1$5\n*L\n171#1:356,5\n172#1:361,5\n*E\n"})
public final class j0 extends Lambda implements Function2<Scope, ParametersHolder, CountryPersonalAuthConfiguration> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final j0 f33928p0 = new j0(2);

    @Override // kotlin.jvm.functions.Function2
    public final CountryPersonalAuthConfiguration invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new CountryPersonalAuthConfiguration(LoginType.GLOBAL, (Map) single.get(Reflection.getOrCreateKotlinClass(Map.class), QualifierKt.named(ConfigConstantsKt.GLOBAL_CONFIGURATORS), null), (FeatureFlagsRepository) single.get(Reflection.getOrCreateKotlinClass(FeatureFlagsRepository.class), null, null));
    }
}
