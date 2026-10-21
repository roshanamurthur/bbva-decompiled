package com.bbva.glomohybrid.provider.module;

import com.bbva.actionlauncher.ActionLauncher;
import com.bbva.androidtoolkit.plugin.Plugin;
import com.bbva.glomohybrid.base.webApp.WebAppDedicatedPlugins;
import com.bbva.glomohybrid.documents.common.FileUseCaseFactory;
import com.bbva.glomohybrid.documents.plugin.OpenDocumentPlugin;
import com.bbva.glomohybrid.documents.plugin.UriExporter;
import com.bbva.network.NetworkWorker;
import com.bbva.networkplugin.HttpPlugin;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: WebAppDependenciesModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nWebAppDependenciesModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebAppDependenciesModule.kt\ncom/bbva/glomohybrid/provider/module/WebAppDependenciesModuleKt$webAppDependenciesModule$1$1$2\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,62:1\n129#2,5:63\n129#2,5:68\n*S KotlinDebug\n*F\n+ 1 WebAppDependenciesModule.kt\ncom/bbva/glomohybrid/provider/module/WebAppDependenciesModuleKt$webAppDependenciesModule$1$1$2\n*L\n34#1:63,5\n35#1:68,5\n*E\n"})
public final class h7 extends Lambda implements Function2<Scope, ParametersHolder, WebAppDedicatedPlugins> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final h7 f34071p0 = new h7(2);

    @Override // kotlin.jvm.functions.Function2
    public final WebAppDedicatedPlugins invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope scoped = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(scoped, "$this$scoped");
        Intrinsics.checkNotNullParameter(it, "it");
        return new WebAppDedicatedPlugins(CollectionsKt__CollectionsKt.listOf((Object[]) new Plugin[]{new HttpPlugin((NetworkWorker) scoped.get(Reflection.getOrCreateKotlinClass(NetworkWorker.class), null, null)), new OpenDocumentPlugin((FileUseCaseFactory) scoped.get(Reflection.getOrCreateKotlinClass(FileUseCaseFactory.class), null, null), (ActionLauncher) scoped.get(Reflection.getOrCreateKotlinClass(ActionLauncher.class), null, null), (UriExporter) scoped.get(Reflection.getOrCreateKotlinClass(UriExporter.class), null, null))}));
    }
}
