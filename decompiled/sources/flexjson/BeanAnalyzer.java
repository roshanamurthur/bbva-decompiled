package flexjson;

import com.bbva.plugin.localstorage.command.SetCommand;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes7.dex */
public class BeanAnalyzer {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ThreadLocal<Map<Class, BeanAnalyzer>> f68456d = new ThreadLocal<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f68457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BeanAnalyzer f68458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TreeMap f68459c = new TreeMap();

    public BeanAnalyzer(Class cls) {
        this.f68457a = cls;
        this.f68458b = analyze(cls.getSuperclass());
        for (Field field : cls.getDeclaredFields()) {
            if (!Modifier.isStatic(field.getModifiers()) && !this.f68459c.containsKey(field.getName())) {
                this.f68459c.put(field.getName(), new BeanProperty(field, this));
            }
        }
        for (Method method : cls.getDeclaredMethods()) {
            if (!Modifier.isStatic(method.getModifiers())) {
                int length = method.getParameterTypes().length;
                String name = method.getName();
                if (name.length() > 3 || name.startsWith("is")) {
                    if (length == 0) {
                        if (name.startsWith("get")) {
                            String strA = a(name.substring(3));
                            if (!this.f68459c.containsKey(strA)) {
                                this.f68459c.put(strA, new BeanProperty(strA, this));
                            }
                            ((BeanProperty) this.f68459c.get(strA)).setReadMethod(method);
                        } else if (name.startsWith("is")) {
                            String strA2 = a(name.substring(2));
                            if (!this.f68459c.containsKey(strA2)) {
                                this.f68459c.put(strA2, new BeanProperty(strA2, this));
                            }
                            ((BeanProperty) this.f68459c.get(strA2)).setReadMethod(method);
                        }
                    } else if (length == 1 && name.startsWith(SetCommand.ID)) {
                        String strA3 = a(name.substring(3));
                        if (!this.f68459c.containsKey(strA3)) {
                            this.f68459c.put(strA3, new BeanProperty(strA3, this));
                        }
                        ((BeanProperty) this.f68459c.get(strA3)).addWriteMethod(method);
                    }
                }
            }
        }
        Iterator it = this.f68459c.values().iterator();
        while (it.hasNext()) {
            if (((BeanProperty) it.next()).isNonProperty()) {
                it.remove();
            }
        }
    }

    public static String a(String str) {
        if (str.length() < 2) {
            return str.toLowerCase();
        }
        if (Character.isUpperCase(str.charAt(0)) && Character.isUpperCase(str.charAt(1))) {
            return str;
        }
        return Character.toLowerCase(str.charAt(0)) + str.substring(1);
    }

    public static BeanAnalyzer analyze(Class cls) {
        ThreadLocal<Map<Class, BeanAnalyzer>> threadLocal = f68456d;
        if (threadLocal.get() == null) {
            threadLocal.set(new HashMap());
        }
        if (cls == null) {
            return null;
        }
        if (!threadLocal.get().containsKey(cls)) {
            threadLocal.get().put(cls, new BeanAnalyzer(cls));
        }
        return threadLocal.get().get(cls);
    }

    public static void clearCache() {
        f68456d.remove();
    }

    public Field getDeclaredField(String str) {
        try {
            return this.f68457a.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    public Collection<BeanProperty> getProperties() {
        TreeMap treeMap = new TreeMap((Map) this.f68459c);
        for (BeanAnalyzer beanAnalyzer = this.f68458b; beanAnalyzer != null; beanAnalyzer = beanAnalyzer.f68458b) {
            TreeMap treeMap2 = beanAnalyzer.f68459c;
            for (String str : treeMap2.keySet()) {
                if (!treeMap.containsKey(str)) {
                    treeMap.put(str, treeMap2.get(str));
                }
            }
        }
        return treeMap.values();
    }

    public BeanProperty getProperty(String str) {
        for (BeanAnalyzer beanAnalyzer = this; beanAnalyzer != null; beanAnalyzer = beanAnalyzer.f68458b) {
            BeanProperty beanProperty = (BeanProperty) beanAnalyzer.f68459c.get(str);
            if (beanProperty != null) {
                return beanProperty;
            }
        }
        return null;
    }

    public BeanAnalyzer getSuperBean() {
        return this.f68458b;
    }

    public boolean hasProperty(String str) {
        BeanAnalyzer beanAnalyzer;
        return this.f68459c.containsKey(str) || ((beanAnalyzer = this.f68458b) != null && beanAnalyzer.hasProperty(str));
    }
}
