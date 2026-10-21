package com.bbva.glomohybrid.provider.modules;

import com.bbva.glomohybrid.CountryChangeUserFullScreenModalFactory;
import com.bbva.glomohybrid.ui.modals.changeuser.ChangeUserFullScreenModalFactory;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: CountryPresentationModule.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class w extends Lambda implements Function2<Scope, ParametersHolder, ChangeUserFullScreenModalFactory> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final w f34352p0 = new w(2);

    @Override // kotlin.jvm.functions.Function2
    public final ChangeUserFullScreenModalFactory invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new CountryChangeUserFullScreenModalFactory();
    }
}
