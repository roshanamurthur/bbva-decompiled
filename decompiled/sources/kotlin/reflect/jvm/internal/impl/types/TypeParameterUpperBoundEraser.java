package kotlin.reflect.jvm.internal.impl.types;

import androidx.camera.core.processing.f;
import bk.v;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.types.checker.IntersectionTypeKt;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TypeParameterUpperBoundEraser.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nTypeParameterUpperBoundEraser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeParameterUpperBoundEraser.kt\norg/jetbrains/kotlin/types/TypeParameterUpperBoundEraser\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,158:1\n1179#2,2:159\n1253#2,4:161\n1549#2:166\n1620#2,3:167\n1#3:165\n*S KotlinDebug\n*F\n+ 1 TypeParameterUpperBoundEraser.kt\norg/jetbrains/kotlin/types/TypeParameterUpperBoundEraser\n*L\n77#1:159,2\n77#1:161,4\n100#1:166\n100#1:167,3\n*E\n"})
public final class TypeParameterUpperBoundEraser {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ErasureProjectionComputer f81979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final TypeParameterErasureOptions f81980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lazy f81981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MemoizedFunctionToNotNull<a, KotlinType> f81982d;

    /* JADX INFO: compiled from: TypeParameterUpperBoundEraser.kt */
    @SourceDebugExtension({"SMAP\nTypeParameterUpperBoundEraser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeParameterUpperBoundEraser.kt\norg/jetbrains/kotlin/types/TypeParameterUpperBoundEraser$Companion\n+ 2 TypeUtils.kt\norg/jetbrains/kotlin/types/typeUtil/TypeUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,158:1\n261#2,14:159\n276#2:177\n1549#3:173\n1620#3,3:174\n*S KotlinDebug\n*F\n+ 1 TypeParameterUpperBoundEraser.kt\norg/jetbrains/kotlin/types/TypeParameterUpperBoundEraser$Companion\n*L\n140#1:159,14\n140#1:177\n140#1:173\n140#1:174,3\n*E\n"})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0089  */
        /* JADX WARN: Code duplicated, block: B:24:0x0093  */
        /* JADX WARN: Code duplicated, block: B:29:0x00a9  */
        /* JADX WARN: Code duplicated, block: B:48:0x0120  */
        /* JADX WARN: Code duplicated, block: B:52:0x012a  */
        /* JADX WARN: Code duplicated, block: B:57:0x0140  */
        /* JADX WARN: Code duplicated, block: B:79:0x01be  */
        /* JADX WARN: Code duplicated, block: B:83:0x01c8  */
        /* JADX WARN: Code duplicated, block: B:88:0x01de  */
        @NotNull
        public final KotlinType replaceArgumentsOfUpperBound(@NotNull KotlinType kotlinType, @NotNull TypeSubstitutor substitutor, @Nullable Set<? extends TypeParameterDescriptor> set, boolean z10) {
            UnwrappedType unwrappedTypeReplace$default;
            boolean z11;
            KotlinType type;
            boolean z12;
            KotlinType type2;
            boolean z13;
            KotlinType type3;
            Intrinsics.checkNotNullParameter(kotlinType, "<this>");
            Intrinsics.checkNotNullParameter(substitutor, "substitutor");
            UnwrappedType unwrappedTypeUnwrap = kotlinType.unwrap();
            if (unwrappedTypeUnwrap instanceof FlexibleType) {
                FlexibleType flexibleType = (FlexibleType) unwrappedTypeUnwrap;
                SimpleType lowerBound = flexibleType.getLowerBound();
                if (!lowerBound.getConstructor().getParameters().isEmpty() && lowerBound.getConstructor().mo5778getDeclarationDescriptor() != null) {
                    List<TypeParameterDescriptor> parameters = lowerBound.getConstructor().getParameters();
                    Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
                    List<TypeParameterDescriptor> list = parameters;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                    for (TypeParameterDescriptor typeParameterDescriptor : list) {
                        TypeProjection starProjectionImpl = (TypeProjection) CollectionsKt___CollectionsKt.getOrNull(kotlinType.getArguments(), typeParameterDescriptor.getIndex());
                        if (!z10 || starProjectionImpl == null || (type3 = starProjectionImpl.getType()) == null) {
                            if (set == null && set.contains(typeParameterDescriptor)) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (starProjectionImpl != null || z13) {
                                starProjectionImpl = new StarProjectionImpl(typeParameterDescriptor);
                            } else {
                                TypeSubstitution substitution = substitutor.getSubstitution();
                                KotlinType type4 = starProjectionImpl.getType();
                                Intrinsics.checkNotNullExpressionValue(type4, "getType(...)");
                                if (substitution.mo5782get(type4) == null) {
                                    starProjectionImpl = new StarProjectionImpl(typeParameterDescriptor);
                                }
                            }
                        } else {
                            Intrinsics.checkNotNull(type3);
                            if (TypeUtilsKt.containsTypeParameter(type3)) {
                                if (set == null) {
                                    z13 = false;
                                } else {
                                    z13 = false;
                                }
                                if (starProjectionImpl != null) {
                                    starProjectionImpl = new StarProjectionImpl(typeParameterDescriptor);
                                } else {
                                    starProjectionImpl = new StarProjectionImpl(typeParameterDescriptor);
                                }
                            }
                        }
                        arrayList.add(starProjectionImpl);
                    }
                    lowerBound = TypeSubstitutionKt.replace$default(lowerBound, arrayList, null, 2, null);
                }
                SimpleType upperBound = flexibleType.getUpperBound();
                if (!upperBound.getConstructor().getParameters().isEmpty() && upperBound.getConstructor().mo5778getDeclarationDescriptor() != null) {
                    List<TypeParameterDescriptor> parameters2 = upperBound.getConstructor().getParameters();
                    Intrinsics.checkNotNullExpressionValue(parameters2, "getParameters(...)");
                    List<TypeParameterDescriptor> list2 = parameters2;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                    for (TypeParameterDescriptor typeParameterDescriptor2 : list2) {
                        TypeProjection starProjectionImpl2 = (TypeProjection) CollectionsKt___CollectionsKt.getOrNull(kotlinType.getArguments(), typeParameterDescriptor2.getIndex());
                        if (!z10 || starProjectionImpl2 == null || (type2 = starProjectionImpl2.getType()) == null) {
                            if (set == null && set.contains(typeParameterDescriptor2)) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (starProjectionImpl2 != null || z12) {
                                starProjectionImpl2 = new StarProjectionImpl(typeParameterDescriptor2);
                            } else {
                                TypeSubstitution substitution2 = substitutor.getSubstitution();
                                KotlinType type5 = starProjectionImpl2.getType();
                                Intrinsics.checkNotNullExpressionValue(type5, "getType(...)");
                                if (substitution2.mo5782get(type5) == null) {
                                    starProjectionImpl2 = new StarProjectionImpl(typeParameterDescriptor2);
                                }
                            }
                        } else {
                            Intrinsics.checkNotNull(type2);
                            if (TypeUtilsKt.containsTypeParameter(type2)) {
                                if (set == null) {
                                    z12 = false;
                                } else {
                                    z12 = false;
                                }
                                if (starProjectionImpl2 != null) {
                                    starProjectionImpl2 = new StarProjectionImpl(typeParameterDescriptor2);
                                } else {
                                    starProjectionImpl2 = new StarProjectionImpl(typeParameterDescriptor2);
                                }
                            }
                        }
                        arrayList2.add(starProjectionImpl2);
                    }
                    upperBound = TypeSubstitutionKt.replace$default(upperBound, arrayList2, null, 2, null);
                }
                unwrappedTypeReplace$default = KotlinTypeFactory.flexibleType(lowerBound, upperBound);
            } else {
                if (!(unwrappedTypeUnwrap instanceof SimpleType)) {
                    throw new NoWhenBranchMatchedException();
                }
                SimpleType simpleType = (SimpleType) unwrappedTypeUnwrap;
                if (simpleType.getConstructor().getParameters().isEmpty() || simpleType.getConstructor().mo5778getDeclarationDescriptor() == null) {
                    unwrappedTypeReplace$default = simpleType;
                } else {
                    List<TypeParameterDescriptor> parameters3 = simpleType.getConstructor().getParameters();
                    Intrinsics.checkNotNullExpressionValue(parameters3, "getParameters(...)");
                    List<TypeParameterDescriptor> list3 = parameters3;
                    ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                    for (TypeParameterDescriptor typeParameterDescriptor3 : list3) {
                        TypeProjection starProjectionImpl3 = (TypeProjection) CollectionsKt___CollectionsKt.getOrNull(kotlinType.getArguments(), typeParameterDescriptor3.getIndex());
                        if (!z10 || starProjectionImpl3 == null || (type = starProjectionImpl3.getType()) == null) {
                            if (set == null && set.contains(typeParameterDescriptor3)) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (starProjectionImpl3 != null || z11) {
                                starProjectionImpl3 = new StarProjectionImpl(typeParameterDescriptor3);
                            } else {
                                TypeSubstitution substitution3 = substitutor.getSubstitution();
                                KotlinType type6 = starProjectionImpl3.getType();
                                Intrinsics.checkNotNullExpressionValue(type6, "getType(...)");
                                if (substitution3.mo5782get(type6) == null) {
                                    starProjectionImpl3 = new StarProjectionImpl(typeParameterDescriptor3);
                                }
                            }
                        } else {
                            Intrinsics.checkNotNull(type);
                            if (TypeUtilsKt.containsTypeParameter(type)) {
                                if (set == null) {
                                    z11 = false;
                                } else {
                                    z11 = false;
                                }
                                if (starProjectionImpl3 != null) {
                                    starProjectionImpl3 = new StarProjectionImpl(typeParameterDescriptor3);
                                } else {
                                    starProjectionImpl3 = new StarProjectionImpl(typeParameterDescriptor3);
                                }
                            }
                        }
                        arrayList3.add(starProjectionImpl3);
                    }
                    unwrappedTypeReplace$default = TypeSubstitutionKt.replace$default(simpleType, arrayList3, null, 2, null);
                }
            }
            KotlinType kotlinTypeSafeSubstitute = substitutor.safeSubstitute(TypeWithEnhancementKt.inheritEnhancement(unwrappedTypeReplace$default, unwrappedTypeUnwrap), Variance.OUT_VARIANCE);
            Intrinsics.checkNotNullExpressionValue(kotlinTypeSafeSubstitute, "safeSubstitute(...)");
            return kotlinTypeSafeSubstitute;
        }
    }

    /* JADX INFO: compiled from: TypeParameterUpperBoundEraser.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final TypeParameterDescriptor f81983a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final ErasureTypeAttributes f81984b;

        public a(@NotNull TypeParameterDescriptor typeParameter, @NotNull ErasureTypeAttributes typeAttr) {
            Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
            Intrinsics.checkNotNullParameter(typeAttr, "typeAttr");
            this.f81983a = typeParameter;
            this.f81984b = typeAttr;
        }

        public boolean equals(@Nullable Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(aVar.f81983a, this.f81983a) && Intrinsics.areEqual(aVar.f81984b, this.f81984b);
        }

        @NotNull
        public final ErasureTypeAttributes getTypeAttr() {
            return this.f81984b;
        }

        @NotNull
        public final TypeParameterDescriptor getTypeParameter() {
            return this.f81983a;
        }

        public int hashCode() {
            int iHashCode = this.f81983a.hashCode();
            return this.f81984b.hashCode() + (iHashCode * 31) + iHashCode;
        }

        @NotNull
        public String toString() {
            return "DataToEraseUpperBound(typeParameter=" + this.f81983a + ", typeAttr=" + this.f81984b + RootService.CLOSE_BRACKET;
        }
    }

    /* JADX INFO: compiled from: TypeParameterUpperBoundEraser.kt */
    public static final class b extends Lambda implements Function0<ErrorType> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ErrorType invoke() {
            return ErrorUtils.createErrorType(ErrorTypeKind.CANNOT_COMPUTE_ERASED_BOUND, TypeParameterUpperBoundEraser.this.toString());
        }
    }

    /* JADX INFO: compiled from: TypeParameterUpperBoundEraser.kt */
    @SourceDebugExtension({"SMAP\nTypeParameterUpperBoundEraser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeParameterUpperBoundEraser.kt\norg/jetbrains/kotlin/types/TypeParameterUpperBoundEraser$getErasedUpperBound$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,158:1\n1#2:159\n*E\n"})
    public static final class c extends Lambda implements Function1<a, KotlinType> {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final KotlinType invoke(a aVar) {
            return TypeParameterUpperBoundEraser.access$getErasedUpperBoundInternal(TypeParameterUpperBoundEraser.this, aVar.getTypeParameter(), aVar.getTypeAttr());
        }
    }

    public TypeParameterUpperBoundEraser(@NotNull ErasureProjectionComputer projectionComputer, @NotNull TypeParameterErasureOptions options) {
        Intrinsics.checkNotNullParameter(projectionComputer, "projectionComputer");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f81979a = projectionComputer;
        this.f81980b = options;
        LockBasedStorageManager lockBasedStorageManager = new LockBasedStorageManager("Type parameter upper bound erasure results");
        this.f81981c = LazyKt__LazyJVMKt.lazy(new b());
        MemoizedFunctionToNotNull<a, KotlinType> memoizedFunctionToNotNullCreateMemoizedFunction = lockBasedStorageManager.createMemoizedFunction(new c());
        Intrinsics.checkNotNullExpressionValue(memoizedFunctionToNotNullCreateMemoizedFunction, "createMemoizedFunction(...)");
        this.f81982d = memoizedFunctionToNotNullCreateMemoizedFunction;
    }

    public static final KotlinType access$getErasedUpperBoundInternal(TypeParameterUpperBoundEraser typeParameterUpperBoundEraser, TypeParameterDescriptor typeParameterDescriptor, ErasureTypeAttributes erasureTypeAttributes) {
        TypeProjection typeProjectionComputeProjection;
        typeParameterUpperBoundEraser.getClass();
        Set<TypeParameterDescriptor> visitedTypeParameters = erasureTypeAttributes.getVisitedTypeParameters();
        if (visitedTypeParameters != null && visitedTypeParameters.contains(typeParameterDescriptor.getOriginal())) {
            return typeParameterUpperBoundEraser.a(erasureTypeAttributes);
        }
        SimpleType defaultType = typeParameterDescriptor.getDefaultType();
        Intrinsics.checkNotNullExpressionValue(defaultType, "getDefaultType(...)");
        Set<TypeParameterDescriptor> setExtractTypeParametersFromUpperBounds = TypeUtilsKt.extractTypeParametersFromUpperBounds(defaultType, visitedTypeParameters);
        LinkedHashMap linkedHashMap = new LinkedHashMap(f.a(setExtractTypeParametersFromUpperBounds, 10, 16));
        for (TypeParameterDescriptor typeParameterDescriptor2 : setExtractTypeParametersFromUpperBounds) {
            if (visitedTypeParameters == null || !visitedTypeParameters.contains(typeParameterDescriptor2)) {
                typeProjectionComputeProjection = typeParameterUpperBoundEraser.f81979a.computeProjection(typeParameterDescriptor2, erasureTypeAttributes, typeParameterUpperBoundEraser, typeParameterUpperBoundEraser.getErasedUpperBound(typeParameterDescriptor2, erasureTypeAttributes.withNewVisitedTypeParameter(typeParameterDescriptor)));
            } else {
                typeProjectionComputeProjection = TypeUtils.makeStarProjection(typeParameterDescriptor2, erasureTypeAttributes);
                Intrinsics.checkNotNullExpressionValue(typeProjectionComputeProjection, "makeStarProjection(...)");
            }
            Pair pair = TuplesKt.to(typeParameterDescriptor2.getTypeConstructor(), typeProjectionComputeProjection);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        TypeSubstitutor typeSubstitutorCreate = TypeSubstitutor.create(TypeConstructorSubstitution.Companion.createByConstructorsMap$default(TypeConstructorSubstitution.Companion, linkedHashMap, false, 2, null));
        Intrinsics.checkNotNullExpressionValue(typeSubstitutorCreate, "create(...)");
        List<KotlinType> upperBounds = typeParameterDescriptor.getUpperBounds();
        Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
        Set<KotlinType> setB = typeParameterUpperBoundEraser.b(typeSubstitutorCreate, upperBounds, erasureTypeAttributes);
        if (!(!setB.isEmpty())) {
            return typeParameterUpperBoundEraser.a(erasureTypeAttributes);
        }
        if (!typeParameterUpperBoundEraser.f81980b.getIntersectUpperBounds()) {
            if (setB.size() == 1) {
                return (KotlinType) CollectionsKt___CollectionsKt.single(setB);
            }
            throw new IllegalArgumentException("Should only be one computed upper bound if no need to intersect all bounds".toString());
        }
        List list = CollectionsKt___CollectionsKt.toList(setB);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((KotlinType) it.next()).unwrap());
        }
        return IntersectionTypeKt.intersectTypes(arrayList);
    }

    public final KotlinType a(ErasureTypeAttributes erasureTypeAttributes) {
        KotlinType kotlinTypeReplaceArgumentsWithStarProjections;
        SimpleType defaultType = erasureTypeAttributes.getDefaultType();
        return (defaultType == null || (kotlinTypeReplaceArgumentsWithStarProjections = TypeUtilsKt.replaceArgumentsWithStarProjections(defaultType)) == null) ? (ErrorType) this.f81981c.getValue() : kotlinTypeReplaceArgumentsWithStarProjections;
    }

    public final Set<KotlinType> b(TypeSubstitutor typeSubstitutor, List<? extends KotlinType> list, ErasureTypeAttributes erasureTypeAttributes) {
        Set setCreateSetBuilder = v.createSetBuilder();
        for (KotlinType kotlinType : list) {
            ClassifierDescriptor classifierDescriptorMo5778getDeclarationDescriptor = kotlinType.getConstructor().mo5778getDeclarationDescriptor();
            boolean z10 = classifierDescriptorMo5778getDeclarationDescriptor instanceof ClassDescriptor;
            TypeParameterErasureOptions typeParameterErasureOptions = this.f81980b;
            if (z10) {
                setCreateSetBuilder.add(Companion.replaceArgumentsOfUpperBound(kotlinType, typeSubstitutor, erasureTypeAttributes.getVisitedTypeParameters(), typeParameterErasureOptions.getLeaveNonTypeParameterTypes()));
            } else if (classifierDescriptorMo5778getDeclarationDescriptor instanceof TypeParameterDescriptor) {
                Set<TypeParameterDescriptor> visitedTypeParameters = erasureTypeAttributes.getVisitedTypeParameters();
                if (visitedTypeParameters == null || !visitedTypeParameters.contains(classifierDescriptorMo5778getDeclarationDescriptor)) {
                    List<KotlinType> upperBounds = ((TypeParameterDescriptor) classifierDescriptorMo5778getDeclarationDescriptor).getUpperBounds();
                    Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
                    setCreateSetBuilder.addAll(b(typeSubstitutor, upperBounds, erasureTypeAttributes));
                } else {
                    setCreateSetBuilder.add(a(erasureTypeAttributes));
                }
            }
            if (!typeParameterErasureOptions.getIntersectUpperBounds()) {
                break;
            }
        }
        return v.build(setCreateSetBuilder);
    }

    @NotNull
    public final KotlinType getErasedUpperBound(@NotNull TypeParameterDescriptor typeParameter, @NotNull ErasureTypeAttributes typeAttr) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        Intrinsics.checkNotNullParameter(typeAttr, "typeAttr");
        KotlinType kotlinTypeInvoke = this.f81982d.invoke(new a(typeParameter, typeAttr));
        Intrinsics.checkNotNullExpressionValue(kotlinTypeInvoke, "invoke(...)");
        return kotlinTypeInvoke;
    }

    public /* synthetic */ TypeParameterUpperBoundEraser(ErasureProjectionComputer erasureProjectionComputer, TypeParameterErasureOptions typeParameterErasureOptions, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(erasureProjectionComputer, (i10 & 2) != 0 ? new TypeParameterErasureOptions(false, false) : typeParameterErasureOptions);
    }
}
