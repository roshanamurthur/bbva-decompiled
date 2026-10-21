package org.koin.dsl;

import androidx.appcompat.app.i;
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
import org.koin.core.instance.ScopedInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: ScopeSetExt.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0087\b\u001a+\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0087\b¨\u0006\b"}, d2 = {"factory", "Lorg/koin/core/definition/KoinDefinition;", "R", "", "Lorg/koin/dsl/ScopeDSL;", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "scoped", "koin-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScopeSetExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScopeSetExt.kt\norg/koin/dsl/ScopeSetExtKt\n+ 2 ScopeDSL.kt\norg/koin/dsl/ScopeDSL\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n+ 5 Module.kt\norg/koin/core/module/Module\n*L\n1#1,49:1\n36#2:50\n37#2,2:67\n45#2:69\n226#3:51\n227#3:66\n216#3:71\n217#3:86\n216#3,2:89\n105#4,14:52\n105#4,14:72\n160#5:70\n161#5,2:87\n*S KotlinDebug\n*F\n+ 1 ScopeSetExt.kt\norg/koin/dsl/ScopeSetExtKt\n*L\n34#1:50\n34#1:67,2\n48#1:69\n34#1:51\n34#1:66\n48#1:71\n48#1:86\n48#1:89,2\n34#1:52,14\n48#1:72,14\n48#1:70\n48#1:87,2\n*E\n"})
public final class ScopeSetExtKt {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.dsl.ScopeSetExtKt$factory$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScopeSetExt.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "R", "", "Lorg/koin/core/scope/Scope;", "params", "Lorg/koin/core/parameter/ParametersHolder;", "invoke", "(Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nScopeSetExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScopeSetExt.kt\norg/koin/dsl/ScopeSetExtKt$factory$1\n*L\n1#1,49:1\n*E\n"})
    public static final class AnonymousClass1<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final R invoke(@NotNull Scope factory, @NotNull ParametersHolder params) {
            Intrinsics.checkNotNullParameter(factory, "$this$factory");
            Intrinsics.checkNotNullParameter(params, "params");
            Intrinsics.reifiedOperationMarker(4, "R");
            return (R) InstanceBuilderKt.newInstance(factory, Reflection.getOrCreateKotlinClass(Object.class), params);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.dsl.ScopeSetExtKt$scoped$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ScopeSetExt.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "R", "", "Lorg/koin/core/scope/Scope;", "params", "Lorg/koin/core/parameter/ParametersHolder;", "invoke", "(Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nScopeSetExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScopeSetExt.kt\norg/koin/dsl/ScopeSetExtKt$scoped$1\n*L\n1#1,49:1\n*E\n"})
    public static final class C07911<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        public static final C07911 INSTANCE = new C07911();

        public C07911() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final R invoke(@NotNull Scope scoped, @NotNull ParametersHolder params) {
            Intrinsics.checkNotNullParameter(scoped, "$this$scoped");
            Intrinsics.checkNotNullParameter(params, "params");
            Intrinsics.reifiedOperationMarker(4, "R");
            return (R) InstanceBuilderKt.newInstance(scoped, Reflection.getOrCreateKotlinClass(Object.class), params);
        }
    }

    @Deprecated(message = "API is deprecated in favor of factoryOf DSL")
    @KoinReflectAPI
    public static final /* synthetic */ <R> KoinDefinition<R> factory(ScopeDSL scopeDSL, Qualifier qualifier) {
        Intrinsics.checkNotNullParameter(scopeDSL, "<this>");
        Intrinsics.needClassReification();
        AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        Module module = scopeDSL.getModule();
        Qualifier scopeQualifier = scopeDSL.getScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        return new KoinDefinition<>(module, i.e(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier, anonymousClass1, kind, listEmptyList), module));
    }

    public static /* synthetic */ KoinDefinition factory$default(ScopeDSL scopeDSL, Qualifier qualifier, int i10, Object obj) {
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
        Intrinsics.reifiedOperationMarker(4, "R");
        return new KoinDefinition(module, i.e(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier2, anonymousClass1, kind, listEmptyList), module));
    }

    @Deprecated(message = "API is deprecated in favor of scopedOf DSL")
    @KoinReflectAPI
    public static final /* synthetic */ <R> KoinDefinition<R> scoped(ScopeDSL scopeDSL, Qualifier qualifier) {
        Intrinsics.checkNotNullParameter(scopeDSL, "<this>");
        Intrinsics.needClassReification();
        C07911 c07911 = C07911.INSTANCE;
        Qualifier scopeQualifier = scopeDSL.getScopeQualifier();
        Kind kind = Kind.Scoped;
        List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        ScopedInstanceFactory scopedInstanceFactory = new ScopedInstanceFactory(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier, c07911, kind, listEmptyList));
        scopeDSL.getModule().indexPrimaryType(scopedInstanceFactory);
        return new KoinDefinition<>(scopeDSL.getModule(), scopedInstanceFactory);
    }

    public static /* synthetic */ KoinDefinition scoped$default(ScopeDSL scopeDSL, Qualifier qualifier, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            qualifier = null;
        }
        Intrinsics.checkNotNullParameter(scopeDSL, "<this>");
        Intrinsics.needClassReification();
        C07911 c07911 = C07911.INSTANCE;
        Qualifier scopeQualifier = scopeDSL.getScopeQualifier();
        Kind kind = Kind.Scoped;
        List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        ScopedInstanceFactory scopedInstanceFactory = new ScopedInstanceFactory(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier, c07911, kind, listEmptyList));
        scopeDSL.getModule().indexPrimaryType(scopedInstanceFactory);
        return new KoinDefinition(scopeDSL.getModule(), scopedInstanceFactory);
    }
}
