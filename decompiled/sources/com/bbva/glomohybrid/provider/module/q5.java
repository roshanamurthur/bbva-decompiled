package com.bbva.glomohybrid.provider.module;

import android.app.Activity;
import com.bbva.cellscore.app.ComponentManager;
import com.bbva.cellscore.web.WebController;
import com.bbva.glomohybrid.base.router.ActivityRouter;
import com.bbva.glomohybrid.base.router.DefaultActivityRouter;
import com.bbva.glomohybrid.base.webview.WebActions;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: PresentationModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nPresentationModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PresentationModule.kt\ncom/bbva/glomohybrid/provider/module/PresentationModuleKt$menuModule$1$8$1\n+ 2 ParametersHolder.kt\norg/koin/core/parameter/ParametersHolder\n*L\n1#1,251:1\n44#2:252\n*S KotlinDebug\n*F\n+ 1 PresentationModule.kt\ncom/bbva/glomohybrid/provider/module/PresentationModuleKt$menuModule$1$8$1\n*L\n205#1:252\n*E\n"})
public final class q5 extends Lambda implements Function2<Scope, ParametersHolder, ActivityRouter> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final q5 f34147p0 = new q5(2);

    @Override // kotlin.jvm.functions.Function2
    public final ActivityRouter invoke(Scope scope, ParametersHolder parametersHolder) {
        ParametersHolder parametersHolder2 = parametersHolder;
        Activity activity = (Activity) parametersHolder2.elementAt(0, androidx.activity.a.f(scope, "$this$scoped", parametersHolder2, "<name for destructuring parameter 0>", Activity.class));
        Object obj = ComponentManager.get(WebActions.ID);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        return new DefaultActivityRouter(activity, null, (WebController) obj, 2, null);
    }
}
