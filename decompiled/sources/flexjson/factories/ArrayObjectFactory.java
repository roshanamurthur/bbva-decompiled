package flexjson.factories;

import flexjson.JSONException;
import flexjson.ObjectBinder;
import flexjson.ObjectFactory;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class ArrayObjectFactory implements ObjectFactory {
    @Override // flexjson.ObjectFactory
    public Object instantiate(ObjectBinder objectBinder, Object obj, Type type, Class cls) {
        List list = (List) obj;
        objectBinder.getCurrentPath().enqueue("values");
        try {
            try {
                Class<?> componentType = cls.getComponentType() != null ? cls.getComponentType() : objectBinder.findClassAtPath(objectBinder.getCurrentPath());
                if (componentType == null) {
                    throw new JSONException("Missing concrete class for array.  You might require a use() method.");
                }
                Object objNewInstance = Array.newInstance(componentType, list.size());
                for (int i10 = 0; i10 < list.size(); i10++) {
                    Array.set(objNewInstance, i10, objectBinder.bind(list.get(i10), (Type) componentType));
                }
                objectBinder.getCurrentPath().pop();
                return objNewInstance;
            } catch (ClassNotFoundException e5) {
                throw new JSONException(String.format("%s: Could not find class %s", objectBinder.getCurrentPath(), e5.getMessage()), e5);
            }
        } catch (Throwable th2) {
            objectBinder.getCurrentPath().pop();
            throw th2;
        }
    }
}
