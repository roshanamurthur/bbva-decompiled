package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class AnnotatedClassResolver {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Annotations f43314f = AnnotationCollector.emptyAnnotations();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnnotationIntrospector f43315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ClassIntrospector.MixInResolver f43316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TypeBindings f43317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Class<?> f43318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Class<?> f43319e;

    public AnnotatedClassResolver(MapperConfig<?> mapperConfig, JavaType javaType, ClassIntrospector.MixInResolver mixInResolver) {
        Class<?> rawClass = javaType.getRawClass();
        this.f43318d = rawClass;
        this.f43316b = mixInResolver;
        this.f43317c = javaType.getBindings();
        this.f43315a = mapperConfig.isAnnotationProcessingEnabled() ? mapperConfig.getAnnotationIntrospector() : null;
        this.f43319e = mapperConfig.findMixInClassFor(rawClass);
    }

    public static AnnotatedClass resolve(MapperConfig<?> mapperConfig, JavaType javaType, ClassIntrospector.MixInResolver mixInResolver) {
        if (javaType.isArrayType()) {
            Class<?> rawClass = javaType.getRawClass();
            if (mapperConfig == null || mapperConfig.findMixInClassFor(rawClass) == null) {
                return new AnnotatedClass(javaType.getRawClass());
            }
        }
        AnnotatedClassResolver annotatedClassResolver = new AnnotatedClassResolver(mapperConfig, javaType, mixInResolver);
        List<JavaType> listFindSuperTypes = ClassUtil.findSuperTypes(javaType, (Class<?>) null, false);
        return new AnnotatedClass(javaType, annotatedClassResolver.f43318d, listFindSuperTypes, annotatedClassResolver.f43319e, annotatedClassResolver.d(listFindSuperTypes), annotatedClassResolver.f43317c, annotatedClassResolver.f43315a, annotatedClassResolver.f43316b, mapperConfig.getTypeFactory());
    }

    public static AnnotatedClass resolveWithoutSuperTypes(MapperConfig<?> mapperConfig, Class<?> cls) {
        return resolveWithoutSuperTypes(mapperConfig, cls, mapperConfig);
    }

    public final AnnotationCollector a(AnnotationCollector annotationCollector, Annotation[] annotationArr) {
        if (annotationArr != null) {
            for (Annotation annotation : annotationArr) {
                if (!annotationCollector.isPresent(annotation)) {
                    annotationCollector = annotationCollector.addOrOverride(annotation);
                    if (this.f43315a.isAnnotationBundle(annotation)) {
                        annotationCollector = c(annotationCollector, annotation);
                    }
                }
            }
        }
        return annotationCollector;
    }

    public final AnnotationCollector b(AnnotationCollector annotationCollector, Class<?> cls, Class<?> cls2) {
        if (cls2 != null) {
            annotationCollector = a(annotationCollector, ClassUtil.findClassAnnotations(cls2));
            Iterator<Class<?>> it = ClassUtil.findSuperClasses(cls2, cls, false).iterator();
            while (it.hasNext()) {
                annotationCollector = a(annotationCollector, ClassUtil.findClassAnnotations(it.next()));
            }
        }
        return annotationCollector;
    }

    public final AnnotationCollector c(AnnotationCollector annotationCollector, Annotation annotation) {
        for (Annotation annotation2 : ClassUtil.findClassAnnotations(annotation.annotationType())) {
            if (!(annotation2 instanceof Target) && !(annotation2 instanceof Retention) && !annotationCollector.isPresent(annotation2)) {
                annotationCollector = annotationCollector.addOrOverride(annotation2);
                if (this.f43315a.isAnnotationBundle(annotation2)) {
                    annotationCollector = c(annotationCollector, annotation2);
                }
            }
        }
        return annotationCollector;
    }

    public final Annotations d(List<JavaType> list) {
        ClassIntrospector.MixInResolver mixInResolver;
        if (this.f43315a == null) {
            return f43314f;
        }
        AnnotationCollector annotationCollectorEmptyCollector = AnnotationCollector.emptyCollector();
        Class<?> cls = this.f43318d;
        Class<?> cls2 = this.f43319e;
        if (cls2 != null) {
            annotationCollectorEmptyCollector = b(annotationCollectorEmptyCollector, cls, cls2);
        }
        AnnotationCollector annotationCollectorA = a(annotationCollectorEmptyCollector, ClassUtil.findClassAnnotations(cls));
        Iterator<JavaType> it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            mixInResolver = this.f43316b;
            if (!zHasNext) {
                break;
            }
            JavaType next = it.next();
            if (mixInResolver != null) {
                Class<?> rawClass = next.getRawClass();
                annotationCollectorA = b(annotationCollectorA, rawClass, mixInResolver.findMixInClassFor(rawClass));
            }
            annotationCollectorA = a(annotationCollectorA, ClassUtil.findClassAnnotations(next.getRawClass()));
        }
        if (mixInResolver != null) {
            annotationCollectorA = b(annotationCollectorA, Object.class, mixInResolver.findMixInClassFor(Object.class));
        }
        return annotationCollectorA.asAnnotations();
    }

    public static AnnotatedClass resolveWithoutSuperTypes(MapperConfig<?> mapperConfig, JavaType javaType, ClassIntrospector.MixInResolver mixInResolver) {
        if (javaType.isArrayType()) {
            Class<?> rawClass = javaType.getRawClass();
            if (mapperConfig == null || mapperConfig.findMixInClassFor(rawClass) == null) {
                return new AnnotatedClass(javaType.getRawClass());
            }
        }
        AnnotatedClassResolver annotatedClassResolver = new AnnotatedClassResolver(mapperConfig, javaType, mixInResolver);
        List<JavaType> listEmptyList = Collections.emptyList();
        return new AnnotatedClass(null, annotatedClassResolver.f43318d, listEmptyList, annotatedClassResolver.f43319e, annotatedClassResolver.d(listEmptyList), annotatedClassResolver.f43317c, annotatedClassResolver.f43315a, mapperConfig, mapperConfig.getTypeFactory());
    }

    public AnnotatedClassResolver(MapperConfig<?> mapperConfig, Class<?> cls, ClassIntrospector.MixInResolver mixInResolver) {
        this.f43318d = cls;
        this.f43316b = mixInResolver;
        this.f43317c = TypeBindings.emptyBindings();
        if (mapperConfig == null) {
            this.f43315a = null;
            this.f43319e = null;
        } else {
            this.f43315a = mapperConfig.isAnnotationProcessingEnabled() ? mapperConfig.getAnnotationIntrospector() : null;
            this.f43319e = mapperConfig.findMixInClassFor(cls);
        }
    }

    public static AnnotatedClass resolveWithoutSuperTypes(MapperConfig<?> mapperConfig, Class<?> cls, ClassIntrospector.MixInResolver mixInResolver) {
        if (cls.isArray() && (mapperConfig == null || mapperConfig.findMixInClassFor(cls) == null)) {
            return new AnnotatedClass(cls);
        }
        AnnotatedClassResolver annotatedClassResolver = new AnnotatedClassResolver(mapperConfig, cls, mixInResolver);
        List<JavaType> listEmptyList = Collections.emptyList();
        return new AnnotatedClass(null, cls, listEmptyList, annotatedClassResolver.f43319e, annotatedClassResolver.d(listEmptyList), annotatedClassResolver.f43317c, annotatedClassResolver.f43315a, mapperConfig, mapperConfig.getTypeFactory());
    }
}
