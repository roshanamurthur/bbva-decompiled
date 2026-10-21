package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import bk.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SubpackagesScope.kt */
/* JADX INFO: loaded from: classes12.dex */
public class SubpackagesScope extends MemberScopeImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ModuleDescriptor f80389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final FqName f80390b;

    public SubpackagesScope(@NotNull ModuleDescriptor moduleDescriptor, @NotNull FqName fqName) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        this.f80389a = moduleDescriptor;
        this.f80390b = fqName;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Set<Name> getClassifierNames() {
        return w.emptySet();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    public Collection<DeclarationDescriptor> getContributedDescriptors(@NotNull DescriptorKindFilter kindFilter, @NotNull Function1<? super Name, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        if (!kindFilter.acceptsKinds(DescriptorKindFilter.Companion.getPACKAGES_MASK())) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        FqName fqName = this.f80390b;
        if (fqName.isRoot() && kindFilter.getExcludes().contains(DescriptorKindExclude.TopLevelPackages.INSTANCE)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        Collection<FqName> subPackagesOf = this.f80389a.getSubPackagesOf(fqName, nameFilter);
        ArrayList arrayList = new ArrayList(subPackagesOf.size());
        Iterator<FqName> it = subPackagesOf.iterator();
        while (it.hasNext()) {
            Name nameShortName = it.next().shortName();
            Intrinsics.checkNotNullExpressionValue(nameShortName, "shortName(...)");
            if (nameFilter.invoke(nameShortName).booleanValue()) {
                CollectionsKt.addIfNotNull(arrayList, getPackage(nameShortName));
            }
        }
        return arrayList;
    }

    @Nullable
    public final PackageViewDescriptor getPackage(@NotNull Name name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (name.isSpecial()) {
            return null;
        }
        FqName fqNameChild = this.f80390b.child(name);
        Intrinsics.checkNotNullExpressionValue(fqNameChild, "child(...)");
        PackageViewDescriptor packageViewDescriptor = this.f80389a.getPackage(fqNameChild);
        if (packageViewDescriptor.isEmpty()) {
            return null;
        }
        return packageViewDescriptor;
    }

    @NotNull
    public String toString() {
        return "subpackages of " + this.f80390b + " from " + this.f80389a;
    }
}
