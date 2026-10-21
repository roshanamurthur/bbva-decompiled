package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import bk.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMapper;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.UtilsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifier;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPrimitiveType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypesKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.LazyWrappedType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zk.a;

/* JADX INFO: compiled from: JavaTypeResolver.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nJavaTypeResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JavaTypeResolver.kt\norg/jetbrains/kotlin/load/java/lazy/types/JavaTypeResolver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 coreLib.kt\norg/jetbrains/kotlin/utils/CoreLibKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,321:1\n1#2:322\n19#3:323\n1549#4:324\n1620#4,3:325\n1549#4:328\n1620#4,3:329\n1549#4:332\n1620#4,3:333\n*S KotlinDebug\n*F\n+ 1 JavaTypeResolver.kt\norg/jetbrains/kotlin/load/java/lazy/types/JavaTypeResolver\n*L\n144#1:323\n205#1:324\n205#1:325,3\n263#1:328\n263#1:329,3\n267#1:332\n267#1:333,3\n*E\n"})
public final class JavaTypeResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LazyJavaResolverContext f80758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final TypeParameterResolver f80759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final RawProjectionComputer f80760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final TypeParameterUpperBoundEraser f80761d;

    /* JADX WARN: Multi-variable type inference failed */
    public JavaTypeResolver(@NotNull LazyJavaResolverContext c10, @NotNull TypeParameterResolver typeParameterResolver) {
        Intrinsics.checkNotNullParameter(c10, "c");
        Intrinsics.checkNotNullParameter(typeParameterResolver, "typeParameterResolver");
        this.f80758a = c10;
        this.f80759b = typeParameterResolver;
        RawProjectionComputer rawProjectionComputer = new RawProjectionComputer();
        this.f80760c = rawProjectionComputer;
        this.f80761d = new TypeParameterUpperBoundEraser(rawProjectionComputer, null, 2, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ KotlinType transformArrayType$default(JavaTypeResolver javaTypeResolver, JavaArrayType javaArrayType, JavaTypeAttributes javaTypeAttributes, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return javaTypeResolver.transformArrayType(javaArrayType, javaTypeAttributes, z10);
    }

    /* JADX WARN: Code duplicated, block: B:85:0x0168  */
    public final SimpleType a(JavaClassifierType javaClassifierType, JavaTypeAttributes javaTypeAttributes, SimpleType simpleType) {
        TypeAttributes defaultAttributes;
        TypeConstructor typeConstructor;
        ClassDescriptor classDescriptorConvertReadOnlyToMutable;
        Variance variance;
        boolean z10;
        List list;
        TypeProjection typeProjectionImpl;
        List list2;
        if (simpleType == null || (defaultAttributes = simpleType.getAttributes()) == null) {
            defaultAttributes = TypeAttributesKt.toDefaultAttributes(new LazyJavaAnnotations(this.f80758a, javaClassifierType, false, 4, null));
        }
        TypeAttributes typeAttributes = defaultAttributes;
        JavaClassifier classifier = javaClassifierType.getClassifier();
        LazyJavaResolverContext lazyJavaResolverContext = this.f80758a;
        TypeConstructor typeConstructor2 = null;
        if (classifier == null) {
            typeConstructor = b(javaClassifierType);
        } else if (classifier instanceof JavaClass) {
            JavaClass javaClass = (JavaClass) classifier;
            FqName fqName = javaClass.getFqName();
            if (fqName == null) {
                throw new AssertionError("Class type should have a FQ name: " + classifier);
            }
            if (javaTypeAttributes.isForAnnotationParameter() && Intrinsics.areEqual(fqName, JavaTypeResolverKt.f80762a)) {
                classDescriptorConvertReadOnlyToMutable = lazyJavaResolverContext.getComponents().getReflectionTypes().getKClass();
            } else {
                JavaToKotlinClassMapper javaToKotlinClassMapper = JavaToKotlinClassMapper.INSTANCE;
                ClassDescriptor classDescriptorMapJavaToKotlin$default = JavaToKotlinClassMapper.mapJavaToKotlin$default(javaToKotlinClassMapper, fqName, lazyJavaResolverContext.getModule().getBuiltIns(), null, 4, null);
                if (classDescriptorMapJavaToKotlin$default == null) {
                    classDescriptorConvertReadOnlyToMutable = null;
                } else if (javaToKotlinClassMapper.isReadOnly(classDescriptorMapJavaToKotlin$default)) {
                    if (javaTypeAttributes.getFlexibility() != JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND && javaTypeAttributes.getHowThisTypeIsUsed() != TypeUsage.SUPERTYPE) {
                        if (JavaTypesKt.isSuperWildcard((JavaType) CollectionsKt___CollectionsKt.lastOrNull((List) javaClassifierType.getTypeArguments()))) {
                            List<TypeParameterDescriptor> parameters = javaToKotlinClassMapper.convertReadOnlyToMutable(classDescriptorMapJavaToKotlin$default).getTypeConstructor().getParameters();
                            Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
                            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) CollectionsKt___CollectionsKt.lastOrNull((List) parameters);
                            if (typeParameterDescriptor == null || (variance = typeParameterDescriptor.getVariance()) == null || variance == Variance.OUT_VARIANCE) {
                            }
                        }
                        classDescriptorConvertReadOnlyToMutable = classDescriptorMapJavaToKotlin$default;
                    }
                    classDescriptorConvertReadOnlyToMutable = javaToKotlinClassMapper.convertReadOnlyToMutable(classDescriptorMapJavaToKotlin$default);
                } else {
                    classDescriptorConvertReadOnlyToMutable = classDescriptorMapJavaToKotlin$default;
                }
            }
            if (classDescriptorConvertReadOnlyToMutable == null) {
                classDescriptorConvertReadOnlyToMutable = lazyJavaResolverContext.getComponents().getModuleClassResolver().resolveClass(javaClass);
            }
            if (classDescriptorConvertReadOnlyToMutable == null || (typeConstructor = classDescriptorConvertReadOnlyToMutable.getTypeConstructor()) == null) {
                typeConstructor = b(javaClassifierType);
            }
        } else {
            if (!(classifier instanceof JavaTypeParameter)) {
                throw new IllegalStateException("Unknown classifier kind: " + classifier);
            }
            TypeParameterDescriptor typeParameterDescriptorResolveTypeParameter = this.f80759b.resolveTypeParameter((JavaTypeParameter) classifier);
            typeConstructor = typeParameterDescriptorResolveTypeParameter != null ? typeParameterDescriptorResolveTypeParameter.getTypeConstructor() : null;
        }
        TypeConstructor typeConstructor3 = typeConstructor;
        if (typeConstructor3 == null) {
            return null;
        }
        boolean z11 = false;
        boolean z12 = javaTypeAttributes.getFlexibility() == JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND ? false : (javaTypeAttributes.isForAnnotationParameter() || javaTypeAttributes.getHowThisTypeIsUsed() == TypeUsage.SUPERTYPE) ? false : true;
        if (Intrinsics.areEqual(simpleType != null ? simpleType.getConstructor() : null, typeConstructor3) && !javaClassifierType.isRaw() && z12) {
            return simpleType.makeNullableAsSpecified(true);
        }
        if (javaClassifierType.isRaw()) {
            z11 = true;
        } else if (javaClassifierType.getTypeArguments().isEmpty()) {
            List<TypeParameterDescriptor> parameters2 = typeConstructor3.getParameters();
            Intrinsics.checkNotNullExpressionValue(parameters2, "getParameters(...)");
            if (!parameters2.isEmpty()) {
                z11 = true;
            }
        }
        List<TypeParameterDescriptor> parameters3 = typeConstructor3.getParameters();
        Intrinsics.checkNotNullExpressionValue(parameters3, "getParameters(...)");
        if (z11) {
            List<TypeParameterDescriptor> list3 = parameters3;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                TypeParameterDescriptor typeParameterDescriptor2 = (TypeParameterDescriptor) it.next();
                arrayList.add(TypeUtilsKt.hasTypeParameterRecursiveBounds(typeParameterDescriptor2, typeConstructor2, javaTypeAttributes.getVisitedTypeParameters()) ? TypeUtils.makeStarProjection(typeParameterDescriptor2, javaTypeAttributes) : this.f80760c.computeProjection(typeParameterDescriptor2, javaTypeAttributes.markIsRaw(javaClassifierType.isRaw()), this.f80761d, new LazyWrappedType(lazyJavaResolverContext.getStorageManager(), new a(this, typeParameterDescriptor2, javaTypeAttributes, typeConstructor3, javaClassifierType))));
                it = it;
                z12 = z12;
                typeConstructor2 = null;
            }
            z10 = z12;
            list2 = arrayList;
        } else {
            z10 = z12;
            if (parameters3.size() != javaClassifierType.getTypeArguments().size()) {
                List<TypeParameterDescriptor> list4 = parameters3;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                for (TypeParameterDescriptor typeParameterDescriptor3 : list4) {
                    ErrorTypeKind errorTypeKind = ErrorTypeKind.MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER;
                    String strAsString = typeParameterDescriptor3.getName().asString();
                    Intrinsics.checkNotNullExpressionValue(strAsString, "asString(...)");
                    arrayList2.add(new TypeProjectionImpl(ErrorUtils.createErrorType(errorTypeKind, strAsString)));
                }
                list = CollectionsKt___CollectionsKt.toList(arrayList2);
            } else {
                Iterable<IndexedValue> iterableWithIndex = CollectionsKt___CollectionsKt.withIndex(javaClassifierType.getTypeArguments());
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterableWithIndex, 10));
                for (IndexedValue indexedValue : iterableWithIndex) {
                    int index = indexedValue.getIndex();
                    JavaType javaType = (JavaType) indexedValue.component2();
                    parameters3.size();
                    TypeParameterDescriptor typeParameterDescriptor4 = parameters3.get(index);
                    TypeUsage typeUsage = TypeUsage.COMMON;
                    JavaTypeAttributes attributes$default = JavaTypeAttributesKt.toAttributes$default(typeUsage, false, false, null, 7, null);
                    Intrinsics.checkNotNull(typeParameterDescriptor4);
                    if (javaType instanceof JavaWildcardType) {
                        JavaWildcardType javaWildcardType = (JavaWildcardType) javaType;
                        JavaType bound = javaWildcardType.getBound();
                        Variance variance2 = javaWildcardType.isExtends() ? Variance.OUT_VARIANCE : Variance.IN_VARIANCE;
                        if (bound == null || !(typeParameterDescriptor4.getVariance() == Variance.INVARIANT || variance2 == typeParameterDescriptor4.getVariance())) {
                            typeProjectionImpl = TypeUtils.makeStarProjection(typeParameterDescriptor4, attributes$default);
                        } else {
                            AnnotationDescriptor annotationDescriptorExtractNullabilityAnnotationOnBoundedWildcard = UtilsKt.extractNullabilityAnnotationOnBoundedWildcard(lazyJavaResolverContext, javaWildcardType);
                            KotlinType kotlinTypeTransformJavaType = transformJavaType(bound, JavaTypeAttributesKt.toAttributes$default(typeUsage, false, false, null, 7, null));
                            if (annotationDescriptorExtractNullabilityAnnotationOnBoundedWildcard != null) {
                                kotlinTypeTransformJavaType = TypeUtilsKt.replaceAnnotations(kotlinTypeTransformJavaType, Annotations.Companion.create(CollectionsKt___CollectionsKt.plus(kotlinTypeTransformJavaType.getAnnotations(), annotationDescriptorExtractNullabilityAnnotationOnBoundedWildcard)));
                            }
                            typeProjectionImpl = TypeUtilsKt.createProjection(kotlinTypeTransformJavaType, variance2, typeParameterDescriptor4);
                        }
                        Intrinsics.checkNotNull(typeProjectionImpl);
                    } else {
                        typeProjectionImpl = new TypeProjectionImpl(Variance.INVARIANT, transformJavaType(javaType, attributes$default));
                    }
                    arrayList3.add(typeProjectionImpl);
                }
                list = CollectionsKt___CollectionsKt.toList(arrayList3);
            }
            list2 = list;
        }
        return KotlinTypeFactory.simpleType$default(typeAttributes, typeConstructor3, list2, z10, (KotlinTypeRefiner) null, 16, (Object) null);
    }

    public final TypeConstructor b(JavaClassifierType javaClassifierType) {
        ClassId classId = ClassId.topLevel(new FqName(javaClassifierType.getClassifierQualifiedName()));
        Intrinsics.checkNotNullExpressionValue(classId, "topLevel(...)");
        TypeConstructor typeConstructor = this.f80758a.getComponents().getDeserializedDescriptorResolver().getComponents().getNotFoundClasses().getClass(classId, d.listOf(0)).getTypeConstructor();
        Intrinsics.checkNotNullExpressionValue(typeConstructor, "getTypeConstructor(...)");
        return typeConstructor;
    }

    @NotNull
    public final KotlinType transformArrayType(@NotNull JavaArrayType arrayType, @NotNull JavaTypeAttributes attr, boolean z10) {
        Intrinsics.checkNotNullParameter(arrayType, "arrayType");
        Intrinsics.checkNotNullParameter(attr, "attr");
        JavaType componentType = arrayType.getComponentType();
        JavaPrimitiveType javaPrimitiveType = componentType instanceof JavaPrimitiveType ? (JavaPrimitiveType) componentType : null;
        PrimitiveType type = javaPrimitiveType != null ? javaPrimitiveType.getType() : null;
        LazyJavaResolverContext lazyJavaResolverContext = this.f80758a;
        LazyJavaAnnotations lazyJavaAnnotations = new LazyJavaAnnotations(lazyJavaResolverContext, arrayType, true);
        if (type != null) {
            SimpleType primitiveArrayKotlinType = lazyJavaResolverContext.getModule().getBuiltIns().getPrimitiveArrayKotlinType(type);
            Intrinsics.checkNotNull(primitiveArrayKotlinType);
            KotlinType kotlinTypeReplaceAnnotations = TypeUtilsKt.replaceAnnotations(primitiveArrayKotlinType, new CompositeAnnotations(primitiveArrayKotlinType.getAnnotations(), lazyJavaAnnotations));
            Intrinsics.checkNotNull(kotlinTypeReplaceAnnotations, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
            SimpleType simpleType = (SimpleType) kotlinTypeReplaceAnnotations;
            return attr.isForAnnotationParameter() ? simpleType : KotlinTypeFactory.flexibleType(simpleType, simpleType.makeNullableAsSpecified(true));
        }
        KotlinType kotlinTypeTransformJavaType = transformJavaType(componentType, JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, attr.isForAnnotationParameter(), false, null, 6, null));
        if (attr.isForAnnotationParameter()) {
            SimpleType arrayType2 = lazyJavaResolverContext.getModule().getBuiltIns().getArrayType(z10 ? Variance.OUT_VARIANCE : Variance.INVARIANT, kotlinTypeTransformJavaType, lazyJavaAnnotations);
            Intrinsics.checkNotNullExpressionValue(arrayType2, "getArrayType(...)");
            return arrayType2;
        }
        SimpleType arrayType3 = lazyJavaResolverContext.getModule().getBuiltIns().getArrayType(Variance.INVARIANT, kotlinTypeTransformJavaType, lazyJavaAnnotations);
        Intrinsics.checkNotNullExpressionValue(arrayType3, "getArrayType(...)");
        return KotlinTypeFactory.flexibleType(arrayType3, lazyJavaResolverContext.getModule().getBuiltIns().getArrayType(Variance.OUT_VARIANCE, kotlinTypeTransformJavaType, lazyJavaAnnotations).makeNullableAsSpecified(true));
    }

    @NotNull
    public final KotlinType transformJavaType(@Nullable JavaType javaType, @NotNull JavaTypeAttributes attr) {
        KotlinType kotlinTypeTransformJavaType;
        Intrinsics.checkNotNullParameter(attr, "attr");
        boolean z10 = javaType instanceof JavaPrimitiveType;
        LazyJavaResolverContext lazyJavaResolverContext = this.f80758a;
        if (z10) {
            PrimitiveType type = ((JavaPrimitiveType) javaType).getType();
            SimpleType primitiveKotlinType = type != null ? lazyJavaResolverContext.getModule().getBuiltIns().getPrimitiveKotlinType(type) : lazyJavaResolverContext.getModule().getBuiltIns().getUnitType();
            Intrinsics.checkNotNull(primitiveKotlinType);
            return primitiveKotlinType;
        }
        if (javaType instanceof JavaClassifierType) {
            JavaClassifierType javaClassifierType = (JavaClassifierType) javaType;
            boolean z11 = (attr.isForAnnotationParameter() || attr.getHowThisTypeIsUsed() == TypeUsage.SUPERTYPE) ? false : true;
            boolean zIsRaw = javaClassifierType.isRaw();
            if (!zIsRaw && !z11) {
                SimpleType simpleTypeA = a(javaClassifierType, attr, null);
                if (simpleTypeA == null) {
                    simpleTypeA = ErrorUtils.createErrorType(ErrorTypeKind.UNRESOLVED_JAVA_CLASS, javaClassifierType.getPresentableText());
                }
                return simpleTypeA;
            }
            SimpleType simpleTypeA2 = a(javaClassifierType, attr.withFlexibility(JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND), null);
            if (simpleTypeA2 == null) {
                return ErrorUtils.createErrorType(ErrorTypeKind.UNRESOLVED_JAVA_CLASS, javaClassifierType.getPresentableText());
            }
            SimpleType simpleTypeA3 = a(javaClassifierType, attr.withFlexibility(JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND), simpleTypeA2);
            if (simpleTypeA3 == null) {
                return ErrorUtils.createErrorType(ErrorTypeKind.UNRESOLVED_JAVA_CLASS, javaClassifierType.getPresentableText());
            }
            return zIsRaw ? new RawTypeImpl(simpleTypeA2, simpleTypeA3) : KotlinTypeFactory.flexibleType(simpleTypeA2, simpleTypeA3);
        }
        if (javaType instanceof JavaArrayType) {
            return transformArrayType$default(this, (JavaArrayType) javaType, attr, false, 4, null);
        }
        if (javaType instanceof JavaWildcardType) {
            JavaType bound = ((JavaWildcardType) javaType).getBound();
            if (bound != null && (kotlinTypeTransformJavaType = transformJavaType(bound, attr)) != null) {
                return kotlinTypeTransformJavaType;
            }
            SimpleType defaultBound = lazyJavaResolverContext.getModule().getBuiltIns().getDefaultBound();
            Intrinsics.checkNotNullExpressionValue(defaultBound, "getDefaultBound(...)");
            return defaultBound;
        }
        if (javaType == null) {
            SimpleType defaultBound2 = lazyJavaResolverContext.getModule().getBuiltIns().getDefaultBound();
            Intrinsics.checkNotNullExpressionValue(defaultBound2, "getDefaultBound(...)");
            return defaultBound2;
        }
        throw new UnsupportedOperationException("Unsupported type: " + javaType);
    }
}
