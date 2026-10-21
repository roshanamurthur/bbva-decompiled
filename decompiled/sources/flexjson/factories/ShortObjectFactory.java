package flexjson.factories;

import flexjson.ObjectBinder;
import flexjson.ObjectFactory;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes7.dex */
public class ShortObjectFactory implements ObjectFactory {
    @Override // flexjson.ObjectFactory
    public Object instantiate(ObjectBinder objectBinder, Object obj, Type type, Class cls) {
        if (obj instanceof Number) {
            return Short.valueOf(((Number) obj).shortValue());
        }
        try {
            return Short.valueOf(Short.parseShort(obj.toString()));
        } catch (Exception unused) {
            throw objectBinder.cannotConvertValueToTargetType(obj, Short.class);
        }
    }
}
