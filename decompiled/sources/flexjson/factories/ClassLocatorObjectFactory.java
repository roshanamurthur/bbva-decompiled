package flexjson.factories;

import flexjson.ClassLocator;
import flexjson.JSONException;
import flexjson.ObjectBinder;
import flexjson.ObjectFactory;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class ClassLocatorObjectFactory implements ObjectFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClassLocator f68514a;

    public ClassLocatorObjectFactory(ClassLocator classLocator) {
        this.f68514a = classLocator;
    }

    public static Object a(Class cls) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        Constructor declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
        declaredConstructor.setAccessible(true);
        return declaredConstructor.newInstance(new Object[0]);
    }

    public ClassLocator getLocator() {
        return this.f68514a;
    }

    @Override // flexjson.ObjectFactory
    public Object instantiate(ObjectBinder objectBinder, Object obj, Type type, Class cls) {
        Class cls2 = null;
        try {
            try {
                Class clsLocate = this.f68514a.locate(objectBinder, objectBinder.getCurrentPath());
                if (clsLocate == null) {
                    return null;
                }
                try {
                    if (Collection.class.isAssignableFrom(clsLocate)) {
                        return objectBinder.bindIntoCollection((Collection) obj, (Collection) a(clsLocate), type);
                    }
                    if (!Map.class.isAssignableFrom(clsLocate)) {
                        return obj instanceof Map ? objectBinder.bindIntoObject((Map) obj, a(clsLocate), clsLocate) : objectBinder.bindPrimitive(obj, clsLocate);
                    }
                    if (!(type instanceof ParameterizedType)) {
                        return objectBinder.bindIntoMap((Map) obj, (Map) a(clsLocate), null, null);
                    }
                    ParameterizedType parameterizedType = (ParameterizedType) type;
                    return objectBinder.bindIntoMap((Map) obj, (Map) a(clsLocate), parameterizedType.getActualTypeArguments()[0], parameterizedType.getActualTypeArguments()[1]);
                } catch (IllegalAccessException e5) {
                    e = e5;
                    cls2 = clsLocate;
                    throw new JSONException(String.format("%s: Could not instantiate class %s", objectBinder.getCurrentPath(), cls2.getName()), e);
                } catch (InstantiationException e7) {
                    e = e7;
                    cls2 = clsLocate;
                    throw new JSONException(String.format("%s: Problem while instantiating class %s", objectBinder.getCurrentPath(), cls2.getName()), e);
                } catch (NoSuchMethodException e10) {
                    e = e10;
                    cls2 = clsLocate;
                    throw new JSONException(String.format("%s: Could not find a no-arg constructor for %s", objectBinder.getCurrentPath(), cls2.getName()), e);
                } catch (InvocationTargetException e11) {
                    e = e11;
                    cls2 = clsLocate;
                    throw new JSONException(String.format("%s: Problem while invoking the no-arg constructor for %s", objectBinder.getCurrentPath(), cls2.getName()), e);
                }
            } catch (ClassNotFoundException e12) {
                throw new JSONException(String.format("%s: Could not find class %s", objectBinder.getCurrentPath(), e12.getMessage()), e12);
            }
        } catch (IllegalAccessException e13) {
            e = e13;
        } catch (InstantiationException e14) {
            e = e14;
        } catch (NoSuchMethodException e15) {
            e = e15;
        } catch (InvocationTargetException e16) {
            e = e16;
        }
    }
}
