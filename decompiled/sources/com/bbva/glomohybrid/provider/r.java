package com.bbva.glomohybrid.provider;

import android.content.Context;
import com.bbva.component.root.checker.RootCheckerComponent;
import com.bbva.glomoconfig.factory.ViewComponentFactory;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: AppDependenciesProvider.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nAppDependenciesProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppDependenciesProvider.kt\ncom/bbva/glomohybrid/provider/AppDependenciesProvider$appModule$1$3\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,238:1\n129#2,5:239\n*S KotlinDebug\n*F\n+ 1 AppDependenciesProvider.kt\ncom/bbva/glomohybrid/provider/AppDependenciesProvider$appModule$1$3\n*L\n129#1:239,5\n*E\n"})
public final class r extends Lambda implements Function2<Scope, ParametersHolder, RootCheckerComponent> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final r f34371p0 = new r(2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final RootCheckerComponent invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        RootCheckerComponent rootCheckerComponent = new RootCheckerComponent((Context) single.get(Reflection.getOrCreateKotlinClass(Context.class), null, null), null, 2, 0 == true ? 1 : 0);
        rootCheckerComponent.setProperties(ViewComponentFactory.INSTANCE.rootChecker());
        return rootCheckerComponent;
    }
}
