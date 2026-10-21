package qd;

import com.esotericsoftware.reflectasm.ConstructorAccess;
import com.esotericsoftware.reflectasm.FieldAccess;
import com.esotericsoftware.reflectasm.MethodAccess;
import com.esotericsoftware.reflectasm.PublicConstructorAccess;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.security.ProtectionDomain;
import java.util.HashSet;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: AccessClassLoader.java */
/* JADX INFO: loaded from: classes9.dex */
public final class a extends ClassLoader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final WeakHashMap<ClassLoader, WeakReference<a>> f92814b = new WeakHashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ClassLoader f92815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile a f92816d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile Method f92817e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet<String> f92818a;

    static {
        ClassLoader classLoader = a.class.getClassLoader();
        if (classLoader == null) {
            classLoader = ClassLoader.getSystemClassLoader();
        }
        f92815c = classLoader;
        f92816d = new a(classLoader);
    }

    public a(ClassLoader classLoader) {
        super(classLoader);
        this.f92818a = new HashSet<>();
    }

    public static a b(Class cls) {
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader == null) {
            classLoader = ClassLoader.getSystemClassLoader();
        }
        ClassLoader classLoader2 = f92815c;
        if (classLoader2.equals(classLoader)) {
            if (f92816d == null) {
                synchronized (f92814b) {
                    try {
                        if (f92816d == null) {
                            f92816d = new a(classLoader2);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return f92816d;
        }
        WeakHashMap<ClassLoader, WeakReference<a>> weakHashMap = f92814b;
        synchronized (weakHashMap) {
            try {
                WeakReference<a> weakReference = weakHashMap.get(classLoader);
                if (weakReference != null) {
                    a aVar = weakReference.get();
                    if (aVar != null) {
                        return aVar;
                    }
                    weakHashMap.remove(classLoader);
                }
                a aVar2 = new a(classLoader);
                weakHashMap.put(classLoader, new WeakReference<>(aVar2));
                return aVar2;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static Method c() throws Exception {
        if (f92817e == null) {
            synchronized (f92814b) {
                if (f92817e == null) {
                    Class cls = Integer.TYPE;
                    f92817e = ClassLoader.class.getDeclaredMethod("defineClass", String.class, byte[].class, cls, cls, ProtectionDomain.class);
                    try {
                        f92817e.setAccessible(true);
                    } catch (Exception unused) {
                    }
                }
            }
        }
        return f92817e;
    }

    public final Class a(String str, byte[] bArr) throws ClassFormatError {
        this.f92818a.add(str);
        try {
            return (Class) c().invoke(getParent(), str, bArr, 0, Integer.valueOf(bArr.length), a.class.getProtectionDomain());
        } catch (Exception unused) {
            return defineClass(str, bArr, 0, bArr.length, a.class.getProtectionDomain());
        }
    }

    public final Class d(String str) {
        if (!this.f92818a.contains(str)) {
            return null;
        }
        try {
            return loadClass(str, false);
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(e5);
        }
    }

    @Override // java.lang.ClassLoader
    public final Class<?> loadClass(String str, boolean z10) throws ClassNotFoundException {
        if (str.equals(FieldAccess.class.getName())) {
            return FieldAccess.class;
        }
        if (str.equals(MethodAccess.class.getName())) {
            return MethodAccess.class;
        }
        if (str.equals(ConstructorAccess.class.getName())) {
            return ConstructorAccess.class;
        }
        return str.equals(PublicConstructorAccess.class.getName()) ? PublicConstructorAccess.class : super.loadClass(str, z10);
    }
}
