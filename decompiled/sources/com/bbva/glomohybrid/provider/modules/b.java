package com.bbva.glomohybrid.provider.modules;

import com.bbva.glomo.router.CountryRouterSplash;
import com.bbva.glomo.router.RouterSplash;
import com.bbva.glomo.user.domain.usecase.SuspendGetRememberedUserUseCase;
import com.bbva.glomohybrid.base.usecase.version.IsWebViewVersionValidUseCase;
import com.bbva.glomohybrid.base.usecase.version.LastVersionCheckerUseCase;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: CountryArchitectureModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nCountryArchitectureModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryArchitectureModule.kt\ncom/bbva/glomohybrid/provider/modules/CountryArchitectureModuleKt$countryRouterModule$1$1\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,85:1\n129#2,5:86\n*S KotlinDebug\n*F\n+ 1 CountryArchitectureModule.kt\ncom/bbva/glomohybrid/provider/modules/CountryArchitectureModuleKt$countryRouterModule$1$1\n*L\n74#1:86,5\n*E\n"})
public final class b extends Lambda implements Function2<Scope, ParametersHolder, RouterSplash> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final b f34266p0 = new b(2);

    @Override // kotlin.jvm.functions.Function2
    public final RouterSplash invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new CountryRouterSplash((IsWebViewVersionValidUseCase) single.get(Reflection.getOrCreateKotlinClass(IsWebViewVersionValidUseCase.class), null, null), (SuspendGetRememberedUserUseCase) single.get(Reflection.getOrCreateKotlinClass(SuspendGetRememberedUserUseCase.class), null, null), (LastVersionCheckerUseCase) single.get(Reflection.getOrCreateKotlinClass(LastVersionCheckerUseCase.class), null, null));
    }
}
