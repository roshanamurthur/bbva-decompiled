package com.bbva.glomohybrid.provider.module;

import com.bbva.glomoconfig.GlobalConfig;
import com.bbva.glomohybrid.documents.common.repository.DocumentsRepository;
import com.bbva.glomohybrid.documents.common.repository.dataSource.DiskFileDataSource;
import com.bbva.glomohybrid.documents.common.repository.dataSource.RemoteFileDataSource;
import com.bbva.network.NetworkWorker;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: ArchitectureModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nArchitectureModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchitectureModule.kt\ncom/bbva/glomohybrid/provider/module/ArchitectureModuleKt$filesModule$1$6\n+ 2 ParametersHolder.kt\norg/koin/core/parameter/ParametersHolder\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,298:1\n44#2:299\n129#3,5:300\n129#3,5:305\n129#3,5:310\n*S KotlinDebug\n*F\n+ 1 ArchitectureModule.kt\ncom/bbva/glomohybrid/provider/module/ArchitectureModuleKt$filesModule$1$6\n*L\n248#1:299\n250#1:300,5\n251#1:305,5\n254#1:310,5\n*E\n"})
public final class m0 extends Lambda implements Function2<Scope, ParametersHolder, DocumentsRepository> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final m0 f34109p0 = new m0(2);

    @Override // kotlin.jvm.functions.Function2
    public final DocumentsRepository invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope scope2 = scope;
        ParametersHolder parametersHolder2 = parametersHolder;
        NetworkWorker networkWorker = (NetworkWorker) parametersHolder2.elementAt(0, androidx.activity.a.f(scope2, "$this$single", parametersHolder2, "<name for destructuring parameter 0>", NetworkWorker.class));
        return new DocumentsRepository(((GlobalConfig) scope2.get(Reflection.getOrCreateKotlinClass(GlobalConfig.class), null, null)).completeUrl("documents"), (RemoteFileDataSource) scope2.get(Reflection.getOrCreateKotlinClass(RemoteFileDataSource.class), null, new l0(networkWorker)), (DiskFileDataSource) scope2.get(Reflection.getOrCreateKotlinClass(DiskFileDataSource.class), null, null));
    }
}
