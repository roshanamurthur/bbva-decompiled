package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: AnnotatedCreatorCollector.java */
/* JADX INFO: loaded from: classes9.dex */
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TypeResolutionContext f43370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AnnotatedConstructor f43371b;

    public a(AnnotationIntrospector annotationIntrospector, TypeResolutionContext typeResolutionContext) {
        super(annotationIntrospector);
        this.f43370a = typeResolutionContext;
    }

    public final AnnotationMap a(ClassUtil.Ctor ctor, ClassUtil.Ctor ctor2) {
        AnnotationCollector annotationCollectorCollectAnnotations = collectAnnotations(ctor.getConstructor().getDeclaredAnnotations());
        if (ctor2 != null) {
            annotationCollectorCollectAnnotations = collectAnnotations(annotationCollectorCollectAnnotations, ctor2.getConstructor().getDeclaredAnnotations());
        }
        return annotationCollectorCollectAnnotations.asAnnotationMap();
    }

    public final AnnotationMap[] b(Annotation[][] annotationArr, Annotation[][] annotationArr2) {
        int length = annotationArr.length;
        AnnotationMap[] annotationMapArr = new AnnotationMap[length];
        for (int i10 = 0; i10 < length; i10++) {
            AnnotationCollector annotationCollectorCollectAnnotations = collectAnnotations(AnnotationCollector.emptyCollector(), annotationArr[i10]);
            if (annotationArr2 != null) {
                annotationCollectorCollectAnnotations = collectAnnotations(annotationCollectorCollectAnnotations, annotationArr2[i10]);
            }
            annotationMapArr[i10] = annotationCollectorCollectAnnotations.asAnnotationMap();
        }
        return annotationMapArr;
    }

    public final AnnotatedConstructor c(ClassUtil.Ctor ctor, ClassUtil.Ctor ctor2) {
        AnnotationIntrospector annotationIntrospector = this._intr;
        TypeResolutionContext typeResolutionContext = this.f43370a;
        if (annotationIntrospector == null) {
            return new AnnotatedConstructor(typeResolutionContext, ctor.getConstructor(), new AnnotationMap(), b.NO_ANNOTATION_MAPS);
        }
        return new AnnotatedConstructor(typeResolutionContext, ctor.getConstructor(), a(ctor, ctor2), b(ctor.getConstructor().getParameterAnnotations(), ctor2 == null ? null : ctor2.getConstructor().getParameterAnnotations()));
    }

    public final AnnotatedMethod d(Method method, Method method2) {
        AnnotationMap[] annotationMapArr;
        int length = method.getParameterTypes().length;
        AnnotationIntrospector annotationIntrospector = this._intr;
        TypeResolutionContext typeResolutionContext = this.f43370a;
        if (annotationIntrospector != null) {
            if (length == 0) {
                AnnotationCollector annotationCollectorCollectAnnotations = collectAnnotations(method.getDeclaredAnnotations());
                if (method2 != null) {
                    annotationCollectorCollectAnnotations = collectAnnotations(annotationCollectorCollectAnnotations, method2.getDeclaredAnnotations());
                }
                return new AnnotatedMethod(typeResolutionContext, method, annotationCollectorCollectAnnotations.asAnnotationMap(), b.NO_ANNOTATION_MAPS);
            }
            AnnotationCollector annotationCollectorCollectAnnotations2 = collectAnnotations(method.getDeclaredAnnotations());
            if (method2 != null) {
                annotationCollectorCollectAnnotations2 = collectAnnotations(annotationCollectorCollectAnnotations2, method2.getDeclaredAnnotations());
            }
            return new AnnotatedMethod(typeResolutionContext, method, annotationCollectorCollectAnnotations2.asAnnotationMap(), b(method.getParameterAnnotations(), method2 == null ? null : method2.getParameterAnnotations()));
        }
        AnnotationMap annotationMap = new AnnotationMap();
        if (length == 0) {
            annotationMapArr = b.NO_ANNOTATION_MAPS;
        } else {
            AnnotationMap[] annotationMapArr2 = new AnnotationMap[length];
            for (int i10 = 0; i10 < length; i10++) {
                annotationMapArr2[i10] = new AnnotationMap();
            }
            annotationMapArr = annotationMapArr2;
        }
        return new AnnotatedMethod(typeResolutionContext, method, annotationMap, annotationMapArr);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0084  */
    public final AnnotatedConstructor e(ClassUtil.Ctor ctor, ClassUtil.Ctor ctor2) {
        Annotation[][] annotationArr;
        AnnotationMap[] annotationMapArr;
        int paramCount = ctor.getParamCount();
        AnnotationIntrospector annotationIntrospector = this._intr;
        TypeResolutionContext typeResolutionContext = this.f43370a;
        if (annotationIntrospector == null) {
            Constructor<?> constructor = ctor.getConstructor();
            AnnotationMap annotationMap = new AnnotationMap();
            if (paramCount == 0) {
                annotationMapArr = b.NO_ANNOTATION_MAPS;
            } else {
                AnnotationMap[] annotationMapArr2 = new AnnotationMap[paramCount];
                for (int i10 = 0; i10 < paramCount; i10++) {
                    annotationMapArr2[i10] = new AnnotationMap();
                }
                annotationMapArr = annotationMapArr2;
            }
            return new AnnotatedConstructor(typeResolutionContext, constructor, annotationMap, annotationMapArr);
        }
        if (paramCount == 0) {
            return new AnnotatedConstructor(typeResolutionContext, ctor.getConstructor(), a(ctor, ctor2), b.NO_ANNOTATION_MAPS);
        }
        Annotation[][] parameterAnnotations = ctor.getParameterAnnotations();
        annotationMapArrB = null;
        AnnotationMap[] annotationMapArrB = null;
        if (paramCount != parameterAnnotations.length) {
            Class<?> declaringClass = ctor.getDeclaringClass();
            if (declaringClass.isEnum() && paramCount == parameterAnnotations.length + 2) {
                annotationArr = new Annotation[parameterAnnotations.length + 2][];
                System.arraycopy(parameterAnnotations, 0, annotationArr, 2, parameterAnnotations.length);
                annotationMapArrB = b(annotationArr, null);
            } else {
                if (declaringClass.isMemberClass() && paramCount == parameterAnnotations.length + 1) {
                    annotationArr = new Annotation[parameterAnnotations.length + 1][];
                    System.arraycopy(parameterAnnotations, 0, annotationArr, 1, parameterAnnotations.length);
                    annotationArr[0] = b.NO_ANNOTATIONS;
                    annotationMapArrB = b(annotationArr, null);
                }
                if (annotationMapArrB == null) {
                    throw new IllegalStateException(String.format("Internal error: constructor for %s has mismatch: %d parameters; %d sets of annotations", ctor.getDeclaringClass().getName(), Integer.valueOf(paramCount), Integer.valueOf(parameterAnnotations.length)));
                }
            }
            parameterAnnotations = annotationArr;
            if (annotationMapArrB == null) {
                throw new IllegalStateException(String.format("Internal error: constructor for %s has mismatch: %d parameters; %d sets of annotations", ctor.getDeclaringClass().getName(), Integer.valueOf(paramCount), Integer.valueOf(parameterAnnotations.length)));
            }
        } else {
            annotationMapArrB = b(parameterAnnotations, ctor2 != null ? ctor2.getParameterAnnotations() : null);
        }
        return new AnnotatedConstructor(typeResolutionContext, ctor.getConstructor(), a(ctor, ctor2), annotationMapArrB);
    }
}
