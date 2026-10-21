package com.bbva.glomohybrid.provider.modules;

import com.bbva.glomohybrid.login.domain.model.CountryPasswordQuality;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: CountryPresentationModule.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class a0 extends Lambda implements Function2<Scope, ParametersHolder, CountryPasswordQuality> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final a0 f34263p0 = new a0(2);

    @Override // kotlin.jvm.functions.Function2
    public final CountryPasswordQuality invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new CountryPasswordQuality();
    }
}
