package com.bbva.glomohybrid.provider.module;

import com.bbva.bridge.dispatcher.MessageDispatcher;
import com.bbva.cellscore.app.ComponentManager;
import com.bbva.glomohybrid.interceptors.MenuItemClickInterceptor;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: PresentationModule.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class d6 extends Lambda implements Function2<Scope, ParametersHolder, MenuItemClickInterceptor> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final d6 f34034p0 = new d6(2);

    @Override // kotlin.jvm.functions.Function2
    public final MenuItemClickInterceptor invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope factory = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        return new MenuItemClickInterceptor((MessageDispatcher) ComponentManager.get("web-dispatcher"), null, 2, null);
    }
}
