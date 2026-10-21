package com.bbva.glomohybrid.provider.module;

import com.bbva.glomohybrid.base.usecase.AbstractUpdateBioCatchUseCase;
import com.bbva.glomohybrid.base.viewmodel.ViewModelComponentsProviders;
import com.bbva.glomohybrid.landing.domain.usecase.ConfigureWebViewProfileUseCase;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: LandingModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nLandingModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingModule.kt\ncom/bbva/glomohybrid/provider/module/LandingModuleKt$landingModule$1$4\n+ 2 ParametersHolder.kt\norg/koin/core/parameter/ParametersHolder\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,214:1\n44#2:215\n154#3,5:216\n*S KotlinDebug\n*F\n+ 1 LandingModule.kt\ncom/bbva/glomohybrid/provider/module/LandingModuleKt$landingModule$1$4\n*L\n84#1:215\n87#1:216,5\n*E\n"})
public final class u3 extends Lambda implements Function2<Scope, ParametersHolder, ConfigureWebViewProfileUseCase> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final u3 f34178p0 = new u3(2);

    @Override // kotlin.jvm.functions.Function2
    public final ConfigureWebViewProfileUseCase invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope scope2 = scope;
        ParametersHolder parametersHolder2 = parametersHolder;
        return new ConfigureWebViewProfileUseCase((ViewModelComponentsProviders) parametersHolder2.elementAt(0, androidx.activity.a.f(scope2, "$this$factory", parametersHolder2, "<name for destructuring parameter 0>", ViewModelComponentsProviders.class)), (AbstractUpdateBioCatchUseCase) scope2.getOrNull(Reflection.getOrCreateKotlinClass(AbstractUpdateBioCatchUseCase.class), null, null));
    }
}
