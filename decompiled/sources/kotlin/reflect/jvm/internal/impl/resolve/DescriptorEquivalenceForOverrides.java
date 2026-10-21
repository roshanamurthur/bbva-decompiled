package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DescriptorEquivalenceForOverrides.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class DescriptorEquivalenceForOverrides {

    @NotNull
    public static final DescriptorEquivalenceForOverrides INSTANCE = new DescriptorEquivalenceForOverrides();

    /* JADX INFO: compiled from: DescriptorEquivalenceForOverrides.kt */
    public static final class a extends Lambda implements Function2<DeclarationDescriptor, DeclarationDescriptor, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f81505p0 = new a(2);

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final Boolean invoke(@Nullable DeclarationDescriptor declarationDescriptor, @Nullable DeclarationDescriptor declarationDescriptor2) {
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: compiled from: DescriptorEquivalenceForOverrides.kt */
    public static final class b extends Lambda implements Function2<DeclarationDescriptor, DeclarationDescriptor, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ CallableDescriptor f81506p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ CallableDescriptor f81507q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
            super(2);
            this.f81506p0 = callableDescriptor;
            this.f81507q0 = callableDescriptor2;
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final Boolean invoke(@Nullable DeclarationDescriptor declarationDescriptor, @Nullable DeclarationDescriptor declarationDescriptor2) {
            return Boolean.valueOf(Intrinsics.areEqual(declarationDescriptor, this.f81506p0) && Intrinsics.areEqual(declarationDescriptor2, this.f81507q0));
        }
    }

    /* JADX INFO: compiled from: DescriptorEquivalenceForOverrides.kt */
    public static final class c extends Lambda implements Function2<DeclarationDescriptor, DeclarationDescriptor, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f81508p0 = new c(2);

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final Boolean invoke(@Nullable DeclarationDescriptor declarationDescriptor, @Nullable DeclarationDescriptor declarationDescriptor2) {
            return Boolean.FALSE;
        }
    }

    public static /* synthetic */ boolean areCallableDescriptorsEquivalent$default(DescriptorEquivalenceForOverrides descriptorEquivalenceForOverrides, CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2, boolean z10, boolean z11, boolean z12, KotlinTypeRefiner kotlinTypeRefiner, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        boolean z13 = z11;
        if ((i10 & 16) != 0) {
            z12 = false;
        }
        return descriptorEquivalenceForOverrides.areCallableDescriptorsEquivalent(callableDescriptor, callableDescriptor2, z10, z13, z12, kotlinTypeRefiner);
    }

    public static /* synthetic */ boolean areEquivalent$default(DescriptorEquivalenceForOverrides descriptorEquivalenceForOverrides, DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        return descriptorEquivalenceForOverrides.areEquivalent(declarationDescriptor, declarationDescriptor2, z10, z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean areTypeParametersEquivalent$default(DescriptorEquivalenceForOverrides descriptorEquivalenceForOverrides, TypeParameterDescriptor typeParameterDescriptor, TypeParameterDescriptor typeParameterDescriptor2, boolean z10, Function2 function2, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            function2 = c.f81508p0;
        }
        return descriptorEquivalenceForOverrides.areTypeParametersEquivalent(typeParameterDescriptor, typeParameterDescriptor2, z10, function2);
    }

    public static SourceElement b(CallableDescriptor callableDescriptor) {
        while (callableDescriptor instanceof CallableMemberDescriptor) {
            CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) callableDescriptor;
            if (callableMemberDescriptor.getKind() != CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
                break;
            }
            Collection<? extends CallableMemberDescriptor> overriddenDescriptors = callableMemberDescriptor.getOverriddenDescriptors();
            Intrinsics.checkNotNullExpressionValue(overriddenDescriptors, "getOverriddenDescriptors(...)");
            callableDescriptor = (CallableMemberDescriptor) CollectionsKt___CollectionsKt.singleOrNull(overriddenDescriptors);
            if (callableDescriptor == null) {
                return null;
            }
        }
        return callableDescriptor.getSource();
    }

    public final boolean a(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2, Function2<? super DeclarationDescriptor, ? super DeclarationDescriptor, Boolean> function2, boolean z10) {
        DeclarationDescriptor containingDeclaration = declarationDescriptor.getContainingDeclaration();
        DeclarationDescriptor containingDeclaration2 = declarationDescriptor2.getContainingDeclaration();
        return ((containingDeclaration instanceof CallableMemberDescriptor) || (containingDeclaration2 instanceof CallableMemberDescriptor)) ? function2.invoke(containingDeclaration, containingDeclaration2).booleanValue() : areEquivalent$default(this, containingDeclaration, containingDeclaration2, z10, false, 8, null);
    }

    public final boolean areCallableDescriptorsEquivalent(@NotNull CallableDescriptor a10, @NotNull CallableDescriptor b10, boolean z10, boolean z11, boolean z12, @NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        if (Intrinsics.areEqual(a10, b10)) {
            return true;
        }
        if (!Intrinsics.areEqual(a10.getName(), b10.getName())) {
            return false;
        }
        if (z11 && (a10 instanceof MemberDescriptor) && (b10 instanceof MemberDescriptor) && ((MemberDescriptor) a10).isExpect() != ((MemberDescriptor) b10).isExpect()) {
            return false;
        }
        if ((Intrinsics.areEqual(a10.getContainingDeclaration(), b10.getContainingDeclaration()) && (!z10 || !Intrinsics.areEqual(b(a10), b(b10)))) || DescriptorUtils.isLocal(a10) || DescriptorUtils.isLocal(b10) || !a(a10, b10, a.f81505p0, z10)) {
            return false;
        }
        OverridingUtil overridingUtilCreate = OverridingUtil.create(kotlinTypeRefiner, new dl.b(z10, a10, b10));
        Intrinsics.checkNotNullExpressionValue(overridingUtilCreate, "create(...)");
        boolean z13 = !z12;
        OverridingUtil.OverrideCompatibilityInfo.Result result = overridingUtilCreate.isOverridableBy(a10, b10, null, z13).getResult();
        OverridingUtil.OverrideCompatibilityInfo.Result result2 = OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE;
        return result == result2 && overridingUtilCreate.isOverridableBy(b10, a10, null, z13).getResult() == result2;
    }

    public final boolean areEquivalent(@Nullable DeclarationDescriptor declarationDescriptor, @Nullable DeclarationDescriptor declarationDescriptor2, boolean z10, boolean z11) {
        if ((declarationDescriptor instanceof ClassDescriptor) && (declarationDescriptor2 instanceof ClassDescriptor)) {
            return Intrinsics.areEqual(((ClassDescriptor) declarationDescriptor).getTypeConstructor(), ((ClassDescriptor) declarationDescriptor2).getTypeConstructor());
        }
        if ((declarationDescriptor instanceof TypeParameterDescriptor) && (declarationDescriptor2 instanceof TypeParameterDescriptor)) {
            return areTypeParametersEquivalent$default(this, (TypeParameterDescriptor) declarationDescriptor, (TypeParameterDescriptor) declarationDescriptor2, z10, null, 8, null);
        }
        if ((declarationDescriptor instanceof CallableDescriptor) && (declarationDescriptor2 instanceof CallableDescriptor)) {
            return areCallableDescriptorsEquivalent$default(this, (CallableDescriptor) declarationDescriptor, (CallableDescriptor) declarationDescriptor2, z10, z11, false, KotlinTypeRefiner.Default.INSTANCE, 16, null);
        }
        return ((declarationDescriptor instanceof PackageFragmentDescriptor) && (declarationDescriptor2 instanceof PackageFragmentDescriptor)) ? Intrinsics.areEqual(((PackageFragmentDescriptor) declarationDescriptor).getFqName(), ((PackageFragmentDescriptor) declarationDescriptor2).getFqName()) : Intrinsics.areEqual(declarationDescriptor, declarationDescriptor2);
    }

    @JvmOverloads
    public final boolean areTypeParametersEquivalent(@NotNull TypeParameterDescriptor a10, @NotNull TypeParameterDescriptor b10, boolean z10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return areTypeParametersEquivalent$default(this, a10, b10, z10, null, 8, null);
    }

    @JvmOverloads
    public final boolean areTypeParametersEquivalent(@NotNull TypeParameterDescriptor a10, @NotNull TypeParameterDescriptor b10, boolean z10, @NotNull Function2<? super DeclarationDescriptor, ? super DeclarationDescriptor, Boolean> equivalentCallables) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        Intrinsics.checkNotNullParameter(equivalentCallables, "equivalentCallables");
        if (Intrinsics.areEqual(a10, b10)) {
            return true;
        }
        return !Intrinsics.areEqual(a10.getContainingDeclaration(), b10.getContainingDeclaration()) && a(a10, b10, equivalentCallables, z10) && a10.getIndex() == b10.getIndex();
    }
}
