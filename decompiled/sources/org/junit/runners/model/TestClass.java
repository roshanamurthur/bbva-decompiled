package org.junit.runners.model;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.internal.MethodSorter;

/* JADX INFO: loaded from: classes13.dex */
public class TestClass implements Annotatable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f92050d = new c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f92051e = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<?> f92052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<Class<? extends Annotation>, List<FrameworkMethod>> f92053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<Class<? extends Annotation>, List<FrameworkField>> f92054c;

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class a<T> implements MemberValueConsumer<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f92055a;

        public a(ArrayList arrayList) {
            this.f92055a = arrayList;
        }

        @Override // org.junit.runners.model.MemberValueConsumer
        public final void accept(FrameworkMember<?> frameworkMember, T t10) {
            this.f92055a.add(t10);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class b<T> implements MemberValueConsumer<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f92056a;

        public b(ArrayList arrayList) {
            this.f92056a = arrayList;
        }

        @Override // org.junit.runners.model.MemberValueConsumer
        public final void accept(FrameworkMember<?> frameworkMember, T t10) {
            this.f92056a.add(t10);
        }
    }

    public static class c implements Comparator<Field> {
        @Override // java.util.Comparator
        public final int compare(Field field, Field field2) {
            return field.getName().compareTo(field2.getName());
        }
    }

    public static class d implements Comparator<FrameworkMethod> {
        @Override // java.util.Comparator
        public final int compare(FrameworkMethod frameworkMethod, FrameworkMethod frameworkMethod2) {
            return MethodSorter.NAME_ASCENDING.compare(frameworkMethod.getMethod(), frameworkMethod2.getMethod());
        }
    }

    public TestClass(Class<?> cls) {
        this.f92052a = cls;
        if (cls != null && cls.getConstructors().length > 1) {
            throw new IllegalArgumentException("Test class can only have one constructor");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        scanAnnotatedMembers(linkedHashMap, linkedHashMap2);
        this.f92053b = c(linkedHashMap);
        this.f92054c = c(linkedHashMap2);
    }

    public static ArrayList a(Map map) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            linkedHashSet.addAll((List) it.next());
        }
        return new ArrayList(linkedHashSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends FrameworkMember<T>> void addToAnnotationLists(T t10, Map<Class<? extends Annotation>, List<T>> map) {
        Object obj;
        FrameworkMember frameworkMember;
        for (Annotation annotation : t10.getAnnotations()) {
            Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
            List listB = b(map, clsAnnotationType, true);
            int size = listB.size() - 1;
            while (true) {
                if (size < 0) {
                    obj = t10;
                    break;
                }
                frameworkMember = (FrameworkMember) listB.get(size);
                if (t10.isShadowedBy(frameworkMember)) {
                    if (frameworkMember.a()) {
                        listB.remove(size);
                        break;
                    } else {
                        obj = null;
                        break;
                    }
                }
                size--;
            }
            if (obj == null) {
                obj = frameworkMember;
                return;
            }
            if (clsAnnotationType.equals(Before.class) || clsAnnotationType.equals(BeforeClass.class)) {
                obj = frameworkMember;
                obj = frameworkMember;
                listB.add(0, obj);
            } else {
                obj = frameworkMember;
                listB.add(obj);
            }
        }
    }

    public static <T> List<T> b(Map<Class<? extends Annotation>, List<T>> map, Class<? extends Annotation> cls, boolean z10) {
        if (!map.containsKey(cls) && z10) {
            map.put(cls, new ArrayList());
        }
        List<T> list = map.get(cls);
        return list == null ? Collections.emptyList() : list;
    }

    public static Map c(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), Collections.unmodifiableList((List) entry.getValue()));
        }
        return Collections.unmodifiableMap(linkedHashMap2);
    }

    public <T> void collectAnnotatedFieldValues(Object obj, Class<? extends Annotation> cls, Class<T> cls2, MemberValueConsumer<T> memberValueConsumer) {
        for (FrameworkField frameworkField : getAnnotatedFields(cls)) {
            try {
                Object obj2 = frameworkField.get(obj);
                if (cls2.isInstance(obj2)) {
                    memberValueConsumer.accept(frameworkField, cls2.cast(obj2));
                }
            } catch (IllegalAccessException e5) {
                throw new RuntimeException("How did getFields return a field we couldn't access?", e5);
            }
        }
    }

    public <T> void collectAnnotatedMethodValues(Object obj, Class<? extends Annotation> cls, Class<T> cls2, MemberValueConsumer<T> memberValueConsumer) {
        for (FrameworkMethod frameworkMethod : getAnnotatedMethods(cls)) {
            try {
                if (cls2.isAssignableFrom(frameworkMethod.getReturnType())) {
                    memberValueConsumer.accept(frameworkMethod, cls2.cast(frameworkMethod.invokeExplosively(obj, new Object[0])));
                }
            } catch (Throwable th2) {
                throw new RuntimeException("Exception in " + frameworkMethod.getName(), th2);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f92052a == ((TestClass) obj).f92052a;
    }

    public <T> List<T> getAnnotatedFieldValues(Object obj, Class<? extends Annotation> cls, Class<T> cls2) {
        ArrayList arrayList = new ArrayList();
        collectAnnotatedFieldValues(obj, cls, cls2, new a(arrayList));
        return arrayList;
    }

    public List<FrameworkField> getAnnotatedFields() {
        return a(this.f92054c);
    }

    public <T> List<T> getAnnotatedMethodValues(Object obj, Class<? extends Annotation> cls, Class<T> cls2) {
        ArrayList arrayList = new ArrayList();
        collectAnnotatedMethodValues(obj, cls, cls2, new b(arrayList));
        return arrayList;
    }

    public List<FrameworkMethod> getAnnotatedMethods() {
        ArrayList arrayListA = a(this.f92053b);
        Collections.sort(arrayListA, f92051e);
        return arrayListA;
    }

    @Override // org.junit.runners.model.Annotatable
    public <T extends Annotation> T getAnnotation(Class<T> cls) {
        Class<?> cls2 = this.f92052a;
        if (cls2 == null) {
            return null;
        }
        return (T) cls2.getAnnotation(cls);
    }

    @Override // org.junit.runners.model.Annotatable
    public Annotation[] getAnnotations() {
        Class<?> cls = this.f92052a;
        return cls == null ? new Annotation[0] : cls.getAnnotations();
    }

    public Class<?> getJavaClass() {
        return this.f92052a;
    }

    public String getName() {
        Class<?> cls = this.f92052a;
        return cls == null ? AbstractJsonLexerKt.NULL : cls.getName();
    }

    public Constructor<?> getOnlyConstructor() {
        Constructor<?>[] constructors = this.f92052a.getConstructors();
        Assert.assertEquals(1L, constructors.length);
        return constructors[0];
    }

    public int hashCode() {
        Class<?> cls = this.f92052a;
        if (cls == null) {
            return 0;
        }
        return cls.hashCode();
    }

    public boolean isANonStaticInnerClass() {
        Class<?> cls = this.f92052a;
        return cls.isMemberClass() && !Modifier.isStatic(cls.getModifiers());
    }

    public boolean isPublic() {
        return Modifier.isPublic(this.f92052a.getModifiers());
    }

    public void scanAnnotatedMembers(Map<Class<? extends Annotation>, List<FrameworkMethod>> map, Map<Class<? extends Annotation>, List<FrameworkField>> map2) {
        ArrayList<Class> arrayList = new ArrayList();
        for (Class<?> superclass = this.f92052a; superclass != null; superclass = superclass.getSuperclass()) {
            arrayList.add(superclass);
        }
        for (Class cls : arrayList) {
            for (Method method : MethodSorter.getDeclaredMethods(cls)) {
                addToAnnotationLists(new FrameworkMethod(method), map);
            }
            Field[] declaredFields = cls.getDeclaredFields();
            Arrays.sort(declaredFields, f92050d);
            for (Field field : declaredFields) {
                addToAnnotationLists(new FrameworkField(field), map2);
            }
        }
    }

    public List<FrameworkField> getAnnotatedFields(Class<? extends Annotation> cls) {
        return Collections.unmodifiableList(b(this.f92054c, cls, false));
    }

    public List<FrameworkMethod> getAnnotatedMethods(Class<? extends Annotation> cls) {
        return Collections.unmodifiableList(b(this.f92053b, cls, false));
    }
}
