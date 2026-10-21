package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TypeAliasExpander.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nTypeAliasExpander.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeAliasExpander.kt\norg/jetbrains/kotlin/types/TypeAliasExpander\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,278:1\n1#2:279\n1620#3,3:280\n1559#3:283\n1590#3,4:284\n1559#3:288\n1590#3,4:289\n1864#3,3:293\n*S KotlinDebug\n*F\n+ 1 TypeAliasExpander.kt\norg/jetbrains/kotlin/types/TypeAliasExpander\n*L\n148#1:280,3\n197#1:283\n197#1:284,4\n232#1:288\n232#1:289,4\n249#1:293,3\n*E\n"})
public final class TypeAliasExpander {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final TypeAliasExpansionReportStrategy f81958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f81959b;

    /* JADX INFO: compiled from: TypeAliasExpander.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final void access$assertRecursionDepth(Companion companion, int i10, TypeAliasDescriptor typeAliasDescriptor) {
            companion.getClass();
            if (i10 <= 100) {
                return;
            }
            throw new AssertionError("Too deep recursion while expanding type alias " + typeAliasDescriptor.getName());
        }
    }

    static {
        new TypeAliasExpander(TypeAliasExpansionReportStrategy.DO_NOTHING.INSTANCE, false);
    }

    public TypeAliasExpander(@NotNull TypeAliasExpansionReportStrategy reportStrategy, boolean z10) {
        Intrinsics.checkNotNullParameter(reportStrategy, "reportStrategy");
        this.f81958a = reportStrategy;
        this.f81959b = z10;
    }

    public final void a(Annotations annotations, Annotations annotations2) {
        HashSet hashSet = new HashSet();
        Iterator<AnnotationDescriptor> it = annotations.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().getFqName());
        }
        for (AnnotationDescriptor annotationDescriptor : annotations2) {
            if (hashSet.contains(annotationDescriptor.getFqName())) {
                this.f81958a.repeatedAnnotation(annotationDescriptor);
            }
        }
    }

    public final SimpleType b(TypeAliasExpansion typeAliasExpansion, TypeAttributes typeAttributes, boolean z10, int i10, boolean z11) {
        TypeProjection typeProjectionC = c(new TypeProjectionImpl(Variance.INVARIANT, typeAliasExpansion.getDescriptor().getUnderlyingType()), typeAliasExpansion, null, i10);
        KotlinType type = typeProjectionC.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        SimpleType simpleTypeAsSimpleType = TypeSubstitutionKt.asSimpleType(type);
        if (KotlinTypeKt.isError(simpleTypeAsSimpleType)) {
            return simpleTypeAsSimpleType;
        }
        typeProjectionC.getProjectionKind();
        a(simpleTypeAsSimpleType.getAnnotations(), AnnotationsTypeAttributeKt.getAnnotations(typeAttributes));
        if (!KotlinTypeKt.isError(simpleTypeAsSimpleType)) {
            simpleTypeAsSimpleType = TypeSubstitutionKt.replace$default(simpleTypeAsSimpleType, null, KotlinTypeKt.isError(simpleTypeAsSimpleType) ? simpleTypeAsSimpleType.getAttributes() : typeAttributes.add(simpleTypeAsSimpleType.getAttributes()), 1, null);
        }
        SimpleType simpleTypeMakeNullableIfNeeded = TypeUtils.makeNullableIfNeeded(simpleTypeAsSimpleType, z10);
        Intrinsics.checkNotNullExpressionValue(simpleTypeMakeNullableIfNeeded, "let(...)");
        if (!z11) {
            return simpleTypeMakeNullableIfNeeded;
        }
        TypeConstructor typeConstructor = typeAliasExpansion.getDescriptor().getTypeConstructor();
        Intrinsics.checkNotNullExpressionValue(typeConstructor, "getTypeConstructor(...)");
        return SpecialTypesKt.withAbbreviation(simpleTypeMakeNullableIfNeeded, KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(typeAttributes, typeConstructor, typeAliasExpansion.getArguments(), z10, MemberScope.Empty.INSTANCE));
    }

    public final TypeProjection c(TypeProjection typeProjection, TypeAliasExpansion typeAliasExpansion, TypeParameterDescriptor typeParameterDescriptor, int i10) {
        Variance variance;
        SimpleType simpleTypeMakeNullableIfNeeded;
        TypeAttributes typeAttributesAdd;
        KotlinType kotlinTypeReplace$default;
        Variance variance2;
        Variance variance3;
        Companion.access$assertRecursionDepth(Companion, i10, typeAliasExpansion.getDescriptor());
        if (typeProjection.isStarProjection()) {
            Intrinsics.checkNotNull(typeParameterDescriptor);
            TypeProjection typeProjectionMakeStarProjection = TypeUtils.makeStarProjection(typeParameterDescriptor);
            Intrinsics.checkNotNullExpressionValue(typeProjectionMakeStarProjection, "makeStarProjection(...)");
            return typeProjectionMakeStarProjection;
        }
        KotlinType type = typeProjection.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        TypeProjection replacement = typeAliasExpansion.getReplacement(type.getConstructor());
        TypeAliasExpansionReportStrategy typeAliasExpansionReportStrategy = this.f81958a;
        if (replacement != null) {
            if (replacement.isStarProjection()) {
                Intrinsics.checkNotNull(typeParameterDescriptor);
                TypeProjection typeProjectionMakeStarProjection2 = TypeUtils.makeStarProjection(typeParameterDescriptor);
                Intrinsics.checkNotNullExpressionValue(typeProjectionMakeStarProjection2, "makeStarProjection(...)");
                return typeProjectionMakeStarProjection2;
            }
            UnwrappedType unwrappedTypeUnwrap = replacement.getType().unwrap();
            Variance projectionKind = replacement.getProjectionKind();
            Intrinsics.checkNotNullExpressionValue(projectionKind, "getProjectionKind(...)");
            Variance projectionKind2 = typeProjection.getProjectionKind();
            Intrinsics.checkNotNullExpressionValue(projectionKind2, "getProjectionKind(...)");
            if (projectionKind2 != projectionKind && projectionKind2 != (variance3 = Variance.INVARIANT)) {
                if (projectionKind == variance3) {
                    projectionKind = projectionKind2;
                } else {
                    typeAliasExpansionReportStrategy.conflictingProjection(typeAliasExpansion.getDescriptor(), typeParameterDescriptor, unwrappedTypeUnwrap);
                }
            }
            if (typeParameterDescriptor == null || (variance = typeParameterDescriptor.getVariance()) == null) {
                variance = Variance.INVARIANT;
            }
            Intrinsics.checkNotNull(variance);
            if (variance != projectionKind && variance != (variance2 = Variance.INVARIANT)) {
                if (projectionKind == variance2) {
                    projectionKind = variance2;
                } else {
                    typeAliasExpansionReportStrategy.conflictingProjection(typeAliasExpansion.getDescriptor(), typeParameterDescriptor, unwrappedTypeUnwrap);
                }
            }
            a(type.getAnnotations(), unwrappedTypeUnwrap.getAnnotations());
            if (unwrappedTypeUnwrap instanceof DynamicType) {
                DynamicType dynamicType = (DynamicType) unwrappedTypeUnwrap;
                kotlinTypeReplace$default = dynamicType.replaceAttributes(KotlinTypeKt.isError(dynamicType) ? dynamicType.getAttributes() : type.getAttributes().add(dynamicType.getAttributes()));
            } else {
                simpleTypeMakeNullableIfNeeded = TypeUtils.makeNullableIfNeeded(TypeSubstitutionKt.asSimpleType(unwrappedTypeUnwrap), type.isMarkedNullable());
                Intrinsics.checkNotNullExpressionValue(simpleTypeMakeNullableIfNeeded, "makeNullableIfNeeded(...)");
                TypeAttributes attributes = type.getAttributes();
                if (!KotlinTypeKt.isError(simpleTypeMakeNullableIfNeeded)) {
                    if (KotlinTypeKt.isError(simpleTypeMakeNullableIfNeeded)) {
                        kotlinTypeReplace$default = simpleTypeMakeNullableIfNeeded;
                        typeAttributesAdd = simpleTypeMakeNullableIfNeeded.getAttributes();
                    } else {
                        kotlinTypeReplace$default = simpleTypeMakeNullableIfNeeded;
                        typeAttributesAdd = attributes.add(simpleTypeMakeNullableIfNeeded.getAttributes());
                    }
                    kotlinTypeReplace$default = TypeSubstitutionKt.replace$default(simpleTypeMakeNullableIfNeeded, null, typeAttributesAdd, 1, null);
                }
            }
            kotlinTypeReplace$default = simpleTypeMakeNullableIfNeeded;
            return new TypeProjectionImpl(projectionKind, kotlinTypeReplace$default);
        }
        UnwrappedType unwrappedTypeUnwrap2 = typeProjection.getType().unwrap();
        if (DynamicTypesKt.isDynamic(unwrappedTypeUnwrap2)) {
            return typeProjection;
        }
        SimpleType simpleTypeAsSimpleType = TypeSubstitutionKt.asSimpleType(unwrappedTypeUnwrap2);
        if (KotlinTypeKt.isError(simpleTypeAsSimpleType) || !TypeUtilsKt.requiresTypeAliasExpansion(simpleTypeAsSimpleType)) {
            return typeProjection;
        }
        TypeConstructor constructor = simpleTypeAsSimpleType.getConstructor();
        ClassifierDescriptor classifierDescriptorMo5778getDeclarationDescriptor = constructor.mo5778getDeclarationDescriptor();
        constructor.getParameters().size();
        simpleTypeAsSimpleType.getArguments().size();
        if (classifierDescriptorMo5778getDeclarationDescriptor instanceof TypeParameterDescriptor) {
            return typeProjection;
        }
        int i11 = 0;
        if (classifierDescriptorMo5778getDeclarationDescriptor instanceof TypeAliasDescriptor) {
            TypeAliasDescriptor typeAliasDescriptor = (TypeAliasDescriptor) classifierDescriptorMo5778getDeclarationDescriptor;
            if (typeAliasExpansion.isRecursion(typeAliasDescriptor)) {
                typeAliasExpansionReportStrategy.recursiveTypeAlias(typeAliasDescriptor);
                Variance variance4 = Variance.INVARIANT;
                ErrorTypeKind errorTypeKind = ErrorTypeKind.RECURSIVE_TYPE_ALIAS;
                String string = typeAliasDescriptor.getName().toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return new TypeProjectionImpl(variance4, ErrorUtils.createErrorType(errorTypeKind, string));
            }
            List<TypeProjection> arguments = simpleTypeAsSimpleType.getArguments();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arguments, 10));
            for (Object obj : arguments) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                arrayList.add(c((TypeProjection) obj, typeAliasExpansion, constructor.getParameters().get(i11), i10 + 1));
                i11 = i12;
            }
            SimpleType simpleTypeB = b(TypeAliasExpansion.Companion.create(typeAliasExpansion, typeAliasDescriptor, arrayList), simpleTypeAsSimpleType.getAttributes(), simpleTypeAsSimpleType.isMarkedNullable(), i10 + 1, false);
            SimpleType simpleTypeD = d(simpleTypeAsSimpleType, typeAliasExpansion, i10);
            if (!DynamicTypesKt.isDynamic(simpleTypeB)) {
                simpleTypeB = SpecialTypesKt.withAbbreviation(simpleTypeB, simpleTypeD);
            }
            return new TypeProjectionImpl(typeProjection.getProjectionKind(), simpleTypeB);
        }
        SimpleType simpleTypeD2 = d(simpleTypeAsSimpleType, typeAliasExpansion, i10);
        TypeSubstitutor typeSubstitutorCreate = TypeSubstitutor.create(simpleTypeD2);
        Intrinsics.checkNotNullExpressionValue(typeSubstitutorCreate, "create(...)");
        for (Object obj2 : simpleTypeD2.getArguments()) {
            int i13 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            TypeProjection typeProjection2 = (TypeProjection) obj2;
            if (!typeProjection2.isStarProjection()) {
                KotlinType type2 = typeProjection2.getType();
                Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                if (!TypeUtilsKt.containsTypeAliasParameters(type2)) {
                    TypeProjection typeProjection3 = simpleTypeAsSimpleType.getArguments().get(i11);
                    TypeParameterDescriptor typeParameterDescriptor2 = simpleTypeAsSimpleType.getConstructor().getParameters().get(i11);
                    if (this.f81959b) {
                        KotlinType type3 = typeProjection3.getType();
                        Intrinsics.checkNotNullExpressionValue(type3, "getType(...)");
                        KotlinType type4 = typeProjection2.getType();
                        Intrinsics.checkNotNullExpressionValue(type4, "getType(...)");
                        Intrinsics.checkNotNull(typeParameterDescriptor2);
                        typeAliasExpansionReportStrategy.boundsViolationInSubstitution(typeSubstitutorCreate, type3, type4, typeParameterDescriptor2);
                    }
                }
            }
            i11 = i13;
        }
        return new TypeProjectionImpl(typeProjection.getProjectionKind(), simpleTypeD2);
    }

    public final SimpleType d(SimpleType simpleType, TypeAliasExpansion typeAliasExpansion, int i10) {
        TypeConstructor constructor = simpleType.getConstructor();
        List<TypeProjection> arguments = simpleType.getArguments();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arguments, 10));
        int i11 = 0;
        for (Object obj : arguments) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            TypeProjection typeProjection = (TypeProjection) obj;
            TypeProjection typeProjectionC = c(typeProjection, typeAliasExpansion, constructor.getParameters().get(i11), i10 + 1);
            if (!typeProjectionC.isStarProjection()) {
                typeProjectionC = new TypeProjectionImpl(typeProjectionC.getProjectionKind(), TypeUtils.makeNullableIfNeeded(typeProjectionC.getType(), typeProjection.getType().isMarkedNullable()));
            }
            arrayList.add(typeProjectionC);
            i11 = i12;
        }
        return TypeSubstitutionKt.replace$default(simpleType, arrayList, null, 2, null);
    }

    @NotNull
    public final SimpleType expand(@NotNull TypeAliasExpansion typeAliasExpansion, @NotNull TypeAttributes attributes) {
        Intrinsics.checkNotNullParameter(typeAliasExpansion, "typeAliasExpansion");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        return b(typeAliasExpansion, attributes, false, 0, true);
    }
}
