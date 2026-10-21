package com.bbva.glomohybrid.provider.module;

import com.bbva.glomohybrid.infoscreen.fragment.InfoScreenViewModel;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: InfoViewModule.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class l3 extends Lambda implements Function2<Scope, ParametersHolder, InfoScreenViewModel> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final l3 f34103p0 = new l3(2);

    @Override // kotlin.jvm.functions.Function2
    public final InfoScreenViewModel invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope viewModel = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
        Intrinsics.checkNotNullParameter(it, "it");
        return new InfoScreenViewModel();
    }
}
