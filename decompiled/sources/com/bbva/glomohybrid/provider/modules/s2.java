package com.bbva.glomohybrid.provider.modules;

import com.bbva.glomohybrid.ui.options.ListOptionFactory;
import com.bbva.glomohybrid.ui.options.profileselector.ProfilesListOptionFactory;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: UserTypeModule.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class s2 extends Lambda implements Function2<Scope, ParametersHolder, ListOptionFactory> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final s2 f34340p0 = new s2(2);

    @Override // kotlin.jvm.functions.Function2
    public final ListOptionFactory invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return ProfilesListOptionFactory.INSTANCE;
    }
}
