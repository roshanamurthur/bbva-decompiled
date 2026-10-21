package com.bbva.glomohybrid.provider;

import com.bbva.glomohybrid.base.file.common.FileExporter;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: AppDependenciesProvider.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class w extends Lambda implements Function2<Scope, ParametersHolder, FileExporter> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final w f34376p0 = new w(2);

    @Override // kotlin.jvm.functions.Function2
    public final FileExporter invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return AppDependenciesProvider.access$provideFileExporter(AppDependenciesProvider.INSTANCE, ModuleExtKt.androidContext(single));
    }
}
