package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderKt;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ChainedMemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.LazyScopeAdapter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyPackageViewDescriptorImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
public class LazyPackageViewDescriptorImpl extends DeclarationDescriptorImpl implements PackageViewDescriptor {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f80332w0 = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(LazyPackageViewDescriptorImpl.class), "fragments", "getFragments()Ljava/util/List;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(LazyPackageViewDescriptorImpl.class), "empty", "getEmpty()Z"))};

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final ModuleDescriptorImpl f80333r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final FqName f80334s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final NotNullLazyValue f80335t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public final NotNullLazyValue f80336u0;

    @NotNull
    public final LazyScopeAdapter v0;

    /* JADX INFO: compiled from: LazyPackageViewDescriptorImpl.kt */
    public static final class a extends Lambda implements Function0<Boolean> {
        public a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl = LazyPackageViewDescriptorImpl.this;
            return Boolean.valueOf(PackageFragmentProviderKt.isEmpty(lazyPackageViewDescriptorImpl.getModule().getPackageFragmentProvider(), lazyPackageViewDescriptorImpl.getFqName()));
        }
    }

    /* JADX INFO: compiled from: LazyPackageViewDescriptorImpl.kt */
    public static final class b extends Lambda implements Function0<List<? extends PackageFragmentDescriptor>> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<? extends PackageFragmentDescriptor> invoke() {
            LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl = LazyPackageViewDescriptorImpl.this;
            return PackageFragmentProviderKt.packageFragments(lazyPackageViewDescriptorImpl.getModule().getPackageFragmentProvider(), lazyPackageViewDescriptorImpl.getFqName());
        }
    }

    /* JADX INFO: compiled from: LazyPackageViewDescriptorImpl.kt */
    @SourceDebugExtension({"SMAP\nLazyPackageViewDescriptorImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyPackageViewDescriptorImpl.kt\norg/jetbrains/kotlin/descriptors/impl/LazyPackageViewDescriptorImpl$memberScope$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,71:1\n1549#2:72\n1620#2,3:73\n*S KotlinDebug\n*F\n+ 1 LazyPackageViewDescriptorImpl.kt\norg/jetbrains/kotlin/descriptors/impl/LazyPackageViewDescriptorImpl$memberScope$1\n*L\n49#1:72\n49#1:73,3\n*E\n"})
    public static final class c extends Lambda implements Function0<MemberScope> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final MemberScope invoke() {
            LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl = LazyPackageViewDescriptorImpl.this;
            if (lazyPackageViewDescriptorImpl.isEmpty()) {
                return MemberScope.Empty.INSTANCE;
            }
            List<PackageFragmentDescriptor> fragments = lazyPackageViewDescriptorImpl.getFragments();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(fragments, 10));
            Iterator<T> it = fragments.iterator();
            while (it.hasNext()) {
                arrayList.add(((PackageFragmentDescriptor) it.next()).getMemberScope());
            }
            List listPlus = CollectionsKt___CollectionsKt.plus((Collection<? extends SubpackagesScope>) arrayList, new SubpackagesScope(lazyPackageViewDescriptorImpl.getModule(), lazyPackageViewDescriptorImpl.getFqName()));
            return ChainedMemberScope.Companion.create("package view scope for " + lazyPackageViewDescriptorImpl.getFqName() + " in " + lazyPackageViewDescriptorImpl.getModule().getName(), listPlus);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyPackageViewDescriptorImpl(@NotNull ModuleDescriptorImpl module, @NotNull FqName fqName, @NotNull StorageManager storageManager) {
        super(Annotations.Companion.getEMPTY(), fqName.shortNameOrSpecial());
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        this.f80333r0 = module;
        this.f80334s0 = fqName;
        this.f80335t0 = storageManager.createLazyValue(new b());
        this.f80336u0 = storageManager.createLazyValue(new a());
        this.v0 = new LazyScopeAdapter(storageManager, new c());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R accept(@NotNull DeclarationDescriptorVisitor<R, D> visitor, D d2) {
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        return visitor.visitPackageViewDescriptor(this, d2);
    }

    public boolean equals(@Nullable Object obj) {
        PackageViewDescriptor packageViewDescriptor = obj instanceof PackageViewDescriptor ? (PackageViewDescriptor) obj : null;
        return packageViewDescriptor != null && Intrinsics.areEqual(getFqName(), packageViewDescriptor.getFqName()) && Intrinsics.areEqual(getModule(), packageViewDescriptor.getModule());
    }

    public final boolean getEmpty() {
        return ((Boolean) StorageKt.getValue(this.f80336u0, this, (KProperty<?>) f80332w0[1])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor
    @NotNull
    public FqName getFqName() {
        return this.f80334s0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor
    @NotNull
    public List<PackageFragmentDescriptor> getFragments() {
        return (List) StorageKt.getValue(this.f80335t0, this, (KProperty<?>) f80332w0[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor
    @NotNull
    public MemberScope getMemberScope() {
        return this.v0;
    }

    public int hashCode() {
        return getFqName().hashCode() + (getModule().hashCode() * 31);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor
    public boolean isEmpty() {
        return getEmpty();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @Nullable
    public PackageViewDescriptor getContainingDeclaration() {
        if (getFqName().isRoot()) {
            return null;
        }
        ModuleDescriptorImpl module = getModule();
        FqName fqNameParent = getFqName().parent();
        Intrinsics.checkNotNullExpressionValue(fqNameParent, "parent(...)");
        return module.getPackage(fqNameParent);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor
    @NotNull
    public ModuleDescriptorImpl getModule() {
        return this.f80333r0;
    }
}
