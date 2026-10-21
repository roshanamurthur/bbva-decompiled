package com.bbva.glomohybrid.provider.module;

import com.bbva.bridge.dispatcher.MessageDispatcher;
import com.bbva.cellscore.app.ComponentManager;
import com.bbva.component.dm.analytics.AnalyticsManager;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: AnalyticsModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nAnalyticsModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnalyticsModule.kt\ncom/bbva/glomohybrid/provider/module/AnalyticsModuleKt$analyticsModule$1$3\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,64:1\n129#2,5:65\n*S KotlinDebug\n*F\n+ 1 AnalyticsModule.kt\ncom/bbva/glomohybrid/provider/module/AnalyticsModuleKt$analyticsModule$1$3\n*L\n47#1:65,5\n*E\n"})
public final class g extends Lambda implements Function2<Scope, ParametersHolder, AnalyticsManager> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final g f34054p0 = new g(2);

    @Override // kotlin.jvm.functions.Function2
    public final AnalyticsManager invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        AnalyticsManager analyticsManager = new AnalyticsManager((MessageDispatcher) single.get(Reflection.getOrCreateKotlinClass(MessageDispatcher.class), null, null));
        ComponentManager.add(AnalyticsManager.ID, analyticsManager);
        analyticsManager.setDebugMode(false);
        return analyticsManager;
    }
}
