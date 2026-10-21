package androidx.fragment.app;

import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.h0;
import androidx.collection.SimpleArrayMap;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
public class FragmentFactory {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final SimpleArrayMap<ClassLoader, SimpleArrayMap<String, Class<?>>> f21520p0 = new SimpleArrayMap<>();

    @NonNull
    public static Class<?> a(@NonNull ClassLoader classLoader, @NonNull String str) throws ClassNotFoundException {
        SimpleArrayMap<ClassLoader, SimpleArrayMap<String, Class<?>>> simpleArrayMap = f21520p0;
        SimpleArrayMap<String, Class<?>> simpleArrayMap2 = simpleArrayMap.get(classLoader);
        if (simpleArrayMap2 == null) {
            simpleArrayMap2 = new SimpleArrayMap<>();
            simpleArrayMap.put(classLoader, simpleArrayMap2);
        }
        Class<?> cls = simpleArrayMap2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        simpleArrayMap2.put(str, cls2);
        return cls2;
    }

    @NonNull
    public static Class<? extends Fragment> loadFragmentClass(@NonNull ClassLoader classLoader, @NonNull String str) {
        try {
            return a(classLoader, str);
        } catch (ClassCastException e5) {
            throw new Fragment.InstantiationException(h0.b("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e5);
        } catch (ClassNotFoundException e7) {
            throw new Fragment.InstantiationException(h0.b("Unable to instantiate fragment ", str, ": make sure class name exists"), e7);
        }
    }

    @NonNull
    public Fragment instantiate(@NonNull ClassLoader classLoader, @NonNull String str) {
        try {
            return loadFragmentClass(classLoader, str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (IllegalAccessException e5) {
            throw new Fragment.InstantiationException(h0.b("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e5);
        } catch (InstantiationException e7) {
            throw new Fragment.InstantiationException(h0.b("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e7);
        } catch (NoSuchMethodException e10) {
            throw new Fragment.InstantiationException(h0.b("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e10);
        } catch (InvocationTargetException e11) {
            throw new Fragment.InstantiationException(h0.b("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e11);
        }
    }
}
