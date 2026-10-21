package com.bbva.glomohybrid.provider.module;

import com.bbva.glomo.user.domain.model.RememberedUser;
import com.bbva.glomohybrid.landing.domain.usecase.FetchLandingHeaderDataUseCase;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: LandingModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nLandingModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingModule.kt\ncom/bbva/glomohybrid/provider/module/LandingModuleKt$landingModule$1$10\n+ 2 ParametersHolder.kt\norg/koin/core/parameter/ParametersHolder\n*L\n1#1,214:1\n44#2:215\n*S KotlinDebug\n*F\n+ 1 LandingModule.kt\ncom/bbva/glomohybrid/provider/module/LandingModuleKt$landingModule$1$10\n*L\n104#1:215\n*E\n"})
public final class o3 extends Lambda implements Function2<Scope, ParametersHolder, FetchLandingHeaderDataUseCase> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final o3 f34129p0 = new o3(2);

    @Override // kotlin.jvm.functions.Function2
    public final FetchLandingHeaderDataUseCase invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope scope2 = scope;
        ParametersHolder parametersHolder2 = parametersHolder;
        return LandingModuleKt.access$createFetchLandingHeaderUseCase(scope2, (RememberedUser) parametersHolder2.elementAt(0, androidx.activity.a.f(scope2, "$this$factory", parametersHolder2, "<name for destructuring parameter 0>", RememberedUser.class)));
    }
}
