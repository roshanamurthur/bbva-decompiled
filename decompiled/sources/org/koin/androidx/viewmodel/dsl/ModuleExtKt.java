package org.koin.androidx.viewmodel.dsl;

import androidx.appcompat.app.i;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.koin.core.annotation.KoinReflectAPI;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.instance.InstanceBuilderKt;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: ModuleExt.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a+\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0087\b\u001aY\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062)\b\b\u0010\u0007\u001a#\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002H\u00020\bj\b\u0012\u0004\u0012\u0002H\u0002`\u000b¢\u0006\u0002\b\fH\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\r"}, d2 = {"viewModel", "Lorg/koin/core/definition/KoinDefinition;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "Lorg/koin/core/module/Module;", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "definition", "Lkotlin/Function2;", "Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "Lorg/koin/core/definition/Definition;", "Lkotlin/ExtensionFunctionType;", "koin-android_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension({"SMAP\nModuleExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModuleExt.kt\norg/koin/androidx/viewmodel/dsl/ModuleExtKt\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n*L\n1#1,48:1\n151#2,10:49\n161#2,2:75\n151#2,10:77\n161#2,2:103\n151#2,10:105\n161#2,2:117\n216#3:59\n217#3:74\n216#3:87\n217#3:102\n216#3,2:115\n105#4,14:60\n105#4,14:88\n*S KotlinDebug\n*F\n+ 1 ModuleExt.kt\norg/koin/androidx/viewmodel/dsl/ModuleExtKt\n*L\n39#1:49,10\n39#1:75,2\n46#1:77,10\n46#1:103,2\n46#1:105,10\n46#1:117,2\n39#1:59\n39#1:74\n46#1:87\n46#1:102\n46#1:115,2\n39#1:60,14\n46#1:88,14\n*E\n"})
public final class ModuleExtKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: org.koin.androidx.viewmodel.dsl.ModuleExtKt$viewModel$1, reason: invalid class name */
    /* JADX INFO: compiled from: ModuleExt.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "Lorg/koin/core/scope/Scope;", "it", "Lorg/koin/core/parameter/ParametersHolder;", "invoke", "(Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)Landroidx/lifecycle/ViewModel;"}, k = 3, mv = {1, 5, 1}, xi = 176)
    @SourceDebugExtension({"SMAP\nModuleExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModuleExt.kt\norg/koin/androidx/viewmodel/dsl/ModuleExtKt$viewModel$1\n+ 2 InstanceBuilder.kt\norg/koin/core/instance/InstanceBuilderKt\n*L\n1#1,48:1\n17#2:49\n*S KotlinDebug\n*F\n+ 1 ModuleExt.kt\norg/koin/androidx/viewmodel/dsl/ModuleExtKt$viewModel$1\n*L\n46#1:49\n*E\n"})
    public static final class AnonymousClass1<T> extends Lambda implements Function2<Scope, ParametersHolder, T> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(2);
        }

        /* JADX WARN: Incorrect return type in method signature: (Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)TT; */
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final ViewModel invoke(@NotNull Scope factory, @NotNull ParametersHolder it) {
            Intrinsics.checkNotNullParameter(factory, "$this$factory");
            Intrinsics.checkNotNullParameter(it, "it");
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            return (ViewModel) InstanceBuilderKt.newInstance(factory, Reflection.getOrCreateKotlinClass(Object.class), it);
        }
    }

    @KoinReflectAPI
    public static final /* synthetic */ <T extends ViewModel> KoinDefinition<T> viewModel(Module module, Qualifier qualifier) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.needClassReification();
        AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return new KoinDefinition<>(module, i.e(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier, anonymousClass1, kind, listEmptyList), module));
    }

    public static /* synthetic */ KoinDefinition viewModel$default(Module module, Qualifier qualifier, Function2 definition, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            qualifier = null;
        }
        Qualifier qualifier2 = qualifier;
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(definition, "definition");
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return new KoinDefinition(module, i.e(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier2, definition, kind, listEmptyList), module));
    }

    public static final /* synthetic */ <T extends ViewModel> KoinDefinition<T> viewModel(Module module, Qualifier qualifier, Function2<? super Scope, ? super ParametersHolder, ? extends T> definition) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(definition, "definition");
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return new KoinDefinition<>(module, i.e(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier, definition, kind, listEmptyList), module));
    }

    public static /* synthetic */ KoinDefinition viewModel$default(Module module, Qualifier qualifier, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            qualifier = null;
        }
        Qualifier qualifier2 = qualifier;
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.needClassReification();
        AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return new KoinDefinition(module, i.e(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier2, anonymousClass1, kind, listEmptyList), module));
    }
}
