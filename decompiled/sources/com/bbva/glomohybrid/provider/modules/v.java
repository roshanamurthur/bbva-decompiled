package com.bbva.glomohybrid.provider.modules;

import com.bbva.glomo.user.domain.usecase.GetRememberedUserUseCase;
import com.bbva.glomohybrid.base.behaviors.ChangeUserBehavior;
import com.bbva.glomohybrid.base.delegates.glomo.features.ActiveUserFeaturesDelegate;
import com.bbva.glomohybrid.behaviours.CountryChangeUserBehavior;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: CountryPresentationModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nCountryPresentationModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryPresentationModule.kt\ncom/bbva/glomohybrid/provider/modules/CountryPresentationModuleKt$countryPresentationModule$1$1\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,110:1\n129#2,5:111\n*S KotlinDebug\n*F\n+ 1 CountryPresentationModule.kt\ncom/bbva/glomohybrid/provider/modules/CountryPresentationModuleKt$countryPresentationModule$1$1\n*L\n46#1:111,5\n*E\n"})
public final class v extends Lambda implements Function2<Scope, ParametersHolder, ChangeUserBehavior> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final v f34349p0 = new v(2);

    @Override // kotlin.jvm.functions.Function2
    public final ChangeUserBehavior invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope factory = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        return new CountryChangeUserBehavior((ActiveUserFeaturesDelegate) factory.get(Reflection.getOrCreateKotlinClass(ActiveUserFeaturesDelegate.class), null, null), (GetRememberedUserUseCase) factory.get(Reflection.getOrCreateKotlinClass(GetRememberedUserUseCase.class), null, null), null, 4, null);
    }
}
