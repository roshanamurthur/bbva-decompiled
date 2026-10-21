package org.junit.internal.runners;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.internal.MethodSorter;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class TestClass {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<?> f91894a;

    public TestClass(Class<?> cls) {
        this.f91894a = cls;
    }

    public List<Method> getAnnotatedMethods(Class<? extends Annotation> cls) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Class<?> superclass = this.f91894a; superclass != null; superclass = superclass.getSuperclass()) {
            arrayList2.add(superclass);
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            for (Method method : MethodSorter.getDeclaredMethods((Class) it.next())) {
                if (method.getAnnotation(cls) != null) {
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            arrayList.add(method);
                            break;
                        }
                        Method method2 = (Method) it2.next();
                        if (method2.getName().equals(method.getName()) && method2.getParameterTypes().length == method.getParameterTypes().length) {
                            int i10 = 0;
                            while (true) {
                                if (i10 >= method2.getParameterTypes().length) {
                                    break;
                                }
                                if (!method2.getParameterTypes()[i10].equals(method.getParameterTypes()[i10])) {
                                    break;
                                }
                                i10++;
                            }
                        }
                    }
                }
            }
        }
        if (cls.equals(Before.class) || cls.equals(BeforeClass.class)) {
            Collections.reverse(arrayList);
        }
        return arrayList;
    }

    public Constructor<?> getConstructor() throws NoSuchMethodException, SecurityException {
        return this.f91894a.getConstructor(new Class[0]);
    }

    public Class<?> getJavaClass() {
        return this.f91894a;
    }

    public String getName() {
        return this.f91894a.getName();
    }

    public List<Method> getTestMethods() {
        return getAnnotatedMethods(Test.class);
    }
}
