package com.fasterxml.jackson.databind.introspect;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class AnnotatedMethodCollector extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClassIntrospector.MixInResolver f43332a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TypeResolutionContext f43333a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Method f43334b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public AnnotationCollector f43335c;

        public a(TypeResolutionContext typeResolutionContext, Method method, AnnotationCollector annotationCollector) {
            this.f43333a = typeResolutionContext;
            this.f43334b = method;
            this.f43335c = annotationCollector;
        }
    }

    public AnnotatedMethodCollector(AnnotationIntrospector annotationIntrospector, ClassIntrospector.MixInResolver mixInResolver) {
        super(annotationIntrospector);
        this.f43332a = annotationIntrospector == null ? null : mixInResolver;
    }

    public static boolean b(Method method) {
        return (Modifier.isStatic(method.getModifiers()) || method.isSynthetic() || method.isBridge() || method.getParameterTypes().length > 2) ? false : true;
    }

    public static AnnotatedMethodMap collectMethods(AnnotationIntrospector annotationIntrospector, TypeResolutionContext typeResolutionContext, ClassIntrospector.MixInResolver mixInResolver, TypeFactory typeFactory, JavaType javaType, List<JavaType> list, Class<?> cls) {
        ClassIntrospector.MixInResolver mixInResolver2;
        Class<?> clsFindMixInClassFor;
        AnnotatedMethodCollector annotatedMethodCollector = new AnnotatedMethodCollector(annotationIntrospector, mixInResolver);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        annotatedMethodCollector.a(typeResolutionContext, javaType.getRawClass(), linkedHashMap, cls);
        Iterator<JavaType> it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            Class<?> clsFindMixInClassFor2 = null;
            mixInResolver2 = annotatedMethodCollector.f43332a;
            if (!zHasNext) {
                break;
            }
            JavaType next = it.next();
            if (mixInResolver2 != null) {
                clsFindMixInClassFor2 = mixInResolver2.findMixInClassFor(next.getRawClass());
            }
            annotatedMethodCollector.a(new TypeResolutionContext.Basic(typeFactory, next.getBindings()), next.getRawClass(), linkedHashMap, clsFindMixInClassFor2);
        }
        if (mixInResolver2 != null && (clsFindMixInClassFor = mixInResolver2.findMixInClassFor(Object.class)) != null) {
            annotatedMethodCollector._addMethodMixIns(typeResolutionContext, javaType.getRawClass(), linkedHashMap, clsFindMixInClassFor);
            if (annotatedMethodCollector._intr != null && !linkedHashMap.isEmpty()) {
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    MemberKey memberKey = (MemberKey) entry.getKey();
                    if (GenerateActivationFormCommand.HASH_CODE.equals(memberKey.getName()) && memberKey.argCount() == 0) {
                        try {
                            Method declaredMethod = Object.class.getDeclaredMethod(memberKey.getName(), new Class[0]);
                            if (declaredMethod != null) {
                                a aVar = (a) entry.getValue();
                                aVar.f43335c = annotatedMethodCollector.collectDefaultAnnotations(aVar.f43335c, declaredMethod.getDeclaredAnnotations());
                                aVar.f43334b = declaredMethod;
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
        if (linkedHashMap.isEmpty()) {
            return new AnnotatedMethodMap();
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap.size());
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            a aVar2 = (a) entry2.getValue();
            Method method = aVar2.f43334b;
            AnnotatedMethod annotatedMethod = method == null ? null : new AnnotatedMethod(aVar2.f43333a, method, aVar2.f43335c.asAnnotationMap(), null);
            if (annotatedMethod != null) {
                linkedHashMap2.put(entry2.getKey(), annotatedMethod);
            }
        }
        return new AnnotatedMethodMap(linkedHashMap2);
    }

    public void _addMethodMixIns(TypeResolutionContext typeResolutionContext, Class<?> cls, Map<MemberKey, a> map, Class<?> cls2) {
        if (this._intr == null) {
            return;
        }
        Iterator<Class<?>> it = ClassUtil.findRawSuperTypes(cls2, cls, true).iterator();
        while (it.hasNext()) {
            for (Method method : ClassUtil.getDeclaredMethods(it.next())) {
                if (b(method)) {
                    MemberKey memberKey = new MemberKey(method);
                    a aVar = map.get(memberKey);
                    Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                    if (aVar == null) {
                        map.put(memberKey, new a(typeResolutionContext, null, collectAnnotations(declaredAnnotations)));
                    } else {
                        aVar.f43335c = collectDefaultAnnotations(aVar.f43335c, declaredAnnotations);
                    }
                }
            }
        }
    }

    public final void a(TypeResolutionContext typeResolutionContext, Class cls, LinkedHashMap linkedHashMap, Class cls2) {
        if (cls2 != null) {
            _addMethodMixIns(typeResolutionContext, cls, linkedHashMap, cls2);
        }
        if (cls == null) {
            return;
        }
        for (Method method : ClassUtil.getClassMethods(cls)) {
            if (b(method)) {
                MemberKey memberKey = new MemberKey(method);
                a aVar = (a) linkedHashMap.get(memberKey);
                if (aVar == null) {
                    linkedHashMap.put(memberKey, new a(typeResolutionContext, method, this._intr == null ? AnnotationCollector.emptyCollector() : collectAnnotations(method.getDeclaredAnnotations())));
                } else {
                    if (this._intr != null) {
                        aVar.f43335c = collectDefaultAnnotations(aVar.f43335c, method.getDeclaredAnnotations());
                    }
                    Method method2 = aVar.f43334b;
                    if (method2 == null) {
                        aVar.f43334b = method;
                    } else if (Modifier.isAbstract(method2.getModifiers()) && !Modifier.isAbstract(method.getModifiers())) {
                        aVar.f43334b = method;
                        aVar.f43333a = typeResolutionContext;
                    }
                }
            }
        }
    }
}
