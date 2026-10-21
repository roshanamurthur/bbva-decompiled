package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementUtilsKt;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: typeSignatureMapping.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\ntypeSignatureMapping.kt\nKotlin\n*S Kotlin\n*F\n+ 1 typeSignatureMapping.kt\norg/jetbrains/kotlin/load/kotlin/TypeSignatureMappingKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,103:1\n1#2:104\n1747#3,3:105\n*S KotlinDebug\n*F\n+ 1 typeSignatureMapping.kt\norg/jetbrains/kotlin/load/kotlin/TypeSignatureMappingKt\n*L\n55#1:105,3\n*E\n"})
public final class TypeSignatureMappingKt {
    @NotNull
    public static final <T> T boxTypeIfNeeded(@NotNull JvmTypeFactory<T> jvmTypeFactory, @NotNull T possiblyPrimitiveType, boolean z10) {
        Intrinsics.checkNotNullParameter(jvmTypeFactory, "<this>");
        Intrinsics.checkNotNullParameter(possiblyPrimitiveType, "possiblyPrimitiveType");
        return z10 ? jvmTypeFactory.boxType(possiblyPrimitiveType) : possiblyPrimitiveType;
    }

    @Nullable
    public static final <T> T mapBuiltInType(@NotNull TypeSystemCommonBackendContext typeSystemCommonBackendContext, @NotNull KotlinTypeMarker type, @NotNull JvmTypeFactory<T> typeFactory, @NotNull TypeMappingMode mode) {
        Intrinsics.checkNotNullParameter(typeSystemCommonBackendContext, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(typeFactory, "typeFactory");
        Intrinsics.checkNotNullParameter(mode, "mode");
        TypeConstructorMarker typeConstructorMarkerTypeConstructor = typeSystemCommonBackendContext.typeConstructor(type);
        if (!typeSystemCommonBackendContext.isClassTypeConstructor(typeConstructorMarkerTypeConstructor)) {
            return null;
        }
        PrimitiveType primitiveType = typeSystemCommonBackendContext.getPrimitiveType(typeConstructorMarkerTypeConstructor);
        if (primitiveType != null) {
            return (T) boxTypeIfNeeded(typeFactory, typeFactory.createPrimitiveType(primitiveType), typeSystemCommonBackendContext.isNullableType(type) || TypeEnhancementUtilsKt.hasEnhancedNullability(typeSystemCommonBackendContext, type));
        }
        PrimitiveType primitiveArrayType = typeSystemCommonBackendContext.getPrimitiveArrayType(typeConstructorMarkerTypeConstructor);
        if (primitiveArrayType != null) {
            return typeFactory.createFromString(Constant.BRACKET_OPEN + JvmPrimitiveType.get(primitiveArrayType).getDesc());
        }
        if (typeSystemCommonBackendContext.isUnderKotlinPackage(typeConstructorMarkerTypeConstructor)) {
            FqNameUnsafe classFqNameUnsafe = typeSystemCommonBackendContext.getClassFqNameUnsafe(typeConstructorMarkerTypeConstructor);
            ClassId classIdMapKotlinToJava = classFqNameUnsafe != null ? JavaToKotlinClassMap.INSTANCE.mapKotlinToJava(classFqNameUnsafe) : null;
            if (classIdMapKotlinToJava != null) {
                if (!mode.getKotlinCollectionsToJavaCollections()) {
                    List<JavaToKotlinClassMap.PlatformMutabilityMapping> mutabilityMappings = JavaToKotlinClassMap.INSTANCE.getMutabilityMappings();
                    if (!(mutabilityMappings instanceof Collection) || !mutabilityMappings.isEmpty()) {
                        Iterator<T> it = mutabilityMappings.iterator();
                        while (it.hasNext()) {
                            if (Intrinsics.areEqual(((JavaToKotlinClassMap.PlatformMutabilityMapping) it.next()).getJavaClass(), classIdMapKotlinToJava)) {
                                return null;
                            }
                        }
                    }
                }
                String internalName = JvmClassName.byClassId(classIdMapKotlinToJava).getInternalName();
                Intrinsics.checkNotNullExpressionValue(internalName, "getInternalName(...)");
                return typeFactory.createObjectType(internalName);
            }
        }
        return null;
    }
}
