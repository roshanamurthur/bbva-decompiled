package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMapper;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.checker.SimpleClassicTypeSystemContext;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: typeEnhancement.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class TypeEnhancementKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final al.b f80841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final al.b f80842b;

    /* JADX INFO: compiled from: typeEnhancement.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NullabilityQualifier.values().length];
            try {
                iArr[NullabilityQualifier.NULLABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NullabilityQualifier.NOT_NULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        FqName ENHANCED_NULLABILITY_ANNOTATION = JvmAnnotationNames.ENHANCED_NULLABILITY_ANNOTATION;
        Intrinsics.checkNotNullExpressionValue(ENHANCED_NULLABILITY_ANNOTATION, "ENHANCED_NULLABILITY_ANNOTATION");
        f80841a = new al.b(ENHANCED_NULLABILITY_ANNOTATION);
        FqName ENHANCED_MUTABILITY_ANNOTATION = JvmAnnotationNames.ENHANCED_MUTABILITY_ANNOTATION;
        Intrinsics.checkNotNullExpressionValue(ENHANCED_MUTABILITY_ANNOTATION, "ENHANCED_MUTABILITY_ANNOTATION");
        f80842b = new al.b(ENHANCED_MUTABILITY_ANNOTATION);
    }

    public static final Annotations access$compositeAnnotationsOrSingle(List list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? new CompositeAnnotations((List<? extends Annotations>) CollectionsKt___CollectionsKt.toList(list)) : (Annotations) CollectionsKt___CollectionsKt.single(list);
        }
        throw new IllegalStateException("At least one Annotations object expected".toString());
    }

    public static final ClassifierDescriptor access$enhanceMutability(ClassifierDescriptor classifierDescriptor, JavaTypeQualifiers javaTypeQualifiers, TypeComponentPosition typeComponentPosition) {
        JavaToKotlinClassMapper javaToKotlinClassMapper = JavaToKotlinClassMapper.INSTANCE;
        if (!TypeComponentPositionKt.shouldEnhance(typeComponentPosition) || !(classifierDescriptor instanceof ClassDescriptor)) {
            return null;
        }
        if (javaTypeQualifiers.getMutability() == MutabilityQualifier.READ_ONLY && typeComponentPosition == TypeComponentPosition.FLEXIBLE_LOWER) {
            ClassDescriptor classDescriptor = (ClassDescriptor) classifierDescriptor;
            if (javaToKotlinClassMapper.isMutable(classDescriptor)) {
                return javaToKotlinClassMapper.convertMutableToReadOnly(classDescriptor);
            }
        }
        if (javaTypeQualifiers.getMutability() != MutabilityQualifier.MUTABLE || typeComponentPosition != TypeComponentPosition.FLEXIBLE_UPPER) {
            return null;
        }
        ClassDescriptor classDescriptor2 = (ClassDescriptor) classifierDescriptor;
        if (javaToKotlinClassMapper.isReadOnly(classDescriptor2)) {
            return javaToKotlinClassMapper.convertReadOnlyToMutable(classDescriptor2);
        }
        return null;
    }

    public static final Boolean access$getEnhancedNullability(JavaTypeQualifiers javaTypeQualifiers, TypeComponentPosition typeComponentPosition) {
        if (!TypeComponentPositionKt.shouldEnhance(typeComponentPosition)) {
            return null;
        }
        NullabilityQualifier nullability = javaTypeQualifiers.getNullability();
        int i10 = nullability == null ? -1 : WhenMappings.$EnumSwitchMapping$0[nullability.ordinal()];
        if (i10 == 1) {
            return Boolean.TRUE;
        }
        if (i10 != 2) {
            return null;
        }
        return Boolean.FALSE;
    }

    @NotNull
    public static final Annotations getENHANCED_NULLABILITY_ANNOTATIONS() {
        return f80841a;
    }

    public static final boolean hasEnhancedNullability(@NotNull KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        return TypeEnhancementUtilsKt.hasEnhancedNullability(SimpleClassicTypeSystemContext.INSTANCE, kotlinType);
    }
}
