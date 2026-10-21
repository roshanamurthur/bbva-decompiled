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

/* JADX INFO: compiled from: ArchitectureModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nArchitectureModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchitectureModule.kt\ncom/bbva/glomohybrid/provider/module/ArchitectureModuleKt$filesModule$1$12\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,298:1\n129#2,5:299\n*S KotlinDebug\n*F\n+ 1 ArchitectureModule.kt\ncom/bbva/glomohybrid/provider/module/ArchitectureModuleKt$filesModule$1$12\n*L\n284#1:299,5\n*E\n"})
public final class f0 extends Lambda implements Function2<Scope, ParametersHolder, FileUseCaseFactory> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final f0 f34046p0 = new f0(2);

    @Override // kotlin.jvm.functions.Function2
    public final FileUseCaseFactory invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope factory = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        return new FileUseCaseFactory((NetworkWorker) factory.get(Reflection.getOrCreateKotlinClass(NetworkWorker.class), null, null));
    }
}
