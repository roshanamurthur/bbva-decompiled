package com.bbva.glomohybrid.provider.module;

import com.bbva.glomohybrid.documents.common.FetchTermsByNameUseCase;
import com.bbva.glomohybrid.documents.common.repository.DocumentsRepository;
import com.bbva.glomohybrid.documents.common.repository.TermsRepository;
import com.bbva.network.NetworkWorker;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: ArchitectureModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nArchitectureModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchitectureModule.kt\ncom/bbva/glomohybrid/provider/module/ArchitectureModuleKt$filesModule$1$8\n+ 2 ParametersHolder.kt\norg/koin/core/parameter/ParametersHolder\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,298:1\n44#2:299\n129#3,5:300\n*S KotlinDebug\n*F\n+ 1 ArchitectureModule.kt\ncom/bbva/glomohybrid/provider/module/ArchitectureModuleKt$filesModule$1$8\n*L\n262#1:299\n263#1:300,5\n*E\n"})
public final class q0 extends Lambda implements Function2<Scope, ParametersHolder, FetchTermsByNameUseCase> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final q0 f34142p0 = new q0(2);

    @Override // kotlin.jvm.functions.Function2
    public final FetchTermsByNameUseCase invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope scope2 = scope;
        ParametersHolder parametersHolder2 = parametersHolder;
        NetworkWorker networkWorker = (NetworkWorker) parametersHolder2.elementAt(0, androidx.activity.a.f(scope2, "$this$single", parametersHolder2, "<name for destructuring parameter 0>", NetworkWorker.class));
        return new FetchTermsByNameUseCase((TermsRepository) scope2.get(Reflection.getOrCreateKotlinClass(TermsRepository.class), null, null), (DocumentsRepository) scope2.get(Reflection.getOrCreateKotlinClass(DocumentsRepository.class), null, new p0(networkWorker)));
    }
}
