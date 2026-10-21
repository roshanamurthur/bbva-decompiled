package com.bbva.glomohybrid.provider;

import com.bbva.glomoconfig.constants.ConfigConstantsKt;
import com.bbva.glomoconfig.login.configurator.Configurator;
import com.bbva.glomoconfig.login.configurator.GlobalConfigurator;
import com.bbva.glomoconfig.login.configurator.GlobalSSOConfigurator;
import com.bbva.glomohybrid.provider.module.ConfigModuleKt;
import java.util.Map;
import kotlin.TuplesKt;
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
@SourceDebugExtension({"SMAP\nCountryDependenciesProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryDependenciesProvider.kt\ncom/bbva/glomohybrid/provider/CountryDependenciesProvider$countryModule$1$8\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,355:1\n129#2,5:356\n129#2,5:361\n*S KotlinDebug\n*F\n+ 1 CountryDependenciesProvider.kt\ncom/bbva/glomohybrid/provider/CountryDependenciesProvider$countryModule$1$8\n*L\n192#1:356,5\n194#1:361,5\n*E\n"})
public final class m0 extends Lambda implements Function2<Scope, ParametersHolder, Map<String, ? extends Configurator>> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final m0 f33934p0 = new m0(2);

    @Override // kotlin.jvm.functions.Function2
    public final Map<String, ? extends Configurator> invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        GlobalConfigurator globalConfigurator = new GlobalConfigurator((String) single.get(Reflection.getOrCreateKotlinClass(String.class), QualifierKt.named(ConfigModuleKt.HOST), null), (String) bk.q.getValue((Map) single.get(Reflection.getOrCreateKotlinClass(Map.class), QualifierKt.named(ConfigModuleKt.PATHS), null), "login"), ConfigConstantsKt.GLOMO_CONSUMER_ID_ANONYMOUS);
        return bk.q.mapOf(TuplesKt.to(GlobalSSOConfigurator.ID, new GlobalSSOConfigurator(globalConfigurator)), TuplesKt.to(GlobalConfigurator.ID, globalConfigurator));
    }
}
