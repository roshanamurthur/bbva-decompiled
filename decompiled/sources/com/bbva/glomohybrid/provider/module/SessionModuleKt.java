package com.bbva.glomohybrid.provider.module;

import com.bbva.glomohybrid.base.session.SessionTokenGenerator;
import com.bbva.glomohybrid.session.observers.CrashlyticsTokenObserver;
import com.bbva.network.interceptor.NetworkInterceptor;
import com.bbva.session.component.SessionTracingInterceptor;
import com.bbva.session.domain.observers.SessionTokenObserver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.dsl.DefinitionBindingKt;
import org.koin.dsl.ModuleDSLKt;

/* JADX INFO: compiled from: SessionModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lorg/koin/core/qualifier/StringQualifier;", "a", "Lorg/koin/core/qualifier/StringQualifier;", "getMonitoredSessionHost", "()Lorg/koin/core/qualifier/StringQualifier;", "monitoredSessionHost", "Lorg/koin/core/module/Module;", "b", "Lorg/koin/core/module/Module;", "getSessionTracingModule", "()Lorg/koin/core/module/Module;", "sessionTracingModule", "app_mexicoProdGoogleRelease"}, k = 2, mv = {1, 9, 0})
public final class SessionModuleKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final StringQualifier f33993a = QualifierKt.named("monitoredHost");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Module f33994b = ModuleDSLKt.module$default(false, a.f33995p0, 1, null);

    /* JADX INFO: compiled from: SessionModule.kt */
    @SourceDebugExtension({"SMAP\nSessionModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SessionModule.kt\ncom/bbva/glomohybrid/provider/module/SessionModuleKt$sessionTracingModule$1\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n*L\n1#1,35:1\n103#2,6:36\n109#2,5:63\n147#2,14:68\n161#2,2:98\n103#2,6:100\n109#2,5:127\n201#3,6:42\n207#3:62\n216#3:82\n217#3:97\n201#3,6:106\n207#3:126\n105#4,14:48\n105#4,14:83\n105#4,14:112\n*S KotlinDebug\n*F\n+ 1 SessionModule.kt\ncom/bbva/glomohybrid/provider/module/SessionModuleKt$sessionTracingModule$1\n*L\n17#1:36,6\n17#1:63,5\n21#1:68,14\n21#1:98,2\n25#1:100,6\n25#1:127,5\n17#1:42,6\n17#1:62\n21#1:82\n21#1:97\n25#1:106,6\n25#1:126\n17#1:48,14\n21#1:83,14\n25#1:112,14\n*E\n"})
    public static final class a extends Lambda implements Function1<Module, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f33995p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Module module) {
            Module module2 = module;
            Intrinsics.checkNotNullParameter(module2, "$this$module");
            c7 c7Var = c7.f34026p0;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
            Kind kind = Kind.Singleton;
            SingleInstanceFactory<?> singleInstanceFactoryF = androidx.appcompat.view.menu.b.f(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(SessionTracingInterceptor.class), null, c7Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF);
            }
            DefinitionBindingKt.binds(new KoinDefinition(module2, singleInstanceFactoryF), new KClass[]{Reflection.getOrCreateKotlinClass(SessionTokenObserver.class), Reflection.getOrCreateKotlinClass(NetworkInterceptor.class)});
            DefinitionBindingKt.bind(new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(CrashlyticsTokenObserver.class), null, d7.f34035p0, Kind.Factory, CollectionsKt__CollectionsKt.emptyList()), module2)), Reflection.getOrCreateKotlinClass(SessionTokenObserver.class));
            SingleInstanceFactory<?> singleInstanceFactoryF2 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(SessionTokenGenerator.class), null, e7.f34044p0, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF2);
            }
            new KoinDefinition(module2, singleInstanceFactoryF2);
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final StringQualifier getMonitoredSessionHost() {
        return f33993a;
    }

    @NotNull
    public static final Module getSessionTracingModule() {
        return f33994b;
    }
}
