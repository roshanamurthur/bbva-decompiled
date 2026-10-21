package com.bbva.glomohybrid.provider.module;

import com.bbva.cellscore.web.plugin.PluginFactory;
import com.bbva.glomohybrid.base.webApp.WebAppDedicatedPlugins;
import com.bbva.glomohybrid.base.webApp.WebAppPluginsProvider;
import com.bbva.glomohybrid.provider.DependenciesProvider;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: WebAppDependenciesModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nWebAppDependenciesModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebAppDependenciesModule.kt\ncom/bbva/glomohybrid/provider/module/WebAppDependenciesModuleKt$webAppDependenciesModule$1$1$6\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,62:1\n129#2,5:63\n129#2,5:68\n129#2,5:73\n*S KotlinDebug\n*F\n+ 1 WebAppDependenciesModule.kt\ncom/bbva/glomohybrid/provider/module/WebAppDependenciesModuleKt$webAppDependenciesModule$1$1$6\n*L\n53#1:63,5\n55#1:68,5\n57#1:73,5\n*E\n"})
public final class l7 extends Lambda implements Function2<Scope, ParametersHolder, WebAppPluginsProvider> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final l7 f34107p0 = new l7(2);

    @Override // kotlin.jvm.functions.Function2
    public final WebAppPluginsProvider invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope scope2 = scope;
        return new WebAppPluginsProvider((PluginFactory) scope2.get(Reflection.getOrCreateKotlinClass(PluginFactory.class), null, null), ((DependenciesProvider) scope2.get(androidx.activity.a.f(scope2, "$this$scoped", parametersHolder, "it", DependenciesProvider.class), null, null)).requiredPlugins(), (WebAppDedicatedPlugins) scope2.get(Reflection.getOrCreateKotlinClass(WebAppDedicatedPlugins.class), null, null));
    }
}
