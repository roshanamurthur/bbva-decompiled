package com.bbva.glomohybrid.provider.module;

import com.bbva.cellscore.app.ComponentManager;
import com.bbva.component.ui.biometrics.BiometricsComponent;
import com.bbva.glomoconfig.factory.ViewComponentFactory;
import com.bbva.glomohybrid.base.handler.BiometricsIntentHandler;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: PresentationModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nPresentationModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PresentationModule.kt\ncom/bbva/glomohybrid/provider/module/PresentationModuleKt$presentationModule$1$16\n+ 2 ParametersHolder.kt\norg/koin/core/parameter/ParametersHolder\n*L\n1#1,251:1\n44#2:252\n*S KotlinDebug\n*F\n+ 1 PresentationModule.kt\ncom/bbva/glomohybrid/provider/module/PresentationModuleKt$presentationModule$1$16\n*L\n156#1:252\n*E\n"})
public final class h6 extends Lambda implements Function2<Scope, ParametersHolder, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final h6 f34070p0 = new h6(2);

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope scope2 = scope;
        ParametersHolder parametersHolder2 = parametersHolder;
        Map map = (Map) parametersHolder2.elementAt(0, androidx.activity.a.f(scope2, "$this$factory", parametersHolder2, "<name for destructuring parameter 0>", Map.class));
        BiometricsComponent biometricsComponent = new BiometricsComponent(ModuleExtKt.androidApplication(scope2), BiometricsIntentHandler.ID);
        biometricsComponent.setProperties(ViewComponentFactory.INSTANCE.loaderSpinner());
        ComponentManager.addComponentToPage(PresentationModuleKt.activityHashCode(map), BiometricsIntentHandler.ID, biometricsComponent);
        return Unit.INSTANCE;
    }
}
