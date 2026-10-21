package com.bbva.glomohybrid.provider.module;

import com.bbva.glomohybrid.base.file.common.FileExporter;
import com.bbva.glomohybrid.documents.plugin.UriExporter;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: ActionLauncherModule.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class d extends Lambda implements Function2<Scope, ParametersHolder, UriExporter> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final d f34027p0 = new d(2);

    @Override // kotlin.jvm.functions.Function2
    public final UriExporter invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope factory = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        return new DefaultUriExporter(new FileExporter(ModuleExtKt.androidContext(factory)));
    }
}
