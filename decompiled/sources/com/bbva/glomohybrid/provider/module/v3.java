package com.bbva.glomohybrid.provider.module;

import com.bbva.glomohybrid.base.viewmodel.ViewModelComponentsProviders;
import com.bbva.glomohybrid.landing.domain.usecase.RemoveUserDataUseCase;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: LandingModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nLandingModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingModule.kt\ncom/bbva/glomohybrid/provider/module/LandingModuleKt$landingModule$1$5\n+ 2 ParametersHolder.kt\norg/koin/core/parameter/ParametersHolder\n*L\n1#1,214:1\n44#2:215\n*S KotlinDebug\n*F\n+ 1 LandingModule.kt\ncom/bbva/glomohybrid/provider/module/LandingModuleKt$landingModule$1$5\n*L\n90#1:215\n*E\n"})
public final class v3 extends Lambda implements Function2<Scope, ParametersHolder, RemoveUserDataUseCase> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final v3 f34186p0 = new v3(2);

    @Override // kotlin.jvm.functions.Function2
    public final RemoveUserDataUseCase invoke(Scope scope, ParametersHolder parametersHolder) {
        ParametersHolder parametersHolder2 = parametersHolder;
        return new RemoveUserDataUseCase((ViewModelComponentsProviders) parametersHolder2.elementAt(0, androidx.activity.a.f(scope, "$this$factory", parametersHolder2, "<name for destructuring parameter 0>", ViewModelComponentsProviders.class)), null, 2, null);
    }
}
