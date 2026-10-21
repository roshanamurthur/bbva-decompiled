package com.bbva.glomohybrid.provider.modules;

import com.bbva.glomohybrid.qrscanner.customenroll.viewmodel.QrCodiViewModel;
import com.bbva.glomohybrid.qrscanner.customenroll.viewmodel.QrReaderViewModel;
import com.bbva.glomohybrid.qrscanner.viewmodel.QrNavigationViewModel;
import com.bbva.glomohybrid.qrscanner.viewmodel.QrToolbarViewModel;
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
import org.koin.core.module.Module;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.dsl.DefinitionBindingKt;
import org.koin.dsl.ModuleDSLKt;

/* JADX INFO: compiled from: QrModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lorg/koin/core/module/Module;", "a", "Lorg/koin/core/module/Module;", "getQrModule", "()Lorg/koin/core/module/Module;", "qrModule", "app_mexicoProdGoogleRelease"}, k = 2, mv = {1, 9, 0})
public final class QrModuleKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Module f34250a = ModuleDSLKt.module$default(false, a.f34251p0, 1, null);

    /* JADX INFO: compiled from: QrModule.kt */
    @SourceDebugExtension({"SMAP\nQrModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QrModule.kt\ncom/bbva/glomohybrid/provider/modules/QrModuleKt$qrModule$1\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n*L\n1#1,23:1\n147#2,14:24\n161#2,2:54\n147#2,14:56\n161#2,2:86\n147#2,14:88\n161#2,2:118\n216#3:38\n217#3:53\n216#3:70\n217#3:85\n216#3:102\n217#3:117\n105#4,14:39\n105#4,14:71\n105#4,14:103\n*S KotlinDebug\n*F\n+ 1 QrModule.kt\ncom/bbva/glomohybrid/provider/modules/QrModuleKt$qrModule$1\n*L\n11#1:24,14\n11#1:54,2\n15#1:56,14\n15#1:86,2\n19#1:88,14\n19#1:118,2\n11#1:38\n11#1:53\n15#1:70\n15#1:85\n19#1:102\n19#1:117\n11#1:39,14\n15#1:71,14\n19#1:103,14\n*E\n"})
    public static final class a extends Lambda implements Function1<Module, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f34251p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Module module) {
            Module module2 = module;
            Intrinsics.checkNotNullParameter(module2, "$this$module");
            w1 w1Var = w1.f34354p0;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
            Kind kind = Kind.Factory;
            DefinitionBindingKt.bind(new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(QrReaderViewModel.class), null, w1Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2)), Reflection.getOrCreateKotlinClass(QrReaderViewModel.class));
            x1 x1Var = x1.f34357p0;
            DefinitionBindingKt.bind(new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(QrCodiViewModel.class), null, x1Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2)), Reflection.getOrCreateKotlinClass(QrNavigationViewModel.class));
            y1 y1Var = y1.f34360p0;
            DefinitionBindingKt.bind(new KoinDefinition(module2, androidx.appcompat.app.i.e(new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(QrToolbarViewModel.class), null, y1Var, kind, CollectionsKt__CollectionsKt.emptyList()), module2)), Reflection.getOrCreateKotlinClass(QrToolbarViewModel.class));
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final Module getQrModule() {
        return f34250a;
    }
}
