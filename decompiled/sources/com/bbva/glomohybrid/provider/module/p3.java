package com.bbva.glomohybrid.provider.module;

import com.bbva.glomo.user.domain.model.RememberedUser;
import com.bbva.glomohybrid.landing.domain.usecase.FetchLandingSectionsDataUseCase;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: LandingModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nLandingModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingModule.kt\ncom/bbva/glomohybrid/provider/module/LandingModuleKt$landingModule$1$11\n+ 2 ParametersHolder.kt\norg/koin/core/parameter/ParametersHolder\n*L\n1#1,214:1\n44#2:215\n*S KotlinDebug\n*F\n+ 1 LandingModule.kt\ncom/bbva/glomohybrid/provider/module/LandingModuleKt$landingModule$1$11\n*L\n105#1:215\n*E\n"})
public final class p3 extends Lambda implements Function2<Scope, ParametersHolder, FetchLandingSectionsDataUseCase> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final p3 f34137p0 = new p3(2);

    @Override // kotlin.jvm.functions.Function2
    public final FetchLandingSectionsDataUseCase invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope scope2 = scope;
        ParametersHolder parametersHolder2 = parametersHolder;
        return LandingModuleKt.access$createFetchLandingSectionsUseCase(scope2, (RememberedUser) parametersHolder2.elementAt(0, androidx.activity.a.f(scope2, "$this$factory", parametersHolder2, "<name for destructuring parameter 0>", RememberedUser.class)));
    }
}
