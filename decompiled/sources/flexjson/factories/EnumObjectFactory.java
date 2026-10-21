package flexjson.factories;

import flexjson.JSONException;
import flexjson.ObjectBinder;
import flexjson.ObjectFactory;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes7.dex */
public class EnumObjectFactory implements ObjectFactory {
    @Override // flexjson.ObjectFactory
    public Object instantiate(ObjectBinder objectBinder, Object obj, Type type, Class cls) {
        if (obj instanceof String) {
            return Enum.valueOf((Class) type, obj.toString());
        }
        throw new JSONException(String.format("%s:  Don't know how to convert %s to enumerated constant of %s", objectBinder.getCurrentPath(), obj, type));
    }
}
