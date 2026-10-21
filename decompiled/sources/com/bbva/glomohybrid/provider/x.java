package com.bbva.glomohybrid.provider;

import com.bbva.glomohybrid.base.file.receipts.ReceiptsStore;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: AppDependenciesProvider.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class x extends Lambda implements Function2<Scope, ParametersHolder, ReceiptsStore> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final x f34377p0 = new x(2);

    @Override // kotlin.jvm.functions.Function2
    public final ReceiptsStore invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return AppDependenciesProvider.access$provideReceiptsStore(AppDependenciesProvider.INSTANCE, ModuleExtKt.androidContext(single));
    }
}
