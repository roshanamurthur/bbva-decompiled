package flexjson.factories;

import flexjson.ObjectBinder;
import flexjson.ObjectFactory;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes7.dex */
public class IntegerObjectFactory implements ObjectFactory {
    @Override // flexjson.ObjectFactory
    public Object instantiate(ObjectBinder objectBinder, Object obj, Type type, Class cls) {
        if (obj instanceof Number) {
            return Integer.valueOf(((Number) obj).intValue());
        }
        try {
            return Integer.valueOf(Integer.parseInt(obj.toString()));
        } catch (Exception unused) {
            throw objectBinder.cannotConvertValueToTargetType(obj, Integer.class);
        }
    }
}
