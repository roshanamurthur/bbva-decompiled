package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PackageFragmentProviderImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nPackageFragmentProviderImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PackageFragmentProviderImpl.kt\norg/jetbrains/kotlin/descriptors/PackageFragmentProviderImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,42:1\n857#2,2:43\n2624#2,3:45\n766#2:48\n857#2,2:49\n*S KotlinDebug\n*F\n+ 1 PackageFragmentProviderImpl.kt\norg/jetbrains/kotlin/descriptors/PackageFragmentProviderImpl\n*L\n26#1:43,2\n30#1:45,3\n34#1:48\n34#1:49,2\n*E\n"})
public final class PackageFragmentProviderImpl implements PackageFragmentProviderOptimized {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Collection<PackageFragmentDescriptor> f80220a;

    /* JADX INFO: compiled from: PackageFragmentProviderImpl.kt */
    public static final class a extends Lambda implements Function1<PackageFragmentDescriptor, FqName> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f80221p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final FqName invoke(@NotNull PackageFragmentDescriptor it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getFqName();
        }
    }

    /* JADX INFO: compiled from: PackageFragmentProviderImpl.kt */
    public static final class b extends Lambda implements Function1<FqName, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ FqName f80222p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(FqName fqName) {
            super(1);
            this.f80222p0 = fqName;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(@NotNull FqName it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(!it.isRoot() && Intrinsics.areEqual(it.parent(), this.f80222p0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PackageFragmentProviderImpl(@NotNull Collection<? extends PackageFragmentDescriptor> packageFragments) {
        Intrinsics.checkNotNullParameter(packageFragments, "packageFragments");
        this.f80220a = packageFragments;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public void collectPackageFragments(@NotNull FqName fqName, @NotNull Collection<PackageFragmentDescriptor> packageFragments) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(packageFragments, "packageFragments");
        for (Object obj : this.f80220a) {
            if (Intrinsics.areEqual(((PackageFragmentDescriptor) obj).getFqName(), fqName)) {
                packageFragments.add(obj);
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    @Deprecated(message = "for usages use #packageFragments(FqName) at final point, for impl use #collectPackageFragments(FqName, MutableCollection<PackageFragmentDescriptor>)")
    @NotNull
    public List<PackageFragmentDescriptor> getPackageFragments(@NotNull FqName fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Collection<PackageFragmentDescriptor> collection = this.f80220a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (Intrinsics.areEqual(((PackageFragmentDescriptor) obj).getFqName(), fqName)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    @NotNull
    public Collection<FqName> getSubPackagesOf(@NotNull FqName fqName, @NotNull Function1<? super Name, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return SequencesKt___SequencesKt.toList(SequencesKt___SequencesKt.filter(SequencesKt___SequencesKt.map(CollectionsKt___CollectionsKt.asSequence(this.f80220a), a.f80221p0), new b(fqName)));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public boolean isEmpty(@NotNull FqName fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Collection<PackageFragmentDescriptor> collection = this.f80220a;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(((PackageFragmentDescriptor) it.next()).getFqName(), fqName)) {
                return false;
            }
        }
        return true;
    }
}
