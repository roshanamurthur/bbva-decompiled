package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class AnnotatedFieldCollector extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TypeFactory f43324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ClassIntrospector.MixInResolver f43325b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TypeResolutionContext f43326a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Field f43327b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public AnnotationCollector f43328c = AnnotationCollector.emptyCollector();

        public a(TypeResolutionContext typeResolutionContext, Field field) {
            this.f43326a = typeResolutionContext;
            this.f43327b = field;
        }
    }

    public AnnotatedFieldCollector(AnnotationIntrospector annotationIntrospector, TypeFactory typeFactory, ClassIntrospector.MixInResolver mixInResolver) {
        super(annotationIntrospector);
        this.f43324a = typeFactory;
        this.f43325b = annotationIntrospector == null ? null : mixInResolver;
    }

    public static List<AnnotatedField> collectFields(AnnotationIntrospector annotationIntrospector, TypeResolutionContext typeResolutionContext, ClassIntrospector.MixInResolver mixInResolver, TypeFactory typeFactory, JavaType javaType) {
        Map mapA = new AnnotatedFieldCollector(annotationIntrospector, typeFactory, mixInResolver).a(typeResolutionContext, javaType);
        if (mapA == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(mapA.size());
        for (a aVar : mapA.values()) {
            arrayList.add(new AnnotatedField(aVar.f43326a, aVar.f43327b, aVar.f43328c.asAnnotationMap()));
        }
        return arrayList;
    }

    public final Map a(TypeResolutionContext typeResolutionContext, JavaType javaType) {
        Class<?> clsFindMixInClassFor;
        a aVar;
        JavaType superClass = javaType.getSuperClass();
        if (superClass == null) {
            return null;
        }
        Class<?> rawClass = javaType.getRawClass();
        Map mapA = a(new TypeResolutionContext.Basic(this.f43324a, superClass.getBindings()), superClass);
        for (Field field : ClassUtil.getDeclaredFields(rawClass)) {
            if (!field.isSynthetic() && !Modifier.isStatic(field.getModifiers())) {
                if (mapA == null) {
                    mapA = new LinkedHashMap();
                }
                a aVar2 = new a(typeResolutionContext, field);
                if (this._intr != null) {
                    aVar2.f43328c = collectAnnotations(aVar2.f43328c, field.getDeclaredAnnotations());
                }
                mapA.put(field.getName(), aVar2);
            }
        }
        ClassIntrospector.MixInResolver mixInResolver = this.f43325b;
        if (mixInResolver != null && (clsFindMixInClassFor = mixInResolver.findMixInClassFor(rawClass)) != null) {
            Iterator<Class<?>> it = ClassUtil.findSuperClasses(clsFindMixInClassFor, rawClass, true).iterator();
            while (it.hasNext()) {
                for (Field field2 : ClassUtil.getDeclaredFields(it.next())) {
                    if (!field2.isSynthetic() && !Modifier.isStatic(field2.getModifiers()) && (aVar = (a) mapA.get(field2.getName())) != null) {
                        aVar.f43328c = collectAnnotations(aVar.f43328c, field2.getDeclaredAnnotations());
                    }
                }
            }
        }
        return mapA;
    }
}
