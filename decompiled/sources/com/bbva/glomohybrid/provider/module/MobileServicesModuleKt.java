package com.bbva.glomohybrid.provider.module;

import com.bbva.actionlauncher.model.PlatformType;
import com.bbva.glomohybrid.cellsweb.presentation.view.CellsWebActivity;
import com.bbva.glomoutils.mobileservices.MobileServices;
import com.bbva.glomoutils.mobileservices.craslytics.CrashReporter;
import com.bbva.glomoutils.mobileservices.craslytics.Crashlytics;
import com.bbva.plugin.geolocation.manager.Locator;
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
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.qualifier.TypeQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.dsl.DefinitionBindingKt;
import org.koin.dsl.ModuleDSLKt;

/* JADX INFO: compiled from: MobileServicesModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lorg/koin/core/module/Module;", "a", "Lorg/koin/core/module/Module;", "getMobileServices", "()Lorg/koin/core/module/Module;", "mobileServices", "app_mexicoProdGoogleRelease"}, k = 2, mv = {1, 9, 0})
public final class MobileServicesModuleKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Module f33977a = ModuleDSLKt.module$default(false, a.f33978p0, 1, null);

    /* JADX INFO: compiled from: MobileServicesModule.kt */
    @SourceDebugExtension({"SMAP\nMobileServicesModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MobileServicesModule.kt\ncom/bbva/glomohybrid/provider/module/MobileServicesModuleKt$mobileServices$1\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n+ 5 Qualifier.kt\norg/koin/core/qualifier/QualifierKt\n*L\n1#1,33:1\n103#2,6:34\n109#2,5:61\n147#2,14:66\n161#2,2:96\n103#2,6:98\n109#2,5:125\n103#2,6:130\n109#2,5:157\n147#2,14:162\n161#2,2:192\n201#3,6:40\n207#3:60\n216#3:80\n217#3:95\n201#3,6:104\n207#3:124\n201#3,6:136\n207#3:156\n216#3:176\n217#3:191\n105#4,14:46\n105#4,14:81\n105#4,14:110\n105#4,14:142\n105#4,14:177\n43#5:194\n*S KotlinDebug\n*F\n+ 1 MobileServicesModule.kt\ncom/bbva/glomohybrid/provider/module/MobileServicesModuleKt$mobileServices$1\n*L\n21#1:34,6\n21#1:61,5\n22#1:66,14\n22#1:96,2\n23#1:98,6\n23#1:125,5\n24#1:130,6\n24#1:157,5\n25#1:162,14\n25#1:192,2\n21#1:40,6\n21#1:60\n22#1:80\n22#1:95\n23#1:104,6\n23#1:124\n24#1:136,6\n24#1:156\n25#1:176\n25#1:191\n21#1:46,14\n22#1:81,14\n23#1:110,14\n24#1:142,14\n25#1:177,14\n27#1:194\n*E\n"})
    public static final class a extends Lambda implements Function1<Module, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f33978p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Module module) {
            Module module2 = module;
            Intrinsics.checkNotNullParameter(module2, "$this$module");
            r4 r4Var = r4.f34154p0;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
            Kind kind = Kind.Singleton;
            SingleInstanceFactory<?> singleInstanceFactoryF = androidx.appcompat.view.menu.b.f(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Crashlytics.class), null, r4Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module2, singleInstanceFactoryF), Reflection.getOrCreateKotlinClass(Crashlytics.class));
            s4 s4Var = s4.f34163p0;
            StringQualifier rootScopeQualifier2 = companion.getRootScopeQualifier();
            Kind kind2 = Kind.Factory;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(rootScopeQualifier2, Reflection.getOrCreateKotlinClass(CrashReporter.class), null, s4Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2));
            t4 t4Var = t4.f34171p0;
            SingleInstanceFactory<?> singleInstanceFactoryF2 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(MobileServices.class), null, t4Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF2);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module2, singleInstanceFactoryF2), Reflection.getOrCreateKotlinClass(MobileServices.class));
            u4 u4Var = u4.f34179p0;
            SingleInstanceFactory<?> singleInstanceFactoryF3 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(PlatformType.class), null, u4Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF3);
            }
            new KoinDefinition(module2, singleInstanceFactoryF3);
            v4 v4Var = v4.f34187p0;
            DefinitionBindingKt.bind(new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(Locator.class), null, v4Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2)), Reflection.getOrCreateKotlinClass(Locator.class));
            module2.scope(new TypeQualifier(Reflection.getOrCreateKotlinClass(CellsWebActivity.class)), x4.f34203p0);
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final Module getMobileServices() {
        return f33977a;
    }
}
