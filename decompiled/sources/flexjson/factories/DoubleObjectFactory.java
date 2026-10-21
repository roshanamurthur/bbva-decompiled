package flexjson.factories;

import flexjson.ObjectBinder;
import flexjson.ObjectFactory;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes7.dex */
public class DoubleObjectFactory implements ObjectFactory {
    @Override // flexjson.ObjectFactory
    public Object instantiate(ObjectBinder objectBinder, Object obj, Type type, Class cls) {
        if (obj instanceof Number) {
            return Double.valueOf(((Number) obj).doubleValue());
        }
        try {
            return Double.valueOf(Double.parseDouble(obj.toString()));
        } catch (Exception unused) {
            throw objectBinder.cannotConvertValueToTargetType(obj, Double.class);
        }
    }
}
