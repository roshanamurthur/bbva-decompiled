package com.bbva.glomohybrid.provider.modules;

import android.content.Context;
import com.bbva.glomohybrid.login.domain.formconfigurator.FormLoginConfigurator;
import com.bbva.glomohybrid.login.domain.model.CountryRememberedUserViewState;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: CountryPresentationModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nCountryPresentationModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryPresentationModule.kt\ncom/bbva/glomohybrid/provider/modules/CountryPresentationModuleKt$countryPresentationModule$1$7\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,110:1\n129#2,5:111\n*S KotlinDebug\n*F\n+ 1 CountryPresentationModule.kt\ncom/bbva/glomohybrid/provider/modules/CountryPresentationModuleKt$countryPresentationModule$1$7\n*L\n85#1:111,5\n*E\n"})
public final class b0 extends Lambda implements Function2<Scope, ParametersHolder, CountryRememberedUserViewState> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final b0 f34267p0 = new b0(2);

    @Override // kotlin.jvm.functions.Function2
    public final CountryRememberedUserViewState invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope factory = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        return new CountryRememberedUserViewState((Context) factory.get(Reflection.getOrCreateKotlinClass(Context.class), null, null), (FormLoginConfigurator) factory.get(Reflection.getOrCreateKotlinClass(FormLoginConfigurator.class), null, null));
    }
}
