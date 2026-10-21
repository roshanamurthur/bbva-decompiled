package com.bbva.glomohybrid.provider.modules;

import com.bbva.component.dm.analytics.AnalyticsManager;
import com.bbva.glomohybrid.analytics.AnalyticsClickInterceptor;
import com.bbva.slidemenuview.MenuItemMap;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: CountryPresentationModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nCountryPresentationModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryPresentationModule.kt\ncom/bbva/glomohybrid/provider/modules/CountryPresentationModuleKt$countryPresentationModule$1$4\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,110:1\n129#2,5:111\n*S KotlinDebug\n*F\n+ 1 CountryPresentationModule.kt\ncom/bbva/glomohybrid/provider/modules/CountryPresentationModuleKt$countryPresentationModule$1$4\n*L\n67#1:111,5\n*E\n"})
public final class y extends Lambda implements Function2<Scope, ParametersHolder, AnalyticsClickInterceptor> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final y f34358p0 = new y(2);

    @Override // kotlin.jvm.functions.Function2
    public final AnalyticsClickInterceptor invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope factory = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        return new AnalyticsClickInterceptor((AnalyticsManager) factory.get(Reflection.getOrCreateKotlinClass(AnalyticsManager.class), null, null), CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(MenuItemMap.Sustainability.getId()), Integer.valueOf(MenuItemMap.RewardsLanding.getId())}), null, 4, null);
    }
}
