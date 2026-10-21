package com.bbva.glomohybrid.provider.module;

import com.bbva.glomohybrid.featureflags.FeatureFlagsMenuObserver;
import com.bbva.glomoutils.scheduler.ThreadDispatchers;
import com.bbva.slidemenuview.domain.usecase.SyncMenuItemsUseCase;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: FeatureFlagsModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nFeatureFlagsModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeatureFlagsModule.kt\ncom/bbva/glomohybrid/provider/module/FeatureFlagsModuleKt$featureFlagsModule$1$6\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,48:1\n129#2,5:49\n*S KotlinDebug\n*F\n+ 1 FeatureFlagsModule.kt\ncom/bbva/glomohybrid/provider/module/FeatureFlagsModuleKt$featureFlagsModule$1$6\n*L\n33#1:49,5\n*E\n"})
public final class b3 extends Lambda implements Function2<Scope, ParametersHolder, FeatureFlagsMenuObserver> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final b3 f34013p0 = new b3(2);

    @Override // kotlin.jvm.functions.Function2
    public final FeatureFlagsMenuObserver invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope factory = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        return new FeatureFlagsMenuObserver((SyncMenuItemsUseCase) factory.get(Reflection.getOrCreateKotlinClass(SyncMenuItemsUseCase.class), null, null), (ThreadDispatchers) factory.get(Reflection.getOrCreateKotlinClass(ThreadDispatchers.class), null, null));
    }
}
