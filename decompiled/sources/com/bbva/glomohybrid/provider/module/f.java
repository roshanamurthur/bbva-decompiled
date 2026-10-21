package com.bbva.glomohybrid.provider.module;

import com.bbva.component.dm.analytics.AnalyticsAppLifecycle;
import com.bbva.component.dm.analytics.usecase.CleanCookiesUseCase;
import com.bbva.component.dm.analytics.usecase.RegexCookieCriteria;
import com.bbva.glomoconfig.CookiesConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: AnalyticsModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nAnalyticsModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnalyticsModule.kt\ncom/bbva/glomohybrid/provider/module/AnalyticsModuleKt$analyticsModule$1$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,64:1\n1549#2:65\n1620#2,3:66\n129#3,5:69\n*S KotlinDebug\n*F\n+ 1 AnalyticsModule.kt\ncom/bbva/glomohybrid/provider/module/AnalyticsModuleKt$analyticsModule$1$2\n*L\n36#1:65\n36#1:66,3\n42#1:69,5\n*E\n"})
public final class f extends Lambda implements Function2<Scope, ParametersHolder, AnalyticsAppLifecycle> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final f f34045p0 = new f(2);

    @Override // kotlin.jvm.functions.Function2
    public final AnalyticsAppLifecycle invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope factory = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        List<String> cookies_to_delete = CookiesConstants.INSTANCE.getCOOKIES_TO_DELETE();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(cookies_to_delete, 10));
        Iterator<T> it2 = cookies_to_delete.iterator();
        while (it2.hasNext()) {
            arrayList.add(new RegexCookieCriteria(new Regex((String) it2.next())));
        }
        return new AnalyticsAppLifecycle(CookiesConstants.INSTANCE.getSESSION_EXPIRATION(), null, (CleanCookiesUseCase) factory.get(Reflection.getOrCreateKotlinClass(CleanCookiesUseCase.class), null, null), arrayList, 2, null);
    }
}
