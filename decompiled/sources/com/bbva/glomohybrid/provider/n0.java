package com.bbva.glomohybrid.provider;

import com.bbva.component.dm.singlesignon.SingleSignOnDataManager;
import com.bbva.component.dm.singlesignon.data.model.SingleSignOnResponse;
import com.bbva.component.dm.singlesignon.mapper.SSOContentDefaultMapper;
import com.bbva.component.dm.singlesignon.model.SSOConfiguration;
import com.bbva.glomohybrid.provider.module.ConfigModuleKt;
import com.bbva.network.NetworkWorker;
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
@SourceDebugExtension({"SMAP\nCountryDependenciesProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryDependenciesProvider.kt\ncom/bbva/glomohybrid/provider/CountryDependenciesProvider$countryModule$1$9\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,355:1\n129#2,5:356\n129#2,5:361\n129#2,5:366\n*S KotlinDebug\n*F\n+ 1 CountryDependenciesProvider.kt\ncom/bbva/glomohybrid/provider/CountryDependenciesProvider$countryModule$1$9\n*L\n204#1:356,5\n207#1:361,5\n208#1:366,5\n*E\n"})
public final class n0 extends Lambda implements Function2<Scope, ParametersHolder, SingleSignOnDataManager<SingleSignOnResponse>> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final n0 f34365p0 = new n0(2);

    @Override // kotlin.jvm.functions.Function2
    public final SingleSignOnDataManager<SingleSignOnResponse> invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        SingleSignOnDataManager<SingleSignOnResponse> singleSignOnDataManager = new SingleSignOnDataManager<>((NetworkWorker) single.get(Reflection.getOrCreateKotlinClass(NetworkWorker.class), null, null), new SSOContentDefaultMapper());
        singleSignOnDataManager.updateModel(new SSOConfiguration((String) single.get(Reflection.getOrCreateKotlinClass(String.class), QualifierKt.named(ConfigModuleKt.SINGLE_SIGN_ON_HOST), null), (String) single.get(Reflection.getOrCreateKotlinClass(String.class), QualifierKt.named(ConfigModuleKt.SINGLE_SIGN_ON_PATH), null)));
        return singleSignOnDataManager;
    }
}
