package com.bbva.glomohybrid.provider;

import com.bbva.component.dm.login.datamanager.LoginDataManager;
import com.bbva.glomoconfig.constants.ConfigConstantsKt;
import com.bbva.glomoconfig.login.configurator.CountryAuthConfiguration;
import com.bbva.glomoconfig.login.configurator.GlobalConfigurator;
import com.bbva.glomoconfig.login.type.LoginType;
import com.bbva.glomohybrid.featureflags.repository.FeatureFlagsRepository;
import com.bbva.glomohybrid.provider.module.ConfigModuleKt;
import com.bbva.network.NetworkWorker;
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
@SourceDebugExtension({"SMAP\nCountryDependenciesProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryDependenciesProvider.kt\ncom/bbva/glomohybrid/provider/CountryDependenciesProvider$countryModule$1$2\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,355:1\n129#2,5:356\n129#2,5:361\n129#2,5:366\n129#2,5:371\n*S KotlinDebug\n*F\n+ 1 CountryDependenciesProvider.kt\ncom/bbva/glomohybrid/provider/CountryDependenciesProvider$countryModule$1$2\n*L\n137#1:356,5\n138#1:361,5\n140#1:366,5\n147#1:371,5\n*E\n"})
public final class g0 extends Lambda implements Function2<Scope, ParametersHolder, LoginDataManager> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final g0 f33922p0 = new g0(2);

    @Override // kotlin.jvm.functions.Function2
    public final LoginDataManager invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        LoginDataManager loginDataManager = new LoginDataManager((NetworkWorker) single.get(Reflection.getOrCreateKotlinClass(NetworkWorker.class), null, null));
        Map map = (Map) single.get(Reflection.getOrCreateKotlinClass(Map.class), QualifierKt.named(ConfigModuleKt.PATHS), null);
        loginDataManager.setProperties(new CountryAuthConfiguration(LoginType.GLOBAL, bk.p.mapOf(TuplesKt.to(GlobalConfigurator.ID, new GlobalConfigurator((String) single.get(Reflection.getOrCreateKotlinClass(String.class), QualifierKt.named(ConfigModuleKt.HOST), null), (String) bk.q.getValue(map, "login"), ConfigConstantsKt.GLOMO_CONSUMER_ID_ANONYMOUS))), (FeatureFlagsRepository) single.get(Reflection.getOrCreateKotlinClass(FeatureFlagsRepository.class), null, null)).generateAuthConfig());
        return loginDataManager;
    }
}
