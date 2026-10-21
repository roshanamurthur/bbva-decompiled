package com.bbva.glomohybrid.provider.module;

import android.os.Build;
import com.bbva.glomohybrid.BuildConfig;
import com.bbva.glomohybrid.base.viewmodel.ViewModelComponentsProviders;
import com.bbva.glomohybrid.landing.domain.usecase.FetchLandingAccessStateUseCase;
import com.bbva.glomohybrid.landing.domain.usecase.ScheduledShutdownCheckerUseCase;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: LandingModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nLandingModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingModule.kt\ncom/bbva/glomohybrid/provider/module/LandingModuleKt$landingModule$1$9\n+ 2 ParametersHolder.kt\norg/koin/core/parameter/ParametersHolder\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,214:1\n44#2:215\n154#3,5:216\n*S KotlinDebug\n*F\n+ 1 LandingModule.kt\ncom/bbva/glomohybrid/provider/module/LandingModuleKt$landingModule$1$9\n*L\n96#1:215\n100#1:216,5\n*E\n"})
public final class z3 extends Lambda implements Function2<Scope, ParametersHolder, FetchLandingAccessStateUseCase> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final z3 f34218p0 = new z3(2);

    @Override // kotlin.jvm.functions.Function2
    public final FetchLandingAccessStateUseCase invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope scope2 = scope;
        ParametersHolder parametersHolder2 = parametersHolder;
        return new FetchLandingAccessStateUseCase(BuildConfig.VERSION_CODE, Build.VERSION.SDK_INT, (ScheduledShutdownCheckerUseCase) scope2.getOrNull(Reflection.getOrCreateKotlinClass(ScheduledShutdownCheckerUseCase.class), null, null), (ViewModelComponentsProviders) parametersHolder2.elementAt(0, androidx.activity.a.f(scope2, "$this$factory", parametersHolder2, "<name for destructuring parameter 0>", ViewModelComponentsProviders.class)));
    }
}
