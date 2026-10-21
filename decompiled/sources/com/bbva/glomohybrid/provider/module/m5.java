package com.bbva.glomohybrid.provider.module;

import com.bbva.glomohybrid.BuildConfig;
import com.bbva.slidemenuview.domain.usecase.SyncMenuItemsUseCase;
import com.bbva.slidemenuview.repository.MenuRepository;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: PresentationModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nPresentationModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PresentationModule.kt\ncom/bbva/glomohybrid/provider/module/PresentationModuleKt$menuModule$1$4\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,251:1\n129#2,5:252\n*S KotlinDebug\n*F\n+ 1 PresentationModule.kt\ncom/bbva/glomohybrid/provider/module/PresentationModuleKt$menuModule$1$4\n*L\n185#1:252,5\n*E\n"})
public final class m5 extends Lambda implements Function2<Scope, ParametersHolder, SyncMenuItemsUseCase> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final m5 f34114p0 = new m5(2);

    @Override // kotlin.jvm.functions.Function2
    public final SyncMenuItemsUseCase invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope factory = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        return new SyncMenuItemsUseCase(BuildConfig.VERSION_NAME, (MenuRepository) factory.get(Reflection.getOrCreateKotlinClass(MenuRepository.class), null, null));
    }
}
