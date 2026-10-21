package com.bbva.glomohybrid.provider.module;

import com.bbva.component.dm.settings.repository.datasource.StorageDataSource;
import com.bbva.network.NetworkWorker;
import com.bbva.network.interceptor.NetworkInterceptor;
import com.bbva.network.model.pinning.PinningCatalog;
import java.net.CookieManager;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.OkHttpClient;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: NetworkModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nNetworkModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkModule.kt\ncom/bbva/glomohybrid/provider/module/NetworkModuleKt$networkModule$1$6\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,110:1\n129#2,5:111\n154#2,5:116\n352#2:121\n*S KotlinDebug\n*F\n+ 1 NetworkModule.kt\ncom/bbva/glomohybrid/provider/module/NetworkModuleKt$networkModule$1$6\n*L\n54#1:111,5\n54#1:116,5\n54#1:121\n*E\n"})
public final class b5 extends Lambda implements Function2<Scope, ParametersHolder, NetworkWorker> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final b5 f34015p0 = new b5(2);

    @Override // kotlin.jvm.functions.Function2
    public final NetworkWorker invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return NetworkModuleKt.access$privateNetworkWorkerFactory(ModuleExtKt.androidContext(single), (OkHttpClient) single.get(Reflection.getOrCreateKotlinClass(OkHttpClient.class), null, null), (PinningCatalog) single.getOrNull(Reflection.getOrCreateKotlinClass(PinningCatalog.class), null, null), (CookieManager) single.get(Reflection.getOrCreateKotlinClass(CookieManager.class), null, null), single.getAll(Reflection.getOrCreateKotlinClass(NetworkInterceptor.class)), (StorageDataSource) single.get(Reflection.getOrCreateKotlinClass(StorageDataSource.class), null, null));
    }
}
