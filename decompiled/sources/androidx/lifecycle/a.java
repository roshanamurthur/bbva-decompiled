package androidx.lifecycle;

import androidx.annotation.Nullable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: ClassesInfoCache.java */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f22057c = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f22058a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f22059b = new HashMap();

    /* JADX INFO: renamed from: androidx.lifecycle.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ClassesInfoCache.java */
    @Deprecated
    public static class C0094a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HashMap f22060a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map<b, Lifecycle.Event> f22061b;

        public C0094a(HashMap map) {
            this.f22061b = map;
            for (Map.Entry entry : map.entrySet()) {
                Lifecycle.Event event = (Lifecycle.Event) entry.getValue();
                List arrayList = (List) this.f22060a.get(event);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.f22060a.put(event, arrayList);
                }
                arrayList.add((b) entry.getKey());
            }
        }

        public static void a(List<b> list, LifecycleOwner lifecycleOwner, Lifecycle.Event event, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    b bVar = list.get(size);
                    bVar.getClass();
                    try {
                        int i10 = bVar.f22062a;
                        Method method = bVar.f22063b;
                        if (i10 == 0) {
                            method.invoke(obj, new Object[0]);
                        } else if (i10 == 1) {
                            method.invoke(obj, lifecycleOwner);
                        } else if (i10 == 2) {
                            method.invoke(obj, lifecycleOwner, event);
                        }
                    } catch (IllegalAccessException e5) {
                        throw new RuntimeException(e5);
                    } catch (InvocationTargetException e7) {
                        throw new RuntimeException("Failed to call observer method", e7.getCause());
                    }
                }
            }
        }
    }

    /* JADX INFO: compiled from: ClassesInfoCache.java */
    @Deprecated
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f22062a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Method f22063b;

        public b(Method method, int i10) {
            this.f22062a = i10;
            this.f22063b = method;
            method.setAccessible(true);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f22062a == bVar.f22062a && this.f22063b.getName().equals(bVar.f22063b.getName());
        }

        public final int hashCode() {
            return this.f22063b.getName().hashCode() + (this.f22062a * 31);
        }
    }

    public static void b(HashMap map, b bVar, Lifecycle.Event event, Class cls) {
        Lifecycle.Event event2 = (Lifecycle.Event) map.get(bVar);
        if (event2 == null || event == event2) {
            if (event2 == null) {
                map.put(bVar, event);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + bVar.f22063b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + event2 + ", new value " + event);
    }

    public final C0094a a(Class<?> cls, @Nullable Method[] methodArr) {
        int i10;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.f22058a;
        if (superclass != null) {
            C0094a c0094aA = (C0094a) map2.get(superclass);
            if (c0094aA == null) {
                c0094aA = a(superclass, null);
            }
            map.putAll(c0094aA.f22061b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0094a c0094aA2 = (C0094a) map2.get(cls2);
            if (c0094aA2 == null) {
                c0094aA2 = a(cls2, null);
            }
            for (Map.Entry<b, Lifecycle.Event> entry : c0094aA2.f22061b.entrySet()) {
                b(map, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e5) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e5);
            }
        }
        boolean z10 = false;
        for (Method method : methodArr) {
            OnLifecycleEvent onLifecycleEvent = (OnLifecycleEvent) method.getAnnotation(OnLifecycleEvent.class);
            if (onLifecycleEvent != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i10 = 0;
                } else {
                    if (!LifecycleOwner.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i10 = 1;
                }
                Lifecycle.Event eventValue = onLifecycleEvent.value();
                if (parameterTypes.length > 1) {
                    if (!Lifecycle.Event.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (eventValue != Lifecycle.Event.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i10 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(map, new b(method, i10), eventValue, cls);
                z10 = true;
            }
        }
        C0094a c0094a = new C0094a(map);
        map2.put(cls, c0094a);
        this.f22059b.put(cls, Boolean.valueOf(z10));
        return c0094a;
    }
}
