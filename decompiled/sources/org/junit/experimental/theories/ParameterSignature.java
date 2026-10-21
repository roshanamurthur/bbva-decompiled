package org.junit.experimental.theories;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class ParameterSignature {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map<Class<?>, Class<?>> f91816c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<?> f91817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Annotation[] f91818b;

    static {
        HashMap map = new HashMap();
        Class cls = Boolean.TYPE;
        map.put(cls, Boolean.class);
        map.put(Boolean.class, cls);
        Class cls2 = Byte.TYPE;
        map.put(cls2, Byte.class);
        map.put(Byte.class, cls2);
        Class cls3 = Short.TYPE;
        map.put(cls3, Short.class);
        map.put(Short.class, cls3);
        Class cls4 = Character.TYPE;
        map.put(cls4, Character.class);
        map.put(Character.class, cls4);
        Class cls5 = Integer.TYPE;
        map.put(cls5, Integer.class);
        map.put(Integer.class, cls5);
        Class cls6 = Long.TYPE;
        map.put(cls6, Long.class);
        map.put(Long.class, cls6);
        Class cls7 = Float.TYPE;
        map.put(cls7, Float.class);
        map.put(Float.class, cls7);
        Class cls8 = Double.TYPE;
        map.put(cls8, Double.class);
        map.put(Double.class, cls8);
        f91816c = Collections.unmodifiableMap(map);
    }

    public ParameterSignature(Class<?> cls, Annotation[] annotationArr) {
        this.f91817a = cls;
        this.f91818b = annotationArr;
    }

    public static Annotation a(Annotation[] annotationArr, Class cls, int i10) {
        if (i10 == 0) {
            return null;
        }
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return (Annotation) cls.cast(annotation);
            }
            Annotation annotationA = a(annotation.annotationType().getAnnotations(), cls, i10 - 1);
            if (annotationA != null) {
                return (Annotation) cls.cast(annotationA);
            }
        }
        return null;
    }

    public static ArrayList<ParameterSignature> signatures(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        ArrayList<ParameterSignature> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < parameterTypes.length; i10++) {
            arrayList.add(new ParameterSignature(parameterTypes[i10], parameterAnnotations[i10]));
        }
        return arrayList;
    }

    public boolean canAcceptType(Class<?> cls) {
        Class<?> cls2 = this.f91817a;
        if (!cls2.isAssignableFrom(cls)) {
            Map<Class<?>, Class<?>> map = f91816c;
            if (!map.containsKey(cls) || !cls2.isAssignableFrom(map.get(cls))) {
                return false;
            }
        }
        return true;
    }

    public boolean canAcceptValue(Object obj) {
        if (obj == null) {
            return !this.f91817a.isPrimitive();
        }
        return canAcceptType(obj.getClass());
    }

    public boolean canPotentiallyAcceptType(Class<?> cls) {
        Class<?> cls2 = this.f91817a;
        if (!cls.isAssignableFrom(cls2)) {
            Map<Class<?>, Class<?>> map = f91816c;
            if ((!map.containsKey(cls2) || !cls.isAssignableFrom(map.get(cls2))) && !canAcceptType(cls)) {
                return false;
            }
        }
        return true;
    }

    public <T extends Annotation> T findDeepAnnotation(Class<T> cls) {
        return (T) a(this.f91818b, cls, 3);
    }

    public <T extends Annotation> T getAnnotation(Class<T> cls) {
        for (Annotation annotation : getAnnotations()) {
            if (cls.isInstance(annotation)) {
                return cls.cast(annotation);
            }
        }
        return null;
    }

    public List<Annotation> getAnnotations() {
        return Arrays.asList(this.f91818b);
    }

    public Class<?> getType() {
        return this.f91817a;
    }

    public boolean hasAnnotation(Class<? extends Annotation> cls) {
        return getAnnotation(cls) != null;
    }

    public static List<ParameterSignature> signatures(Constructor<?> constructor) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < parameterTypes.length; i10++) {
            arrayList.add(new ParameterSignature(parameterTypes[i10], parameterAnnotations[i10]));
        }
        return arrayList;
    }
}
