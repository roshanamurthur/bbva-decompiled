package org.koin.dsl;

import androidx.appcompat.app.i;
import androidx.appcompat.view.menu.b;
import androidx.exifinterface.media.ExifInterface;
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
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: ModuleExt.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a+\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0087\b\u001a5\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\tH\u0087\b¨\u0006\n"}, d2 = {"factory", "Lorg/koin/core/definition/KoinDefinition;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lorg/koin/core/module/Module;", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "single", "createOnStart", "", "koin-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nModuleExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModuleExt.kt\norg/koin/dsl/ModuleExtKt\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 Module.kt\norg/koin/core/module/ModuleKt\n+ 4 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n*L\n1#1,53:1\n108#2:54\n109#2,5:76\n151#2,10:81\n161#2,2:107\n151#2,10:109\n161#2,2:121\n201#3,6:55\n207#3:75\n216#3:91\n217#3:106\n216#3,2:119\n105#4,14:61\n105#4,14:92\n*S KotlinDebug\n*F\n+ 1 ModuleExt.kt\norg/koin/dsl/ModuleExtKt\n*L\n38#1:54\n38#1:76,5\n52#1:81,10\n52#1:107,2\n52#1:109,10\n52#1:121,2\n38#1:55,6\n38#1:75\n52#1:91\n52#1:106\n52#1:119,2\n38#1:61,14\n52#1:92,14\n*E\n"})
public final class ModuleExtKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: org.koin.dsl.ModuleExtKt$factory$1, reason: invalid class name */
    /* JADX INFO: compiled from: ModuleExt.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", ExifInterface.GPS_DIRECTION_TRUE, "", "Lorg/koin/core/scope/Scope;", "params", "Lorg/koin/core/parameter/ParametersHolder;", "invoke", "(Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nModuleExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModuleExt.kt\norg/koin/dsl/ModuleExtKt$factory$1\n*L\n1#1,53:1\n*E\n"})
    public static final class AnonymousClass1<T> extends Lambda implements Function2<Scope, ParametersHolder, T> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final T invoke(@NotNull Scope factory, @NotNull ParametersHolder params) {
            Intrinsics.checkNotNullParameter(factory, "$this$factory");
            Intrinsics.checkNotNullParameter(params, "params");
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            return (T) InstanceBuilderKt.newInstance(factory, Reflection.getOrCreateKotlinClass(Object.class), params);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: org.koin.dsl.ModuleExtKt$single$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ModuleExt.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", ExifInterface.GPS_DIRECTION_TRUE, "", "Lorg/koin/core/scope/Scope;", "params", "Lorg/koin/core/parameter/ParametersHolder;", "invoke", "(Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nModuleExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModuleExt.kt\norg/koin/dsl/ModuleExtKt$single$1\n*L\n1#1,53:1\n*E\n"})
    public static final class C07901<T> extends Lambda implements Function2<Scope, ParametersHolder, T> {
        public static final C07901 INSTANCE = new C07901();

        public C07901() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final T invoke(@NotNull Scope single, @NotNull ParametersHolder params) {
            Intrinsics.checkNotNullParameter(single, "$this$single");
            Intrinsics.checkNotNullParameter(params, "params");
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            return (T) InstanceBuilderKt.newInstance(single, Reflection.getOrCreateKotlinClass(Object.class), params);
        }
    }

    @Deprecated(message = "API is deprecated in favor of factoryOf DSL")
    @KoinReflectAPI
    public static final /* synthetic */ <T> KoinDefinition<T> factory(Module module, Qualifier qualifier) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.needClassReification();
        AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return new KoinDefinition<>(module, i.e(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier, anonymousClass1, kind, listEmptyList), module));
    }

    public static /* synthetic */ KoinDefinition factory$default(Module module, Qualifier qualifier, int i10, Object obj) {
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

    @Deprecated(message = "API is deprecated in favor of singleOf DSL")
    @KoinReflectAPI
    public static final /* synthetic */ <T> KoinDefinition<T> single(Module module, Qualifier qualifier, boolean z10) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.needClassReification();
        C07901 c07901 = C07901.INSTANCE;
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Singleton;
        List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        SingleInstanceFactory<?> singleInstanceFactoryF = b.f(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier, c07901, kind, listEmptyList), module);
        if (z10 || module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactoryF);
        }
        return new KoinDefinition<>(module, singleInstanceFactoryF);
    }

    public static /* synthetic */ KoinDefinition single$default(Module module, Qualifier qualifier, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            qualifier = null;
        }
        Qualifier qualifier2 = qualifier;
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.needClassReification();
        C07901 c07901 = C07901.INSTANCE;
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Singleton;
        List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        SingleInstanceFactory<?> singleInstanceFactoryF = b.f(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier2, c07901, kind, listEmptyList), module);
        if (z10 || module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactoryF);
        }
        return new KoinDefinition(module, singleInstanceFactoryF);
    }
}
