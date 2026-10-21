package com.bbva.glomohybrid.provider.module;

import com.bbva.glomohybrid.infoscreen.scratchCard.view.ScratchcardViewModel;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: PresentationModule.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class y6 extends Lambda implements Function2<Scope, ParametersHolder, ScratchcardViewModel> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final y6 f34213p0 = new y6(2);

    @Override // kotlin.jvm.functions.Function2
    public final ScratchcardViewModel invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope viewModel = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
        Intrinsics.checkNotNullParameter(it, "it");
        return new ScratchcardViewModel();
    }
}
