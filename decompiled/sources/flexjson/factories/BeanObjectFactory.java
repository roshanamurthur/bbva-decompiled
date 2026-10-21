package flexjson.factories;

import flexjson.JSONException;
import flexjson.ObjectBinder;
import flexjson.ObjectFactory;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class BeanObjectFactory implements ObjectFactory {
    @Override // flexjson.ObjectFactory
    public Object instantiate(ObjectBinder objectBinder, Object obj, Type type, Class cls) {
        try {
            return objectBinder.bindIntoObject((Map) obj, instantiate(cls), type);
        } catch (IllegalAccessException e5) {
            throw new JSONException(objectBinder.getCurrentPath() + ":There was an exception trying to instantiate an instance of " + cls.getName(), e5);
        } catch (InstantiationException e7) {
            throw new JSONException(objectBinder.getCurrentPath() + ":There was an exception trying to instantiate an instance of " + cls.getName(), e7);
        } catch (NoSuchMethodException e10) {
            throw new JSONException(objectBinder.getCurrentPath() + ": " + cls.getName() + " lacks a no argument constructor.  Flexjson will instantiate any protected, private, or public no-arg constructor.", e10);
        } catch (InvocationTargetException e11) {
            throw new JSONException(objectBinder.getCurrentPath() + ":There was an exception trying to instantiate an instance of " + cls.getName(), e11);
        }
    }

    public Object instantiate(Class cls) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        Constructor declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
        declaredConstructor.setAccessible(true);
        return declaredConstructor.newInstance(new Object[0]);
    }
}
