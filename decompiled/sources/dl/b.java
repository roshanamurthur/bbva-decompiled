package dl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements KotlinTypeChecker.TypeConstructorEquality {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f68196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CallableDescriptor f68197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CallableDescriptor f68198c;

    public b(boolean z10, CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
        this.f68196a = z10;
        this.f68197b = callableDescriptor;
        this.f68198c = callableDescriptor2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.TypeConstructorEquality
    public boolean equals(TypeConstructor c10, TypeConstructor c11) {
        DescriptorEquivalenceForOverrides descriptorEquivalenceForOverrides = DescriptorEquivalenceForOverrides.INSTANCE;
        CallableDescriptor a10 = this.f68197b;
        Intrinsics.checkNotNullParameter(a10, "$a");
        CallableDescriptor b10 = this.f68198c;
        Intrinsics.checkNotNullParameter(b10, "$b");
        Intrinsics.checkNotNullParameter(c10, "c1");
        Intrinsics.checkNotNullParameter(c11, "c2");
        if (Intrinsics.areEqual(c10, c11)) {
            return true;
        }
        ClassifierDescriptor classifierDescriptorMo5778getDeclarationDescriptor = c10.mo5778getDeclarationDescriptor();
        ClassifierDescriptor classifierDescriptorMo5778getDeclarationDescriptor2 = c11.mo5778getDeclarationDescriptor();
        if (!(classifierDescriptorMo5778getDeclarationDescriptor instanceof TypeParameterDescriptor) || !(classifierDescriptorMo5778getDeclarationDescriptor2 instanceof TypeParameterDescriptor)) {
            return false;
        }
        return DescriptorEquivalenceForOverrides.INSTANCE.areTypeParametersEquivalent((TypeParameterDescriptor) classifierDescriptorMo5778getDeclarationDescriptor, (TypeParameterDescriptor) classifierDescriptorMo5778getDeclarationDescriptor2, this.f68196a, new DescriptorEquivalenceForOverrides.b(a10, b10));
    }
}
