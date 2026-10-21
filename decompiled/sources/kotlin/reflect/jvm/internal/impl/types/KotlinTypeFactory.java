package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptorKt;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: KotlinTypeFactory.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nKotlinTypeFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KotlinTypeFactory.kt\norg/jetbrains/kotlin/types/KotlinTypeFactory\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,276:1\n1#2:277\n*E\n"})
public final class KotlinTypeFactory {

    @NotNull
    public static final KotlinTypeFactory INSTANCE = new KotlinTypeFactory();

    /* JADX INFO: compiled from: KotlinTypeFactory.kt */
    public static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final /* synthetic */ int f81932p0 = 0;

        static {
            new a(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Void invoke(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
            Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "<anonymous parameter 0>");
            return null;
        }
    }

    /* JADX INFO: compiled from: KotlinTypeFactory.kt */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final SimpleType f81933a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final TypeConstructor f81934b;

        public b(@Nullable SimpleType simpleType, @Nullable TypeConstructor typeConstructor) {
            this.f81933a = simpleType;
            this.f81934b = typeConstructor;
        }

        @Nullable
        public final SimpleType getExpandedType() {
            return this.f81933a;
        }

        @Nullable
        public final TypeConstructor getRefinedConstructor() {
            return this.f81934b;
        }
    }

    /* JADX INFO: compiled from: KotlinTypeFactory.kt */
    @SourceDebugExtension({"SMAP\nKotlinTypeFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KotlinTypeFactory.kt\norg/jetbrains/kotlin/types/KotlinTypeFactory$simpleType$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,276:1\n1#2:277\n*E\n"})
    public static final class c extends Lambda implements Function1<KotlinTypeRefiner, SimpleType> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ TypeConstructor f81935p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ List<TypeProjection> f81936q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ TypeAttributes f81937r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ boolean f81938s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(TypeAttributes typeAttributes, TypeConstructor typeConstructor, List list, boolean z10) {
            super(1);
            this.f81935p0 = typeConstructor;
            this.f81936q0 = list;
            this.f81937r0 = typeAttributes;
            this.f81938s0 = z10;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final SimpleType invoke(@NotNull KotlinTypeRefiner refiner) {
            Intrinsics.checkNotNullParameter(refiner, "refiner");
            KotlinTypeFactory kotlinTypeFactory = KotlinTypeFactory.INSTANCE;
            TypeConstructor typeConstructor = this.f81935p0;
            List<TypeProjection> list = this.f81936q0;
            b bVarAccess$refineConstructor = KotlinTypeFactory.access$refineConstructor(kotlinTypeFactory, typeConstructor, refiner, list);
            if (bVarAccess$refineConstructor == null) {
                return null;
            }
            SimpleType expandedType = bVarAccess$refineConstructor.getExpandedType();
            if (expandedType != null) {
                return expandedType;
            }
            TypeConstructor refinedConstructor = bVarAccess$refineConstructor.getRefinedConstructor();
            Intrinsics.checkNotNull(refinedConstructor);
            return KotlinTypeFactory.simpleType(this.f81937r0, refinedConstructor, list, this.f81938s0, refiner);
        }
    }

    /* JADX INFO: compiled from: KotlinTypeFactory.kt */
    @SourceDebugExtension({"SMAP\nKotlinTypeFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KotlinTypeFactory.kt\norg/jetbrains/kotlin/types/KotlinTypeFactory$simpleTypeWithNonTrivialMemberScope$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,276:1\n1#2:277\n*E\n"})
    public static final class d extends Lambda implements Function1<KotlinTypeRefiner, SimpleType> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ TypeConstructor f81939p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ List<TypeProjection> f81940q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ TypeAttributes f81941r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ boolean f81942s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ MemberScope f81943t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(TypeAttributes typeAttributes, TypeConstructor typeConstructor, List list, boolean z10, MemberScope memberScope) {
            super(1);
            this.f81939p0 = typeConstructor;
            this.f81940q0 = list;
            this.f81941r0 = typeAttributes;
            this.f81942s0 = z10;
            this.f81943t0 = memberScope;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final SimpleType invoke(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
            Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
            KotlinTypeFactory kotlinTypeFactory = KotlinTypeFactory.INSTANCE;
            TypeConstructor typeConstructor = this.f81939p0;
            List<TypeProjection> list = this.f81940q0;
            b bVarAccess$refineConstructor = KotlinTypeFactory.access$refineConstructor(kotlinTypeFactory, typeConstructor, kotlinTypeRefiner, list);
            if (bVarAccess$refineConstructor == null) {
                return null;
            }
            SimpleType expandedType = bVarAccess$refineConstructor.getExpandedType();
            if (expandedType != null) {
                return expandedType;
            }
            TypeConstructor refinedConstructor = bVarAccess$refineConstructor.getRefinedConstructor();
            Intrinsics.checkNotNull(refinedConstructor);
            return KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(this.f81941r0, refinedConstructor, list, this.f81942s0, this.f81943t0);
        }
    }

    static {
        int i10 = a.f81932p0;
    }

    public static final b access$refineConstructor(KotlinTypeFactory kotlinTypeFactory, TypeConstructor typeConstructor, KotlinTypeRefiner kotlinTypeRefiner, List list) {
        ClassifierDescriptor classifierDescriptorRefineDescriptor;
        b bVar;
        kotlinTypeFactory.getClass();
        ClassifierDescriptor classifierDescriptorMo5778getDeclarationDescriptor = typeConstructor.mo5778getDeclarationDescriptor();
        if (classifierDescriptorMo5778getDeclarationDescriptor == null || (classifierDescriptorRefineDescriptor = kotlinTypeRefiner.refineDescriptor(classifierDescriptorMo5778getDeclarationDescriptor)) == null) {
            return null;
        }
        if (classifierDescriptorRefineDescriptor instanceof TypeAliasDescriptor) {
            bVar = new b(computeExpandedType((TypeAliasDescriptor) classifierDescriptorRefineDescriptor, list), null);
        } else {
            TypeConstructor typeConstructorRefine = classifierDescriptorRefineDescriptor.getTypeConstructor().refine(kotlinTypeRefiner);
            Intrinsics.checkNotNullExpressionValue(typeConstructorRefine, "refine(...)");
            bVar = new b(null, typeConstructorRefine);
        }
        return bVar;
    }

    @JvmStatic
    @NotNull
    public static final SimpleType computeExpandedType(@NotNull TypeAliasDescriptor typeAliasDescriptor, @NotNull List<? extends TypeProjection> arguments) {
        Intrinsics.checkNotNullParameter(typeAliasDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        return new TypeAliasExpander(TypeAliasExpansionReportStrategy.DO_NOTHING.INSTANCE, false).expand(TypeAliasExpansion.Companion.create(null, typeAliasDescriptor, arguments), TypeAttributes.Companion.getEmpty());
    }

    @JvmStatic
    @NotNull
    public static final UnwrappedType flexibleType(@NotNull SimpleType lowerBound, @NotNull SimpleType upperBound) {
        Intrinsics.checkNotNullParameter(lowerBound, "lowerBound");
        Intrinsics.checkNotNullParameter(upperBound, "upperBound");
        return Intrinsics.areEqual(lowerBound, upperBound) ? lowerBound : new FlexibleTypeImpl(lowerBound, upperBound);
    }

    @JvmStatic
    @NotNull
    public static final SimpleType integerLiteralType(@NotNull TypeAttributes attributes, @NotNull IntegerLiteralTypeConstructor constructor, boolean z10) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        return simpleTypeWithNonTrivialMemberScope(attributes, constructor, CollectionsKt__CollectionsKt.emptyList(), z10, ErrorUtils.createErrorScope(ErrorScopeKind.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"));
    }

    @JvmStatic
    @NotNull
    public static final SimpleType simpleNotNullType(@NotNull TypeAttributes attributes, @NotNull ClassDescriptor descriptor, @NotNull List<? extends TypeProjection> arguments) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        TypeConstructor typeConstructor = descriptor.getTypeConstructor();
        Intrinsics.checkNotNullExpressionValue(typeConstructor, "getTypeConstructor(...)");
        return simpleType$default(attributes, typeConstructor, (List) arguments, false, (KotlinTypeRefiner) null, 16, (Object) null);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final SimpleType simpleType(@NotNull TypeAttributes attributes, @NotNull TypeConstructor constructor, @NotNull List<? extends TypeProjection> arguments, boolean z10) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        return simpleType$default(attributes, constructor, arguments, z10, (KotlinTypeRefiner) null, 16, (Object) null);
    }

    public static /* synthetic */ SimpleType simpleType$default(TypeAttributes typeAttributes, TypeConstructor typeConstructor, List list, boolean z10, KotlinTypeRefiner kotlinTypeRefiner, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            kotlinTypeRefiner = null;
        }
        return simpleType(typeAttributes, typeConstructor, (List<? extends TypeProjection>) list, z10, kotlinTypeRefiner);
    }

    @JvmStatic
    @NotNull
    public static final SimpleType simpleTypeWithNonTrivialMemberScope(@NotNull TypeAttributes attributes, @NotNull TypeConstructor constructor, @NotNull List<? extends TypeProjection> arguments, boolean z10, @NotNull MemberScope memberScope) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(memberScope, "memberScope");
        kotlin.reflect.jvm.internal.impl.types.b bVar = new kotlin.reflect.jvm.internal.impl.types.b(constructor, arguments, z10, memberScope, new d(attributes, constructor, arguments, z10, memberScope));
        return attributes.isEmpty() ? bVar : new hl.c(bVar, attributes);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final SimpleType simpleType(@NotNull TypeAttributes attributes, @NotNull TypeConstructor constructor, @NotNull List<? extends TypeProjection> arguments, boolean z10, @Nullable KotlinTypeRefiner kotlinTypeRefiner) {
        MemberScope memberScopeCreateScopeForKotlinType;
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        if (attributes.isEmpty() && arguments.isEmpty() && !z10 && constructor.mo5778getDeclarationDescriptor() != null) {
            ClassifierDescriptor classifierDescriptorMo5778getDeclarationDescriptor = constructor.mo5778getDeclarationDescriptor();
            Intrinsics.checkNotNull(classifierDescriptorMo5778getDeclarationDescriptor);
            SimpleType defaultType = classifierDescriptorMo5778getDeclarationDescriptor.getDefaultType();
            Intrinsics.checkNotNullExpressionValue(defaultType, "getDefaultType(...)");
            return defaultType;
        }
        INSTANCE.getClass();
        ClassifierDescriptor classifierDescriptorMo5778getDeclarationDescriptor2 = constructor.mo5778getDeclarationDescriptor();
        if (classifierDescriptorMo5778getDeclarationDescriptor2 instanceof TypeParameterDescriptor) {
            memberScopeCreateScopeForKotlinType = ((TypeParameterDescriptor) classifierDescriptorMo5778getDeclarationDescriptor2).getDefaultType().getMemberScope();
        } else if (classifierDescriptorMo5778getDeclarationDescriptor2 instanceof ClassDescriptor) {
            if (kotlinTypeRefiner == null) {
                kotlinTypeRefiner = DescriptorUtilsKt.getKotlinTypeRefiner(DescriptorUtilsKt.getModule(classifierDescriptorMo5778getDeclarationDescriptor2));
            }
            memberScopeCreateScopeForKotlinType = arguments.isEmpty() ? ModuleAwareClassDescriptorKt.getRefinedUnsubstitutedMemberScopeIfPossible((ClassDescriptor) classifierDescriptorMo5778getDeclarationDescriptor2, kotlinTypeRefiner) : ModuleAwareClassDescriptorKt.getRefinedMemberScopeIfPossible((ClassDescriptor) classifierDescriptorMo5778getDeclarationDescriptor2, TypeConstructorSubstitution.Companion.create(constructor, arguments), kotlinTypeRefiner);
        } else if (classifierDescriptorMo5778getDeclarationDescriptor2 instanceof TypeAliasDescriptor) {
            ErrorScopeKind errorScopeKind = ErrorScopeKind.SCOPE_FOR_ABBREVIATION_TYPE;
            String string = ((TypeAliasDescriptor) classifierDescriptorMo5778getDeclarationDescriptor2).getName().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            memberScopeCreateScopeForKotlinType = ErrorUtils.createErrorScope(errorScopeKind, true, string);
        } else {
            if (!(constructor instanceof IntersectionTypeConstructor)) {
                throw new IllegalStateException("Unsupported classifier: " + classifierDescriptorMo5778getDeclarationDescriptor2 + " for constructor: " + constructor);
            }
            memberScopeCreateScopeForKotlinType = ((IntersectionTypeConstructor) constructor).createScopeForKotlinType();
        }
        return simpleTypeWithNonTrivialMemberScope(attributes, constructor, arguments, z10, memberScopeCreateScopeForKotlinType, new c(attributes, constructor, arguments, z10));
    }

    public static /* synthetic */ SimpleType simpleType$default(SimpleType simpleType, TypeAttributes typeAttributes, TypeConstructor typeConstructor, List list, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            typeAttributes = simpleType.getAttributes();
        }
        if ((i10 & 4) != 0) {
            typeConstructor = simpleType.getConstructor();
        }
        if ((i10 & 8) != 0) {
            list = simpleType.getArguments();
        }
        if ((i10 & 16) != 0) {
            z10 = simpleType.isMarkedNullable();
        }
        return simpleType(simpleType, typeAttributes, typeConstructor, (List<? extends TypeProjection>) list, z10);
    }

    @JvmStatic
    @NotNull
    public static final SimpleType simpleTypeWithNonTrivialMemberScope(@NotNull TypeAttributes attributes, @NotNull TypeConstructor constructor, @NotNull List<? extends TypeProjection> arguments, boolean z10, @NotNull MemberScope memberScope, @NotNull Function1<? super KotlinTypeRefiner, ? extends SimpleType> refinedTypeFactory) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(memberScope, "memberScope");
        Intrinsics.checkNotNullParameter(refinedTypeFactory, "refinedTypeFactory");
        kotlin.reflect.jvm.internal.impl.types.b bVar = new kotlin.reflect.jvm.internal.impl.types.b(constructor, arguments, z10, memberScope, refinedTypeFactory);
        return attributes.isEmpty() ? bVar : new hl.c(bVar, attributes);
    }

    @JvmStatic
    @NotNull
    public static final SimpleType simpleType(@NotNull SimpleType baseType, @NotNull TypeAttributes annotations, @NotNull TypeConstructor constructor, @NotNull List<? extends TypeProjection> arguments, boolean z10) {
        Intrinsics.checkNotNullParameter(baseType, "baseType");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        return simpleType$default(annotations, constructor, arguments, z10, (KotlinTypeRefiner) null, 16, (Object) null);
    }
}
