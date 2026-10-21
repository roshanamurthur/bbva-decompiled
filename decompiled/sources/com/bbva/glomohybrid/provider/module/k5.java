package com.bbva.glomohybrid.provider.module;

import com.bbva.glomoutils.scheduler.ThreadDispatchers;
import com.bbva.slidemenuview.cells.components.dm.MenuDataManager;
import com.bbva.slidemenuview.cells.components.dm.MenuUseCaseFactory;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: PresentationModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nPresentationModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PresentationModule.kt\ncom/bbva/glomohybrid/provider/module/PresentationModuleKt$menuModule$1$2\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,251:1\n129#2,5:252\n*S KotlinDebug\n*F\n+ 1 PresentationModule.kt\ncom/bbva/glomohybrid/provider/module/PresentationModuleKt$menuModule$1$2\n*L\n178#1:252,5\n*E\n"})
public final class k5 extends Lambda implements Function2<Scope, ParametersHolder, MenuDataManager> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final k5 f34096p0 = new k5(2);

    @Override // kotlin.jvm.functions.Function2
    public final MenuDataManager invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new MenuDataManager(new MenuUseCaseFactory(), (ThreadDispatchers) single.get(Reflection.getOrCreateKotlinClass(ThreadDispatchers.class), null, null), null, 4, null);
    }
}
