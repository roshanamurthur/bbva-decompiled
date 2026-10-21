package com.bbva.glomohybrid.provider;

import com.bbva.bridge.navigate.NavigateDispatcher;
import com.bbva.bridge.navigate.WebNavigateDispatcher;
import com.bbva.cellscore.app.ComponentManager;
import com.bbva.cellscore.web.WebController;
import com.bbva.glomohybrid.base.webview.WebActions;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: AppDependenciesProvider.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class d extends Lambda implements Function2<Scope, ParametersHolder, NavigateDispatcher> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final d f33912p0 = new d(2);

    @Override // kotlin.jvm.functions.Function2
    public final NavigateDispatcher invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        Object obj = ComponentManager.get(WebActions.ID);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        WebNavigateDispatcher webNavigateDispatcher = new WebNavigateDispatcher((WebController) obj, 0L, null, 6, null);
        ComponentManager.add("web-navigate-dispatcher", webNavigateDispatcher);
        return webNavigateDispatcher;
    }
}
