package kotlin.reflect.jvm.internal.impl.types;

import com.noknok.android.client.utils.UIConfigTags;
import hl.d;
import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.FilteredAnnotations;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt;
import kotlin.reflect.jvm.internal.impl.utils.ExceptionUtilsKt;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public class TypeSubstitutor {
    public static final TypeSubstitutor EMPTY = create(TypeSubstitution.EMPTY);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final TypeSubstitution f81990a;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f81991a;

        static {
            int[] iArr = new int[c.values().length];
            f81991a = iArr;
            try {
                iArr[c.OUT_IN_IN_POSITION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f81991a[c.IN_IN_OUT_POSITION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f81991a[c.NO_CONFLICT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final class b extends Exception {
        public b(String str) {
            super(str);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        private static final /* synthetic */ c[] $VALUES;
        public static final c IN_IN_OUT_POSITION;
        public static final c NO_CONFLICT;
        public static final c OUT_IN_IN_POSITION;

        static {
            c cVar = new c("NO_CONFLICT", 0);
            NO_CONFLICT = cVar;
            c cVar2 = new c("IN_IN_OUT_POSITION", 1);
            IN_IN_OUT_POSITION = cVar2;
            c cVar3 = new c("OUT_IN_IN_POSITION", 2);
            OUT_IN_IN_POSITION = cVar3;
            $VALUES = new c[]{cVar, cVar2, cVar3};
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }
    }

    public TypeSubstitutor(@NotNull TypeSubstitution typeSubstitution) {
        if (typeSubstitution != null) {
            this.f81990a = typeSubstitution;
        } else {
            a(7);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0021 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:56:0x00b8  */
    public static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        if (i10 != 1 && i10 != 2 && i10 != 8 && i10 != 34 && i10 != 37) {
            switch (i10) {
                default:
                    switch (i10) {
                        default:
                            switch (i10) {
                                default:
                                    switch (i10) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            str = "@NotNull method %s.%s must not return null";
                            break;
                    }
                case 11:
                case 12:
                case 13:
                    str = "@NotNull method %s.%s must not return null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 1 && i10 != 2 && i10 != 8 && i10 != 34 && i10 != 37) {
            switch (i10) {
                case 11:
                case 12:
                case 13:
                    i11 = 2;
                    break;
                default:
                    switch (i10) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            i11 = 2;
                            break;
                        default:
                            switch (i10) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    i11 = 2;
                                    break;
                                default:
                                    switch (i10) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            i11 = 2;
                                            break;
                                        default:
                                            i11 = 3;
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            i11 = 2;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 2:
            case 8:
            case 11:
            case 12:
            case 13:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 29:
            case 30:
            case 31:
            case 32:
            case 34:
            case 37:
            case 40:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                break;
            case 3:
                objArr[0] = "first";
                break;
            case 4:
                objArr[0] = UIConfigTags.TAG_SECOND;
                break;
            case 5:
                objArr[0] = "substitutionContext";
                break;
            case 6:
                objArr[0] = "context";
                break;
            case 7:
            default:
                objArr[0] = "substitution";
                break;
            case 9:
            case 14:
                objArr[0] = "type";
                break;
            case 10:
            case 15:
                objArr[0] = "howThisTypeIsUsed";
                break;
            case 16:
            case 17:
            case 36:
                objArr[0] = "typeProjection";
                break;
            case 18:
            case 28:
                objArr[0] = "originalProjection";
                break;
            case 26:
                objArr[0] = "originalType";
                break;
            case 27:
                objArr[0] = "substituted";
                break;
            case 33:
                objArr[0] = "annotations";
                break;
            case 35:
            case 38:
                objArr[0] = "typeParameterVariance";
                break;
            case 39:
                objArr[0] = "projectionKind";
                break;
        }
        if (i10 == 1) {
            objArr[1] = "replaceWithNonApproximatingSubstitution";
        } else if (i10 == 2) {
            objArr[1] = "replaceWithContravariantApproximatingSubstitution";
        } else if (i10 == 8) {
            objArr[1] = "getSubstitution";
        } else if (i10 == 34) {
            objArr[1] = "filterOutUnsafeVariance";
        } else if (i10 != 37) {
            switch (i10) {
                case 11:
                case 12:
                case 13:
                    objArr[1] = "safeSubstitute";
                    break;
                default:
                    switch (i10) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            objArr[1] = "unsafeSubstitute";
                            break;
                        default:
                            switch (i10) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    objArr[1] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                                    break;
                                default:
                                    switch (i10) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            objArr[1] = "combine";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            objArr[1] = "combine";
        }
        switch (i10) {
            case 1:
            case 2:
            case 8:
            case 11:
            case 12:
            case 13:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 29:
            case 30:
            case 31:
            case 32:
            case 34:
            case 37:
            case 40:
            case 41:
            case 42:
                break;
            case 3:
            case 4:
                objArr[2] = "createChainedSubstitutor";
                break;
            case 5:
            case 6:
            default:
                objArr[2] = "create";
                break;
            case 7:
                objArr[2] = "<init>";
                break;
            case 9:
            case 10:
                objArr[2] = "safeSubstitute";
                break;
            case 14:
            case 15:
            case 16:
                objArr[2] = "substitute";
                break;
            case 17:
                objArr[2] = "substituteWithoutApproximation";
                break;
            case 18:
                objArr[2] = "unsafeSubstitute";
                break;
            case 26:
            case 27:
            case 28:
                objArr[2] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                break;
            case 33:
                objArr[2] = "filterOutUnsafeVariance";
                break;
            case 35:
            case 36:
            case 38:
            case 39:
                objArr[2] = "combine";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 1 && i10 != 2 && i10 != 8 && i10 != 34 && i10 != 37) {
            switch (i10) {
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    switch (i10) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            break;
                        default:
                            switch (i10) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    break;
                                default:
                                    switch (i10) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            throw new IllegalArgumentException(str2);
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        throw new IllegalStateException(str2);
    }

    public static c b(Variance variance, Variance variance2) {
        Variance variance3 = Variance.IN_VARIANCE;
        if (variance == variance3 && variance2 == Variance.OUT_VARIANCE) {
            return c.OUT_IN_IN_POSITION;
        }
        return (variance == Variance.OUT_VARIANCE && variance2 == variance3) ? c.IN_IN_OUT_POSITION : c.NO_CONFLICT;
    }

    public static String c(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th2) {
            if (ExceptionUtilsKt.isProcessCanceledException(th2)) {
                throw th2;
            }
            return "[Exception while computing toString(): " + th2 + Constant.BRACKET_CLOSE;
        }
    }

    @NotNull
    public static Variance combine(@NotNull Variance variance, @NotNull TypeProjection typeProjection) {
        if (variance == null) {
            a(35);
            throw null;
        }
        if (typeProjection == null) {
            a(36);
            throw null;
        }
        if (!typeProjection.isStarProjection()) {
            return combine(variance, typeProjection.getProjectionKind());
        }
        Variance variance2 = Variance.OUT_VARIANCE;
        if (variance2 != null) {
            return variance2;
        }
        a(37);
        throw null;
    }

    @NotNull
    public static TypeSubstitutor create(@NotNull TypeSubstitution typeSubstitution) {
        if (typeSubstitution != null) {
            return new TypeSubstitutor(typeSubstitution);
        }
        a(0);
        throw null;
    }

    @NotNull
    public static TypeSubstitutor createChainedSubstitutor(@NotNull TypeSubstitution typeSubstitution, @NotNull TypeSubstitution typeSubstitution2) {
        if (typeSubstitution == null) {
            a(3);
            throw null;
        }
        if (typeSubstitution2 != null) {
            return create(DisjointKeysUnionTypeSubstitution.create(typeSubstitution, typeSubstitution2));
        }
        a(4);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @NotNull
    public final TypeProjection d(@NotNull TypeProjection typeProjection, @Nullable TypeParameterDescriptor typeParameterDescriptor, int i10) throws b {
        if (typeProjection == null) {
            a(18);
            throw null;
        }
        TypeSubstitution typeSubstitution = this.f81990a;
        if (i10 > 100) {
            throw new IllegalStateException("Recursion too deep. Most likely infinite loop while substituting " + c(typeProjection) + "; substitution: " + c(typeSubstitution));
        }
        if (typeProjection.isStarProjection()) {
            return typeProjection;
        }
        KotlinType type = typeProjection.getType();
        if (type instanceof TypeWithEnhancement) {
            TypeWithEnhancement typeWithEnhancement = (TypeWithEnhancement) type;
            UnwrappedType origin = typeWithEnhancement.getOrigin();
            KotlinType enhancement = typeWithEnhancement.getEnhancement();
            TypeProjection typeProjectionD = d(new TypeProjectionImpl(typeProjection.getProjectionKind(), origin), typeParameterDescriptor, i10 + 1);
            return typeProjectionD.isStarProjection() ? typeProjectionD : new TypeProjectionImpl(typeProjectionD.getProjectionKind(), TypeWithEnhancementKt.wrapEnhancement(typeProjectionD.getType().unwrap(), substitute(enhancement, typeProjection.getProjectionKind())));
        }
        if (!DynamicTypesKt.isDynamic(type) && !(type.unwrap() instanceof RawType)) {
            TypeProjection typeProjectionMo5782get = typeSubstitution.mo5782get(type);
            if (typeProjectionMo5782get == null) {
                typeProjectionMo5782get = null;
            } else if (type.getAnnotations().hasAnnotation(StandardNames.FqNames.unsafeVariance)) {
                TypeConstructor constructor = typeProjectionMo5782get.getType().getConstructor();
                if (constructor instanceof NewCapturedTypeConstructor) {
                    TypeProjection projection = ((NewCapturedTypeConstructor) constructor).getProjection();
                    Variance projectionKind = projection.getProjectionKind();
                    c cVarB = b(typeProjection.getProjectionKind(), projectionKind);
                    c cVar = c.OUT_IN_IN_POSITION;
                    if (cVarB == cVar) {
                        typeProjectionMo5782get = new TypeProjectionImpl(projection.getType());
                    } else if (typeParameterDescriptor != null && b(typeParameterDescriptor.getVariance(), projectionKind) == cVar) {
                        typeProjectionMo5782get = new TypeProjectionImpl(projection.getType());
                    }
                }
            }
            Variance projectionKind2 = typeProjection.getProjectionKind();
            if (typeProjectionMo5782get == null && FlexibleTypesKt.isFlexible(type) && !TypeCapabilitiesKt.isCustomTypeParameter(type)) {
                FlexibleType flexibleTypeAsFlexibleType = FlexibleTypesKt.asFlexibleType(type);
                int i11 = i10 + 1;
                TypeProjection typeProjectionD2 = d(new TypeProjectionImpl(projectionKind2, flexibleTypeAsFlexibleType.getLowerBound()), typeParameterDescriptor, i11);
                TypeProjection typeProjectionD3 = d(new TypeProjectionImpl(projectionKind2, flexibleTypeAsFlexibleType.getUpperBound()), typeParameterDescriptor, i11);
                return (typeProjectionD2.getType() == flexibleTypeAsFlexibleType.getLowerBound() && typeProjectionD3.getType() == flexibleTypeAsFlexibleType.getUpperBound()) ? typeProjection : new TypeProjectionImpl(typeProjectionD2.getProjectionKind(), KotlinTypeFactory.flexibleType(TypeSubstitutionKt.asSimpleType(typeProjectionD2.getType()), TypeSubstitutionKt.asSimpleType(typeProjectionD3.getType())));
            }
            if (!KotlinBuiltIns.isNothing(type) && !KotlinTypeKt.isError(type)) {
                if (typeProjectionMo5782get != null) {
                    c cVarB2 = b(projectionKind2, typeProjectionMo5782get.getProjectionKind());
                    if (!CapturedTypeConstructorKt.isCaptured(type)) {
                        int i12 = a.f81991a[cVarB2.ordinal()];
                        if (i12 == 1) {
                            throw new b("Out-projection in in-position");
                        }
                        if (i12 == 2) {
                            return new TypeProjectionImpl(Variance.OUT_VARIANCE, type.getConstructor().getBuiltIns().getNullableAnyType());
                        }
                    }
                    CustomTypeParameter customTypeParameter = TypeCapabilitiesKt.getCustomTypeParameter(type);
                    if (typeProjectionMo5782get.isStarProjection()) {
                        return typeProjectionMo5782get;
                    }
                    KotlinType kotlinTypeSubstitutionResult = customTypeParameter != null ? customTypeParameter.substitutionResult(typeProjectionMo5782get.getType()) : TypeUtils.makeNullableIfNeeded(typeProjectionMo5782get.getType(), type.isMarkedNullable());
                    if (!type.getAnnotations().isEmpty()) {
                        Annotations annotationsFilterAnnotations = typeSubstitution.filterAnnotations(type.getAnnotations());
                        if (annotationsFilterAnnotations == null) {
                            a(33);
                            throw null;
                        }
                        if (annotationsFilterAnnotations.hasAnnotation(StandardNames.FqNames.unsafeVariance)) {
                            annotationsFilterAnnotations = new FilteredAnnotations(annotationsFilterAnnotations, new d());
                        }
                        kotlinTypeSubstitutionResult = TypeUtilsKt.replaceAnnotations(kotlinTypeSubstitutionResult, new CompositeAnnotations(kotlinTypeSubstitutionResult.getAnnotations(), annotationsFilterAnnotations));
                    }
                    if (cVarB2 == c.NO_CONFLICT) {
                        projectionKind2 = combine(projectionKind2, typeProjectionMo5782get.getProjectionKind());
                    }
                    return new TypeProjectionImpl(projectionKind2, kotlinTypeSubstitutionResult);
                }
                KotlinType type2 = typeProjection.getType();
                Variance projectionKind3 = typeProjection.getProjectionKind();
                if (type2.getConstructor().mo5778getDeclarationDescriptor() instanceof TypeParameterDescriptor) {
                    return typeProjection;
                }
                SimpleType abbreviation = SpecialTypesKt.getAbbreviation(type2);
                KotlinType kotlinTypeSubstitute = abbreviation != null ? replaceWithNonApproximatingSubstitution().substitute(abbreviation, Variance.INVARIANT) : null;
                List<TypeParameterDescriptor> parameters = type2.getConstructor().getParameters();
                List<TypeProjection> arguments = type2.getArguments();
                ArrayList arrayList = new ArrayList(parameters.size());
                boolean z10 = false;
                for (int i13 = 0; i13 < parameters.size(); i13++) {
                    TypeParameterDescriptor typeParameterDescriptor2 = parameters.get(i13);
                    TypeProjection typeProjection2 = arguments.get(i13);
                    TypeProjection typeProjectionD4 = d(typeProjection2, typeParameterDescriptor2, i10 + 1);
                    int i14 = a.f81991a[b(typeParameterDescriptor2.getVariance(), typeProjectionD4.getProjectionKind()).ordinal()];
                    if (i14 == 1 || i14 == 2) {
                        typeProjectionD4 = TypeUtils.makeStarProjection(typeParameterDescriptor2);
                    } else if (i14 == 3) {
                        Variance variance = typeParameterDescriptor2.getVariance();
                        Variance variance2 = Variance.INVARIANT;
                        if (variance != variance2 && !typeProjectionD4.isStarProjection()) {
                            typeProjectionD4 = new TypeProjectionImpl(variance2, typeProjectionD4.getType());
                        }
                    }
                    if (typeProjectionD4 != typeProjection2) {
                        z10 = true;
                    }
                    arrayList.add(typeProjectionD4);
                }
                if (z10) {
                    arguments = arrayList;
                }
                KotlinType kotlinTypeReplace = TypeSubstitutionKt.replace(type2, arguments, typeSubstitution.filterAnnotations(type2.getAnnotations()));
                if ((kotlinTypeReplace instanceof SimpleType) && (kotlinTypeSubstitute instanceof SimpleType)) {
                    kotlinTypeReplace = SpecialTypesKt.withAbbreviation((SimpleType) kotlinTypeReplace, (SimpleType) kotlinTypeSubstitute);
                }
                return new TypeProjectionImpl(projectionKind3, kotlinTypeReplace);
            }
        }
        return typeProjection;
    }

    @NotNull
    public TypeSubstitution getSubstitution() {
        TypeSubstitution typeSubstitution = this.f81990a;
        if (typeSubstitution != null) {
            return typeSubstitution;
        }
        a(8);
        throw null;
    }

    public boolean isEmpty() {
        return this.f81990a.isEmpty();
    }

    @NotNull
    public TypeSubstitutor replaceWithNonApproximatingSubstitution() {
        TypeSubstitution typeSubstitution = this.f81990a;
        return ((typeSubstitution instanceof IndexedParametersSubstitution) && typeSubstitution.approximateContravariantCapturedTypes()) ? new TypeSubstitutor(new IndexedParametersSubstitution(((IndexedParametersSubstitution) typeSubstitution).getParameters(), ((IndexedParametersSubstitution) typeSubstitution).getArguments(), false)) : this;
    }

    @NotNull
    public KotlinType safeSubstitute(@NotNull KotlinType kotlinType, @NotNull Variance variance) {
        if (kotlinType == null) {
            a(9);
            throw null;
        }
        if (variance == null) {
            a(10);
            throw null;
        }
        if (isEmpty()) {
            if (kotlinType != null) {
                return kotlinType;
            }
            a(11);
            throw null;
        }
        try {
            KotlinType type = d(new TypeProjectionImpl(variance, kotlinType), null, 0).getType();
            if (type != null) {
                return type;
            }
            a(12);
            throw null;
        } catch (b e5) {
            ErrorType errorTypeCreateErrorType = ErrorUtils.createErrorType(ErrorTypeKind.UNABLE_TO_SUBSTITUTE_TYPE, e5.getMessage());
            if (errorTypeCreateErrorType != null) {
                return errorTypeCreateErrorType;
            }
            a(13);
            throw null;
        }
    }

    @Nullable
    public KotlinType substitute(@NotNull KotlinType kotlinType, @NotNull Variance variance) {
        if (kotlinType == null) {
            a(14);
            throw null;
        }
        if (variance == null) {
            a(15);
            throw null;
        }
        TypeProjection typeProjectionSubstitute = substitute(new TypeProjectionImpl(variance, getSubstitution().prepareTopLevelType(kotlinType, variance)));
        if (typeProjectionSubstitute == null) {
            return null;
        }
        return typeProjectionSubstitute.getType();
    }

    @Nullable
    public TypeProjection substituteWithoutApproximation(@NotNull TypeProjection typeProjection) {
        if (typeProjection == null) {
            a(17);
            throw null;
        }
        if (isEmpty()) {
            return typeProjection;
        }
        try {
            return d(typeProjection, null, 0);
        } catch (b unused) {
            return null;
        }
    }

    @NotNull
    public static TypeSubstitutor create(@NotNull KotlinType kotlinType) {
        if (kotlinType != null) {
            return create(TypeConstructorSubstitution.create(kotlinType.getConstructor(), kotlinType.getArguments()));
        }
        a(6);
        throw null;
    }

    @NotNull
    public static Variance combine(@NotNull Variance variance, @NotNull Variance variance2) {
        if (variance == null) {
            a(38);
            throw null;
        }
        if (variance2 != null) {
            Variance variance3 = Variance.INVARIANT;
            if (variance == variance3) {
                if (variance2 != null) {
                    return variance2;
                }
                a(40);
                throw null;
            }
            if (variance2 == variance3) {
                if (variance != null) {
                    return variance;
                }
                a(41);
                throw null;
            }
            if (variance == variance2) {
                if (variance2 != null) {
                    return variance2;
                }
                a(42);
                throw null;
            }
            throw new AssertionError("Variance conflict: type parameter variance '" + variance + "' and projection kind '" + variance2 + "' cannot be combined");
        }
        a(39);
        throw null;
    }

    @Nullable
    public TypeProjection substitute(@NotNull TypeProjection typeProjection) {
        if (typeProjection != null) {
            TypeProjection typeProjectionSubstituteWithoutApproximation = substituteWithoutApproximation(typeProjection);
            TypeSubstitution typeSubstitution = this.f81990a;
            return (typeSubstitution.approximateCapturedTypes() || typeSubstitution.approximateContravariantCapturedTypes()) ? CapturedTypeApproximationKt.approximateCapturedTypesIfNecessary(typeProjectionSubstituteWithoutApproximation, typeSubstitution.approximateContravariantCapturedTypes()) : typeProjectionSubstituteWithoutApproximation;
        }
        a(16);
        throw null;
    }
}
