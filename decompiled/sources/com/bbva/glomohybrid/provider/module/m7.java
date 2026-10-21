package com.bbva.glomohybrid.provider.module;

import com.bbva.cells.component.kit.datamanager.DataManager;
import com.bbva.component.dm.akamai.interceptor.AkamaiInterceptorDataManager;
import com.bbva.component.dm.headers.interceptor.HeadersInterceptorDataManager;
import com.bbva.glomohybrid.base.webApp.WebAppConstants;
import com.bbva.glomohybrid.base.webApp.WebAppDedicatedPlugins;
import com.bbva.glomohybrid.base.webApp.WebAppPluginsProvider;
import com.bbva.glomohybrid.documents.common.FileUseCaseFactory;
import com.bbva.network.NetworkWorker;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.instance.ScopedInstanceFactory;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.dsl.DefinitionBindingKt;
import org.koin.dsl.ScopeDSL;

/* JADX INFO: compiled from: WebAppDependenciesModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nWebAppDependenciesModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebAppDependenciesModule.kt\ncom/bbva/glomohybrid/provider/module/WebAppDependenciesModuleKt$webAppDependenciesModule$1$1\n+ 2 ScopeDSL.kt\norg/koin/dsl/ScopeDSL\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n*L\n1#1,62:1\n32#2,5:63\n37#2,2:84\n32#2,5:86\n37#2,2:107\n32#2,5:109\n37#2,2:130\n36#2:132\n37#2,2:149\n36#2:151\n37#2,2:168\n32#2,5:170\n37#2,2:191\n226#3:68\n227#3:83\n226#3:91\n227#3:106\n226#3:114\n227#3:129\n226#3:133\n227#3:148\n226#3:152\n227#3:167\n226#3:175\n227#3:190\n105#4,14:69\n105#4,14:92\n105#4,14:115\n105#4,14:134\n105#4,14:153\n105#4,14:176\n*S KotlinDebug\n*F\n+ 1 WebAppDependenciesModule.kt\ncom/bbva/glomohybrid/provider/module/WebAppDependenciesModuleKt$webAppDependenciesModule$1$1\n*L\n27#1:63,5\n27#1:84,2\n31#1:86,5\n31#1:107,2\n40#1:109,5\n40#1:130,2\n44#1:132\n44#1:149,2\n48#1:151\n48#1:168,2\n52#1:170,5\n52#1:191,2\n27#1:68\n27#1:83\n31#1:91\n31#1:106\n40#1:114\n40#1:129\n44#1:133\n44#1:148\n48#1:152\n48#1:167\n52#1:175\n52#1:190\n27#1:69,14\n31#1:92,14\n40#1:115,14\n44#1:134,14\n48#1:153,14\n52#1:176,14\n*E\n"})
public final class m7 extends Lambda implements Function1<ScopeDSL, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final m7 f34116p0 = new m7(1);

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ScopeDSL scopeDSL) {
        ScopeDSL scope = scopeDSL;
        Intrinsics.checkNotNullParameter(scope, "$this$scope");
        g7 g7Var = g7.f34062p0;
        Qualifier scopeQualifier = scope.getScopeQualifier();
        Kind kind = Kind.Scoped;
        ScopedInstanceFactory scopedInstanceFactory = new ScopedInstanceFactory(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(NetworkWorker.class), null, g7Var, kind, CollectionsKt__CollectionsKt.emptyList()));
        scope.getModule().indexPrimaryType(scopedInstanceFactory);
        new KoinDefinition(scope.getModule(), scopedInstanceFactory);
        h7 h7Var = h7.f34071p0;
        ScopedInstanceFactory scopedInstanceFactory2 = new ScopedInstanceFactory(new BeanDefinition(scope.getScopeQualifier(), Reflection.getOrCreateKotlinClass(WebAppDedicatedPlugins.class), null, h7Var, kind, CollectionsKt__CollectionsKt.emptyList()));
        scope.getModule().indexPrimaryType(scopedInstanceFactory2);
        DefinitionBindingKt.bind(new KoinDefinition(scope.getModule(), scopedInstanceFactory2), Reflection.getOrCreateKotlinClass(WebAppDedicatedPlugins.class));
        i7 i7Var = i7.f34080p0;
        ScopedInstanceFactory scopedInstanceFactory3 = new ScopedInstanceFactory(new BeanDefinition(scope.getScopeQualifier(), Reflection.getOrCreateKotlinClass(FileUseCaseFactory.class), null, i7Var, kind, CollectionsKt__CollectionsKt.emptyList()));
        scope.getModule().indexPrimaryType(scopedInstanceFactory3);
        DefinitionBindingKt.bind(new KoinDefinition(scope.getModule(), scopedInstanceFactory3), Reflection.getOrCreateKotlinClass(FileUseCaseFactory.class));
        StringQualifier stringQualifierNamed = QualifierKt.named(WebAppConstants.KEY_SCOPE_AKAMAI_DM);
        j7 j7Var = j7.f34089p0;
        ScopedInstanceFactory scopedInstanceFactory4 = new ScopedInstanceFactory(new BeanDefinition(scope.getScopeQualifier(), Reflection.getOrCreateKotlinClass(AkamaiInterceptorDataManager.class), stringQualifierNamed, j7Var, kind, CollectionsKt__CollectionsKt.emptyList()));
        scope.getModule().indexPrimaryType(scopedInstanceFactory4);
        DefinitionBindingKt.bind(new KoinDefinition(scope.getModule(), scopedInstanceFactory4), Reflection.getOrCreateKotlinClass(DataManager.class));
        StringQualifier stringQualifierNamed2 = QualifierKt.named(WebAppConstants.KEY_SCOPE_HEADERS_DM);
        k7 k7Var = k7.f34098p0;
        ScopedInstanceFactory scopedInstanceFactory5 = new ScopedInstanceFactory(new BeanDefinition(scope.getScopeQualifier(), Reflection.getOrCreateKotlinClass(HeadersInterceptorDataManager.class), stringQualifierNamed2, k7Var, kind, CollectionsKt__CollectionsKt.emptyList()));
        scope.getModule().indexPrimaryType(scopedInstanceFactory5);
        DefinitionBindingKt.bind(new KoinDefinition(scope.getModule(), scopedInstanceFactory5), Reflection.getOrCreateKotlinClass(DataManager.class));
        l7 l7Var = l7.f34107p0;
        ScopedInstanceFactory scopedInstanceFactory6 = new ScopedInstanceFactory(new BeanDefinition(scope.getScopeQualifier(), Reflection.getOrCreateKotlinClass(WebAppPluginsProvider.class), null, l7Var, kind, CollectionsKt__CollectionsKt.emptyList()));
        scope.getModule().indexPrimaryType(scopedInstanceFactory6);
        new KoinDefinition(scope.getModule(), scopedInstanceFactory6);
        return Unit.INSTANCE;
    }
}
