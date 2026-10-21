package com.bbva.glomohybrid.provider.module;

import com.bbva.glomohybrid.base.viewmodel.ViewModelComponentsProviders;
import com.bbva.glomohybrid.infoscreen.mobilepayment.PaymentsInfoNotificationViewModel;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: PresentationModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nPresentationModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PresentationModule.kt\ncom/bbva/glomohybrid/provider/module/PresentationModuleKt$presentationModule$1$15\n+ 2 ParametersHolder.kt\norg/koin/core/parameter/ParametersHolder\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,251:1\n44#2:252\n129#3,5:253\n*S KotlinDebug\n*F\n+ 1 PresentationModule.kt\ncom/bbva/glomohybrid/provider/module/PresentationModuleKt$presentationModule$1$15\n*L\n151#1:252\n152#1:253,5\n*E\n"})
public final class g6 extends Lambda implements Function2<Scope, ParametersHolder, PaymentsInfoNotificationViewModel> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final g6 f34061p0 = new g6(2);

    @Override // kotlin.jvm.functions.Function2
    public final PaymentsInfoNotificationViewModel invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope scope2 = scope;
        ParametersHolder parametersHolder2 = parametersHolder;
        return new PaymentsInfoNotificationViewModel((ViewModelComponentsProviders) scope2.get(Reflection.getOrCreateKotlinClass(ViewModelComponentsProviders.class), null, new f6((Map) parametersHolder2.elementAt(0, androidx.activity.a.f(scope2, "$this$viewModel", parametersHolder2, "<name for destructuring parameter 0>", Map.class)))));
    }
}
