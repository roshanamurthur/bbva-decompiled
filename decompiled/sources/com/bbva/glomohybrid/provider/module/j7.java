package com.bbva.glomohybrid.provider.module;

import android.app.Application;
import android.content.Context;
import com.bbva.component.dm.akamai.interceptor.AkamaiInterceptorDataManager;
import com.bbva.network.NetworkWorker;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.android.error.MissingAndroidContextException;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: WebAppDependenciesModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nWebAppDependenciesModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebAppDependenciesModule.kt\ncom/bbva/glomohybrid/provider/module/WebAppDependenciesModuleKt$webAppDependenciesModule$1$1$4\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,62:1\n129#2,5:63\n*S KotlinDebug\n*F\n+ 1 WebAppDependenciesModule.kt\ncom/bbva/glomohybrid/provider/module/WebAppDependenciesModuleKt$webAppDependenciesModule$1$1$4\n*L\n45#1:63,5\n*E\n"})
public final class j7 extends Lambda implements Function2<Scope, ParametersHolder, AkamaiInterceptorDataManager> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final j7 f34089p0 = new j7(2);

    @Override // kotlin.jvm.functions.Function2
    public final AkamaiInterceptorDataManager invoke(Scope scope, ParametersHolder parametersHolder) throws MissingAndroidContextException {
        Scope scoped = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(scoped, "$this$scoped");
        Intrinsics.checkNotNullParameter(it, "it");
        NetworkWorker networkWorker = (NetworkWorker) scoped.get(Reflection.getOrCreateKotlinClass(NetworkWorker.class), null, null);
        Context contextAndroidContext = ModuleExtKt.androidContext(scoped);
        Intrinsics.checkNotNull(contextAndroidContext, "null cannot be cast to non-null type android.app.Application");
        return new AkamaiInterceptorDataManager(networkWorker, (Application) contextAndroidContext);
    }
}
