package com.bbva.glomohybrid.provider.module;

import com.bbva.slidemenuview.CountrySlideMenuView;
import com.bbva.slidemenuview.presentation.SlideMenuViewContract;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: PresentationModule.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class o5 extends Lambda implements Function2<Scope, ParametersHolder, SlideMenuViewContract> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final o5 f34131p0 = new o5(2);

    @Override // kotlin.jvm.functions.Function2
    public final SlideMenuViewContract invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope factory = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        return new CountrySlideMenuView();
    }
}
