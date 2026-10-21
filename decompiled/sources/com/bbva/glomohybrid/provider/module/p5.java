package com.bbva.glomohybrid.provider.module;

import com.bbva.slidemenuview.domain.usecase.GetFeaturedMenuUseCase;
import com.bbva.slidemenuview.presentation.decorator.FeatureFlagsMenuDecorator;
import com.bbva.slidemenuview.presentation.decorator.MenuDecorator;
import com.bbva.slidemenuview.presentation.decorator.VisibilityMenuDecorator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: PresentationModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nPresentationModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PresentationModule.kt\ncom/bbva/glomohybrid/provider/module/PresentationModuleKt$menuModule$1$7\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,251:1\n129#2,5:252\n*S KotlinDebug\n*F\n+ 1 PresentationModule.kt\ncom/bbva/glomohybrid/provider/module/PresentationModuleKt$menuModule$1$7\n*L\n197#1:252,5\n*E\n"})
public final class p5 extends Lambda implements Function2<Scope, ParametersHolder, List<? extends MenuDecorator>> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final p5 f34139p0 = new p5(2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final List<? extends MenuDecorator> invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope factory = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        return CollectionsKt__CollectionsKt.listOf((Object[]) new MenuDecorator[]{new FeatureFlagsMenuDecorator((GetFeaturedMenuUseCase) factory.get(Reflection.getOrCreateKotlinClass(GetFeaturedMenuUseCase.class), null, null), null, 2, 0 == true ? 1 : 0), new VisibilityMenuDecorator()});
    }
}
