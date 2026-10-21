package com.bbva.glomohybrid.provider.module;

import com.bbva.slidemenuview.cells.components.dm.infraestructure.DefaultMenuIdentifierMapper;
import com.bbva.slidemenuview.cells.components.dm.infraestructure.MenuIdentifierMapper;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: AnalyticsModule.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class i extends Lambda implements Function2<Scope, ParametersHolder, MenuIdentifierMapper> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final i f34072p0 = new i(2);

    @Override // kotlin.jvm.functions.Function2
    public final MenuIdentifierMapper invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope factory = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        return new DefaultMenuIdentifierMapper();
    }
}
