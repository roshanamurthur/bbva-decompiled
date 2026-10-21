package com.bbva.glomohybrid.provider.modules;

import android.content.Context;
import com.bbva.bridge.dispatcher.MessageDispatcher;
import com.bbva.glomohybrid.base.HearingDisabilitiesComponent;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.VeriShowView;
import com.bbva.glomohybrid.provider.module.ConfigModuleKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: CountryPresentationModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nCountryPresentationModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryPresentationModule.kt\ncom/bbva/glomohybrid/provider/modules/CountryPresentationModuleKt$countryPresentationModule$1$5\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,110:1\n129#2,5:111\n129#2,5:116\n129#2,5:121\n*S KotlinDebug\n*F\n+ 1 CountryPresentationModule.kt\ncom/bbva/glomohybrid/provider/modules/CountryPresentationModuleKt$countryPresentationModule$1$5\n*L\n76#1:111,5\n77#1:116,5\n78#1:121,5\n*E\n"})
public final class z extends Lambda implements Function2<Scope, ParametersHolder, HearingDisabilitiesComponent> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final z f34361p0 = new z(2);

    @Override // kotlin.jvm.functions.Function2
    public final HearingDisabilitiesComponent invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope factory = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        return new VeriShowView((String) factory.get(Reflection.getOrCreateKotlinClass(String.class), QualifierKt.named(ConfigModuleKt.HOST_VERISHOW), null), (Context) factory.get(Reflection.getOrCreateKotlinClass(Context.class), null, null), (MessageDispatcher) factory.get(Reflection.getOrCreateKotlinClass(MessageDispatcher.class), null, null));
    }
}
