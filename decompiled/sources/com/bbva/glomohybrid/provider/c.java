package com.bbva.glomohybrid.provider;

import com.bbva.bridge.dispatcher.MessageDispatcher;
import com.bbva.bridge.dispatcher.WebMessageDispatcher;
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
public final class c extends Lambda implements Function2<Scope, ParametersHolder, MessageDispatcher> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final c f33910p0 = new c(2);

    @Override // kotlin.jvm.functions.Function2
    public final MessageDispatcher invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        Object obj = ComponentManager.get(WebActions.ID);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        WebMessageDispatcher webMessageDispatcher = new WebMessageDispatcher((WebController) obj);
        ComponentManager.add("web-dispatcher", webMessageDispatcher);
        return webMessageDispatcher;
    }
}
