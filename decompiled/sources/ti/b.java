package ti;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectStreamException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.security.AccessController;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Locale;
import java.util.Properties;
import java.util.logging.LogManager;
import javax.mail.Transport;

/* JADX INFO: compiled from: LogManagerProperties.java */
/* JADX INFO: loaded from: classes9.dex */
public final class b extends Properties {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final Method f93612q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final Method f93613r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final Method f93614s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static volatile String[] f93615t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final Object f93616u0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final String f93617p0;

    /* JADX WARN: Code duplicated, block: B:14:0x005d  */
    /* JADX WARN: Code restructure failed: missing block: B:70:?, code lost:
    
        throw r0;
     */
    static {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ti.b.<clinit>():void");
    }

    public b(Properties properties, String str) {
        super(properties);
        if (properties == null) {
            throw null;
        }
        this.f93617p0 = str;
    }

    public static Class<?> a(String str) throws ClassNotFoundException {
        ClassLoader[] classLoaderArr = (ClassLoader[]) AccessController.doPrivileged(new a());
        ClassLoader classLoader = classLoaderArr[0];
        if (classLoader == null) {
            ClassLoader classLoader2 = classLoaderArr[1];
            return classLoader2 != null ? Class.forName(str, false, classLoader2) : Class.forName(str);
        }
        try {
            return Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException unused) {
            ClassLoader classLoader3 = classLoaderArr[1];
            return classLoader3 != null ? Class.forName(str, false, classLoader3) : Class.forName(str);
        }
    }

    public static String b(String str) {
        str.getClass();
        Object obj = f93616u0;
        try {
            if (obj instanceof Properties) {
                return ((Properties) obj).getProperty(str);
            }
        } catch (RuntimeException unused) {
        }
        if (obj == null) {
            return null;
        }
        try {
            if (obj instanceof LogManager) {
                return ((LogManager) obj).getProperty(str);
            }
            return null;
        } catch (LinkageError | RuntimeException unused2) {
            return null;
        }
    }

    public static String c(Transport transport) throws Exception {
        try {
            Method method = transport.getClass().getMethod("getLocalHost", new Class[0]);
            if (Modifier.isStatic(method.getModifiers()) || method.getReturnType() != String.class) {
                throw new NoSuchMethodException(method.toString());
            }
            return (String) method.invoke(transport, new Object[0]);
        } catch (ExceptionInInitializerError e5) {
            throw l(e5);
        } catch (InvocationTargetException e7) {
            g(e7);
            throw e7;
        }
    }

    public static boolean d(String str) throws Exception {
        String[] strArr = f93615t0;
        if (strArr == null) {
            try {
                HashSet hashSet = new HashSet();
                Throwable th2 = (Throwable) Throwable.class.getConstructor(new Class[0]).newInstance(new Object[0]);
                for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                    if (b.class.getName().equals(stackTraceElement.getClassName())) {
                        break;
                    }
                    hashSet.add(stackTraceElement.getClassName());
                }
                Throwable.class.getMethod("fillInStackTrace", new Class[0]).invoke(th2, new Object[0]);
                for (StackTraceElement stackTraceElement2 : th2.getStackTrace()) {
                    if (b.class.getName().equals(stackTraceElement2.getClassName())) {
                        break;
                    }
                    hashSet.add(stackTraceElement2.getClassName());
                }
                strArr = (String[]) hashSet.toArray(new String[hashSet.size()]);
                f93615t0 = strArr;
            } catch (InvocationTargetException e5) {
                g(e5);
                throw e5;
            }
        }
        for (String str2 : strArr) {
            if (str.equals(str2)) {
                return true;
            }
        }
        a(str);
        return false;
    }

    public static boolean e(String str) throws Exception {
        Class<?> clsA = a(str);
        if (clsA == Object.class) {
            return false;
        }
        Method[] methods = clsA.getMethods();
        if (methods.length == 0) {
            return false;
        }
        for (Method method : methods) {
            if (method.getDeclaringClass() != Object.class && !Modifier.isStatic(method.getModifiers())) {
                return false;
            }
        }
        return true;
    }

    public static Object f(Class cls, String str) throws Exception {
        try {
            Class<?> clsA = a(str);
            if (cls.isAssignableFrom(clsA)) {
                try {
                    return cls.cast(clsA.getConstructor(new Class[0]).newInstance(new Object[0]));
                } catch (InvocationTargetException e5) {
                    g(e5);
                    throw e5;
                }
            }
            throw new ClassCastException(clsA.getName() + " cannot be cast to " + cls.getName());
        } catch (ExceptionInInitializerError e7) {
            throw l(e7);
        } catch (NoClassDefFoundError e10) {
            throw new ClassNotFoundException(e10.toString(), e10);
        }
    }

    public static void g(InvocationTargetException invocationTargetException) {
        Throwable cause = invocationTargetException.getCause();
        if (cause != null && ((cause instanceof VirtualMachineError) || (cause instanceof ThreadDeath))) {
            throw ((Error) cause);
        }
    }

    public static long h(String str) throws Exception {
        try {
            Class<?> clsA = a("java.time.Duration");
            Method method = clsA.getMethod("parse", CharSequence.class);
            if (!clsA.isAssignableFrom(method.getReturnType()) || !Modifier.isStatic(method.getModifiers())) {
                throw new NoSuchMethodException(method.toString());
            }
            Method method2 = clsA.getMethod("toMillis", new Class[0]);
            if (!Long.TYPE.isAssignableFrom(method2.getReturnType()) || Modifier.isStatic(method2.getModifiers())) {
                throw new NoSuchMethodException(method2.toString());
            }
            return ((Long) method2.invoke(method.invoke(null, str), new Object[0])).longValue();
        } catch (ExceptionInInitializerError e5) {
            throw l(e5);
        } catch (InvocationTargetException e7) {
            g(e7);
            throw e7;
        }
    }

    public static Properties i() {
        Properties properties = new Properties();
        try {
            String property = System.getProperty("java.util.logging.config.file");
            if (property != null) {
                FileInputStream fileInputStream = new FileInputStream(new File(property).getCanonicalFile());
                try {
                    properties.load(fileInputStream);
                } finally {
                    fileInputStream.close();
                }
            }
        } catch (RuntimeException | Exception | LinkageError unused) {
        }
        return properties;
    }

    public static <T> Comparator<T> j(Comparator<T> comparator) {
        comparator.getClass();
        Comparator<T> comparator2 = null;
        try {
            try {
                Method method = comparator.getClass().getMethod("reversed", new Class[0]);
                if (!Modifier.isStatic(method.getModifiers()) && Comparator.class.isAssignableFrom(method.getReturnType())) {
                    try {
                        comparator2 = (Comparator) method.invoke(comparator, new Object[0]);
                    } catch (ExceptionInInitializerError e5) {
                        throw l(e5);
                    }
                }
            } catch (InvocationTargetException e7) {
                g(e7);
            }
        } catch (IllegalAccessException | NoSuchMethodException | RuntimeException unused) {
        }
        return comparator2 == null ? Collections.reverseOrder(comparator) : comparator2;
    }

    public static String k(Locale locale) {
        String language = locale.getLanguage();
        String country = locale.getCountry();
        String variant = locale.getVariant();
        char[] cArr = new char[variant.length() + country.length() + language.length() + 2];
        int length = language.length();
        language.getChars(0, length, cArr, 0);
        if (country.length() != 0 || (language.length() != 0 && variant.length() != 0)) {
            cArr[length] = '-';
            int i10 = length + 1;
            country.getChars(0, country.length(), cArr, i10);
            length = i10 + country.length();
        }
        if (variant.length() != 0 && (language.length() != 0 || country.length() != 0)) {
            cArr[length] = '-';
            int i11 = length + 1;
            variant.getChars(0, variant.length(), cArr, i11);
            length = i11 + variant.length();
        }
        return String.valueOf(cArr, 0, length);
    }

    public static InvocationTargetException l(ExceptionInInitializerError exceptionInInitializerError) {
        if (exceptionInInitializerError.getCause() instanceof Error) {
            throw exceptionInInitializerError;
        }
        return new InvocationTargetException(exceptionInInitializerError);
    }

    private synchronized Object writeReplace() throws ObjectStreamException {
        Properties properties;
        Properties properties2 = (Properties) ((Properties) this).defaults.clone();
        Thread.holdsLock(this);
        properties = new Properties(properties2);
        properties.putAll(this);
        return properties;
    }

    @Override // java.util.Hashtable
    public final synchronized Object clone() {
        Properties properties;
        Properties properties2 = ((Properties) this).defaults;
        Thread.holdsLock(this);
        properties = new Properties(properties2);
        properties.putAll(this);
        return properties;
    }

    @Override // java.util.Hashtable, java.util.Map
    public final synchronized boolean containsKey(Object obj) {
        boolean z10;
        try {
            z10 = (obj instanceof String) && getProperty((String) obj) != null;
            if (!z10) {
                z10 = ((Properties) this).defaults.containsKey(obj) || super.containsKey(obj);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return z10;
    }

    @Override // java.util.Hashtable, java.util.Map
    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Properties) {
            return super.equals(obj);
        }
        return false;
    }

    @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
    public final synchronized Object get(Object obj) {
        Object property;
        try {
            property = obj instanceof String ? getProperty((String) obj) : null;
            if (property == null && (property = ((Properties) this).defaults.get(obj)) == null && !((Properties) this).defaults.containsKey(obj)) {
                property = super.get(obj);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return property;
    }

    @Override // java.util.Properties
    public final synchronized String getProperty(String str) {
        String property;
        try {
            property = ((Properties) this).defaults.getProperty(str);
            if (property == null) {
                if (str.length() > 0) {
                    property = b(this.f93617p0 + '.' + str);
                }
                if (property == null) {
                    property = b(str);
                }
                if (property != null) {
                    super.put(str, property);
                } else {
                    Object obj = super.get(str);
                    property = obj instanceof String ? (String) obj : null;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return property;
    }

    @Override // java.util.Hashtable, java.util.Map
    public final int hashCode() {
        return super.hashCode();
    }

    @Override // java.util.Properties
    public final Enumeration<?> propertyNames() {
        return super.propertyNames();
    }

    @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
    public final synchronized Object put(Object obj, Object obj2) {
        if (!(obj instanceof String) || !(obj2 instanceof String)) {
            return super.put(obj, obj2);
        }
        Object obj3 = get(obj);
        Object objPut = super.put(obj, obj2);
        if (objPut != null) {
            obj3 = objPut;
        }
        return obj3;
    }

    @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
    public final synchronized Object remove(Object obj) {
        Object obj2;
        obj2 = get(obj);
        Object objRemove = super.remove(obj);
        if (objRemove != null) {
            obj2 = objRemove;
        }
        return obj2;
    }

    @Override // java.util.Properties
    public final Object setProperty(String str, String str2) {
        return put(str, str2);
    }

    @Override // java.util.Properties
    public final String getProperty(String str, String str2) {
        String property = getProperty(str);
        return property == null ? str2 : property;
    }
}
