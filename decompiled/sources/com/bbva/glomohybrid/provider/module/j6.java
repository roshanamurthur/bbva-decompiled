package com.bbva.glomohybrid.provider.module;

import com.bbva.glomohybrid.base.viewmodel.ViewModelComponentsProviders;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: PresentationModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nPresentationModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PresentationModule.kt\ncom/bbva/glomohybrid/provider/module/PresentationModuleKt$presentationModule$1$1\n+ 2 ParametersHolder.kt\norg/koin/core/parameter/ParametersHolder\n*L\n1#1,251:1\n44#2:252\n*S KotlinDebug\n*F\n+ 1 PresentationModule.kt\ncom/bbva/glomohybrid/provider/module/PresentationModuleKt$presentationModule$1$1\n*L\n77#1:252\n*E\n"})
public final class j6 extends Lambda implements Function2<Scope, ParametersHolder, ViewModelComponentsProviders> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final j6 f34088p0 = new j6(2);

    @Override // kotlin.jvm.functions.Function2
    public final ViewModelComponentsProviders invoke(Scope scope, ParametersHolder parametersHolder) {
        ParametersHolder parametersHolder2 = parametersHolder;
        return new ViewModelComponentsProviders(((Number) parametersHolder2.elementAt(0, androidx.activity.a.f(scope, "$this$factory", parametersHolder2, "<name for destructuring parameter 0>", Integer.class))).intValue());
    }
}
