package com.bbva.glomohybrid.provider.module;

import com.bbva.glomohybrid.base.viewmodel.ViewModelComponentsProviders;
import com.bbva.glomohybrid.login.presentation.viewmodel.LoginViewModel;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: PresentationModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nPresentationModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PresentationModule.kt\ncom/bbva/glomohybrid/provider/module/PresentationModuleKt$presentationModule$1$4\n+ 2 ParametersHolder.kt\norg/koin/core/parameter/ParametersHolder\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,251:1\n44#2:252\n129#3,5:253\n*S KotlinDebug\n*F\n+ 1 PresentationModule.kt\ncom/bbva/glomohybrid/provider/module/PresentationModuleKt$presentationModule$1$4\n*L\n91#1:252\n92#1:253,5\n*E\n"})
public final class o6 extends Lambda implements Function2<Scope, ParametersHolder, LoginViewModel> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final o6 f34132p0 = new o6(2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final LoginViewModel invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope scope2 = scope;
        ParametersHolder parametersHolder2 = parametersHolder;
        return new LoginViewModel((ViewModelComponentsProviders) scope2.get(Reflection.getOrCreateKotlinClass(ViewModelComponentsProviders.class), null, new n6((Map) parametersHolder2.elementAt(0, androidx.activity.a.f(scope2, "$this$viewModel", parametersHolder2, "<name for destructuring parameter 0>", Map.class)))), null, 2, 0 == true ? 1 : 0);
    }
}
