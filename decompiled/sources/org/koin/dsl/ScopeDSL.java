package org.koin.dsl;

import androidx.appcompat.app.i;
import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.instance.ScopedInstanceFactory;
import org.koin.core.module.KoinDslMarker;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: ScopeDSL.kt */
/* JADX INFO: loaded from: classes13.dex */
@KoinDslMarker
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u0019\u0010\u001aJQ\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0006\b\u0000\u0010\u0002\u0018\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032)\b\b\u0010\n\u001a#\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0005j\b\u0012\u0004\u0012\u00028\u0000`\b¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000JQ\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0006\b\u0000\u0010\u0002\u0018\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032)\b\b\u0010\n\u001a#\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0005j\b\u0012\u0004\u0012\u00028\u0000`\b¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000R\u0017\u0010\u0012\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001b"}, d2 = {"Lorg/koin/dsl/ScopeDSL;", "", ExifInterface.GPS_DIRECTION_TRUE, "Lorg/koin/core/qualifier/Qualifier;", "qualifier", "Lkotlin/Function2;", "Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "Lorg/koin/core/definition/Definition;", "Lkotlin/ExtensionFunctionType;", "definition", "Lorg/koin/core/definition/KoinDefinition;", "scoped", "factory", "a", "Lorg/koin/core/qualifier/Qualifier;", "getScopeQualifier", "()Lorg/koin/core/qualifier/Qualifier;", "scopeQualifier", "Lorg/koin/core/module/Module;", "b", "Lorg/koin/core/module/Module;", "getModule", "()Lorg/koin/core/module/Module;", "module", "<init>", "(Lorg/koin/core/qualifier/Qualifier;Lorg/koin/core/module/Module;)V", "koin-core"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nScopeDSL.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScopeDSL.kt\norg/koin/dsl/ScopeDSL\n+ 2 Module.kt\norg/koin/core/module/ModuleKt\n+ 3 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n+ 4 Module.kt\norg/koin/core/module/Module\n*L\n1#1,47:1\n226#2:48\n227#2:63\n216#2:65\n217#2:80\n216#2,2:83\n105#3,14:49\n105#3,14:66\n160#4:64\n161#4,2:81\n*S KotlinDebug\n*F\n+ 1 ScopeDSL.kt\norg/koin/dsl/ScopeDSL\n*L\n36#1:48\n36#1:63\n45#1:65\n45#1:80\n45#1:83,2\n36#1:49,14\n45#1:66,14\n45#1:64\n45#1:81,2\n*E\n"})
public final class ScopeDSL {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Qualifier scopeQualifier;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Module module;

    public ScopeDSL(@NotNull Qualifier scopeQualifier, @NotNull Module module) {
        Intrinsics.checkNotNullParameter(scopeQualifier, "scopeQualifier");
        Intrinsics.checkNotNullParameter(module, "module");
        this.scopeQualifier = scopeQualifier;
        this.module = module;
    }

    public static /* synthetic */ KoinDefinition factory$default(ScopeDSL scopeDSL, Qualifier qualifier, Function2 definition, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            qualifier = null;
        }
        Qualifier qualifier2 = qualifier;
        Intrinsics.checkNotNullParameter(definition, "definition");
        Module module = scopeDSL.getModule();
        Qualifier scopeQualifier = scopeDSL.getScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return new KoinDefinition(module, i.e(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier2, definition, kind, listEmptyList), module));
    }

    public static /* synthetic */ KoinDefinition scoped$default(ScopeDSL scopeDSL, Qualifier qualifier, Function2 definition, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            qualifier = null;
        }
        Intrinsics.checkNotNullParameter(definition, "definition");
        Qualifier scopeQualifier = scopeDSL.getScopeQualifier();
        Kind kind = Kind.Scoped;
        List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        ScopedInstanceFactory scopedInstanceFactory = new ScopedInstanceFactory(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier, definition, kind, listEmptyList));
        scopeDSL.getModule().indexPrimaryType(scopedInstanceFactory);
        return new KoinDefinition(scopeDSL.getModule(), scopedInstanceFactory);
    }

    public final /* synthetic */ <T> KoinDefinition<T> factory(Qualifier qualifier, Function2<? super Scope, ? super ParametersHolder, ? extends T> definition) {
        Intrinsics.checkNotNullParameter(definition, "definition");
        Module module = getModule();
        Qualifier scopeQualifier = getScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return new KoinDefinition<>(module, i.e(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier, definition, kind, listEmptyList), module));
    }

    @NotNull
    public final Module getModule() {
        return this.module;
    }

    @NotNull
    public final Qualifier getScopeQualifier() {
        return this.scopeQualifier;
    }

    public final /* synthetic */ <T> KoinDefinition<T> scoped(Qualifier qualifier, Function2<? super Scope, ? super ParametersHolder, ? extends T> definition) {
        Intrinsics.checkNotNullParameter(definition, "definition");
        Qualifier scopeQualifier = getScopeQualifier();
        Kind kind = Kind.Scoped;
        List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        ScopedInstanceFactory scopedInstanceFactory = new ScopedInstanceFactory(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier, definition, kind, listEmptyList));
        getModule().indexPrimaryType(scopedInstanceFactory);
        return new KoinDefinition<>(getModule(), scopedInstanceFactory);
    }
}
