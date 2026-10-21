package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ClassifierBasedTypeConstructor.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nClassifierBasedTypeConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassifierBasedTypeConstructor.kt\norg/jetbrains/kotlin/types/ClassifierBasedTypeConstructor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,81:1\n1#2:82\n*E\n"})
public abstract class ClassifierBasedTypeConstructor implements TypeConstructor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f81905a;

    public final boolean areFqNamesEqual(@NotNull ClassifierDescriptor first, @NotNull ClassifierDescriptor second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        if (!Intrinsics.areEqual(first.getName(), second.getName())) {
            return false;
        }
        DeclarationDescriptor containingDeclaration = first.getContainingDeclaration();
        for (DeclarationDescriptor containingDeclaration2 = second.getContainingDeclaration(); containingDeclaration != null && containingDeclaration2 != null; containingDeclaration2 = containingDeclaration2.getContainingDeclaration()) {
            if (containingDeclaration instanceof ModuleDescriptor) {
                return containingDeclaration2 instanceof ModuleDescriptor;
            }
            if (containingDeclaration2 instanceof ModuleDescriptor) {
                return false;
            }
            if (containingDeclaration instanceof PackageFragmentDescriptor) {
                return (containingDeclaration2 instanceof PackageFragmentDescriptor) && Intrinsics.areEqual(((PackageFragmentDescriptor) containingDeclaration).getFqName(), ((PackageFragmentDescriptor) containingDeclaration2).getFqName());
            }
            if ((containingDeclaration2 instanceof PackageFragmentDescriptor) || !Intrinsics.areEqual(containingDeclaration.getName(), containingDeclaration2.getName())) {
                return false;
            }
            containingDeclaration = containingDeclaration.getContainingDeclaration();
        }
        return true;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TypeConstructor) || obj.hashCode() != hashCode()) {
            return false;
        }
        TypeConstructor typeConstructor = (TypeConstructor) obj;
        if (typeConstructor.getParameters().size() != getParameters().size()) {
            return false;
        }
        ClassifierDescriptor classifierDescriptorMo5778getDeclarationDescriptor = mo5778getDeclarationDescriptor();
        ClassifierDescriptor classifierDescriptorMo5778getDeclarationDescriptor2 = typeConstructor.mo5778getDeclarationDescriptor();
        if (classifierDescriptorMo5778getDeclarationDescriptor2 == null || ErrorUtils.isError(classifierDescriptorMo5778getDeclarationDescriptor) || DescriptorUtils.isLocal(classifierDescriptorMo5778getDeclarationDescriptor) || ErrorUtils.isError(classifierDescriptorMo5778getDeclarationDescriptor2) || DescriptorUtils.isLocal(classifierDescriptorMo5778getDeclarationDescriptor2)) {
            return false;
        }
        return isSameClassifier(classifierDescriptorMo5778getDeclarationDescriptor2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    /* JADX INFO: renamed from: getDeclarationDescriptor */
    public abstract ClassifierDescriptor mo5778getDeclarationDescriptor();

    public int hashCode() {
        int i10 = this.f81905a;
        if (i10 != 0) {
            return i10;
        }
        ClassifierDescriptor classifierDescriptorMo5778getDeclarationDescriptor = mo5778getDeclarationDescriptor();
        int iIdentityHashCode = (ErrorUtils.isError(classifierDescriptorMo5778getDeclarationDescriptor) || DescriptorUtils.isLocal(classifierDescriptorMo5778getDeclarationDescriptor)) ? System.identityHashCode(this) : DescriptorUtils.getFqName(classifierDescriptorMo5778getDeclarationDescriptor).hashCode();
        this.f81905a = iIdentityHashCode;
        return iIdentityHashCode;
    }

    public abstract boolean isSameClassifier(@NotNull ClassifierDescriptor classifierDescriptor);
}
