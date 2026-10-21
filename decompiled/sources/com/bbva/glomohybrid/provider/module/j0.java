package com.bbva.glomohybrid.provider.module;

import com.bbva.glomohybrid.documents.common.repository.dataSource.RemoteFileDataSource;
import com.bbva.network.NetworkWorker;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: ArchitectureModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nArchitectureModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchitectureModule.kt\ncom/bbva/glomohybrid/provider/module/ArchitectureModuleKt$filesModule$1$4\n+ 2 ParametersHolder.kt\norg/koin/core/parameter/ParametersHolder\n*L\n1#1,298:1\n44#2:299\n*S KotlinDebug\n*F\n+ 1 ArchitectureModule.kt\ncom/bbva/glomohybrid/provider/module/ArchitectureModuleKt$filesModule$1$4\n*L\n244#1:299\n*E\n"})
public final class j0 extends Lambda implements Function2<Scope, ParametersHolder, RemoteFileDataSource> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final j0 f34082p0 = new j0(2);

    @Override // kotlin.jvm.functions.Function2
    public final RemoteFileDataSource invoke(Scope scope, ParametersHolder parametersHolder) {
        ParametersHolder parametersHolder2 = parametersHolder;
        return new RemoteFileDataSource((NetworkWorker) parametersHolder2.elementAt(0, androidx.activity.a.f(scope, "$this$single", parametersHolder2, "<name for destructuring parameter 0>", NetworkWorker.class)), null, 2, null);
    }
}
