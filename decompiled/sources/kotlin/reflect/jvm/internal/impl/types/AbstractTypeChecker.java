package kotlin.reflect.jvm.internal.impl.types;

import androidx.collection.k;
import bk.d;
import bk.g;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.types.model.ArgumentList;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.DefinitelyNotNullTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.IntersectionTypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariableTypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AbstractTypeChecker.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nAbstractTypeChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractTypeChecker.kt\norg/jetbrains/kotlin/types/AbstractTypeChecker\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AbstractTypeChecker.kt\norg/jetbrains/kotlin/types/TypeCheckerState\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 TypeSystemContext.kt\norg/jetbrains/kotlin/types/model/TypeSystemContextKt\n*L\n1#1,835:1\n1#2:836\n1#2:853\n1#2:905\n1#2:943\n132#3,16:837\n148#3,13:854\n46#3,8:875\n132#3,16:889\n148#3,13:906\n132#3,16:927\n148#3,13:944\n1549#4:867\n1620#4,3:868\n1549#4:871\n1620#4,3:872\n1726#4,3:883\n1726#4,3:886\n766#4:919\n857#4:920\n858#4:926\n1360#4:957\n1446#4,5:958\n1747#4,3:963\n1747#4,3:966\n568#5,5:921\n*S KotlinDebug\n*F\n+ 1 AbstractTypeChecker.kt\norg/jetbrains/kotlin/types/AbstractTypeChecker\n*L\n342#1:853\n622#1:905\n692#1:943\n342#1:837,16\n342#1:854,13\n475#1:875,8\n622#1:889,16\n622#1:906,13\n692#1:927,16\n692#1:944,13\n378#1:867\n378#1:868,3\n389#1:871\n389#1:872,3\n561#1:883,3\n572#1:886,3\n667#1:919\n667#1:920\n667#1:926\n701#1:957\n701#1:958,5\n295#1:963,3\n303#1:966,3\n668#1:921,5\n*E\n"})
public final class AbstractTypeChecker {

    @NotNull
    public static final AbstractTypeChecker INSTANCE = new AbstractTypeChecker();

    @JvmField
    public static boolean RUN_SLOW_ASSERTIONS;

    /* JADX INFO: compiled from: AbstractTypeChecker.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TypeVariance.values().length];
            try {
                iArr[TypeVariance.INV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TypeVariance.OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TypeVariance.IN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TypeCheckerState.LowerCapturedTypePolicy.values().length];
            try {
                iArr2[TypeCheckerState.LowerCapturedTypePolicy.CHECK_ONLY_LOWER.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[TypeCheckerState.LowerCapturedTypePolicy.CHECK_SUBTYPE_AND_LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[TypeCheckerState.LowerCapturedTypePolicy.SKIP_LOWER.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final boolean a(TypeSystemContext typeSystemContext, SimpleTypeMarker simpleTypeMarker) {
        if (!typeSystemContext.isIntegerLiteralType(simpleTypeMarker)) {
            if (simpleTypeMarker instanceof CapturedTypeMarker) {
                TypeArgumentMarker typeArgumentMarkerProjection = typeSystemContext.projection(typeSystemContext.typeConstructor((CapturedTypeMarker) simpleTypeMarker));
                if (typeSystemContext.isStarProjection(typeArgumentMarkerProjection) || !typeSystemContext.isIntegerLiteralType(typeSystemContext.upperBoundIfFlexible(typeSystemContext.getType(typeArgumentMarkerProjection)))) {
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean b(TypeSystemContext typeSystemContext, TypeCheckerState typeCheckerState, SimpleTypeMarker simpleTypeMarker, SimpleTypeMarker simpleTypeMarker2, boolean z10) {
        Collection<KotlinTypeMarker> collectionPossibleIntegerTypes = typeSystemContext.possibleIntegerTypes(simpleTypeMarker);
        if ((collectionPossibleIntegerTypes instanceof Collection) && collectionPossibleIntegerTypes.isEmpty()) {
            return false;
        }
        for (KotlinTypeMarker kotlinTypeMarker : collectionPossibleIntegerTypes) {
            if (Intrinsics.areEqual(typeSystemContext.typeConstructor(kotlinTypeMarker), typeSystemContext.typeConstructor(simpleTypeMarker2)) || (z10 && isSubtypeOf$default(INSTANCE, typeCheckerState, simpleTypeMarker2, kotlinTypeMarker, false, 8, null))) {
                return true;
            }
        }
        return false;
    }

    public static List c(TypeCheckerState typeCheckerState, SimpleTypeMarker simpleTypeMarker, TypeConstructorMarker typeConstructorMarker) {
        TypeCheckerState.SupertypesPolicy supertypesPolicySubstitutionSupertypePolicy;
        TypeSystemContext typeSystemContext = typeCheckerState.getTypeSystemContext();
        List<SimpleTypeMarker> listFastCorrespondingSupertypes = typeSystemContext.fastCorrespondingSupertypes(simpleTypeMarker, typeConstructorMarker);
        if (listFastCorrespondingSupertypes != null) {
            return listFastCorrespondingSupertypes;
        }
        if (!typeSystemContext.isClassTypeConstructor(typeConstructorMarker) && typeSystemContext.isClassType(simpleTypeMarker)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (typeSystemContext.isCommonFinalClassConstructor(typeConstructorMarker)) {
            if (!typeSystemContext.areEqualTypeConstructors(typeSystemContext.typeConstructor(simpleTypeMarker), typeConstructorMarker)) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            SimpleTypeMarker simpleTypeMarkerCaptureFromArguments = typeSystemContext.captureFromArguments(simpleTypeMarker, CaptureStatus.FOR_SUBTYPING);
            if (simpleTypeMarkerCaptureFromArguments != null) {
                simpleTypeMarker = simpleTypeMarkerCaptureFromArguments;
            }
            return d.listOf(simpleTypeMarker);
        }
        SmartList smartList = new SmartList();
        typeCheckerState.initialize();
        ArrayDeque<SimpleTypeMarker> supertypesDeque = typeCheckerState.getSupertypesDeque();
        Intrinsics.checkNotNull(supertypesDeque);
        Set<SimpleTypeMarker> supertypesSet = typeCheckerState.getSupertypesSet();
        Intrinsics.checkNotNull(supertypesSet);
        supertypesDeque.push(simpleTypeMarker);
        while (!supertypesDeque.isEmpty()) {
            if (supertypesSet.size() > 1000) {
                StringBuilder sbD = k.d("Too many supertypes for type: ", simpleTypeMarker, ". Supertypes = ");
                sbD.append(CollectionsKt___CollectionsKt.joinToString$default(supertypesSet, null, null, null, 0, null, null, 63, null));
                throw new IllegalStateException(sbD.toString().toString());
            }
            SimpleTypeMarker simpleTypeMarkerPop = supertypesDeque.pop();
            Intrinsics.checkNotNull(simpleTypeMarkerPop);
            if (supertypesSet.add(simpleTypeMarkerPop)) {
                SimpleTypeMarker simpleTypeMarkerCaptureFromArguments2 = typeSystemContext.captureFromArguments(simpleTypeMarkerPop, CaptureStatus.FOR_SUBTYPING);
                if (simpleTypeMarkerCaptureFromArguments2 == null) {
                    simpleTypeMarkerCaptureFromArguments2 = simpleTypeMarkerPop;
                }
                if (typeSystemContext.areEqualTypeConstructors(typeSystemContext.typeConstructor(simpleTypeMarkerCaptureFromArguments2), typeConstructorMarker)) {
                    smartList.add(simpleTypeMarkerCaptureFromArguments2);
                    supertypesPolicySubstitutionSupertypePolicy = TypeCheckerState.SupertypesPolicy.None.INSTANCE;
                } else {
                    supertypesPolicySubstitutionSupertypePolicy = typeSystemContext.argumentsCount(simpleTypeMarkerCaptureFromArguments2) == 0 ? TypeCheckerState.SupertypesPolicy.LowerIfFlexible.INSTANCE : typeCheckerState.getTypeSystemContext().substitutionSupertypePolicy(simpleTypeMarkerCaptureFromArguments2);
                }
                if (!(!Intrinsics.areEqual(supertypesPolicySubstitutionSupertypePolicy, TypeCheckerState.SupertypesPolicy.None.INSTANCE))) {
                    supertypesPolicySubstitutionSupertypePolicy = null;
                }
                if (supertypesPolicySubstitutionSupertypePolicy != null) {
                    TypeSystemContext typeSystemContext2 = typeCheckerState.getTypeSystemContext();
                    Iterator<KotlinTypeMarker> it = typeSystemContext2.supertypes(typeSystemContext2.typeConstructor(simpleTypeMarkerPop)).iterator();
                    while (it.hasNext()) {
                        supertypesDeque.add(supertypesPolicySubstitutionSupertypePolicy.mo5781transformType(typeCheckerState, it.next()));
                    }
                }
            }
        }
        typeCheckerState.clear();
        return smartList;
    }

    public static List d(TypeCheckerState typeCheckerState, SimpleTypeMarker simpleTypeMarker, TypeConstructorMarker typeConstructorMarker) {
        List listC = c(typeCheckerState, simpleTypeMarker, typeConstructorMarker);
        TypeSystemContext typeSystemContext = typeCheckerState.getTypeSystemContext();
        if (listC.size() < 2) {
            return listC;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listC) {
            TypeArgumentListMarker typeArgumentListMarkerAsArgumentList = typeSystemContext.asArgumentList((SimpleTypeMarker) obj);
            int size = typeSystemContext.size(typeArgumentListMarkerAsArgumentList);
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    arrayList.add(obj);
                    break;
                }
                if (typeSystemContext.asFlexibleType(typeSystemContext.getType(typeSystemContext.get(typeArgumentListMarkerAsArgumentList, i10))) != null) {
                    break;
                }
                i10++;
            }
        }
        return arrayList.isEmpty() ^ true ? arrayList : listC;
    }

    public static TypeParameterMarker e(TypeSystemContext typeSystemContext, KotlinTypeMarker kotlinTypeMarker, SimpleTypeMarker simpleTypeMarker) {
        KotlinTypeMarker type;
        int iArgumentsCount = typeSystemContext.argumentsCount(kotlinTypeMarker);
        int i10 = 0;
        while (true) {
            if (i10 >= iArgumentsCount) {
                return null;
            }
            TypeArgumentMarker argument = typeSystemContext.getArgument(kotlinTypeMarker, i10);
            TypeArgumentMarker typeArgumentMarker = typeSystemContext.isStarProjection(argument) ^ true ? argument : null;
            if (typeArgumentMarker != null && (type = typeSystemContext.getType(typeArgumentMarker)) != null) {
                boolean z10 = typeSystemContext.isCapturedType(typeSystemContext.originalIfDefinitelyNotNullable(typeSystemContext.lowerBoundIfFlexible(type))) && typeSystemContext.isCapturedType(typeSystemContext.originalIfDefinitelyNotNullable(typeSystemContext.lowerBoundIfFlexible(simpleTypeMarker)));
                if (Intrinsics.areEqual(type, simpleTypeMarker) || (z10 && Intrinsics.areEqual(typeSystemContext.typeConstructor(type), typeSystemContext.typeConstructor((KotlinTypeMarker) simpleTypeMarker)))) {
                    return typeSystemContext.getParameter(typeSystemContext.typeConstructor(kotlinTypeMarker), i10);
                }
                TypeParameterMarker typeParameterMarkerE = e(typeSystemContext, type, simpleTypeMarker);
                if (typeParameterMarkerE != null) {
                    return typeParameterMarkerE;
                }
            }
            i10++;
        }
    }

    public static boolean f(TypeSystemContext typeSystemContext, KotlinTypeMarker kotlinTypeMarker) {
        return (!typeSystemContext.isDenotable(typeSystemContext.typeConstructor(kotlinTypeMarker)) || typeSystemContext.isDynamic(kotlinTypeMarker) || typeSystemContext.isDefinitelyNotNullType(kotlinTypeMarker) || typeSystemContext.isNotNullTypeParameter(kotlinTypeMarker) || !Intrinsics.areEqual(typeSystemContext.typeConstructor(typeSystemContext.lowerBoundIfFlexible(kotlinTypeMarker)), typeSystemContext.typeConstructor(typeSystemContext.upperBoundIfFlexible(kotlinTypeMarker)))) ? false : true;
    }

    public static boolean g(TypeSystemContext typeSystemContext, KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2, TypeConstructorMarker typeConstructorMarker) {
        TypeParameterMarker typeParameter;
        SimpleTypeMarker simpleTypeMarkerAsSimpleType = typeSystemContext.asSimpleType(kotlinTypeMarker);
        if (!(simpleTypeMarkerAsSimpleType instanceof CapturedTypeMarker)) {
            return false;
        }
        CapturedTypeMarker capturedTypeMarker = (CapturedTypeMarker) simpleTypeMarkerAsSimpleType;
        if (typeSystemContext.isOldCapturedType(capturedTypeMarker) || !typeSystemContext.isStarProjection(typeSystemContext.projection(typeSystemContext.typeConstructor(capturedTypeMarker))) || typeSystemContext.captureStatus(capturedTypeMarker) != CaptureStatus.FOR_SUBTYPING) {
            return false;
        }
        TypeConstructorMarker typeConstructorMarkerTypeConstructor = typeSystemContext.typeConstructor(kotlinTypeMarker2);
        TypeVariableTypeConstructorMarker typeVariableTypeConstructorMarker = typeConstructorMarkerTypeConstructor instanceof TypeVariableTypeConstructorMarker ? (TypeVariableTypeConstructorMarker) typeConstructorMarkerTypeConstructor : null;
        return (typeVariableTypeConstructorMarker == null || (typeParameter = typeSystemContext.getTypeParameter(typeVariableTypeConstructorMarker)) == null || !typeSystemContext.hasRecursiveBounds(typeParameter, typeConstructorMarker)) ? false : true;
    }

    public static /* synthetic */ boolean isSubtypeOf$default(AbstractTypeChecker abstractTypeChecker, TypeCheckerState typeCheckerState, KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return abstractTypeChecker.isSubtypeOf(typeCheckerState, kotlinTypeMarker, kotlinTypeMarker2, z10);
    }

    @Nullable
    public final TypeVariance effectiveVariance(@NotNull TypeVariance declared, @NotNull TypeVariance useSite) {
        Intrinsics.checkNotNullParameter(declared, "declared");
        Intrinsics.checkNotNullParameter(useSite, "useSite");
        TypeVariance typeVariance = TypeVariance.INV;
        if (declared == typeVariance) {
            return useSite;
        }
        if (useSite == typeVariance || declared == useSite) {
            return declared;
        }
        return null;
    }

    public final boolean equalTypes(@NotNull TypeCheckerState state, @NotNull KotlinTypeMarker a10, @NotNull KotlinTypeMarker b10) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        TypeSystemContext typeSystemContext = state.getTypeSystemContext();
        if (a10 == b10) {
            return true;
        }
        AbstractTypeChecker abstractTypeChecker = INSTANCE;
        abstractTypeChecker.getClass();
        if (f(typeSystemContext, a10) && f(typeSystemContext, b10)) {
            KotlinTypeMarker kotlinTypeMarkerPrepareType = state.prepareType(state.refineType(a10));
            KotlinTypeMarker kotlinTypeMarkerPrepareType2 = state.prepareType(state.refineType(b10));
            SimpleTypeMarker simpleTypeMarkerLowerBoundIfFlexible = typeSystemContext.lowerBoundIfFlexible(kotlinTypeMarkerPrepareType);
            if (!typeSystemContext.areEqualTypeConstructors(typeSystemContext.typeConstructor(kotlinTypeMarkerPrepareType), typeSystemContext.typeConstructor(kotlinTypeMarkerPrepareType2))) {
                return false;
            }
            if (typeSystemContext.argumentsCount(simpleTypeMarkerLowerBoundIfFlexible) == 0) {
                return typeSystemContext.hasFlexibleNullability(kotlinTypeMarkerPrepareType) || typeSystemContext.hasFlexibleNullability(kotlinTypeMarkerPrepareType2) || typeSystemContext.isMarkedNullable(simpleTypeMarkerLowerBoundIfFlexible) == typeSystemContext.isMarkedNullable(typeSystemContext.lowerBoundIfFlexible(kotlinTypeMarkerPrepareType2));
            }
        }
        return isSubtypeOf$default(abstractTypeChecker, state, a10, b10, false, 8, null) && isSubtypeOf$default(abstractTypeChecker, state, b10, a10, false, 8, null);
    }

    @NotNull
    public final List<SimpleTypeMarker> findCorrespondingSupertypes(@NotNull TypeCheckerState state, @NotNull SimpleTypeMarker subType, @NotNull TypeConstructorMarker superConstructor) {
        TypeCheckerState.SupertypesPolicy supertypesPolicy;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(subType, "subType");
        Intrinsics.checkNotNullParameter(superConstructor, "superConstructor");
        TypeSystemContext typeSystemContext = state.getTypeSystemContext();
        if (typeSystemContext.isClassType(subType)) {
            INSTANCE.getClass();
            return d(state, subType, superConstructor);
        }
        if (!typeSystemContext.isClassTypeConstructor(superConstructor) && !typeSystemContext.isIntegerLiteralTypeConstructor(superConstructor)) {
            INSTANCE.getClass();
            return c(state, subType, superConstructor);
        }
        SmartList<SimpleTypeMarker> smartList = new SmartList();
        state.initialize();
        ArrayDeque<SimpleTypeMarker> supertypesDeque = state.getSupertypesDeque();
        Intrinsics.checkNotNull(supertypesDeque);
        Set<SimpleTypeMarker> supertypesSet = state.getSupertypesSet();
        Intrinsics.checkNotNull(supertypesSet);
        supertypesDeque.push(subType);
        while (!supertypesDeque.isEmpty()) {
            if (supertypesSet.size() > 1000) {
                StringBuilder sbD = k.d("Too many supertypes for type: ", subType, ". Supertypes = ");
                sbD.append(CollectionsKt___CollectionsKt.joinToString$default(supertypesSet, null, null, null, 0, null, null, 63, null));
                throw new IllegalStateException(sbD.toString().toString());
            }
            SimpleTypeMarker simpleTypeMarkerPop = supertypesDeque.pop();
            Intrinsics.checkNotNull(simpleTypeMarkerPop);
            if (supertypesSet.add(simpleTypeMarkerPop)) {
                if (typeSystemContext.isClassType(simpleTypeMarkerPop)) {
                    smartList.add(simpleTypeMarkerPop);
                    supertypesPolicy = TypeCheckerState.SupertypesPolicy.None.INSTANCE;
                } else {
                    supertypesPolicy = TypeCheckerState.SupertypesPolicy.LowerIfFlexible.INSTANCE;
                }
                if (!(!Intrinsics.areEqual(supertypesPolicy, TypeCheckerState.SupertypesPolicy.None.INSTANCE))) {
                    supertypesPolicy = null;
                }
                if (supertypesPolicy != null) {
                    TypeSystemContext typeSystemContext2 = state.getTypeSystemContext();
                    Iterator<KotlinTypeMarker> it = typeSystemContext2.supertypes(typeSystemContext2.typeConstructor(simpleTypeMarkerPop)).iterator();
                    while (it.hasNext()) {
                        supertypesDeque.add(supertypesPolicy.mo5781transformType(state, it.next()));
                    }
                }
            }
        }
        state.clear();
        ArrayList arrayList = new ArrayList();
        for (SimpleTypeMarker simpleTypeMarker : smartList) {
            AbstractTypeChecker abstractTypeChecker = INSTANCE;
            Intrinsics.checkNotNull(simpleTypeMarker);
            abstractTypeChecker.getClass();
            g.addAll(arrayList, d(state, simpleTypeMarker, superConstructor));
        }
        return arrayList;
    }

    public final boolean isSubtypeForSameConstructor(@NotNull TypeCheckerState typeCheckerState, @NotNull TypeArgumentListMarker capturedSubArguments, @NotNull SimpleTypeMarker superType) {
        boolean zEqualTypes;
        Intrinsics.checkNotNullParameter(typeCheckerState, "<this>");
        Intrinsics.checkNotNullParameter(capturedSubArguments, "capturedSubArguments");
        Intrinsics.checkNotNullParameter(superType, "superType");
        TypeSystemContext typeSystemContext = typeCheckerState.getTypeSystemContext();
        TypeConstructorMarker typeConstructorMarkerTypeConstructor = typeSystemContext.typeConstructor(superType);
        int size = typeSystemContext.size(capturedSubArguments);
        int iParametersCount = typeSystemContext.parametersCount(typeConstructorMarkerTypeConstructor);
        if (size != iParametersCount || size != typeSystemContext.argumentsCount(superType)) {
            return false;
        }
        for (int i10 = 0; i10 < iParametersCount; i10++) {
            TypeArgumentMarker argument = typeSystemContext.getArgument(superType, i10);
            if (!typeSystemContext.isStarProjection(argument)) {
                KotlinTypeMarker type = typeSystemContext.getType(argument);
                TypeArgumentMarker typeArgumentMarker = typeSystemContext.get(capturedSubArguments, i10);
                typeSystemContext.getVariance(typeArgumentMarker);
                TypeVariance typeVariance = TypeVariance.INV;
                KotlinTypeMarker type2 = typeSystemContext.getType(typeArgumentMarker);
                AbstractTypeChecker abstractTypeChecker = INSTANCE;
                TypeVariance typeVarianceEffectiveVariance = abstractTypeChecker.effectiveVariance(typeSystemContext.getVariance(typeSystemContext.getParameter(typeConstructorMarkerTypeConstructor, i10)), typeSystemContext.getVariance(argument));
                if (typeVarianceEffectiveVariance == null) {
                    return typeCheckerState.isErrorTypeEqualsToAnything();
                }
                if (typeVarianceEffectiveVariance != typeVariance || (!g(typeSystemContext, type2, type, typeConstructorMarkerTypeConstructor) && !g(typeSystemContext, type, type2, typeConstructorMarkerTypeConstructor))) {
                    if (typeCheckerState.f81971g > 100) {
                        throw new IllegalStateException(("Arguments depth is too high. Some related argument: " + type2).toString());
                    }
                    typeCheckerState.f81971g++;
                    int i11 = WhenMappings.$EnumSwitchMapping$0[typeVarianceEffectiveVariance.ordinal()];
                    if (i11 == 1) {
                        zEqualTypes = abstractTypeChecker.equalTypes(typeCheckerState, type2, type);
                    } else if (i11 == 2) {
                        zEqualTypes = isSubtypeOf$default(abstractTypeChecker, typeCheckerState, type2, type, false, 8, null);
                    } else {
                        if (i11 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        zEqualTypes = isSubtypeOf$default(abstractTypeChecker, typeCheckerState, type, type2, false, 8, null);
                    }
                    typeCheckerState.f81971g--;
                    if (!zEqualTypes) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @JvmOverloads
    public final boolean isSubtypeOf(@NotNull TypeCheckerState state, @NotNull KotlinTypeMarker subType, @NotNull KotlinTypeMarker superType) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(subType, "subType");
        Intrinsics.checkNotNullParameter(superType, "superType");
        return isSubtypeOf$default(this, state, subType, superType, false, 8, null);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x019a  */
    /* JADX WARN: Code duplicated, block: B:103:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:106:0x01af  */
    /* JADX WARN: Code duplicated, block: B:108:0x01be  */
    /* JADX WARN: Code duplicated, block: B:111:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:144:0x026e  */
    /* JADX WARN: Code duplicated, block: B:173:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:182:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:291:0x014f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:292:0x0171 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:293:? A[LOOP:6: B:85:0x0155->B:293:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:294:0x01af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:295:0x01cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:296:? A[LOOP:7: B:101:0x019e->B:296:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0107  */
    /* JADX WARN: Code duplicated, block: B:79:0x0139  */
    /* JADX WARN: Code duplicated, block: B:84:0x0151  */
    /* JADX WARN: Code duplicated, block: B:87:0x015b  */
    /* JADX WARN: Code duplicated, block: B:91:0x0178  */
    /* JADX WARN: Code duplicated, block: B:93:0x0180  */
    /* JADX WARN: Code duplicated, block: B:95:0x0186  */
    @JvmOverloads
    public final boolean isSubtypeOf(@NotNull TypeCheckerState state, @NotNull KotlinTypeMarker subType, @NotNull KotlinTypeMarker superType, boolean z10) {
        Boolean boolValueOf;
        Boolean bool;
        boolean zIsNothingConstructor;
        KotlinTypeMarker type;
        SimpleTypeMarker simpleTypeMarkerOriginal;
        TypeConstructorMarker typeConstructorMarkerTypeConstructor;
        TypeConstructorMarker typeConstructorMarkerTypeConstructor2;
        TypeParameterMarker typeParameterMarkerE;
        Collection<KotlinTypeMarker> collectionSupertypes;
        Iterator<T> it;
        Collection<KotlinTypeMarker> collectionSupertypes2;
        Iterator<T> it2;
        boolean z11;
        SimpleTypeMarker simpleTypeMarkerOriginal2;
        SimpleTypeMarker simpleTypeMarkerOriginal3;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(subType, "subType");
        Intrinsics.checkNotNullParameter(superType, "superType");
        if (subType == superType) {
            return true;
        }
        boolean z12 = false;
        if (!state.customIsSubtypeOf(subType, superType)) {
            return false;
        }
        TypeSystemContext typeSystemContext = state.getTypeSystemContext();
        KotlinTypeMarker kotlinTypeMarkerPrepareType = state.prepareType(state.refineType(subType));
        KotlinTypeMarker kotlinTypeMarkerPrepareType2 = state.prepareType(state.refineType(superType));
        AbstractTypeChecker abstractTypeChecker = INSTANCE;
        SimpleTypeMarker simpleTypeMarkerLowerBoundIfFlexible = typeSystemContext.lowerBoundIfFlexible(kotlinTypeMarkerPrepareType);
        SimpleTypeMarker simpleTypeMarkerUpperBoundIfFlexible = typeSystemContext.upperBoundIfFlexible(kotlinTypeMarkerPrepareType2);
        abstractTypeChecker.getClass();
        TypeSystemContext typeSystemContext2 = state.getTypeSystemContext();
        if (typeSystemContext2.isError(simpleTypeMarkerLowerBoundIfFlexible) || typeSystemContext2.isError(simpleTypeMarkerUpperBoundIfFlexible)) {
            boolValueOf = state.isErrorTypeEqualsToAnything() ? Boolean.TRUE : (!typeSystemContext2.isMarkedNullable(simpleTypeMarkerLowerBoundIfFlexible) || typeSystemContext2.isMarkedNullable(simpleTypeMarkerUpperBoundIfFlexible)) ? Boolean.valueOf(AbstractStrictEqualityTypeChecker.INSTANCE.strictEqualTypes(typeSystemContext2, typeSystemContext2.withNullability(simpleTypeMarkerLowerBoundIfFlexible, false), typeSystemContext2.withNullability(simpleTypeMarkerUpperBoundIfFlexible, false))) : Boolean.FALSE;
        } else if (typeSystemContext2.isStubTypeForBuilderInference(simpleTypeMarkerLowerBoundIfFlexible) && typeSystemContext2.isStubTypeForBuilderInference(simpleTypeMarkerUpperBoundIfFlexible)) {
            DefinitelyNotNullTypeMarker definitelyNotNullTypeMarkerAsDefinitelyNotNullType = typeSystemContext2.asDefinitelyNotNullType(simpleTypeMarkerLowerBoundIfFlexible);
            if (definitelyNotNullTypeMarkerAsDefinitelyNotNullType == null || (simpleTypeMarkerOriginal2 = typeSystemContext2.original(definitelyNotNullTypeMarkerAsDefinitelyNotNullType)) == null) {
                simpleTypeMarkerOriginal2 = simpleTypeMarkerLowerBoundIfFlexible;
            }
            DefinitelyNotNullTypeMarker definitelyNotNullTypeMarkerAsDefinitelyNotNullType2 = typeSystemContext2.asDefinitelyNotNullType(simpleTypeMarkerUpperBoundIfFlexible);
            if (definitelyNotNullTypeMarkerAsDefinitelyNotNullType2 == null || (simpleTypeMarkerOriginal3 = typeSystemContext2.original(definitelyNotNullTypeMarkerAsDefinitelyNotNullType2)) == null) {
                simpleTypeMarkerOriginal3 = simpleTypeMarkerUpperBoundIfFlexible;
            }
            boolValueOf = Boolean.valueOf((typeSystemContext2.typeConstructor(simpleTypeMarkerOriginal2) == typeSystemContext2.typeConstructor(simpleTypeMarkerOriginal3) && ((typeSystemContext2.isDefinitelyNotNullType(simpleTypeMarkerLowerBoundIfFlexible) || !typeSystemContext2.isDefinitelyNotNullType(simpleTypeMarkerUpperBoundIfFlexible)) && (!typeSystemContext2.isMarkedNullable(simpleTypeMarkerLowerBoundIfFlexible) || typeSystemContext2.isMarkedNullable(simpleTypeMarkerUpperBoundIfFlexible)))) || state.isStubTypeEqualsToAnything());
        } else if (typeSystemContext2.isStubType(simpleTypeMarkerLowerBoundIfFlexible) || typeSystemContext2.isStubType(simpleTypeMarkerUpperBoundIfFlexible)) {
            boolValueOf = Boolean.valueOf(state.isStubTypeEqualsToAnything());
        } else {
            DefinitelyNotNullTypeMarker definitelyNotNullTypeMarkerAsDefinitelyNotNullType3 = typeSystemContext2.asDefinitelyNotNullType(simpleTypeMarkerUpperBoundIfFlexible);
            if (definitelyNotNullTypeMarkerAsDefinitelyNotNullType3 == null || (simpleTypeMarkerOriginal = typeSystemContext2.original(definitelyNotNullTypeMarkerAsDefinitelyNotNullType3)) == null) {
                simpleTypeMarkerOriginal = simpleTypeMarkerUpperBoundIfFlexible;
            }
            CapturedTypeMarker capturedTypeMarkerAsCapturedType = typeSystemContext2.asCapturedType(simpleTypeMarkerOriginal);
            KotlinTypeMarker kotlinTypeMarkerLowerType = capturedTypeMarkerAsCapturedType != null ? typeSystemContext2.lowerType(capturedTypeMarkerAsCapturedType) : null;
            if (capturedTypeMarkerAsCapturedType == null || kotlinTypeMarkerLowerType == null) {
                typeConstructorMarkerTypeConstructor = typeSystemContext2.typeConstructor(simpleTypeMarkerUpperBoundIfFlexible);
                if (typeSystemContext2.isIntersection(typeConstructorMarkerTypeConstructor)) {
                    typeSystemContext2.isMarkedNullable(simpleTypeMarkerUpperBoundIfFlexible);
                    collectionSupertypes2 = typeSystemContext2.supertypes(typeConstructorMarkerTypeConstructor);
                    if (!(collectionSupertypes2 instanceof Collection) && collectionSupertypes2.isEmpty()) {
                        z11 = true;
                        break;
                    }
                    it2 = collectionSupertypes2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            z11 = true;
                            break;
                        }
                        if (!isSubtypeOf$default(INSTANCE, state, simpleTypeMarkerLowerBoundIfFlexible, (KotlinTypeMarker) it2.next(), false, 8, null)) {
                            z11 = false;
                            break;
                        }
                    }
                    boolValueOf = Boolean.valueOf(z11);
                } else {
                    typeConstructorMarkerTypeConstructor2 = typeSystemContext2.typeConstructor(simpleTypeMarkerLowerBoundIfFlexible);
                    if (simpleTypeMarkerLowerBoundIfFlexible instanceof CapturedTypeMarker) {
                        AbstractTypeChecker abstractTypeChecker2 = INSTANCE;
                        TypeSystemContext typeSystemContext3 = state.getTypeSystemContext();
                        abstractTypeChecker2.getClass();
                        typeParameterMarkerE = e(typeSystemContext3, simpleTypeMarkerUpperBoundIfFlexible, simpleTypeMarkerLowerBoundIfFlexible);
                        if (typeParameterMarkerE == null && typeSystemContext2.hasRecursiveBounds(typeParameterMarkerE, typeSystemContext2.typeConstructor(simpleTypeMarkerUpperBoundIfFlexible))) {
                            boolValueOf = Boolean.TRUE;
                        } else {
                            boolValueOf = null;
                        }
                    } else {
                        if (typeSystemContext2.isIntersection(typeConstructorMarkerTypeConstructor2)) {
                            collectionSupertypes = typeSystemContext2.supertypes(typeConstructorMarkerTypeConstructor2);
                            if ((collectionSupertypes instanceof Collection) || !collectionSupertypes.isEmpty()) {
                                it = collectionSupertypes.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        AbstractTypeChecker abstractTypeChecker3 = INSTANCE;
                                        TypeSystemContext typeSystemContext4 = state.getTypeSystemContext();
                                        abstractTypeChecker3.getClass();
                                        typeParameterMarkerE = e(typeSystemContext4, simpleTypeMarkerUpperBoundIfFlexible, simpleTypeMarkerLowerBoundIfFlexible);
                                        if (typeParameterMarkerE == null) {
                                        }
                                    } else if (!(((KotlinTypeMarker) it.next()) instanceof CapturedTypeMarker)) {
                                    }
                                }
                            } else {
                                AbstractTypeChecker abstractTypeChecker4 = INSTANCE;
                                TypeSystemContext typeSystemContext5 = state.getTypeSystemContext();
                                abstractTypeChecker4.getClass();
                                typeParameterMarkerE = e(typeSystemContext5, simpleTypeMarkerUpperBoundIfFlexible, simpleTypeMarkerLowerBoundIfFlexible);
                                if (typeParameterMarkerE == null) {
                                }
                            }
                        }
                        boolValueOf = null;
                    }
                }
            } else {
                if (typeSystemContext2.isMarkedNullable(simpleTypeMarkerUpperBoundIfFlexible)) {
                    kotlinTypeMarkerLowerType = typeSystemContext2.withNullability(kotlinTypeMarkerLowerType, true);
                } else if (typeSystemContext2.isDefinitelyNotNullType(simpleTypeMarkerUpperBoundIfFlexible)) {
                    kotlinTypeMarkerLowerType = typeSystemContext2.makeDefinitelyNotNullOrNotNull(kotlinTypeMarkerLowerType);
                }
                KotlinTypeMarker kotlinTypeMarker = kotlinTypeMarkerLowerType;
                int i10 = WhenMappings.$EnumSwitchMapping$1[state.getLowerCapturedTypePolicy(simpleTypeMarkerLowerBoundIfFlexible, capturedTypeMarkerAsCapturedType).ordinal()];
                if (i10 != 1) {
                    if (i10 == 2) {
                        if (isSubtypeOf$default(abstractTypeChecker, state, simpleTypeMarkerLowerBoundIfFlexible, kotlinTypeMarker, false, 8, null)) {
                            boolValueOf = Boolean.TRUE;
                        }
                    }
                    typeConstructorMarkerTypeConstructor = typeSystemContext2.typeConstructor(simpleTypeMarkerUpperBoundIfFlexible);
                    if (typeSystemContext2.isIntersection(typeConstructorMarkerTypeConstructor)) {
                        typeSystemContext2.isMarkedNullable(simpleTypeMarkerUpperBoundIfFlexible);
                        collectionSupertypes2 = typeSystemContext2.supertypes(typeConstructorMarkerTypeConstructor);
                        if (!(collectionSupertypes2 instanceof Collection)) {
                            it2 = collectionSupertypes2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    z11 = true;
                                    break;
                                }
                                if (!isSubtypeOf$default(INSTANCE, state, simpleTypeMarkerLowerBoundIfFlexible, (KotlinTypeMarker) it2.next(), false, 8, null)) {
                                    z11 = false;
                                    break;
                                }
                            }
                        } else {
                            it2 = collectionSupertypes2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    z11 = true;
                                    break;
                                }
                                if (!isSubtypeOf$default(INSTANCE, state, simpleTypeMarkerLowerBoundIfFlexible, (KotlinTypeMarker) it2.next(), false, 8, null)) {
                                    z11 = false;
                                    break;
                                }
                            }
                        }
                        boolValueOf = Boolean.valueOf(z11);
                    } else {
                        typeConstructorMarkerTypeConstructor2 = typeSystemContext2.typeConstructor(simpleTypeMarkerLowerBoundIfFlexible);
                        if (simpleTypeMarkerLowerBoundIfFlexible instanceof CapturedTypeMarker) {
                            AbstractTypeChecker abstractTypeChecker5 = INSTANCE;
                            TypeSystemContext typeSystemContext6 = state.getTypeSystemContext();
                            abstractTypeChecker5.getClass();
                            typeParameterMarkerE = e(typeSystemContext6, simpleTypeMarkerUpperBoundIfFlexible, simpleTypeMarkerLowerBoundIfFlexible);
                            if (typeParameterMarkerE == null) {
                                boolValueOf = null;
                            } else {
                                boolValueOf = null;
                            }
                        } else {
                            if (typeSystemContext2.isIntersection(typeConstructorMarkerTypeConstructor2)) {
                                collectionSupertypes = typeSystemContext2.supertypes(typeConstructorMarkerTypeConstructor2);
                                if (collectionSupertypes instanceof Collection) {
                                    it = collectionSupertypes.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            AbstractTypeChecker abstractTypeChecker6 = INSTANCE;
                                            TypeSystemContext typeSystemContext7 = state.getTypeSystemContext();
                                            abstractTypeChecker6.getClass();
                                            typeParameterMarkerE = e(typeSystemContext7, simpleTypeMarkerUpperBoundIfFlexible, simpleTypeMarkerLowerBoundIfFlexible);
                                            if (typeParameterMarkerE == null) {
                                            }
                                        } else if (!(((KotlinTypeMarker) it.next()) instanceof CapturedTypeMarker)) {
                                        }
                                    }
                                } else {
                                    it = collectionSupertypes.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            AbstractTypeChecker abstractTypeChecker7 = INSTANCE;
                                            TypeSystemContext typeSystemContext8 = state.getTypeSystemContext();
                                            abstractTypeChecker7.getClass();
                                            typeParameterMarkerE = e(typeSystemContext8, simpleTypeMarkerUpperBoundIfFlexible, simpleTypeMarkerLowerBoundIfFlexible);
                                            if (typeParameterMarkerE == null) {
                                            }
                                        } else if (!(((KotlinTypeMarker) it.next()) instanceof CapturedTypeMarker)) {
                                        }
                                    }
                                }
                            }
                            boolValueOf = null;
                        }
                    }
                } else {
                    boolValueOf = Boolean.valueOf(isSubtypeOf$default(abstractTypeChecker, state, simpleTypeMarkerLowerBoundIfFlexible, kotlinTypeMarker, false, 8, null));
                }
            }
        }
        if (boolValueOf != null) {
            boolean zBooleanValue = boolValueOf.booleanValue();
            state.addSubtypeConstraint(kotlinTypeMarkerPrepareType, kotlinTypeMarkerPrepareType2, z10);
            return zBooleanValue;
        }
        Boolean boolAddSubtypeConstraint = state.addSubtypeConstraint(kotlinTypeMarkerPrepareType, kotlinTypeMarkerPrepareType2, z10);
        if (boolAddSubtypeConstraint != null) {
            return boolAddSubtypeConstraint.booleanValue();
        }
        AbstractTypeChecker abstractTypeChecker8 = INSTANCE;
        SimpleTypeMarker simpleTypeMarkerLowerBoundIfFlexible2 = typeSystemContext.lowerBoundIfFlexible(kotlinTypeMarkerPrepareType);
        SimpleTypeMarker simpleTypeMarkerUpperBoundIfFlexible2 = typeSystemContext.upperBoundIfFlexible(kotlinTypeMarkerPrepareType2);
        abstractTypeChecker8.getClass();
        TypeSystemContext typeSystemContext9 = state.getTypeSystemContext();
        if (RUN_SLOW_ASSERTIONS) {
            if (!typeSystemContext9.isSingleClassifierType(simpleTypeMarkerLowerBoundIfFlexible2) && !typeSystemContext9.isIntersection(typeSystemContext9.typeConstructor(simpleTypeMarkerLowerBoundIfFlexible2))) {
                state.isAllowedTypeVariable(simpleTypeMarkerLowerBoundIfFlexible2);
            }
            if (!typeSystemContext9.isSingleClassifierType(simpleTypeMarkerUpperBoundIfFlexible2)) {
                state.isAllowedTypeVariable(simpleTypeMarkerUpperBoundIfFlexible2);
            }
        }
        if (AbstractNullabilityChecker.INSTANCE.isPossibleSubtype(state, simpleTypeMarkerLowerBoundIfFlexible2, simpleTypeMarkerUpperBoundIfFlexible2)) {
            SimpleTypeMarker simpleTypeMarkerLowerBoundIfFlexible3 = typeSystemContext9.lowerBoundIfFlexible(simpleTypeMarkerLowerBoundIfFlexible2);
            SimpleTypeMarker simpleTypeMarkerUpperBoundIfFlexible3 = typeSystemContext9.upperBoundIfFlexible(simpleTypeMarkerUpperBoundIfFlexible2);
            TypeSystemContext typeSystemContext10 = state.getTypeSystemContext();
            if (!typeSystemContext10.isIntegerLiteralType(simpleTypeMarkerLowerBoundIfFlexible3) && !typeSystemContext10.isIntegerLiteralType(simpleTypeMarkerUpperBoundIfFlexible3)) {
                bool = null;
            } else if (a(typeSystemContext10, simpleTypeMarkerLowerBoundIfFlexible3) && a(typeSystemContext10, simpleTypeMarkerUpperBoundIfFlexible3)) {
                bool = Boolean.TRUE;
            } else if (typeSystemContext10.isIntegerLiteralType(simpleTypeMarkerLowerBoundIfFlexible3)) {
                if (b(typeSystemContext10, state, simpleTypeMarkerLowerBoundIfFlexible3, simpleTypeMarkerUpperBoundIfFlexible3, false)) {
                    bool = Boolean.TRUE;
                } else {
                    bool = null;
                }
            } else if (typeSystemContext10.isIntegerLiteralType(simpleTypeMarkerUpperBoundIfFlexible3)) {
                TypeConstructorMarker typeConstructorMarkerTypeConstructor3 = typeSystemContext10.typeConstructor(simpleTypeMarkerLowerBoundIfFlexible3);
                if (typeConstructorMarkerTypeConstructor3 instanceof IntersectionTypeConstructorMarker) {
                    Collection<KotlinTypeMarker> collectionSupertypes3 = typeSystemContext10.supertypes(typeConstructorMarkerTypeConstructor3);
                    if (!(collectionSupertypes3 instanceof Collection) || !collectionSupertypes3.isEmpty()) {
                        Iterator<T> it3 = collectionSupertypes3.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                SimpleTypeMarker simpleTypeMarkerAsSimpleType = typeSystemContext10.asSimpleType((KotlinTypeMarker) it3.next());
                                if (simpleTypeMarkerAsSimpleType != null && typeSystemContext10.isIntegerLiteralType(simpleTypeMarkerAsSimpleType)) {
                                }
                            } else if (!b(typeSystemContext10, state, simpleTypeMarkerUpperBoundIfFlexible3, simpleTypeMarkerLowerBoundIfFlexible3, true)) {
                                bool = null;
                            }
                        }
                    } else if (!b(typeSystemContext10, state, simpleTypeMarkerUpperBoundIfFlexible3, simpleTypeMarkerLowerBoundIfFlexible3, true)) {
                        bool = null;
                    }
                } else if (!b(typeSystemContext10, state, simpleTypeMarkerUpperBoundIfFlexible3, simpleTypeMarkerLowerBoundIfFlexible3, true)) {
                    bool = null;
                }
                bool = Boolean.TRUE;
            } else {
                bool = null;
            }
            if (bool != null) {
                zIsNothingConstructor = bool.booleanValue();
                TypeCheckerState.addSubtypeConstraint$default(state, simpleTypeMarkerLowerBoundIfFlexible2, simpleTypeMarkerUpperBoundIfFlexible2, false, 4, null);
            } else {
                TypeConstructorMarker typeConstructorMarkerTypeConstructor4 = typeSystemContext9.typeConstructor(simpleTypeMarkerUpperBoundIfFlexible2);
                if ((typeSystemContext9.areEqualTypeConstructors(typeSystemContext9.typeConstructor(simpleTypeMarkerLowerBoundIfFlexible2), typeConstructorMarkerTypeConstructor4) && typeSystemContext9.parametersCount(typeConstructorMarkerTypeConstructor4) == 0) || typeSystemContext9.isAnyConstructor(typeSystemContext9.typeConstructor(simpleTypeMarkerUpperBoundIfFlexible2))) {
                    zIsNothingConstructor = true;
                } else {
                    List<SimpleTypeMarker> listFindCorrespondingSupertypes = INSTANCE.findCorrespondingSupertypes(state, simpleTypeMarkerLowerBoundIfFlexible2, typeConstructorMarkerTypeConstructor4);
                    int i11 = 10;
                    ArrayList<SimpleTypeMarker> arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listFindCorrespondingSupertypes, 10));
                    for (SimpleTypeMarker simpleTypeMarker : listFindCorrespondingSupertypes) {
                        SimpleTypeMarker simpleTypeMarkerAsSimpleType2 = typeSystemContext9.asSimpleType(state.prepareType(simpleTypeMarker));
                        if (simpleTypeMarkerAsSimpleType2 != null) {
                            simpleTypeMarker = simpleTypeMarkerAsSimpleType2;
                        }
                        arrayList.add(simpleTypeMarker);
                    }
                    int size = arrayList.size();
                    if (size == 0) {
                        INSTANCE.getClass();
                        TypeSystemContext typeSystemContext11 = state.getTypeSystemContext();
                        TypeConstructorMarker typeConstructorMarkerTypeConstructor5 = typeSystemContext11.typeConstructor(simpleTypeMarkerLowerBoundIfFlexible2);
                        if (typeSystemContext11.isClassTypeConstructor(typeConstructorMarkerTypeConstructor5)) {
                            zIsNothingConstructor = typeSystemContext11.isNothingConstructor(typeConstructorMarkerTypeConstructor5);
                        } else if (typeSystemContext11.isNothingConstructor(typeSystemContext11.typeConstructor(simpleTypeMarkerLowerBoundIfFlexible2))) {
                            zIsNothingConstructor = true;
                        } else {
                            state.initialize();
                            ArrayDeque<SimpleTypeMarker> supertypesDeque = state.getSupertypesDeque();
                            Intrinsics.checkNotNull(supertypesDeque);
                            Set<SimpleTypeMarker> supertypesSet = state.getSupertypesSet();
                            Intrinsics.checkNotNull(supertypesSet);
                            supertypesDeque.push(simpleTypeMarkerLowerBoundIfFlexible2);
                            while (!supertypesDeque.isEmpty()) {
                                if (supertypesSet.size() > 1000) {
                                    StringBuilder sbD = k.d("Too many supertypes for type: ", simpleTypeMarkerLowerBoundIfFlexible2, ". Supertypes = ");
                                    sbD.append(CollectionsKt___CollectionsKt.joinToString$default(supertypesSet, null, null, null, 0, null, null, 63, null));
                                    throw new IllegalStateException(sbD.toString().toString());
                                }
                                SimpleTypeMarker simpleTypeMarkerPop = supertypesDeque.pop();
                                Intrinsics.checkNotNull(simpleTypeMarkerPop);
                                if (supertypesSet.add(simpleTypeMarkerPop)) {
                                    TypeCheckerState.SupertypesPolicy supertypesPolicy = typeSystemContext11.isClassType(simpleTypeMarkerPop) ? TypeCheckerState.SupertypesPolicy.None.INSTANCE : TypeCheckerState.SupertypesPolicy.LowerIfFlexible.INSTANCE;
                                    if (!(!Intrinsics.areEqual(supertypesPolicy, TypeCheckerState.SupertypesPolicy.None.INSTANCE))) {
                                        supertypesPolicy = null;
                                    }
                                    if (supertypesPolicy == null) {
                                        continue;
                                    } else {
                                        TypeSystemContext typeSystemContext12 = state.getTypeSystemContext();
                                        Iterator<KotlinTypeMarker> it4 = typeSystemContext12.supertypes(typeSystemContext12.typeConstructor(simpleTypeMarkerPop)).iterator();
                                        while (it4.hasNext()) {
                                            SimpleTypeMarker simpleTypeMarkerMo5781transformType = supertypesPolicy.mo5781transformType(state, it4.next());
                                            if (typeSystemContext11.isNothingConstructor(typeSystemContext11.typeConstructor(simpleTypeMarkerMo5781transformType))) {
                                                state.clear();
                                                zIsNothingConstructor = true;
                                            } else {
                                                supertypesDeque.add(simpleTypeMarkerMo5781transformType);
                                            }
                                        }
                                    }
                                }
                            }
                            state.clear();
                            zIsNothingConstructor = false;
                        }
                    } else if (size != 1) {
                        ArgumentList argumentList = new ArgumentList(typeSystemContext9.parametersCount(typeConstructorMarkerTypeConstructor4));
                        int iParametersCount = typeSystemContext9.parametersCount(typeConstructorMarkerTypeConstructor4);
                        int i12 = 0;
                        boolean z13 = false;
                        while (i12 < iParametersCount) {
                            z13 = (z13 || typeSystemContext9.getVariance(typeSystemContext9.getParameter(typeConstructorMarkerTypeConstructor4, i12)) != TypeVariance.OUT) ? true : z12;
                            if (!z13) {
                                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, i11));
                                for (SimpleTypeMarker simpleTypeMarker2 : arrayList) {
                                    TypeArgumentMarker argumentOrNull = typeSystemContext9.getArgumentOrNull(simpleTypeMarker2, i12);
                                    if (argumentOrNull != null) {
                                        if (typeSystemContext9.getVariance(argumentOrNull) != TypeVariance.INV) {
                                            argumentOrNull = null;
                                        }
                                        if (argumentOrNull != null && (type = typeSystemContext9.getType(argumentOrNull)) != null) {
                                            arrayList2.add(type);
                                        }
                                    }
                                    throw new IllegalStateException(("Incorrect type: " + simpleTypeMarker2 + ", subType: " + simpleTypeMarkerLowerBoundIfFlexible2 + ", superType: " + simpleTypeMarkerUpperBoundIfFlexible2).toString());
                                }
                                argumentList.add(typeSystemContext9.asTypeArgument(typeSystemContext9.intersectTypes(arrayList2)));
                            }
                            i12++;
                            i11 = 10;
                            z12 = false;
                        }
                        if (z13 || !INSTANCE.isSubtypeForSameConstructor(state, argumentList, simpleTypeMarkerUpperBoundIfFlexible2)) {
                            zIsNothingConstructor = state.runForkingPoint(new a(arrayList, state, typeSystemContext9, simpleTypeMarkerUpperBoundIfFlexible2));
                        } else {
                            zIsNothingConstructor = true;
                        }
                    } else {
                        zIsNothingConstructor = INSTANCE.isSubtypeForSameConstructor(state, typeSystemContext9.asArgumentList((SimpleTypeMarker) CollectionsKt___CollectionsKt.first((List) arrayList)), simpleTypeMarkerUpperBoundIfFlexible2);
                    }
                }
            }
        } else {
            zIsNothingConstructor = false;
        }
        return zIsNothingConstructor;
    }
}
