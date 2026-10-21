package com.bbva.glomohybrid.provider.module;

import com.bbva.glomohybrid.infoscreen.root.RootViewModel;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: InfoViewModule.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class j3 extends Lambda implements Function2<Scope, ParametersHolder, RootViewModel> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final j3 f34085p0 = new j3(2);

    @Override // kotlin.jvm.functions.Function2
    public final RootViewModel invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope viewModel = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
        Intrinsics.checkNotNullParameter(it, "it");
        return new RootViewModel();
    }
}
