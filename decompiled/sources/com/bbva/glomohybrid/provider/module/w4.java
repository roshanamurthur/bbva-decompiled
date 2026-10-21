package com.bbva.glomohybrid.provider.module;

import com.bbva.glomohybrid.base.delegates.DynamicModulesDelegate;
import com.bbva.glomohybrid.base.viewmodel.ViewModelComponentsProviders;
import com.bbva.glomohybrid.delegates.GoogleDynamicModulesDelegate;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: MobileServicesModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nMobileServicesModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MobileServicesModule.kt\ncom/bbva/glomohybrid/provider/module/MobileServicesModuleKt$mobileServices$1$6$1\n+ 2 ParametersHolder.kt\norg/koin/core/parameter/ParametersHolder\n*L\n1#1,33:1\n44#2:34\n*S KotlinDebug\n*F\n+ 1 MobileServicesModule.kt\ncom/bbva/glomohybrid/provider/module/MobileServicesModuleKt$mobileServices$1$6$1\n*L\n28#1:34\n*E\n"})
public final class w4 extends Lambda implements Function2<Scope, ParametersHolder, DynamicModulesDelegate> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final w4 f34195p0 = new w4(2);

    @Override // kotlin.jvm.functions.Function2
    public final DynamicModulesDelegate invoke(Scope scope, ParametersHolder parametersHolder) {
        ParametersHolder parametersHolder2 = parametersHolder;
        return new GoogleDynamicModulesDelegate((ViewModelComponentsProviders) parametersHolder2.elementAt(0, androidx.activity.a.f(scope, "$this$scoped", parametersHolder2, "<name for destructuring parameter 0>", ViewModelComponentsProviders.class)));
    }
}
