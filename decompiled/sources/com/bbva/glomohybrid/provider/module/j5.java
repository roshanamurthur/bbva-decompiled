package com.bbva.glomohybrid.provider.module;

import com.bbva.glomo.storage.MainStorage;
import com.bbva.slidemenuview.repository.MenuRepository;
import com.bbva.slidemenuview.repository.datasource.StorageMenuDataSource;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: PresentationModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nPresentationModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PresentationModule.kt\ncom/bbva/glomohybrid/provider/module/PresentationModuleKt$menuModule$1$1\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,251:1\n129#2,5:252\n*S KotlinDebug\n*F\n+ 1 PresentationModule.kt\ncom/bbva/glomohybrid/provider/module/PresentationModuleKt$menuModule$1$1\n*L\n175#1:252,5\n*E\n"})
public final class j5 extends Lambda implements Function2<Scope, ParametersHolder, MenuRepository> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final j5 f34087p0 = new j5(2);

    @Override // kotlin.jvm.functions.Function2
    public final MenuRepository invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new MenuRepository(new StorageMenuDataSource((MainStorage) single.get(Reflection.getOrCreateKotlinClass(MainStorage.class), null, null)));
    }
}
