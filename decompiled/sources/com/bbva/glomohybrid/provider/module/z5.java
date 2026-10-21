package com.bbva.glomohybrid.provider.module;

import com.bbva.glomohybrid.infoscreen.webView.force.domain.usecase.GetWebViewStoreUrlUseCase;
import com.bbva.glomohybrid.infoscreen.webView.force.viewmodel.WebViewForceUpdateViewModel;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: PresentationModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nPresentationModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PresentationModule.kt\ncom/bbva/glomohybrid/provider/module/PresentationModuleKt$presentationModule$1$10\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,251:1\n129#2,5:252\n*S KotlinDebug\n*F\n+ 1 PresentationModule.kt\ncom/bbva/glomohybrid/provider/module/PresentationModuleKt$presentationModule$1$10\n*L\n124#1:252,5\n*E\n"})
public final class z5 extends Lambda implements Function2<Scope, ParametersHolder, WebViewForceUpdateViewModel> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final z5 f34220p0 = new z5(2);

    @Override // kotlin.jvm.functions.Function2
    public final WebViewForceUpdateViewModel invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope viewModel = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
        Intrinsics.checkNotNullParameter(it, "it");
        return new WebViewForceUpdateViewModel((GetWebViewStoreUrlUseCase) viewModel.get(Reflection.getOrCreateKotlinClass(GetWebViewStoreUrlUseCase.class), null, null));
    }
}
