package com.bbva.glomohybrid.base.session;

import com.bbva.cellscore.app.ComponentManager;
import com.bbva.cellscore.web.WebController;
import com.bbva.glomohybrid.base.webview.WebActions;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: SessionModule.kt */
/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nSessionModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SessionModule.kt\ncom/bbva/glomohybrid/base/session/SessionModuleKt$sessionModule$1$2\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,18:1\n129#2,5:19\n*S KotlinDebug\n*F\n+ 1 SessionModule.kt\ncom/bbva/glomohybrid/base/session/SessionModuleKt$sessionModule$1$2\n*L\n13#1:19,5\n*E\n"})
public final class b extends Lambda implements Function2<Scope, ParametersHolder, AuthTokenDispatcher> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final b f31544p0 = new b(2);

    @Override // kotlin.jvm.functions.Function2
    public final AuthTokenDispatcher invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        Session session = (Session) single.get(Reflection.getOrCreateKotlinClass(Session.class), null, null);
        Object obj = ComponentManager.get(WebActions.ID);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        AuthTokenDispatcher authTokenDispatcher = new AuthTokenDispatcher(session, (WebController) obj);
        ComponentManager.add(AuthTokenDispatcher.ID, authTokenDispatcher);
        return authTokenDispatcher;
    }
}
