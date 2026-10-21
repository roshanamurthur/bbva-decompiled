package com.bbva.glomohybrid.provider.module;

import com.bbva.bridge.dispatcher.MessageDispatcher;
import com.bbva.cellscore.app.ComponentManager;
import com.bbva.glomohybrid.settings.WebAppSettingsObserver;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: AppSettingsModule.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class k extends Lambda implements Function2<Scope, ParametersHolder, WebAppSettingsObserver> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final k f34090p0 = new k(2);

    @Override // kotlin.jvm.functions.Function2
    public final WebAppSettingsObserver invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope factory = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        Object obj = ComponentManager.get("web-dispatcher");
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        return new WebAppSettingsObserver((MessageDispatcher) obj);
    }
}
