package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import bk.w;
import java.util.Collection;
import java.util.List;
import kotlin.Deprecated;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AbstractDeserializedPackageFragmentProvider.kt */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractDeserializedPackageFragmentProvider implements PackageFragmentProviderOptimized {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final StorageManager f81641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final KotlinMetadataFinder f81642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ModuleDescriptor f81643c;
    protected DeserializationComponents components;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MemoizedFunctionToNullable<FqName, PackageFragmentDescriptor> f81644d;

    /* JADX INFO: compiled from: AbstractDeserializedPackageFragmentProvider.kt */
    public static final class a extends Lambda implements Function1<FqName, PackageFragmentDescriptor> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final PackageFragmentDescriptor invoke(@NotNull FqName fqName) {
            Intrinsics.checkNotNullParameter(fqName, "fqName");
            AbstractDeserializedPackageFragmentProvider abstractDeserializedPackageFragmentProvider = AbstractDeserializedPackageFragmentProvider.this;
            DeserializedPackageFragment deserializedPackageFragmentFindPackage = abstractDeserializedPackageFragmentProvider.findPackage(fqName);
            if (deserializedPackageFragmentFindPackage == null) {
                return null;
            }
            deserializedPackageFragmentFindPackage.initialize(abstractDeserializedPackageFragmentProvider.getComponents());
            return deserializedPackageFragmentFindPackage;
        }
    }

    public AbstractDeserializedPackageFragmentProvider(@NotNull StorageManager storageManager, @NotNull KotlinMetadataFinder finder, @NotNull ModuleDescriptor moduleDescriptor) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(finder, "finder");
        Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
        this.f81641a = storageManager;
        this.f81642b = finder;
        this.f81643c = moduleDescriptor;
        this.f81644d = storageManager.createMemoizedFunctionWithNullableValues(new a());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public void collectPackageFragments(@NotNull FqName fqName, @NotNull Collection<PackageFragmentDescriptor> packageFragments) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(packageFragments, "packageFragments");
        CollectionsKt.addIfNotNull(packageFragments, this.f81644d.invoke(fqName));
    }

    @Nullable
    public abstract DeserializedPackageFragment findPackage(@NotNull FqName fqName);

    @NotNull
    public final DeserializationComponents getComponents() {
        DeserializationComponents deserializationComponents = this.components;
        if (deserializationComponents != null) {
            return deserializationComponents;
        }
        Intrinsics.throwUninitializedPropertyAccessException("components");
        return null;
    }

    @NotNull
    public final KotlinMetadataFinder getFinder() {
        return this.f81642b;
    }

    @NotNull
    public final ModuleDescriptor getModuleDescriptor() {
        return this.f81643c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    @Deprecated(message = "for usages use #packageFragments(FqName) at final point, for impl use #collectPackageFragments(FqName, MutableCollection<PackageFragmentDescriptor>)")
    @NotNull
    public List<PackageFragmentDescriptor> getPackageFragments(@NotNull FqName fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return CollectionsKt__CollectionsKt.listOfNotNull(this.f81644d.invoke(fqName));
    }

    @NotNull
    public final StorageManager getStorageManager() {
        return this.f81641a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    @NotNull
    public Collection<FqName> getSubPackagesOf(@NotNull FqName fqName, @NotNull Function1<? super Name, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return w.emptySet();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public boolean isEmpty(@NotNull FqName fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        MemoizedFunctionToNullable<FqName, PackageFragmentDescriptor> memoizedFunctionToNullable = this.f81644d;
        return (memoizedFunctionToNullable.isComputed(fqName) ? memoizedFunctionToNullable.invoke(fqName) : findPackage(fqName)) == null;
    }

    public final void setComponents(@NotNull DeserializationComponents deserializationComponents) {
        Intrinsics.checkNotNullParameter(deserializationComponents, "<set-?>");
        this.components = deserializationComponents;
    }
}
