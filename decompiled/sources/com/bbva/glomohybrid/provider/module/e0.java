package com.bbva.glomohybrid.provider.module;

import com.bbva.glomoconfig.GlobalConfig;
import com.bbva.glomohybrid.documents.common.repository.TermsRepository;
import com.bbva.glomohybrid.documents.component.TermsDataManager;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: ArchitectureModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nArchitectureModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchitectureModule.kt\ncom/bbva/glomohybrid/provider/module/ArchitectureModuleKt$filesModule$1$11\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,298:1\n129#2,5:299\n129#2,5:304\n*S KotlinDebug\n*F\n+ 1 ArchitectureModule.kt\ncom/bbva/glomohybrid/provider/module/ArchitectureModuleKt$filesModule$1$11\n*L\n275#1:299,5\n276#1:304,5\n*E\n"})
public final class e0 extends Lambda implements Function2<Scope, ParametersHolder, TermsDataManager> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final e0 f34037p0 = new e0(2);

    @Override // kotlin.jvm.functions.Function2
    public final TermsDataManager invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope scope2 = scope;
        GlobalConfig globalConfig = (GlobalConfig) scope2.get(androidx.activity.a.f(scope2, "$this$factory", parametersHolder, "it", GlobalConfig.class), null, null);
        TermsDataManager termsDataManager = new TermsDataManager((TermsRepository) scope2.get(Reflection.getOrCreateKotlinClass(TermsRepository.class), null, null));
        termsDataManager.setProperty("host", globalConfig.getHost());
        termsDataManager.setProperty("path", globalConfig.getPaths().get("documents"));
        termsDataManager.applyChanges();
        return termsDataManager;
    }
}
