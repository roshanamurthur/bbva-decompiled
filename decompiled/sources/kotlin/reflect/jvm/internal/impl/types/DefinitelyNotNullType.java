package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.checker.NewTypeVariableConstructor;
import kotlin.reflect.jvm.internal.impl.types.model.DefinitelyNotNullTypeMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SpecialTypes.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class DefinitelyNotNullType extends DelegatingSimpleType implements CustomTypeParameter, DefinitelyNotNullTypeMarker {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final SimpleType f81906q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final boolean f81907r0;

    /* JADX INFO: compiled from: SpecialTypes.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ DefinitelyNotNullType makeDefinitelyNotNull$default(Companion companion, UnwrappedType unwrappedType, boolean z10, boolean z11, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            if ((i10 & 4) != 0) {
                z11 = false;
            }
            return companion.makeDefinitelyNotNull(unwrappedType, z10, z11);
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x0069, code lost:
        
            if (r5 != false) goto L34;
         */
        @kotlin.jvm.JvmOverloads
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType makeDefinitelyNotNull(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.UnwrappedType r3, boolean r4, boolean r5) {
            /*
                r2 = this;
                java.lang.String r0 = "type"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                boolean r0 = r3 instanceof kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType
                if (r0 == 0) goto Ld
                kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType r3 = (kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType) r3
                goto L97
            Ld:
                r0 = 0
                if (r5 != 0) goto L6e
                kotlin.reflect.jvm.internal.impl.types.TypeConstructor r5 = r3.getConstructor()
                boolean r5 = r5 instanceof kotlin.reflect.jvm.internal.impl.types.checker.NewTypeVariableConstructor
                if (r5 != 0) goto L2c
                kotlin.reflect.jvm.internal.impl.types.TypeConstructor r5 = r3.getConstructor()
                kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor r5 = r5.mo5778getDeclarationDescriptor()
                boolean r5 = r5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
                if (r5 != 0) goto L2c
                boolean r5 = r3 instanceof kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedType
                if (r5 != 0) goto L2c
                boolean r5 = r3 instanceof kotlin.reflect.jvm.internal.impl.types.StubTypeForBuilderInference
                if (r5 == 0) goto L6c
            L2c:
                boolean r5 = r3 instanceof kotlin.reflect.jvm.internal.impl.types.StubTypeForBuilderInference
                if (r5 == 0) goto L35
                boolean r5 = kotlin.reflect.jvm.internal.impl.types.TypeUtils.isNullableType(r3)
                goto L69
            L35:
                kotlin.reflect.jvm.internal.impl.types.TypeConstructor r5 = r3.getConstructor()
                kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor r5 = r5.mo5778getDeclarationDescriptor()
                boolean r1 = r5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl
                if (r1 == 0) goto L44
                kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl r5 = (kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl) r5
                goto L45
            L44:
                r5 = r0
            L45:
                if (r5 == 0) goto L4e
                boolean r5 = r5.isInitialized()
                if (r5 != 0) goto L4e
                goto L6e
            L4e:
                if (r4 == 0) goto L61
                kotlin.reflect.jvm.internal.impl.types.TypeConstructor r5 = r3.getConstructor()
                kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor r5 = r5.mo5778getDeclarationDescriptor()
                boolean r5 = r5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
                if (r5 == 0) goto L61
                boolean r5 = kotlin.reflect.jvm.internal.impl.types.TypeUtils.isNullableType(r3)
                goto L69
            L61:
                kotlin.reflect.jvm.internal.impl.types.checker.NullabilityChecker r5 = kotlin.reflect.jvm.internal.impl.types.checker.NullabilityChecker.INSTANCE
                boolean r5 = r5.isSubtypeOfAny(r3)
                r5 = r5 ^ 1
            L69:
                if (r5 == 0) goto L6c
                goto L6e
            L6c:
                r3 = r0
                goto L97
            L6e:
                boolean r5 = r3 instanceof kotlin.reflect.jvm.internal.impl.types.FlexibleType
                if (r5 == 0) goto L88
                r5 = r3
                kotlin.reflect.jvm.internal.impl.types.FlexibleType r5 = (kotlin.reflect.jvm.internal.impl.types.FlexibleType) r5
                kotlin.reflect.jvm.internal.impl.types.SimpleType r1 = r5.getLowerBound()
                kotlin.reflect.jvm.internal.impl.types.TypeConstructor r1 = r1.getConstructor()
                kotlin.reflect.jvm.internal.impl.types.SimpleType r5 = r5.getUpperBound()
                kotlin.reflect.jvm.internal.impl.types.TypeConstructor r5 = r5.getConstructor()
                kotlin.jvm.internal.Intrinsics.areEqual(r1, r5)
            L88:
                kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType r5 = new kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType
                kotlin.reflect.jvm.internal.impl.types.SimpleType r3 = kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt.lowerIfFlexible(r3)
                r1 = 0
                kotlin.reflect.jvm.internal.impl.types.SimpleType r3 = r3.makeNullableAsSpecified(r1)
                r5.<init>(r3, r4, r0)
                r3 = r5
            L97:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType.Companion.makeDefinitelyNotNull(kotlin.reflect.jvm.internal.impl.types.UnwrappedType, boolean, boolean):kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType");
        }
    }

    public /* synthetic */ DefinitelyNotNullType(SimpleType simpleType, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(simpleType, z10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    @NotNull
    public SimpleType getDelegate() {
        return this.f81906q0;
    }

    @NotNull
    public final SimpleType getOriginal() {
        return this.f81906q0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean isMarkedNullable() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter
    public boolean isTypeParameter() {
        return (getDelegate().getConstructor() instanceof NewTypeVariableConstructor) || (getDelegate().getConstructor().mo5778getDeclarationDescriptor() instanceof TypeParameterDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter
    @NotNull
    public KotlinType substitutionResult(@NotNull KotlinType replacement) {
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        return SpecialTypesKt.makeDefinitelyNotNullOrNotNull(replacement.unwrap(), this.f81907r0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    @NotNull
    public String toString() {
        return getDelegate() + " & Any";
    }

    public DefinitelyNotNullType(SimpleType simpleType, boolean z10) {
        this.f81906q0 = simpleType;
        this.f81907r0 = z10;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    public SimpleType makeNullableAsSpecified(boolean z10) {
        return z10 ? getDelegate().makeNullableAsSpecified(z10) : this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    public SimpleType replaceAttributes(@NotNull TypeAttributes newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return new DefinitelyNotNullType(getDelegate().replaceAttributes(newAttributes), this.f81907r0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    @NotNull
    public DefinitelyNotNullType replaceDelegate(@NotNull SimpleType delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        return new DefinitelyNotNullType(delegate, this.f81907r0);
    }
}
