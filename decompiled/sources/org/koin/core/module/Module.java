package org.koin.core.module;

import androidx.appcompat.app.i;
import androidx.appcompat.view.menu.b;
import androidx.exifinterface.media.ExifInterface;
import bk.d;
import bk.g;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.annotation.KoinInternalApi;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.BeanDefinitionKt;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.instance.InstanceFactory;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.qualifier.TypeQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.koin.dsl.ScopeDSL;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: compiled from: Module.kt */
/* JADX INFO: loaded from: classes13.dex */
@KoinDslMarker
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u00101\u001a\u00020\u0010¢\u0006\u0004\bU\u0010VJ!\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0002\"\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0014\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0007J)\u0010\u000e\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\n¢\u0006\u0002\b\fH\u0007J-\u0010\u000e\u001a\u00020\u0004\"\u0006\b\u0000\u0010\u000f\u0018\u00012\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\n¢\u0006\u0002\b\fH\u0087\bø\u0001\u0000J[\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\"\u0006\b\u0000\u0010\u000f\u0018\u00012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102)\b\b\u0010\u0016\u001a#\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00028\u00000\u0012j\b\u0012\u0004\u0012\u00028\u0000`\u0015¢\u0006\u0002\b\fH\u0086\bø\u0001\u0000J\u0014\u0010\u001b\u001a\u00020\u00042\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u0019H\u0007J\u0014\u0010\u001c\u001a\u00020\u00042\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u0019H\u0007J\u0014\u0010\u001e\u001a\u00020\u00042\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u001dH\u0007J \u0010#\u001a\u00020\u00042\n\u0010!\u001a\u00060\u001fj\u0002` 2\n\u0010\"\u001a\u0006\u0012\u0002\b\u00030\u0019H\u0001JQ\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\"\u0006\b\u0000\u0010\u000f\u0018\u00012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2)\b\b\u0010\u0016\u001a#\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00028\u00000\u0012j\b\u0012\u0004\u0012\u00028\u0000`\u0015¢\u0006\u0002\b\fH\u0086\bø\u0001\u0000JY\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\"\u0006\b\u0000\u0010\u000f\u0018\u00012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2)\b\b\u0010\u0016\u001a#\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00028\u00000\u0012j\b\u0012\u0004\u0012\u00028\u0000`\u0015¢\u0006\u0002\b\f2\u0006\u0010$\u001a\u00020\bH\u0081\bø\u0001\u0000J\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00000\u00072\u0006\u0010\u0003\u001a\u00020\u0000H\u0086\u0002J\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00000\u00072\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00000\u0007H\u0086\u0002J\u0013\u0010(\u001a\u00020\u00102\b\u0010'\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010*\u001a\u00020)H\u0016R \u00101\u001a\u00020\u00108\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b+\u0010,\u0012\u0004\b/\u00100\u001a\u0004\b-\u0010.R\u0017\u00106\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105RZ\u0010@\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001d07j\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001d`82\u001e\u00109\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001d07j\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001d`88\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?RL\u0010H\u001a.\u0012\b\u0012\u00060\u001fj\u0002` \u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00190Aj\u0016\u0012\b\u0012\u00060\u001fj\u0002` \u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0019`B8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bC\u0010D\u0012\u0004\bG\u00100\u001a\u0004\bE\u0010FR0\u0010L\u001a\u0012\u0012\u0004\u0012\u00020\b07j\b\u0012\u0004\u0012\u00020\b`88\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bI\u0010;\u0012\u0004\bK\u00100\u001a\u0004\bJ\u0010=R&\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00000M8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bN\u0010O\u0012\u0004\bR\u00100\u001a\u0004\bP\u0010QR\u0011\u0010T\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\bT\u0010.\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006W"}, d2 = {"Lorg/koin/core/module/Module;", "", "", "module", "", "includes", "([Lorg/koin/core/module/Module;)V", "", "Lorg/koin/core/qualifier/Qualifier;", "qualifier", "Lkotlin/Function1;", "Lorg/koin/dsl/ScopeDSL;", "Lkotlin/ExtensionFunctionType;", "scopeSet", "scope", ExifInterface.GPS_DIRECTION_TRUE, "", "createdAtStart", "Lkotlin/Function2;", "Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "Lorg/koin/core/definition/Definition;", "definition", "Lorg/koin/core/definition/KoinDefinition;", "single", "Lorg/koin/core/instance/InstanceFactory;", "instanceFactory", "indexPrimaryType", "indexSecondaryTypes", "Lorg/koin/core/instance/SingleInstanceFactory;", "prepareForCreationAtStart", "", "Lorg/koin/core/definition/IndexKey;", "mapping", "factory", "saveMapping", "scopeQualifier", "plus", "modules", "other", "equals", "", GenerateActivationFormCommand.HASH_CODE, "a", "Z", "get_createdAtStart", "()Z", "get_createdAtStart$annotations", "()V", "_createdAtStart", "b", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "<set-?>", "c", "Ljava/util/HashSet;", "getEagerInstances", "()Ljava/util/HashSet;", "setEagerInstances$koin_core", "(Ljava/util/HashSet;)V", "eagerInstances", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "d", "Ljava/util/HashMap;", "getMappings", "()Ljava/util/HashMap;", "getMappings$annotations", "mappings", "e", "getScopes", "getScopes$annotations", "scopes", "", "f", "Ljava/util/List;", "getIncludedModules", "()Ljava/util/List;", "getIncludedModules$annotations", "includedModules", "isLoaded", "<init>", "(Z)V", "koin-core"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Module.kt\norg/koin/core/module/Module\n+ 2 Module.kt\norg/koin/core/module/ModuleKt\n+ 3 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,251:1\n160#1:275\n161#1,2:292\n160#1:294\n161#1,2:297\n201#2,6:252\n207#2:272\n216#2:276\n217#2:291\n216#2,2:295\n216#2:299\n217#2:314\n216#2,2:315\n105#3,14:258\n105#3,14:277\n105#3,14:300\n1855#4,2:273\n*S KotlinDebug\n*F\n+ 1 Module.kt\norg/koin/core/module/Module\n*L\n151#1:275\n151#1:292,2\n151#1:294\n151#1:297,2\n108#1:252,6\n108#1:272\n151#1:276\n151#1:291\n151#1:295,2\n160#1:299\n160#1:314\n160#1:315,2\n108#1:258,14\n151#1:277,14\n160#1:300,14\n126#1:273,2\n*E\n"})
public final class Module {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean _createdAtStart;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String id;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public HashSet<SingleInstanceFactory<?>> eagerInstances;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final HashMap<String, InstanceFactory<?>> mappings;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final HashSet<Qualifier> scopes;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final ArrayList f92356f;

    public Module() {
        this(false, 1, null);
    }

    public static /* synthetic */ KoinDefinition factory$default(Module module, Qualifier qualifier, Function2 definition, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            qualifier = null;
        }
        Qualifier qualifier2 = qualifier;
        Intrinsics.checkNotNullParameter(definition, "definition");
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return new KoinDefinition(module, i.e(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier2, definition, kind, listEmptyList), module));
    }

    public static /* synthetic */ KoinDefinition single$default(Module module, Qualifier qualifier, boolean z10, Function2 definition, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            qualifier = null;
        }
        Qualifier qualifier2 = qualifier;
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        Intrinsics.checkNotNullParameter(definition, "definition");
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Singleton;
        List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        SingleInstanceFactory<?> singleInstanceFactoryF = b.f(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier2, definition, kind, listEmptyList), module);
        if (z10 || module.get_createdAtStart()) {
            module.prepareForCreationAtStart(singleInstanceFactoryF);
        }
        return new KoinDefinition(module, singleInstanceFactoryF);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return other != null && Module.class == other.getClass() && Intrinsics.areEqual(this.id, ((Module) other).id);
    }

    public final /* synthetic */ <T> KoinDefinition<T> factory(Qualifier qualifier, Function2<? super Scope, ? super ParametersHolder, ? extends T> definition) {
        Intrinsics.checkNotNullParameter(definition, "definition");
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return new KoinDefinition<>(this, i.e(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier, definition, kind, listEmptyList), this));
    }

    @NotNull
    public final HashSet<SingleInstanceFactory<?>> getEagerInstances() {
        return this.eagerInstances;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final List<Module> getIncludedModules() {
        return this.f92356f;
    }

    @NotNull
    public final HashMap<String, InstanceFactory<?>> getMappings() {
        return this.mappings;
    }

    @NotNull
    public final HashSet<Qualifier> getScopes() {
        return this.scopes;
    }

    public final boolean get_createdAtStart() {
        return this._createdAtStart;
    }

    public int hashCode() {
        return this.id.hashCode();
    }

    public final void includes(@NotNull Module... module) {
        Intrinsics.checkNotNullParameter(module, "module");
        g.addAll(this.f92356f, module);
    }

    @KoinInternalApi
    public final void indexPrimaryType(@NotNull InstanceFactory<?> instanceFactory) {
        Intrinsics.checkNotNullParameter(instanceFactory, "instanceFactory");
        BeanDefinition<?> beanDefinition = instanceFactory.getBeanDefinition();
        saveMapping(BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), beanDefinition.getQualifier(), beanDefinition.getScopeQualifier()), instanceFactory);
    }

    @KoinInternalApi
    public final void indexSecondaryTypes(@NotNull InstanceFactory<?> instanceFactory) {
        Intrinsics.checkNotNullParameter(instanceFactory, "instanceFactory");
        BeanDefinition<?> beanDefinition = instanceFactory.getBeanDefinition();
        Iterator<T> it = beanDefinition.getSecondaryTypes().iterator();
        while (it.hasNext()) {
            saveMapping(BeanDefinitionKt.indexKey((KClass) it.next(), beanDefinition.getQualifier(), beanDefinition.getScopeQualifier()), instanceFactory);
        }
    }

    public final boolean isLoaded() {
        return this.mappings.size() > 0;
    }

    @NotNull
    public final List<Module> plus(@NotNull Module module) {
        Intrinsics.checkNotNullParameter(module, "module");
        return CollectionsKt__CollectionsKt.listOf((Object[]) new Module[]{this, module});
    }

    @KoinInternalApi
    public final void prepareForCreationAtStart(@NotNull SingleInstanceFactory<?> instanceFactory) {
        Intrinsics.checkNotNullParameter(instanceFactory, "instanceFactory");
        this.eagerInstances.add(instanceFactory);
    }

    @PublishedApi
    public final void saveMapping(@NotNull String mapping, @NotNull InstanceFactory<?> factory) {
        Intrinsics.checkNotNullParameter(mapping, "mapping");
        Intrinsics.checkNotNullParameter(factory, "factory");
        this.mappings.put(mapping, factory);
    }

    @KoinDslMarker
    public final void scope(@NotNull Qualifier qualifier, @NotNull Function1<? super ScopeDSL, Unit> scopeSet) {
        Intrinsics.checkNotNullParameter(qualifier, "qualifier");
        Intrinsics.checkNotNullParameter(scopeSet, "scopeSet");
        scopeSet.invoke(new ScopeDSL(qualifier, this));
        this.scopes.add(qualifier);
    }

    public final void setEagerInstances$koin_core(@NotNull HashSet<SingleInstanceFactory<?>> hashSet) {
        Intrinsics.checkNotNullParameter(hashSet, "<set-?>");
        this.eagerInstances = hashSet;
    }

    public final /* synthetic */ <T> KoinDefinition<T> single(Qualifier qualifier, boolean createdAtStart, Function2<? super Scope, ? super ParametersHolder, ? extends T> definition) {
        Intrinsics.checkNotNullParameter(definition, "definition");
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Singleton;
        List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        SingleInstanceFactory<?> singleInstanceFactoryF = b.f(new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier, definition, kind, listEmptyList), this);
        if (createdAtStart || get_createdAtStart()) {
            prepareForCreationAtStart(singleInstanceFactoryF);
        }
        return new KoinDefinition<>(this, singleInstanceFactoryF);
    }

    public Module(boolean z10) {
        this._createdAtStart = z10;
        this.id = KoinPlatformTools.INSTANCE.generateId();
        this.eagerInstances = new HashSet<>();
        this.mappings = new HashMap<>();
        this.scopes = new HashSet<>();
        this.f92356f = new ArrayList();
    }

    public final void includes(@NotNull List<Module> module) {
        Intrinsics.checkNotNullParameter(module, "module");
        g.addAll(this.f92356f, module);
    }

    @NotNull
    public final List<Module> plus(@NotNull List<Module> modules) {
        Intrinsics.checkNotNullParameter(modules, "modules");
        return CollectionsKt___CollectionsKt.plus((Collection) d.listOf(this), (Iterable) modules);
    }

    @KoinDslMarker
    public final /* synthetic */ <T> void scope(Function1<? super ScopeDSL, Unit> scopeSet) {
        Intrinsics.checkNotNullParameter(scopeSet, "scopeSet");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        TypeQualifier typeQualifier = new TypeQualifier(Reflection.getOrCreateKotlinClass(Object.class));
        scopeSet.invoke(new ScopeDSL(typeQualifier, this));
        getScopes().add(typeQualifier);
    }

    public /* synthetic */ Module(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10);
    }

    @PublishedApi
    public final /* synthetic */ <T> KoinDefinition<T> factory(Qualifier qualifier, Function2<? super Scope, ? super ParametersHolder, ? extends T> definition, Qualifier scopeQualifier) {
        Intrinsics.checkNotNullParameter(definition, "definition");
        Intrinsics.checkNotNullParameter(scopeQualifier, "scopeQualifier");
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return new KoinDefinition<>(this, i.e(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier, definition, kind, listEmptyList), this));
    }

    public static /* synthetic */ KoinDefinition factory$default(Module module, Qualifier qualifier, Function2 definition, Qualifier scopeQualifier, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            qualifier = null;
        }
        Intrinsics.checkNotNullParameter(definition, "definition");
        Intrinsics.checkNotNullParameter(scopeQualifier, "scopeQualifier");
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return new KoinDefinition(module, i.e(new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier, definition, kind, listEmptyList), module));
    }

    @KoinInternalApi
    public static /* synthetic */ void getIncludedModules$annotations() {
    }

    @KoinInternalApi
    public static /* synthetic */ void getMappings$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getScopes$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void get_createdAtStart$annotations() {
    }
}
