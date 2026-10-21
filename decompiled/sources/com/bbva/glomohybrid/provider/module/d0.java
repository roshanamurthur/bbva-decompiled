package com.bbva.glomohybrid.provider.module;

import com.bbva.actionlauncher.ActionLauncher;
import com.bbva.glomohybrid.documents.common.OpenFileUseCase;
import com.bbva.glomohybrid.documents.plugin.UriExporter;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: ArchitectureModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nArchitectureModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchitectureModule.kt\ncom/bbva/glomohybrid/provider/module/ArchitectureModuleKt$filesModule$1$10\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,298:1\n129#2,5:299\n*S KotlinDebug\n*F\n+ 1 ArchitectureModule.kt\ncom/bbva/glomohybrid/provider/module/ArchitectureModuleKt$filesModule$1$10\n*L\n272#1:299,5\n*E\n"})
public final class d0 extends Lambda implements Function2<Scope, ParametersHolder, OpenFileUseCase> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final d0 f34028p0 = new d0(2);

    @Override // kotlin.jvm.functions.Function2
    public final OpenFileUseCase invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new OpenFileUseCase((UriExporter) single.get(Reflection.getOrCreateKotlinClass(UriExporter.class), null, null), (ActionLauncher) single.get(Reflection.getOrCreateKotlinClass(ActionLauncher.class), null, null));
    }
}
