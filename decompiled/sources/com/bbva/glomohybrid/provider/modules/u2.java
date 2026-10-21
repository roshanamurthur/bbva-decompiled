package com.bbva.glomohybrid.provider.modules;

import com.bbva.glomo.user.domain.model.UserType;
import com.bbva.glomohybrid.ui.options.profileselector.usecase.CountryGetUserSegmentUseCase;
import com.bbva.glomoutils.usecase.UseCaseWithParams;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: UserTypeModule.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class u2 extends Lambda implements Function2<Scope, ParametersHolder, UseCaseWithParams<? super UserType, ? extends String>> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final u2 f34348p0 = new u2(2);

    @Override // kotlin.jvm.functions.Function2
    public final UseCaseWithParams<? super UserType, ? extends String> invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new CountryGetUserSegmentUseCase();
    }
}
