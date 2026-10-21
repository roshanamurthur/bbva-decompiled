package com.facetec.sdk;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* JADX INFO: loaded from: classes9.dex */
public final class ev {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fw f41473a = fw.e();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<Type, eb<?>> f41474e;

    public ev(Map<Type, eb<?>> map) {
        this.f41474e = map;
    }

    private <T> ez<T> a(Class<? super T> cls) {
        try {
            final Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.f41473a.e(declaredConstructor);
            }
            return new ez<T>() { // from class: com.facetec.sdk.ev.7
                @Override // com.facetec.sdk.ez
                public final T c() {
                    try {
                        return (T) declaredConstructor.newInstance(null);
                    } catch (IllegalAccessException e5) {
                        throw new AssertionError(e5);
                    } catch (InstantiationException e7) {
                        StringBuilder sb2 = new StringBuilder("Failed to invoke ");
                        sb2.append(declaredConstructor);
                        sb2.append(" with no args");
                        throw new RuntimeException(sb2.toString(), e7);
                    } catch (InvocationTargetException e10) {
                        StringBuilder sb3 = new StringBuilder("Failed to invoke ");
                        sb3.append(declaredConstructor);
                        sb3.append(" with no args");
                        throw new RuntimeException(sb3.toString(), e10.getTargetException());
                    }
                }
            };
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public final <T> ez<T> e(fy<T> fyVar) {
        ez<T> ezVar;
        final Type typeB = fyVar.b();
        final Class<? super T> clsD = fyVar.d();
        final eb<?> ebVar = this.f41474e.get(typeB);
        if (ebVar != null) {
            return new ez<T>() { // from class: com.facetec.sdk.ev.4
                @Override // com.facetec.sdk.ez
                public final T c() {
                    return (T) ebVar.d();
                }
            };
        }
        final eb<?> ebVar2 = this.f41474e.get(clsD);
        if (ebVar2 != null) {
            return new ez<T>() { // from class: com.facetec.sdk.ev.8
                @Override // com.facetec.sdk.ez
                public final T c() {
                    return (T) ebVar2.d();
                }
            };
        }
        ez<T> ezVarA = a(clsD);
        if (ezVarA != null) {
            return ezVarA;
        }
        if (Collection.class.isAssignableFrom(clsD)) {
            if (SortedSet.class.isAssignableFrom(clsD)) {
                ezVar = new ez() { // from class: com.facetec.sdk.ev.10
                    @Override // com.facetec.sdk.ez
                    public final Object c() {
                        return new TreeSet();
                    }
                };
            } else if (EnumSet.class.isAssignableFrom(clsD)) {
                ezVar = new ez() { // from class: com.facetec.sdk.ev.9
                    @Override // com.facetec.sdk.ez
                    public final Object c() {
                        Type type = typeB;
                        if (!(type instanceof ParameterizedType)) {
                            StringBuilder sb2 = new StringBuilder("Invalid EnumSet type: ");
                            sb2.append(typeB.toString());
                            throw new ed(sb2.toString());
                        }
                        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                        if (type2 instanceof Class) {
                            return EnumSet.noneOf((Class) type2);
                        }
                        StringBuilder sb3 = new StringBuilder("Invalid EnumSet type: ");
                        sb3.append(typeB.toString());
                        throw new ed(sb3.toString());
                    }
                };
            } else if (Set.class.isAssignableFrom(clsD)) {
                ezVar = new ez() { // from class: com.facetec.sdk.ev.13
                    @Override // com.facetec.sdk.ez
                    public final Object c() {
                        return new LinkedHashSet();
                    }
                };
            } else {
                ezVar = Queue.class.isAssignableFrom(clsD) ? new ez() { // from class: com.facetec.sdk.ev.15
                    @Override // com.facetec.sdk.ez
                    public final Object c() {
                        return new ArrayDeque();
                    }
                } : new ez() { // from class: com.facetec.sdk.ev.12
                    @Override // com.facetec.sdk.ez
                    public final Object c() {
                        return new ArrayList();
                    }
                };
            }
        } else if (!Map.class.isAssignableFrom(clsD)) {
            ezVar = null;
        } else if (ConcurrentNavigableMap.class.isAssignableFrom(clsD)) {
            ezVar = new ez() { // from class: com.facetec.sdk.ev.14
                @Override // com.facetec.sdk.ez
                public final Object c() {
                    return new ConcurrentSkipListMap();
                }
            };
        } else if (ConcurrentMap.class.isAssignableFrom(clsD)) {
            ezVar = new ez() { // from class: com.facetec.sdk.ev.1
                @Override // com.facetec.sdk.ez
                public final Object c() {
                    return new ConcurrentHashMap();
                }
            };
        } else if (SortedMap.class.isAssignableFrom(clsD)) {
            ezVar = new ez() { // from class: com.facetec.sdk.ev.5
                @Override // com.facetec.sdk.ez
                public final Object c() {
                    return new TreeMap();
                }
            };
        } else {
            ezVar = (!(typeB instanceof ParameterizedType) || String.class.isAssignableFrom(fy.e(((ParameterizedType) typeB).getActualTypeArguments()[0]).d())) ? new ez() { // from class: com.facetec.sdk.ev.3
                @Override // com.facetec.sdk.ez
                public final Object c() {
                    return new fd();
                }
            } : new ez() { // from class: com.facetec.sdk.ev.2
                @Override // com.facetec.sdk.ez
                public final Object c() {
                    return new LinkedHashMap();
                }
            };
        }
        return ezVar != null ? ezVar : new ez() { // from class: com.facetec.sdk.ev.6

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final fi f41489d = fi.a();

            @Override // com.facetec.sdk.ez
            public final Object c() {
                try {
                    return this.f41489d.a(clsD);
                } catch (Exception e5) {
                    StringBuilder sb2 = new StringBuilder("Unable to invoke no-args constructor for ");
                    sb2.append(typeB);
                    sb2.append(". Registering an InstanceCreator with Gson for this type may fix this problem.");
                    throw new RuntimeException(sb2.toString(), e5);
                }
            }
        };
    }

    public final String toString() {
        return this.f41474e.toString();
    }
}
