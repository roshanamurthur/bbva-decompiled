package flexjson.factories;

import flexjson.ObjectBinder;
import flexjson.ObjectFactory;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes7.dex */
public class FloatObjectFactory implements ObjectFactory {
    @Override // flexjson.ObjectFactory
    public Object instantiate(ObjectBinder objectBinder, Object obj, Type type, Class cls) {
        if (obj instanceof Number) {
            return Float.valueOf(((Number) obj).floatValue());
        }
        try {
            return Float.valueOf(Float.parseFloat(obj.toString()));
        } catch (Exception unused) {
            throw objectBinder.cannotConvertValueToTargetType(obj, Float.class);
        }
    }
}
