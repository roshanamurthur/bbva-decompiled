package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CapturedTypeApproximation.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nCapturedTypeApproximation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CapturedTypeApproximation.kt\norg/jetbrains/kotlin/types/typesApproximation/CapturedTypeApproximationKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,178:1\n1747#2,3:179\n1549#2:183\n1620#2,3:184\n1#3:182\n*S KotlinDebug\n*F\n+ 1 CapturedTypeApproximation.kt\norg/jetbrains/kotlin/types/typesApproximation/CapturedTypeApproximationKt\n*L\n158#1:179,3\n167#1:183\n167#1:184,3\n*E\n"})
public final class CapturedTypeApproximationKt {

    /* JADX INFO: compiled from: CapturedTypeApproximation.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Variance.values().length];
            try {
                iArr[Variance.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Variance.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Variance.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: compiled from: CapturedTypeApproximation.kt */
    public static final class a extends Lambda implements Function1<UnwrappedType, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f82059p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(UnwrappedType unwrappedType) {
            Intrinsics.checkNotNull(unwrappedType);
            return Boolean.valueOf(CapturedTypeConstructorKt.isCaptured(unwrappedType));
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a7  */
    public static final KotlinType a(ArrayList arrayList, KotlinType kotlinType) {
        TypeProjectionImpl typeProjectionImpl;
        kotlinType.getArguments().size();
        arrayList.size();
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jl.a aVar = (jl.a) it.next();
            aVar.isConsistent();
            if (Intrinsics.areEqual(aVar.getInProjection(), aVar.getOutProjection())) {
                typeProjectionImpl = new TypeProjectionImpl(aVar.getInProjection());
            } else {
                Variance variance = aVar.getTypeParameter().getVariance();
                Variance variance2 = Variance.IN_VARIANCE;
                if (variance == variance2) {
                    typeProjectionImpl = new TypeProjectionImpl(aVar.getInProjection());
                } else if (KotlinBuiltIns.isNothing(aVar.getInProjection()) && aVar.getTypeParameter().getVariance() != variance2) {
                    Variance variance3 = Variance.OUT_VARIANCE;
                    if (variance3 == aVar.getTypeParameter().getVariance()) {
                        variance3 = Variance.INVARIANT;
                    }
                    typeProjectionImpl = new TypeProjectionImpl(variance3, aVar.getOutProjection());
                } else if (KotlinBuiltIns.isNullableAny(aVar.getOutProjection())) {
                    if (variance2 == aVar.getTypeParameter().getVariance()) {
                        variance2 = Variance.INVARIANT;
                    }
                    typeProjectionImpl = new TypeProjectionImpl(variance2, aVar.getInProjection());
                } else {
                    Variance variance4 = Variance.OUT_VARIANCE;
                    if (variance4 == aVar.getTypeParameter().getVariance()) {
                        variance4 = Variance.INVARIANT;
                    }
                    typeProjectionImpl = new TypeProjectionImpl(variance4, aVar.getOutProjection());
                }
            }
            arrayList2.add(typeProjectionImpl);
        }
        return TypeSubstitutionKt.replace$default(kotlinType, arrayList2, null, null, 6, null);
    }

    @NotNull
    public static final ApproximationBounds<KotlinType> approximateCapturedTypes(@NotNull KotlinType type) {
        Object objA;
        jl.a aVar;
        Intrinsics.checkNotNullParameter(type, "type");
        if (FlexibleTypesKt.isFlexible(type)) {
            ApproximationBounds<KotlinType> approximationBoundsApproximateCapturedTypes = approximateCapturedTypes(FlexibleTypesKt.lowerIfFlexible(type));
            ApproximationBounds<KotlinType> approximationBoundsApproximateCapturedTypes2 = approximateCapturedTypes(FlexibleTypesKt.upperIfFlexible(type));
            return new ApproximationBounds<>(TypeWithEnhancementKt.inheritEnhancement(KotlinTypeFactory.flexibleType(FlexibleTypesKt.lowerIfFlexible(approximationBoundsApproximateCapturedTypes.getLower()), FlexibleTypesKt.upperIfFlexible(approximationBoundsApproximateCapturedTypes2.getLower())), type), TypeWithEnhancementKt.inheritEnhancement(KotlinTypeFactory.flexibleType(FlexibleTypesKt.lowerIfFlexible(approximationBoundsApproximateCapturedTypes.getUpper()), FlexibleTypesKt.upperIfFlexible(approximationBoundsApproximateCapturedTypes2.getUpper())), type));
        }
        TypeConstructor constructor = type.getConstructor();
        int i10 = 3;
        if (CapturedTypeConstructorKt.isCaptured(type)) {
            Intrinsics.checkNotNull(constructor, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor");
            TypeProjection projection = ((CapturedTypeConstructor) constructor).getProjection();
            KotlinType type2 = projection.getType();
            Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
            KotlinType kotlinTypeMakeNullableIfNeeded = TypeUtils.makeNullableIfNeeded(type2, type.isMarkedNullable());
            Intrinsics.checkNotNullExpressionValue(kotlinTypeMakeNullableIfNeeded, "makeNullableIfNeeded(...)");
            int i11 = WhenMappings.$EnumSwitchMapping$0[projection.getProjectionKind().ordinal()];
            if (i11 == 2) {
                SimpleType nullableAnyType = TypeUtilsKt.getBuiltIns(type).getNullableAnyType();
                Intrinsics.checkNotNullExpressionValue(nullableAnyType, "getNullableAnyType(...)");
                return new ApproximationBounds<>(kotlinTypeMakeNullableIfNeeded, nullableAnyType);
            }
            if (i11 != 3) {
                throw new AssertionError("Only nontrivial projections should have been captured, not: " + projection);
            }
            SimpleType nothingType = TypeUtilsKt.getBuiltIns(type).getNothingType();
            Intrinsics.checkNotNullExpressionValue(nothingType, "getNothingType(...)");
            KotlinType kotlinTypeMakeNullableIfNeeded2 = TypeUtils.makeNullableIfNeeded((KotlinType) nothingType, type.isMarkedNullable());
            Intrinsics.checkNotNullExpressionValue(kotlinTypeMakeNullableIfNeeded2, "makeNullableIfNeeded(...)");
            return new ApproximationBounds<>(kotlinTypeMakeNullableIfNeeded2, kotlinTypeMakeNullableIfNeeded);
        }
        if (type.getArguments().isEmpty() || type.getArguments().size() != constructor.getParameters().size()) {
            return new ApproximationBounds<>(type, type);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<TypeProjection> arguments = type.getArguments();
        List<TypeParameterDescriptor> parameters = constructor.getParameters();
        Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
        Iterator it = CollectionsKt___CollectionsKt.zip(arguments, parameters).iterator();
        while (true) {
            boolean z10 = true;
            if (!it.hasNext()) {
                if (!arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    do {
                        if (!it2.hasNext()) {
                            z10 = false;
                            break;
                        }
                    } while (!(!((jl.a) it2.next()).isConsistent()));
                } else {
                    z10 = false;
                    break;
                }
                if (z10) {
                    objA = TypeUtilsKt.getBuiltIns(type).getNothingType();
                    Intrinsics.checkNotNullExpressionValue(objA, "getNothingType(...)");
                } else {
                    objA = a(arrayList, type);
                }
                return new ApproximationBounds<>(objA, a(arrayList2, type));
            }
            Pair pair = (Pair) it.next();
            TypeProjection typeProjection = (TypeProjection) pair.component1();
            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) pair.component2();
            Intrinsics.checkNotNull(typeParameterDescriptor);
            int i12 = WhenMappings.$EnumSwitchMapping$0[TypeSubstitutor.combine(typeParameterDescriptor.getVariance(), typeProjection).ordinal()];
            if (i12 == 1) {
                KotlinType type3 = typeProjection.getType();
                Intrinsics.checkNotNullExpressionValue(type3, "getType(...)");
                KotlinType type4 = typeProjection.getType();
                Intrinsics.checkNotNullExpressionValue(type4, "getType(...)");
                aVar = new jl.a(typeParameterDescriptor, type3, type4);
            } else if (i12 == 2) {
                KotlinType type5 = typeProjection.getType();
                Intrinsics.checkNotNullExpressionValue(type5, "getType(...)");
                SimpleType nullableAnyType2 = DescriptorUtilsKt.getBuiltIns(typeParameterDescriptor).getNullableAnyType();
                Intrinsics.checkNotNullExpressionValue(nullableAnyType2, "getNullableAnyType(...)");
                aVar = new jl.a(typeParameterDescriptor, type5, nullableAnyType2);
            } else {
                if (i12 != i10) {
                    throw new NoWhenBranchMatchedException();
                }
                SimpleType nothingType2 = DescriptorUtilsKt.getBuiltIns(typeParameterDescriptor).getNothingType();
                Intrinsics.checkNotNullExpressionValue(nothingType2, "getNothingType(...)");
                KotlinType type6 = typeProjection.getType();
                Intrinsics.checkNotNullExpressionValue(type6, "getType(...)");
                aVar = new jl.a(typeParameterDescriptor, nothingType2, type6);
            }
            if (typeProjection.isStarProjection()) {
                arrayList.add(aVar);
                arrayList2.add(aVar);
            } else {
                ApproximationBounds<KotlinType> approximationBoundsApproximateCapturedTypes3 = approximateCapturedTypes(aVar.getInProjection());
                KotlinType kotlinTypeComponent1 = approximationBoundsApproximateCapturedTypes3.component1();
                KotlinType kotlinTypeComponent2 = approximationBoundsApproximateCapturedTypes3.component2();
                ApproximationBounds<KotlinType> approximationBoundsApproximateCapturedTypes4 = approximateCapturedTypes(aVar.getOutProjection());
                ApproximationBounds approximationBounds = new ApproximationBounds(new jl.a(aVar.getTypeParameter(), kotlinTypeComponent2, approximationBoundsApproximateCapturedTypes4.component1()), new jl.a(aVar.getTypeParameter(), kotlinTypeComponent1, approximationBoundsApproximateCapturedTypes4.component2()));
                jl.a aVar2 = (jl.a) approximationBounds.component1();
                jl.a aVar3 = (jl.a) approximationBounds.component2();
                arrayList.add(aVar2);
                arrayList2.add(aVar3);
                i10 = 3;
            }
        }
    }

    @Nullable
    public static final TypeProjection approximateCapturedTypesIfNecessary(@Nullable TypeProjection typeProjection, boolean z10) {
        if (typeProjection == null) {
            return null;
        }
        if (typeProjection.isStarProjection()) {
            return typeProjection;
        }
        KotlinType type = typeProjection.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        if (!TypeUtils.contains(type, a.f82059p0)) {
            return typeProjection;
        }
        Variance projectionKind = typeProjection.getProjectionKind();
        Intrinsics.checkNotNullExpressionValue(projectionKind, "getProjectionKind(...)");
        if (projectionKind == Variance.OUT_VARIANCE) {
            return new TypeProjectionImpl(projectionKind, approximateCapturedTypes(type).getUpper());
        }
        if (z10) {
            return new TypeProjectionImpl(projectionKind, approximateCapturedTypes(type).getLower());
        }
        TypeSubstitutor typeSubstitutorCreate = TypeSubstitutor.create(new TypeConstructorSubstitution() { // from class: kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt$substituteCapturedTypesWithProjections$typeSubstitutor$1
            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution
            @Nullable
            public TypeProjection get(@NotNull TypeConstructor key) {
                Intrinsics.checkNotNullParameter(key, "key");
                CapturedTypeConstructor capturedTypeConstructor = key instanceof CapturedTypeConstructor ? (CapturedTypeConstructor) key : null;
                if (capturedTypeConstructor == null) {
                    return null;
                }
                return capturedTypeConstructor.getProjection().isStarProjection() ? new TypeProjectionImpl(Variance.OUT_VARIANCE, capturedTypeConstructor.getProjection().getType()) : capturedTypeConstructor.getProjection();
            }
        });
        Intrinsics.checkNotNullExpressionValue(typeSubstitutorCreate, "create(...)");
        return typeSubstitutorCreate.substituteWithoutApproximation(typeProjection);
    }
}
