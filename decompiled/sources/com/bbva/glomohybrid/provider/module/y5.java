package com.bbva.glomohybrid.provider.module;

import com.bbva.glomohybrid.base.behaviors.BasicChangeUserBehavior;
import com.bbva.glomohybrid.base.behaviors.ChangeUserBehavior;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: PresentationModule.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class y5 extends Lambda implements Function2<Scope, ParametersHolder, ChangeUserBehavior> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final y5 f34212p0 = new y5(2);

    @Override // kotlin.jvm.functions.Function2
    public final ChangeUserBehavior invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new BasicChangeUserBehavior();
    }
}
