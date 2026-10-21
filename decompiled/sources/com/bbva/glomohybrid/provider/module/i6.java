package com.bbva.glomohybrid.provider.module;

import com.bbva.component.ui.modal.halfmodal.HalfModalComponent;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: PresentationModule.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class i6 extends Lambda implements Function2<Scope, ParametersHolder, HalfModalComponent> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final i6 f34079p0 = new i6(2);

    @Override // kotlin.jvm.functions.Function2
    public final HalfModalComponent invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return HalfModalComponent.INSTANCE.getInstance();
    }
}
