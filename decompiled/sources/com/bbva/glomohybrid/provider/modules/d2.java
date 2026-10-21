package com.bbva.glomohybrid.provider.modules;

import com.bbva.smartassistance.listeners.CustomBaseConversation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: SmartAssistanceModule.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class d2 extends Lambda implements Function2<Scope, ParametersHolder, CustomBaseConversation> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final d2 f34277p0 = new d2(2);

    @Override // kotlin.jvm.functions.Function2
    public final CustomBaseConversation invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new CustomBaseConversation();
    }
}
