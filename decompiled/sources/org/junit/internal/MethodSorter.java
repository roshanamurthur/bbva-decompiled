package org.junit.internal;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;
import org.junit.FixMethodOrder;

/* JADX INFO: loaded from: classes13.dex */
public class MethodSorter {
    public static final Comparator<Method> DEFAULT = new a();
    public static final Comparator<Method> NAME_ASCENDING = new b();

    public static class a implements Comparator<Method> {
        @Override // java.util.Comparator
        public final int compare(Method method, Method method2) {
            Method method3 = method;
            Method method4 = method2;
            int iHashCode = method3.getName().hashCode();
            int iHashCode2 = method4.getName().hashCode();
            if (iHashCode != iHashCode2) {
                return iHashCode < iHashCode2 ? -1 : 1;
            }
            return MethodSorter.NAME_ASCENDING.compare(method3, method4);
        }
    }

    public static class b implements Comparator<Method> {
        @Override // java.util.Comparator
        public final int compare(Method method, Method method2) {
            Method method3 = method;
            Method method4 = method2;
            int iCompareTo = method3.getName().compareTo(method4.getName());
            return iCompareTo != 0 ? iCompareTo : method3.toString().compareTo(method4.toString());
        }
    }

    public static Method[] getDeclaredMethods(Class<?> cls) {
        FixMethodOrder fixMethodOrder = (FixMethodOrder) cls.getAnnotation(FixMethodOrder.class);
        Comparator<Method> comparator = fixMethodOrder == null ? DEFAULT : fixMethodOrder.value().getComparator();
        Method[] declaredMethods = cls.getDeclaredMethods();
        if (comparator != null) {
            Arrays.sort(declaredMethods, comparator);
        }
        return declaredMethods;
    }
}
