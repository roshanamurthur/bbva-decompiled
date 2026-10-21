package com.bbva.glomohybrid.provider.module;

import com.bbva.glomohybrid.infoscreen.networkerror.NetworkViewModel;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: InfoViewModule.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class i3 extends Lambda implements Function2<Scope, ParametersHolder, NetworkViewModel> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final i3 f34076p0 = new i3(2);

    @Override // kotlin.jvm.functions.Function2
    public final NetworkViewModel invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope viewModel = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
        Intrinsics.checkNotNullParameter(it, "it");
        return new NetworkViewModel();
    }
}
