package vk;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectAnnotationSource;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClassKt;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ReflectKotlinClass.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f94103a = new a();

    public static ClassLiteralValue a(Class cls) {
        int i10 = 0;
        while (cls.isArray()) {
            i10++;
            cls = cls.getComponentType();
            Intrinsics.checkNotNullExpressionValue(cls, "getComponentType(...)");
        }
        if (!cls.isPrimitive()) {
            ClassId classId = ReflectClassUtilKt.getClassId(cls);
            JavaToKotlinClassMap javaToKotlinClassMap = JavaToKotlinClassMap.INSTANCE;
            FqName fqNameAsSingleFqName = classId.asSingleFqName();
            Intrinsics.checkNotNullExpressionValue(fqNameAsSingleFqName, "asSingleFqName(...)");
            ClassId classIdMapJavaToKotlin = javaToKotlinClassMap.mapJavaToKotlin(fqNameAsSingleFqName);
            if (classIdMapJavaToKotlin != null) {
                classId = classIdMapJavaToKotlin;
            }
            return new ClassLiteralValue(classId, i10);
        }
        if (Intrinsics.areEqual(cls, Void.TYPE)) {
            ClassId classId2 = ClassId.topLevel(StandardNames.FqNames.unit.toSafe());
            Intrinsics.checkNotNullExpressionValue(classId2, "topLevel(...)");
            return new ClassLiteralValue(classId2, i10);
        }
        PrimitiveType primitiveType = JvmPrimitiveType.get(cls.getName()).getPrimitiveType();
        Intrinsics.checkNotNullExpressionValue(primitiveType, "getPrimitiveType(...)");
        if (i10 > 0) {
            ClassId classId3 = ClassId.topLevel(primitiveType.getArrayTypeFqName());
            Intrinsics.checkNotNullExpressionValue(classId3, "topLevel(...)");
            return new ClassLiteralValue(classId3, i10 - 1);
        }
        ClassId classId4 = ClassId.topLevel(primitiveType.getTypeFqName());
        Intrinsics.checkNotNullExpressionValue(classId4, "topLevel(...)");
        return new ClassLiteralValue(classId4, i10);
    }

    public static void b(KotlinJvmBinaryClass.AnnotationVisitor annotationVisitor, Annotation annotation) throws InvocationTargetException {
        Class javaClass = JvmClassMappingKt.getJavaClass(JvmClassMappingKt.getAnnotationClass(annotation));
        KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorVisitAnnotation = annotationVisitor.visitAnnotation(ReflectClassUtilKt.getClassId(javaClass), new ReflectAnnotationSource(annotation));
        if (annotationArgumentVisitorVisitAnnotation != null) {
            c(annotationArgumentVisitorVisitAnnotation, annotation, javaClass);
        }
    }

    public static void c(KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitor, Annotation annotation, Class cls) throws InvocationTargetException {
        Method[] declaredMethods = cls.getDeclaredMethods();
        Intrinsics.checkNotNullExpressionValue(declaredMethods, "getDeclaredMethods(...)");
        int length = declaredMethods.length;
        int i10 = 0;
        int i11 = 0;
        while (i11 < length) {
            Method method = declaredMethods[i11];
            try {
                try {
                    Object objInvoke = method.invoke(annotation, new Object[i10]);
                    Intrinsics.checkNotNull(objInvoke);
                    Name nameIdentifier = Name.identifier(method.getName());
                    Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
                    Class<?> enclosingClass = objInvoke.getClass();
                    if (Intrinsics.areEqual(enclosingClass, Class.class)) {
                        Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type java.lang.Class<*>");
                        annotationArgumentVisitor.visitClassLiteral(nameIdentifier, a((Class) objInvoke));
                    } else if (ReflectKotlinClassKt.f80412a.contains(enclosingClass)) {
                        annotationArgumentVisitor.visit(nameIdentifier, objInvoke);
                    } else if (ReflectClassUtilKt.isEnumClassOrSpecializedEnumEntryClass(enclosingClass)) {
                        if (!enclosingClass.isEnum()) {
                            enclosingClass = enclosingClass.getEnclosingClass();
                        }
                        Intrinsics.checkNotNull(enclosingClass);
                        ClassId classId = ReflectClassUtilKt.getClassId(enclosingClass);
                        Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.Enum<*>");
                        Name nameIdentifier2 = Name.identifier(((Enum) objInvoke).name());
                        Intrinsics.checkNotNullExpressionValue(nameIdentifier2, "identifier(...)");
                        annotationArgumentVisitor.visitEnum(nameIdentifier, classId, nameIdentifier2);
                    } else if (Annotation.class.isAssignableFrom(enclosingClass)) {
                        Class<?>[] interfaces = enclosingClass.getInterfaces();
                        Intrinsics.checkNotNullExpressionValue(interfaces, "getInterfaces(...)");
                        Class cls2 = (Class) ArraysKt___ArraysKt.single(interfaces);
                        Intrinsics.checkNotNull(cls2);
                        KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorVisitAnnotation = annotationArgumentVisitor.visitAnnotation(nameIdentifier, ReflectClassUtilKt.getClassId(cls2));
                        if (annotationArgumentVisitorVisitAnnotation != null) {
                            Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.Annotation");
                            c(annotationArgumentVisitorVisitAnnotation, (Annotation) objInvoke, cls2);
                        }
                    } else {
                        if (!enclosingClass.isArray()) {
                            throw new UnsupportedOperationException("Unsupported annotation argument value (" + enclosingClass + "): " + objInvoke);
                        }
                        KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor annotationArrayArgumentVisitorVisitArray = annotationArgumentVisitor.visitArray(nameIdentifier);
                        if (annotationArrayArgumentVisitorVisitArray != null) {
                            Class<?> componentType = enclosingClass.getComponentType();
                            if (componentType.isEnum()) {
                                Intrinsics.checkNotNull(componentType);
                                ClassId classId2 = ReflectClassUtilKt.getClassId(componentType);
                                Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.Array<*>");
                                for (Object obj : (Object[]) objInvoke) {
                                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Enum<*>");
                                    Name nameIdentifier3 = Name.identifier(((Enum) obj).name());
                                    Intrinsics.checkNotNullExpressionValue(nameIdentifier3, "identifier(...)");
                                    annotationArrayArgumentVisitorVisitArray.visitEnum(classId2, nameIdentifier3);
                                }
                            } else if (Intrinsics.areEqual(componentType, Class.class)) {
                                Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.Array<*>");
                                for (Object obj2 : (Object[]) objInvoke) {
                                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type java.lang.Class<*>");
                                    annotationArrayArgumentVisitorVisitArray.visitClassLiteral(a((Class) obj2));
                                }
                            } else if (Annotation.class.isAssignableFrom(componentType)) {
                                Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.Array<*>");
                                for (Object obj3 : (Object[]) objInvoke) {
                                    Intrinsics.checkNotNull(componentType);
                                    KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorVisitAnnotation2 = annotationArrayArgumentVisitorVisitArray.visitAnnotation(ReflectClassUtilKt.getClassId(componentType));
                                    if (annotationArgumentVisitorVisitAnnotation2 != null) {
                                        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Annotation");
                                        c(annotationArgumentVisitorVisitAnnotation2, (Annotation) obj3, componentType);
                                    }
                                }
                            } else {
                                Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.Array<*>");
                                for (Object obj4 : (Object[]) objInvoke) {
                                    annotationArrayArgumentVisitorVisitArray.visit(obj4);
                                }
                            }
                            annotationArrayArgumentVisitorVisitArray.visitEnd();
                        }
                    }
                } catch (IllegalAccessException unused) {
                    continue;
                }
            } catch (IllegalAccessException unused2) {
            }
            i11++;
            i10 = 0;
        }
        annotationArgumentVisitor.visitEnd();
    }

    public final void loadClassAnnotations(@NotNull Class<?> klass, @NotNull KotlinJvmBinaryClass.AnnotationVisitor visitor) throws InvocationTargetException {
        Intrinsics.checkNotNullParameter(klass, "klass");
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        Annotation[] declaredAnnotations = klass.getDeclaredAnnotations();
        Intrinsics.checkNotNullExpressionValue(declaredAnnotations, "getDeclaredAnnotations(...)");
        for (Annotation annotation : declaredAnnotations) {
            Intrinsics.checkNotNull(annotation);
            b(visitor, annotation);
        }
        visitor.visitEnd();
    }

    public final void visitMembers(@NotNull Class<?> klass, @NotNull KotlinJvmBinaryClass.MemberVisitor memberVisitor) throws InvocationTargetException {
        b bVar;
        Constructor<?>[] constructorArr;
        int i10;
        Intrinsics.checkNotNullParameter(klass, "klass");
        Intrinsics.checkNotNullParameter(memberVisitor, "memberVisitor");
        Method[] declaredMethods = klass.getDeclaredMethods();
        Intrinsics.checkNotNullExpressionValue(declaredMethods, "getDeclaredMethods(...)");
        int length = declaredMethods.length;
        int i11 = 0;
        while (true) {
            bVar = b.f94104a;
            if (i11 >= length) {
                break;
            }
            Method method = declaredMethods[i11];
            Name nameIdentifier = Name.identifier(method.getName());
            Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
            Intrinsics.checkNotNull(method);
            KotlinJvmBinaryClass.MethodAnnotationVisitor methodAnnotationVisitorVisitMethod = memberVisitor.visitMethod(nameIdentifier, bVar.methodDesc(method));
            if (methodAnnotationVisitorVisitMethod != null) {
                Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                Intrinsics.checkNotNullExpressionValue(declaredAnnotations, "getDeclaredAnnotations(...)");
                for (Annotation annotation : declaredAnnotations) {
                    Intrinsics.checkNotNull(annotation);
                    b(methodAnnotationVisitorVisitMethod, annotation);
                }
                Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                Intrinsics.checkNotNullExpressionValue(parameterAnnotations, "getParameterAnnotations(...)");
                Annotation[][] annotationArr = parameterAnnotations;
                int length2 = annotationArr.length;
                for (int i12 = 0; i12 < length2; i12++) {
                    Annotation[] annotationArr2 = annotationArr[i12];
                    Intrinsics.checkNotNull(annotationArr2);
                    for (Annotation annotation2 : annotationArr2) {
                        Class javaClass = JvmClassMappingKt.getJavaClass(JvmClassMappingKt.getAnnotationClass(annotation2));
                        ClassId classId = ReflectClassUtilKt.getClassId(javaClass);
                        Intrinsics.checkNotNull(annotation2);
                        KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorVisitParameterAnnotation = methodAnnotationVisitorVisitMethod.visitParameterAnnotation(i12, classId, new ReflectAnnotationSource(annotation2));
                        if (annotationArgumentVisitorVisitParameterAnnotation != null) {
                            c(annotationArgumentVisitorVisitParameterAnnotation, annotation2, javaClass);
                        }
                    }
                }
                methodAnnotationVisitorVisitMethod.visitEnd();
            }
            i11++;
        }
        Constructor<?>[] declaredConstructors = klass.getDeclaredConstructors();
        Intrinsics.checkNotNullExpressionValue(declaredConstructors, "getDeclaredConstructors(...)");
        int length3 = declaredConstructors.length;
        int i13 = 0;
        while (i13 < length3) {
            Constructor<?> constructor = declaredConstructors[i13];
            Name name = SpecialNames.INIT;
            Intrinsics.checkNotNull(constructor);
            KotlinJvmBinaryClass.MethodAnnotationVisitor methodAnnotationVisitorVisitMethod2 = memberVisitor.visitMethod(name, bVar.constructorDesc(constructor));
            if (methodAnnotationVisitorVisitMethod2 == null) {
                constructorArr = declaredConstructors;
                i10 = length3;
            } else {
                Annotation[] declaredAnnotations2 = constructor.getDeclaredAnnotations();
                Intrinsics.checkNotNullExpressionValue(declaredAnnotations2, "getDeclaredAnnotations(...)");
                for (Annotation annotation3 : declaredAnnotations2) {
                    Intrinsics.checkNotNull(annotation3);
                    b(methodAnnotationVisitorVisitMethod2, annotation3);
                }
                Annotation[][] parameterAnnotations2 = constructor.getParameterAnnotations();
                Intrinsics.checkNotNull(parameterAnnotations2);
                if (!(parameterAnnotations2.length == 0)) {
                    int length4 = constructor.getParameterTypes().length - parameterAnnotations2.length;
                    int length5 = parameterAnnotations2.length;
                    for (int i14 = 0; i14 < length5; i14++) {
                        Annotation[] annotationArr3 = parameterAnnotations2[i14];
                        Intrinsics.checkNotNull(annotationArr3);
                        int length6 = annotationArr3.length;
                        int i15 = 0;
                        while (i15 < length6) {
                            Constructor<?>[] constructorArr2 = declaredConstructors;
                            Annotation annotation4 = annotationArr3[i15];
                            Class javaClass2 = JvmClassMappingKt.getJavaClass(JvmClassMappingKt.getAnnotationClass(annotation4));
                            int i16 = length3;
                            int i17 = i14 + length4;
                            int i18 = length4;
                            ClassId classId2 = ReflectClassUtilKt.getClassId(javaClass2);
                            Annotation[][] annotationArr4 = parameterAnnotations2;
                            Intrinsics.checkNotNull(annotation4);
                            KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorVisitParameterAnnotation2 = methodAnnotationVisitorVisitMethod2.visitParameterAnnotation(i17, classId2, new ReflectAnnotationSource(annotation4));
                            if (annotationArgumentVisitorVisitParameterAnnotation2 != null) {
                                c(annotationArgumentVisitorVisitParameterAnnotation2, annotation4, javaClass2);
                            }
                            i15++;
                            declaredConstructors = constructorArr2;
                            length3 = i16;
                            length4 = i18;
                            parameterAnnotations2 = annotationArr4;
                        }
                    }
                }
                constructorArr = declaredConstructors;
                i10 = length3;
                methodAnnotationVisitorVisitMethod2.visitEnd();
            }
            i13++;
            declaredConstructors = constructorArr;
            length3 = i10;
        }
        Field[] declaredFields = klass.getDeclaredFields();
        Intrinsics.checkNotNullExpressionValue(declaredFields, "getDeclaredFields(...)");
        for (Field field : declaredFields) {
            Name nameIdentifier2 = Name.identifier(field.getName());
            Intrinsics.checkNotNullExpressionValue(nameIdentifier2, "identifier(...)");
            Intrinsics.checkNotNull(field);
            KotlinJvmBinaryClass.AnnotationVisitor annotationVisitorVisitField = memberVisitor.visitField(nameIdentifier2, bVar.fieldDesc(field), null);
            if (annotationVisitorVisitField != null) {
                Annotation[] declaredAnnotations3 = field.getDeclaredAnnotations();
                Intrinsics.checkNotNullExpressionValue(declaredAnnotations3, "getDeclaredAnnotations(...)");
                for (Annotation annotation5 : declaredAnnotations3) {
                    Intrinsics.checkNotNull(annotation5);
                    b(annotationVisitorVisitField, annotation5);
                }
                annotationVisitorVisitField.visitEnd();
            }
        }
    }
}
