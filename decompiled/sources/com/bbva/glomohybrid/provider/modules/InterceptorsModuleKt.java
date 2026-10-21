package com.bbva.glomohybrid.provider.modules;

import com.bbva.component.dm.akamai.interceptor.AkamaiInterceptorDataManager;
import com.bbva.component.dm.anonymous.AnonymousInterceptorDataManager;
import com.bbva.component.dm.header.customers.CustomerInterceptorDataManager;
import com.bbva.component.dm.headers.interceptor.HeadersInterceptorDataManager;
import com.bbva.component.dm.security.SecurityInterceptor;
import com.bbva.component.ic.security.SecurityDataManager;
import com.bbva.component.request.behavior.HandlePublicZoneHeadersBehavior;
import com.bbva.component.request.header.customerid.CustomerIdInterceptor;
import com.bbva.component.request.header.deviceid.DeviceIdInterceptor;
import com.bbva.component.request.header.deviceid.HeadersProvider;
import com.bbva.component.request.header.flowmeter.FlowmeterInterceptor;
import com.bbva.component.request.header.standin.StandInHeaderInterceptor;
import com.bbva.component.request.headers.HeaderInterceptor;
import com.bbva.glomohybrid.interceptors.HeadersMexicoProvider;
import com.bbva.network.interceptor.NetworkInterceptor;
import java.util.Map;
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

/* JADX INFO: compiled from: InterceptorsModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lorg/koin/core/module/Module;", "a", "Lorg/koin/core/module/Module;", "getInterceptorsConfigurationModule", "()Lorg/koin/core/module/Module;", "interceptorsConfigurationModule", "app_mexicoProdGoogleRelease"}, k = 2, mv = {1, 9, 0})
public final class InterceptorsModuleKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Module f34239a = ModuleDSLKt.module$default(false, a.f34240p0, 1, null);

    /* JADX INFO: compiled from: InterceptorsModule.kt */
    @SourceDebugExtension({"SMAP\nInterceptorsModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InterceptorsModule.kt\ncom/bbva/glomohybrid/provider/modules/InterceptorsModuleKt$interceptorsConfigurationModule$1\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n*L\n1#1,294:1\n103#2,6:295\n109#2,5:322\n103#2,6:327\n109#2,5:354\n103#2,6:359\n109#2,5:386\n151#2,10:391\n161#2,2:417\n151#2,10:419\n161#2,2:445\n151#2,10:447\n161#2,2:473\n103#2,6:475\n109#2,5:502\n103#2,6:507\n109#2,5:534\n103#2,6:539\n109#2,5:566\n103#2,6:571\n109#2,5:598\n147#2,14:603\n161#2,2:633\n147#2,14:635\n161#2,2:665\n147#2,14:667\n161#2,2:697\n103#2,6:699\n109#2,5:726\n103#2,6:731\n109#2,5:758\n103#2,6:763\n109#2,5:790\n151#2,10:795\n161#2,2:821\n151#2,10:823\n161#2,2:849\n147#2,14:851\n161#2,2:881\n201#3,6:301\n207#3:321\n201#3,6:333\n207#3:353\n201#3,6:365\n207#3:385\n216#3:401\n217#3:416\n216#3:429\n217#3:444\n216#3:457\n217#3:472\n201#3,6:481\n207#3:501\n201#3,6:513\n207#3:533\n201#3,6:545\n207#3:565\n201#3,6:577\n207#3:597\n216#3:617\n217#3:632\n216#3:649\n217#3:664\n216#3:681\n217#3:696\n201#3,6:705\n207#3:725\n201#3,6:737\n207#3:757\n201#3,6:769\n207#3:789\n216#3:805\n217#3:820\n216#3:833\n217#3:848\n216#3:865\n217#3:880\n105#4,14:307\n105#4,14:339\n105#4,14:371\n105#4,14:402\n105#4,14:430\n105#4,14:458\n105#4,14:487\n105#4,14:519\n105#4,14:551\n105#4,14:583\n105#4,14:618\n105#4,14:650\n105#4,14:682\n105#4,14:711\n105#4,14:743\n105#4,14:775\n105#4,14:806\n105#4,14:834\n105#4,14:866\n*S KotlinDebug\n*F\n+ 1 InterceptorsModule.kt\ncom/bbva/glomohybrid/provider/modules/InterceptorsModuleKt$interceptorsConfigurationModule$1\n*L\n37#1:295,6\n37#1:322,5\n44#1:327,6\n44#1:354,5\n51#1:359,6\n51#1:386,5\n58#1:391,10\n58#1:417,2\n103#1:419,10\n103#1:445,2\n118#1:447,10\n118#1:473,2\n131#1:475,6\n131#1:502,5\n149#1:507,6\n149#1:534,5\n161#1:539,6\n161#1:566,5\n177#1:571,6\n177#1:598,5\n189#1:603,14\n189#1:633,2\n216#1:635,14\n216#1:665,2\n228#1:667,14\n228#1:697,2\n245#1:699,6\n245#1:726,5\n249#1:731,6\n249#1:758,5\n256#1:763,6\n256#1:790,5\n263#1:795,10\n263#1:821,2\n272#1:823,10\n272#1:849,2\n284#1:851,14\n284#1:881,2\n37#1:301,6\n37#1:321\n44#1:333,6\n44#1:353\n51#1:365,6\n51#1:385\n58#1:401\n58#1:416\n103#1:429\n103#1:444\n118#1:457\n118#1:472\n131#1:481,6\n131#1:501\n149#1:513,6\n149#1:533\n161#1:545,6\n161#1:565\n177#1:577,6\n177#1:597\n189#1:617\n189#1:632\n216#1:649\n216#1:664\n228#1:681\n228#1:696\n245#1:705,6\n245#1:725\n249#1:737,6\n249#1:757\n256#1:769,6\n256#1:789\n263#1:805\n263#1:820\n272#1:833\n272#1:848\n284#1:865\n284#1:880\n37#1:307,14\n44#1:339,14\n51#1:371,14\n58#1:402,14\n103#1:430,14\n118#1:458,14\n131#1:487,14\n149#1:519,14\n161#1:551,14\n177#1:583,14\n189#1:618,14\n216#1:650,14\n228#1:682,14\n245#1:711,14\n249#1:743,14\n256#1:775,14\n263#1:806,14\n272#1:834,14\n284#1:866,14\n*E\n"})
    public static final class a extends Lambda implements Function1<Module, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f34240p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Module module) {
            Module module2 = module;
            Intrinsics.checkNotNullParameter(module2, "$this$module");
            w0 w0Var = w0.f34353p0;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
            Kind kind = Kind.Singleton;
            SingleInstanceFactory<?> singleInstanceFactoryF = androidx.appcompat.view.menu.b.f(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(HeadersInterceptorDataManager.class), null, w0Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF);
            }
            new KoinDefinition(module2, singleInstanceFactoryF);
            x0 x0Var = x0.f34356p0;
            SingleInstanceFactory<?> singleInstanceFactoryF2 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(SecurityDataManager.class), null, x0Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF2);
            }
            new KoinDefinition(module2, singleInstanceFactoryF2);
            y0 y0Var = y0.f34359p0;
            SingleInstanceFactory<?> singleInstanceFactoryF3 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(AkamaiInterceptorDataManager.class), null, y0Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF3);
            }
            StringQualifier stringQualifierE = com.google.android.gms.measurement.internal.a.e(module2, singleInstanceFactoryF3, HeadersInterceptorDataManager.ID);
            z0 z0Var = z0.f34362p0;
            StringQualifier rootScopeQualifier2 = companion.getRootScopeQualifier();
            Kind kind2 = Kind.Factory;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(rootScopeQualifier2, Reflection.getOrCreateKotlinClass(Map.class), stringQualifierE, z0Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2));
            StringQualifier stringQualifierNamed = QualifierKt.named(AkamaiInterceptorDataManager.ID);
            a1 a1Var = a1.f34264p0;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(Map.class), stringQualifierNamed, a1Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2));
            StringQualifier stringQualifierNamed2 = QualifierKt.named(SecurityDataManager.ID);
            b1 b1Var = b1.f34268p0;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(Map.class), stringQualifierNamed2, b1Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2));
            c1 c1Var = c1.f34272p0;
            SingleInstanceFactory<?> singleInstanceFactoryF4 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(HeaderInterceptor.class), null, c1Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF4);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module2, singleInstanceFactoryF4), Reflection.getOrCreateKotlinClass(NetworkInterceptor.class));
            d1 d1Var = d1.f34276p0;
            SingleInstanceFactory<?> singleInstanceFactoryF5 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(StandInHeaderInterceptor.class), null, d1Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF5);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module2, singleInstanceFactoryF5), Reflection.getOrCreateKotlinClass(NetworkInterceptor.class));
            e1 e1Var = e1.f34280p0;
            SingleInstanceFactory<?> singleInstanceFactoryF6 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(CustomerIdInterceptor.class), null, e1Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF6);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module2, singleInstanceFactoryF6), Reflection.getOrCreateKotlinClass(NetworkInterceptor.class));
            l0 l0Var = l0.f34309p0;
            SingleInstanceFactory<?> singleInstanceFactoryF7 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(HeaderInterceptor.class), null, l0Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF7);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module2, singleInstanceFactoryF7), Reflection.getOrCreateKotlinClass(NetworkInterceptor.class));
            m0 m0Var = m0.f34313p0;
            DefinitionBindingKt.bind(new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(DeviceIdInterceptor.class), null, m0Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2)), Reflection.getOrCreateKotlinClass(NetworkInterceptor.class));
            n0 n0Var = n0.f34317p0;
            DefinitionBindingKt.bind(new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(FlowmeterInterceptor.class), null, n0Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2)), Reflection.getOrCreateKotlinClass(NetworkInterceptor.class));
            o0 o0Var = o0.f34321p0;
            DefinitionBindingKt.bind(new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(SecurityInterceptor.class), null, o0Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2)), Reflection.getOrCreateKotlinClass(NetworkInterceptor.class));
            p0 p0Var = p0.f34325p0;
            SingleInstanceFactory<?> singleInstanceFactoryF8 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(HeadersMexicoProvider.class), null, p0Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF8);
            }
            DefinitionBindingKt.bind(new KoinDefinition(module2, singleInstanceFactoryF8), Reflection.getOrCreateKotlinClass(HeadersProvider.class));
            q0 q0Var = q0.f34329p0;
            SingleInstanceFactory<?> singleInstanceFactoryF9 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(AnonymousInterceptorDataManager.class), null, q0Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF9);
            }
            new KoinDefinition(module2, singleInstanceFactoryF9);
            r0 r0Var = r0.f34334p0;
            SingleInstanceFactory<?> singleInstanceFactoryF10 = androidx.appcompat.view.menu.b.f(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(CustomerInterceptorDataManager.class), null, r0Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2);
            if (module2.get_createdAtStart()) {
                module2.prepareForCreationAtStart(singleInstanceFactoryF10);
            }
            StringQualifier stringQualifierE2 = com.google.android.gms.measurement.internal.a.e(module2, singleInstanceFactoryF10, AnonymousInterceptorDataManager.ID);
            s0 s0Var = s0.f34338p0;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(Map.class), stringQualifierE2, s0Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2));
            StringQualifier stringQualifierNamed3 = QualifierKt.named(CustomerInterceptorDataManager.ID);
            t0 t0Var = t0.f34342p0;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(Map.class), stringQualifierNamed3, t0Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2));
            v0 v0Var = v0.f34350p0;
            new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(HandlePublicZoneHeadersBehavior.class), null, v0Var, kind2, CollectionsKt__CollectionsKt.emptyList()), module2));
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final Module getInterceptorsConfigurationModule() {
        return f34239a;
    }
}
