package org.koin.androidx.fragment.dsl;

import androidx.appcompat.app.i;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import java.util.List;
import kotlin.Deprecated;
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
import org.koin.core.scope.Scope;
import org.koin.dsl.ScopeDSL;

/* JADX INFO: compiled from: ScopeSetExt.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a+\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0087\b\u001aY\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062)\b\b\u0010\u0007\u001a#\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002H\u00020\bj\b\u0012\u0004\u0012\u0002H\u0002`\u000b¢\u0006\u0002\b\fH\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\r"}, d2 = {"fragment", "Lorg/koin/core/definition/KoinDefinition;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/fragment/app/Fragment;", "Lorg/koin/dsl/ScopeDSL;", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "definition", "Lkotlin/Function2;", "Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "Lorg/koin/core/definition/Definition;", "Lkotlin/ExtensionFunctionType;", "koin-android_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension({"SMAP\nScopeSetExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScopeSetExt.kt\norg/koin/androidx/fragment/dsl/ScopeSetExtKt\n+ 2 ScopeDSL.kt\norg/koin/dsl/ScopeDSL\n+ 3 Module.kt\norg/koin/core/module/Module\n+ 4 Module.kt\norg/koin/core/module/ModuleKt\n+ 5 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n*L\n1#1,45:1\n45#2:46\n45#2:66\n160#3:47\n161#3,2:64\n160#3:67\n161#3,2:84\n160#3:86\n161#3,2:89\n216#4:48\n217#4:63\n216#4:68\n217#4:83\n216#4,2:87\n105#5,14:49\n105#5,14:69\n*S KotlinDebug\n*F\n+ 1 ScopeSetExt.kt\norg/koin/androidx/fragment/dsl/ScopeSetExtKt\n*L\n38#1:46\n44#1:66\n38#1:47\n38#1:64,2\n44#1:67\n44#1:84,2\n44#1:86\n44#1:89,2\n38#1:48\n38#1:63\n44#1:68\n44#1:83\n44#1:87,2\n38#1:49,14\n44#1:69,14\n*E\n"})
public final class ScopeSetExtKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: org.koin.androidx.fragment.dsl.ScopeSetExtKt$fragment$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScopeSetExt.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/fragment/app/Fragment;", "Lorg/koin/core/scope/Scope;", "it", "Lorg/koin/core/parameter/ParametersHolder;", "invoke", "(Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)Landroidx/fragment/app/Fragment;"}, k = 3, mv = {1, 5, 1}, xi = 176)
    @SourceDebugExtension({"SMAP\nScopeSetExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScopeSetExt.kt\norg/koin/androidx/fragment/dsl/ScopeSetExtKt$fragment$1\n+ 2 InstanceBuilder.kt\norg/koin/core/instance/InstanceBuilderKt\n*L\n1#1,45:1\n17#2:46\n*S KotlinDebug\n*F\n+ 1 ScopeSetExt.kt\norg/koin/androidx/fragment/dsl/ScopeSetExtKt$fragment$1\n*L\n44#1:46\n*E\n"})
    public static final class AnonymousClass1<T> extends Lambda implements Function2<Scope, ParametersHolder, T> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(2);
        }

        /* JADX WARN: Incorrect return type in method signature: (Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)TT; */
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final Fragment invoke(@NotNull Scope factory, @NotNull ParametersHolder it) {
            Intrinsics.checkNotNullParameter(factory, "$this$factory");
            Intrinsics.checkNotNullParameter(it, "it");
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            return (Fragment) InstanceBuilderKt.newInstance(factory, Reflection.getOrCreateKotlinClass(Object.class), it);
        }
    }

    @Deprecated(message = "API is deprecated in favor of fragmentOf DSL")
    @KoinReflectAPI
    public static final /* synthetic */ <T extends Fragment> KoinDefinition<T> fragment(ScopeDSL scopeDSL, Qualifier qualifier) {
        Intrinsics.checkNotNullParameter(scopeDSL, "<this>");
        Intrinsics.needClassReification();
        AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        Module module = scopeDSL.getModule();
        Qualifier scopeQualifier = scopeDSL.getScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return new KoinDefinition<>(module, i.e(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier, anonymousClass1, kind, listEmptyList), module));
    }

    public static /* synthetic */ KoinDefinition fragment$default(ScopeDSL scopeDSL, Qualifier qualifier, Function2 definition, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            qualifier = null;
        }
        Qualifier qualifier2 = qualifier;
        Intrinsics.checkNotNullParameter(scopeDSL, "<this>");
        Intrinsics.checkNotNullParameter(definition, "definition");
        Module module = scopeDSL.getModule();
        Qualifier scopeQualifier = scopeDSL.getScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return new KoinDefinition(module, i.e(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier2, definition, kind, listEmptyList), module));
    }

    public static final /* synthetic */ <T extends Fragment> KoinDefinition<T> fragment(ScopeDSL scopeDSL, Qualifier qualifier, Function2<? super Scope, ? super ParametersHolder, ? extends T> definition) {
        Intrinsics.checkNotNullParameter(scopeDSL, "<this>");
        Intrinsics.checkNotNullParameter(definition, "definition");
        Module module = scopeDSL.getModule();
        Qualifier scopeQualifier = scopeDSL.getScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return new KoinDefinition<>(module, i.e(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier, definition, kind, listEmptyList), module));
    }

    public static /* synthetic */ KoinDefinition fragment$default(ScopeDSL scopeDSL, Qualifier qualifier, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            qualifier = null;
        }
        Qualifier qualifier2 = qualifier;
        Intrinsics.checkNotNullParameter(scopeDSL, "<this>");
        Intrinsics.needClassReification();
        AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        Module module = scopeDSL.getModule();
        Qualifier scopeQualifier = scopeDSL.getScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return new KoinDefinition(module, i.e(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier2, anonymousClass1, kind, listEmptyList), module));
    }
}
