package com.bbva.glomohybrid.provider.module;

import com.bbva.ethermobile.elogger.DefaultLoggerHandler;
import com.bbva.ethermobile.elogger.LoggerHandler;
import com.bbva.glomohybrid.logs.LoggerHandlerGroup;
import com.bbva.glomohybrid.logs.handler.CrashlyticsHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
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

/* JADX INFO: compiled from: LogModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lorg/koin/core/qualifier/StringQualifier;", "a", "Lorg/koin/core/qualifier/StringQualifier;", "getLogHandlers", "()Lorg/koin/core/qualifier/StringQualifier;", "logHandlers", "Lorg/koin/core/module/Module;", "b", "Lorg/koin/core/module/Module;", "getLogModule", "()Lorg/koin/core/module/Module;", "logModule", "app_mexicoProdGoogleRelease"}, k = 2, mv = {1, 9, 0})
public final class LogModuleKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final StringQualifier f33972a = QualifierKt.named("logHandlers");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Module f33973b = ModuleDSLKt.module$default(false, a.f33974p0, 1, null);

    /* JADX INFO: compiled from: LogModule.kt */
    @SourceDebugExtension({"SMAP\nLogModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LogModule.kt\ncom/bbva/glomohybrid/provider/module/LogModuleKt$logModule$1\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n*L\n1#1,27:1\n103#2,6:28\n109#2,5:55\n103#2,6:60\n109#2,5:87\n103#2,6:92\n109#2,5:119\n201#3,6:34\n207#3:54\n201#3,6:66\n207#3:86\n201#3,6:98\n207#3:118\n105#4,14:40\n105#4,14:72\n105#4,14:104\n*S KotlinDebug\n*F\n+ 1 LogModule.kt\ncom/bbva/glomohybrid/provider/module/LogModuleKt$logModule$1\n*L\n17#1:28,6\n17#1:55,5\n21#1:60,6\n21#1:87,5\n23#1:92,6\n23#1:119,5\n17#1:34,6\n17#1:54\n21#1:66,6\n21#1:86\n23#1:98,6\n23#1:118\n17#1:40,14\n21#1:72,14\n23#1:104,14\n*E\n"})
    public static final class a extends Lambda implements Function1<Module, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f33974p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Module module) {
            Module module2 = module;
            Intrinsics.checkNotNullParameter(module2, "$this$module");
            a4 a4Var = a4.f34005p0;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
            Kind kind = Kind.Singleton;
            SingleInstanceFactory<?> singleInstanceFactoryF = androidx.appcompat.view.menu.b.f(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(DefaultLoggerHandler.class), null, a4Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module2, singleInstanceFactoryF), Reflection.getOrCreateKotlinClass(LoggerHandler.class));
            b4 b4Var = b4.f34014p0;
            SingleInstanceFactory<?> singleInstanceFactoryF2 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(CrashlyticsHandler.class), null, b4Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF2);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module2, singleInstanceFactoryF2), Reflection.getOrCreateKotlinClass(LoggerHandler.class));
            StringQualifier logHandlers = LogModuleKt.getLogHandlers();
            c4 c4Var = c4.f34023p0;
            SingleInstanceFactory<?> singleInstanceFactoryF3 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(LoggerHandlerGroup.class), logHandlers, c4Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF3);
            }
            new KoinDefinition(module2, singleInstanceFactoryF3);
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final StringQualifier getLogHandlers() {
        return f33972a;
    }

    @NotNull
    public static final Module getLogModule() {
        return f33973b;
    }
}
