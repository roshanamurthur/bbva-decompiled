package kotlin.reflect.jvm.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KType;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: typeOfImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0018\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000\u001a\u0010\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\u0000\u001a\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\u0000¨\u0006\u0007"}, d2 = {"Lkotlin/reflect/KType;", "lowerBound", "upperBound", "createPlatformKType", "type", "createMutableCollectionKType", "createNothingType", "kotlin-reflection"}, k = 2, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\ntypeOfImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 typeOfImpl.kt\nkotlin/reflect/jvm/internal/TypeOfImplKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,51:1\n1#2:52\n*E\n"})
public final class TypeOfImplKt {
    @NotNull
    public static final KType createMutableCollectionKType(@NotNull KType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        KotlinType f80013p0 = ((KTypeImpl) type).getF80013p0();
        if (!(f80013p0 instanceof SimpleType)) {
            throw new IllegalArgumentException(("Non-simple type cannot be a mutable collection type: " + type).toString());
        }
        ClassifierDescriptor classifierDescriptorMo5778getDeclarationDescriptor = f80013p0.getConstructor().mo5778getDeclarationDescriptor();
        ClassDescriptor classDescriptor = classifierDescriptorMo5778getDeclarationDescriptor instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo5778getDeclarationDescriptor : null;
        if (classDescriptor == null) {
            throw new IllegalArgumentException("Non-class type cannot be a mutable collection type: " + type);
        }
        SimpleType simpleType = (SimpleType) f80013p0;
        FqName onlyToMutable = JavaToKotlinClassMap.INSTANCE.readOnlyToMutable(DescriptorUtilsKt.getFqNameUnsafe(classDescriptor));
        if (onlyToMutable == null) {
            throw new IllegalArgumentException("Not a readonly collection: " + classDescriptor);
        }
        ClassDescriptor builtInClassByFqName = DescriptorUtilsKt.getBuiltIns(classDescriptor).getBuiltInClassByFqName(onlyToMutable);
        Intrinsics.checkNotNullExpressionValue(builtInClassByFqName, "getBuiltInClassByFqName(...)");
        TypeConstructor typeConstructor = builtInClassByFqName.getTypeConstructor();
        Intrinsics.checkNotNullExpressionValue(typeConstructor, "getTypeConstructor(...)");
        return new KTypeImpl(KotlinTypeFactory.simpleType$default(simpleType, (TypeAttributes) null, typeConstructor, (List) null, false, 26, (Object) null), null, 2, null);
    }

    @NotNull
    public static final KType createNothingType(@NotNull KType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        KotlinType f80013p0 = ((KTypeImpl) type).getF80013p0();
        if (!(f80013p0 instanceof SimpleType)) {
            throw new IllegalArgumentException(("Non-simple type cannot be a Nothing type: " + type).toString());
        }
        SimpleType simpleType = (SimpleType) f80013p0;
        TypeConstructor typeConstructor = TypeUtilsKt.getBuiltIns(f80013p0).getNothing().getTypeConstructor();
        Intrinsics.checkNotNullExpressionValue(typeConstructor, "getTypeConstructor(...)");
        return new KTypeImpl(KotlinTypeFactory.simpleType$default(simpleType, (TypeAttributes) null, typeConstructor, (List) null, false, 26, (Object) null), null, 2, null);
    }

    @NotNull
    public static final KType createPlatformKType(@NotNull KType lowerBound, @NotNull KType upperBound) {
        Intrinsics.checkNotNullParameter(lowerBound, "lowerBound");
        Intrinsics.checkNotNullParameter(upperBound, "upperBound");
        KotlinType f80013p0 = ((KTypeImpl) lowerBound).getF80013p0();
        Intrinsics.checkNotNull(f80013p0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        KotlinType f80013p1 = ((KTypeImpl) upperBound).getF80013p0();
        Intrinsics.checkNotNull(f80013p1, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new KTypeImpl(KotlinTypeFactory.flexibleType((SimpleType) f80013p0, (SimpleType) f80013p1), null, 2, null);
    }
}
