package kotlin.reflect.jvm.internal.impl.types.error;

import bk.w;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.DefaultBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleCapability;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ErrorModuleDescriptor.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class ErrorModuleDescriptor implements ModuleDescriptor {

    @NotNull
    public static final ErrorModuleDescriptor INSTANCE = new ErrorModuleDescriptor();

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public static final Name f82030p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public static final List<ModuleDescriptor> f82031q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public static final List<ModuleDescriptor> f82032r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public static final Set<ModuleDescriptor> f82033s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public static final Lazy f82034t0;

    /* JADX INFO: compiled from: ErrorModuleDescriptor.kt */
    public static final class a extends Lambda implements Function0<DefaultBuiltIns> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f82035p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final DefaultBuiltIns invoke() {
            return DefaultBuiltIns.Companion.getInstance();
        }
    }

    static {
        Name nameSpecial = Name.special(ErrorEntity.ERROR_MODULE.getDebugText());
        Intrinsics.checkNotNullExpressionValue(nameSpecial, "special(...)");
        f82030p0 = nameSpecial;
        f82031q0 = CollectionsKt__CollectionsKt.emptyList();
        f82032r0 = CollectionsKt__CollectionsKt.emptyList();
        f82033s0 = w.emptySet();
        f82034t0 = LazyKt__LazyJVMKt.lazy(a.f82035p0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @Nullable
    public <R, D> R accept(@NotNull DeclarationDescriptorVisitor<R, D> visitor, D d2) {
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public Annotations getAnnotations() {
        return Annotations.Companion.getEMPTY();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    @NotNull
    public KotlinBuiltIns getBuiltIns() {
        return (KotlinBuiltIns) f82034t0.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    @Nullable
    public <T> T getCapability(@NotNull ModuleCapability<T> capability) {
        Intrinsics.checkNotNullParameter(capability, "capability");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @Nullable
    public DeclarationDescriptor getContainingDeclaration() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    @NotNull
    public List<ModuleDescriptor> getExpectedByModules() {
        return f82032r0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Named
    @NotNull
    public Name getName() {
        return getStableName();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    @NotNull
    public PackageViewDescriptor getPackage(@NotNull FqName fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        throw new IllegalStateException("Should not be called!");
    }

    @NotNull
    public Name getStableName() {
        return f82030p0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    @NotNull
    public Collection<FqName> getSubPackagesOf(@NotNull FqName fqName, @NotNull Function1<? super Name, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public boolean shouldSeeInternalsOf(@NotNull ModuleDescriptor targetModule) {
        Intrinsics.checkNotNullParameter(targetModule, "targetModule");
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    public DeclarationDescriptor getOriginal() {
        return this;
    }
}
