package com.bbva.glomohybrid.provider.module;

import com.bbva.glomohybrid.documents.common.FileUseCaseFactory;
import com.bbva.network.NetworkWorker;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: WebAppDependenciesModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nWebAppDependenciesModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebAppDependenciesModule.kt\ncom/bbva/glomohybrid/provider/module/WebAppDependenciesModuleKt$webAppDependenciesModule$1$1$3\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,62:1\n129#2,5:63\n*S KotlinDebug\n*F\n+ 1 WebAppDependenciesModule.kt\ncom/bbva/glomohybrid/provider/module/WebAppDependenciesModuleKt$webAppDependenciesModule$1$1$3\n*L\n41#1:63,5\n*E\n"})
public final class i7 extends Lambda implements Function2<Scope, ParametersHolder, FileUseCaseFactory> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final i7 f34080p0 = new i7(2);

    @Override // kotlin.jvm.functions.Function2
    public final FileUseCaseFactory invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope scoped = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(scoped, "$this$scoped");
        Intrinsics.checkNotNullParameter(it, "it");
        return new FileUseCaseFactory((NetworkWorker) scoped.get(Reflection.getOrCreateKotlinClass(NetworkWorker.class), null, null));
    }
}
