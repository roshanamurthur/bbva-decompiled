package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AbstractStrictEqualityTypeChecker.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class AbstractStrictEqualityTypeChecker {

    @NotNull
    public static final AbstractStrictEqualityTypeChecker INSTANCE = new AbstractStrictEqualityTypeChecker();

    public static boolean a(TypeSystemContext typeSystemContext, SimpleTypeMarker simpleTypeMarker, SimpleTypeMarker simpleTypeMarker2) {
        if (typeSystemContext.argumentsCount(simpleTypeMarker) == typeSystemContext.argumentsCount(simpleTypeMarker2) && typeSystemContext.isMarkedNullable(simpleTypeMarker) == typeSystemContext.isMarkedNullable(simpleTypeMarker2)) {
            if ((typeSystemContext.asDefinitelyNotNullType(simpleTypeMarker) == null) == (typeSystemContext.asDefinitelyNotNullType(simpleTypeMarker2) == null) && typeSystemContext.areEqualTypeConstructors(typeSystemContext.typeConstructor(simpleTypeMarker), typeSystemContext.typeConstructor(simpleTypeMarker2))) {
                if (typeSystemContext.identicalArguments(simpleTypeMarker, simpleTypeMarker2)) {
                    return true;
                }
                int iArgumentsCount = typeSystemContext.argumentsCount(simpleTypeMarker);
                for (int i10 = 0; i10 < iArgumentsCount; i10++) {
                    TypeArgumentMarker argument = typeSystemContext.getArgument(simpleTypeMarker, i10);
                    TypeArgumentMarker argument2 = typeSystemContext.getArgument(simpleTypeMarker2, i10);
                    if (typeSystemContext.isStarProjection(argument) != typeSystemContext.isStarProjection(argument2)) {
                        return false;
                    }
                    if (!typeSystemContext.isStarProjection(argument) && (typeSystemContext.getVariance(argument) != typeSystemContext.getVariance(argument2) || !b(typeSystemContext, typeSystemContext.getType(argument), typeSystemContext.getType(argument2)))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static boolean b(TypeSystemContext typeSystemContext, KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2) {
        if (kotlinTypeMarker == kotlinTypeMarker2) {
            return true;
        }
        SimpleTypeMarker simpleTypeMarkerAsSimpleType = typeSystemContext.asSimpleType(kotlinTypeMarker);
        SimpleTypeMarker simpleTypeMarkerAsSimpleType2 = typeSystemContext.asSimpleType(kotlinTypeMarker2);
        if (simpleTypeMarkerAsSimpleType != null && simpleTypeMarkerAsSimpleType2 != null) {
            return a(typeSystemContext, simpleTypeMarkerAsSimpleType, simpleTypeMarkerAsSimpleType2);
        }
        FlexibleTypeMarker flexibleTypeMarkerAsFlexibleType = typeSystemContext.asFlexibleType(kotlinTypeMarker);
        FlexibleTypeMarker flexibleTypeMarkerAsFlexibleType2 = typeSystemContext.asFlexibleType(kotlinTypeMarker2);
        if (flexibleTypeMarkerAsFlexibleType == null || flexibleTypeMarkerAsFlexibleType2 == null) {
            return false;
        }
        return a(typeSystemContext, typeSystemContext.lowerBound(flexibleTypeMarkerAsFlexibleType), typeSystemContext.lowerBound(flexibleTypeMarkerAsFlexibleType2)) && a(typeSystemContext, typeSystemContext.upperBound(flexibleTypeMarkerAsFlexibleType), typeSystemContext.upperBound(flexibleTypeMarkerAsFlexibleType2));
    }

    public final boolean strictEqualTypes(@NotNull TypeSystemContext context, @NotNull KotlinTypeMarker a10, @NotNull KotlinTypeMarker b10) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return b(context, a10, b10);
    }
}
