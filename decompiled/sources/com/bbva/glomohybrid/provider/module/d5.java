package com.bbva.glomohybrid.provider.module;

import com.bbva.glomohybrid.network.NetworkImageWorker;
import com.bbva.glomoutils.network.ImageFetcher;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: NetworkModule.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class d5 extends Lambda implements Function2<Scope, ParametersHolder, ImageFetcher> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final d5 f34033p0 = new d5(2);

    @Override // kotlin.jvm.functions.Function2
    public final ImageFetcher invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope factory = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        return new NetworkImageWorker(ModuleExtKt.androidContext(factory));
    }
}
