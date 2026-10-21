package com.bbva.glomohybrid.provider;

import com.bbva.glomoconfig.constants.ConfigConstantsKt;
import com.bbva.glomoconfig.login.configurator.Configurator;
import com.bbva.glomoconfig.login.configurator.GlobalConfigurator;
import com.bbva.glomoconfig.login.configurator.SsoConfigurator;
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
@SourceDebugExtension({"SMAP\nCountryDependenciesProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryDependenciesProvider.kt\ncom/bbva/glomohybrid/provider/CountryDependenciesProvider$countryModule$1$7\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,355:1\n129#2,5:356\n129#2,5:361\n*S KotlinDebug\n*F\n+ 1 CountryDependenciesProvider.kt\ncom/bbva/glomohybrid/provider/CountryDependenciesProvider$countryModule$1$7\n*L\n182#1:356,5\n183#1:361,5\n*E\n"})
public final class l0 extends Lambda implements Function2<Scope, ParametersHolder, Map<String, ? extends Configurator>> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final l0 f33932p0 = new l0(2);

    @Override // kotlin.jvm.functions.Function2
    public final Map<String, ? extends Configurator> invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        GlobalConfigurator globalConfigurator = new GlobalConfigurator((String) single.get(Reflection.getOrCreateKotlinClass(String.class), QualifierKt.named(ConfigModuleKt.GEMA_HOST), null), (String) single.get(Reflection.getOrCreateKotlinClass(String.class), QualifierKt.named(ConfigModuleKt.GEMA_PATH), null), ConfigConstantsKt.GLOMO_CONSUMER_ID_ANONYMOUS);
        return bk.q.mapOf(TuplesKt.to(SsoConfigurator.ID, new SsoConfigurator(globalConfigurator)), TuplesKt.to(GlobalConfigurator.ID, globalConfigurator));
    }
}
