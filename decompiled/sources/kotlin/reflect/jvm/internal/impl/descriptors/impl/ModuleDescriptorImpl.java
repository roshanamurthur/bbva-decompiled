package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import bk.q;
import bk.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.InvalidModuleExceptionKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleCapability;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.platform.TargetPlatform;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ModuleDescriptorImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nModuleDescriptorImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModuleDescriptorImpl.kt\norg/jetbrains/kotlin/descriptors/impl/ModuleDescriptorImpl\n+ 2 coreLib.kt\norg/jetbrains/kotlin/utils/CoreLibKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,180:1\n19#2:181\n19#2:185\n19#2:186\n766#3:182\n857#3,2:183\n1#4:187\n*S KotlinDebug\n*F\n+ 1 ModuleDescriptorImpl.kt\norg/jetbrains/kotlin/descriptors/impl/ModuleDescriptorImpl\n*L\n72#1:181\n75#1:185\n78#1:186\n72#1:182\n72#1:183,2\n*E\n"})
public final class ModuleDescriptorImpl extends DeclarationDescriptorImpl implements ModuleDescriptor {

    @NotNull
    public final Lazy E0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final StorageManager f80351r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final KotlinBuiltIns f80352s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final Map<ModuleCapability<?>, Object> f80353t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public final PackageViewDescriptorFactory f80354u0;

    @Nullable
    public ModuleDependencies v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @Nullable
    public PackageFragmentProvider f80355w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final boolean f80356x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @NotNull
    public final MemoizedFunctionToNotNull<FqName, PackageViewDescriptor> f80357y0;

    /* JADX INFO: compiled from: ModuleDescriptorImpl.kt */
    @SourceDebugExtension({"SMAP\nModuleDescriptorImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModuleDescriptorImpl.kt\norg/jetbrains/kotlin/descriptors/impl/ModuleDescriptorImpl$packageFragmentProviderForWholeModuleWithDependencies$2\n+ 2 coreLib.kt\norg/jetbrains/kotlin/utils/CoreLibKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,180:1\n19#2:181\n1#3:182\n1855#4,2:183\n1549#4:185\n1620#4,3:186\n*S KotlinDebug\n*F\n+ 1 ModuleDescriptorImpl.kt\norg/jetbrains/kotlin/descriptors/impl/ModuleDescriptorImpl$packageFragmentProviderForWholeModuleWithDependencies$2\n*L\n91#1:181\n95#1:183,2\n101#1:185\n101#1:186,3\n*E\n"})
    public static final class a extends Lambda implements Function0<CompositePackageFragmentProvider> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final CompositePackageFragmentProvider invoke() {
            ModuleDescriptorImpl moduleDescriptorImpl = ModuleDescriptorImpl.this;
            ModuleDependencies moduleDependencies = moduleDescriptorImpl.v0;
            if (moduleDependencies == null) {
                throw new AssertionError("Dependencies of module " + ModuleDescriptorImpl.access$getId(moduleDescriptorImpl) + " were not set before querying module content");
            }
            List<ModuleDescriptorImpl> allDependencies = moduleDependencies.getAllDependencies();
            moduleDescriptorImpl.assertValid();
            allDependencies.contains(moduleDescriptorImpl);
            List<ModuleDescriptorImpl> list = allDependencies;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ModuleDescriptorImpl.access$isInitialized((ModuleDescriptorImpl) it.next());
            }
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                PackageFragmentProvider packageFragmentProvider = ((ModuleDescriptorImpl) it2.next()).f80355w0;
                Intrinsics.checkNotNull(packageFragmentProvider);
                arrayList.add(packageFragmentProvider);
            }
            return new CompositePackageFragmentProvider(arrayList, "CompositeProvider@ModuleDescriptor for " + moduleDescriptorImpl.getName());
        }
    }

    /* JADX INFO: compiled from: ModuleDescriptorImpl.kt */
    public static final class b extends Lambda implements Function1<FqName, PackageViewDescriptor> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final PackageViewDescriptor invoke(@NotNull FqName fqName) {
            Intrinsics.checkNotNullParameter(fqName, "fqName");
            ModuleDescriptorImpl moduleDescriptorImpl = ModuleDescriptorImpl.this;
            return moduleDescriptorImpl.f80354u0.compute(moduleDescriptorImpl, fqName, moduleDescriptorImpl.f80351r0);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModuleDescriptorImpl(@NotNull Name moduleName, @NotNull StorageManager storageManager, @NotNull KotlinBuiltIns builtIns, @Nullable TargetPlatform targetPlatform) {
        this(moduleName, storageManager, builtIns, targetPlatform, null, null, 48, null);
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
    }

    public static final String access$getId(ModuleDescriptorImpl moduleDescriptorImpl) {
        String string = moduleDescriptorImpl.getName().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static final boolean access$isInitialized(ModuleDescriptorImpl moduleDescriptorImpl) {
        return moduleDescriptorImpl.f80355w0 != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @Nullable
    public <R, D> R accept(@NotNull DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d2) {
        return (R) ModuleDescriptor.DefaultImpls.accept(this, declarationDescriptorVisitor, d2);
    }

    public void assertValid() {
        if (isValid()) {
            return;
        }
        InvalidModuleExceptionKt.moduleInvalidated(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    @NotNull
    public KotlinBuiltIns getBuiltIns() {
        return this.f80352s0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    @Nullable
    public <T> T getCapability(@NotNull ModuleCapability<T> capability) {
        Intrinsics.checkNotNullParameter(capability, "capability");
        T t10 = (T) this.f80353t0.get(capability);
        if (t10 == null) {
            return null;
        }
        return t10;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @Nullable
    public DeclarationDescriptor getContainingDeclaration() {
        return ModuleDescriptor.DefaultImpls.getContainingDeclaration(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    @NotNull
    public List<ModuleDescriptor> getExpectedByModules() {
        ModuleDependencies moduleDependencies = this.v0;
        if (moduleDependencies != null) {
            return moduleDependencies.getDirectExpectedByDependencies();
        }
        StringBuilder sb2 = new StringBuilder("Dependencies of module ");
        String string = getName().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        sb2.append(string);
        sb2.append(" were not set");
        throw new AssertionError(sb2.toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    @NotNull
    public PackageViewDescriptor getPackage(@NotNull FqName fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        assertValid();
        return this.f80357y0.invoke(fqName);
    }

    @NotNull
    public final PackageFragmentProvider getPackageFragmentProvider() {
        assertValid();
        return (CompositePackageFragmentProvider) this.E0.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    @NotNull
    public Collection<FqName> getSubPackagesOf(@NotNull FqName fqName, @NotNull Function1<? super Name, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        assertValid();
        return getPackageFragmentProvider().getSubPackagesOf(fqName, nameFilter);
    }

    public final void initialize(@NotNull PackageFragmentProvider providerForModuleContent) {
        Intrinsics.checkNotNullParameter(providerForModuleContent, "providerForModuleContent");
        this.f80355w0 = providerForModuleContent;
    }

    public boolean isValid() {
        return this.f80356x0;
    }

    public final void setDependencies(@NotNull ModuleDependencies dependencies) {
        Intrinsics.checkNotNullParameter(dependencies, "dependencies");
        this.v0 = dependencies;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public boolean shouldSeeInternalsOf(@NotNull ModuleDescriptor targetModule) {
        Intrinsics.checkNotNullParameter(targetModule, "targetModule");
        if (Intrinsics.areEqual(this, targetModule)) {
            return true;
        }
        ModuleDependencies moduleDependencies = this.v0;
        Intrinsics.checkNotNull(moduleDependencies);
        return CollectionsKt___CollectionsKt.contains(moduleDependencies.getModulesWhoseInternalsAreVisible(), targetModule) || getExpectedByModules().contains(targetModule) || targetModule.getExpectedByModules().contains(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl
    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        if (!isValid()) {
            sb2.append(" !isValid");
        }
        sb2.append(" packageFragmentProvider: ");
        PackageFragmentProvider packageFragmentProvider = this.f80355w0;
        sb2.append(packageFragmentProvider != null ? packageFragmentProvider.getClass().getSimpleName() : null);
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public /* synthetic */ ModuleDescriptorImpl(Name name, StorageManager storageManager, KotlinBuiltIns kotlinBuiltIns, TargetPlatform targetPlatform, Map map, Name name2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(name, storageManager, kotlinBuiltIns, (i10 & 8) != 0 ? null : targetPlatform, (i10 & 16) != 0 ? q.emptyMap() : map, (i10 & 32) != 0 ? null : name2);
    }

    public final void setDependencies(@NotNull ModuleDescriptorImpl... descriptors) {
        Intrinsics.checkNotNullParameter(descriptors, "descriptors");
        setDependencies(ArraysKt___ArraysKt.toList(descriptors));
    }

    public final void setDependencies(@NotNull List<ModuleDescriptorImpl> descriptors) {
        Intrinsics.checkNotNullParameter(descriptors, "descriptors");
        setDependencies(descriptors, w.emptySet());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModuleDescriptorImpl(@NotNull Name moduleName, @NotNull StorageManager storageManager, @NotNull KotlinBuiltIns builtIns, @Nullable TargetPlatform targetPlatform, @NotNull Map<ModuleCapability<?>, ? extends Object> capabilities, @Nullable Name name) {
        super(Annotations.Companion.getEMPTY(), moduleName);
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
        Intrinsics.checkNotNullParameter(capabilities, "capabilities");
        this.f80351r0 = storageManager;
        this.f80352s0 = builtIns;
        if (moduleName.isSpecial()) {
            this.f80353t0 = capabilities;
            PackageViewDescriptorFactory packageViewDescriptorFactory = (PackageViewDescriptorFactory) getCapability(PackageViewDescriptorFactory.Companion.getCAPABILITY());
            this.f80354u0 = packageViewDescriptorFactory == null ? PackageViewDescriptorFactory.Default.INSTANCE : packageViewDescriptorFactory;
            this.f80356x0 = true;
            this.f80357y0 = storageManager.createMemoizedFunction(new b());
            this.E0 = LazyKt__LazyJVMKt.lazy(new a());
            return;
        }
        throw new IllegalArgumentException("Module name must be special: " + moduleName);
    }

    public final void setDependencies(@NotNull List<ModuleDescriptorImpl> descriptors, @NotNull Set<ModuleDescriptorImpl> friends) {
        Intrinsics.checkNotNullParameter(descriptors, "descriptors");
        Intrinsics.checkNotNullParameter(friends, "friends");
        setDependencies(new ModuleDependenciesImpl(descriptors, friends, CollectionsKt__CollectionsKt.emptyList(), w.emptySet()));
    }
}
