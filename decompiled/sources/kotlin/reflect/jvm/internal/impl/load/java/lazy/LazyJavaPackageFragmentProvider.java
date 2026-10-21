package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import ak.c;
import java.util.Collection;
import java.util.List;
import kotlin.Deprecated;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder$$Util;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.CacheWithNotNullValues;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LazyJavaPackageFragmentProvider.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class LazyJavaPackageFragmentProvider implements PackageFragmentProviderOptimized {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LazyJavaResolverContext f80629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CacheWithNotNullValues<FqName, LazyJavaPackageFragment> f80630b;

    /* JADX INFO: compiled from: LazyJavaPackageFragmentProvider.kt */
    public static final class a extends Lambda implements Function0<LazyJavaPackageFragment> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ JavaPackage f80632q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(JavaPackage javaPackage) {
            super(0);
            this.f80632q0 = javaPackage;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final LazyJavaPackageFragment invoke() {
            return new LazyJavaPackageFragment(LazyJavaPackageFragmentProvider.this.f80629a, this.f80632q0);
        }
    }

    public LazyJavaPackageFragmentProvider(@NotNull JavaResolverComponents components) {
        Intrinsics.checkNotNullParameter(components, "components");
        LazyJavaResolverContext lazyJavaResolverContext = new LazyJavaResolverContext(components, TypeParameterResolver.EMPTY.INSTANCE, c.lazyOf(null));
        this.f80629a = lazyJavaResolverContext;
        this.f80630b = lazyJavaResolverContext.getStorageManager().createCacheWithNotNullValues();
    }

    public final LazyJavaPackageFragment a(FqName fqName) {
        JavaPackage javaPackageFindPackage$default = JavaClassFinder$$Util.findPackage$default(this.f80629a.getComponents().getFinder(), fqName, false, 2, null);
        if (javaPackageFindPackage$default == null) {
            return null;
        }
        return this.f80630b.computeIfAbsent(fqName, new a(javaPackageFindPackage$default));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public void collectPackageFragments(@NotNull FqName fqName, @NotNull Collection<PackageFragmentDescriptor> packageFragments) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(packageFragments, "packageFragments");
        CollectionsKt.addIfNotNull(packageFragments, a(fqName));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    @Deprecated(message = "for usages use #packageFragments(FqName) at final point, for impl use #collectPackageFragments(FqName, MutableCollection<PackageFragmentDescriptor>)")
    @NotNull
    public List<LazyJavaPackageFragment> getPackageFragments(@NotNull FqName fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return CollectionsKt__CollectionsKt.listOfNotNull(a(fqName));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    public /* bridge */ /* synthetic */ Collection getSubPackagesOf(FqName fqName, Function1 function1) {
        return getSubPackagesOf(fqName, (Function1<? super Name, Boolean>) function1);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public boolean isEmpty(@NotNull FqName fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return JavaClassFinder$$Util.findPackage$default(this.f80629a.getComponents().getFinder(), fqName, false, 2, null) == null;
    }

    @NotNull
    public String toString() {
        return "LazyJavaPackageFragmentProvider of module " + this.f80629a.getComponents().getModule();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    @NotNull
    public List<FqName> getSubPackagesOf(@NotNull FqName fqName, @NotNull Function1<? super Name, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        LazyJavaPackageFragment lazyJavaPackageFragmentA = a(fqName);
        List<FqName> subPackageFqNames$descriptors_jvm = lazyJavaPackageFragmentA != null ? lazyJavaPackageFragmentA.getSubPackageFqNames$descriptors_jvm() : null;
        return subPackageFqNames$descriptors_jvm == null ? CollectionsKt__CollectionsKt.emptyList() : subPackageFqNames$descriptors_jvm;
    }
}
