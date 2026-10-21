package kotlin.reflect.jvm.internal.impl.types;

import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: expandedTypeUtils.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class ExpandedTypeUtilsKt {
    public static final KotlinTypeMarker a(TypeSystemCommonBackendContext typeSystemCommonBackendContext, KotlinTypeMarker kotlinTypeMarker, HashSet<TypeConstructorMarker> hashSet) {
        KotlinTypeMarker kotlinTypeMarkerA;
        KotlinTypeMarker kotlinTypeMarkerMakeNullable;
        TypeConstructorMarker typeConstructorMarkerTypeConstructor = typeSystemCommonBackendContext.typeConstructor(kotlinTypeMarker);
        if (!hashSet.add(typeConstructorMarkerTypeConstructor)) {
            return null;
        }
        TypeParameterMarker typeParameterClassifier = typeSystemCommonBackendContext.getTypeParameterClassifier(typeConstructorMarkerTypeConstructor);
        if (typeParameterClassifier != null) {
            KotlinTypeMarker representativeUpperBound = typeSystemCommonBackendContext.getRepresentativeUpperBound(typeParameterClassifier);
            kotlinTypeMarkerA = a(typeSystemCommonBackendContext, representativeUpperBound, hashSet);
            if (kotlinTypeMarkerA == null) {
                return null;
            }
            boolean z10 = typeSystemCommonBackendContext.isInlineClass(typeSystemCommonBackendContext.typeConstructor(representativeUpperBound)) || ((representativeUpperBound instanceof SimpleTypeMarker) && typeSystemCommonBackendContext.isPrimitiveType((SimpleTypeMarker) representativeUpperBound));
            if ((kotlinTypeMarkerA instanceof SimpleTypeMarker) && typeSystemCommonBackendContext.isPrimitiveType((SimpleTypeMarker) kotlinTypeMarkerA) && typeSystemCommonBackendContext.isNullableType(kotlinTypeMarker) && z10) {
                kotlinTypeMarkerMakeNullable = typeSystemCommonBackendContext.makeNullable(representativeUpperBound);
            } else if (!typeSystemCommonBackendContext.isNullableType(kotlinTypeMarkerA) && typeSystemCommonBackendContext.isMarkedNullable(kotlinTypeMarker)) {
                kotlinTypeMarkerMakeNullable = typeSystemCommonBackendContext.makeNullable(kotlinTypeMarkerA);
            }
            return kotlinTypeMarkerMakeNullable;
        }
        if (!typeSystemCommonBackendContext.isInlineClass(typeConstructorMarkerTypeConstructor)) {
            return kotlinTypeMarker;
        }
        KotlinTypeMarker unsubstitutedUnderlyingType = typeSystemCommonBackendContext.getUnsubstitutedUnderlyingType(kotlinTypeMarker);
        if (unsubstitutedUnderlyingType == null || (kotlinTypeMarkerA = a(typeSystemCommonBackendContext, unsubstitutedUnderlyingType, hashSet)) == null) {
            return null;
        }
        if (typeSystemCommonBackendContext.isNullableType(kotlinTypeMarker)) {
            if (typeSystemCommonBackendContext.isNullableType(kotlinTypeMarkerA)) {
                return kotlinTypeMarker;
            }
            return ((kotlinTypeMarkerA instanceof SimpleTypeMarker) && typeSystemCommonBackendContext.isPrimitiveType((SimpleTypeMarker) kotlinTypeMarkerA)) ? kotlinTypeMarker : typeSystemCommonBackendContext.makeNullable(kotlinTypeMarkerA);
        }
        return kotlinTypeMarkerA;
    }

    @Nullable
    public static final KotlinTypeMarker computeExpandedTypeForInlineClass(@NotNull TypeSystemCommonBackendContext typeSystemCommonBackendContext, @NotNull KotlinTypeMarker inlineClassType) {
        Intrinsics.checkNotNullParameter(typeSystemCommonBackendContext, "<this>");
        Intrinsics.checkNotNullParameter(inlineClassType, "inlineClassType");
        return a(typeSystemCommonBackendContext, inlineClassType, new HashSet());
    }
}
