package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import bk.d;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.ErasureProjectionComputer;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RawSubstitution.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nRawSubstitution.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RawSubstitution.kt\norg/jetbrains/kotlin/load/java/lazy/types/RawSubstitution\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,95:1\n1549#2:96\n1620#2,3:97\n*S KotlinDebug\n*F\n+ 1 RawSubstitution.kt\norg/jetbrains/kotlin/load/java/lazy/types/RawSubstitution\n*L\n73#1:96\n73#1:97,3\n*E\n"})
public final class RawSubstitution extends TypeSubstitution {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final JavaTypeAttributes f80763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final JavaTypeAttributes f80764d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final RawProjectionComputer f80765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final TypeParameterUpperBoundEraser f80766b;

    /* JADX INFO: compiled from: RawSubstitution.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: RawSubstitution.kt */
    public static final class a extends Lambda implements Function1<KotlinTypeRefiner, SimpleType> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ ClassDescriptor f80767p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ RawSubstitution f80768q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ SimpleType f80769r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ JavaTypeAttributes f80770s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(RawSubstitution rawSubstitution, SimpleType simpleType, ClassDescriptor classDescriptor, JavaTypeAttributes javaTypeAttributes) {
            super(1);
            this.f80767p0 = classDescriptor;
            this.f80768q0 = rawSubstitution;
            this.f80769r0 = simpleType;
            this.f80770s0 = javaTypeAttributes;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final SimpleType invoke(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
            ClassId classId;
            ClassDescriptor classDescriptorFindClassAcrossModuleDependencies;
            Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
            ClassDescriptor classDescriptor = this.f80767p0;
            ClassDescriptor classDescriptor2 = classDescriptor instanceof ClassDescriptor ? classDescriptor : null;
            if (classDescriptor2 == null || (classId = DescriptorUtilsKt.getClassId(classDescriptor2)) == null || (classDescriptorFindClassAcrossModuleDependencies = kotlinTypeRefiner.findClassAcrossModuleDependencies(classId)) == null || Intrinsics.areEqual(classDescriptorFindClassAcrossModuleDependencies, classDescriptor)) {
                return null;
            }
            return (SimpleType) this.f80768q0.a(this.f80769r0, classDescriptorFindClassAcrossModuleDependencies, this.f80770s0).getFirst();
        }
    }

    static {
        TypeUsage typeUsage = TypeUsage.COMMON;
        f80763c = JavaTypeAttributesKt.toAttributes$default(typeUsage, false, true, null, 5, null).withFlexibility(JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND);
        f80764d = JavaTypeAttributesKt.toAttributes$default(typeUsage, false, true, null, 5, null).withFlexibility(JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RawSubstitution() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final Pair<SimpleType, Boolean> a(SimpleType simpleType, ClassDescriptor classDescriptor, JavaTypeAttributes javaTypeAttributes) {
        if (simpleType.getConstructor().getParameters().isEmpty()) {
            return TuplesKt.to(simpleType, Boolean.FALSE);
        }
        if (KotlinBuiltIns.isArray(simpleType)) {
            TypeProjection typeProjection = simpleType.getArguments().get(0);
            Variance projectionKind = typeProjection.getProjectionKind();
            KotlinType type = typeProjection.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            return TuplesKt.to(KotlinTypeFactory.simpleType$default(simpleType.getAttributes(), simpleType.getConstructor(), d.listOf(new TypeProjectionImpl(projectionKind, b(type, javaTypeAttributes))), simpleType.isMarkedNullable(), (KotlinTypeRefiner) null, 16, (Object) null), Boolean.FALSE);
        }
        if (KotlinTypeKt.isError(simpleType)) {
            return TuplesKt.to(ErrorUtils.createErrorType(ErrorTypeKind.ERROR_RAW_TYPE, simpleType.getConstructor().toString()), Boolean.FALSE);
        }
        MemberScope memberScope = classDescriptor.getMemberScope(this);
        Intrinsics.checkNotNullExpressionValue(memberScope, "getMemberScope(...)");
        TypeAttributes attributes = simpleType.getAttributes();
        TypeConstructor typeConstructor = classDescriptor.getTypeConstructor();
        Intrinsics.checkNotNullExpressionValue(typeConstructor, "getTypeConstructor(...)");
        List<TypeParameterDescriptor> parameters = classDescriptor.getTypeConstructor().getParameters();
        Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
        List<TypeParameterDescriptor> list = parameters;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (TypeParameterDescriptor typeParameterDescriptor : list) {
            RawProjectionComputer rawProjectionComputer = this.f80765a;
            Intrinsics.checkNotNull(typeParameterDescriptor);
            arrayList.add(ErasureProjectionComputer.computeProjection$default(rawProjectionComputer, typeParameterDescriptor, javaTypeAttributes, this.f80766b, null, 8, null));
        }
        return TuplesKt.to(KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(attributes, typeConstructor, arrayList, simpleType.isMarkedNullable(), memberScope, new a(this, simpleType, classDescriptor, javaTypeAttributes)), Boolean.TRUE);
    }

    public final KotlinType b(KotlinType kotlinType, JavaTypeAttributes javaTypeAttributes) {
        ClassifierDescriptor classifierDescriptorMo5778getDeclarationDescriptor = kotlinType.getConstructor().mo5778getDeclarationDescriptor();
        if (classifierDescriptorMo5778getDeclarationDescriptor instanceof TypeParameterDescriptor) {
            return b(this.f80766b.getErasedUpperBound((TypeParameterDescriptor) classifierDescriptorMo5778getDeclarationDescriptor, javaTypeAttributes.markIsRaw(true)), javaTypeAttributes);
        }
        if (!(classifierDescriptorMo5778getDeclarationDescriptor instanceof ClassDescriptor)) {
            throw new IllegalStateException(("Unexpected declaration kind: " + classifierDescriptorMo5778getDeclarationDescriptor).toString());
        }
        ClassifierDescriptor classifierDescriptorMo5778getDeclarationDescriptor2 = FlexibleTypesKt.upperIfFlexible(kotlinType).getConstructor().mo5778getDeclarationDescriptor();
        if (classifierDescriptorMo5778getDeclarationDescriptor2 instanceof ClassDescriptor) {
            Pair<SimpleType, Boolean> pairA = a(FlexibleTypesKt.lowerIfFlexible(kotlinType), (ClassDescriptor) classifierDescriptorMo5778getDeclarationDescriptor, f80763c);
            SimpleType simpleTypeComponent1 = pairA.component1();
            boolean zBooleanValue = pairA.component2().booleanValue();
            Pair<SimpleType, Boolean> pairA2 = a(FlexibleTypesKt.upperIfFlexible(kotlinType), (ClassDescriptor) classifierDescriptorMo5778getDeclarationDescriptor2, f80764d);
            SimpleType simpleTypeComponent2 = pairA2.component1();
            return (zBooleanValue || pairA2.component2().booleanValue()) ? new RawTypeImpl(simpleTypeComponent1, simpleTypeComponent2) : KotlinTypeFactory.flexibleType(simpleTypeComponent1, simpleTypeComponent2);
        }
        throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + classifierDescriptorMo5778getDeclarationDescriptor2 + "\" while for lower it's \"" + classifierDescriptorMo5778getDeclarationDescriptor + '\"').toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean isEmpty() {
        return false;
    }

    public RawSubstitution(@Nullable TypeParameterUpperBoundEraser typeParameterUpperBoundEraser) {
        RawProjectionComputer rawProjectionComputer = new RawProjectionComputer();
        this.f80765a = rawProjectionComputer;
        this.f80766b = typeParameterUpperBoundEraser == null ? new TypeParameterUpperBoundEraser(rawProjectionComputer, null, 2, null) : typeParameterUpperBoundEraser;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    @NotNull
    /* JADX INFO: renamed from: get */
    public TypeProjectionImpl mo5782get(@NotNull KotlinType key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return new TypeProjectionImpl(b(key, new JavaTypeAttributes(TypeUsage.COMMON, null, false, false, null, null, 62, null)));
    }

    public /* synthetic */ RawSubstitution(TypeParameterUpperBoundEraser typeParameterUpperBoundEraser, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : typeParameterUpperBoundEraser);
    }
}
