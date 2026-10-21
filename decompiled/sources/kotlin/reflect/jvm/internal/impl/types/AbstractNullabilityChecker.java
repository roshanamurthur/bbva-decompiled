package kotlin.reflect.jvm.internal.impl.types;

import androidx.collection.k;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AbstractTypeChecker.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nAbstractTypeChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractTypeChecker.kt\norg/jetbrains/kotlin/types/AbstractNullabilityChecker\n+ 2 AbstractTypeChecker.kt\norg/jetbrains/kotlin/types/TypeCheckerState\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,835:1\n132#2,16:836\n148#2,13:853\n132#2,16:866\n148#2,13:883\n1#3:852\n1#3:882\n*S KotlinDebug\n*F\n+ 1 AbstractTypeChecker.kt\norg/jetbrains/kotlin/types/AbstractNullabilityChecker\n*L\n779#1:836,16\n779#1:853,13\n793#1:866,16\n793#1:883,13\n779#1:852\n793#1:882\n*E\n"})
public final class AbstractNullabilityChecker {

    @NotNull
    public static final AbstractNullabilityChecker INSTANCE = new AbstractNullabilityChecker();

    public static boolean a(TypeCheckerState typeCheckerState, SimpleTypeMarker simpleTypeMarker, TypeConstructorMarker typeConstructorMarker) {
        TypeSystemContext typeSystemContext = typeCheckerState.getTypeSystemContext();
        if (typeSystemContext.isNothing(simpleTypeMarker)) {
            return true;
        }
        if (typeSystemContext.isMarkedNullable(simpleTypeMarker)) {
            return false;
        }
        if (typeCheckerState.isStubTypeEqualsToAnything() && typeSystemContext.isStubType(simpleTypeMarker)) {
            return true;
        }
        return typeSystemContext.areEqualTypeConstructors(typeSystemContext.typeConstructor(simpleTypeMarker), typeConstructorMarker);
    }

    public final boolean hasNotNullSupertype(@NotNull TypeCheckerState typeCheckerState, @NotNull SimpleTypeMarker type, @NotNull TypeCheckerState.SupertypesPolicy supertypesPolicy) {
        Intrinsics.checkNotNullParameter(typeCheckerState, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(supertypesPolicy, "supertypesPolicy");
        TypeSystemContext typeSystemContext = typeCheckerState.getTypeSystemContext();
        if ((typeSystemContext.isClassType(type) && !typeSystemContext.isMarkedNullable(type)) || typeSystemContext.isDefinitelyNotNullType(type)) {
            return true;
        }
        typeCheckerState.initialize();
        ArrayDeque<SimpleTypeMarker> supertypesDeque = typeCheckerState.getSupertypesDeque();
        Intrinsics.checkNotNull(supertypesDeque);
        Set<SimpleTypeMarker> supertypesSet = typeCheckerState.getSupertypesSet();
        Intrinsics.checkNotNull(supertypesSet);
        supertypesDeque.push(type);
        while (!supertypesDeque.isEmpty()) {
            if (supertypesSet.size() > 1000) {
                StringBuilder sbD = k.d("Too many supertypes for type: ", type, ". Supertypes = ");
                sbD.append(CollectionsKt___CollectionsKt.joinToString$default(supertypesSet, null, null, null, 0, null, null, 63, null));
                throw new IllegalStateException(sbD.toString().toString());
            }
            SimpleTypeMarker simpleTypeMarkerPop = supertypesDeque.pop();
            Intrinsics.checkNotNull(simpleTypeMarkerPop);
            if (supertypesSet.add(simpleTypeMarkerPop)) {
                TypeCheckerState.SupertypesPolicy supertypesPolicy2 = typeSystemContext.isMarkedNullable(simpleTypeMarkerPop) ? TypeCheckerState.SupertypesPolicy.None.INSTANCE : supertypesPolicy;
                if (!(!Intrinsics.areEqual(supertypesPolicy2, TypeCheckerState.SupertypesPolicy.None.INSTANCE))) {
                    supertypesPolicy2 = null;
                }
                if (supertypesPolicy2 == null) {
                    continue;
                } else {
                    TypeSystemContext typeSystemContext2 = typeCheckerState.getTypeSystemContext();
                    Iterator<KotlinTypeMarker> it = typeSystemContext2.supertypes(typeSystemContext2.typeConstructor(simpleTypeMarkerPop)).iterator();
                    while (it.hasNext()) {
                        SimpleTypeMarker simpleTypeMarkerMo5781transformType = supertypesPolicy2.mo5781transformType(typeCheckerState, it.next());
                        if ((typeSystemContext.isClassType(simpleTypeMarkerMo5781transformType) && !typeSystemContext.isMarkedNullable(simpleTypeMarkerMo5781transformType)) || typeSystemContext.isDefinitelyNotNullType(simpleTypeMarkerMo5781transformType)) {
                            typeCheckerState.clear();
                            return true;
                        }
                        supertypesDeque.add(simpleTypeMarkerMo5781transformType);
                    }
                }
            }
        }
        typeCheckerState.clear();
        return false;
    }

    public final boolean hasPathByNotMarkedNullableNodes(@NotNull TypeCheckerState state, @NotNull SimpleTypeMarker start, @NotNull TypeConstructorMarker end) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        TypeSystemContext typeSystemContext = state.getTypeSystemContext();
        INSTANCE.getClass();
        if (a(state, start, end)) {
            return true;
        }
        state.initialize();
        ArrayDeque<SimpleTypeMarker> supertypesDeque = state.getSupertypesDeque();
        Intrinsics.checkNotNull(supertypesDeque);
        Set<SimpleTypeMarker> supertypesSet = state.getSupertypesSet();
        Intrinsics.checkNotNull(supertypesSet);
        supertypesDeque.push(start);
        while (!supertypesDeque.isEmpty()) {
            if (supertypesSet.size() > 1000) {
                StringBuilder sbD = k.d("Too many supertypes for type: ", start, ". Supertypes = ");
                sbD.append(CollectionsKt___CollectionsKt.joinToString$default(supertypesSet, null, null, null, 0, null, null, 63, null));
                throw new IllegalStateException(sbD.toString().toString());
            }
            SimpleTypeMarker simpleTypeMarkerPop = supertypesDeque.pop();
            Intrinsics.checkNotNull(simpleTypeMarkerPop);
            if (supertypesSet.add(simpleTypeMarkerPop)) {
                TypeCheckerState.SupertypesPolicy supertypesPolicy = typeSystemContext.isMarkedNullable(simpleTypeMarkerPop) ? TypeCheckerState.SupertypesPolicy.None.INSTANCE : TypeCheckerState.SupertypesPolicy.LowerIfFlexible.INSTANCE;
                if (!(!Intrinsics.areEqual(supertypesPolicy, TypeCheckerState.SupertypesPolicy.None.INSTANCE))) {
                    supertypesPolicy = null;
                }
                if (supertypesPolicy == null) {
                    continue;
                } else {
                    TypeSystemContext typeSystemContext2 = state.getTypeSystemContext();
                    Iterator<KotlinTypeMarker> it = typeSystemContext2.supertypes(typeSystemContext2.typeConstructor(simpleTypeMarkerPop)).iterator();
                    while (it.hasNext()) {
                        SimpleTypeMarker simpleTypeMarkerMo5781transformType = supertypesPolicy.mo5781transformType(state, it.next());
                        INSTANCE.getClass();
                        if (a(state, simpleTypeMarkerMo5781transformType, end)) {
                            state.clear();
                            return true;
                        }
                        supertypesDeque.add(simpleTypeMarkerMo5781transformType);
                    }
                }
            }
        }
        state.clear();
        return false;
    }

    public final boolean isPossibleSubtype(@NotNull TypeCheckerState state, @NotNull SimpleTypeMarker subType, @NotNull SimpleTypeMarker superType) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(subType, "subType");
        Intrinsics.checkNotNullParameter(superType, "superType");
        TypeSystemContext typeSystemContext = state.getTypeSystemContext();
        if (AbstractTypeChecker.RUN_SLOW_ASSERTIONS) {
            if (!typeSystemContext.isSingleClassifierType(subType) && !typeSystemContext.isIntersection(typeSystemContext.typeConstructor(subType))) {
                state.isAllowedTypeVariable(subType);
            }
            if (!typeSystemContext.isSingleClassifierType(superType)) {
                state.isAllowedTypeVariable(superType);
            }
        }
        if (typeSystemContext.isMarkedNullable(superType) || typeSystemContext.isDefinitelyNotNullType(subType) || typeSystemContext.isNotNullTypeParameter(subType)) {
            return true;
        }
        if ((subType instanceof CapturedTypeMarker) && typeSystemContext.isProjectionNotNull((CapturedTypeMarker) subType)) {
            return true;
        }
        AbstractNullabilityChecker abstractNullabilityChecker = INSTANCE;
        if (abstractNullabilityChecker.hasNotNullSupertype(state, subType, TypeCheckerState.SupertypesPolicy.LowerIfFlexible.INSTANCE)) {
            return true;
        }
        if (typeSystemContext.isDefinitelyNotNullType(superType) || abstractNullabilityChecker.hasNotNullSupertype(state, superType, TypeCheckerState.SupertypesPolicy.UpperIfFlexible.INSTANCE) || typeSystemContext.isClassType(subType)) {
            return false;
        }
        return abstractNullabilityChecker.hasPathByNotMarkedNullableNodes(state, subType, typeSystemContext.typeConstructor(superType));
    }
}
