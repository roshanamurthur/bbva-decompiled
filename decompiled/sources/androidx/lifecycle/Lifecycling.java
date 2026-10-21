package androidx.lifecycle;

import androidx.annotation.RestrictTo;
import com.bbva.notifications.constants.PushConstants;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Lifecycling.jvm.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0007J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¨\u0006\n"}, d2 = {"Landroidx/lifecycle/Lifecycling;", "", "object", "Landroidx/lifecycle/LifecycleEventObserver;", "lifecycleEventObserver", "", "className", "getAdapterName", "<init>", "()V", "lifecycle-common"}, k = 1, mv = {1, 8, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class Lifecycling {

    @NotNull
    public static final Lifecycling INSTANCE = new Lifecycling();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final HashMap f21916a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final HashMap f21917b = new HashMap();

    public static GeneratedAdapter a(Constructor constructor, Object obj) {
        try {
            Object objNewInstance = constructor.newInstance(obj);
            Intrinsics.checkNotNullExpressionValue(objNewInstance, "{\n            constructo…tance(`object`)\n        }");
            return (GeneratedAdapter) objNewInstance;
        } catch (IllegalAccessException e5) {
            throw new RuntimeException(e5);
        } catch (InstantiationException e7) {
            throw new RuntimeException(e7);
        } catch (InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00fe A[PHI: r1
      0x00fe: PHI (r1v6 java.util.ArrayList) = (r1v4 java.util.ArrayList), (r1v4 java.util.ArrayList), (r1v13 java.util.ArrayList) binds: [B:49:0x00dc, B:51:0x00e2, B:55:0x00f0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x010a  */
    /* JADX WARN: Code duplicated, block: B:60:0x010e  */
    /* JADX WARN: Code duplicated, block: B:70:0x0138  */
    /* JADX WARN: Code duplicated, block: B:83:0x0133 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public static int b(Class cls) {
        Constructor declaredConstructor;
        Class superclass;
        Class<?>[] interfaces;
        int length;
        Class<?> intrface;
        HashMap map = f21916a;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i10 = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r4 = cls.getPackage();
                String name = cls.getCanonicalName();
                String fullPackage = r4 != null ? r4.getName() : "";
                Intrinsics.checkNotNullExpressionValue(fullPackage, "fullPackage");
                if (fullPackage.length() != 0) {
                    Intrinsics.checkNotNullExpressionValue(name, "name");
                    name = name.substring(fullPackage.length() + 1);
                    Intrinsics.checkNotNullExpressionValue(name, "this as java.lang.String).substring(startIndex)");
                }
                Intrinsics.checkNotNullExpressionValue(name, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
                String adapterName = getAdapterName(name);
                if (fullPackage.length() != 0) {
                    adapterName = fullPackage + '.' + adapterName;
                }
                Class<?> cls2 = Class.forName(adapterName);
                Intrinsics.checkNotNull(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
                declaredConstructor = cls2.getDeclaredConstructor(cls);
                if (!declaredConstructor.isAccessible()) {
                    declaredConstructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                declaredConstructor = null;
            } catch (NoSuchMethodException e5) {
                throw new RuntimeException(e5);
            }
            HashMap map2 = f21917b;
            if (declaredConstructor != null) {
                map2.put(cls, bk.d.listOf(declaredConstructor));
            } else {
                a aVar = a.f22057c;
                HashMap map3 = aVar.f22059b;
                Boolean bool = (Boolean) map3.get(cls);
                if (bool == null) {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        for (Method method : declaredMethods) {
                            if (((OnLifecycleEvent) method.getAnnotation(OnLifecycleEvent.class)) != null) {
                                aVar.a(cls, declaredMethods);
                            }
                        }
                        map3.put(cls, Boolean.FALSE);
                        superclass = cls.getSuperclass();
                        if (superclass == null) {
                            interfaces = cls.getInterfaces();
                            Intrinsics.checkNotNullExpressionValue(interfaces, "klass.interfaces");
                            length = interfaces.length;
                            for (int i11 = 0; i11 < length; i11++) {
                                intrface = interfaces[i11];
                                if (intrface == null) {
                                }
                            }
                            if (arrayList != null) {
                                map2.put(cls, arrayList);
                            }
                        } else {
                            interfaces = cls.getInterfaces();
                            Intrinsics.checkNotNullExpressionValue(interfaces, "klass.interfaces");
                            length = interfaces.length;
                            while (i11 < length) {
                                intrface = interfaces[i11];
                                if (intrface == null) {
                                }
                            }
                            if (arrayList != null) {
                                map2.put(cls, arrayList);
                            }
                        }
                    } catch (NoClassDefFoundError e7) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e7);
                    }
                } else if (!bool.booleanValue()) {
                    superclass = cls.getSuperclass();
                    if (superclass == null && LifecycleObserver.class.isAssignableFrom(superclass)) {
                        Intrinsics.checkNotNullExpressionValue(superclass, "superclass");
                        if (b(superclass) != 1) {
                            Object obj = map2.get(superclass);
                            Intrinsics.checkNotNull(obj);
                            arrayList = new ArrayList((Collection) obj);
                            interfaces = cls.getInterfaces();
                            Intrinsics.checkNotNullExpressionValue(interfaces, "klass.interfaces");
                            length = interfaces.length;
                            while (i11 < length) {
                                intrface = interfaces[i11];
                                if (intrface == null) {
                                }
                            }
                            if (arrayList != null) {
                                map2.put(cls, arrayList);
                            }
                        }
                    } else {
                        interfaces = cls.getInterfaces();
                        Intrinsics.checkNotNullExpressionValue(interfaces, "klass.interfaces");
                        length = interfaces.length;
                        while (i11 < length) {
                            intrface = interfaces[i11];
                            if (intrface == null && LifecycleObserver.class.isAssignableFrom(intrface)) {
                                Intrinsics.checkNotNullExpressionValue(intrface, "intrface");
                                if (b(intrface) != 1) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    Object obj2 = map2.get(intrface);
                                    Intrinsics.checkNotNull(obj2);
                                    arrayList.addAll((Collection) obj2);
                                }
                            }
                        }
                        if (arrayList != null) {
                            map2.put(cls, arrayList);
                        }
                    }
                }
            }
            i10 = 2;
        }
        map.put(cls, Integer.valueOf(i10));
        return i10;
    }

    @JvmStatic
    @NotNull
    public static final String getAdapterName(@NotNull String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        return ad.d.f(new StringBuilder(), kotlin.text.l.replace$default(className, Constant.DOT_STRING, PushConstants.GE_PARAMS_SEPARATOR, false, 4, (Object) null), "_LifecycleAdapter");
    }

    @JvmStatic
    @NotNull
    public static final LifecycleEventObserver lifecycleEventObserver(@NotNull Object object) {
        Intrinsics.checkNotNullParameter(object, "object");
        boolean z10 = object instanceof LifecycleEventObserver;
        boolean z11 = object instanceof DefaultLifecycleObserver;
        if (z10 && z11) {
            return new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) object, (LifecycleEventObserver) object);
        }
        if (z11) {
            return new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) object, null);
        }
        if (z10) {
            return (LifecycleEventObserver) object;
        }
        Class<?> cls = object.getClass();
        INSTANCE.getClass();
        if (b(cls) != 2) {
            return new l(object);
        }
        Object obj = f21917b.get(cls);
        Intrinsics.checkNotNull(obj);
        List list = (List) obj;
        if (list.size() == 1) {
            return new SingleGeneratedAdapterObserver(a((Constructor) list.get(0), object));
        }
        int size = list.size();
        GeneratedAdapter[] generatedAdapterArr = new GeneratedAdapter[size];
        for (int i10 = 0; i10 < size; i10++) {
            Lifecycling lifecycling = INSTANCE;
            Constructor constructor = (Constructor) list.get(i10);
            lifecycling.getClass();
            generatedAdapterArr[i10] = a(constructor, object);
        }
        return new CompositeGeneratedAdaptersObserver(generatedAdapterArr);
    }
}
